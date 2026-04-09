package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class z extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f5989a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f5990b;

    public z(q qVar, n0 n0Var) {
        this.f5989a = qVar;
        this.f5990b = n0Var;
    }

    @Override // com.squareup.picasso.m0
    public final boolean b(k0 k0Var) {
        String scheme = k0Var.f5918b.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.m0
    public final int d() {
        return 2;
    }

    @Override // com.squareup.picasso.m0
    public final qb.p e(k0 k0Var) throws IOException {
        o oVarT = this.f5989a.t(k0Var.f5918b, k0Var.f5917a);
        long j = oVarT.f5956c;
        c0 c0Var = oVarT.f5955b ? c0.DISK : c0.NETWORK;
        InputStream inputStream = oVarT.f5954a;
        if (inputStream == null) {
            return null;
        }
        if (c0Var == c0.DISK && j == 0) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            throw new y("Received response with 0 content-length header.");
        }
        if (c0Var == c0.NETWORK && j > 0) {
            l lVar = this.f5990b.f5944b;
            lVar.sendMessage(lVar.obtainMessage(4, Long.valueOf(j)));
        }
        return new qb.p((Bitmap) null, inputStream, c0Var, 0);
    }

    @Override // com.squareup.picasso.m0
    public final boolean f(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
