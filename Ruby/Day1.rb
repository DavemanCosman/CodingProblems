#Print the string "Hello, world."
puts "Hello, world."

#For the string "Hello, Ruby," find the index of the word "Ruby."
"Hello, Ruby,".index('Ruby')

#Print your name 10 times
x = 0
while x < 10
	x = x + 1
	puts "#{x} Cozy"
end

#Print the string "This sentence is number x," where x changes from 1 to 10
x = 0
until x == 10
	x = x + 1
	puts "This sentence is number #{x}"
end

#This will be my ruby program
puts "Generating random number... Guess from 0 to 100"
x = rand(100)
input = -1

until input.to_i == x
	input = gets
	puts 'Higher' if input.to_i < x
	puts 'Lower' if input.to_i > x
end

puts "Success! The number was #{x}. Exiting program now"