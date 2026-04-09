package dh;

import com.google.android.gms.internal.play_billing.m1;
import ek.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import nk.k;
import yj.u;
import zj.n;
import zj.o;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22259b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22260c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f22261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, ck.c cVar) {
        super(i4, cVar);
        this.f22259b = 3;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.f22259b) {
            case 0:
                e eVar = new e((g) this.f22261d, (ck.c) obj3, 0);
                eVar.f22260c = (Throwable) obj2;
                u uVar = u.f37649a;
                eVar.invokeSuspend(uVar);
                return uVar;
            case 1:
                e eVar2 = new e((gh.e) this.f22261d, (ck.c) obj3, 1);
                eVar2.f22260c = (Throwable) obj2;
                u uVar2 = u.f37649a;
                eVar2.invokeSuspend(uVar2);
                return uVar2;
            case 2:
                e eVar3 = new e((ih.c) this.f22261d, (ck.c) obj3, 2);
                eVar3.f22260c = (Throwable) obj2;
                u uVar3 = u.f37649a;
                eVar3.invokeSuspend(uVar3);
                return uVar3;
            default:
                e eVar4 = new e(3, (ck.c) obj3);
                eVar4.f22260c = (r4.e) obj;
                eVar4.f22261d = (t4.b) obj2;
                return eVar4.invokeSuspend(u.f37649a);
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22259b) {
            case 0:
                Throwable th2 = (Throwable) this.f22260c;
                ci.b.D(obj);
                wi.e eVar = ((g) this.f22261d).f22266d;
                String message = th2.getMessage();
                if (message == null) {
                    message = a0.g.o("error@", th2);
                }
                eVar.h(message);
                return u.f37649a;
            case 1:
                Throwable th3 = (Throwable) this.f22260c;
                ci.b.D(obj);
                wi.e eVar2 = ((gh.e) this.f22261d).f24734b;
                String message2 = th3.getMessage();
                if (message2 == null) {
                    message2 = a0.g.o("error@", th3);
                }
                eVar2.h(message2);
                return u.f37649a;
            case 2:
                Throwable th4 = (Throwable) this.f22260c;
                ci.b.D(obj);
                ih.c.g((ih.c) this.f22261d, th4);
                return u.f37649a;
            default:
                ci.b.D(obj);
                r4.e eVar3 = (r4.e) this.f22260c;
                t4.b bVar = (t4.b) this.f22261d;
                Set setKeySet = bVar.a().keySet();
                ArrayList arrayList = new ArrayList(o.T(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t4.d) it.next()).f34168a);
                }
                Map<String, ?> all = eVar3.f32807a.getAll();
                k.d(all, "prefs.all");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w.H(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = n.v0((Iterable) value);
                            }
                            linkedHashMap2.put(key, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        t4.b bVar2 = new t4.b(w.M(bVar.a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String str = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                k.e(str, "name");
                                bVar2.e(new t4.d(str), value2);
                            } else if (value2 instanceof Float) {
                                k.e(str, "name");
                                bVar2.e(new t4.d(str), value2);
                            } else if (value2 instanceof Integer) {
                                k.e(str, "name");
                                bVar2.e(new t4.d(str), value2);
                            } else if (value2 instanceof Long) {
                                k.e(str, "name");
                                bVar2.e(new t4.d(str), value2);
                            } else if (value2 instanceof String) {
                                k.e(str, "name");
                                bVar2.e(new t4.d(str), value2);
                            } else if (value2 instanceof Set) {
                                bVar2.e(m1.D(str), (Set) value2);
                            }
                        }
                        return new t4.b(w.M(bVar2.a()), true);
                    }
                    Map.Entry<String, ?> next = it2.next();
                    String key2 = next.getKey();
                    Set set = eVar3.f32808b;
                    if (set != null ? set.contains(key2) : true) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(hg.e eVar, ck.c cVar, int i4) {
        super(3, cVar);
        this.f22259b = i4;
        this.f22261d = eVar;
    }
}
