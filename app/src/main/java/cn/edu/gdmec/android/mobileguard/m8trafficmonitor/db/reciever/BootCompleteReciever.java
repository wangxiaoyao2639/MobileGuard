package cn.edu.gdmec.android.mobileguard.m8trafficmonitor.db.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import cn.edu.gdmec.android.mobileguard.m8trafficmonitor.db.service.TrafficMonitoringService;
import cn.edu.gdmec.android.mobileguard.m8trafficmonitor.db.utils.SystemInfoUtils;

/**
 * Created by 头兄。 on 2017/12/3.
 */

public class BootCompleteReciever extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!SystemInfoUtils.isServiceRunning(context,"cn.edu.gdmec.android.m8trafficmonitor.service.TrafficMonitoringService")){
            Log.d("traffic service","turn on");
            context.startService(new Intent(context, TrafficMonitoringService.class));
        }
    }
}