package com.liuzh.deviceinfo.card;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.d;
import ci.b;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.l;
import ig.j;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class OverviewCard extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f21189e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21190a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f21191b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f21192c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f21193d;

    public OverviewCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(getContext(), R.layout.card_overview, this);
        if (isInEditMode()) {
            return;
        }
        ((TextView) findViewById(R.id.device_brand)).setText(Build.BRAND);
        this.f21190a = (TextView) findViewById(R.id.name);
        if (TextUtils.isEmpty(f.f21257c.getString("cached_device_name_json", null))) {
            this.f21190a.setText(Build.MODEL);
            d.c(new j(this, 0));
        } else {
            this.f21190a.setText(b.n());
        }
        boolean Z = l.Z();
        this.f21191b = (TextView) findViewById(R.id.os_name);
        this.f21192c = (TextView) findViewById(R.id.os_build_number);
        this.f21193d = (ImageView) findViewById(R.id.ic_android);
        if (Z) {
            d.c(new j(this, 1));
        } else {
            TextView textView = this.f21191b;
            int i4 = Build.VERSION.SDK_INT;
            textView.setText(com.liuzh.deviceinfo.utilities.d.b(i4));
            this.f21192c.setText(com.liuzh.deviceinfo.utilities.d.a(i4));
        }
        int iB = i.b(getContext());
        ((ViewGroup) findViewById(R.id.phone_overview)).setBackgroundTintList(dj.b.c(iB));
        ((ViewGroup) findViewById(R.id.os_overview)).setBackgroundTintList(dj.b.c(iB));
    }
}
