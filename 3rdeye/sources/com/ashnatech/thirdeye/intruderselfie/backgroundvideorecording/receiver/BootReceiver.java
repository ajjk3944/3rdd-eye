package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.CameraService;
import java.util.Objects;

/* loaded from: classes.dex */
public class BootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            context.startService(new Intent(context, (Class<?>) CameraService.class));
        }
    }
}
