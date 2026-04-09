package com.ui.wifiman.model.bluetooth.le;

import Yg.J;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import com.ui.wifiman.model.bluetooth.le.BleCommonCharacteristicsReader;
import com.ui.wifiman.model.bluetooth.le.a;
import com.ui.wifiman.model.bluetooth.le.c;
import com.ui.wifiman.model.bluetooth.le.i;
import com.ui.wifiman.model.vendor.d;
import gg.C;
import gg.InterfaceC5910A;
import gg.o;
import gg.q;
import gg.z;
import h9.C5969a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class c implements com.ui.wifiman.model.bluetooth.le.a {

    /* renamed from: a, reason: collision with root package name */
    private final BleCommonCharacteristicsReader f42512a;

    /* renamed from: b, reason: collision with root package name */
    private final d.b f42513b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f42514c;

    /* renamed from: d, reason: collision with root package name */
    private final Fg.a f42515d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f42516e;

    static final class a implements n {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a.C1388a c(Map.Entry entry) {
            AbstractC6492s.i(entry, "<destruct>");
            return (a.C1388a) entry.getValue();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set apply(J it) {
            Set setB0;
            AbstractC6492s.i(it, "it");
            HashMap map = c.this.f42514c;
            c cVar = c.this;
            synchronized (map) {
                setB0 = AbstractC8783m.b0(AbstractC8783m.N(U.y(cVar.f42514c), new InterfaceC6835l() { // from class: com.ui.wifiman.model.bluetooth.le.b
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return c.a.c((Map.Entry) obj);
                    }
                }));
            }
            return setB0;
        }
    }

    public static final class b implements q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5969a f42519b;

        public b(C5969a c5969a) {
            this.f42519b = c5969a;
        }

        @Override // gg.q
        public final void a(o oVar) {
            a.C1388a c1388a;
            try {
                synchronized (c.this.b()) {
                    c1388a = (a.C1388a) c.this.f42514c.get(this.f42519b);
                }
                if (c1388a != null) {
                    oVar.onSuccess(c1388a);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: com.ui.wifiman.model.bluetooth.le.c$c, reason: collision with other inner class name */
    public static final class C1389c implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5969a f42520a;

        public C1389c(C5969a c5969a) {
            this.f42520a = c5969a;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Z7.b.h("BleCommonCharacteristic - No known characteristic found for " + this.f42520a, null, 2, null);
                interfaceC5910A.onSuccess(d0.e());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class d implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5969a f42522b;

        d(C5969a c5969a) {
            this.f42522b = c5969a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.C1388a apply(Set it) {
            AbstractC6492s.i(it, "it");
            return c.this.f(this.f42522b, it);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5969a f42524b;

        e(C5969a c5969a) {
            this.f42524b = c5969a;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a.C1388a device) {
            AbstractC6492s.i(device, "device");
            HashMap map = c.this.f42514c;
            C5969a c5969a = this.f42524b;
            c cVar = c.this;
            synchronized (map) {
                Z7.b.h("BleCommonCharacteristic - Storing result for " + c5969a, null, 2, null);
                cVar.f42514c.put(c5969a, device);
                cVar.f42515d.h(J.f24997a);
            }
        }
    }

    public c(BleCommonCharacteristicsReader reader, d.b vendorManager) {
        AbstractC6492s.i(reader, "reader");
        AbstractC6492s.i(vendorManager, "vendorManager");
        this.f42512a = reader;
        this.f42513b = vendorManager;
        this.f42514c = new HashMap();
        Fg.a aVarK2 = Fg.a.k2(J.f24997a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f42515d = aVarK2;
        gg.i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).N0(new a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42516e = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.C1388a f(C5969a c5969a, Set set) {
        String strC;
        Set set2 = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(set2, 10)), 16));
        for (Object obj : set2) {
            linkedHashMap.put(((BleCommonCharacteristicsReader.a) obj).a(), obj);
        }
        BleCommonCharacteristicsReader.a aVar = (BleCommonCharacteristicsReader.a) linkedHashMap.get(i.a.NAME);
        String strC2 = aVar != null ? aVar.c() : null;
        BleCommonCharacteristicsReader.a aVar2 = (BleCommonCharacteristicsReader.a) linkedHashMap.get(i.a.MODEL_NUMBER);
        String strC3 = aVar2 != null ? aVar2.c() : null;
        BleCommonCharacteristicsReader.a aVar3 = (BleCommonCharacteristicsReader.a) linkedHashMap.get(i.a.MANUFACTURER);
        com.ui.wifiman.model.vendor.d dVarB = (aVar3 == null || (strC = aVar3.c()) == null) ? null : this.f42513b.b(strC);
        BleCommonCharacteristicsReader.a aVar4 = (BleCommonCharacteristicsReader.a) linkedHashMap.get(i.a.BATTERY_LEVEL);
        String strC4 = aVar4 != null ? aVar4.c() : null;
        BleCommonCharacteristicsReader.a aVar5 = (BleCommonCharacteristicsReader.a) linkedHashMap.get(i.a.FIRMWARE_REVISION);
        return new a.C1388a(c5969a, strC2, strC3, dVarB, strC4, aVar5 != null ? aVar5.c() : null, System.currentTimeMillis(), linkedHashMap);
    }

    @Override // com.ui.wifiman.model.bluetooth.le.a
    public z a(C5969a mac) {
        AbstractC6492s.i(mac, "mac");
        gg.n nVarC = gg.n.c(new b(mac));
        AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
        gg.n nVarM0 = this.f42512a.a(mac).M0();
        z zVarI = z.i(new C1389c(mac));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarX = nVarC.x(nVarM0.x(zVarI).A(new d(mac)).o(new e(mac)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    @Override // com.ui.wifiman.model.bluetooth.le.a
    public gg.i b() {
        return this.f42516e;
    }
}
