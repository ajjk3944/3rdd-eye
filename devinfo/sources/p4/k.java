package p4;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k extends ek.j implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public Object f31234b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f31235c;

    /* renamed from: d, reason: collision with root package name */
    public Object f31236d;

    /* renamed from: e, reason: collision with root package name */
    public Object f31237e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f31238f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f31239h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f31240i;
    public final /* synthetic */ a0.x0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z zVar, a0.x0 x0Var, ck.c cVar) {
        super(1, cVar);
        this.f31240i = zVar;
        this.j = x0Var;
    }

    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        return new k(this.f31240i, this.j, cVar);
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        return ((k) create((ck.c) obj)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        if (r14 != r8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
