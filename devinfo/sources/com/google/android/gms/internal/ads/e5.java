package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e5 implements r2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10701a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f10702b;

    /* renamed from: c, reason: collision with root package name */
    public long f10703c;

    /* renamed from: d, reason: collision with root package name */
    public int f10704d;

    public /* synthetic */ e5() {
    }

    public String toString() {
        switch (this.f10701a) {
            case 0:
                String strX = bq0.x(this.f10702b);
                int length = strX.length();
                long j = this.f10703c;
                int length2 = String.valueOf(j).length();
                int i4 = this.f10704d;
                StringBuilder sb2 = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i4).length() + 1);
                sb2.append("AtomSizeTooSmall{type=");
                sb2.append(strX);
                sb2.append(", size=");
                sb2.append(j);
                sb2.append(", minHeaderSize=");
                sb2.append(i4);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public e5(int i4, int i10, long j) {
        this.f10702b = i4;
        this.f10703c = j;
        this.f10704d = i10;
    }
}
