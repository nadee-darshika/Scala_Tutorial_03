val coverPrice = 24.95;
val discount = 0.4;
val normalShipCost = 3;
val extraShipCost = 0.75;

def wholeSaleCost(n : Int) : Double = {
  if ( n > 50)
    return coverPrice * (1 - discount) + ((normalShipCost*50) + (extraShipCost*(n-50)));
  else
    return coverPrice * (1 - discount) + (normalShipCost*n);
}

println(wholeSaleCost(60));
