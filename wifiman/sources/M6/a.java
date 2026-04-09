package M6;

import G6.N;
import K6.i0;
import K6.l0;
import P6.C3417e;
import P6.F;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.DeadObjectException;
import com.polidea.rxandroidble3.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.polidea.rxandroidble3.exceptions.BleGattCallbackTimeoutException;
import com.polidea.rxandroidble3.exceptions.BleGattCannotStartException;
import com.polidea.rxandroidble3.exceptions.BleGattCharacteristicException;
import com.polidea.rxandroidble3.exceptions.BleGattException;
import gg.y;
import hg.InterfaceC6043c;
import java.nio.ByteBuffer;
import java.util.UUID;
import kg.InterfaceC6469f;

/* loaded from: classes3.dex */
public class a extends I6.j {

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothGatt f12633a;

    /* renamed from: b, reason: collision with root package name */
    private final l0 f12634b;

    /* renamed from: c, reason: collision with root package name */
    private final y f12635c;

    /* renamed from: d, reason: collision with root package name */
    private final x f12636d;

    /* renamed from: e, reason: collision with root package name */
    private final BluetoothGattCharacteristic f12637e;

    /* renamed from: f, reason: collision with root package name */
    private final i0 f12638f;

    /* renamed from: g, reason: collision with root package name */
    private final N.c f12639g;

    /* renamed from: h, reason: collision with root package name */
    private final N.d f12640h;

    /* renamed from: i, reason: collision with root package name */
    final byte[] f12641i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f12642j;

    /* renamed from: M6.a$a, reason: collision with other inner class name */
    class C0496a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f12643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12644b;

        C0496a(ByteBuffer byteBuffer, int i10) {
            this.f12643a = byteBuffer;
            this.f12644b = i10;
        }

