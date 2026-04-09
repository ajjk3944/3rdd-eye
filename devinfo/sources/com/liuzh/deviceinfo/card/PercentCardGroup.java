package com.liuzh.deviceinfo.card;

import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.o0;
import com.google.android.gms.internal.ads.kf;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.b;
import com.liuzh.deviceinfo.utilities.l;
import d.h;
import java.util.Locale;
import vg.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class PercentCardGroup extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final PercentCard f21199a;

    /* renamed from: b, reason: collision with root package name */
    public final PercentCard f21200b;

    /* renamed from: c, reason: collision with root package name */
    public int f21201c;

    /* renamed from: d, reason: collision with root package name */
    public int f21202d;

    /* renamed from: e, reason: collision with root package name */
    public final kf f21203e;

    public PercentCardGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21201c = 0;
        this.f21202d = 0;
        this.f21203e = new kf(9, this);
        View.inflate(getContext(), R.layout.card_group_percent, this);
        this.f21199a = (PercentCard) findViewById(R.id.card_internal_storage);
        this.f21200b = (PercentCard) findViewById(R.id.card_battery);
        post(new o0(29, this));
    }

    public static void a(PercentCardGroup percentCardGroup) {
        c cVar = new c(percentCardGroup.getContext());
        cVar.d();
        double d10 = cVar.f36224d;
        double d11 = cVar.f36222b;
        percentCardGroup.f21199a.setPercent((float) (d10 / d11));
        percentCardGroup.f21199a.setSummary(h.E(percentCardGroup.getResources().getString(R.string.used) + ": " + String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)) + " GB", ",  ", percentCardGroup.getResources().getString(R.string.total) + ": " + String.format(Locale.getDefault(), "%.1f", Double.valueOf(d11)) + " GB"));
    }

    public final void b() {
        int i4 = this.f21202d;
        PercentCard percentCard = this.f21200b;
        if (i4 != 2) {
            percentCard.setShortInfo("");
        } else {
            percentCard.setShortInfo(String.format(Locale.US, "%.2f W", Float.valueOf(b.a(l.j(), this.f21201c))));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getContext().registerReceiver(this.f21203e, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        post(new o0(29, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kf kfVar = this.f21203e;
        if (kfVar != null) {
            getContext().unregisterReceiver(kfVar);
        }
    }
}
