package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class nd1 {

    /* renamed from: a, reason: collision with root package name */
    public static final vl1 f14254a = vl1.a(new byte[0]);

    public static final vl1 a(int i4) {
        return vl1.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i4).array());
    }

    public static final vl1 b(int i4) {
        return vl1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i4).array());
    }
}
