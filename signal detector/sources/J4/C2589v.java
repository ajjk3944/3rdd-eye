package j4;

import b4.C0344i;
import g4.InterfaceC2336A;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l4.AbstractC2649c;
import n4.C2689a;

/* renamed from: j4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2589v implements InterfaceC2336A {

    /* renamed from: a, reason: collision with root package name */
    public final C0344i f21457a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.h f21458b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.e f21459c;

    /* renamed from: d, reason: collision with root package name */
    public final C2579k f21460d;

    public C2589v(C0344i c0344i, g4.h hVar, i4.e eVar, C2579k c2579k) {
        List list = Collections.EMPTY_LIST;
        this.f21457a = c0344i;
        this.f21458b = hVar;
        this.f21459c = eVar;
        this.f21460d = c2579k;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC2649c.c(field) + " and " + AbstractC2649c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        Class cls = c2689a.f22327a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        R3.b bVar = AbstractC2649c.f21863a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new g4.j(2);
        }
        List list = Collections.EMPTY_LIST;
        i4.i.e();
        return AbstractC2649c.f21863a.t(cls) ? new C2588u(cls, c(mVar, c2689a, cls, true)) : new C2586s(this.f21457a.r(c2689a, true), c(mVar, c2689a, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j4.C2587t c(g4.m r30, n4.C2689a r31, java.lang.Class r32, boolean r33) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C2589v.c(g4.m, n4.a, java.lang.Class, boolean):j4.t");
    }

    public final boolean d(Field field, boolean z6) {
        boolean z7;
        i4.e eVar = this.f21459c;
        eVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || eVar.b(field.getType(), z6)) {
            z7 = true;
        } else {
            List list = z6 ? eVar.f20597a : eVar.f20598b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw A.f.f(it);
                }
            }
            z7 = false;
        }
        return !z7;
    }
}
