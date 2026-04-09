package kf;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements com.google.android.gms.common.api.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f28272a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z3) {
        Random random = i.j;
        synchronized (i.class) {
            Iterator it = i.f28273k.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).b(z3);
            }
        }
    }
}
