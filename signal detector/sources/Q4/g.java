package Q4;

import a2.AbstractC0271g;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Intent;
import android.view.View;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import d5.AbstractC2282j;
import e.InterfaceC2285b;
import e2.InterfaceC2302a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC2302a, InterfaceC2285b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothActivity f3205b;

    public /* synthetic */ g(BluetoothActivity bluetoothActivity, int i) {
        this.f3204a = i;
        this.f3205b = bluetoothActivity;
    }

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        BluetoothDevice device;
        BluetoothDevice device2;
        int i3 = this.f3204a;
        String address = null;
        BluetoothActivity bluetoothActivity = this.f3205b;
        switch (i3) {
            case 0:
                int i6 = BluetoothActivity.f18879D0;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) AbstractC2282j.V(i, abstractC0271g.f4668b);
                if (bluetoothDevice != null) {
                    t tVar = new t();
                    tVar.f3236F0 = bluetoothDevice;
                    String address2 = bluetoothDevice.getAddress();
                    BluetoothGatt bluetoothGatt = bluetoothActivity.f18910q0;
                    if (bluetoothGatt != null && (device = bluetoothGatt.getDevice()) != null) {
                        address = device.getAddress();
                    }
                    tVar.f3237G0 = q5.i.a(address2, address);
                    tVar.f0(bluetoothActivity.s(), "bluetooth_device");
                    break;
                }
                break;
            default:
                int i7 = BluetoothActivity.f18879D0;
                m mVar = (m) AbstractC2282j.V(i, abstractC0271g.f4668b);
                if (mVar != null) {
                    t tVar2 = new t();
                    tVar2.f3238H0 = mVar;
                    tVar2.f3236F0 = mVar.f3214a;
                    String str = mVar.f3217d;
                    BluetoothGatt bluetoothGatt2 = bluetoothActivity.f18910q0;
                    if (bluetoothGatt2 != null && (device2 = bluetoothGatt2.getDevice()) != null) {
                        address = device2.getAddress();
                    }
                    tVar2.f3237G0 = q5.i.a(str, address);
                    tVar2.f0(bluetoothActivity.s(), "bluetooth_device");
                    break;
                }
                break;
        }
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        Intent intentX;
        Intent intentX2;
        Intent intentX3;
        Intent intentX4;
        int i = this.f3204a;
        BluetoothActivity bluetoothActivity = this.f3205b;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 2:
                if (!zBooleanValue) {
                    if (!bluetoothActivity.shouldShowRequestPermissionRationale(bluetoothActivity.f18886R) && System.currentTimeMillis() - bluetoothActivity.f18907n0 < 500 && (intentX = com.bumptech.glide.d.x(bluetoothActivity, "android.settings.APPLICATION_DETAILS_SETTINGS")) != null) {
                        bluetoothActivity.f18880A0.a(intentX);
                        MyApplication.f18812d = true;
                        break;
                    }
                } else {
                    int i3 = BluetoothActivity.f18879D0;
                    bluetoothActivity.F();
                    break;
                }
                break;
            case 3:
                if (!zBooleanValue) {
                    if (!bluetoothActivity.shouldShowRequestPermissionRationale(bluetoothActivity.f18886R) && System.currentTimeMillis() - bluetoothActivity.f18907n0 < 500 && (intentX2 = com.bumptech.glide.d.x(bluetoothActivity, "android.settings.APPLICATION_DETAILS_SETTINGS")) != null) {
                        bluetoothActivity.f18918z0.a(intentX2);
                        MyApplication.f18812d = true;
                        break;
                    }
                } else {
                    int i6 = BluetoothActivity.f18879D0;
                    break;
                }
                break;
            case 4:
                if (!zBooleanValue) {
                    if (!bluetoothActivity.shouldShowRequestPermissionRationale(bluetoothActivity.f18885Q) && System.currentTimeMillis() - bluetoothActivity.f18907n0 < 500 && (intentX3 = com.bumptech.glide.d.x(bluetoothActivity, "android.settings.APPLICATION_DETAILS_SETTINGS")) != null) {
                        bluetoothActivity.f18918z0.a(intentX3);
                        MyApplication.f18812d = true;
                        break;
                    }
                } else {
                    int i7 = BluetoothActivity.f18879D0;
                    bluetoothActivity.F();
                    break;
                }
                break;
            default:
                if (!zBooleanValue) {
                    if (!bluetoothActivity.shouldShowRequestPermissionRationale(bluetoothActivity.f18884P) && System.currentTimeMillis() - bluetoothActivity.f18907n0 < 500 && (intentX4 = com.bumptech.glide.d.x(bluetoothActivity, "android.settings.APPLICATION_DETAILS_SETTINGS")) != null) {
                        bluetoothActivity.f18882C0.a(intentX4);
                        MyApplication.f18812d = true;
                        break;
                    }
                } else {
                    int i8 = BluetoothActivity.f18879D0;
                    break;
                }
                break;
        }
    }
}
