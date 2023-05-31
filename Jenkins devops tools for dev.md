# 前置条件

- jenkins/Jenkinsfile/groovy
- linux/shell
- terraform
- linux/docker/k8s/eks/kubectl/helm
- aws/aws cli
- ansible
- prometheus  consul
- go
- Java /maven
- python



# 项目框架设计

整个devops代码采用Jenkinsfile作为入口文件通过Jenkins加载，同时代码存储在git服务器进行代码分支管理

## 工程目录设计

由于整个工程会加载很多devops 工具的代码，用户可以根据自己实际情况进行目录划分

```
jenkins

terraform

build

​	jenkinsfile
```



## 难点



在于各种工具之间调用，以及数据处理



Jenkins  pipeline 中执行shell 并且传递授权凭证



```

```









