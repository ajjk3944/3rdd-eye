package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.aG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0873aG {

    /* renamed from: a, reason: collision with root package name */
    public static final C1313iK f13089a = C1313iK.a(new byte[0]);

    public static final C1313iK a(int i) {
        return C1313iK.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final C1313iK b(int i) {
        return C1313iK.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
