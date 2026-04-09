package ef;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kf.m;
import kf.n;
import mq.p;
import p.v2;
import sg.e;
import z7.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final v2 f8186a;

    public b(v2 v2Var) {
        this.f8186a = v2Var;
    }

    public final void a(sg.d dVar) {
        v2 v2Var = this.f8186a;
        HashSet hashSet = dVar.f22045a;
        int i10 = 10;
        ArrayList arrayList = new ArrayList(p.a0(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sg.c cVar = (sg.c) ((e) it.next());
            String str = cVar.f22040b;
            String str2 = cVar.f22042d;
            String strSubstring = cVar.f22043e;
            String str3 = cVar.f22041c;
            long j = cVar.f22044f;
            j jVar = m.f14327a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new kf.b(str, str2, strSubstring, str3, j));
        }
        synchronized (((n) v2Var.B)) {
            try {
                if (((n) v2Var.B).d(arrayList)) {
                    ((jf.d) v2Var.f20202g).f13708b.a(new io.sentry.cache.e(v2Var, i10, ((n) v2Var.B).b()));
                }
            } finally {
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
    }
}
