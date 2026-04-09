package Q4;

import android.app.Dialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class u extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public K4.l f3239A0;

    /* renamed from: B0, reason: collision with root package name */
    public final D4.a f3240B0 = new D4.a(1, false);

    /* renamed from: C0, reason: collision with root package name */
    public final ArrayList f3241C0 = new ArrayList();

    /* renamed from: D0, reason: collision with root package name */
    public BluetoothAdapter f3242D0;

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        super.B(bundle);
        if (this.f3242D0 == null) {
            Y();
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        q5.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_bluetooth_info, viewGroup, false);
        int i = R.id.blue_info_cancel;
        MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.blue_info_cancel, viewInflate);
        if (materialButton != null) {
            i = R.id.blue_info_recycler;
            RecyclerView recyclerView = (RecyclerView) a4.p.e(R.id.blue_info_recycler, viewInflate);
            if (recyclerView != null) {
                this.f3239A0 = new K4.l((LinearLayout) viewInflate, materialButton, recyclerView, 0);
                D4.a aVar = this.f3240B0;
                recyclerView.setAdapter(aVar);
                ArrayList arrayList = this.f3241C0;
                aVar.p(arrayList);
                BluetoothAdapter bluetoothAdapter = this.f3242D0;
                if (bluetoothAdapter != null) {
                    Context contextM = m();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 < 31 || (contextM != null && G.c.a(contextM, "android.permission.BLUETOOTH_CONNECT") == 0)) {
                        String strR = r(R.string.string_name);
                        q5.i.d(strR, "getString(...)");
                        String name = bluetoothAdapter.getName();
                        J4.b bVar = new J4.b();
                        bVar.f2140a = strR;
                        bVar.f2141b = name;
                        arrayList.add(bVar);
                        String strR2 = r(R.string.bonded_devices);
                        q5.i.d(strR2, "getString(...)");
                        String strK = R2.a.k(Integer.valueOf(bluetoothAdapter.getBondedDevices().size()), "%d");
                        J4.b bVar2 = new J4.b();
                        bVar2.f2140a = strR2;
                        bVar2.f2141b = strK;
                        arrayList.add(bVar2);
                        if (i3 >= 33) {
                            String strR3 = r(R.string.max_connected_audio_deveices);
                            q5.i.d(strR3, "getString(...)");
                            String strK2 = R2.a.k(Integer.valueOf(bluetoothAdapter.getMaxConnectedAudioDevices()), "%d");
                            J4.b bVar3 = new J4.b();
                            bVar3.f2140a = strR3;
                            bVar3.f2141b = strK2;
                            arrayList.add(bVar3);
                        }
                    }
                    if (i3 >= 26) {
                        if (bluetoothAdapter.getLeMaximumAdvertisingDataLength() != 0) {
                            String strR4 = r(R.string.le_maximum_advertising_data_length);
                            q5.i.d(strR4, "getString(...)");
                            Integer numValueOf = Integer.valueOf(bluetoothAdapter.getLeMaximumAdvertisingDataLength());
                            if (R2.a.f3390d) {
                                Locale locale = F4.e.f1457a;
                                str = String.format(F4.e.b(), "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                            } else {
                                str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{numValueOf}, 1));
                            }
                            J4.b bVar4 = new J4.b();
                            bVar4.f2140a = strR4;
                            bVar4.f2141b = str;
                            arrayList.add(bVar4);
                        }
                        String strR5 = r(R.string.le2MPhy_supported);
                        q5.i.d(strR5, "getString(...)");
                        String strK3 = R2.a.k(Boolean.valueOf(bluetoothAdapter.isLe2MPhySupported()), "%b");
                        J4.b bVar5 = new J4.b();
                        bVar5.f2140a = strR5;
                        bVar5.f2141b = strK3;
                        arrayList.add(bVar5);
                        String strR6 = r(R.string.le_code_phy_supported);
                        q5.i.d(strR6, "getString(...)");
                        String strK4 = R2.a.k(Boolean.valueOf(bluetoothAdapter.isLeCodedPhySupported()), "%b");
                        J4.b bVar6 = new J4.b();
                        bVar6.f2140a = strR6;
                        bVar6.f2141b = strK4;
                        arrayList.add(bVar6);
                        String strR7 = r(R.string.le_extended_adverting_supported);
                        q5.i.d(strR7, "getString(...)");
                        String strK5 = R2.a.k(Boolean.valueOf(bluetoothAdapter.isLeExtendedAdvertisingSupported()), "%b");
                        J4.b bVar7 = new J4.b();
                        bVar7.f2140a = strR7;
                        bVar7.f2141b = strK5;
                        arrayList.add(bVar7);
                        String strR8 = r(R.string.le_periodic_advertising_supported);
                        q5.i.d(strR8, "getString(...)");
                        String strK6 = R2.a.k(Boolean.valueOf(bluetoothAdapter.isLePeriodicAdvertisingSupported()), "%b");
                        J4.b bVar8 = new J4.b();
                        bVar8.f2140a = strR8;
                        bVar8.f2141b = strK6;
                        arrayList.add(bVar8);
                    }
                    String strR9 = r(R.string.multiole_advertisement_supported);
                    q5.i.d(strR9, "getString(...)");
                    String strK7 = R2.a.k(Boolean.valueOf(bluetoothAdapter.isMultipleAdvertisementSupported()), "%b");
                    J4.b bVar9 = new J4.b();
                    bVar9.f2140a = strR9;
                    bVar9.f2141b = strK7;
                    arrayList.add(bVar9);
                    String strR10 = r(R.string.off_loaded_scan_batch_supported);
                    q5.i.d(strR10, "getString(...)");
                    String strK8 = R2.a.k(Boolean.valueOf(bluetoothAdapter.isOffloadedScanBatchingSupported()), "%b");
                    J4.b bVar10 = new J4.b();
                    bVar10.f2140a = strR10;
                    bVar10.f2141b = strK8;
                    arrayList.add(bVar10);
                    if (i3 >= 33) {
                        String strR11 = r(R.string.le_audio_broadcast_assistant_supported);
                        q5.i.d(strR11, "getString(...)");
                        int iIsLeAudioBroadcastAssistantSupported = bluetoothAdapter.isLeAudioBroadcastAssistantSupported();
                        String strR12 = iIsLeAudioBroadcastAssistantSupported != 1 ? iIsLeAudioBroadcastAssistantSupported != 10 ? iIsLeAudioBroadcastAssistantSupported != 11 ? r(R.string.string_unknown) : r(R.string.string_not_supported) : r(R.string.string_support) : r(R.string.not_enabled);
                        J4.b bVar11 = new J4.b();
                        bVar11.f2140a = strR11;
                        bVar11.f2141b = strR12;
                        arrayList.add(bVar11);
                        String strR13 = r(R.string.le_audio_broadcast_source_supported);
                        q5.i.d(strR13, "getString(...)");
                        int iIsLeAudioBroadcastSourceSupported = bluetoothAdapter.isLeAudioBroadcastSourceSupported();
                        String strR14 = iIsLeAudioBroadcastSourceSupported != 1 ? iIsLeAudioBroadcastSourceSupported != 10 ? iIsLeAudioBroadcastSourceSupported != 11 ? r(R.string.string_unknown) : r(R.string.string_not_supported) : r(R.string.string_support) : r(R.string.not_enabled);
                        J4.b bVar12 = new J4.b();
                        bVar12.f2140a = strR13;
                        bVar12.f2141b = strR14;
                        arrayList.add(bVar12);
                        String strR15 = r(R.string.le_audio_supported);
                        q5.i.d(strR15, "getString(...)");
                        int iIsLeAudioSupported = bluetoothAdapter.isLeAudioSupported();
                        String strR16 = iIsLeAudioSupported != 1 ? iIsLeAudioSupported != 10 ? iIsLeAudioSupported != 11 ? r(R.string.string_unknown) : r(R.string.string_not_supported) : r(R.string.string_support) : r(R.string.not_enabled);
                        J4.b bVar13 = new J4.b();
                        bVar13.f2140a = strR15;
                        bVar13.f2141b = strR16;
                        arrayList.add(bVar13);
                    }
                }
                K4.l lVar = this.f3239A0;
                q5.i.b(lVar);
                lVar.f2340c.setOnClickListener(new B4.g(12, this));
                aVar.f4672f = new F4.c(7, this);
                K4.l lVar2 = this.f3239A0;
                q5.i.b(lVar2);
                LinearLayout linearLayout = lVar2.f2339b;
                q5.i.d(linearLayout, "getRoot(...)");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f3239A0 = null;
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
