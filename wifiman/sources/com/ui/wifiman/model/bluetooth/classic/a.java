package com.ui.wifiman.model.bluetooth.classic;

import Cc.AbstractC2558b;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.d0;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.ui.wifiman.model.bluetooth.classic.BluetoothScanner;
import com.ui.wifiman.model.vendor.d;
import fg.AbstractC5824b;
import gg.AbstractC5912b;
import gg.C;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.j;
import gg.r;
import h9.C5969a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import l9.C6556a;
import tc.InterfaceC8077a;
import wc.InterfaceC8324d;
import zc.AbstractC8727a;

/* loaded from: classes4.dex */
public final class a implements BluetoothScanner {

    /* renamed from: k, reason: collision with root package name */
    public static final C1382a f42440k = new C1382a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f42441a;

    /* renamed from: b, reason: collision with root package name */
    private final BluetoothManager f42442b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f42443c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5912b f42444d;

    /* renamed from: e, reason: collision with root package name */
    private final List f42445e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f42446f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f42447g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f42448h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f42449i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f42450j;

    /* renamed from: com.ui.wifiman.model.bluetooth.classic.a$a, reason: collision with other inner class name */
    public static final class C1382a {
        public /* synthetic */ C1382a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1382a() {
        }
    }

    static final class b implements kg.n {

        /* renamed from: com.ui.wifiman.model.bluetooth.classic.a$b$a, reason: collision with other inner class name */
        public static final class C1383a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f42452a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BluetoothDevice f42453b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Integer f42454c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ d.a f42455d;

