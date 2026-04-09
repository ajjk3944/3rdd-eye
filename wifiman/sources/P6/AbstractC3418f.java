package P6;

import android.bluetooth.BluetoothGattDescriptor;
import java.util.UUID;

/* renamed from: P6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3418f {

    /* renamed from: P6.f$a */
    class a implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ UUID f18072a;

        a(UUID uuid) {
            this.f18072a = uuid;
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(C3417e c3417e) {
            return ((UUID) c3417e.f18070a).equals(this.f18072a);
        }
    }

    /* renamed from: P6.f$b */
    class b implements kg.n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] apply(C3417e c3417e) {
            return c3417e.f18071b;
        }
    }

    /* renamed from: P6.f$c */
    class c implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothGattDescriptor f18073a;

        c(BluetoothGattDescriptor bluetoothGattDescriptor) {
            this.f18073a = bluetoothGattDescriptor;
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(C3417e c3417e) {
            return ((BluetoothGattDescriptor) c3417e.f18070a).equals(this.f18073a);
        }
    }

    public static kg.p a(UUID uuid) {
        return new a(uuid);
    }

    public static kg.p b(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new c(bluetoothGattDescriptor);
    }

    public static kg.n c() {
        return new b();
    }
}
