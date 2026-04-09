package bj;

import Xi.m;
import Xi.n;
import Zg.AbstractC3689v;
import Zg.U;
import aj.AbstractC3868b;
import aj.InterfaceC3860A;
import bj.C4131n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final C4131n.a f33459a = new C4131n.a();

    /* renamed from: b, reason: collision with root package name */
    private static final C4131n.a f33460b = new C4131n.a();

    private static final Map b(Xi.f fVar, AbstractC3868b abstractC3868b) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(abstractC3868b, fVar);
        n(fVar, abstractC3868b);
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            List listG = fVar.g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof aj.z) {
                    arrayList.add(obj);
                }
            }
            aj.z zVar = (aj.z) AbstractC3689v.T0(arrayList);
            if (zVar != null && (strArrNames = zVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        AbstractC6492s.h(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, lowerCase2, i10);
                }
            }
            if (zD) {
                lowerCase = fVar.f(i10).toLowerCase(Locale.ROOT);
                AbstractC6492s.h(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, fVar, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? U.h() : linkedHashMap;
    }

    private static final void c(Map map, Xi.f fVar, String str, int i10) {
        String str2 = AbstractC6492s.d(fVar.h(), m.b.f24469a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i10) + " is already one of the names for " + str2 + ' ' + fVar.f(((Number) U.i(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(AbstractC3868b abstractC3868b, Xi.f fVar) {
        return abstractC3868b.e().h() && AbstractC6492s.d(fVar.h(), m.b.f24469a);
    }

    public static final Map e(final AbstractC3868b abstractC3868b, final Xi.f descriptor) {
        AbstractC6492s.i(abstractC3868b, "<this>");
        AbstractC6492s.i(descriptor, "descriptor");
        return (Map) aj.I.a(abstractC3868b).b(descriptor, f33459a, new InterfaceC6824a() { // from class: bj.s
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return t.f(descriptor, abstractC3868b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(Xi.f fVar, AbstractC3868b abstractC3868b) {
        return b(fVar, abstractC3868b);
    }

    public static final C4131n.a g() {
        return f33459a;
    }

    public static final String h(Xi.f fVar, AbstractC3868b json, int i10) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(json, "json");
        n(fVar, json);
        return fVar.f(i10);
    }

    public static final int i(Xi.f fVar, AbstractC3868b json, String name) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC6492s.h(lowerCase, "toLowerCase(...)");
            return l(fVar, json, lowerCase);
        }
        n(fVar, json);
        int iD = fVar.d(name);
        return (iD == -3 && json.e().o()) ? l(fVar, json, name) : iD;
    }

    public static final int j(Xi.f fVar, AbstractC3868b json, String name, String suffix) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(suffix, "suffix");
        int i10 = i(fVar, json, name);
        if (i10 != -3) {
            return i10;
        }
        throw new SerializationException(fVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int k(Xi.f fVar, AbstractC3868b abstractC3868b, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return j(fVar, abstractC3868b, str, str2);
    }

    private static final int l(Xi.f fVar, AbstractC3868b abstractC3868b, String str) {
        Integer num = (Integer) e(abstractC3868b, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean m(Xi.f fVar, AbstractC3868b json) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(json, "json");
        if (!json.e().k()) {
            List annotations = fVar.getAnnotations();
            if (!(annotations instanceof Collection) || !annotations.isEmpty()) {
                Iterator it = annotations.iterator();
                while (it.hasNext()) {
                    if (((Annotation) it.next()) instanceof aj.u) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final InterfaceC3860A n(Xi.f fVar, AbstractC3868b json) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(json, "json");
        if (!AbstractC6492s.d(fVar.h(), n.a.f24470a)) {
            return null;
        }
        json.e().l();
        return null;
    }
}
