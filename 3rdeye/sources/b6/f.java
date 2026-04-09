package B6;

import android.view.View;

/* compiled from: DivTooltipController.kt */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements p9.q<View, Integer, Integer, C6.k> {

    /* renamed from: g, reason: collision with root package name */
    public static final f f529g = new f(3);

    @Override // p9.q
    public final C6.k invoke(View view, Integer num, Integer num2) {
        View c10 = view;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        kotlin.jvm.internal.l.f(c10, "c");
        return new n(c10, iIntValue, iIntValue2, false);
    }
}
