package com.ui.wifiman.model.android.permissions;

import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import android.content.Context;
import android.os.Build;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import gg.s;
import gg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import t1.AbstractC8021a;

/* loaded from: classes4.dex */
public final class c implements com.ui.wifiman.model.android.permissions.d, com.ui.wifiman.model.android.permissions.b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f42405a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5826a f42406b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.c f42407c;

    /* renamed from: d, reason: collision with root package name */
    private final Hg.b f42408d;

    /* renamed from: e, reason: collision with root package name */
    private final i f42409e;

    /* renamed from: f, reason: collision with root package name */
    private final s f42410f;

    static final class a implements n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(J j10) {
            return c.this.h();
        }
    }

    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f42412a = new b();

        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Set it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("PERMISSION - Granted: " + AbstractC3689v.z0(it, ",", null, null, 0, null, null, 62, null), null, 2, null);
        }
    }

    /* renamed from: com.ui.wifiman.model.android.permissions.c$c, reason: collision with other inner class name */
    public static final class C1379c implements InterfaceC5915e {
        public C1379c() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("PERMISSION - Check granted state", null, 2, null);
                c.this.f42407c.h(J.f24997a);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f42414a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List list) {
            AbstractC6492s.f(list);
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.ui.wifiman.model.android.permissions.a) it.next()).getApiID());
            }
            return AbstractC3689v.y(arrayList);
        }
    }

    public static final class e implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.android.permissions.a[] f42415a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f42416b;

        public e(com.ui.wifiman.model.android.permissions.a[] aVarArr, c cVar) {
            this.f42415a = aVarArr;
            this.f42416b = cVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("PERMISSION - REQUEST " + AbstractC3682n.I0(this.f42415a, ",", null, null, 0, null, null, 62, null), null, 2, null);
                this.f42416b.f42408d.h(AbstractC3682n.d1(this.f42415a));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class f implements C {
        public f() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(c.this.h());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public c(Context applicationContext) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        this.f42405a = applicationContext;
        this.f42406b = com.ui.wifiman.model.android.permissions.a.getEntries();
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f42407c = cVarJ2;
        Hg.b bVarK1 = Hg.b.k1();
        AbstractC6492s.h(bVarK1, "create(...)");
        this.f42408d = bVarK1;
        i iVarN0 = cVarJ2.X0(Gg.a.a()).N0(new a());
        z zVarI = z.i(new f());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        i iVarI2 = iVarN0.y1(zVarI).W().f0(b.f42412a).e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42409e = iVarI2;
        s sVarI0 = bVarK1.i0(d.f42414a);
        AbstractC6492s.h(sVarI0, "map(...)");
        this.f42410f = sVarI0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set h() {
        boolean zContains;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (com.ui.wifiman.model.android.permissions.a aVar : this.f42406b) {
            if (!aVar.getAlwaysGranted()) {
                List<String> apiID = aVar.getApiID();
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(apiID, 10));
                Iterator<T> it = apiID.iterator();
                while (true) {
                    zContains = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AbstractC8021a.a(this.f42405a, (String) it.next()) == 0) {
                        zContains = true;
                    }
                    arrayList.add(Boolean.valueOf(zContains));
                }
                if (!aVar.getAllRequired()) {
                    zContains = arrayList.contains(Boolean.TRUE);
                } else if (!arrayList.contains(Boolean.FALSE)) {
                    zContains = true;
                }
                if (zContains) {
                }
            }
            linkedHashSet.add(aVar);
        }
        if (Build.VERSION.SDK_INT < 31 && AbstractC8021a.a(this.f42405a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            linkedHashSet.add(com.ui.wifiman.model.android.permissions.a.BLUETOOTH);
        }
        return linkedHashSet;
    }

    @Override // com.ui.wifiman.model.android.permissions.d
    public AbstractC5912b a(com.ui.wifiman.model.android.permissions.a... permission) {
        AbstractC6492s.i(permission, "permission");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new e(permission, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // com.ui.wifiman.model.android.permissions.d
    public i b() {
        return this.f42409e;
    }

    @Override // com.ui.wifiman.model.android.permissions.b
    public s c() {
        return this.f42410f;
    }

    @Override // com.ui.wifiman.model.android.permissions.b
    public AbstractC5912b d() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1379c());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }
}
