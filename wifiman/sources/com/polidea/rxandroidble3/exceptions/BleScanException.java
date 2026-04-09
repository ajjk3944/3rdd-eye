package com.polidea.rxandroidble3.exceptions;

import java.util.Date;

/* loaded from: classes3.dex */
public class BleScanException extends BleException {

    /* renamed from: a, reason: collision with root package name */
    private final int f39277a;

    /* renamed from: b, reason: collision with root package name */
    private final Date f39278b;

    public BleScanException(int i10) {
        super(a(i10, null));
        this.f39277a = i10;
        this.f39278b = null;
    }

    private static String a(int i10, Date date) {
        return c(i10) + " (code " + i10 + ")" + d(date);
    }

    private static String c(int i10) {
        if (i10 == 2147483646) {
            return "Undocumented scan throttle";
        }
        switch (i10) {
            case 0:
                return "Bluetooth cannot start";
            case 1:
                return "Bluetooth disabled";
            case 2:
                return "Bluetooth not available";
            case 3:
                return "Location Permission missing";
            case 4:
                return "Location Services disabled";
            case 5:
                return "Scan failed because it has already started";
            case 6:
                return "Scan failed because application registration failed";
            case 7:
                return "Scan failed because of an internal error";
            case 8:
                return "Scan failed because feature unsupported";
            case 9:
                return "Scan failed because out of hardware resources";
            default:
                return "Unknown error";
        }
    }

    private static String d(Date date) {
        if (date == null) {
            return "";
        }
        return ", suggested retry date is " + date;
    }

    public BleScanException(int i10, Date date) {
        super(a(i10, date));
        this.f39277a = i10;
        this.f39278b = date;
    }

    public BleScanException(int i10, Throwable th2) {
        super(a(i10, null), th2);
        this.f39277a = i10;
        this.f39278b = null;
    }
}
