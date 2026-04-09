package d8;

import com.google.android.gms.internal.ads.r9;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends r9 {
    @Override // com.google.android.gms.internal.ads.r9
    public final void d(Object obj, Object obj2) {
        t tVar = (t) obj;
        tVar.getClass();
        ArrayDeque arrayDeque = t.f22045b;
        synchronized (arrayDeque) {
            arrayDeque.offer(tVar);
        }
    }
}