            public C1383a(a aVar, BluetoothDevice bluetoothDevice, Integer num, d.a aVar2) {
                this.f42452a = aVar;
                this.f42453b = bluetoothDevice;
                this.f42454c = num;
                this.f42455d = aVar2;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    BluetoothScanner.a aVarQ = this.f42452a.q(this.f42453b, this.f42454c, false, this.f42455d);
                    if (aVarQ != null) {
                        oVar.onSuccess(aVarQ);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Intent intent = (Intent) sVar.a();
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            d.a aVar = (d.a) objC;
            BluetoothDevice bluetoothDevice = intent.hasExtra("android.bluetooth.device.extra.DEVICE") ? Build.VERSION.SDK_INT >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE") : null;
            if (bluetoothDevice != null) {
                gg.n nVarC = gg.n.c(new C1383a(a.this, bluetoothDevice, intent.hasExtra("android.bluetooth.device.extra.RSSI") ? Integer.valueOf(intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) -90)) : null, aVar));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
            gg.n nVarH = gg.n.h();
            AbstractC6492s.f(nVarH);
            return nVarH;
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42456a;

        c(int i10) {
            this.f42456a = i10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(C6556a it) {
            AbstractC6492s.i(it, "it");
            return z.a(Integer.valueOf(this.f42456a), it.b());
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f42457a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap accumulator, s sVar) {
            AbstractC6492s.i(accumulator, "accumulator");
            AbstractC6492s.i(sVar, "<destruct>");
            int iIntValue = ((Number) sVar.a()).intValue();
            BluetoothProfile bluetoothProfile = (BluetoothProfile) sVar.c();
            if (bluetoothProfile != null) {
                accumulator.put(Integer.valueOf(iIntValue), bluetoothProfile);
            } else {
                accumulator.remove(Integer.valueOf(iIntValue));
            }
            return accumulator;
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f42458a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(ConcurrentHashMap it) {
            AbstractC6492s.i(it, "it");
            Collection<BluetoothProfile> collectionValues = it.values();
            AbstractC6492s.h(collectionValues, "<get-values>(...)");
            ArrayList arrayList = new ArrayList();
            for (BluetoothProfile bluetoothProfile : collectionValues) {
                if (bluetoothProfile != null) {
                    arrayList.add(bluetoothProfile);
                }
            }
            return arrayList;
        }
    }

    static final class f implements kg.n {

        /* renamed from: com.ui.wifiman.model.bluetooth.classic.a$f$a, reason: collision with other inner class name */
        static final class C1384a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d.a f42460a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f42461b;

            /* renamed from: com.ui.wifiman.model.bluetooth.classic.a$f$a$a, reason: collision with other inner class name */
            static final class C1385a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1385a f42462a = new C1385a();

                C1385a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Dj.a apply(gg.i it) {
                    AbstractC6492s.i(it, "it");
                    return it.R(1000L, TimeUnit.MILLISECONDS);
                }
            }

            /* renamed from: com.ui.wifiman.model.bluetooth.classic.a$f$a$b */
            public static final class b implements C {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List f42463a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ d.a f42464b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f42465c;

                public b(List list, d.a aVar, a aVar2) {
                    this.f42463a = list;
                    this.f42464b = aVar;
                    this.f42465c = aVar2;
                }

                @Override // gg.C
                public final void a(InterfaceC5910A interfaceC5910A) {
                    try {
                        Set setB = d0.b();
                        AbstractC6492s.f(this.f42463a);
                        Iterator it = this.f42463a.iterator();
                        while (it.hasNext()) {
                            List<BluetoothDevice> connectedDevices = ((BluetoothProfile) it.next()).getConnectedDevices();
                            if (connectedDevices != null) {
                                for (BluetoothDevice bluetoothDevice : connectedDevices) {
                                    AbstractC6492s.f(bluetoothDevice);
                                    AbstractC6492s.f(this.f42464b);
                                    BluetoothScanner.a aVarQ = this.f42465c.q(bluetoothDevice, null, true, this.f42464b);
                                    if (aVarQ != null) {
                                        setB.add(aVarQ);
                                    }
                                }
                            }
                        }
                        interfaceC5910A.onSuccess(d0.a(setB));
                    } catch (Throwable th2) {
                        interfaceC5910A.onError(th2);
                    }
                }
            }

            C1384a(d.a aVar, a aVar2) {
                this.f42460a = aVar;
                this.f42461b = aVar2;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(List classicProxies) {
                AbstractC6492s.i(classicProxies, "classicProxies");
                gg.z zVarI = gg.z.i(new b(classicProxies, this.f42460a, this.f42461b));
                AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
                return zVarI.K(C1385a.f42462a);
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(d.a vendorDir) {
            AbstractC6492s.i(vendorDir, "vendorDir");
            return a.this.f42446f.I1(new C1384a(vendorDir, a.this));
        }
    }

    public static final class g implements BluetoothProfile.ServiceListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f42466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ gg.j f42467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f42468c;

        g(N n10, gg.j jVar, a aVar) {
            this.f42466a = n10;
            this.f42467b = jVar;
            this.f42468c = aVar;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile proxy) {
            AbstractC6492s.i(proxy, "proxy");
            Z7.b.h("Bluetooth proxy connected for profile " + i10, null, 2, null);
            this.f42466a.f51689a = proxy;
            this.f42467b.h(new C6556a(proxy));
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
            Z7.b.h("Bluetooth proxy lost for profile " + i10, null, 2, null);
            this.f42466a.f51689a = null;
            this.f42467b.h(new C6556a(null));
            Z7.b.h("Bluetooth proxy requested AGAIN for " + i10, null, 2, null);
            this.f42468c.f42442b.getAdapter().getProfileProxy(this.f42468c.f42441a, this, i10);
        }
    }

    static final class h implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42469a;

        h(int i10) {
            this.f42469a = i10;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Bluetooth proxy subscribed for " + this.f42469a, null, 2, null);
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f42470a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(60000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f42471a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.BLUETOOTH));
        }
    }

    static final class k implements kg.n {
        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean scanPermissionGranted) {
            AbstractC6492s.i(scanPermissionGranted, "scanPermissionGranted");
            if (scanPermissionGranted.booleanValue()) {
                return a.this.f42449i;
            }
            gg.i iVarK0 = gg.i.K0(AbstractC3689v.l());
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class l implements kg.n {

        /* renamed from: com.ui.wifiman.model.bluetooth.classic.a$l$a, reason: collision with other inner class name */
        static final class C1386a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1386a f42474a = new C1386a();

            C1386a() {
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List apply(Set connected, Set discovered) {
                AbstractC6492s.i(connected, "connected");
                AbstractC6492s.i(discovered, "discovered");
                List listC = AbstractC3689v.c();
                Iterator it = connected.iterator();
                while (it.hasNext()) {
                    listC.add((BluetoothScanner.a) it.next());
                }
                Iterator it2 = discovered.iterator();
                while (it2.hasNext()) {
                    listC.add((BluetoothScanner.a) it2.next());
                }
                return AbstractC3689v.a(listC);
            }
        }

        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC8324d.b receiverStatus) {
            AbstractC6492s.i(receiverStatus, "receiverStatus");
            return receiverStatus instanceof InterfaceC8324d.b.C2294b ? gg.i.k0(new BluetoothScanner.Error.BluetoothNotAvailableOnDevice()) : ((receiverStatus instanceof InterfaceC8324d.b.a) && ((InterfaceC8324d.b.a) receiverStatus).a() == InterfaceC8324d.a.STATE_ON) ? gg.i.v(a.this.f42447g, a.this.f42448h, C1386a.f42474a) : gg.i.K0(AbstractC3689v.l());
        }
    }

