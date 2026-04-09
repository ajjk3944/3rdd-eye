package com.ui.wifiman.model.bluetooth.le;

import P7.c;
import Yg.J;
import Zg.AbstractC3689v;
import Zg.U;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.ui.wifiman.model.bluetooth.le.BleCommonCharacteristicsReader;
import com.ui.wifiman.model.bluetooth.le.d;
import com.ui.wifiman.model.bluetooth.le.i;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.C;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.s;
import gg.t;
import gg.u;
import gg.z;
import h9.C5969a;
import hg.InterfaceC6043c;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.InterfaceC6464a;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class d implements BleCommonCharacteristicsReader {

    /* renamed from: f, reason: collision with root package name */
    public static final b f42525f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f42526a;

    /* renamed from: b, reason: collision with root package name */
    private final BluetoothManager f42527b;

    /* renamed from: c, reason: collision with root package name */
    private final P7.a f42528c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f42529d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5912b f42530e;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final i.a f42531a;

        /* renamed from: b, reason: collision with root package name */
        private final BluetoothGattCharacteristic f42532b;

        public a(i.a id2, BluetoothGattCharacteristic characteristics) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(characteristics, "characteristics");
            this.f42531a = id2;
            this.f42532b = characteristics;
        }

        public final BluetoothGattCharacteristic a() {
            return this.f42532b;
        }

        public final i.a b() {
            return this.f42531a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42531a == aVar.f42531a && AbstractC6492s.d(this.f42532b, aVar.f42532b);
        }

        public int hashCode() {
            return (this.f42531a.hashCode() * 31) + this.f42532b.hashCode();
        }

        public String toString() {
            return "CharReadRequest(id=" + this.f42531a + ", characteristics=" + this.f42532b + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static abstract class c {

        public static abstract class a extends c {

            /* renamed from: com.ui.wifiman.model.bluetooth.le.d$c$a$a, reason: collision with other inner class name */
            public static final class C1390a extends a {

                /* renamed from: a, reason: collision with root package name */
                private final BluetoothGattCharacteristic f42533a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1390a(BluetoothGattCharacteristic characteristics) {
                    super(null);
                    AbstractC6492s.i(characteristics, "characteristics");
                    this.f42533a = characteristics;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1390a) && AbstractC6492s.d(this.f42533a, ((C1390a) obj).f42533a);
                }

                public int hashCode() {
                    return this.f42533a.hashCode();
                }

                public String toString() {
                    return "Failed(characteristics=" + this.f42533a + ")";
                }
            }

            public static final class b extends a {

                /* renamed from: a, reason: collision with root package name */
                private final BluetoothGattCharacteristic f42534a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(BluetoothGattCharacteristic characteristics) {
                    super(null);
                    AbstractC6492s.i(characteristics, "characteristics");
                    this.f42534a = characteristics;
                }

                public BluetoothGattCharacteristic a() {
                    return this.f42534a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && AbstractC6492s.d(this.f42534a, ((b) obj).f42534a);
                }

                public int hashCode() {
                    return this.f42534a.hashCode();
                }

                public String toString() {
                    return "Success(characteristics=" + this.f42534a + ")";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final BluetoothGatt f42535a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BluetoothGatt gatt) {
                super(null);
                AbstractC6492s.i(gatt, "gatt");
                this.f42535a = gatt;
            }

            public final BluetoothGatt a() {
                return this.f42535a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f42535a, ((b) obj).f42535a);
            }

            public int hashCode() {
                return this.f42535a.hashCode();
            }

            public String toString() {
                return "Connected(gatt=" + this.f42535a + ")";
            }
        }

        /* renamed from: com.ui.wifiman.model.bluetooth.le.d$c$c, reason: collision with other inner class name */
        public static final class C1391c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C1391c f42536a = new C1391c();

            private C1391c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1391c);
            }

            public int hashCode() {
                return 921138675;
            }

            public String toString() {
                return "ServicesDiscovered";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: com.ui.wifiman.model.bluetooth.le.d$d, reason: collision with other inner class name */
    static final class C1392d implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f42537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f42538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f42539c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f42540d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f42541e;

        C1392d(N n10, N n11, d dVar, N n12, Set set) {
            this.f42537a = n10;
            this.f42538b = n11;
            this.f42539c = dVar;
            this.f42540d = n12;
            this.f42541e = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(a aVar) {
            return aVar.b().name();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set apply(c event) {
            AbstractC6492s.i(event, "event");
            if (event instanceof c.b) {
                this.f42537a.f51689a = ((c.b) event).a();
            } else if (event instanceof c.C1391c) {
                N n10 = this.f42538b;
                d dVar = this.f42539c;
                Object obj = this.f42537a.f51689a;
                AbstractC6492s.f(obj);
                n10.f51689a = dVar.o((BluetoothGatt) obj);
                Object obj2 = this.f42538b.f51689a;
                AbstractC6492s.f(obj2);
                Z7.b.h("Characteristic read QUEUE initiated " + AbstractC3689v.z0((Iterable) obj2, ", ", null, null, 0, null, new InterfaceC6835l() { // from class: com.ui.wifiman.model.bluetooth.le.e
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj3) {
                        return d.C1392d.c((d.a) obj3);
                    }
                }, 30, null), null, 2, null);
            } else if (event instanceof c.a.b) {
                Object obj3 = this.f42540d.f51689a;
                if (obj3 == null) {
                    throw new IllegalStateException("no characteristic read requested");
                }
                AbstractC6492s.f(obj3);
                Z7.b.h("Characteristic read SUCCESS " + ((a) obj3).b(), null, 2, null);
                d dVar2 = this.f42539c;
                BluetoothGattCharacteristic bluetoothGattCharacteristicA = ((c.a.b) event).a();
                Object obj4 = this.f42540d.f51689a;
                AbstractC6492s.f(obj4);
                Object objA = dVar2.A(bluetoothGattCharacteristicA, ((a) obj4).b());
                if (objA != null) {
                    Set set = this.f42541e;
                    Object obj5 = this.f42540d.f51689a;
                    AbstractC6492s.f(obj5);
                    set.add(new BleCommonCharacteristicsReader.a(((a) obj5).b(), objA));
                } else {
                    Z7.b.e("Failed to read characteristic", null, null, 6, null);
                }
                this.f42540d.f51689a = null;
            } else {
                if (!(event instanceof c.a.C1390a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj6 = this.f42540d.f51689a;
                AbstractC6492s.f(obj6);
                Z7.b.h("FAILED to read characteristic " + ((a) obj6).b(), null, 2, null);
                this.f42540d.f51689a = null;
            }
            d.r(this.f42537a, this.f42538b, this.f42540d);
            return this.f42541e;
        }
    }

    public static final class e extends BluetoothGattCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothDevice f42542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f42543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f42544c;

        e(BluetoothDevice bluetoothDevice, N n10, t tVar) {
            this.f42542a = bluetoothDevice;
            this.f42543b = n10;
            this.f42544c = tVar;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int i10) {
            AbstractC6492s.i(gatt, "gatt");
            AbstractC6492s.i(characteristic, "characteristic");
            super.onCharacteristicRead(gatt, characteristic, i10);
            t tVar = this.f42544c;
            if (i10 == 0) {
                Z7.b.h("Read characteristic " + characteristic.getUuid() + "}", null, 2, null);
                tVar.h(new c.a.b(characteristic));
                return;
            }
            Z7.b.h("Characteristic read failed for " + characteristic.getUuid() + ", error: " + i10, null, 2, null);
            tVar.h(new c.a.C1390a(characteristic));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt gatt, int i10, int i11) {
            AbstractC6492s.i(gatt, "gatt");
            super.onConnectionStateChange(gatt, i10, i11);
            if (i10 != 0) {
                Z7.b.h("Error " + i10 + " encountered for " + this.f42542a.getAddress() + "! Disconnecting...", null, 2, null);
                this.f42544c.c(new BleCommonCharacteristicsReader.Error.ConnectionFailed());
                return;
            }
            if (i11 == 0) {
                Z7.b.h("Successfully disconnected from " + this.f42542a.getAddress(), null, 2, null);
                this.f42544c.a();
                return;
            }
            if (i11 != 2) {
                return;
            }
            Z7.b.h("Successfully connected to " + this.f42542a.getAddress(), null, 2, null);
            this.f42543b.f51689a = gatt;
            this.f42544c.h(new c.b(gatt));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            super.onServicesDiscovered(bluetoothGatt, i10);
            if (i10 == 0) {
                this.f42544c.h(c.C1391c.f42536a);
            } else {
                this.f42544c.c(new BleCommonCharacteristicsReader.Error.ServicesFetchFailed());
            }
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothDevice f42545a;

        f(BluetoothDevice bluetoothDevice) {
            this.f42545a = bluetoothDevice;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Gatt stream for " + this.f42545a.getAddress() + " scubscribed", null, 2, null);
        }
    }

    static final class g implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothDevice f42546a;

        g(BluetoothDevice bluetoothDevice) {
            this.f42546a = bluetoothDevice;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            Z7.b.j("Gatt stream for " + this.f42546a.getAddress() + " ended with error", error, null, 4, null);
        }
    }

    public static final class h implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5969a f42548b;

        public h(C5969a c5969a) {
            this.f42548b = c5969a;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(d.this.f42527b.getAdapter().getRemoteDevice(this.f42548b.g()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class i implements n {
        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(BluetoothDevice bluetoothDevice) {
            d dVar = d.this;
            AbstractC6492s.f(bluetoothDevice);
            return dVar.q(dVar.v(bluetoothDevice));
        }
    }

    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f42550a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TimeoutException ? gg.i.k0(new BleCommonCharacteristicsReader.Error.ConnectionTimedOut(5000L)) : gg.i.k0(error);
        }
    }

    static final class k implements InterfaceC6469f {
        k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            d.this.f42528c.b(new c.C0634c());
        }
    }

    public d(Context applicationContext, BluetoothManager bluetoothManager, P7.a analytics) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(bluetoothManager, "bluetoothManager");
        AbstractC6492s.i(analytics, "analytics");
        this.f42526a = applicationContext;
        this.f42527b = bluetoothManager;
        this.f42528c = analytics;
        this.f42529d = new AtomicBoolean(false);
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new InterfaceC5915e() { // from class: yc.a
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                com.ui.wifiman.model.bluetooth.le.d.t(this.f66660a, interfaceC5913c);
            }
        });
        AbstractC6492s.h(abstractC5912bR, "create(...)");
        this.f42530e = abstractC5912bR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(d dVar) {
        dVar.f42528c.b(new c.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Queue o(BluetoothGatt bluetoothGatt) {
        InterfaceC5826a entries = i.a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(com.ui.wifiman.model.bluetooth.le.i.f42575a.b((i.a) obj), obj);
        }
        LinkedList linkedList = new LinkedList();
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        AbstractC6492s.h(services, "getServices(...)");
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            List<BluetoothGattCharacteristic> characteristics = ((BluetoothGattService) it.next()).getCharacteristics();
            AbstractC6492s.h(characteristics, "getCharacteristics(...)");
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                AbstractC6492s.f(bluetoothGattCharacteristic);
                if (s(bluetoothGattCharacteristic)) {
                    P7.a aVar = this.f42528c;
                    String string = bluetoothGattCharacteristic.getUuid().toString();
                    AbstractC6492s.h(string, "toString(...)");
                    aVar.b(new c.d(string));
                    i.a aVar2 = (i.a) linkedHashMap.get(bluetoothGattCharacteristic.getUuid());
                    if (aVar2 != null) {
                        linkedList.add(new a(aVar2, bluetoothGattCharacteristic));
                    }
                }
            }
        }
        return linkedList;
    }

    private final boolean p(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        return (bluetoothGattCharacteristic.getProperties() & i10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i q(s sVar) {
        gg.i iVarD1 = sVar.i0(new C1392d(new N(), new N(), this, new N(), new LinkedHashSet())).d1(EnumC5911a.LATEST);
        AbstractC6492s.h(iVarD1, "toFlowable(...)");
        return iVarD1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(N n10, N n11, N n12) {
        if (n10.f51689a == null) {
            throw new IllegalStateException("ble gat not initialized");
        }
        Object obj = n11.f51689a;
        if (obj == null) {
            Z7.b.h("Requesting service discovery", null, 2, null);
            Object obj2 = n10.f51689a;
            AbstractC6492s.f(obj2);
            if (!((BluetoothGatt) obj2).discoverServices()) {
                throw new IllegalStateException("failed to start service discovery");
            }
            return;
        }
        AbstractC6492s.f(obj);
        if (((Collection) obj).isEmpty()) {
            Object obj3 = n10.f51689a;
            AbstractC6492s.f(obj3);
            ((BluetoothGatt) obj3).disconnect();
            return;
        }
        Object obj4 = n11.f51689a;
        AbstractC6492s.f(obj4);
        Object objPoll = ((Queue) obj4).poll();
        n12.f51689a = objPoll;
        if (objPoll == null) {
            Object obj5 = n10.f51689a;
            AbstractC6492s.f(obj5);
            ((BluetoothGatt) obj5).disconnect();
            return;
        }
        AbstractC6492s.f(objPoll);
        Z7.b.h("Requesting characteristics fetch " + ((a) objPoll).b(), null, 2, null);
        Object obj6 = n10.f51689a;
        AbstractC6492s.f(obj6);
        Object obj7 = n12.f51689a;
        AbstractC6492s.f(obj7);
        ((BluetoothGatt) obj6).readCharacteristic(((a) obj7).a());
    }

    private final boolean s(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return p(bluetoothGattCharacteristic, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final d dVar, InterfaceC5913c emitter) {
        AbstractC6492s.i(emitter, "emitter");
        synchronized (dVar.f42529d) {
            try {
                if (dVar.f42529d.get()) {
                    emitter.c(new BleCommonCharacteristicsReader.Error.SimultaneousConnection());
                }
                dVar.f42529d.set(true);
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        emitter.d(new InterfaceC6468e() { // from class: yc.f
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                com.ui.wifiman.model.bluetooth.le.d.u(this.f66666a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(d dVar) {
        synchronized (dVar.f42529d) {
            dVar.f42529d.set(false);
            J j10 = J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s v(final BluetoothDevice bluetoothDevice) {
        s sVarA = s.o(new u() { // from class: yc.c
            @Override // gg.u
            public final void a(t tVar) {
                com.ui.wifiman.model.bluetooth.le.d.w(bluetoothDevice, this, tVar);
            }
        }).G(new f(bluetoothDevice)).D(new g(bluetoothDevice)).z(new InterfaceC6464a() { // from class: yc.d
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.bluetooth.le.d.y(bluetoothDevice);
            }
        }).A(new InterfaceC6464a() { // from class: yc.e
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.bluetooth.le.d.z(bluetoothDevice);
            }
        });
        AbstractC6492s.h(sVarA, "doOnDispose(...)");
        return sVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(BluetoothDevice bluetoothDevice, d dVar, t emitter) {
        AbstractC6492s.i(emitter, "emitter");
        final N n10 = new N();
        e eVar = new e(bluetoothDevice, n10, emitter);
        emitter.d(new InterfaceC6468e() { // from class: yc.g
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                com.ui.wifiman.model.bluetooth.le.d.x(n10);
            }
        });
        BluetoothGatt bluetoothGattConnectGatt = bluetoothDevice.connectGatt(dVar.f42526a, false, eVar, 2);
        n10.f51689a = bluetoothGattConnectGatt;
        if (bluetoothGattConnectGatt == null || bluetoothGattConnectGatt == null || !bluetoothGattConnectGatt.connect()) {
            emitter.c(new BleCommonCharacteristicsReader.Error.AndroidRefusedToConnect());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(N n10) {
        BluetoothGatt bluetoothGatt = (BluetoothGatt) n10.f51689a;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(BluetoothDevice bluetoothDevice) {
        Z7.b.h("Gatt stream for " + bluetoothDevice.getAddress() + " completed", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(BluetoothDevice bluetoothDevice) {
        Z7.b.h("Gatt stream for " + bluetoothDevice.getAddress() + " disposed", null, 2, null);
    }

    public final Object A(BluetoothGattCharacteristic bluetoothGattCharacteristic, i.a aVar) {
        AbstractC6492s.i(bluetoothGattCharacteristic, "<this>");
        AbstractC6492s.i(aVar, "char");
        Integer dataFormat = aVar.getDataFormat();
        return ((dataFormat != null && dataFormat.intValue() == 52) || (dataFormat != null && dataFormat.intValue() == 50)) ? bluetoothGattCharacteristic.getFloatValue(aVar.getDataFormat().intValue(), 0) : ((dataFormat != null && dataFormat.intValue() == 34) || (dataFormat != null && dataFormat.intValue() == 36) || ((dataFormat != null && dataFormat.intValue() == 33) || ((dataFormat != null && dataFormat.intValue() == 18) || ((dataFormat != null && dataFormat.intValue() == 20) || (dataFormat != null && dataFormat.intValue() == 17))))) ? bluetoothGattCharacteristic.getIntValue(aVar.getDataFormat().intValue(), 0) : bluetoothGattCharacteristic.getStringValue(0);
    }

    @Override // com.ui.wifiman.model.bluetooth.le.BleCommonCharacteristicsReader
    public gg.i a(C5969a mac) {
        AbstractC6492s.i(mac, "mac");
        AbstractC5912b abstractC5912b = this.f42530e;
        z zVarI = z.i(new h(mac));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarX0 = abstractC5912b.k(zVarI).w(new i()).Z1(5000L, TimeUnit.MILLISECONDS).f1(j.f42550a).g0(new k()).a0(new InterfaceC6464a() { // from class: yc.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.bluetooth.le.d.B(this.f66661a);
            }
        }).X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        return iVarX0;
    }
}
