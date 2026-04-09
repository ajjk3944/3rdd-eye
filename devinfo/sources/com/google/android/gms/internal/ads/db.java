package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class db extends wr1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10407i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db(String str, int i4) {
        super(str);
        this.f10407i = i4;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final void b(ByteBuffer byteBuffer) {
        switch (this.f10407i) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }

    private final void e(ByteBuffer byteBuffer) {
    }
}
