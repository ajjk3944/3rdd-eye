package N6;

import K6.C0713c;
import L0.I;
import L0.S;
import N7.C1362t4;
import android.util.DisplayMetrics;
import android.view.View;
import b9.C1992A;
import java.util.WeakHashMap;
import y7.v;

/* compiled from: DivTabsBinder.kt */
/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1362t4 f4739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f4740h;
    public final /* synthetic */ A7.d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f4741j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C1362t4 c1362t4, v vVar, A7.d dVar, DisplayMetrics displayMetrics) {
        super(1);
        this.f4739g = c1362t4;
        this.f4740h = vVar;
        this.i = dVar;
        this.f4741j = displayMetrics;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        C1362t4 c1362t4 = this.f4739g;
        A7.b<Long> bVar = c1362t4.f9220e;
        v vVar = this.f4740h;
        A7.b<Long> bVar2 = c1362t4.f9216a;
        A7.b<Long> bVar3 = c1362t4.f9221f;
        A7.b<Long> bVar4 = c1362t4.f9217b;
        DisplayMetrics metrics = this.f4741j;
        A7.d dVar = this.i;
        if (bVar == null && bVar4 == null) {
            Long lA = c1362t4.f9218c.a(dVar);
            kotlin.jvm.internal.l.e(metrics, "metrics");
            int iB = C0713c.B(lA, metrics);
            int iB2 = C0713c.B(bVar3.a(dVar), metrics);
            int iB3 = C0713c.B(c1362t4.f9219d.a(dVar), metrics);
            int iB4 = C0713c.B(bVar2.a(dVar), metrics);
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            vVar.setPaddingRelative(iB, iB2, iB3, iB4);
        } else {
            Long lA2 = bVar != null ? bVar.a(dVar) : null;
            kotlin.jvm.internal.l.e(metrics, "metrics");
            int iB5 = C0713c.B(lA2, metrics);
            int iB6 = C0713c.B(bVar3.a(dVar), metrics);
            int iB7 = C0713c.B(bVar4 != null ? bVar4.a(dVar) : null, metrics);
            int iB8 = C0713c.B(bVar2.a(dVar), metrics);
            WeakHashMap<View, S> weakHashMap2 = I.f3792a;
            vVar.setPaddingRelative(iB5, iB6, iB7, iB8);
        }
        return C1992A.f18074a;
    }
}
