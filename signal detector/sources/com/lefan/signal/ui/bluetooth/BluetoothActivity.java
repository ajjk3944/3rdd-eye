package com.lefan.signal.ui.bluetooth;

import A2.C0115c;
import B4.C0141c;
import B4.q;
import F4.b;
import G.c;
import K4.a;
import Q4.g;
import Q4.h;
import Q4.i;
import Q4.k;
import Q4.l;
import Q4.v;
import U0.j;
import V2.e;
import a4.t;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.bumptech.glide.d;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import d5.AbstractC2282j;
import d5.s;
import e.C2291h;
import f.C2314a;
import h.AbstractActivityC2349g;
import java.util.Set;
import k0.K;
import q5.p;

/* loaded from: classes.dex */
public final class BluetoothActivity extends AbstractActivityC2349g implements Runnable {

    /* renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ int f18879D0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public final C2291h f18880A0;

    /* renamed from: B0, reason: collision with root package name */
    public final C2291h f18881B0;

    /* renamed from: C0, reason: collision with root package name */
    public final C2291h f18882C0;

    /* renamed from: O, reason: collision with root package name */
    public a f18883O;

    /* renamed from: U, reason: collision with root package name */
    public BluetoothManager f18889U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f18890V;

    /* renamed from: W, reason: collision with root package name */
    public BluetoothAdapter f18891W;

    /* renamed from: Z, reason: collision with root package name */
    public TextView f18894Z;

    /* renamed from: a0, reason: collision with root package name */
    public TextView f18895a0;
    public TextView b0;

    /* renamed from: c0, reason: collision with root package name */
    public MaterialCardView f18896c0;

    /* renamed from: d0, reason: collision with root package name */
    public TextView f18897d0;

    /* renamed from: e0, reason: collision with root package name */
    public TextView f18898e0;

    /* renamed from: f0, reason: collision with root package name */
    public e f18899f0;

    /* renamed from: g0, reason: collision with root package name */
    public AppCompatTextView f18900g0;

    /* renamed from: h0, reason: collision with root package name */
    public ProgressBar f18901h0;

    /* renamed from: i0, reason: collision with root package name */
    public LinearLayoutCompat f18902i0;

    /* renamed from: j0, reason: collision with root package name */
    public LinearLayoutCompat f18903j0;

    /* renamed from: k0, reason: collision with root package name */
    public MaterialButton f18904k0;

    /* renamed from: l0, reason: collision with root package name */
    public RelativeLayout f18905l0;

    /* renamed from: m0, reason: collision with root package name */
    public MaterialButton f18906m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f18907n0;

    /* renamed from: o0, reason: collision with root package name */
    public final IntentFilter f18908o0;

    /* renamed from: p0, reason: collision with root package name */
    public final IntentFilter f18909p0;

    /* renamed from: q0, reason: collision with root package name */
    public BluetoothGatt f18910q0;

    /* renamed from: r0, reason: collision with root package name */
    public final h f18911r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f18912s0;

    /* renamed from: t0, reason: collision with root package name */
    public final h f18913t0;

    /* renamed from: u0, reason: collision with root package name */
    public final i f18914u0;
    public final C2291h v0;

    /* renamed from: w0, reason: collision with root package name */
    public final C2291h f18915w0;

    /* renamed from: x0, reason: collision with root package name */
    public final C2291h f18916x0;

    /* renamed from: y0, reason: collision with root package name */
    public final k f18917y0;

    /* renamed from: z0, reason: collision with root package name */
    public final C2291h f18918z0;

    /* renamed from: P, reason: collision with root package name */
    public final String f18884P = "android.permission.BLUETOOTH_CONNECT";

    /* renamed from: Q, reason: collision with root package name */
    public final String f18885Q = "android.permission.BLUETOOTH_SCAN";

    /* renamed from: R, reason: collision with root package name */
    public final String f18886R = "android.permission.ACCESS_FINE_LOCATION";

    /* renamed from: S, reason: collision with root package name */
    public final Handler f18887S = new Handler(Looper.getMainLooper());

    /* renamed from: T, reason: collision with root package name */
    public final C0115c f18888T = new C0115c(p.a(v.class), new l(this, 1), new l(this, 0), new l(this, 2));

    /* renamed from: X, reason: collision with root package name */
    public final D4.a f18892X = new D4.a(5, (byte) 0);

    /* renamed from: Y, reason: collision with root package name */
    public final D4.a f18893Y = new D4.a(6, (byte) 0);

