package Q4;

import A2.C0115c;
import android.app.Dialog;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Q;
import androidx.recyclerview.widget.RecyclerView;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.wifi.WifiSignalView;
import com.lefan.signal.view.DiagnosisLevelView;
import d5.AbstractC2281i;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o.m1;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class t extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public m1 f3231A0;

    /* renamed from: B0, reason: collision with root package name */
    public final D4.a f3232B0 = new D4.a(1, false);

    /* renamed from: C0, reason: collision with root package name */
    public final ArrayList f3233C0 = new ArrayList();

    /* renamed from: D0, reason: collision with root package name */
    public final C0115c f3234D0 = new C0115c(q5.p.a(v.class), new s(this, 0), new s(this, 2), new s(this, 1));

    /* renamed from: E0, reason: collision with root package name */
    public boolean f3235E0;

    /* renamed from: F0, reason: collision with root package name */
    public BluetoothDevice f3236F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f3237G0;

    /* renamed from: H0, reason: collision with root package name */
    public m f3238H0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (this.f3236F0 == null) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String strR;
        String str;
        q5.i.e(layoutInflater, "inflater");
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_bluetooth_device, viewGroup, false);
        int i3 = R.id.blue_device_recycler;
        RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.blue_device_recycler, viewInflate);
        if (recyclerView != null) {
            i3 = R.id.blue_signal_tip;
            TextView textView = (TextView) a4.p.e(R.id.blue_signal_tip, viewInflate);
            if (textView != null) {
                i3 = R.id.blue_signal_val;
                TextView textView2 = (TextView) a4.p.e(R.id.blue_signal_val, viewInflate);
                if (textView2 != null) {
                    i3 = R.id.blue_signal_view;
                    WifiSignalView wifiSignalView = (WifiSignalView) a4.p.e(R.id.blue_signal_view, viewInflate);
                    if (wifiSignalView != null) {
                        i3 = R.id.bluetooth_device_cancel;
                        MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.bluetooth_device_cancel, viewInflate);
                        if (materialButton != null) {
                            i3 = R.id.bluetooth_device_connect;
                            MaterialButton materialButton2 = (MaterialButton) a4.p.e(R.id.bluetooth_device_connect, viewInflate);
                            if (materialButton2 != null) {
                                i3 = R.id.bluetooth_device_title;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) a4.p.e(R.id.bluetooth_device_title, viewInflate);
                                if (appCompatTextView != null) {
                                    i3 = R.id.signal_level_view;
                                    if (((DiagnosisLevelView) a4.p.e(R.id.signal_level_view, viewInflate)) != null) {
                                        this.f3231A0 = new m1((LinearLayout) viewInflate, recyclerView, textView, textView2, wifiSignalView, materialButton, materialButton2, appCompatTextView);
                                        D4.a aVar = this.f3232B0;
                                        recyclerView.setAdapter(aVar);
                                        ArrayList arrayList = this.f3233C0;
                                        aVar.p(arrayList);
                                        aVar.f4672f = new F4.c(6, this);
                                        m1 m1Var = this.f3231A0;
                                        q5.i.b(m1Var);
                                        ((MaterialButton) m1Var.f22586f).setOnClickListener(new View.OnClickListener(this) { // from class: Q4.n

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ t f3220b;

                                            {
                                                this.f3220b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i) {
                                                    case 0:
                                                        this.f3220b.X();
                                                        break;
                                                    default:
                                                        t tVar = this.f3220b;
                                                        Context contextM = tVar.m();
                                                        if (Build.VERSION.SDK_INT >= 31 && (contextM == null || G.c.a(contextM, "android.permission.BLUETOOTH_CONNECT") != 0)) {
                                                            Intent intentX = com.bumptech.glide.d.x(tVar.m(), "android.settings.BLUETOOTH_SETTINGS");
                                                            if (intentX != null) {
                                                                MyApplication.f18812d = true;
                                                                tVar.W(intentX);
                                                            }
                                                            tVar.X();
                                                            break;
                                                        } else if (!tVar.f3235E0) {
                                                            Intent intentX2 = com.bumptech.glide.d.x(tVar.m(), "android.settings.BLUETOOTH_SETTINGS");
                                                            if (intentX2 != null) {
                                                                MyApplication.f18812d = true;
                                                                tVar.W(intentX2);
                                                            }
                                                            tVar.X();
                                                            break;
                                                        } else {
                                                            AbstractC3046w.l(Q.f(tVar), null, new r(tVar, null), 3);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        m1 m1Var2 = this.f3231A0;
                                        q5.i.b(m1Var2);
                                        final int i6 = 1;
                                        ((MaterialButton) m1Var2.f22587g).setOnClickListener(new View.OnClickListener(this) { // from class: Q4.n

                                            /* renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ t f3220b;

                                            {
                                                this.f3220b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i6) {
                                                    case 0:
                                                        this.f3220b.X();
                                                        break;
                                                    default:
                                                        t tVar = this.f3220b;
                                                        Context contextM = tVar.m();
                                                        if (Build.VERSION.SDK_INT >= 31 && (contextM == null || G.c.a(contextM, "android.permission.BLUETOOTH_CONNECT") != 0)) {
                                                            Intent intentX = com.bumptech.glide.d.x(tVar.m(), "android.settings.BLUETOOTH_SETTINGS");
                                                            if (intentX != null) {
                                                                MyApplication.f18812d = true;
                                                                tVar.W(intentX);
                                                            }
                                                            tVar.X();
                                                            break;
                                                        } else if (!tVar.f3235E0) {
                                                            Intent intentX2 = com.bumptech.glide.d.x(tVar.m(), "android.settings.BLUETOOTH_SETTINGS");
                                                            if (intentX2 != null) {
                                                                MyApplication.f18812d = true;
                                                                tVar.W(intentX2);
                                                            }
                                                            tVar.X();
                                                            break;
                                                        } else {
                                                            AbstractC3046w.l(Q.f(tVar), null, new r(tVar, null), 3);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        boolean z6 = this.f3237G0;
                                        C0115c c0115c = this.f3234D0;
                                        if (z6) {
                                            m1 m1Var3 = this.f3231A0;
                                            q5.i.b(m1Var3);
                                            ((MaterialButton) m1Var3.f22587g).setVisibility(8);
                                            ((v) c0115c.getValue()).f3249h.e(s(), new j(new p5.l(this) { // from class: Q4.o

                                                /* renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ t f3222b;

                                                {
                                                    this.f3222b = this;
                                                }

                                                @Override // p5.l
                                                public final Object f(Object obj) {
                                                    switch (i) {
                                                        case 0:
                                                            m1 m1Var4 = this.f3222b.f3231A0;
                                                            q5.i.b(m1Var4);
                                                            ((TextView) m1Var4.f22584d).setText((String) obj);
                                                            break;
                                                        default:
                                                            Integer num = (Integer) obj;
                                                            m1 m1Var5 = this.f3222b.f3231A0;
                                                            q5.i.b(m1Var5);
                                                            WifiSignalView wifiSignalView2 = (WifiSignalView) m1Var5.f22585e;
                                                            q5.i.b(num);
                                                            wifiSignalView2.a(num.intValue());
                                                            break;
                                                    }
                                                    return C0412i.f5929a;
                                                }
                                            }, 1));
                                            ((v) c0115c.getValue()).f3250j.e(s(), new j(new p5.l(this) { // from class: Q4.o

                                                /* renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ t f3222b;

                                                {
                                                    this.f3222b = this;
                                                }

                                                @Override // p5.l
                                                public final Object f(Object obj) {
                                                    switch (i6) {
                                                        case 0:
                                                            m1 m1Var4 = this.f3222b.f3231A0;
                                                            q5.i.b(m1Var4);
                                                            ((TextView) m1Var4.f22584d).setText((String) obj);
                                                            break;
                                                        default:
                                                            Integer num = (Integer) obj;
                                                            m1 m1Var5 = this.f3222b.f3231A0;
                                                            q5.i.b(m1Var5);
                                                            WifiSignalView wifiSignalView2 = (WifiSignalView) m1Var5.f22585e;
                                                            q5.i.b(num);
                                                            wifiSignalView2.a(num.intValue());
                                                            break;
                                                    }
                                                    return C0412i.f5929a;
                                                }
                                            }, 1));
                                        } else {
                                            m1 m1Var4 = this.f3231A0;
                                            q5.i.b(m1Var4);
                                            ((TextView) m1Var4.f22582b).setVisibility(0);
                                            BluetoothDevice bluetoothDevice = this.f3236F0;
                                            String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
                                            if (address != null && address.length() != 0) {
                                                ((v) c0115c.getValue()).f3246e.e(s(), new j(new H4.c(this, 5, address), 1));
                                            }
                                        }
                                        BluetoothDevice bluetoothDevice2 = this.f3236F0;
                                        if (bluetoothDevice2 != null && bluetoothDevice2.getBondState() == 12) {
                                            m1 m1Var5 = this.f3231A0;
                                            q5.i.b(m1Var5);
                                            ((MaterialButton) m1Var5.f22587g).setText(r(R.string.connect));
                                        }
                                        BluetoothDevice bluetoothDevice3 = this.f3236F0;
                                        if (bluetoothDevice3 != null) {
                                            Context contextM = m();
                                            int i7 = Build.VERSION.SDK_INT;
                                            if (i7 < 31 || (contextM != null && G.c.a(contextM, "android.permission.BLUETOOTH_CONNECT") == 0)) {
                                                if (i7 >= 30) {
                                                    m1 m1Var6 = this.f3231A0;
                                                    q5.i.b(m1Var6);
                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) m1Var6.f22588h;
                                                    String name = bluetoothDevice3.getName();
                                                    if (name == null && (name = bluetoothDevice3.getAlias()) == null) {
                                                        name = r(R.string.device_unknown);
                                                        q5.i.d(name, "getString(...)");
                                                    }
                                                    appCompatTextView2.setText(name);
                                                    String strR2 = r(R.string.string_name);
                                                    q5.i.d(strR2, "getString(...)");
                                                    String name2 = bluetoothDevice3.getName();
                                                    if (name2 == null && (name2 = bluetoothDevice3.getAlias()) == null) {
                                                        name2 = r(R.string.device_unknown);
                                                        q5.i.d(name2, "getString(...)");
                                                    }
                                                    J4.b bVar = new J4.b();
                                                    bVar.f2140a = strR2;
                                                    bVar.f2141b = name2;
                                                    arrayList.add(bVar);
                                                } else {
                                                    m1 m1Var7 = this.f3231A0;
                                                    q5.i.b(m1Var7);
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) m1Var7.f22588h;
                                                    String name3 = bluetoothDevice3.getName();
                                                    if (name3 == null) {
                                                        name3 = r(R.string.device_unknown);
                                                        q5.i.d(name3, "getString(...)");
                                                    }
                                                    appCompatTextView3.setText(name3);
                                                    String strR3 = r(R.string.string_name);
                                                    q5.i.d(strR3, "getString(...)");
                                                    String name4 = bluetoothDevice3.getName();
                                                    if (name4 == null) {
                                                        name4 = r(R.string.device_unknown);
                                                        q5.i.d(name4, "getString(...)");
                                                    }
                                                    J4.b bVar2 = new J4.b();
                                                    bVar2.f2140a = strR3;
                                                    bVar2.f2141b = name4;
                                                    arrayList.add(bVar2);
                                                }
                                                if (this.f3238H0 != null) {
                                                    String strR4 = r(R.string.signal);
                                                    q5.i.d(strR4, "getString(...)");
                                                    m mVar = this.f3238H0;
                                                    Integer numValueOf = mVar != null ? Integer.valueOf(mVar.f3216c) : null;
                                                    if (R2.a.f3390d) {
                                                        Locale locale = F4.e.f1457a;
                                                        str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                                                    } else {
                                                        str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                                                    }
                                                    J4.b bVar3 = new J4.b();
                                                    bVar3.f2140a = strR4;
                                                    bVar3.f2141b = str;
                                                    arrayList.add(bVar3);
                                                }
                                                if (i7 >= 30) {
                                                    String strR5 = r(R.string.alias);
                                                    q5.i.d(strR5, "getString(...)");
                                                    String alias = bluetoothDevice3.getAlias();
                                                    J4.b bVar4 = new J4.b();
                                                    bVar4.f2140a = strR5;
                                                    bVar4.f2141b = alias;
                                                    arrayList.add(bVar4);
                                                }
                                                String strR6 = r(R.string.mac_address);
                                                q5.i.d(strR6, "getString(...)");
                                                String address2 = bluetoothDevice3.getAddress();
                                                J4.b bVar5 = new J4.b();
                                                bVar5.f2140a = strR6;
                                                bVar5.f2141b = address2;
                                                arrayList.add(bVar5);
                                                String strR7 = r(R.string.string_state);
                                                q5.i.d(strR7, "getString(...)");
                                                switch (bluetoothDevice3.getBondState()) {
                                                    case 10:
                                                        strR = r(R.string.bond_none);
                                                        break;
                                                    case 11:
                                                        strR = r(R.string.bonding);
                                                        break;
                                                    case 12:
                                                        this.f3235E0 = true;
                                                        strR = r(R.string.bond_bonded);
                                                        break;
                                                    default:
                                                        strR = r(R.string.string_unknown);
                                                        break;
                                                }
                                                J4.b bVar6 = new J4.b();
                                                bVar6.f2140a = strR7;
                                                bVar6.f2141b = strR;
                                                arrayList.add(bVar6);
                                                String strR8 = r(R.string.string_type);
                                                q5.i.d(strR8, "getString(...)");
                                                int type = bluetoothDevice3.getType();
                                                String strR9 = type != 1 ? type != 2 ? type != 3 ? r(R.string.string_unknown) : r(R.string.dual_mode_br_edr_le) : r(R.string.low_energy_le_only) : r(R.string.classic_br_edr);
                                                J4.b bVar7 = new J4.b();
                                                bVar7.f2140a = strR8;
                                                bVar7.f2141b = strR9;
                                                arrayList.add(bVar7);
                                                ParcelUuid[] uuids = bluetoothDevice3.getUuids();
                                                String strV = uuids != null ? AbstractC2281i.V(uuids, null, 63) : null;
                                                J4.b bVar8 = new J4.b();
                                                bVar8.f2140a = "uuids";
                                                bVar8.f2141b = strV;
                                                arrayList.add(bVar8);
                                                if (i7 >= 24) {
                                                    Collection.EL.removeIf(arrayList, new N4.i(new D4.d(4), 2));
                                                }
                                            }
                                        }
                                        m1 m1Var8 = this.f3231A0;
                                        q5.i.b(m1Var8);
                                        LinearLayout linearLayout = (LinearLayout) m1Var8.f22583c;
                                        q5.i.d(linearLayout, "getRoot(...)");
                                        return linearLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3231A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        Dialog dialog = this.v0;
        k3.e eVar = dialog instanceof k3.e ? (k3.e) dialog : null;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = q().getDisplayMetrics();
        q5.i.d(displayMetrics, "getDisplayMetrics(...)");
        int i = displayMetrics.heightPixels;
        bottomSheetBehaviorH.f18157l = i > displayMetrics.widthPixels ? (i * 2) / 3 : (i * 4) / 5;
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }
}
