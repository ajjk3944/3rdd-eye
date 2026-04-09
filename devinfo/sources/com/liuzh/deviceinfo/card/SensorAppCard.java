package com.liuzh.deviceinfo.card;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b5.o;
import bi.d;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.y;
import gg.b;
import ig.k;
import ig.m;
import java.util.List;
import yj.n;
import zg.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SensorAppCard extends LinearLayout {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21211a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f21212b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f21213c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f21214d;

    /* renamed from: e, reason: collision with root package name */
    public final View f21215e;

    /* renamed from: f, reason: collision with root package name */
    public final View f21216f;
    public final View g;

    /* renamed from: h, reason: collision with root package name */
    public m f21217h;

    /* renamed from: i, reason: collision with root package name */
    public final o f21218i;

    public SensorAppCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21213c = 0;
        this.f21214d = 0;
        this.f21218i = new o(19, this);
        setOrientation(0);
        View.inflate(getContext(), R.layout.card_sensor_app, this);
        setClipToPadding(false);
        setClipChildren(false);
        this.f21211a = (TextView) findViewById(R.id.app_count);
        this.f21212b = (TextView) findViewById(R.id.sensor_count);
        this.f21215e = findViewById(R.id.iv_warning);
        this.f21216f = findViewById(R.id.sensors);
        this.g = findViewById(R.id.apps);
        if (!isInEditMode()) {
            d.c(new k(this, 0));
        }
        if (isInEditMode()) {
            return;
        }
        f fVar = f.f21256b;
        int iE = f.e();
        com.liuzh.deviceinfo.utilities.d.r((LayerDrawable) ((ImageView) findViewById(R.id.sensor_icon)).getDrawable(), iE);
        com.liuzh.deviceinfo.utilities.d.r((LayerDrawable) ((ImageView) findViewById(R.id.app_icon)).getDrawable(), iE);
    }

    public final void a() {
        int size = 0;
        if (!c.b()) {
            synchronized (this) {
                this.f21213c = 0;
            }
            return;
        }
        try {
            List<ApplicationInfo> installedApplications = getContext().getPackageManager().getInstalledApplications(0);
            synchronized (this) {
                if (installedApplications == null) {
                    this.f21213c = size;
                } else {
                    size = installedApplications.size();
                    this.f21213c = size;
                }
            }
            if (this.f21213c > 1) {
                n nVar = b.g;
                com.bumptech.glide.c.m().a();
            }
        } catch (Exception unused) {
        }
    }

    public void setAppCardClick(m mVar) {
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            y.j(1.02f, this.g);
        }
        this.f21217h = mVar;
    }

    public void setSensorCardClick(View.OnClickListener onClickListener) {
        boolean zK = com.liuzh.deviceinfo.utilities.d.k();
        View view = this.f21216f;
        if (zK) {
            y.j(1.02f, view);
        }
        view.setOnClickListener(onClickListener);
    }
}
