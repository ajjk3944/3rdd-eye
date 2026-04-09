package com.wifi.netdiscovery.utils;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class DeviceTypeUtil {

    /* renamed from: a, reason: collision with root package name */
    public static List f20270a = Arrays.asList("android", "samsung", "huawei", "meizu", "xiaomi", "moto", "vivo", "oppo", "smartisan");

    /* renamed from: b, reason: collision with root package name */
    public static List f20271b = Arrays.asList("iphone");

    /* renamed from: c, reason: collision with root package name */
    public static List f20272c = Arrays.asList("macbook", "mac", "mbp", "ipad");

    /* renamed from: d, reason: collision with root package name */
    public static List f20273d = Arrays.asList("windows", "-pc", "_pc", "pc-", "pc-");

    public enum DeviceType {
        Android { // from class: com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType.1
            @Override // com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType
            public boolean a(String str) {
                for (String str2 : DeviceTypeUtil.f20270a) {
                    if (str != null && str.contains(str2)) {
                        return true;
                    }
                }
                return false;
            }
        },
        Iphone { // from class: com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType.2
            @Override // com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType
            public boolean a(String str) {
                for (String str2 : DeviceTypeUtil.f20271b) {
                    if (str != null && str.contains(str2)) {
                        return true;
                    }
                }
                return false;
            }
        },
        MacBook { // from class: com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType.3
            @Override // com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType
            public boolean a(String str) {
                for (String str2 : DeviceTypeUtil.f20272c) {
                    if (str != null && str.contains(str2)) {
                        return true;
                    }
                }
                return false;
            }
        },
        Windows { // from class: com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType.4
            @Override // com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType
            public boolean a(String str) {
                for (String str2 : DeviceTypeUtil.f20273d) {
                    if (str != null && str.contains(str2)) {
                        return true;
                    }
                }
                return false;
            }
        },
        Unknown { // from class: com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType.5
            @Override // com.wifi.netdiscovery.utils.DeviceTypeUtil.DeviceType
            public boolean a(String str) {
                return true;
            }
        };

        public abstract boolean a(String str);
    }

    public static DeviceType e(String str) {
        if (TextUtils.isEmpty(str)) {
            return DeviceType.Unknown;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return DeviceType.Unknown;
        }
        DeviceType deviceType = DeviceType.Unknown;
        DeviceType deviceType2 = DeviceType.Android;
        if (deviceType2.a(lowerCase)) {
            return deviceType2;
        }
        DeviceType deviceType3 = DeviceType.Iphone;
        if (deviceType3.a(lowerCase)) {
            return deviceType3;
        }
        DeviceType deviceType4 = DeviceType.MacBook;
        if (deviceType4.a(lowerCase)) {
            return deviceType4;
        }
        DeviceType deviceType5 = DeviceType.Windows;
        return deviceType5.a(lowerCase) ? deviceType5 : deviceType;
    }
}
