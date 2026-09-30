cmake_minimum_required(VERSION 3.16)

project(RandomBinary LANGUAGES CXX)

add_executable(random_binary main.cpp)

target_compile_features(random_binary PRIVATE cxx_std_17)
set_target_properties(random_binary PROPERTIES CXX_EXTENSIONS OFF)
