package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class j42 extends ig2<TextView, String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j42(TextView view) {
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
    public final void b(View view, String str) {
        TextView view2 = (TextView) view;
        String value = str;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(value, "value");
        view2.setText(value);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, String str) {
        TextView view2 = (TextView) view;
        String value = str;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(value, "value");
        CharSequence text = view2.getText();
        if (text != null) {
            return String.valueOf(text).equalsIgnoreCase(value);
        }
        return false;
    }
}
