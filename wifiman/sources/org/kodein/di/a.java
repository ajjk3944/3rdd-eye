package org.kodein.di;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.text.t;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.C7719k2;

/* loaded from: classes4.dex */
public abstract class a {
    public static final String a(Map map, boolean z10, int i10) {
        AbstractC6492s.i(map, "<this>");
        return c(map, z10, i10, new F() { // from class: org.kodein.di.a.a
            @Override // kotlin.jvm.internal.F, th.n
            public Object get(Object obj) {
                return ((DI.e) obj).e();
            }
        }, new F() { // from class: org.kodein.di.a.b
            @Override // kotlin.jvm.internal.F, th.n
            public Object get(Object obj) {
                return ((uj.e) obj).a();
            }
        });
    }

    public static /* synthetic */ String b(Map map, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            i10 = 8;
        }
        return a(map, z10, i10);
    }

    private static final String c(Map map, boolean z10, int i10, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        Set setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : setEntrySet) {
            String strB = ((C7719k2) AbstractC3689v.q0((List) ((Map.Entry) obj).getValue())).b();
            Object arrayList = linkedHashMap.get(strB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        List<String> listV0 = AbstractC3689v.V0(AbstractC3689v.n0(linkedHashMap.keySet()));
        StringBuilder sb2 = new StringBuilder();
        List list = (List) linkedHashMap.get(null);
        if (list != null) {
            d(sb2, interfaceC6835l, interfaceC6835l2, z10, i10, list);
        }
        for (String str : listV0) {
            sb2.append(t.H(" ", i10) + "module " + str + " {\n");
            Object obj2 = linkedHashMap.get(str);
            AbstractC6492s.f(obj2);
            d(sb2, interfaceC6835l, interfaceC6835l2, z10, i10 + 4, (List) obj2);
            sb2.append(t.H(" ", i10) + "}\n");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final void d(StringBuilder sb2, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, boolean z10, int i10, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) interfaceC6835l.invoke(entry.getKey());
            sb2.append(t.H(" ", i10) + str + " { " + ((String) interfaceC6835l2.invoke(((C7719k2) AbstractC3689v.q0((List) entry.getValue())).a())) + " }");
            if (z10) {
                int length = str.length() - 4;
                Iterator it2 = ((List) entry.getValue()).subList(1, ((List) entry.getValue()).size()).iterator();
                while (it2.hasNext()) {
                    sb2.append(t.H(" ", length) + "overrides " + ((String) interfaceC6835l2.invoke(((C7719k2) it2.next()).a())));
                }
            }
            sb2.append("\n");
        }
    }

    public static final String e(Map map, boolean z10, int i10) {
        AbstractC6492s.i(map, "<this>");
        return c(map, z10, i10, new F() { // from class: org.kodein.di.a.c
            @Override // kotlin.jvm.internal.F, th.n
            public Object get(Object obj) {
                return ((DI.e) obj).f();
            }
        }, new F() { // from class: org.kodein.di.a.d
            @Override // kotlin.jvm.internal.F, th.n
            public Object get(Object obj) {
                return ((uj.e) obj).f();
            }
        });
    }

    public static /* synthetic */ String f(Map map, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            i10 = 8;
        }
        return e(map, z10, i10);
    }
}
