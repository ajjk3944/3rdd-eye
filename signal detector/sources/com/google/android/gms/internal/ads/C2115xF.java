package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2115xF {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f17562a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17563b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f17564c;

    public C2115xF(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17562a = jArr;
        this.f17563b = jArr2;
        this.f17564c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(C2115xF c2115xF, int i) {
        AbstractC0582Jp.n(this.f17562a, c2115xF.f17562a, i);
        AbstractC0582Jp.n(this.f17563b, c2115xF.f17563b, i);
        AbstractC0582Jp.n(this.f17564c, c2115xF.f17564c, i);
    }

    public C2115xF() {
        C2115xF c2115xF = AbstractC0933bL.f13348A;
        this.f17562a = Arrays.copyOf(c2115xF.f17562a, 10);
        this.f17563b = Arrays.copyOf(c2115xF.f17563b, 10);
        this.f17564c = Arrays.copyOf(c2115xF.f17564c, 10);
    }
}
