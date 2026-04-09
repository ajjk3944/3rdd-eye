package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077e2 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13845a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f13846b;

    /* renamed from: c, reason: collision with root package name */
    public long f13847c;

    /* renamed from: d, reason: collision with root package name */
    public int f13848d;

    public /* synthetic */ C1077e2() {
    }

    public String toString() {
        switch (this.f13845a) {
            case 0:
                String strX = Vt.x(this.f13846b);
                int length = strX.length();
                long j6 = this.f13847c;
                int length2 = String.valueOf(j6).length();
                int i = this.f13848d;
                StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
                sb.append("AtomSizeTooSmall{type=");
                sb.append(strX);
                sb.append(", size=");
                sb.append(j6);
                sb.append(", minHeaderSize=");
                sb.append(i);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C1077e2(int i, int i3, long j6) {
        this.f13846b = i;
        this.f13847c = j6;
        this.f13848d = i3;
    }
}
