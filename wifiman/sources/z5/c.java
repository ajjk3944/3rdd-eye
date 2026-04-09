package z5;

import f5.InterfaceC5536b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f67057a = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f67058a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5536b f67059b;

        public a(Class cls, InterfaceC5536b interfaceC5536b) {
            this.f67058a = cls;
            this.f67059b = interfaceC5536b;
        }

        final InterfaceC5536b a() {
            return this.f67059b;
        }

        final Class b() {
            return this.f67058a;
        }
    }

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.f67057a.put(aVar.b(), aVar.a());
        }
    }
}