    static final class m implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final m f42475a = new m();

        m() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap accumulator, BluetoothScanner.a device) {
            AbstractC6492s.i(accumulator, "accumulator");
            AbstractC6492s.i(device, "device");
            accumulator.put(device.c(), device);
            Iterator it = accumulator.values().iterator();
            while (it.hasNext()) {
                BluetoothScanner.a aVar = (BluetoothScanner.a) it.next();
                if (aVar.b() < System.currentTimeMillis() - 90000) {
                    Z7.b.h("Removed Bluetooth Classic Device " + aVar.c().d("") + " because it reached cache timeout - 90000", null, 2, null);
                    it.remove();
                }
            }
            return accumulator;
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f42476a = new n();

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(ConcurrentHashMap it) {
            AbstractC6492s.i(it, "it");
            HashSet hashSet = new HashSet();
            Iterator it2 = it.entrySet().iterator();
            while (it2.hasNext()) {
                hashSet.add((BluetoothScanner.a) ((Map.Entry) it2.next()).getValue());
            }
            return hashSet;
        }
    }

    static final class o implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final o f42477a = new o();

        o() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Set it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Bluetooth CLASSIC scan cache emitted " + it.size() + " results", null, 2, null);
        }
    }

    public static final class p implements InterfaceC5915e {
        public p() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                BluetoothAdapter adapter = a.this.f42442b.getAdapter();
                if (adapter != null) {
                    adapter.startDiscovery();
                }
                Z7.b.h("Bluetooth Scanner discovery STARTED", null, 2, null);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class q implements InterfaceC5915e {
        public q() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                BluetoothAdapter adapter = a.this.f42442b.getAdapter();
                if (adapter != null && adapter.isDiscovering()) {
                    BluetoothAdapter adapter2 = a.this.f42442b.getAdapter();
                    if (adapter2 != null) {
                        adapter2.cancelDiscovery();
                    }
                    Z7.b.h("Bluetooth Scanner discovery STOPPED", null, 2, null);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public a(Context applicationContext, BluetoothManager bluetoothManager, InterfaceC8324d bluetoothReceiver, InterfaceC8077a androidSystemReceiverFactory, d.b macVendorManager, com.ui.wifiman.model.android.permissions.d permissionsService) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(bluetoothManager, "bluetoothManager");
        AbstractC6492s.i(bluetoothReceiver, "bluetoothReceiver");
        AbstractC6492s.i(androidSystemReceiverFactory, "androidSystemReceiverFactory");
        AbstractC6492s.i(macVendorManager, "macVendorManager");
        AbstractC6492s.i(permissionsService, "permissionsService");
        this.f42441a = applicationContext;
        this.f42442b = bluetoothManager;
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarA = androidSystemReceiverFactory.a(new IntentFilter("android.bluetooth.device.action.FOUND"));
        gg.i iVarW = macVendorManager.a().W();
        AbstractC6492s.h(iVarW, "toFlowable(...)");
        gg.i iVarV0 = cVar.a(iVarA, iVarW).v0(new b());
        AbstractC6492s.h(iVarV0, "flatMapMaybe(...)");
        this.f42443c = iVarV0;
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new p());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bA0 = AbstractC5912b.a0(10000L, TimeUnit.MILLISECONDS);
        AbstractC5912b abstractC5912bR2 = AbstractC5912b.r(new q());
        AbstractC6492s.h(abstractC5912bR2, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bF0 = AbstractC5912b.p(abstractC5912bR, abstractC5912bA0, abstractC5912bR2).P(i.f42470a).y(new InterfaceC6464a() { // from class: xc.a
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.bluetooth.classic.a.r(this.f65554a);
            }
        }).f0().r0().l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f42444d = abstractC5912bF0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            arrayList.add(19);
        }
        if (i10 >= 30) {
            arrayList.add(21);
        }
        this.f42445e = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList3.add(m(iIntValue).N0(new c(iIntValue)));
        }
        gg.i iVarN0 = Ag.b.a(arrayList3).g2(AbstractC5824b.g()).X0(Gg.a.a()).q1(new ConcurrentHashMap(), d.f42457a).N0(e.f42458a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f42446f = iVarN0;
        gg.i iVarI2 = macVendorManager.a().w(new f()).e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42447g = iVarI2;
        gg.i iVarU0 = this.f42443c.q1(new ConcurrentHashMap(), m.f42475a).z1(new ConcurrentHashMap()).U1(1000L, TimeUnit.MILLISECONDS).e1().Y0(Gg.a.a(), false, 1).N0(n.f42476a).W().f0(o.f42477a).U0(this.f42444d);
        AbstractC6492s.h(iVarU0, "mergeWith(...)");
        this.f42448h = iVarU0;
        gg.i iVarI1 = bluetoothReceiver.a().I1(new l());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f42449i = iVarI1;
        gg.i iVarI22 = permissionsService.b().N0(j.f42471a).W().I1(new k()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f42450j = iVarI22;
    }

    private final gg.i m(final int i10) {
        gg.i iVarZ = gg.i.N(new gg.k() { // from class: xc.b
            @Override // gg.k
            public final void a(j jVar) {
                com.ui.wifiman.model.bluetooth.classic.a.n(i10, this, jVar);
            }
        }, EnumC5911a.LATEST).g0(new h(i10)).Z(new InterfaceC6464a() { // from class: xc.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.bluetooth.classic.a.p(i10);
            }
        });
        AbstractC6492s.h(iVarZ, "doFinally(...)");
        return iVarZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final int i10, final a aVar, gg.j emitter) {
        AbstractC6492s.i(emitter, "emitter");
        final N n10 = new N();
        g gVar = new g(n10, emitter, aVar);
        emitter.d(new InterfaceC6468e() { // from class: xc.d
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                com.ui.wifiman.model.bluetooth.classic.a.o(n10, aVar, i10);
            }
        });
        Z7.b.h("Bluetooth proxy requested for " + i10, null, 2, null);
        try {
            aVar.f42442b.getAdapter().getProfileProxy(aVar.f42441a, gVar, i10);
        } catch (SecurityException unused) {
            emitter.h(new C6556a(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(N n10, a aVar, int i10) {
        BluetoothProfile bluetoothProfile = (BluetoothProfile) n10.f51689a;
        if (bluetoothProfile != null) {
            aVar.f42442b.getAdapter().closeProfileProxy(i10, bluetoothProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(int i10) {
        Z7.b.h("Bluetooth proxy disposed for " + i10, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BluetoothScanner.a q(BluetoothDevice bluetoothDevice, Integer num, boolean z10, d.a aVar) {
        String address = bluetoothDevice.getAddress();
        C5969a c5969aE = address != null ? C5969a.f48518b.e(address) : null;
        if (c5969aE == null) {
            return null;
        }
        String name = bluetoothDevice.getName();
        AbstractC2558b abstractC2558bA = AbstractC8727a.a(bluetoothDevice);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new BluetoothScanner.a(c5969aE, name, z10, num != null ? U7.a.f22147e.a(num.intValue()) : null, abstractC2558bA, aVar.a(c5969aE), AbstractC8727a.b(bluetoothDevice.getType()), jCurrentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a aVar) {
        BluetoothAdapter adapter = aVar.f42442b.getAdapter();
        if (adapter == null || !adapter.isDiscovering()) {
            return;
        }
        BluetoothAdapter adapter2 = aVar.f42442b.getAdapter();
        if (adapter2 != null) {
            adapter2.cancelDiscovery();
        }
        Z7.b.h("Bluetooth Scanner discovery CANCELLED", null, 2, null);
    }

    @Override // com.ui.wifiman.model.bluetooth.classic.BluetoothScanner
    public gg.i a() {
        return this.f42450j;
    }
}
