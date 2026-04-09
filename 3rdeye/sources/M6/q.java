package M6;

import H6.C0672i;
import H6.C0683u;
import H6.H;
import K6.Q;
import android.view.View;
import h7.C4421b;
import z6.C5865d;

/* compiled from: DivPagerViewHolder.kt */
/* loaded from: classes.dex */
public final class q extends Q {

    /* renamed from: s, reason: collision with root package name */
    public final C0672i f4289s;

    /* renamed from: t, reason: collision with root package name */
    public final l f4290t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4291u;

    /* renamed from: v, reason: collision with root package name */
    public final F7.l f4292v;

    /* renamed from: w, reason: collision with root package name */
    public final C0796b f4293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C0672i parentContext, l lVar, C0683u divBinder, H viewCreator, C5865d path, boolean z10, F7.l lVar2, C0796b c0796b) {
        super(lVar, parentContext, divBinder, viewCreator, path);
        kotlin.jvm.internal.l.f(parentContext, "parentContext");
        kotlin.jvm.internal.l.f(divBinder, "divBinder");
        kotlin.jvm.internal.l.f(viewCreator, "viewCreator");
        kotlin.jvm.internal.l.f(path, "path");
        this.f4289s = parentContext;
        this.f4290t = lVar;
        this.f4291u = z10;
        this.f4292v = lVar2;
        this.f4293w = c0796b;
        View itemView = this.itemView;
        kotlin.jvm.internal.l.e(itemView, "itemView");
        itemView.addOnAttachStateChangeListener(new p(this));
    }

    @Override // K6.Q
    public final void b() {
        int i = C4421b.f38269a;
        C4421b.a(C7.a.DEBUG);
    }
}