        @Override // M6.a.g
        public int get() {
            return ((int) Math.ceil(this.f12643a.position() / this.f12644b)) - 1;
        }
    }

    class b implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F f12646a;

        b(F f10) {
            this.f12646a = f10;
        }

        @Override // gg.x
        public void a() {
            this.f12646a.h(a.this.f12641i);
            this.f12646a.a();
        }

        @Override // gg.x
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void h(C3417e c3417e) {
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f12646a.onError(th2);
        }
    }

    class c implements gg.u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.s f12648a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f12649b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12650c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f12651d;

        c(gg.s sVar, ByteBuffer byteBuffer, int i10, g gVar) {
            this.f12648a = sVar;
            this.f12649b = byteBuffer;
            this.f12650c = i10;
            this.f12651d = gVar;
        }

        @Override // gg.u
        public void a(gg.t tVar) {
            tVar.g((Cg.a) this.f12648a.N0(P6.u.a(tVar)));
            try {
                a.this.l(a.this.h(this.f12649b, this.f12650c), this.f12651d);
            } catch (Throwable th2) {
                tVar.onError(th2);
            }
        }
    }

    class d implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothGattCharacteristic f12653a;

        d(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            this.f12653a = bluetoothGattCharacteristic;
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(C3417e c3417e) {
            return ((UUID) c3417e.f18070a).equals(this.f12653a.getUuid());
        }
    }

    class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F f12654a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f12655b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N.c f12656c;

        /* renamed from: M6.a$e$a, reason: collision with other inner class name */
        class C0497a implements kg.p {
            C0497a() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(Boolean bool) {
                return bool.booleanValue();
            }
        }

        class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f12658a;

            b(ByteBuffer byteBuffer) {
                this.f12658a = byteBuffer;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean apply(Object obj) {
                return Boolean.valueOf(this.f12658a.hasRemaining());
            }
        }

        class c implements kg.p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F f12660a;

            c(F f10) {
                this.f12660a = f10;
            }

            @Override // kg.p
            public boolean test(Object obj) {
                return !this.f12660a.b();
            }
        }

        e(F f10, ByteBuffer byteBuffer, N.c cVar) {
            this.f12654a = f10;
            this.f12655b = byteBuffer;
            this.f12656c = cVar;
        }

        private kg.n b(ByteBuffer byteBuffer) {
            return new b(byteBuffer);
        }

        private kg.p c(F f10) {
            return new c(f10);
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.v apply(gg.s sVar) {
            return sVar.V0(c(this.f12654a)).i0(b(this.f12655b)).g(this.f12656c).V0(new C0497a());
        }
    }

    class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N.d f12662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f12663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12664c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f12665d;

        /* renamed from: M6.a$f$a, reason: collision with other inner class name */
        class C0498a implements kg.n {
            C0498a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public gg.s apply(Throwable th2) {
                return ((th2 instanceof BleGattCharacteristicException) || (th2 instanceof BleGattCannotStartException)) ? gg.s.h0(new N.d.a(f.this.f12663b.get(), (BleGattException) th2)) : gg.s.L(th2);
            }
        }

        class b implements InterfaceC6469f {
            b() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(N.d.a aVar) {
                int iA = aVar.a();
                f fVar = f.this;
                fVar.f12665d.position(iA * fVar.f12664c);
            }
        }

        f(N.d dVar, g gVar, int i10, ByteBuffer byteBuffer) {
            this.f12662a = dVar;
            this.f12663b = gVar;
            this.f12664c = i10;
            this.f12665d = byteBuffer;
        }

        private InterfaceC6469f b() {
            return new b();
        }

        private kg.n c() {
            return new C0498a();
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.v apply(gg.s sVar) {
            return sVar.Q(c()).F(b()).g(this.f12662a);
        }
    }

    interface g {
        int get();
    }

    a(BluetoothGatt bluetoothGatt, l0 l0Var, y yVar, x xVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, i0 i0Var, N.c cVar, N.d dVar, byte[] bArr) {
        this.f12633a = bluetoothGatt;
        this.f12634b = l0Var;
        this.f12635c = yVar;
        this.f12636d = xVar;
        this.f12637e = bluetoothGattCharacteristic;
        this.f12638f = i0Var;
        this.f12639g = cVar;
        this.f12640h = dVar;
        this.f12641i = bArr;
    }

    static kg.n d(N.c cVar, ByteBuffer byteBuffer, F f10) {
        return new e(f10, byteBuffer, cVar);
    }

    private static kg.n g(N.d dVar, ByteBuffer byteBuffer, int i10, g gVar) {
        return new f(dVar, gVar, i10, byteBuffer);
    }

    private gg.s j(int i10, ByteBuffer byteBuffer, g gVar) {
        return gg.s.o(new c(this.f12634b.c(), byteBuffer, i10, gVar));
    }

    private static kg.p n(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new d(bluetoothGattCharacteristic);
    }

    @Override // I6.j
    protected void b(gg.t tVar, O6.i iVar) {
        int iA = this.f12638f.a();
        if (iA <= 0) {
            throw new IllegalArgumentException("batchSizeProvider value must be greater than zero (now: " + iA + ")");
        }
        gg.s sVarL = gg.s.L(new BleGattCallbackTimeoutException(this.f12633a, H6.a.f7635f));
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f12641i);
        F f10 = new F(tVar, iVar);
        C0496a c0496a = new C0496a(byteBufferWrap, iA);
        gg.s sVarR0 = j(iA, byteBufferWrap, c0496a).M0(this.f12635c).N(n(this.f12637e)).R0(1L);
        x xVar = this.f12636d;
        sVarR0.X0(xVar.f12751a, xVar.f12752b, xVar.f12753c, sVarL).v0(d(this.f12639g, byteBufferWrap, f10)).A0(g(this.f12640h, byteBufferWrap, iA, c0496a)).d(new b(f10));
    }

    @Override // I6.j
    protected BleException c(DeadObjectException deadObjectException) {
        return new BleDisconnectedException(deadObjectException, this.f12633a.getDevice().getAddress(), -1);
    }

    byte[] h(ByteBuffer byteBuffer, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), i10);
        byte[] bArr = this.f12642j;
        if (bArr == null || bArr.length != iMin) {
            this.f12642j = new byte[iMin];
        }
        byteBuffer.get(this.f12642j);
        return this.f12642j;
    }

    void l(byte[] bArr, g gVar) {
        if (I6.q.l(3)) {
            I6.q.b("Writing batch #%04d: %s", Integer.valueOf(gVar.get()), L6.b.a(bArr));
        }
        this.f12637e.setValue(bArr);
        if (!this.f12633a.writeCharacteristic(this.f12637e)) {
            throw new BleGattCannotStartException(this.f12633a, H6.a.f7635f);
        }
    }

    public String toString() {
        return "CharacteristicLongWriteOperation{" + L6.b.c(this.f12633a) + ", characteristic=" + L6.b.u(this.f12637e, false) + ", maxBatchSize=" + this.f12638f.a() + '}';
    }
}
