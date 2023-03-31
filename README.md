**The MovingAverage class takes three last figures by the next() and calculates the average value.**

```
MovingAverage movingAverage = 
    new MovingAverage(3);

movingAverage.next(10); // 1
movingAverage.next(10); // (1+10)/2
movingAverage.next(3);  // (1+10+3)/3
movingAverage.next(5);  // (10+3+5)/3
```