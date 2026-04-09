package r8;

import B4.g;
import K4.e;
import O4.F;
import O4.v;
import O4.w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.l;
import va.a;

/* compiled from: FirebaseCrashReportTree.kt */
/* loaded from: classes3.dex */
public final class b extends a.c {

    /* renamed from: b, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f45829b;

    public b(com.zipoapps.premiumhelper.d dVar) {
        this.f45829b = dVar;
    }

    @Override // va.a.c
    public final void i(String str, int i, String message, Throwable th) {
        e eVarA;
        e eVarA2;
        com.zipoapps.premiumhelper.d dVar = this.f45829b;
        l.f(message, "message");
        if (i == 2 || i == 3) {
            return;
        }
        e eVarA3 = null;
        try {
            eVarA = e.a();
        } catch (IllegalStateException unused) {
            B4.e.f(dVar);
            try {
                eVarA = e.a();
            } catch (IllegalStateException unused2) {
                eVarA = null;
            }
        }
        if (eVarA != null) {
            String strO = g.o(str, StringUtils.PROCESS_POSTFIX_DELIMITER, message);
            F f10 = eVarA.f3148a;
            long jCurrentTimeMillis = System.currentTimeMillis() - f10.f10237d;
            v vVar = f10.f10240g;
            vVar.getClass();
            vVar.f10338e.a(new w(vVar, jCurrentTimeMillis, strO));
        }
        if (th == null || i != 6) {
            return;
        }
        try {
            eVarA2 = e.a();
        } catch (IllegalStateException unused3) {
            B4.e.f(dVar);
            try {
                eVarA3 = e.a();
            } catch (IllegalStateException unused4) {
            }
            eVarA2 = eVarA3;
        }
        if (eVarA2 != null) {
            eVarA2.b(th);
        }
    }
}
