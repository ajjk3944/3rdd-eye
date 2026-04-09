package u0;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r1 extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public List f34953b;

    /* renamed from: c, reason: collision with root package name */
    public List f34954c;

    /* renamed from: d, reason: collision with root package name */
    public List f34955d;

    /* renamed from: e, reason: collision with root package name */
    public x.f0 f34956e;

    /* renamed from: f, reason: collision with root package name */
    public x.f0 f34957f;
    public x.f0 g;

    /* renamed from: h, reason: collision with root package name */
    public Set f34958h;

    /* renamed from: i, reason: collision with root package name */
    public x.f0 f34959i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ j2.l0 f34960k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s1 f34961l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, ck.c cVar) {
        super(3, cVar);
        this.f34961l = s1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(u0.s1 r22, java.util.List r23, java.util.List r24, java.util.List r25, x.f0 r26, x.f0 r27, x.f0 r28, x.f0 r29) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.r1.d(u0.s1, java.util.List, java.util.List, java.util.List, x.f0, x.f0, x.f0, x.f0):void");
    }

    public static final void e(List list, s1 s1Var) {
        list.clear();
        synchronized (s1Var.f34965c) {
            try {
                ArrayList arrayList = s1Var.f34971k;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    list.add((t0) arrayList.get(i4));
                }
                s1Var.f34971k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        r1 r1Var = new r1(this.f34961l, (ck.c) obj3);
        r1Var.f34960k = (j2.l0) obj2;
        r1Var.invokeSuspend(yj.u.f37649a);
        return dk.a.f22275a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0117  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ef -> B:25:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0117 -> B:12:0x0094). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
