package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m21 {

    /* renamed from: a, reason: collision with root package name */
    public IBinder f13732a;

    /* renamed from: b, reason: collision with root package name */
    public String f13733b;

    /* renamed from: c, reason: collision with root package name */
    public int f13734c;

    /* renamed from: d, reason: collision with root package name */
    public float f13735d;

    /* renamed from: e, reason: collision with root package name */
    public int f13736e;

    /* renamed from: f, reason: collision with root package name */
    public String f13737f;
    public byte g;

    public final n21 a() {
        IBinder iBinder;
        if (this.g == 31 && (iBinder = this.f13732a) != null) {
            return new n21(iBinder, this.f13733b, this.f13734c, this.f13735d, this.f13736e, this.f13737f);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13732a == null) {
            sb2.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.g & 2) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.g & 4) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.g & 8) == 0) {
            sb2.append(" triggerMode");
        }
        if ((this.g & 16) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
