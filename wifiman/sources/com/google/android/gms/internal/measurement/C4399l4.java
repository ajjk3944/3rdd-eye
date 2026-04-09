package com.google.android.gms.internal.measurement;

import org.snmp4j.mp.MPv3;

/* renamed from: com.google.android.gms.internal.measurement.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4399l4 extends AbstractC4374i4 {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f35383c;

    /* renamed from: d, reason: collision with root package name */
    private int f35384d;

    /* renamed from: e, reason: collision with root package name */
    private int f35385e;

    /* renamed from: f, reason: collision with root package name */
    private int f35386f;

    /* renamed from: g, reason: collision with root package name */
    private int f35387g;

    /* renamed from: h, reason: collision with root package name */
    private int f35388h;

    private final void f() {
        int i10 = this.f35384d + this.f35385e;
        this.f35384d = i10;
        int i11 = i10 - this.f35387g;
        int i12 = this.f35388h;
        if (i11 <= i12) {
            this.f35385e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f35385e = i13;
        this.f35384d = i10 - i13;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4374i4
    public final int d(int i10) throws zzkq {
        if (i10 < 0) {
            throw zzkq.g();
        }
        int iE = i10 + e();
        if (iE < 0) {
            throw zzkq.h();
        }
        int i11 = this.f35388h;
        if (iE > i11) {
            throw zzkq.l();
        }
        this.f35388h = iE;
        f();
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4374i4
    public final int e() {
        return this.f35386f - this.f35387g;
    }

    private C4399l4(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f35388h = MPv3.MAX_MESSAGE_ID;
        this.f35383c = bArr;
        this.f35384d = i11 + i10;
        this.f35386f = i10;
        this.f35387g = i10;
    }
}
