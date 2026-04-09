package K6;

import P6.C3413a;
import P6.C3419g;
import P6.C3420h;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.polidea.rxandroidble3.exceptions.BleCannotSetCharacteristicNotificationException;
import com.polidea.rxandroidble3.exceptions.BleConflictingNotificationAlreadySetException;
import gg.AbstractC5912b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kg.InterfaceC6464a;
import mg.AbstractC6822a;

/* loaded from: classes3.dex */
class g0 {

    /* renamed from: h, reason: collision with root package name */
    static final UUID f10354h = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: a, reason: collision with root package name */
    final byte[] f10355a;

    /* renamed from: b, reason: collision with root package name */
    final byte[] f10356b;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f10357c;

    /* renamed from: d, reason: collision with root package name */
    final BluetoothGatt f10358d;

    /* renamed from: e, reason: collision with root package name */
    final l0 f10359e;

    /* renamed from: f, reason: collision with root package name */
    final C3149w f10360f;

    /* renamed from: g, reason: collision with root package name */
    final Map f10361g = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10362a;

        static {
            int[] iArr = new int[G6.C.values().length];
            f10362a = iArr;
            try {
                iArr[G6.C.COMPAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10362a[G6.C.QUICK_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10362a[G6.C.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    g0(byte[] bArr, byte[] bArr2, byte[] bArr3, BluetoothGatt bluetoothGatt, l0 l0Var, C3149w c3149w) {
        this.f10355a = bArr;
        this.f10356b = bArr2;
        this.f10357c = bArr3;
        this.f10358d = bluetoothGatt;
        this.f10359e = l0Var;
        this.f10360f = c3149w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean k(C3420h c3420h, C3419g c3419g) {
        return c3419g.equals(c3420h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10) {
        if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z10)) {
            throw new BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gg.s n(AbstractC5912b abstractC5912b, gg.s sVar) {
        return sVar.l0(abstractC5912b.M());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gg.v o(G6.C c10, BluetoothGattCharacteristic bluetoothGattCharacteristic, C3149w c3149w, byte[] bArr, gg.s sVar) {
        int i10 = a.f10362a[c10.ordinal()];
        if (i10 == 1) {
            return sVar;
        }
        if (i10 != 2) {
            return z(bluetoothGattCharacteristic, c3149w, bArr).j(sVar);
        }
        final AbstractC5912b abstractC5912bF0 = z(bluetoothGattCharacteristic, c3149w, bArr).f0().r0().i1(2).f0();
        return sVar.l0(abstractC5912bF0).i0(new kg.n() { // from class: K6.f0
            @Override // kg.n
            public final Object apply(Object obj) {
                return g0.n(abstractC5912bF0, (gg.s) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gg.s p(Hg.b bVar, gg.s sVar) {
        return gg.s.b(Arrays.asList(bVar.f(byte[].class), sVar.T0(bVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Hg.b bVar, C3420h c3420h, BluetoothGattCharacteristic bluetoothGattCharacteristic, G6.C c10) {
        bVar.a();
        synchronized (this.f10361g) {
            this.f10361g.remove(c3420h);
        }
        v(this.f10358d, bluetoothGattCharacteristic, false).n(y(this.f10360f, bluetoothGattCharacteristic, this.f10357c, c10)).U(AbstractC6822a.f54016c, AbstractC6822a.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ gg.v r(final BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z10, final G6.C c10) {
        synchronized (this.f10361g) {
            try {
                final C3420h c3420h = new C3420h(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()));
                C3413a c3413a = (C3413a) this.f10361g.get(c3420h);
                if (c3413a != null) {
                    if (c3413a.f18066b == z10) {
                        return c3413a.f18065a;
                    }
                    return gg.s.L(new BleConflictingNotificationAlreadySetException(bluetoothGattCharacteristic.getUuid(), !z10));
                }
                byte[] bArr = z10 ? this.f10356b : this.f10355a;
                final Hg.b bVarK1 = Hg.b.k1();
                gg.s sVarL1 = v(this.f10358d, bluetoothGattCharacteristic, true).j(P6.E.b(u(this.f10359e, c3420h))).g(w(this.f10360f, bluetoothGattCharacteristic, bArr, c10)).i0(new kg.n() { // from class: K6.X
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return g0.p(bVarK1, (gg.s) obj);
                    }
                }).y(new InterfaceC6464a() { // from class: K6.Y
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        this.f10330a.q(bVarK1, c3420h, bluetoothGattCharacteristic, c10);
                    }
                }).m0(this.f10359e.k()).x0(1).l1();
                this.f10361g.put(c3420h, new C3413a(sVarL1, z10));
                return sVarL1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gg.f s(G6.C c10, BluetoothGattCharacteristic bluetoothGattCharacteristic, C3149w c3149w, byte[] bArr, AbstractC5912b abstractC5912b) {
        return c10 == G6.C.COMPAT ? abstractC5912b : abstractC5912b.g(z(bluetoothGattCharacteristic, c3149w, bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gg.f t(BluetoothGattCharacteristic bluetoothGattCharacteristic, Throwable th2) {
        return AbstractC5912b.D(new BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 3, th2));
    }

    static gg.s u(l0 l0Var, final C3420h c3420h) {
        return l0Var.b().N(new kg.p() { // from class: K6.b0
            @Override // kg.p
            public final boolean test(Object obj) {
                return g0.k(c3420h, (C3419g) obj);
            }
        }).i0(new kg.n() { // from class: K6.c0
            @Override // kg.n
            public final Object apply(Object obj) {
                return ((C3419g) obj).f18074a;
            }
        });
    }

    static AbstractC5912b v(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final boolean z10) {
        return AbstractC5912b.E(new InterfaceC6464a() { // from class: K6.Z
            @Override // kg.InterfaceC6464a
            public final void run() {
                g0.m(bluetoothGatt, bluetoothGattCharacteristic, z10);
            }
        });
    }

    static gg.w w(final C3149w c3149w, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final G6.C c10) {
        return new gg.w() { // from class: K6.d0
            @Override // gg.w
            public final gg.v b(gg.s sVar) {
                return g0.o(c10, bluetoothGattCharacteristic, c3149w, bArr, sVar);
            }
        };
    }

    static gg.g y(final C3149w c3149w, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final G6.C c10) {
        return new gg.g() { // from class: K6.a0
            @Override // gg.g
            public final gg.f a(AbstractC5912b abstractC5912b) {
                return g0.s(c10, bluetoothGattCharacteristic, c3149w, bArr, abstractC5912b);
            }
        };
    }

    static AbstractC5912b z(final BluetoothGattCharacteristic bluetoothGattCharacteristic, C3149w c3149w, byte[] bArr) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(f10354h);
        return descriptor == null ? AbstractC5912b.D(new BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 2, null)) : c3149w.a(descriptor, bArr).O(new kg.n() { // from class: K6.e0
            @Override // kg.n
            public final Object apply(Object obj) {
                return g0.t(bluetoothGattCharacteristic, (Throwable) obj);
            }
        });
    }

    gg.s x(final BluetoothGattCharacteristic bluetoothGattCharacteristic, final G6.C c10, final boolean z10) {
        return gg.s.r(new kg.q() { // from class: K6.W
            @Override // kg.q
            public final Object get() {
                return this.f10325a.r(bluetoothGattCharacteristic, z10, c10);
            }
        });
    }
}
