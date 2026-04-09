package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    static o f18197a;

    /* renamed from: b, reason: collision with root package name */
    static long f18198b;

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = f18197a;
                if (oVar == null) {
                    return new o();
                }
                f18197a = oVar.f18195f;
                oVar.f18195f = null;
                f18198b -= 8192;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(o oVar) {
        if (oVar.f18195f == null && oVar.f18196g == null) {
            if (oVar.f18193d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j10 = f18198b + 8192;
                    if (j10 > 65536) {
                        return;
                    }
                    f18198b = j10;
                    oVar.f18195f = f18197a;
                    oVar.f18192c = 0;
                    oVar.f18191b = 0;
                    f18197a = oVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
