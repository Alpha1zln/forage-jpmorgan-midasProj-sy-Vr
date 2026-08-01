## Steps to push code from pc to github

#### create a new repository on the command line

git init
git remote add origin https://github.com/userProfileName/projName.git

note - 
use below cmd, if remote is set to sth. else.
git remote remove origin


a- push code on main branch:
git add README.md
git commit -m "first commit"
git branch -M main
git push -u origin main

b- push code on a new Branch and later merge with main branch on github:
git checkout -b <branch-name>
git add .
git commit -m "your commit message"
git push -u origin <branch-name>


#### push an existing repository from the command line
git remote add origin https://github.com/userProfileName/projName.git
git branch -M main
git push -u origin main


