package addr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: TODO
 * @date 2020/11/28 11:23
 */
public class ShootCarService {
    public float getAvgTravel(int beginAddress, int endAddress, List<shootCar> shootCars) {
        HashSet<String> carNos = new HashSet<String>();
        HashMap<String, Long> beg = new HashMap<>();
        HashMap<String, Long> end = new HashMap<>();
        //业务代码
        for (int i = 0; i < shootCars.size(); i++) {
            carNos.add(shootCars.get(i).getCarNum());
        }
        for (String carno : carNos) {
            for (shootCar car : shootCars) {
                if (car.getCarNum().equals(carNos)) {
                    if(car.getAdrId()==beginAddress) {
                        beg.put(carno, car.getShootTime().getTime());
                    }
                    if(car.getAdrId()==endAddress){
                        end.put(carno,car.getShootTime().getTime());
                    }
                }
            }
        }
        int timesum = 0;
        for (String carno : carNos){
            timesum+=(end.get(carno)-beg.get(carno));
        }
        return timesum/carNos.size();
    }
}
