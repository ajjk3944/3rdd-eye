package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12442a;

    /* renamed from: d, reason: collision with root package name */
    public final Map f12443d;

    /* renamed from: g, reason: collision with root package name */
    public final x5 f12444g;

    public n(x5 x5Var) {
        this.f12442a = 1;
        this.f12443d = Collections.synchronizedMap(new WeakHashMap());
        this.f12444g = x5Var;
    }

    @Override // io.sentry.c0
    public final t4 f(t4 t4Var, h0 h0Var) {
        io.sentry.protocol.s sVarC;
        String str;
        Long l10;
        switch (this.f12442a) {
            case 0:
                if (u6.class.isInstance(dr.a.y(h0Var)) && (sVarC = t4Var.c()) != null && (str = sVarC.f12630a) != null && (l10 = sVarC.f12633r) != null) {
                    Map map = this.f12443d;
                    Long l11 = (Long) map.get(str);
                    if (l11 != null && !l11.equals(l10)) {
                        this.f12444g.getLogger().m(b5.INFO, "Event %s has been dropped due to multi-threaded deduplication", t4Var.f12268a);
                        h0Var.c(io.sentry.hints.e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                        break;
                    } else {
                        map.put(str, l10);
                        break;
                    }
                }
                break;
            default:
                x5 x5Var = this.f12444g;
                if (x5Var.isEnableDeduplication()) {
                    Throwable thA = t4Var.a();
                    if (thA != null) {
                        Map map2 = this.f12443d;
                        if (!map2.containsKey(thA)) {
                            ArrayList arrayList = new ArrayList();
                            for (Throwable cause = thA; cause.getCause() != null; cause = cause.getCause()) {
                                arrayList.add(cause.getCause());
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (map2.containsKey(it.next())) {
                                }
                            }
                            map2.put(thA, null);
                            break;
                        }
                        x5Var.getLogger().m(b5.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", t4Var.f12268a);
                        break;
                    }
                } else {
                    x5Var.getLogger().m(b5.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    break;
                }
                break;
        }
        return t4Var;
    }

    public n(SentryAndroidOptions sentryAndroidOptions) {
        this.f12442a = 0;
        this.f12443d = Collections.synchronizedMap(new HashMap());
        this.f12444g = sentryAndroidOptions;
    }
}
