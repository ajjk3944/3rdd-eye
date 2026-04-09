package com.ui.wifiman.model.bluetooth.le;

import Ac.a;
import Cc.AbstractC2558b;
import Cc.C2559c;
import Yg.J;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.pm.PackageManager;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.util.SparseArray;
import com.ui.wifiman.model.bluetooth.le.BleScanner;
import com.ui.wifiman.model.bluetooth.le.f;
import com.ui.wifiman.model.bluetooth.le.j;
import com.ui.wifiman.model.bluetooth.le.l;
import com.ui.wifiman.model.vendor.d;
import gg.C;
import gg.D;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import k9.AbstractC6410e;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6468e;
import kg.InterfaceC6469f;
import kg.n;
import kg.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import va.C8204b;
import wa.InterfaceC8290a;
import wc.InterfaceC8324d;
import xa.InterfaceC8439a;
import xa.o;
import yc.r;
import zc.AbstractC8727a;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class f implements BleScanner {

    /* renamed from: i, reason: collision with root package name */
    public static final a f42552i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothManager f42553a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageManager f42554b;

    /* renamed from: c, reason: collision with root package name */
    private final j.a f42555c;

    /* renamed from: d, reason: collision with root package name */
    private final long f42556d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f42557e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f42558f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f42559g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f42560h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42561a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f42562b;

        static {
            int[] iArr = new int[va.c.values().length];
            try {
                iArr[va.c.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[va.c.FACTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42561a = iArr;
            int[] iArr2 = new int[l.c.values().length];
            try {
                iArr2[l.c.XBOX_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[l.c.APPLE_IPHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[l.c.APPLE_IPAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[l.c.ANDROID.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[l.c.WINDOWS_10_DESKTOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[l.c.WINDOWS_10_PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[l.c.LINUS_DEVICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[l.c.WINDOWS_IOT.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[l.c.SURFACE_HUB.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            f42562b = iArr2;
        }
    }

    public static final class c extends ScanCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.j f42563a;

        c(gg.j jVar) {
            this.f42563a = jVar;
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List list) {
            super.onBatchScanResults(list);
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            this.f42563a.h(list);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i10) {
            super.onScanFailed(i10);
            Z7.b.h("BLeScan - Scanner error " + i10, null, 2, null);
            this.f42563a.c(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new BleScanner.Error.Unknown() : new BleScanner.Error.FeatureUnsupported() : new BleScanner.Error.InternalError() : new BleScanner.Error.ApplicationRegistrationFailed() : new BleScanner.Error.MultipleScanningAtOnceNotSupported());
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i10, ScanResult scanResult) {
            super.onScanResult(i10, scanResult);
            if (scanResult != null) {
                this.f42563a.h(AbstractC3689v.e(scanResult));
            }
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f42564a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap apply(HashMap map, List scanResults) {
            String address;
            AbstractC6492s.i(scanResults, "scanResults");
            AbstractC6492s.f(map);
            synchronized (map) {
                try {
                    Iterator it = scanResults.iterator();
                    while (it.hasNext()) {
                        ScanResult scanResult = (ScanResult) it.next();
                        BluetoothDevice device = scanResult.getDevice();
                        if (device != null && (address = device.getAddress()) != null) {
                            map.put(address, scanResult);
                        }
                    }
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return map;
        }
    }

    static final class e implements n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(HashMap map) {
            f fVar = f.this;
            List listC = AbstractC3689v.c();
            AbstractC6492s.f(map);
            synchronized (map) {
                try {
                    Iterator it = map.values().iterator();
                    long jCurrentTimeMillis = System.currentTimeMillis() - 30000;
                    while (it.hasNext()) {
                        ScanResult scanResult = (ScanResult) it.next();
                        AbstractC6492s.f(scanResult);
                        if (fVar.u(scanResult) < jCurrentTimeMillis) {
                            BluetoothDevice device = scanResult.getDevice();
                            Z7.b.h("BLeScan -Removed BLE Device " + (device != null ? device.getAddress() : null) + " because it's lost for more then 30000ms", null, 2, null);
                            it.remove();
                        } else {
                            listC.add(scanResult);
                        }
                    }
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* renamed from: com.ui.wifiman.model.bluetooth.le.f$f, reason: collision with other inner class name */
    static final class C1393f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C1393f f42566a = new C1393f();

        C1393f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("BLeScan - subscribed", null, 2, null);
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f42567a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.BLUETOOTH));
        }
    }

    static final class h implements n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean scanPermissionGranted) {
            AbstractC6492s.i(scanPermissionGranted, "scanPermissionGranted");
            if (scanPermissionGranted.booleanValue()) {
                return f.this.f42559g;
            }
            gg.i iVarK0 = gg.i.K0(AbstractC3689v.l());
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    static final class i implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f42570a;

            a(List list) {
                this.f42570a = list;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s apply(List connectedDevices) {
                AbstractC6492s.i(connectedDevices, "connectedDevices");
                return z.a(this.f42570a, connectedDevices);
            }
        }

        public static final class b implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f42571a;

            public b(f fVar) {
                this.f42571a = fVar;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    List<BluetoothDevice> connectedDevices = this.f42571a.f42553a.getConnectedDevices(7);
                    if (connectedDevices == null) {
                        connectedDevices = AbstractC3689v.l();
                    }
                    Z7.b.h("BLeScan - connected devices get took 2 " + (System.currentTimeMillis() - jCurrentTimeMillis) + " millis", null, 2, null);
                    interfaceC5910A.onSuccess(connectedDevices);
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(long j10) {
            Z7.b.h("BLeScan - connected devices get took " + j10 + " millis", null, 2, null);
            return J.f24997a;
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final D apply(List scanResults) {
            AbstractC6492s.i(scanResults, "scanResults");
            gg.z zVarI = gg.z.i(new b(f.this));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return AbstractC6410e.f(zVarI, new InterfaceC6835l() { // from class: com.ui.wifiman.model.bluetooth.le.g
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return f.i.c(((Long) obj).longValue());
                }
            }).O(Gg.a.d()).A(new a(scanResults));
        }
    }

    static final class j implements kg.h {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BleScanner.a d(Map.Entry it) {
            AbstractC6492s.i(it, "it");
            return (BleScanner.a) it.getValue();
        }

        @Override // kg.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List a(s sVar, d.a vendorDirectory, a.InterfaceC0018a bluetoothVendorDir, InterfaceC8290a catalogBrowser) {
            String address;
            AbstractC6492s.i(sVar, "<destruct>");
            AbstractC6492s.i(vendorDirectory, "vendorDirectory");
            AbstractC6492s.i(bluetoothVendorDir, "bluetoothVendorDir");
            AbstractC6492s.i(catalogBrowser, "catalogBrowser");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            List<BluetoothDevice> list = (List) objC;
            f fVar = f.this;
            Map mapC = U.c();
            HashMap map = new HashMap();
            for (ScanResult scanResult : (List) objA) {
                BluetoothDevice device = scanResult.getDevice();
                if (device != null && (address = device.getAddress()) != null) {
                    map.put(address, scanResult);
                }
                BluetoothDevice device2 = scanResult.getDevice();
                AbstractC6492s.h(device2, "getDevice(...)");
                BleScanner.a aVarP = fVar.p(device2, scanResult, vendorDirectory, bluetoothVendorDir, catalogBrowser);
                if (aVarP != null) {
                    mapC.put(aVarP.c(), aVarP);
                }
            }
            for (BluetoothDevice bluetoothDevice : list) {
                AbstractC6492s.f(bluetoothDevice);
                String address2 = bluetoothDevice.getAddress();
                BleScanner.a aVarP2 = fVar.p(bluetoothDevice, address2 != null ? (ScanResult) map.get(address2) : null, vendorDirectory, null, catalogBrowser);
                if (aVarP2 != null) {
                    mapC.put(aVarP2.c(), aVarP2);
                }
            }
            return AbstractC8783m.Z(AbstractC8783m.N(U.y(U.b(mapC)), new InterfaceC6835l() { // from class: com.ui.wifiman.model.bluetooth.le.h
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return f.j.d((Map.Entry) obj);
                }
            }));
        }
    }

    static final class k implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final k f42573a = new k();

        k() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("BLeScan - cache emitted " + it.size() + " results", null, 2, null);
        }
    }

    static final class l implements n {
        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(InterfaceC8324d.b receiverStatus) {
            AbstractC6492s.i(receiverStatus, "receiverStatus");
            if ((receiverStatus instanceof InterfaceC8324d.b.C2294b) || !f.this.f42554b.hasSystemFeature("android.hardware.bluetooth_le")) {
                gg.i iVarK0 = gg.i.k0(new BleScanner.Error.BluetoothNotAvailableOnDevice());
                AbstractC6492s.h(iVarK0, "error(...)");
                return iVarK0;
            }
            if ((receiverStatus instanceof InterfaceC8324d.b.a) && ((InterfaceC8324d.b.a) receiverStatus).a() == InterfaceC8324d.a.STATE_ON) {
                return f.this.f42558f;
            }
            gg.i iVarK02 = gg.i.K0(AbstractC3689v.l());
            AbstractC6492s.h(iVarK02, "just(...)");
            return iVarK02;
        }
    }

    public f(BluetoothManager bluetoothManager, InterfaceC8324d bluetoothReceiver, d.b macVendorManager, Ac.a OUIBluetoothLookup, o productCatalog, PackageManager packageManager, j.a beaconOperator, com.ui.wifiman.model.android.permissions.d permissionsService) {
        AbstractC6492s.i(bluetoothManager, "bluetoothManager");
        AbstractC6492s.i(bluetoothReceiver, "bluetoothReceiver");
        AbstractC6492s.i(macVendorManager, "macVendorManager");
        AbstractC6492s.i(OUIBluetoothLookup, "OUIBluetoothLookup");
        AbstractC6492s.i(productCatalog, "productCatalog");
        AbstractC6492s.i(packageManager, "packageManager");
        AbstractC6492s.i(beaconOperator, "beaconOperator");
        AbstractC6492s.i(permissionsService, "permissionsService");
        this.f42553a = bluetoothManager;
        this.f42554b = packageManager;
        this.f42555c = beaconOperator;
        this.f42556d = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        gg.i iVarZ = gg.i.N(new gg.k() { // from class: yc.h
            @Override // gg.k
            public final void a(gg.j jVar) {
                com.ui.wifiman.model.bluetooth.le.f.l(this.f66668a, jVar);
            }
        }, EnumC5911a.BUFFER).F1(Gg.a.d()).g2(Gg.a.d()).s1(new q() { // from class: yc.i
            @Override // kg.q
            public final Object get() {
                return com.ui.wifiman.model.bluetooth.le.f.n();
            }
        }, d.f42564a).V1(1000L, TimeUnit.MILLISECONDS, Gg.a.a()).e1().Y0(Gg.a.a(), false, 1).N0(new e()).g0(C1393f.f42566a).Z(new InterfaceC6464a() { // from class: yc.j
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.bluetooth.le.f.o();
            }
        });
        AbstractC6492s.h(iVarZ, "doFinally(...)");
        this.f42557e = iVarZ;
        gg.i iVarF0 = gg.i.t(iVarZ.K(new i()), macVendorManager.a().W(), OUIBluetoothLookup.a().W(), productCatalog.b(), new j()).f0(k.f42573a);
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        this.f42558f = iVarF0;
        gg.i iVarI1 = bluetoothReceiver.a().I1(new l());
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f42559g = iVarI1;
        gg.i iVarI2 = permissionsService.b().N0(g.f42567a).W().I1(new h()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42560h = iVarI2;
    }

    private final boolean A(ScanResult scanResult) {
        int advertiseFlags;
        ScanRecord scanRecord = scanResult.getScanRecord();
        return (scanRecord == null || (advertiseFlags = scanRecord.getAdvertiseFlags()) <= 0 || (advertiseFlags & 2) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final f fVar, gg.j e10) {
        BluetoothLeScanner bluetoothLeScanner;
        AbstractC6492s.i(e10, "e");
        gg.j jVarSerialize = e10.serialize();
        AbstractC6492s.h(jVarSerialize, "serialize(...)");
        final c cVar = new c(jVarSerialize);
        try {
            BluetoothAdapter adapter = fVar.f42553a.getAdapter();
            if (adapter == null || (bluetoothLeScanner = adapter.getBluetoothLeScanner()) == null) {
                Z7.b.h("BLeScan - could not be stopped, because scanner was null", null, 2, null);
            } else {
                bluetoothLeScanner.startScan(AbstractC3689v.l(), new ScanSettings.Builder().setScanMode(2).build(), cVar);
                Z7.b.h("BLeScan - started", null, 2, null);
            }
        } catch (Throwable th2) {
            jVarSerialize.c(th2);
        }
        jVarSerialize.d(new InterfaceC6468e() { // from class: yc.k
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                com.ui.wifiman.model.bluetooth.le.f.m(this.f66669a, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(f fVar, c cVar) {
        BluetoothLeScanner bluetoothLeScanner;
        BluetoothAdapter adapter = fVar.f42553a.getAdapter();
        if (adapter == null || (bluetoothLeScanner = adapter.getBluetoothLeScanner()) == null) {
            Z7.b.h("BLeScan - could not be stopped, because scanner was null", null, 2, null);
            return;
        }
        try {
            bluetoothLeScanner.stopScan(cVar);
            Z7.b.h("BLeScan - stopped", null, 2, null);
        } catch (IllegalStateException e10) {
            Z7.b.j("BLeScan - could not be stopped", e10, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap n() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        Z7.b.h("BLeScan - disposed", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ui.wifiman.model.bluetooth.le.BleScanner.a p(android.bluetooth.BluetoothDevice r24, android.bluetooth.le.ScanResult r25, com.ui.wifiman.model.vendor.d.a r26, Ac.a.InterfaceC0018a r27, wa.InterfaceC8290a r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.bluetooth.le.f.p(android.bluetooth.BluetoothDevice, android.bluetooth.le.ScanResult, com.ui.wifiman.model.vendor.d$a, Ac.a$a, wa.a):com.ui.wifiman.model.bluetooth.le.BleScanner$a");
    }

    private final InterfaceC8439a.d q(InterfaceC8290a interfaceC8290a, ScanResult scanResult) {
        List<ParcelUuid> serviceUuids;
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null || (serviceUuids = scanRecord.getServiceUuids()) == null) {
            return null;
        }
        for (ParcelUuid parcelUuid : serviceUuids) {
            if (parcelUuid.getUuid() != null) {
                UUID uuid = parcelUuid.getUuid();
                AbstractC6492s.h(uuid, "getUuid(...)");
                InterfaceC8439a.d dVar = (InterfaceC8439a.d) interfaceC8290a.f(uuid);
                if (dVar != null) {
                    return dVar;
                }
            }
        }
        return null;
    }

    private final Long r(ScanResult scanResult) {
        if (scanResult.getPeriodicAdvertisingInterval() != 0) {
            return Long.valueOf((long) (scanResult.getPeriodicAdvertisingInterval() * 1.25f));
        }
        return null;
    }

    private final Integer s(ScanResult scanResult) {
        SparseArray<byte[]> manufacturerSpecificData;
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord == null || (manufacturerSpecificData = scanRecord.getManufacturerSpecificData()) == null || manufacturerSpecificData.size() <= 0) {
            return null;
        }
        int iKeyAt = manufacturerSpecificData.keyAt(0);
        manufacturerSpecificData.valueAt(0);
        return Integer.valueOf(iKeyAt);
    }

    private final AbstractC2558b t(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.ui.wifiman.model.bluetooth.le.j jVar = (com.ui.wifiman.model.bluetooth.le.j) it.next();
            if (jVar instanceof r) {
                return AbstractC2558b.g.d.f2496b;
            }
            if (jVar instanceof l.a) {
                l.c cVarA = ((l.a) jVar).a();
                switch (cVarA == null ? -1 : b.f42562b[cVarA.ordinal()]) {
                    case 1:
                        return AbstractC2558b.d.a.f2488b;
                    case 2:
                        return AbstractC2558b.AbstractC0120b.d.f2486c;
                    case 3:
                        return AbstractC2558b.AbstractC0120b.c.f2485c;
                    case 4:
                        return AbstractC2558b.a.C0118a.f2480b;
                    case 5:
                        return C2559c.f2504b;
                    case 6:
                        return Cc.d.f2505b;
                    case 7:
                        return AbstractC2558b.h.f2497b;
                    case 8:
                        return Cc.f.f2507b;
                    case 9:
                        return Cc.e.f2506b;
                    default:
                        return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(ScanResult scanResult) {
        return this.f42556d + TimeUnit.NANOSECONDS.toMillis(scanResult.getTimestampNanos());
    }

    private final U7.a v(ScanResult scanResult) {
        Integer numValueOf = Integer.valueOf(scanResult.getRssi());
        int iIntValue = numValueOf.intValue();
        if (iIntValue < -127 || iIntValue > 126) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return U7.a.f22147e.a(numValueOf.intValue());
    }

    private final BleScanner.a.EnumC1387a w(ScanResult scanResult, InterfaceC8439a.d dVar, List list) {
        List<ParcelUuid> serviceUuids;
        Ea.c cVarP0;
        Map mapD;
        if (!A(scanResult) || dVar == null) {
            List<com.ui.wifiman.model.bluetooth.le.j> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (com.ui.wifiman.model.bluetooth.le.j jVar : list2) {
                    if (!(jVar instanceof r) || !AbstractC6492s.d(((r) jVar).d(), Boolean.TRUE)) {
                    }
                }
            }
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null && (serviceUuids = scanRecord.getServiceUuids()) != null) {
                for (ParcelUuid parcelUuid : serviceUuids) {
                    if (parcelUuid.getUuid() != null && dVar != null && (cVarP0 = dVar.p0()) != null && (mapD = cVarP0.D()) != null) {
                        UUID uuid = parcelUuid.getUuid();
                        AbstractC6492s.h(uuid, "getUuid(...)");
                        Ea.a aVar = (Ea.a) mapD.get(C8204b.a(C8204b.c(uuid)));
                        if (aVar != null) {
                            va.c cVarC = aVar.c();
                            int i10 = cVarC == null ? -1 : b.f42561a[cVarC.ordinal()];
                            if (i10 != -1 && i10 != 1) {
                                if (i10 == 2) {
                                    return BleScanner.a.EnumC1387a.FACTORY;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            return BleScanner.a.EnumC1387a.NORMAL;
                        }
                    }
                }
            }
            return BleScanner.a.EnumC1387a.NORMAL;
        }
        return BleScanner.a.EnumC1387a.BOOTING;
    }

    private final Set x(BluetoothDevice bluetoothDevice) {
        return AbstractC8727a.b(bluetoothDevice.getType());
    }

    private final boolean y(ScanResult scanResult) {
        return scanResult.isConnectable();
    }

    private final int z(ScanResult scanResult) {
        return scanResult.getTxPower();
    }

    @Override // com.ui.wifiman.model.bluetooth.le.BleScanner
    public gg.i a() {
        return this.f42560h;
    }
}
