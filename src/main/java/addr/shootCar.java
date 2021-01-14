package addr;

import java.util.Date;

/**
 * @author haipeng.wang
 * @version 1.0
 * @description: 抓拍车辆
 * @date 2020/11/28 11:21
 */

//车辆抓拍信息
public class shootCar {
    //抓拍路口编号
    private int adrId;
    //车牌号
    private String carNum;
    //抓拍时间
    private Date shootTime;

    public int getAdrId() {
        return adrId;
    }

    public void setAdrId(int adrId) {
        this.adrId = adrId;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public Date getShootTime() {
        return shootTime;
    }

    public void setShootTime(Date shootTime) {
        this.shootTime = shootTime;
    }
}
