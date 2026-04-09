package K6;

import H6.C0672i;
import N7.N2;
import android.graphics.drawable.Drawable;
import android.view.View;
import b9.C1992A;
import java.util.List;

/* compiled from: DivBackgroundBinder.kt */
/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0762w f3163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f3164h;
    public final /* synthetic */ C0672i i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Drawable f3165j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<N2> f3166k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<N2> f3167l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(C0762w c0762w, View view, C0672i c0672i, Drawable drawable, List<? extends N2> list, List<? extends N2> list2) {
        super(1);
        this.f3163g = c0762w;
        this.f3164h = view;
        this.i = c0672i;
        this.f3165j = drawable;
        this.f3166k = list;
        this.f3167l = list2;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        this.f3163g.c(this.f3164h, this.i, this.f3165j, this.f3166k, this.f3167l);
        return C1992A.f18074a;
    }
}
