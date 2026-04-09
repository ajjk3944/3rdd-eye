package io.sentry.okhttp;

import ar.k;
import br.l;
import br.n;
import io.sentry.i1;
import lq.b0;

/* loaded from: classes.dex */
public final class d extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12473d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f12474g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, long j) {
        super(1);
        this.f12473d = i10;
        this.f12474g = j;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f12473d) {
            case 0:
                i1 i1Var = (i1) obj;
                l.e(i1Var, "it");
                long j = this.f12474g;
                if (j > 0) {
                    i1Var.l(Long.valueOf(j), "http.request_content_length");
                }
                break;
            default:
                i1 i1Var2 = (i1) obj;
                l.e(i1Var2, "it");
                long j7 = this.f12474g;
                if (j7 > 0) {
                    i1Var2.l(Long.valueOf(j7), "http.response_content_length");
                }
                break;
        }
        return b0.f15562a;
    }
}
