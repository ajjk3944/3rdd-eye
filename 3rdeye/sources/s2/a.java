package S2;

import L2.g;
import L2.h;
import R2.i;
import R2.o;
import R2.p;
import R2.q;
import R2.r;
import R2.u;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: classes.dex */
public final class a implements q<i, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final g<Integer> f11865b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final p<i, i> f11866a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: S2.a$a, reason: collision with other inner class name */
    public static class C0162a implements r<i, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final p<i, i> f11867a = new p<>();

        @Override // R2.r
        public final q<i, InputStream> c(u uVar) {
            return new a(this.f11867a);
        }
    }

    public a(p<i, i> pVar) {
        this.f11866a = pVar;
    }

    @Override // R2.q
    public final /* bridge */ /* synthetic */ boolean a(i iVar) {
        return true;
    }

    @Override // R2.q
    public final q.a<InputStream> b(i iVar, int i, int i10, h hVar) {
        i iVar2 = iVar;
        p<i, i> pVar = this.f11866a;
        if (pVar != null) {
            p.a aVarA = p.a.a(iVar2);
            o oVar = pVar.f11683a;
            Object objA = oVar.a(aVarA);
            ArrayDeque arrayDeque = p.a.f11684b;
            synchronized (arrayDeque) {
                arrayDeque.offer(aVarA);
            }
            i iVar3 = (i) objA;
            if (iVar3 == null) {
                oVar.d(p.a.a(iVar2), iVar2);
            } else {
                iVar2 = iVar3;
            }
        }
        return new q.a<>(iVar2, new j(iVar2, ((Integer) hVar.c(f11865b)).intValue()));
    }
}
