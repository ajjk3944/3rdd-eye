package com.instagram.common.viewpoint.core;

import android.database.Cursor;

/* renamed from: com.facebook.ads.redexgen.X.o4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2237o4 implements InterfaceC0780Bo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC0779Bn.A00(this);
    }

    public C2237o4(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C0776Bk A00() {
        return C9w.A01(this.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0780Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0780Bo
    public final boolean moveToPosition(int i10) {
        return this.A00.moveToPosition(i10);
    }
}
