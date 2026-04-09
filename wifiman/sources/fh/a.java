package Fh;

import Dh.C2610p;
import Sh.n;
import Sh.w;
import Sh.x;
import Th.a;
import Zg.AbstractC3689v;
import Zh.b;
import gi.C5922d;
import ii.C6155b;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import xi.AbstractC8536c;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final n f6666a;

    /* renamed from: b, reason: collision with root package name */
    private final g f6667b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f6668c;

    public a(n resolver, g kotlinClassFinder) {
        AbstractC6492s.i(resolver, "resolver");
        AbstractC6492s.i(kotlinClassFinder, "kotlinClassFinder");
        this.f6666a = resolver;
        this.f6667b = kotlinClassFinder;
        this.f6668c = new ConcurrentHashMap();
    }

    public final InterfaceC6164k a(f fileClass) {
        Collection collectionE;
        AbstractC6492s.i(fileClass, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f6668c;
        Zh.b bVarB = fileClass.b();
        Object obj = concurrentHashMap.get(bVarB);
        if (obj == null) {
            Zh.c cVarF = fileClass.b().f();
            if (fileClass.a().c() == a.EnumC0806a.MULTIFILE_CLASS) {
                List<String> listF = fileClass.a().f();
                collectionE = new ArrayList();
                for (String str : listF) {
                    b.a aVar = Zh.b.f25401d;
                    Zh.c cVarE = C5922d.d(str).e();
                    AbstractC6492s.h(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    x xVarB = w.b(this.f6667b, aVar.c(cVarE), AbstractC8536c.a(this.f6666a.f().g()));
                    if (xVarB != null) {
                        collectionE.add(xVarB);
                    }
                }
            } else {
                collectionE = AbstractC3689v.e(fileClass);
            }
            C2610p c2610p = new C2610p(this.f6666a.f().q(), cVarF);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                InterfaceC6164k interfaceC6164kC = this.f6666a.c(c2610p, (x) it.next());
                if (interfaceC6164kC != null) {
                    arrayList.add(interfaceC6164kC);
                }
            }
            List listI1 = AbstractC3689v.i1(arrayList);
            InterfaceC6164k interfaceC6164kA = C6155b.f49176d.a("package " + cVarF + " (" + fileClass + ')', listI1);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarB, interfaceC6164kA);
            obj = objPutIfAbsent == null ? interfaceC6164kA : objPutIfAbsent;
        }
        AbstractC6492s.h(obj, "getOrPut(...)");
        return (InterfaceC6164k) obj;
    }
}
