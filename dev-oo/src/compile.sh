# Compille all .java of the option path

# Get the path of the option
folder=$1

# compile all .java of the option path
javac -d bin $folder/*.java

# Print all files compiled
echo "Files compiled: "
ls $folder/*.java