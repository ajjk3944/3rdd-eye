package G6;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.polidea.rxandroidble3.exceptions.BleCharacteristicNotFoundException;
import com.polidea.rxandroidble3.exceptions.BleServiceNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class P {

    /* renamed from: a, reason: collision with root package name */
    final List f7038a;

    class a implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f7039a;

        a(UUID uuid) {
            this.f7039a = uuid;
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(BluetoothGattService bluetoothGattService) {
            return bluetoothGattService.getUuid().equals(this.f7039a);
        }
    }

    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f7041a;

        b(UUID uuid) {
            this.f7041a = uuid;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BluetoothGattCharacteristic call() {
            Iterator it = P.this.f7038a.iterator();
            while (it.hasNext()) {
                BluetoothGattCharacteristic characteristic = ((BluetoothGattService) it.next()).getCharacteristic(this.f7041a);
                if (characteristic != null) {
                    return characteristic;
                }
            }
            throw new BleCharacteristicNotFoundException(this.f7041a);
        }
    }

    public P(List list) {
        this.f7038a = list;
    }

    public List a() {
        return this.f7038a;
    }

    public gg.z b(UUID uuid) {
        return gg.z.x(new b(uuid));
    }

    public gg.z c(UUID uuid) {
        return gg.s.c0(this.f7038a).N(new a(uuid)).O().x(gg.z.p(new BleServiceNotFoundException(uuid)));
    }
}
