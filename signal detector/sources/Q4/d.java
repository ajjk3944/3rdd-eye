package Q4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import c5.C0409f;
import c5.C0412i;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothActivity f3199b;

    public /* synthetic */ d(BluetoothActivity bluetoothActivity, int i) {
        this.f3198a = i;
        this.f3199b = bluetoothActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BluetoothDevice device;
        BluetoothDevice device2;
        BluetoothDevice device3;
        Object objD;
        int i = this.f3198a;
        String address = null;
        BluetoothActivity bluetoothActivity = this.f3199b;
        switch (i) {
            case 0:
                int i3 = BluetoothActivity.f18879D0;
                bluetoothActivity.f18907n0 = System.currentTimeMillis();
                bluetoothActivity.f18915w0.a(bluetoothActivity.f18886R);
                break;
            case 1:
                BluetoothAdapter bluetoothAdapter = bluetoothActivity.f18891W;
                if (bluetoothAdapter != null) {
                    u uVar = new u();
                    uVar.f3242D0 = bluetoothAdapter;
                    uVar.f0(bluetoothActivity.s(), "bluetooth_info");
                    break;
                }
                break;
            case 2:
                int i6 = BluetoothActivity.f18879D0;
                c cVar = new c();
                BluetoothGatt bluetoothGatt = bluetoothActivity.f18910q0;
                if (bluetoothGatt != null && (device = bluetoothGatt.getDevice()) != null) {
                    address = device.getAddress();
                }
                cVar.f3197E0 = address;
                cVar.f0(bluetoothActivity.s(), "bluetooth_more");
                break;
            case 3:
                int i7 = BluetoothActivity.f18879D0;
                x xVar = new x();
                BluetoothGatt bluetoothGatt2 = bluetoothActivity.f18910q0;
                if (bluetoothGatt2 != null && (device2 = bluetoothGatt2.getDevice()) != null) {
                    address = device2.getAddress();
                }
                xVar.f3256D0 = address;
                xVar.f0(bluetoothActivity.s(), "bluetooth_pair_more");
                break;
            case 4:
                int i8 = BluetoothActivity.f18879D0;
                bluetoothActivity.finish();
                break;
            case 5:
                BluetoothGatt bluetoothGatt3 = bluetoothActivity.f18910q0;
                if (bluetoothGatt3 != null && (device3 = bluetoothGatt3.getDevice()) != null) {
                    t tVar = new t();
                    tVar.f3237G0 = true;
                    tVar.f3236F0 = device3;
                    tVar.f0(bluetoothActivity.s(), "bluetooth_device");
                    break;
                }
                break;
            case 6:
                int i9 = BluetoothActivity.f18879D0;
                bluetoothActivity.startActivity(com.bumptech.glide.d.x(bluetoothActivity, "android.settings.BLUETOOTH_SETTINGS"));
                break;
            case 7:
                int i10 = BluetoothActivity.f18879D0;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 33) {
                    if (i11 < 31) {
                        BluetoothAdapter bluetoothAdapter2 = bluetoothActivity.f18891W;
                        if (bluetoothAdapter2 != null) {
                            bluetoothAdapter2.enable();
                            break;
                        }
                    } else {
                        String str = bluetoothActivity.f18884P;
                        q5.i.e(str, "string");
                        if (G.c.a(bluetoothActivity, str) != 0) {
                            bluetoothActivity.startActivity(com.bumptech.glide.d.x(bluetoothActivity, "android.settings.BLUETOOTH_SETTINGS"));
                            break;
                        } else {
                            BluetoothAdapter bluetoothAdapter3 = bluetoothActivity.f18891W;
                            if (bluetoothAdapter3 != null) {
                                bluetoothAdapter3.enable();
                                break;
                            }
                        }
                    }
                } else {
                    try {
                        bluetoothActivity.startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                        objD = C0412i.f5929a;
                    } catch (Throwable th) {
                        objD = R2.a.d(th);
                    }
                    if (C0409f.a(objD) != null) {
                        bluetoothActivity.startActivity(com.bumptech.glide.d.x(bluetoothActivity, "android.settings.BLUETOOTH_SETTINGS"));
                        break;
                    }
                }
                break;
            case 8:
                int i12 = BluetoothActivity.f18879D0;
                bluetoothActivity.F();
                break;
            default:
                int i13 = BluetoothActivity.f18879D0;
                bluetoothActivity.f18907n0 = System.currentTimeMillis();
                bluetoothActivity.f18881B0.a(bluetoothActivity.f18884P);
                break;
        }
    }
}
