package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.np;

/* loaded from: classes3.dex */
public final class pp extends ig2<TextView, np> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(TextView view) {
        super(view);
        kotlin.jvm.internal.l.f(view, "view");
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(View view) {
        TextView view2 = (TextView) view;
        kotlin.jvm.internal.l.f(view2, "view");
        view2.setText("");
        super.a(view2);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void b(View view, np npVar) {
        TextView view2 = (TextView) view;
        np value = npVar;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(value, "value");
        if (np.a.f30964b == value.b()) {
            view2.setText(value.a());
        }
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, np npVar) {
        TextView view2 = (TextView) view;
        np value = npVar;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(value, "value");
        if (np.a.f30964b == value.b()) {
            return kotlin.jvm.internal.l.b(view2.getText().toString(), value.a());
        }
        return true;
    }
}
