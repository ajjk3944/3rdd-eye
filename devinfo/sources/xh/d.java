package xh;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
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
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d extends hg.d {
    public ImageView Z;

    /* renamed from: a0, reason: collision with root package name */
    public TextView f37113a0;

    /* renamed from: b0, reason: collision with root package name */
    public Button f37114b0;

    /* renamed from: c0, reason: collision with root package name */
    public BluetoothAdapter f37115c0;

    /* renamed from: e0, reason: collision with root package name */
    public View f37117e0;

    /* renamed from: f0, reason: collision with root package name */
    public TestesActivity f37118f0;

    /* renamed from: d0, reason: collision with root package name */
    public int f37116d0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    public final kf f37119g0 = new kf(14, this);

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        TestesActivity testesActivity = (TestesActivity) context;
        this.f37118f0 = testesActivity;
        testesActivity.setTitle(R.string.bluetooth_test);
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.f37118f0.registerReceiver(this.f37119g0, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f37117e0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tests_type_done, viewGroup, false);
            this.f37117e0 = viewInflate;
            this.Z = (ImageView) viewInflate.findViewById(R.id.image);
            this.f37113a0 = (TextView) this.f37117e0.findViewById(R.id.message);
            this.Z.setImageResource(R.drawable.img_bluetooth);
            Button button = (Button) this.f37117e0.findViewById(R.id.btn_done);
            this.f37114b0 = button;
            button.setOnClickListener(new com.applovin.mediation.nativeAds.a(26, this));
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.f37115c0 = defaultAdapter;
            if (defaultAdapter == null) {
                this.Z.setImageResource(R.drawable.img_bluetooth_failed);
                this.f37113a0.setText(R.string.test_failed);
                je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_bluetooth", 0);
                return this.f37117e0;
            }
            if (wi.h.f36762h) {
                h0();
            } else if (!wi.h.g || wi.i.b(W(), zg.c.f38281c)) {
                new b(this, 0).start();
            } else {
                t7.m mVar = new t7.m(W());
                mVar.y(R.string.missing_permission);
                mVar.v(R.string.bluetooth_test_permission_summary);
                mVar.x(R.string.grant, new eg.d(11, this));
                mVar.w(android.R.string.cancel, null);
                ((i.b) mVar.f34474c).f25242o = new ah.k(2, this);
                mVar.A().setCanceledOnTouchOutside(false);
            }
        }
        return this.f37117e0;
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        this.f37118f0.unregisterReceiver(this.f37119g0);
    }

    @Override // b5.z
    public final void M(int i4, String[] strArr, int[] iArr) {
        if (i4 == 1) {
            n0 n0Var = wi.i.f36764a;
            if (iArr.length != 0) {
                for (int i10 : iArr) {
                    if (i10 == 0) {
                    }
                }
                new b(this, 0).start();
                return;
            }
            U().finish();
        }
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        sh.k kVar = new sh.k(1, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, kVar);
    }

    public final void h0() {
        if (this.f37115c0.isEnabled()) {
            this.f37113a0.setText(R.string.pls_turn_off_blutooth);
        } else {
            this.f37113a0.setText(R.string.pls_turn_on_blutooth);
        }
    }
}
