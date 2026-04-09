package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class AA {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f6939a;

    /* renamed from: b, reason: collision with root package name */
    public String f6940b;

    /* renamed from: c, reason: collision with root package name */
    public int f6941c;

    /* renamed from: d, reason: collision with root package name */
    public float f6942d;

    /* renamed from: e, reason: collision with root package name */
    public int f6943e;

    /* renamed from: f, reason: collision with root package name */
    public String f6944f;

    /* renamed from: g, reason: collision with root package name */
    public byte f6945g;

    public final BA a() {
        IBinder iBinder;
        if (this.f6945g == 31 && (iBinder = this.f6939a) != null) {
            return new BA(iBinder, this.f6940b, this.f6941c, this.f6942d, this.f6943e, this.f6944f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6939a == null) {
            sb.append(" windowToken");
        }
        if ((this.f6945g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f6945g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f6945g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f6945g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f6945g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
