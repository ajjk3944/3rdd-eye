package com.liuzh.deviceinfo.card;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import va.o;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class BatteryCard extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21167b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final o f21168a;

    public BatteryCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iE;
        super(context, attributeSet);
        setOrientation(1);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.content_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        LayoutInflater.from(getContext()).inflate(R.layout.card_battery, this);
        int i4 = R.id.capacity;
        TextView textView = (TextView) e.s(R.id.capacity, this);
        if (textView != null) {
            i4 = R.id.health;
            TextView textView2 = (TextView) e.s(R.id.health, this);
            if (textView2 != null) {
                i4 = R.id.power_source;
                TextView textView3 = (TextView) e.s(R.id.power_source, this);
                if (textView3 != null) {
                    i4 = R.id.technology;
                    TextView textView4 = (TextView) e.s(R.id.technology, this);
                    if (textView4 != null) {
                        i4 = R.id.temperature;
                        TextView textView5 = (TextView) e.s(R.id.temperature, this);
                        if (textView5 != null) {
                            i4 = R.id.voltage;
                            TextView textView6 = (TextView) e.s(R.id.voltage, this);
                            if (textView6 != null) {
                                this.f21168a = new o(this, textView, textView2, textView3, textView4, textView5, textView6);
                                if (isInEditMode()) {
                                    iE = getContext().getResources().getColor(R.color.colorPrimary);
                                } else {
                                    f fVar = f.f21256b;
                                    iE = f.e();
                                }
                                ((TextView) this.f21168a.f36147c).setTextColor(iE);
                                ((TextView) this.f21168a.f36148d).setTextColor(iE);
                                ((TextView) this.f21168a.f36149e).setTextColor(iE);
                                ((TextView) this.f21168a.g).setTextColor(iE);
                                ((TextView) this.f21168a.f36146b).setTextColor(iE);
                                ((TextView) this.f21168a.f36150f).setTextColor(iE);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
    }
}
