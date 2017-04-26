docker stop $(docker ps -a -q)
docker rm $(docker ps --no-trunc -aq)

#echo "stopping containers"
#docker stop docker_discovery_1
#docker stop docker_zuul_1
#docker stop docker_auth_1
#docker stop docker_account_1
#docker stop docker_work_1
#docker stop docker_dictionaries_1
#docker stop docker_settings_1
#
#echo "removing containers"
#docker rm docker_discovery_1
#docker rm docker_zuul_1
#docker rm docker_auth_1
#docker rm docker_account_1
#docker rm docker_work_1
#docker rm docker_dictionaries_1
#docker rm docker_settings_1
#
#echo "removing images"
#docker rmi docker_discovery
#docker rmi docker_zuul
#docker rmi docker_auth
#docker rmi docker_account
#docker rmi docker_work
#docker rmi docker_dictionaries
#docker rmi docker_settings
