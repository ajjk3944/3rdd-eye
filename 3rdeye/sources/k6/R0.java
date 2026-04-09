package K6;

import H6.C0672i;
import N7.C1139d9;
import b9.C1992A;
import java.util.ArrayList;

/* compiled from: DivSelectBinder.kt */
/* loaded from: classes.dex */
public final class R0 extends kotlin.jvm.internal.m implements p9.l<Integer, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.w f3317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3318h;
    public final /* synthetic */ C1139d9 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0672i f3319j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(O6.w wVar, ArrayList arrayList, C1139d9 c1139d9, C0672i c0672i) {
        super(1);
        this.f3317g = wVar;
        this.f3318h = arrayList;
        this.i = c1139d9;
        this.f3319j = c0672i;
    }

    @Override // p9.l
    public final C1992A invoke(Integer num) {
        int iIntValue = num.intValue();
        CharSequence charSequence = (CharSequence) this.f3318h.get(iIntValue);
        O6.w wVar = this.f3317g;
        wVar.setText(charSequence);
        p9.l<String, C1992A> valueUpdater = wVar.getValueUpdater();
        if (valueUpdater != null) {
            valueUpdater.invoke(this.i.f8077A.get(iIntValue).f8123b.a(this.f3319j.f2147b));
        }
        return C1992A.f18074a;
    }
}
