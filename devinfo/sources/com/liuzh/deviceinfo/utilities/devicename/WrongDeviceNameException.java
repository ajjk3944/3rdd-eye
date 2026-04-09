package com.liuzh.deviceinfo.utilities.devicename;

import android.os.Build;
import androidx.annotation.Keep;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public class WrongDeviceNameException extends RuntimeException {
    public WrongDeviceNameException(String str) {
        StringBuilder sb2 = new StringBuilder("wrong device name for: mode=");
        sb2.append(Build.MODEL);
        sb2.append(", device=");
        super(c.m(sb2, Build.DEVICE, ", userInput=", str));
    }
}
