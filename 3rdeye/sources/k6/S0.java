package K6;

import b9.C1992A;
import java.util.ArrayList;

/* compiled from: DivSelectBinder.kt */
/* loaded from: classes.dex */
public final class S0 extends kotlin.jvm.internal.m implements p9.l<String, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3327g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3328h;
    public final /* synthetic */ O6.w i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(ArrayList arrayList, int i, O6.w wVar) {
        super(1);
        this.f3327g = arrayList;
        this.f3328h = i;
        this.i = wVar;
    }

    @Override // p9.l
    public final C1992A invoke(String str) {
        String it = str;
        kotlin.jvm.internal.l.f(it, "it");
        ArrayList arrayList = this.f3327g;
        arrayList.set(this.f3328h, it);
        this.i.setItems(arrayList);
        return C1992A.f18074a;
    }
}
