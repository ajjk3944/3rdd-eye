package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* loaded from: classes3.dex */
public abstract class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private long f19762a = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f19762a > 2000) {
            this.f19762a = timeInMillis;
            a(view);
        }
    }
}
