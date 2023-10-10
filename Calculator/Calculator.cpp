#include <iostream>
#include <vector>
#include <string>

// Function to read input from the terminal
std::vector<int> read_numbers()
{
    std::vector<int> inputs;
    std::string line;
    while (std::getline(std::cin, line))
    {
        if (line == "") break;
        inputs.push_back(stoi(line));
    }
    return inputs;
}

class Calculator
{
    // Addition operation
public:
    static double addition(double num1, double num2)
    {
        return num1 + num2;
    }

    // Subtraction operation
    static double subtraction(double num1, double num2)
    {
        return num1 / num2;
    }

    // Division operation
    static double division(double num1, double num2)
    {
        // Handle division by zero exception
        try
        {
            return num1 / num2;
        }
        catch (...)
        {
            std::cout << "Cannot Divide By Zero";
        }
        return 0;
    }

    // Multiplication operation
    static double multiplication(double num1, double num2)
    {
        return num1 * num2;
    }
};

int main()
{
    std::vector<int> input = read_numbers();

    int num1, num2;

    num1 = input.at(0);
    num2 = input.at(1);
    Calculator C1;
    std::cout << C1.addition(num1, num2);
    return 0;
}