package Q4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothActivity f3207b;

    public /* synthetic */ h(BluetoothActivity bluetoothActivity, int i) {
        this.f3206a = i;
        this.f3207b = bluetoothActivity;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        BluetoothLeScanner bluetoothLeScanner;
        String address;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i = this.f3206a;
        BluetoothActivity bluetoothActivity = this.f3207b;
        switch (i) {
            case 0:
                D4.a aVar = bluetoothActivity.f18893Y;
                String str = bluetoothActivity.f18884P;
                if (intent != null && (action = intent.getAction()) != null) {
                    switch (action.hashCode()) {
                        case -1780914469:
                            if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
                                aVar.n(R.layout.empty_no_data);
                                MaterialButton materialButton = bluetoothActivity.f18904k0;
                                if (materialButton != null) {
                                    materialButton.setEnabled(true);
                                }
                                MaterialButton materialButton2 = bluetoothActivity.f18904k0;
                                if (materialButton2 != null) {
                                    materialButton2.setText(bluetoothActivity.getString(R.string.scan));
                                }
                                String str2 = bluetoothActivity.f18886R;
                                q5.i.e(str2, "string");
                                if (G.c.a(bluetoothActivity, str2) == 0) {
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        String str3 = bluetoothActivity.f18885Q;
                                        q5.i.e(str3, "string");
                                        if (G.c.a(bluetoothActivity, str3) != 0) {
                                        }
                                    }
                                    BluetoothAdapter bluetoothAdapter = bluetoothActivity.f18891W;
                                    if (bluetoothAdapter != null && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != null) {
                                        bluetoothLeScanner.startScan(bluetoothActivity.f18917y0);
                                        break;
                                    }
                                }
                            }
                            break;
                        case -301431627:
                            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                                int i3 = Build.VERSION.SDK_INT;
                                BluetoothDevice bluetoothDevice = i3 >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                if (bluetoothDevice != null) {
                                    if (i3 >= 31) {
                                        q5.i.e(str, "string");
                                        if (G.c.a(bluetoothActivity, str) != 0) {
                                        }
                                    }
                                    bluetoothActivity.f18910q0 = bluetoothDevice.connectGatt(bluetoothActivity, true, bluetoothActivity.f18914u0);
                                    bluetoothActivity.D();
                                    String str4 = bluetoothActivity.f18912s0;
                                    if (str4 != null) {
                                        if (!str4.equals(bluetoothDevice.getAddress())) {
                                            bluetoothActivity.f18912s0 = bluetoothDevice.getAddress();
                                            F4.d.b(bluetoothActivity, bluetoothActivity.getString(R.string.bluetooth_change_device));
                                            break;
                                        }
                                    } else {
                                        bluetoothActivity.f18912s0 = bluetoothDevice.getAddress();
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6759640:
                            if (action.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED")) {
                                int i6 = BluetoothActivity.f18879D0;
                                List list = (List) bluetoothActivity.C().f3245d.d();
                                if (list != null) {
                                    list.clear();
                                }
                                aVar.n(R.layout.empty_loading);
                                MaterialButton materialButton3 = bluetoothActivity.f18904k0;
                                if (materialButton3 != null) {
                                    materialButton3.setEnabled(false);
                                }
                                MaterialButton materialButton4 = bluetoothActivity.f18904k0;
                                if (materialButton4 != null) {
                                    materialButton4.setText(bluetoothActivity.getString(R.string.scaning));
                                    break;
                                }
                            }
                            break;
                        case 1167529923:
                            if (action.equals("android.bluetooth.device.action.FOUND")) {
                                int i7 = Build.VERSION.SDK_INT;
                                BluetoothDevice bluetoothDevice2 = i7 >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                if (bluetoothDevice2 != null && (address = bluetoothDevice2.getAddress()) != null && address.length() != 0) {
                                    if (i7 >= 31) {
                                        q5.i.e(str, "string");
                                        if (G.c.a(bluetoothActivity, str) != 0) {
                                        }
                                    }
                                    int i8 = BluetoothActivity.f18879D0;
                                    v vVarC = bluetoothActivity.C();
                                    m mVar = new m();
                                    mVar.f3214a = bluetoothDevice2;
                                    mVar.f3215b = bluetoothDevice2.getName();
                                    mVar.f3216c = intent.getShortExtra("android.bluetooth.device.extra.RSSI", Short.MIN_VALUE);
                                    mVar.f3217d = bluetoothDevice2.getAddress();
                                    if (i7 >= 30) {
                                        mVar.f3218e = bluetoothDevice2.getAlias();
                                    }
                                    vVarC.e(mVar);
                                    break;
                                }
                            }
                            break;
                        case 1821585647:
                            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                                bluetoothActivity.f18910q0 = null;
                                v vVarC2 = bluetoothActivity.C();
                                String string = bluetoothActivity.getString(R.string.blue_not_connect);
                                q5.i.d(string, "getString(...)");
                                vVarC2.f3248g.h(string);
                                TextView textView = bluetoothActivity.f18894Z;
                                if (textView != null) {
                                    textView.setText(context != null ? context.getString(R.string.blue_not_connect) : null);
                                }
                                AppCompatTextView appCompatTextView = bluetoothActivity.f18900g0;
                                if (appCompatTextView != null) {
                                    appCompatTextView.setVisibility(0);
                                }
                                LinearLayoutCompat linearLayoutCompat = bluetoothActivity.f18902i0;
                                if (linearLayoutCompat != null) {
                                    linearLayoutCompat.setVisibility(8);
                                    break;
                                }
                            }
                            break;
                        case 2116862345:
                            if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                                int i9 = Build.VERSION.SDK_INT;
                                BluetoothDevice bluetoothDevice3 = i9 >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                                if (bluetoothDevice3 != null) {
                                    if (i9 >= 31) {
                                        q5.i.e(str, "string");
                                        if (G.c.a(bluetoothActivity, str) != 0) {
                                        }
                                    }
                                    switch (bluetoothDevice3.getBondState()) {
                                        case 10:
                                            F4.d.b(context, context != null ? context.getString(R.string.unpair) : null);
                                            ProgressBar progressBar = bluetoothActivity.f18901h0;
                                            if (progressBar != null) {
                                                progressBar.setVisibility(8);
                                            }
                                            LinearLayoutCompat linearLayoutCompat2 = bluetoothActivity.f18902i0;
                                            if (linearLayoutCompat2 != null) {
                                                linearLayoutCompat2.setVisibility(8);
                                            }
                                            AppCompatTextView appCompatTextView2 = bluetoothActivity.f18900g0;
                                            if (appCompatTextView2 != null) {
                                                appCompatTextView2.setVisibility(0);
                                                break;
                                            }
                                            break;
                                        case 11:
                                            F4.d.b(context, context != null ? context.getString(R.string.pairing) : null);
                                            AppCompatTextView appCompatTextView3 = bluetoothActivity.f18900g0;
                                            if (appCompatTextView3 != null) {
                                                appCompatTextView3.setVisibility(8);
                                            }
                                            LinearLayoutCompat linearLayoutCompat3 = bluetoothActivity.f18902i0;
                                            if (linearLayoutCompat3 != null) {
                                                linearLayoutCompat3.setVisibility(8);
                                            }
                                            ProgressBar progressBar2 = bluetoothActivity.f18901h0;
                                            if (progressBar2 != null) {
                                                progressBar2.setVisibility(0);
                                            }
                                            TextView textView2 = bluetoothActivity.f18894Z;
                                            if (textView2 != null) {
                                                textView2.setText(context != null ? context.getString(R.string.pairing) : null);
                                                break;
                                            }
                                            break;
                                        case 12:
                                            F4.d.b(context, context != null ? context.getString(R.string.pairing_complete) : null);
                                            AppCompatTextView appCompatTextView4 = bluetoothActivity.f18900g0;
                                            if (appCompatTextView4 != null) {
                                                appCompatTextView4.setVisibility(8);
                                            }
                                            ProgressBar progressBar3 = bluetoothActivity.f18901h0;
                                            if (progressBar3 != null) {
                                                progressBar3.setVisibility(8);
                                            }
                                            LinearLayoutCompat linearLayoutCompat4 = bluetoothActivity.f18902i0;
                                            if (linearLayoutCompat4 != null) {
                                                linearLayoutCompat4.setVisibility(0);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                    }
                }
                break;
            default:
                if (q5.i.a(intent != null ? intent.getAction() : null, "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                    if (intExtra == 10) {
                        V2.e eVar = bluetoothActivity.f18899f0;
                        if (eVar != null && (linearLayout = (LinearLayout) eVar.f3868b) != null) {
                            linearLayout.setVisibility(0);
                        }
                        LinearLayoutCompat linearLayoutCompat5 = bluetoothActivity.f18903j0;
                        if (linearLayoutCompat5 != null) {
                            linearLayoutCompat5.setVisibility(8);
                        }
                        TextView textView3 = bluetoothActivity.f18894Z;
                        if (textView3 != null) {
                            textView3.setText(context != null ? context.getString(R.string.blue_not_open) : null);
                            break;
                        }
                    } else if (intExtra == 12) {
                        V2.e eVar2 = bluetoothActivity.f18899f0;
                        if (eVar2 != null && (linearLayout2 = (LinearLayout) eVar2.f3868b) != null) {
                            linearLayout2.setVisibility(8);
                        }
                        LinearLayoutCompat linearLayoutCompat6 = bluetoothActivity.f18903j0;
                        if (linearLayoutCompat6 != null) {
                            linearLayoutCompat6.setVisibility(0);
                        }
                        TextView textView4 = bluetoothActivity.f18894Z;
                        if (textView4 != null) {
                            textView4.setText(context != null ? context.getString(R.string.string_unknown) : null);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
