package com.google.android.gms.internal.ads;

import j$.util.Optional;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public final dc f11824a;

    /* renamed from: b, reason: collision with root package name */
    public final mx0 f11825b = new mx0(7);

    /* renamed from: c, reason: collision with root package name */
    public final wb f11826c;

    public hc(dc dcVar, wb wbVar) {
        this.f11824a = dcVar;
        this.f11826c = wbVar;
    }

    public final Optional a() {
        gb gbVar;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f11825b.f14041b;
            if (arrayDeque.isEmpty()) {
                throw new ac();
            }
            yb ybVar = (yb) arrayDeque.pop();
            long j = ybVar.f18693a;
            long j8 = ybVar.f18694b;
            long j9 = ybVar.f18695c;
            dc dcVar = this.f11824a;
            if (dcVar.f10424a < j8) {
                return Optional.of(gb.H);
            }
            this.f11826c.b(j);
            if (j9 == 0) {
                while (dcVar.f10424a > j8) {
                    dcVar.e();
                }
            }
            return Optional.empty();
        } catch (ac unused) {
            gbVar = gb.f11471x;
            return Optional.of(gbVar);
        } catch (bc unused2) {
            gbVar = gb.H;
            return Optional.of(gbVar);
        } catch (ub e2) {
            e = e2;
            throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e);
        } catch (vb e10) {
            e = e10;
            throw new AssertionError(qb.a("CEiv6BFfPnitUE+D"), e);
        }
    }
}
