如果应用将被打包成jar，那就不要使用 src/main/webapp文件夹。
尽管该文件夹是通常的标准格式，但它仅在打包成war的情况下起作用，在打包成jar时，多数构建工具都会默认忽略它。