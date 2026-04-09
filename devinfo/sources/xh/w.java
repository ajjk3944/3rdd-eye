package xh;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.kf;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.tests.TestesActivity;
import e4.m0;
import e4.v0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class w extends hg.d {
    public ImageView Z;

    /* renamed from: a0, reason: collision with root package name */
    public TextView f37157a0;

    /* renamed from: b0, reason: collision with root package name */
    public Button f37158b0;

    /* renamed from: c0, reason: collision with root package name */
    public WifiManager f37159c0;

    /* renamed from: e0, reason: collision with root package name */
    public TestesActivity f37161e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f37162f0;

    /* renamed from: d0, reason: collision with root package name */
    public int f37160d0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    public final kf f37163g0 = new kf(15, this);

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        TestesActivity testesActivity = (TestesActivity) context;
        this.f37161e0 = testesActivity;
        testesActivity.setTitle(R.string.wifi_test);
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.f37161e0.registerReceiver(this.f37163g0, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f37162f0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tests_type_done, viewGroup, false);
            this.f37162f0 = viewInflate;
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
            this.Z = imageView;
            imageView.setImageResource(R.drawable.img_wifi);
            this.f37157a0 = (TextView) this.f37162f0.findViewById(R.id.message);
            this.f37158b0 = (Button) this.f37162f0.findViewById(R.id.btn_done);
            WifiManager wifiManager = (WifiManager) this.f37161e0.getApplicationContext().getSystemService("wifi");
            this.f37159c0 = wifiManager;
            if (wifiManager == null) {
                this.Z.setImageResource(R.drawable.img_wifi_failed);
                this.f37157a0.setText(R.string.test_failed);
                com.liuzh.deviceinfo.utilities.t.f21303b.b(0);
                return this.f37162f0;
            }
            new b(this, 1).start();
            this.f37158b0.setOnClickListener(new com.applovin.mediation.nativeAds.a(27, this));
        }
        return this.f37162f0;
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        this.f37161e0.unregisterReceiver(this.f37163g0);
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        sh.o oVar = new sh.o(3, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, oVar);
    }
}
