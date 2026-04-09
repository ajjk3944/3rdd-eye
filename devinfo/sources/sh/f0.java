package sh;

import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements f.b, li.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f33679a;

    @Override // f.b
    public void k(Object obj) {
        Iterator it = ((Map) obj).values().iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return;
            }
        }
        k0 k0Var = this.f33679a;
        Context contextP = k0Var.p();
        new Intent();
        k0Var.l0(contextP);
    }
}
