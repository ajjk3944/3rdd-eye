package s1;

import com.bumptech.glide.load.data.k;
import java.util.ArrayDeque;
import l1.C2641g;
import l1.h;
import r1.o;
import r1.p;
import r1.q;
import r1.r;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2890a implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final C2641g f23427b = C2641g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final h2.d f23428a;

    public C2890a(h2.d dVar) {
        this.f23428a = dVar;
    }

    @Override // r1.r
    public final q a(Object obj, int i, int i3, h hVar) {
        r1.h hVar2 = (r1.h) obj;
        h2.d dVar = this.f23428a;
        if (dVar != null) {
            o oVar = (o) dVar.f20472a;
            p pVarA = p.a(hVar2);
            Object objA = oVar.a(pVarA);
            ArrayDeque arrayDeque = p.f23366b;
            synchronized (arrayDeque) {
                arrayDeque.offer(pVarA);
            }
            r1.h hVar3 = (r1.h) objA;
            if (hVar3 == null) {
                oVar.d(p.a(hVar2), hVar2);
            } else {
                hVar2 = hVar3;
            }
        }
        return new q(hVar2, new k(hVar2, ((Integer) hVar.c(f23427b)).intValue()));
    }

    @Override // r1.r
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
