package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

@MetaExoPlayerCustomization("Exo does not declare this as public but we need to as Hero's CacheDataSink refers to this")
/* renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0683Mo extends BufferedOutputStream {
    public boolean A00;

    public C0683Mo(OutputStream outputStream) {
        super(outputStream);
    }

    public C0683Mo(OutputStream outputStream, int i4) {
        super(outputStream, i4);
    }

    public final void A00(OutputStream outputStream) {
        AbstractC02203y.A08(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.A00 = true;
        Throwable e2 = null;
        try {
            flush();
        } catch (Throwable th2) {
            e2 = th2;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e2 == null) {
                e2 = thrown;
            }
        }
        if (e2 != null) {
            C5C.A11(e2);
            throw null;
        }
    }
}
