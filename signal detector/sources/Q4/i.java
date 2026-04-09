package Q4;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i extends BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BluetoothActivity f3208a;

    public i(BluetoothActivity bluetoothActivity) {
        this.f3208a = bluetoothActivity;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i3) {
        String str;
        super.onReadRemoteRssi(bluetoothGatt, i, i3);
        int i6 = BluetoothActivity.f18879D0;
        BluetoothActivity bluetoothActivity = this.f3208a;
        v vVarC = bluetoothActivity.C();
        Integer numValueOf = Integer.valueOf(i);
        if (R2.a.f3390d) {
            Locale locale = F4.e.f1457a;
            str = String.format(F4.e.b(), "%d dBm", Arrays.copyOf(new Object[]{numValueOf}, 1));
        } else {
            str = String.format(Locale.ENGLISH, "%d dBm", Arrays.copyOf(new Object[]{numValueOf}, 1));
        }
        vVarC.f3248g.h(str);
        bluetoothActivity.C().i.h(Integer.valueOf(i));
    }
}
