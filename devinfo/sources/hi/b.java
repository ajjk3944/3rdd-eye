package hi;

import android.os.Build;
import androidx.lifecycle.f1;
import bi.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import nk.k;
import rl.j;
import rl.n;
import rl.o;
import rl.s;
import rl.t;
import rl.x;
import rl.z;
import sl.h;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final t f25152a;

    static {
        s sVar = new s();
        k.e(TimeUnit.SECONDS, "unit");
        sVar.f33153u = h.b();
        sVar.f33151s = h.b();
        sVar.f33152t = h.b();
        final int i4 = 1;
        o oVar = new o() { // from class: hi.a
            @Override // rl.o
            public final z a(wl.h hVar) {
                switch (i4) {
                    case 0:
                        va.o oVar2 = hVar.f36834e;
                        z zVarB = hVar.b(oVar2);
                        int i10 = 0;
                        if (p.w0(((n) oVar2.f36146b).f33116d, "https://liuzhosoft.com/server/devinfo/", false)) {
                            String upperCase = ((String) oVar2.f36147c).toUpperCase(Locale.ROOT);
                            k.d(upperCase, "toUpperCase(...)");
                            if (upperCase.equals("POST")) {
                                x xVar = (x) oVar2.f36149e;
                                if (xVar instanceof j) {
                                    List list = ((j) xVar).f33103b;
                                    int size = list.size();
                                    while (true) {
                                        if (i10 < size) {
                                            if (!k.a((String) list.get(i10), "ltoken")) {
                                                i10++;
                                            } else if (zVarB.f33207d == 403) {
                                                bh.c.f2188a.f();
                                                d.b(new bg.a(2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return zVarB;
                    default:
                        va.o oVar3 = hVar.f36834e;
                        if (p.w0(((n) oVar3.f36146b).f33120i, "https://liuzhosoft.com/server/devinfo/", false)) {
                            String upperCase2 = ((String) oVar3.f36147c).toUpperCase(Locale.ROOT);
                            k.d(upperCase2, "toUpperCase(...)");
                            if (upperCase2.equals("POST")) {
                                x xVar2 = (x) oVar3.f36149e;
                                if (xVar2 instanceof j) {
                                    km.n nVar = new km.n(0);
                                    j jVar = (j) xVar2;
                                    List list2 = jVar.f33103b;
                                    int size2 = list2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        nVar.h((String) list2.get(i11), (String) jVar.f33104c.get(i11));
                                    }
                                    nVar.g("os", "Android");
                                    nVar.g("_vcode", "327");
                                    nVar.g("_vname", "v3.0.1.0");
                                    nVar.g("_flavor", "google");
                                    String str = Build.BRAND;
                                    k.d(str, "BRAND");
                                    nVar.g("_deviceBrand", str);
                                    String str2 = Build.DEVICE;
                                    k.d(str2, "DEVICE");
                                    nVar.g("_deviceDevice", str2);
                                    String str3 = Build.MODEL;
                                    k.d(str3, "MODEL");
                                    nVar.g("_deviceModel", str3);
                                    String str4 = Build.PRODUCT;
                                    k.d(str4, "PRODUCT");
                                    nVar.g("_deviceProduct", str4);
                                    nVar.g("_osVersion", String.valueOf(Build.VERSION.SDK_INT));
                                    j jVar2 = new j((ArrayList) nVar.f28442b, (ArrayList) nVar.f28443c);
                                    f1 f1VarM = oVar3.m();
                                    f1VarM.G("POST", jVar2);
                                    oVar3 = new va.o(f1VarM);
                                }
                            }
                        }
                        return hVar.b(oVar3);
                }
            }
        };
        ArrayList arrayList = sVar.f33137c;
        arrayList.add(oVar);
        final int i10 = 0;
        arrayList.add(new o() { // from class: hi.a
            @Override // rl.o
            public final z a(wl.h hVar) {
                switch (i10) {
                    case 0:
                        va.o oVar2 = hVar.f36834e;
                        z zVarB = hVar.b(oVar2);
                        int i102 = 0;
                        if (p.w0(((n) oVar2.f36146b).f33116d, "https://liuzhosoft.com/server/devinfo/", false)) {
                            String upperCase = ((String) oVar2.f36147c).toUpperCase(Locale.ROOT);
                            k.d(upperCase, "toUpperCase(...)");
                            if (upperCase.equals("POST")) {
                                x xVar = (x) oVar2.f36149e;
                                if (xVar instanceof j) {
                                    List list = ((j) xVar).f33103b;
                                    int size = list.size();
                                    while (true) {
                                        if (i102 < size) {
                                            if (!k.a((String) list.get(i102), "ltoken")) {
                                                i102++;
                                            } else if (zVarB.f33207d == 403) {
                                                bh.c.f2188a.f();
                                                d.b(new bg.a(2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return zVarB;
                    default:
                        va.o oVar3 = hVar.f36834e;
                        if (p.w0(((n) oVar3.f36146b).f33120i, "https://liuzhosoft.com/server/devinfo/", false)) {
                            String upperCase2 = ((String) oVar3.f36147c).toUpperCase(Locale.ROOT);
                            k.d(upperCase2, "toUpperCase(...)");
                            if (upperCase2.equals("POST")) {
                                x xVar2 = (x) oVar3.f36149e;
                                if (xVar2 instanceof j) {
                                    km.n nVar = new km.n(0);
                                    j jVar = (j) xVar2;
                                    List list2 = jVar.f33103b;
                                    int size2 = list2.size();
                                    for (int i11 = 0; i11 < size2; i11++) {
                                        nVar.h((String) list2.get(i11), (String) jVar.f33104c.get(i11));
                                    }
                                    nVar.g("os", "Android");
                                    nVar.g("_vcode", "327");
                                    nVar.g("_vname", "v3.0.1.0");
                                    nVar.g("_flavor", "google");
                                    String str = Build.BRAND;
                                    k.d(str, "BRAND");
                                    nVar.g("_deviceBrand", str);
                                    String str2 = Build.DEVICE;
                                    k.d(str2, "DEVICE");
                                    nVar.g("_deviceDevice", str2);
                                    String str3 = Build.MODEL;
                                    k.d(str3, "MODEL");
                                    nVar.g("_deviceModel", str3);
                                    String str4 = Build.PRODUCT;
                                    k.d(str4, "PRODUCT");
                                    nVar.g("_deviceProduct", str4);
                                    nVar.g("_osVersion", String.valueOf(Build.VERSION.SDK_INT));
                                    j jVar2 = new j((ArrayList) nVar.f28442b, (ArrayList) nVar.f28443c);
                                    f1 f1VarM = oVar3.m();
                                    f1VarM.G("POST", jVar2);
                                    oVar3 = new va.o(f1VarM);
                                }
                            }
                        }
                        return hVar.b(oVar3);
                }
            }
        });
        f25152a = new t(sVar);
    }
}
