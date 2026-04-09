package ge;

import android.util.Log;
import com.google.android.gms.internal.ads.dc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import le.n;
import nm.d0;
import p.r3;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r3 f24695a;

    public c(r3 r3Var) {
        this.f24695a = r3Var;
    }

    public final void a(of.d dVar) {
        r3 r3Var = this.f24695a;
        HashSet hashSet = dVar.f30544a;
        ArrayList arrayList = new ArrayList(o.T(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            of.c cVar = (of.c) ((of.e) it.next());
            String str = cVar.f30539b;
            String str2 = cVar.f30541d;
            String strSubstring = cVar.f30542e;
            String str3 = cVar.f30540c;
            long j = cVar.f30543f;
            d0 d0Var = n.f28734a;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new le.b(str, str2, strSubstring, str3, j));
        }
        synchronized (((dc) r3Var.f30849f)) {
            try {
                if (((dc) r3Var.f30849f).b(arrayList)) {
                    ((ke.c) r3Var.f30845b).f28259b.a(new k1.b(2, r3Var, ((dc) r3Var.f30849f).a()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
