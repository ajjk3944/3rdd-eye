package t5;

import f.AbstractC5487d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class m {

    private static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f61790a;

        class a extends b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f61791b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f61791b = method;
            }

            @Override // t5.m.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f61791b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* renamed from: t5.m$b$b, reason: collision with other inner class name */
        class C2172b extends b {
            C2172b() {
                super();
            }

            @Override // t5.m.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (e.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C2172b();
            }
            f61790a = aVar;
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f61790a.a(accessibleObject, obj);
    }

    public static com.google.gson.l b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return com.google.gson.l.ALLOW;
        }
        AbstractC5487d.a(it.next());
        throw null;
    }
}
