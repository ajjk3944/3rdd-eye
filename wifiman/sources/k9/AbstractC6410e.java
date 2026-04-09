package k9;

import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.f;
import gg.z;
import kg.InterfaceC6464a;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: k9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6410e {

    /* renamed from: k9.e$a */
    public static final class a implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: k9.e$b */
    public static final class b implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public static final AbstractC5912b e(final AbstractC5912b abstractC5912b, final InterfaceC6835l resultHandler) {
        AbstractC6492s.i(abstractC5912b, "<this>");
        AbstractC6492s.i(resultHandler, "resultHandler");
        z zVarI = z.i(new b());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new n() { // from class: k9.d
            @Override // kg.n
            public final Object apply(Object obj) {
                return AbstractC6410e.i(abstractC5912b, resultHandler, (Long) obj);
            }
        });
        AbstractC6492s.h(abstractC5912bT, "single { System.currentT…              }\n        }");
        return abstractC5912bT;
    }

    public static final z f(final z zVar, final InterfaceC6835l resultHandler) {
        AbstractC6492s.i(zVar, "<this>");
        AbstractC6492s.i(resultHandler, "resultHandler");
        z zVarI = z.i(new a());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarS = zVarI.s(new n() { // from class: k9.b
            @Override // kg.n
            public final Object apply(Object obj) {
                return AbstractC6410e.g(zVar, resultHandler, (Long) obj);
            }
        });
        AbstractC6492s.h(zVarS, "single { System.currentT…              }\n        }");
        return zVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D g(z this_measureDuration, final InterfaceC6835l resultHandler, final Long l10) {
        AbstractC6492s.i(this_measureDuration, "$this_measureDuration");
        AbstractC6492s.i(resultHandler, "$resultHandler");
        return this_measureDuration.l(new InterfaceC6464a() { // from class: k9.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                AbstractC6410e.h(resultHandler, l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC6835l resultHandler, Long startTime) {
        AbstractC6492s.i(resultHandler, "$resultHandler");
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC6492s.h(startTime, "startTime");
        resultHandler.invoke(Long.valueOf(jCurrentTimeMillis - startTime.longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f i(AbstractC5912b this_measureDuration, final InterfaceC6835l resultHandler, final Long l10) {
        AbstractC6492s.i(this_measureDuration, "$this_measureDuration");
        AbstractC6492s.i(resultHandler, "$resultHandler");
        return this_measureDuration.w(new InterfaceC6464a() { // from class: k9.a
            @Override // kg.InterfaceC6464a
            public final void run() {
                AbstractC6410e.j(resultHandler, l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC6835l resultHandler, Long startTime) {
        AbstractC6492s.i(resultHandler, "$resultHandler");
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC6492s.h(startTime, "startTime");
        resultHandler.invoke(Long.valueOf(jCurrentTimeMillis - startTime.longValue()));
    }
}
