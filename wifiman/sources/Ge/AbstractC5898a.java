package ge;

import Zg.AbstractC3689v;
import fe.u;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.i;
import gg.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ge.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5898a implements InterfaceC5899b {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f47868a;

    /* renamed from: b, reason: collision with root package name */
    private final i f47869b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5912b f47870c;

    /* renamed from: ge.a$a, reason: collision with other inner class name */
    static final class C1783a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1783a f47871a = new C1783a();

        C1783a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(i it) {
            AbstractC6492s.i(it, "it");
            return it;
        }
    }

    /* renamed from: ge.a$b */
    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map apply(Collection it) {
            HashMap map;
            AbstractC6492s.i(it, "it");
            AbstractC5898a abstractC5898a = AbstractC5898a.this;
            synchronized (abstractC5898a) {
                try {
                    HashMap map2 = new HashMap();
                    for (Object obj : it) {
                        map2.put(abstractC5898a.f(obj), obj);
                    }
                    HashSet hashSet = new HashSet();
                    Set setKeySet = abstractC5898a.f47868a.keySet();
                    AbstractC6492s.h(setKeySet, "<get-keys>(...)");
                    Iterator it2 = setKeySet.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(it2.next());
                    }
                    Set setKeySet2 = map2.keySet();
                    AbstractC6492s.h(setKeySet2, "<get-keys>(...)");
                    Iterator it3 = setKeySet2.iterator();
                    while (it3.hasNext()) {
                        hashSet.add(it3.next());
                    }
                    map = new HashMap();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (Object obj2 : hashSet) {
                        Object objD = abstractC5898a.d(jCurrentTimeMillis, abstractC5898a.f47868a.get(obj2), map2.get(obj2));
                        if (objD != null) {
                            map.put(obj2, objD);
                        }
                    }
                    abstractC5898a.f47868a = map;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return map;
        }
    }

    /* renamed from: ge.a$c */
    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f47873a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5898a f47874b;

        c(Object obj, AbstractC5898a abstractC5898a) {
            this.f47873a = obj;
            this.f47874b = abstractC5898a;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object apply(Map it) {
            AbstractC6492s.i(it, "it");
            Object obj = it.get(this.f47873a);
            return obj == null ? this.f47874b.e(this.f47873a) : obj;
        }
    }

    /* renamed from: ge.a$d */
    public static final class d implements C {
        public d() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(AbstractC5898a.this.g());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public AbstractC5898a(u schedulers) {
        AbstractC6492s.i(schedulers, "schedulers");
        this.f47868a = new HashMap();
        z zVarI = z.i(new d());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        i iVarI2 = zVarI.w(C1783a.f47871a).N0(new b()).z1(this.f47868a).F1(schedulers.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f47869b = iVarI2;
        AbstractC5912b abstractC5912bE0 = iVarI2.E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f47870c = abstractC5912bE0;
    }

    protected final List c(List list, Object obj, long j10) {
        AbstractC6492s.i(list, "<this>");
        List listC = AbstractC3689v.c();
        int i10 = 0;
        for (Object obj2 : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            Wc.c cVar = (Wc.c) obj2;
            if (i10 >= listC.size() - 30) {
                listC.add(cVar);
            }
            i10 = i11;
        }
        listC.add(new Wc.c(j10, obj));
        return AbstractC3689v.a(listC);
    }

    protected abstract Object d(long j10, Object obj, Object obj2);

    protected abstract Object e(Object obj);

    protected abstract Object f(Object obj);

    protected abstract i g();

    @Override // ge.InterfaceC5899b
    public final i get(Object obj) {
        i iVarW = this.f47869b.N0(new c(obj, this)).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return iVarW;
    }

    @Override // ge.InterfaceC5899b
    public final i getAll() {
        return this.f47869b;
    }
}
