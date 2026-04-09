package C0;

import d5.AbstractC2282j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import q.C2785c;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f1114b;

    public /* synthetic */ u(w wVar, int i) {
        this.f1113a = i;
        this.f1114b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        Object obj;
        i iVar;
        p pVar;
        H0.c cVar;
        switch (this.f1113a) {
            case 0:
                w wVar = this.f1114b;
                AtomicBoolean atomicBoolean = wVar.f1120p;
                AtomicBoolean atomicBoolean2 = wVar.f1121q;
                if (wVar.f1122r.compareAndSet(false, true)) {
                    l lVar = wVar.f1116l.f1090d;
                    v vVar = wVar.f1119o;
                    lVar.getClass();
                    q5.i.e(vVar, "observer");
                    j jVar = new j(lVar, vVar);
                    lVar.getClass();
                    String[] strArrC = lVar.c(jVar.f1045a);
                    ArrayList arrayList = new ArrayList(strArrC.length);
                    for (String str : strArrC) {
                        LinkedHashMap linkedHashMap = lVar.f1058d;
                        Locale locale = Locale.US;
                        q5.i.d(locale, "US");
                        String lowerCase = str.toLowerCase(locale);
                        q5.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        Integer num = (Integer) linkedHashMap.get(lowerCase);
                        if (num == null) {
                            throw new IllegalArgumentException("There is no table with name ".concat(str));
                        }
                        arrayList.add(num);
                    }
                    int[] iArrI0 = AbstractC2282j.i0(arrayList);
                    i iVar2 = new i(jVar, iArrI0, strArrC);
                    synchronized (lVar.f1064k) {
                        q.f fVar = lVar.f1064k;
                        C2785c c2785cA = fVar.a(jVar);
                        if (c2785cA != null) {
                            obj = c2785cA.f22895b;
                        } else {
                            C2785c c2785c = new C2785c(jVar, iVar2);
                            fVar.f22904d++;
                            C2785c c2785c2 = fVar.f22902b;
                            if (c2785c2 == null) {
                                fVar.f22901a = c2785c;
                                fVar.f22902b = c2785c;
                            } else {
                                c2785c2.f22896c = c2785c;
                                c2785c.f22897d = c2785c2;
                                fVar.f22902b = c2785c;
                            }
                            obj = null;
                        }
                        iVar = (i) obj;
                    }
                    if (iVar == null && lVar.i.g(Arrays.copyOf(iArrI0, iArrI0.length)) && (cVar = (pVar = lVar.f1055a).f1087a) != null && cVar.isOpen()) {
                        lVar.e(pVar.g().i());
                    }
                }
                do {
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        Object objCall = null;
                        z6 = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    objCall = wVar.f1118n.call();
                                    z6 = true;
                                } catch (Exception e6) {
                                    throw new RuntimeException("Exception while computing database live data.", e6);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z6) {
                            wVar.h(objCall);
                        }
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                w wVar2 = this.f1114b;
                boolean z7 = wVar2.f5179c > 0;
                if (wVar2.f1120p.compareAndSet(false, true) && z7) {
                    Executor executor = wVar2.f1116l.f1088b;
                    if (executor != null) {
                        executor.execute(wVar2.f1123s);
                        return;
                    } else {
                        q5.i.g("internalQueryExecutor");
                        throw null;
                    }
                }
                return;
        }
    }
}
