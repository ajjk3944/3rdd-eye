package wd;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements com.google.android.gms.common.api.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f36609a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z3) {
        synchronized (f.f36612k) {
            try {
                ArrayList arrayList = new ArrayList(f.f36613l.values());
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    f fVar = (f) obj;
                    if (fVar.f36618e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = fVar.f36621i.iterator();
                        while (it.hasNext()) {
                            f fVar2 = ((c) it.next()).f36608a;
                            if (!z3) {
                                ((bf.e) fVar2.f36620h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
