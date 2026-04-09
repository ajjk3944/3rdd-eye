package io.sentry.okhttp;

import com.google.android.gms.internal.measurement.e5;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.h0;
import io.sentry.k;
import io.sentry.l0;
import io.sentry.v3;
import io.sentry.x5;
import io.sentry.z4;
import java.util.List;
import java.util.Locale;
import ou.a0;
import ou.c0;
import ou.e0;
import ou.u;

/* loaded from: classes.dex */
public final class f implements u {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f12478a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12479b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12480c;

    /* renamed from: d, reason: collision with root package name */
    public final List f12481d;

    static {
        z4.d().b("maven:io.sentry:sentry-okhttp", "8.25.0");
    }

    public f() {
        List listH = e5.H(new l0(500, 599));
        List listH2 = e5.H(x5.DEFAULT_PROPAGATION_TARGETS);
        this.f12478a = v3.f12830a;
        this.f12479b = true;
        this.f12480c = listH;
        this.f12481d = listH2;
        ic.a.b("OkHttp");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ou.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ou.c0 a(tu.f r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.okhttp.f.a(tu.f):ou.c0");
    }

    public final void b(a0 a0Var, Integer num, c0 c0Var, long j) {
        b5 b5Var;
        String str = a0Var.f19860a.f19974h;
        String str2 = a0Var.f19861b;
        io.sentry.e eVar = new io.sentry.e();
        k kVarD = vc.e.D(str);
        eVar.f12204x = "http";
        eVar.B = "http";
        String str3 = (String) kVarD.f12397d;
        if (str3 != null) {
            eVar.b(str3, "url");
        }
        eVar.b(str2.toUpperCase(Locale.ROOT), "method");
        String str4 = (String) kVarD.f12398g;
        if (str4 != null) {
            eVar.b(str4, "http.query");
        }
        String str5 = (String) kVarD.f12399r;
        if (str5 != null) {
            eVar.b(str5, "http.fragment");
        }
        if (num != null) {
            eVar.b(num, "status_code");
            int iIntValue = num.intValue();
            l0 l0Var = io.sentry.util.b.f12802b;
            if (iIntValue < l0Var.f12418a || iIntValue > l0Var.f12419b) {
                int iIntValue2 = num.intValue();
                l0 l0Var2 = io.sentry.util.b.f12803c;
                b5Var = (iIntValue2 < l0Var2.f12418a || iIntValue2 > l0Var2.f12419b) ? null : b5.ERROR;
            } else {
                b5Var = b5.WARNING;
            }
            eVar.E = b5Var;
        }
        Long lValueOf = a0Var.f19863d != null ? Long.valueOf(r9.f2602d) : null;
        if (lValueOf != null && lValueOf.longValue() != -1) {
            eVar.b(Long.valueOf(lValueOf.longValue()), "http.request_content_length");
        }
        h0 h0Var = new h0();
        h0Var.c(a0Var, "okHttp:request");
        if (c0Var != null) {
            e0 e0Var = c0Var.B;
            Long lValueOf2 = e0Var != null ? Long.valueOf(e0Var.b()) : null;
            if (lValueOf2 != null && lValueOf2.longValue() != -1) {
                eVar.b(Long.valueOf(lValueOf2.longValue()), "http.response_content_length");
            }
            h0Var.c(c0Var, "okHttp:response");
        }
        eVar.b(Long.valueOf(j), "http.start_timestamp");
        eVar.b(Long.valueOf(System.currentTimeMillis()), "http.end_timestamp");
        this.f12478a.g(eVar, h0Var);
    }

    public final boolean c(a0 a0Var, c0 c0Var) {
        if (!this.f12479b) {
            return false;
        }
        int i10 = c0Var.f19887r;
        for (l0 l0Var : this.f12480c) {
            if (i10 >= l0Var.f12418a && i10 <= l0Var.f12419b) {
                return kc.f.o(a0Var.f19860a.f19974h, this.f12481d);
            }
        }
        return false;
    }
}
