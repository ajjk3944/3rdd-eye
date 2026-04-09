package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class X4 extends AbstractC1368jN {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X4(String str, int i) {
        super(str);
        this.i = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1368jN
    public final void c(ByteBuffer byteBuffer) {
        switch (this.i) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                break;
        }
    }

    private final void e(ByteBuffer byteBuffer) {
    }
}
