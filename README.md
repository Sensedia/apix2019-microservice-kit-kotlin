Para subir o MySQL criando o database apix2019:

docker run --name some-mysql --rm -e MYSQL_DATABASE=apix2019 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql