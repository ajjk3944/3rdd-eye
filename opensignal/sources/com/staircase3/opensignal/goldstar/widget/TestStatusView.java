package com.staircase3.opensignal.goldstar.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import br.l;
import kotlin.Metadata;
import qk.h;
import qk.i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/staircase3/opensignal/goldstar/widget/TestStatusView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTestStatusTextView", "()Landroid/widget/TextView;", "setTestStatusTextView", "(Landroid/widget/TextView;)V", "testStatusTextView", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TestStatusView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public TextView testStatusTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.e(context, "context");
        l.e(attributeSet, "attrs");
        LayoutInflater.from(context).inflate(i.widget_test_status, (ViewGroup) this, true);
        View viewFindViewById = findViewById(h.testStatusTextView);
        l.d(viewFindViewById, "findViewById(...)");
        this.testStatusTextView = (TextView) viewFindViewById;
    }

    public final TextView getTestStatusTextView() {
        return this.testStatusTextView;
    }

    public final void setTestStatusTextView(TextView textView) {
        l.e(textView, "<set-?>");
        this.testStatusTextView = textView;
    }
}
