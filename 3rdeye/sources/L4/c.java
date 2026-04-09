package L4;

import P4.k;
import P4.o;
import android.util.Log;
import c9.C2092m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.l;

/* compiled from: CrashlyticsRemoteConfigListener.kt */
/* loaded from: classes2.dex */
public final class c implements v5.f {

    /* renamed from: a, reason: collision with root package name */
    public final o f4056a;

    public c(o oVar) {
        this.f4056a = oVar;
    }

    @Override // v5.f
    public final void a(v5.c cVar) {
        final o oVar = this.f4056a;
        HashSet<v5.d> hashSet = cVar.f47057a;
        l.e(hashSet, "rolloutsState.rolloutAssignments");
        ArrayList arrayList = new ArrayList(C2092m.T(hashSet, 10));
        for (v5.d dVar : hashSet) {
            String strC = dVar.c();
            String strA = dVar.a();
            String strB = dVar.b();
            String strE = dVar.e();
            long jD = dVar.d();
            F3.f fVar = k.f10636a;
            if (strB.length() > 256) {
                strB = strB.substring(0, 256);
            }
            arrayList.add(new P4.b(strC, strA, strB, strE, jD));
        }
        synchronized (oVar.f10648f) {
            try {
                if (oVar.f10648f.b(arrayList)) {
                    final List<k> listA = oVar.f10648f.a();
                    oVar.f10644b.a(new Callable() { // from class: P4.m
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws Throwable {
                            o oVar2 = oVar;
                            oVar2.f10643a.h(oVar2.f10645c, listA);
                            return null;
                        }
                    });
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
