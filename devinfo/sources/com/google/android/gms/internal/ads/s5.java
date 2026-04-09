package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s5 implements r2, c80 {

    /* renamed from: c, reason: collision with root package name */
    public static final s5 f15868c;

    /* renamed from: d, reason: collision with root package name */
    public static final s5 f15869d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15870a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15871b;

    static {
        int i4 = 0;
        f15868c = new s5(i4, true);
        f15869d = new s5(i4, false);
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public /* synthetic */ void mo162c(Object obj) {
        y70 y70Var = (y70) obj;
        switch (this.f15870a) {
            case 2:
                y70Var.k(this.f15871b);
                break;
            default:
                y70Var.p(this.f15871b);
                break;
        }
    }

    public String toString() {
        switch (this.f15870a) {
            case 0:
                boolean z3 = !this.f15871b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(z3).length() + 33);
                sb2.append("IncorrectFragmentation{expected=");
                sb2.append(z3);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s5(int i4, boolean z3) {
        this.f15870a = i4;
        this.f15871b = z3;
    }
}
