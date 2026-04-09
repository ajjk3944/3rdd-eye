package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10821a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f10822b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final W1 f10823c = new W1(0);

    /* renamed from: d, reason: collision with root package name */
    public C1283hr f10824d;

    /* renamed from: e, reason: collision with root package name */
    public int f10825e;

    /* renamed from: f, reason: collision with root package name */
    public int f10826f;

    /* renamed from: g, reason: collision with root package name */
    public long f10827g;

    public final long a(InterfaceC2046w0 interfaceC2046w0, int i) {
        interfaceC2046w0.s(0, i, this.f10821a);
        long j6 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j6 = (j6 << 8) | (r1[i3] & 255);
        }
        return j6;
    }
}
