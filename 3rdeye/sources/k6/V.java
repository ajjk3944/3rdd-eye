package K6;

import N7.C1362t4;
import android.content.res.Resources;
import android.graphics.Rect;
import b9.C1992A;

/* compiled from: DivContainerBinder.kt */
/* loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1362t4 f3347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3348h;
    public final /* synthetic */ S i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O6.E f3349j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A7.d f3350k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C1362t4 c1362t4, A7.d dVar, S s10, O6.E e4, A7.d dVar2) {
        super(1);
        this.f3347g = c1362t4;
        this.f3348h = dVar;
        this.i = s10;
        this.f3349j = e4;
        this.f3350k = dVar2;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        O6.E e4 = this.f3349j;
        Resources resources = e4.getResources();
        kotlin.jvm.internal.l.e(resources, "resources");
        Rect rectM = S.m(this.i, this.f3347g, resources, this.f3350k);
        int i = rectM.left;
        int i10 = rectM.top;
        int i11 = rectM.right;
        int i12 = rectM.bottom;
        e4.f13784r = i;
        e4.f13785s = i11;
        e4.f13782p = i10;
        e4.f13783q = i12;
        e4.requestLayout();
        return C1992A.f18074a;
    }
}
