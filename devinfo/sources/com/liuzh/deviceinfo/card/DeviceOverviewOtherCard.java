package com.liuzh.deviceinfo.card;

import android.telephony.TelephonyManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.applovin.mediation.nativeAds.a;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.l;
import com.liuzh.deviceinfo.utilities.y;
import ig.g;
import wi.h;
import wi.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class DeviceOverviewOtherCard extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f21173i = 0;

    /* renamed from: a, reason: collision with root package name */
    public g f21174a;

    /* renamed from: b, reason: collision with root package name */
    public a f21175b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f21176c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f21177d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f21178e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f21179f;
    public final TextView g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f21180h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DeviceOverviewOtherCard(android.content.Context r3, android.util.AttributeSet r4) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.card.DeviceOverviewOtherCard.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void b(TextView textView) {
        textView.setOnClickListener(null);
        if (d.k()) {
            textView.setTextIsSelectable(false);
            textView.setFocusable(false);
        } else {
            textView.setTextIsSelectable(true);
        }
        textView.setBackground(null);
    }

    private void setClickToRequestPermission(TextView textView) {
        textView.setTextIsSelectable(false);
        textView.setText(R.string.grant_permission);
        textView.setOnClickListener(this.f21175b);
        textView.setFocusable(true);
        if (d.k()) {
            y.k(textView);
        }
        textView.setBackground(y.a(getContext()));
    }

    public final void a() {
        if (!i.a(getContext(), "android.permission.READ_PHONE_STATE")) {
            if (this.f21175b == null) {
                this.f21175b = new a(10, this);
            }
            setClickToRequestPermission(this.f21176c);
            if (!d.f21252a) {
                setClickToRequestPermission(this.f21177d);
                setClickToRequestPermission(this.f21179f);
                setClickToRequestPermission(this.f21178e);
            }
            setClickToRequestPermission(this.g);
            setClickToRequestPermission(this.f21180h);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) getContext().getSystemService("phone");
        if (telephonyManager == null) {
            return;
        }
        try {
            this.f21176c.setText(l.b(telephonyManager.getPhoneType()));
        } catch (SecurityException unused) {
        }
        b(this.f21176c);
        if (!h.f36760e) {
            try {
                this.f21177d.setText(telephonyManager.getDeviceId());
            } catch (SecurityException unused2) {
            }
            b(this.f21177d);
            try {
                this.f21178e.setText(telephonyManager.getSimSerialNumber());
            } catch (SecurityException unused3) {
            }
            b(this.f21178e);
            try {
                this.f21179f.setText(telephonyManager.getSubscriberId());
            } catch (SecurityException unused4) {
            }
            b(this.f21179f);
        }
        this.g.setText(telephonyManager.getNetworkOperatorName());
        b(this.g);
        try {
            this.f21180h.setText(l.f0(telephonyManager.getNetworkType()));
        } catch (SecurityException unused5) {
        }
        b(this.f21180h);
    }

    public void setPermissionRequester(g gVar) {
        this.f21174a = gVar;
    }
}
