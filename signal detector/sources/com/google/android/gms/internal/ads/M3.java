package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class M3 {

    /* renamed from: a, reason: collision with root package name */
    public final T0 f9801a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9802b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9803c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9804d;

    /* renamed from: e, reason: collision with root package name */
    public int f9805e;

    /* renamed from: f, reason: collision with root package name */
    public int f9806f;

    /* renamed from: g, reason: collision with root package name */
    public long f9807g;

    /* renamed from: h, reason: collision with root package name */
    public long f9808h;

    public M3(T0 t02) {
        this.f9801a = t02;
    }

    public final void a(int i, int i3, byte[] bArr) {
        if (this.f9803c) {
            int i6 = this.f9806f;
            int i7 = (i + 1) - i6;
            if (i7 >= i3) {
                this.f9806f = (i3 - i) + i6;
            } else {
                this.f9804d = ((bArr[i7] & 192) >> 6) == 0;
                this.f9803c = false;
            }
        }
    }

    public final void b(long j6, int i, boolean z6) {
        AbstractC0582Jp.h0(this.f9808h != -9223372036854775807L);
        if (this.f9805e == 182 && z6 && this.f9802b) {
            long j7 = j6 - this.f9807g;
            this.f9801a.c(this.f9808h, this.f9804d ? 1 : 0, (int) j7, i, null);
        }
        if (this.f9805e != 179) {
            this.f9807g = j6;
        }
    }
}
