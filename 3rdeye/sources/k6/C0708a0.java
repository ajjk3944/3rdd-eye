package K6;

import N7.C1362t4;
import android.content.res.Resources;
import android.graphics.Rect;
import b9.C1992A;

/* compiled from: DivContainerBinder.kt */
/* renamed from: K6.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708a0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1362t4 f3377g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3378h;
    public final /* synthetic */ S i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O6.r f3379j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3380k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0708a0(C1362t4 c1362t4, A7.d dVar, S s10, O6.r rVar, A7.d dVar2) {
        super(1);
        this.f3377g = c1362t4;
        this.f3378h = dVar;
        this.i = s10;
        this.f3379j = rVar;
        this.f3380k = dVar2;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        O6.r rVar = this.f3379j;
        Resources resources = rVar.getResources();
        kotlin.jvm.internal.l.e(resources, "resources");
        Rect rectM = S.m(this.i, this.f3377g, resources, this.f3380k);
        int i = rectM.left;
        int i10 = rectM.top;
        int i11 = rectM.right;
        int i12 = rectM.bottom;
        rVar.f13630p = i;
        rVar.f13631q = i11;
        rVar.f13628n = i10;
        rVar.f13629o = i12;
        rVar.requestLayout();
        return C1992A.f18074a;
    }
}
