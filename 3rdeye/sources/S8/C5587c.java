package s8;

import A9.C0583j;
import A9.E;
import J8.C;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p9.p;
import s8.C5585a;

/* compiled from: NetworkStateMonitor.kt */
@e(c = "com.zipoapps.premiumhelper.network.NetworkStateMonitor$getUnavailableDomains$2$3", f = "NetworkStateMonitor.kt", l = {}, m = "invokeSuspend")
/* renamed from: s8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5587c extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C5585a f46181l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0583j f46182m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5587c(C5585a c5585a, C0583j c0583j, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f46181l = c5585a;
        this.f46182m = c0583j;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C5587c(this.f46181l, this.f46182m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C5587c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        n.b(obj);
        C5585a c5585a = this.f46181l;
        C5585a.C0528a c0528a = C5585a.f46167c;
        synchronized (c5585a) {
            try {
                HashMap map = new HashMap();
                for (String str : C5585a.f46169e) {
                    map.put(str, Boolean.valueOf(C.b(str)));
                }
                for (String str2 : C5585a.f46170f) {
                    map.put(str2, Boolean.valueOf(C.b(str2)));
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i = C.f2809a;
                c5585a.f46172b = new C5585a.b(jCurrentTimeMillis, map, C.c(c5585a.f46171a), C.a(c5585a.f46171a));
                va.a.f47104a.a("Status update of ad domains finished", new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f46182m.isActive()) {
            C0583j c0583j = this.f46182m;
            HashMap<String, Boolean> map2 = this.f46181l.f46172b.f46174b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Boolean> entry : map2.entrySet()) {
                if (!entry.getValue().booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getKey());
            }
            c0583j.resumeWith(arrayList);
        }
        return C1992A.f18074a;
    }
}
