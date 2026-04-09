package com.staircase3.opensignal.goldstar.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import br.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import qk.h;
import qk.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/staircase3/opensignal/goldstar/widget/DateTimeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateTimeView extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.e(context, "context");
        l.e(attributeSet, "attrs");
        LayoutInflater.from(context).inflate(i.layout_date_time_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(h.tv_dateTextView);
        l.d(viewFindViewById, "findViewById(...)");
        ((TextView) viewFindViewById).setText(new SimpleDateFormat("d MMMM y\nHH:mm").format(new Date()));
    }
}
