package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class WD {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f12187b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f12188a;

    public WD(ByteArrayInputStream byteArrayInputStream) {
        this.f12188a = byteArrayInputStream;
    }

    public static int b(AbstractC1527mK abstractC1527mK) throws NumberFormatException, IOException {
        if (!(abstractC1527mK instanceof C1743qK)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!(abstractC1527mK.c().f16339a instanceof Number)) {
            throw new IOException("invalid key id: not a JSON number");
        }
        Number numberD = abstractC1527mK.c().d();
        try {
            if (!(numberD instanceof EF)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long j6 = Long.parseLong(((EF) numberD).f7933a);
            if (j6 > 4294967295L || j6 < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) j6;
        } catch (NumberFormatException e6) {
            throw new IOException(e6);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1257hI a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WD.a():com.google.android.gms.internal.ads.hI");
    }
}
