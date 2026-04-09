package N7;

import N7.C1294o5;
import c9.C2092m;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFunction.kt */
/* renamed from: N7.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210i5 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1224j5> f8399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8400b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8401c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC1404w4 f8402d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f8403e;

    public C1210i5(List<C1224j5> list, String str, String str2, EnumC1404w4 enumC1404w4) {
        this.f8399a = list;
        this.f8400b = str;
        this.f8401c = str2;
        this.f8402d = enumC1404w4;
    }

    public final boolean a(C1210i5 c1210i5, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (c1210i5 == null) {
            return false;
        }
        List<C1224j5> list = this.f8399a;
        int size = list.size();
        List<C1224j5> list2 = c1210i5.f8399a;
        if (size == list2.size()) {
            Iterator<T> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (!kotlin.jvm.internal.l.b(this.f8400b, c1210i5.f8400b) || !kotlin.jvm.internal.l.b(this.f8401c, c1210i5.f8401c) || this.f8402d != c1210i5.f8402d) {
                        break;
                    }
                    return true;
                }
                Object next = it.next();
                int i10 = i + 1;
                if (i < 0) {
                    C2092m.a0();
                    throw null;
                }
                C1224j5 c1224j5 = list2.get(i);
                C1224j5 c1224j52 = (C1224j5) next;
                c1224j52.getClass();
                if (c1224j5 == null || !kotlin.jvm.internal.l.b(c1224j52.f8485a, c1224j5.f8485a) || c1224j52.f8486b != c1224j5.f8486b) {
                    break;
                }
                i = i10;
            }
        }
        return false;
    }

    public final int b() {
        int iIntValue;
        Integer num = this.f8403e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(C1210i5.class).hashCode();
        int i = 0;
        for (C1224j5 c1224j5 : this.f8399a) {
            Integer num2 = c1224j5.f8487c;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode2 = c1224j5.f8486b.hashCode() + c1224j5.f8485a.hashCode() + kotlin.jvm.internal.x.a(C1224j5.class).hashCode();
                c1224j5.f8487c = Integer.valueOf(iHashCode2);
                iIntValue = iHashCode2;
            }
            i += iIntValue;
        }
        int iHashCode3 = this.f8402d.hashCode() + this.f8401c.hashCode() + this.f8400b.hashCode() + iHashCode + i;
        this.f8403e = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1294o5.a) D7.a.f1071b.f6463F3.getValue()).b(D7.a.f1070a, this);
    }
}
