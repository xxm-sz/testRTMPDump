cmake_minimum_required(VERSION 3.22.1)

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -DNO_CRYPTO")

add_library(
             rtmp

             STATIC
             # rtmp 库的源文件
             amf.c
             hashswf.c
             log.c
             parseurl.c
             rtmp.c )