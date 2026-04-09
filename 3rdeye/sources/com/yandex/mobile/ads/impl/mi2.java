package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb2;
import com.yandex.mobile.ads.impl.kk;
import g0.C4356c;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class mi2<T> implements kk.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final xp1<T> f30398a;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static fb2 b(fi2 fi2Var) {
            if (fi2Var instanceof b50) {
                return fb2.a.a((b50) fi2Var);
            }
            if (fi2Var instanceof wf1) {
                return fb2.a.a();
            }
            nc1 nc1Var = fi2Var.f27346b;
            if (nc1Var == null) {
                return fb2.a.a(fi2Var.getMessage());
            }
            int i = nc1Var.f30835a;
            if (i >= 500) {
                return fb2.a.b();
            }
            String strI = C4356c.i(i, "Network Error.  Code: ", ".");
            byte[] data = nc1Var.f30836b;
            kotlin.jvm.internal.l.e(data, "data");
            String strO = B4.g.o(strI, " Data: \n", new String(data, C5819a.f48359b));
            fp0.c(new Object[0]);
            return fb2.a.b(strO);
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public mi2(xp1<T> xp1Var) {
        this.f30398a = xp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.rq1.a
    public final void a(fi2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        if (this.f30398a != null) {
            this.f30398a.a(a.b(error));
        }
    }

    @Override // com.yandex.mobile.ads.impl.rq1.b
    public final void a(T response) {
        kotlin.jvm.internal.l.f(response, "response");
        xp1<T> xp1Var = this.f30398a;
        if (xp1Var != null) {
            xp1Var.a((xp1<T>) response);
        }
    }
}
