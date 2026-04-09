package V8;

import G6.N;
import V8.b;
import Yg.J;
import a9.AbstractC3776d;
import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.ui.btle.rxandroidble.BTLEv2RxAndroidBle;
import com.ui.btle.v2.BTLEv2$Error;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import hg.InterfaceC6043c;
import k9.AbstractC6410e;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class b extends AbstractC3776d {

    /* renamed from: a, reason: collision with root package name */
    private final N f23124a;

    /* renamed from: b, reason: collision with root package name */
    private final BluetoothGattCharacteristic f23125b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23126c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23127d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23128e;

    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23129a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f23130b;

        public a(int i10, b bVar) {
            this.f23129a = i10;
            this.f23130b = bVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                boolean z10 = false;
                if (this.f23129a > this.f23130b.f23128e) {
                    int i10 = 512;
                    if (!this.f23130b.f23126c || this.f23129a > 512) {
                        if (!this.f23130b.f23127d) {
                            int i11 = this.f23129a;
                            if (!this.f23130b.f23126c) {
                                i10 = this.f23130b.f23128e;
                            }
                            throw new BTLEv2$Error.Protocol.InvalidPacketContent("Packet payload is too long to be sent. Payload has " + i11 + " bytes but since the writePacketFragmentation is disabled the maximal possible length is " + i10);
                        }
                        z10 = true;
                    }
                }
                interfaceC5910A.onSuccess(Boolean.valueOf(z10));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: V8.b$b, reason: collision with other inner class name */
    static final class C0853b implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f23132b;

        /* renamed from: V8.b$b$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f23133a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BluetoothGattCharacteristic f23134b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f23135c;

            /* renamed from: V8.b$b$a$a, reason: collision with other inner class name */
            static final class C0854a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f23136a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ BluetoothGattCharacteristic f23137b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ byte[] f23138c;

                /* renamed from: V8.b$b$a$a$a, reason: collision with other inner class name */
                static final class C0855a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BluetoothGattCharacteristic f23139a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ byte[] f23140b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0855a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                        super(0);
                        this.f23139a = bluetoothGattCharacteristic;
                        this.f23140b = bArr;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "FRAME WRITE (LONG) [" + this.f23139a.getService().getUuid() + "] -> [" + this.f23139a.getUuid() + "] " + this.f23140b.length + " bytes - Subscribed";
                    }
                }

                C0854a(b bVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                    this.f23136a = bVar;
                    this.f23137b = bluetoothGattCharacteristic;
                    this.f23138c = bArr;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(InterfaceC6043c it) {
                    AbstractC6492s.i(it, "it");
                    this.f23136a.k(new C0855a(this.f23137b, this.f23138c));
                }
            }

            /* renamed from: V8.b$b$a$b, reason: collision with other inner class name */
            static final class C0856b extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ BluetoothGattCharacteristic f23141a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ byte[] f23142b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0856b(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                    super(0);
                    this.f23141a = bluetoothGattCharacteristic;
                    this.f23142b = bArr;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FRAME WRITE (LONG) [" + this.f23141a.getService().getUuid() + "] -> [" + this.f23141a.getUuid() + "] Wrote: " + this.f23142b.length + " bytes - Success";
                }
            }

            /* renamed from: V8.b$b$a$c */
            static final class c implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ b f23143a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ BluetoothGattCharacteristic f23144b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ byte[] f23145c;

                /* renamed from: V8.b$b$a$c$a, reason: collision with other inner class name */
                static final class C0857a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ BluetoothGattCharacteristic f23146a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ byte[] f23147b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0857a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                        super(0);
                        this.f23146a = bluetoothGattCharacteristic;
                        this.f23147b = bArr;
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "FRAME WRITE (REGULAR) [" + this.f23146a.getService().getUuid() + "] -> [" + this.f23146a.getUuid() + "] " + this.f23147b.length + " bytes - Subscribed";
                    }
                }

                c(b bVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                    this.f23143a = bVar;
                    this.f23144b = bluetoothGattCharacteristic;
                    this.f23145c = bArr;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(InterfaceC6043c it) {
                    AbstractC6492s.i(it, "it");
                    this.f23143a.k(new C0857a(this.f23144b, this.f23145c));
                }
            }

            /* renamed from: V8.b$b$a$d */
            static final class d extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ BluetoothGattCharacteristic f23148a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ byte[] f23149b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                    super(0);
                    this.f23148a = bluetoothGattCharacteristic;
                    this.f23149b = bArr;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "FRAME WRITE (REGULAR) [" + this.f23148a.getService().getUuid() + "] -> [" + this.f23148a.getUuid() + "] Wrote " + this.f23149b.length + " bytes - Success";
                }
            }

            a(b bVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                this.f23133a = bVar;
                this.f23134b = bluetoothGattCharacteristic;
                this.f23135c = bArr;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(b this$0, BluetoothGattCharacteristic characteristic, byte[] frame) {
                AbstractC6492s.i(this$0, "this$0");
                AbstractC6492s.i(characteristic, "$characteristic");
                AbstractC6492s.i(frame, "$frame");
                this$0.k(new C0856b(characteristic, frame));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(b this$0, BluetoothGattCharacteristic characteristic, byte[] frame) {
                AbstractC6492s.i(this$0, "this$0");
                AbstractC6492s.i(characteristic, "$characteristic");
                AbstractC6492s.i(frame, "$frame");
                this$0.k(new d(characteristic, frame));
            }

            @Override // kg.n
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return c(((Boolean) obj).booleanValue());
            }

            public final gg.f c(boolean z10) {
                if (z10) {
                    AbstractC5912b abstractC5912bB = this.f23133a.f23124a.c().b(this.f23133a.f23128e).c(this.f23134b).d(this.f23135c).a().f0().B(new C0854a(this.f23133a, this.f23134b, this.f23135c));
                    final b bVar = this.f23133a;
                    final BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f23134b;
                    final byte[] bArr = this.f23135c;
                    return abstractC5912bB.x(new InterfaceC6464a() { // from class: V8.c
                        @Override // kg.InterfaceC6464a
                        public final void run() {
                            b.C0853b.a.d(bVar, bluetoothGattCharacteristic, bArr);
                        }
                    });
                }
                AbstractC5912b abstractC5912bB2 = this.f23133a.f23124a.f(this.f23134b, this.f23135c).y().B(new c(this.f23133a, this.f23134b, this.f23135c));
                final b bVar2 = this.f23133a;
                final BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.f23134b;
                final byte[] bArr2 = this.f23135c;
                return abstractC5912bB2.x(new InterfaceC6464a() { // from class: V8.d
                    @Override // kg.InterfaceC6464a
                    public final void run() {
                        b.C0853b.a.e(bVar2, bluetoothGattCharacteristic2, bArr2);
                    }
                });
            }
        }

        C0853b(byte[] bArr) {
            this.f23132b = bArr;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(BluetoothGattCharacteristic characteristic) {
            AbstractC6492s.i(characteristic, "characteristic");
            return b.this.j(this.f23132b.length).t(new a(b.this, characteristic, this.f23132b));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f23150a;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f23151a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f23152b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(byte[] bArr, long j10) {
                super(0);
                this.f23151a = bArr;
                this.f23152b = j10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FRAME WRITE of " + this.f23151a.length + " took " + this.f23152b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(byte[] bArr) {
            super(1);
            this.f23150a = bArr;
        }

        public final void a(long j10) {
            X8.a.c(new a(this.f23150a, j10));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return J.f24997a;
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f23153a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof BleException ? AbstractC5912b.D(new BTLEv2RxAndroidBle.Error("BTLE frame write ended with an error", error)) : AbstractC5912b.D(error);
        }
    }

    public static final class e implements C {
        public e() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(b.this.f23125b);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public b(N connection, BluetoothGattCharacteristic characteristic, boolean z10, boolean z11) {
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(characteristic, "characteristic");
        this.f23124a = connection;
        this.f23125b = characteristic;
        this.f23126c = z10;
        this.f23127d = z11;
        characteristic.setWriteType(2);
        this.f23128e = Math.min(connection.a() - 3, 512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z j(int i10) {
        z zVarI = z.i(new a(i10, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(InterfaceC6824a interfaceC6824a) {
        if (com.ui.btle.rxandroidble.a.f41105a.b()) {
            X8.a.c(interfaceC6824a);
        }
    }

    @Override // a9.AbstractC3776d
    protected AbstractC5912b b(byte[] frame) {
        AbstractC6492s.i(frame, "frame");
        z zVarI = z.i(new e());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bT = zVarI.t(new C0853b(frame));
        AbstractC6492s.h(abstractC5912bT, "override fun processOutg…          }\n            }");
        AbstractC5912b abstractC5912bO = AbstractC6410e.e(abstractC5912bT, new c(frame)).O(d.f23153a);
        AbstractC6492s.h(abstractC5912bO, "override fun processOutg…          }\n            }");
        return abstractC5912bO;
    }
}
