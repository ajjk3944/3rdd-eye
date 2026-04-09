package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Q3 {

    /* renamed from: a, reason: collision with root package name */
    public final T0 f10557a;

    /* renamed from: b, reason: collision with root package name */
    public long f10558b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10559c;

    /* renamed from: d, reason: collision with root package name */
    public int f10560d;

    /* renamed from: e, reason: collision with root package name */
    public long f10561e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10562f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10563g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10564h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10565j;

    /* renamed from: k, reason: collision with root package name */
    public long f10566k;

    /* renamed from: l, reason: collision with root package name */
    public long f10567l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10568m;

    public Q3(T0 t02) {
        this.f10557a = t02;
    }

    public final void a(int i) {
        long j6 = this.f10567l;
        if (j6 != -9223372036854775807L) {
            long j7 = this.f10558b;
            long j8 = this.f10566k;
            if (j7 == j8) {
                return;
            }
            int i3 = (int) (j7 - j8);
            this.f10557a.c(j6, this.f10568m ? 1 : 0, i3, i, null);
        }
    }
}