    public BluetoothActivity() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        this.f18908o0 = intentFilter;
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.f18909p0 = intentFilter2;
        this.f18911r0 = new h(this, 1);
        this.f18913t0 = new h(this, 0);
        this.f18914u0 = new i(this);
        this.v0 = (C2291h) p(new C2314a(2), new g(this, 2));
        this.f18915w0 = (C2291h) p(new C2314a(2), new g(this, 3));
        this.f18916x0 = (C2291h) p(new C2314a(2), new g(this, 4));
        this.f18917y0 = new k(this);
        this.f18918z0 = (C2291h) p(new C2314a(3), new b(13));
        this.f18880A0 = (C2291h) p(new C2314a(3), new b(14));
        this.f18881B0 = (C2291h) p(new C2314a(2), new g(this, 5));
        this.f18882C0 = (C2291h) p(new C2314a(3), new b(15));
    }

    public final v C() {
        return (v) this.f18888T.getValue();
    }

    public final void D() {
        Set<BluetoothDevice> bondedDevices;
        BluetoothDevice device;
        BluetoothDevice device2;
        BluetoothDevice device3;
        ProgressBar progressBar = this.f18901h0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        AppCompatTextView appCompatTextView = this.f18900g0;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
        LinearLayoutCompat linearLayoutCompat = this.f18902i0;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setVisibility(0);
        }
        TextView textView = this.b0;
        if (textView != null) {
            BluetoothGatt bluetoothGatt = this.f18910q0;
            textView.setText((bluetoothGatt == null || (device3 = bluetoothGatt.getDevice()) == null) ? null : device3.getAddress());
        }
        TextView textView2 = this.f18894Z;
        if (textView2 != null) {
            BluetoothGatt bluetoothGatt2 = this.f18910q0;
            textView2.setText((bluetoothGatt2 == null || (device2 = bluetoothGatt2.getDevice()) == null) ? null : device2.getName());
        }
        TextView textView3 = this.f18895a0;
        if (textView3 != null) {
            BluetoothGatt bluetoothGatt3 = this.f18910q0;
            textView3.setText((bluetoothGatt3 == null || (device = bluetoothGatt3.getDevice()) == null) ? null : device.getName());
        }
        a aVar = this.f18883O;
        if (aVar == null) {
            q5.i.g("binding");
            throw null;
        }
        AppCompatImageView appCompatImageView = aVar.f2185m;
        BluetoothGatt bluetoothGatt4 = this.f18910q0;
        appCompatImageView.setImageResource(d.t(bluetoothGatt4 != null ? bluetoothGatt4.getDevice() : null));
        v vVarC = C();
        BluetoothAdapter bluetoothAdapter = this.f18891W;
        vVarC.f3243b.j((bluetoothAdapter == null || (bondedDevices = bluetoothAdapter.getBondedDevices()) == null) ? s.f19824a : AbstractC2282j.j0(bondedDevices));
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0058 A[EDGE_INSN: B:84:0x0058->B:28:0x0058 BREAK  A[LOOP:0: B:16:0x0029->B:87:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[LOOP:0: B:16:0x0029->B:87:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.bluetooth.BluetoothActivity.E():void");
    }

    public final void F() {
        BluetoothAdapter bluetoothAdapter;
        String str = this.f18886R;
        q5.i.e(str, "string");
        if (c.a(this, str) != 0) {
            K kS = s();
            c1.g gVar = new c1.g(27, false);
            gVar.f5897c = getString(R.string.permission_required_title);
            gVar.f5896b = getString(R.string.scan_blue_need_location);
            gVar.f5898d = getString(R.string.button_perm_allow);
            j jVar = new j(8, this);
            if (kS == null) {
                return;
            }
            C0141c c0141c = new C0141c();
            c0141c.f704C0 = gVar;
            c0141c.f703B0 = jVar;
            c0141c.e0(kS, "custom_dialog");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            String str2 = this.f18885Q;
            q5.i.e(str2, "string");
            if (c.a(this, str2) != 0) {
                q qVar = new q(this);
                qVar.f746e = getString(R.string.permission_required_title);
                qVar.f747f = getString(R.string.blue_need_scan_permission);
                qVar.f748g = false;
                qVar.f749h = new Q4.e(0, this);
                qVar.i = new D4.d(3);
                qVar.show();
                return;
            }
        }
        if (t.l(this)) {
            BluetoothAdapter bluetoothAdapter2 = this.f18891W;
            if ((bluetoothAdapter2 == null || !bluetoothAdapter2.isDiscovering()) && (bluetoothAdapter = this.f18891W) != null) {
                bluetoothAdapter.startDiscovery();
                return;
            }
            return;
        }
        K kS2 = s();
        c1.g gVar2 = new c1.g(27, false);
        gVar2.f5897c = getString(R.string.string_tip);
        gVar2.f5896b = getString(R.string.blue_scan_need_gps);
        gVar2.f5898d = getString(R.string.action_settings);
        A0.e eVar = new A0.e(10, this);
        if (kS2 == null) {
            return;
        }
        C0141c c0141c2 = new C0141c();
        c0141c2.f704C0 = gVar2;
        c0141c2.f703B0 = eVar;
        c0141c2.e0(kS2, "custom_dialog");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0384  */
    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.bluetooth.BluetoothActivity.onCreate(android.os.Bundle):void");
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f18887S.removeCallbacksAndMessages(null);
        try {
            if (this.f18890V) {
                unregisterReceiver(this.f18911r0);
            }
        } catch (Throwable th) {
            R2.a.d(th);
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onPause() {
        BluetoothAdapter bluetoothAdapter;
        BluetoothLeScanner bluetoothLeScanner;
        super.onPause();
        if (this.f18890V) {
            try {
                unregisterReceiver(this.f18913t0);
                String str = this.f18884P;
                q5.i.e(str, "string");
                if (c.a(this, str) != 0 || (bluetoothAdapter = this.f18891W) == null || (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) == null) {
                    return;
                }
                bluetoothLeScanner.stopScan(this.f18917y0);
            } catch (Throwable th) {
                R2.a.d(th);
            }
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f18890V) {
            if (Build.VERSION.SDK_INT < 31) {
                String str = this.f18886R;
                q5.i.e(str, "string");
                if (c.a(this, str) == 0) {
                    E();
                    MaterialCardView materialCardView = this.f18896c0;
                    if (materialCardView != null) {
                        materialCardView.setVisibility(8);
                    }
                    RelativeLayout relativeLayout = this.f18905l0;
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(0);
                        return;
                    }
                    return;
                }
                RelativeLayout relativeLayout2 = this.f18905l0;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
                MaterialCardView materialCardView2 = this.f18896c0;
                if (materialCardView2 != null) {
                    materialCardView2.setVisibility(0);
                }
                TextView textView = this.f18897d0;
                if (textView != null) {
                    textView.setText(getString(R.string.blue_need_location));
                }
                TextView textView2 = this.f18898e0;
                if (textView2 != null) {
                    textView2.setOnClickListener(new Q4.d(this, 0));
                }
                MaterialButton materialButton = this.f18904k0;
                if (materialButton != null) {
                    materialButton.setEnabled(false);
                    return;
                }
                return;
            }
            String str2 = this.f18884P;
            q5.i.e(str2, "string");
            if (c.a(this, str2) == 0) {
                E();
                MaterialCardView materialCardView3 = this.f18896c0;
                if (materialCardView3 != null) {
                    materialCardView3.setVisibility(8);
                }
                RelativeLayout relativeLayout3 = this.f18905l0;
                if (relativeLayout3 != null) {
                    relativeLayout3.setVisibility(0);
                }
                a aVar = this.f18883O;
                if (aVar == null) {
                    q5.i.g("binding");
                    throw null;
                }
                TextView textView3 = aVar.i;
                BluetoothAdapter bluetoothAdapter = this.f18891W;
                textView3.setText(bluetoothAdapter != null ? bluetoothAdapter.getName() : null);
                return;
            }
            RelativeLayout relativeLayout4 = this.f18905l0;
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(8);
            }
            MaterialCardView materialCardView4 = this.f18896c0;
            if (materialCardView4 != null) {
                materialCardView4.setVisibility(0);
            }
            TextView textView4 = this.f18897d0;
            if (textView4 != null) {
                textView4.setText(getString(R.string.blue_need_permission));
            }
            TextView textView5 = this.f18898e0;
            if (textView5 != null) {
                textView5.setOnClickListener(new Q4.d(this, 9));
            }
            MaterialButton materialButton2 = this.f18904k0;
            if (materialButton2 != null) {
                materialButton2.setEnabled(false);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        BluetoothGatt bluetoothGatt = this.f18910q0;
        if (bluetoothGatt != null) {
            bluetoothGatt.readRemoteRssi();
        }
        this.f18887S.postDelayed(this, 1000L);
    }
}
