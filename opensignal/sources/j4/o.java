package j4;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p.v2;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13227a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13228d;

    public /* synthetic */ o(int i10, Object obj) {
        this.f13227a = i10;
        this.f13228d = obj;
    }

    private final void a() {
        d8.a aVar = (d8.a) this.f13228d;
        Map mapUnmodifiableMap = null;
        ((AtomicReference) aVar.f7147a).set(null);
        synchronized (aVar) {
            if (((AtomicMarkableReference) aVar.f7149c).isMarked()) {
                kf.d dVar = (kf.d) ((AtomicMarkableReference) aVar.f7149c).getReference();
                synchronized (dVar) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar.f14304a));
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) aVar.f7149c;
                atomicMarkableReference.set((kf.d) atomicMarkableReference.getReference(), false);
            }
        }
        if (mapUnmodifiableMap != null) {
            v2 v2Var = (v2) aVar.f7150d;
            ((kf.g) v2Var.f20201d).g((String) v2Var.f20203r, mapUnmodifiableMap, aVar.f7148b);
        }
    }

    private final void b() {
        cj.a aVar = (cj.a) this.f13228d;
        synchronized (((ArrayDeque) aVar.f3977x)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) aVar.f3974d).edit();
            String str = (String) aVar.f3975g;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) aVar.f3977x).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) aVar.f3976r);
            }
            editorEdit.putString(str, sb2.toString()).commit();
        }
    }

    private final void c() {
        l5.f fVar = (l5.f) this.f13228d;
        synchronized (fVar.f14703a) {
            try {
                if (fVar.f14712l) {
                    return;
                }
                long j = fVar.k - 1;
                fVar.k = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    fVar.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (fVar.f14703a) {
                    fVar.f14713m = illegalStateException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0237 A[Catch: IOException -> 0x01cf, XmlPullParserException -> 0x01d2, TryCatch #14 {IOException -> 0x01cf, XmlPullParserException -> 0x01d2, blocks: (B:84:0x01c2, B:86:0x01c8, B:91:0x01d5, B:94:0x01e4, B:120:0x023c, B:97:0x01ec, B:101:0x01fc, B:102:0x0200, B:108:0x020e, B:119:0x0237, B:113:0x021d, B:115:0x0225, B:116:0x022a, B:118:0x0232), top: B:262:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, lq.h] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws org.xmlpull.v1.XmlPullParserException, java.lang.InterruptedException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.o.run():void");
    }
}
