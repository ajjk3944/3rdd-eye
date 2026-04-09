package K6;

import H6.C0672i;
import H6.C0675l;
import N7.C1447z5;
import N7.R6;
import android.net.Uri;
import android.view.View;
import b9.C1992A;
import k7.C5248a;

/* compiled from: DivImageBinder.kt */
/* renamed from: K6.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755s0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H6.B f3628h;
    public final /* synthetic */ View i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3629j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3630k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3631l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0755s0(H6.B b10, View view, Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f3627g = i;
        this.f3628h = b10;
        this.i = view;
        this.f3629j = obj;
        this.f3630k = obj2;
        this.f3631l = obj3;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3627g) {
            case 0:
                Uri it = (Uri) obj;
                kotlin.jvm.internal.l.f(it, "it");
                ((C0752q0) this.f3628h).o((O6.n) this.i, (C0672i) this.f3629j, (C1447z5) this.f3630k, (Q6.c) this.f3631l);
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                R6 r62 = (R6) this.f3629j;
                A7.b<Long> bVar = r62.f6151a;
                A7.d dVar = (A7.d) this.f3630k;
                long jLongValue = bVar.a(dVar).longValue();
                C5248a c5248aT = C6.b.t(r62, dVar);
                A9.I.k(c5248aT, (C0675l) this.f3631l);
                ((y1) this.f3628h).q((O6.q) this.i, jLongValue, c5248aT);
                break;
        }
        return C1992A.f18074a;
    }
}
