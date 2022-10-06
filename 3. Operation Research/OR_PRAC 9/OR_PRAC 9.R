library(lpSolve)

costs <- matrix(c(8,9,12,8,
                  3,4,3,2,
                  5,3,7,4), nrow = 3, byrow = TRUE)

colnames(costs) <- c("A","B","C","D")
rownames(costs) <- c("X","Y","Z")

row.signs <- rep("<=",3)
row.rhs <- c(3000, 6000, 9000)

col.signs <- rep(">=",4)
col.rhs <- c(5000, 7000, 4000, 2000)

TotalCost <- lp.transport(costs,"min",row.signs,row.rhs,col.signs,col.rhs)

lp.transport(costs,"min",row.signs,row.rhs,col.signs,col.rhs)$solution
print(TotalCost)
