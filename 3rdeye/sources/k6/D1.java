package K6;

import N7.C1394v8;
import N7.I8;
import android.util.DisplayMetrics;
import b9.C1992A;
import java.util.List;

/* compiled from: DivTextBinder.kt */
/* loaded from: classes.dex */
public final class D1 extends kotlin.jvm.internal.m implements p9.l<List<? extends Integer>, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y1 f3203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O6.q f3204h;
    public final /* synthetic */ C1394v8 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ DisplayMetrics f3205j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3206k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(y1 y1Var, O6.q qVar, C1394v8 c1394v8, DisplayMetrics displayMetrics, A7.d dVar) {
        super(1);
        this.f3203g = y1Var;
        this.f3204h = qVar;
        this.i = c1394v8;
        this.f3205j = displayMetrics;
        this.f3206k = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p9.l
    public final C1992A invoke(List<? extends Integer> list) {
        List<? extends Integer> colors = list;
        kotlin.jvm.internal.l.f(colors, "colors");
        C1394v8 c1394v8 = this.i;
        I8 i82 = c1394v8.f9633e;
        DisplayMetrics displayMetrics = this.f3205j;
        y1 y1Var = this.f3203g;
        y1Var.getClass();
        A7.d dVar = this.f3206k;
        y1Var.t(this.f3204h, y1.D(i82, displayMetrics, dVar), y1.C(c1394v8.f9629a, displayMetrics, dVar), y1.C(c1394v8.f9630b, displayMetrics, dVar), colors);
        return C1992A.f18074a;
    }
}
