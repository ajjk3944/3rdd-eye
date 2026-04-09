package di;

import Bh.G;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import pi.S;

/* renamed from: di.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5400i {

    /* renamed from: a, reason: collision with root package name */
    public static final C5400i f46097a = new C5400i();

    private C5400i() {
    }

    private final C5393b b(List list, G g10, kotlin.reflect.jvm.internal.impl.builtins.l lVar) {
        List listI1 = AbstractC3689v.i1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listI1.iterator();
        while (it.hasNext()) {
            AbstractC5398g abstractC5398gF = f(this, it.next(), null, 2, null);
            if (abstractC5398gF != null) {
                arrayList.add(abstractC5398gF);
            }
        }
        if (g10 == null) {
            return new C5393b(arrayList, new C5399h(lVar));
        }
        AbstractC7346d0 abstractC7346d0O = g10.q().O(lVar);
        AbstractC6492s.h(abstractC7346d0O, "getPrimitiveArrayKotlinType(...)");
        return new z(arrayList, abstractC7346d0O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(kotlin.reflect.jvm.internal.impl.builtins.l lVar, G it) {
        AbstractC6492s.i(it, "it");
        AbstractC7346d0 abstractC7346d0O = it.q().O(lVar);
        AbstractC6492s.h(abstractC7346d0O, "getPrimitiveArrayKotlinType(...)");
        return abstractC7346d0O;
    }

    public static /* synthetic */ AbstractC5398g f(C5400i c5400i, Object obj, G g10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            g10 = null;
        }
        return c5400i.e(obj, g10);
    }

    public final C5393b c(List value, S type) {
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(type, "type");
        return new z(value, type);
    }

    public final AbstractC5398g e(Object obj, G g10) {
        if (obj instanceof Byte) {
            return new C5395d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C5396e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C5401j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C5394c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        if (obj instanceof byte[]) {
            return b(AbstractC3682n.X0((byte[]) obj), g10, kotlin.reflect.jvm.internal.impl.builtins.l.BYTE);
        }
        if (obj instanceof short[]) {
            return b(AbstractC3682n.e1((short[]) obj), g10, kotlin.reflect.jvm.internal.impl.builtins.l.SHORT);
        }
        if (obj instanceof int[]) {
            return b(AbstractC3682n.b1((int[]) obj), g10, kotlin.reflect.jvm.internal.impl.builtins.l.INT);
        }
        if (obj instanceof long[]) {
            return b(AbstractC3682n.c1((long[]) obj), g10, kotlin.reflect.jvm.internal.impl.builtins.l.LONG);
        }
        if (obj instanceof char[]) {
            return b(AbstractC3682n.Y0((char[]) obj), g10, kotlin.reflect.jvm.internal.impl.builtins.l.CHAR);
        }
        if (obj instanceof float[]) {
            return b(AbstractC3682n.a1((float[]) obj), g10, kotlin.reflect.jvm.internal.impl.builtins.l.FLOAT);
        }
        if (obj instanceof double[]) {
            return b(AbstractC3682n.Z0((double[]) obj), g10, kotlin.reflect.jvm.internal.impl.builtins.l.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return b(AbstractC3682n.f1((boolean[]) obj), g10, kotlin.reflect.jvm.internal.impl.builtins.l.BOOLEAN);
        }
        if (obj == null) {
            return new u();
        }
        return null;
    }
}
