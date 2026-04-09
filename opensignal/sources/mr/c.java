package mr;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16951a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16952b;

    /* renamed from: c, reason: collision with root package name */
    public final a f16953c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16954d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f16955e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f16956f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16957g;

    public c(Class cls, ArrayList arrayList, a aVar, b bVar, List list) {
        br.l.e(cls, "jClass");
        br.l.e(aVar, "callMode");
        br.l.e(bVar, "origin");
        br.l.e(list, "methods");
        this.f16951a = cls;
        this.f16952b = arrayList;
        this.f16953c = aVar;
        this.f16954d = list;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f16955e = arrayList2;
        List list2 = this.f16954d;
        ArrayList arrayList3 = new ArrayList(mq.p.a0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            br.l.d(returnType, "it");
            List list3 = xr.d.f25493a;
            Class<?> cls2 = (Class) xr.d.f25495c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f16956f = arrayList3;
        List list4 = this.f16954d;
        ArrayList arrayList4 = new ArrayList(mq.p.a0(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f16957g = arrayList4;
        if (this.f16953c == a.POSITIONAL_CALL && bVar == b.JAVA && !mq.o.B0(this.f16952b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // mr.g
    public final List a() {
        return this.f16955e;
    }

    @Override // mr.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // mr.g
    public final Type i() {
        return this.f16951a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // mr.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(java.lang.Object[] r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.c.s(java.lang.Object[]):java.lang.Object");
    }

    public /* synthetic */ c(Class cls, ArrayList arrayList, a aVar, b bVar) {
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, aVar, bVar, arrayList2);
    }
}
