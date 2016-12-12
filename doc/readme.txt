
solr 启一个点
solr start
http://127.0.0.1:8983/
停止
solr stop -all

注意：
没有显示的字段，手动加到schema里，或者直接修改配置文件 solr-6.3.0\server\solr\test\conf\managed-schema
其中test为自己建的索引包（来源：将 solr-6.3.0\example\example-DIH\solr 下的 db 文件夹，复制到 solr-6.3.0\server\solr 下，重命名，如 test）
