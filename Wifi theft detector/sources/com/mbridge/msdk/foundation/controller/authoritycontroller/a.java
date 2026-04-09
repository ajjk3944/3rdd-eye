package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected int f14716a;

    /* renamed from: b, reason: collision with root package name */
    protected int f14717b;

    /* renamed from: c, reason: collision with root package name */
    protected int f14718c;

    /* renamed from: d, reason: collision with root package name */
    protected int f14719d;

    public void a(int i10) {
        this.f14716a = i10;
        this.f14717b = i10;
        this.f14718c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f14717b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f14716a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f14719d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f14718c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f14717b;
    }

    public int getAuthGenDataStatus() {
        return this.f14716a;
    }

    public int getAuthSerialIdStatus() {
        return this.f14718c;
    }

    public int getOtherDataStatus() {
        return this.f14719d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "authority_serial_id":
                    return this.f14718c;
                case "authority_device_id":
                    return this.f14717b;
                case "authority_general_data":
                    return this.f14716a;
                case "authority_other":
                    return this.f14719d;
            }
        }
        return 1;
    }
}
