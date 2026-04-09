package e8;

import com.bumptech.glide.load.data.k;
import d8.l;
import d8.s;
import d8.t;
import d8.u;
import d8.v;
import java.util.ArrayDeque;
import x7.g;
import x7.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final g f22446b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final o7.d f22447a;

    public a(o7.d dVar) {
        this.f22447a = dVar;
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, h hVar) {
        l lVar = (l) obj;
        o7.d dVar = this.f22447a;
        if (dVar != null) {
            s sVar = (s) dVar.f30421b;
            t tVarA = t.a(lVar);
            Object objA = sVar.a(tVarA);
            ArrayDeque arrayDeque = t.f22045b;
            synchronized (arrayDeque) {
                arrayDeque.offer(tVarA);
            }
            l lVar2 = (l) objA;
            if (lVar2 == null) {
                sVar.f(t.a(lVar), lVar);
            } else {
                lVar = lVar2;
            }
        }
        return new u(lVar, new k(lVar, ((Integer) hVar.c(f22446b)).intValue()));
    }

    @Override // d8.v
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
