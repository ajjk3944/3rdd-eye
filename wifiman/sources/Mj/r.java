package Mj;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
abstract class r {

    class a extends r {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Mj.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                r.this.a(uVar, it.next());
            }
        }
    }

    class b extends r {
        b() {
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                r.this.a(uVar, Array.get(obj, i10));
            }
        }
    }

    static final class c extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13393a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13394b;

        /* renamed from: c, reason: collision with root package name */
        private final Mj.h f13395c;

        c(Method method, int i10, Mj.h hVar) {
            this.f13393a = method;
            this.f13394b = i10;
            this.f13395c = hVar;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            if (obj == null) {
                throw B.p(this.f13393a, this.f13394b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                uVar.l((RequestBody) this.f13395c.a(obj));
            } catch (IOException e10) {
                throw B.q(this.f13393a, e10, this.f13394b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d extends r {

        /* renamed from: a, reason: collision with root package name */
        private final String f13396a;

        /* renamed from: b, reason: collision with root package name */
        private final Mj.h f13397b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f13398c;

        d(String str, Mj.h hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f13396a = str;
            this.f13397b = hVar;
            this.f13398c = z10;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f13397b.a(obj)) == null) {
                return;
            }
            uVar.a(this.f13396a, str, this.f13398c);
        }
    }

    static final class e extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13399a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13400b;

        /* renamed from: c, reason: collision with root package name */
        private final Mj.h f13401c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f13402d;

        e(Method method, int i10, Mj.h hVar, boolean z10) {
            this.f13399a = method;
            this.f13400b = i10;
            this.f13401c = hVar;
            this.f13402d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Mj.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Map map) {
            if (map == null) {
                throw B.p(this.f13399a, this.f13400b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw B.p(this.f13399a, this.f13400b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw B.p(this.f13399a, this.f13400b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f13401c.a(value);
                if (str2 == null) {
                    throw B.p(this.f13399a, this.f13400b, "Field map value '" + value + "' converted to null by " + this.f13401c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                uVar.a(str, str2, this.f13402d);
            }
        }
    }

    static final class f extends r {

        /* renamed from: a, reason: collision with root package name */
        private final String f13403a;

        /* renamed from: b, reason: collision with root package name */
        private final Mj.h f13404b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f13405c;

        f(String str, Mj.h hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f13403a = str;
            this.f13404b = hVar;
            this.f13405c = z10;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f13404b.a(obj)) == null) {
                return;
            }
            uVar.b(this.f13403a, str, this.f13405c);
        }
    }

    static final class g extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13406a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13407b;

        /* renamed from: c, reason: collision with root package name */
        private final Mj.h f13408c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f13409d;

        g(Method method, int i10, Mj.h hVar, boolean z10) {
            this.f13406a = method;
            this.f13407b = i10;
            this.f13408c = hVar;
            this.f13409d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Mj.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Map map) {
            if (map == null) {
                throw B.p(this.f13406a, this.f13407b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw B.p(this.f13406a, this.f13407b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw B.p(this.f13406a, this.f13407b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                uVar.b(str, (String) this.f13408c.a(value), this.f13409d);
            }
        }
    }

    static final class h extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13410a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13411b;

        h(Method method, int i10) {
            this.f13410a = method;
            this.f13411b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Mj.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Headers headers) {
            if (headers == null) {
                throw B.p(this.f13410a, this.f13411b, "Headers parameter must not be null.", new Object[0]);
            }
            uVar.c(headers);
        }
    }

    static final class i extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13412a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13413b;

        /* renamed from: c, reason: collision with root package name */
        private final Headers f13414c;

        /* renamed from: d, reason: collision with root package name */
        private final Mj.h f13415d;

        i(Method method, int i10, Headers headers, Mj.h hVar) {
            this.f13412a = method;
            this.f13413b = i10;
            this.f13414c = headers;
            this.f13415d = hVar;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                uVar.d(this.f13414c, (RequestBody) this.f13415d.a(obj));
            } catch (IOException e10) {
                throw B.p(this.f13412a, this.f13413b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    static final class j extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13416a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13417b;

        /* renamed from: c, reason: collision with root package name */
        private final Mj.h f13418c;

        /* renamed from: d, reason: collision with root package name */
        private final String f13419d;

        j(Method method, int i10, Mj.h hVar, String str) {
            this.f13416a = method;
            this.f13417b = i10;
            this.f13418c = hVar;
            this.f13419d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Mj.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Map map) {
            if (map == null) {
                throw B.p(this.f13416a, this.f13417b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw B.p(this.f13416a, this.f13417b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw B.p(this.f13416a, this.f13417b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                uVar.d(Headers.i("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f13419d), (RequestBody) this.f13418c.a(value));
            }
        }
    }

    static final class k extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13420a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13421b;

        /* renamed from: c, reason: collision with root package name */
        private final String f13422c;

        /* renamed from: d, reason: collision with root package name */
        private final Mj.h f13423d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f13424e;

        k(Method method, int i10, String str, Mj.h hVar, boolean z10) {
            this.f13420a = method;
            this.f13421b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f13422c = str;
            this.f13423d = hVar;
            this.f13424e = z10;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) throws EOFException {
            if (obj != null) {
                uVar.f(this.f13422c, (String) this.f13423d.a(obj), this.f13424e);
                return;
            }
            throw B.p(this.f13420a, this.f13421b, "Path parameter \"" + this.f13422c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l extends r {

        /* renamed from: a, reason: collision with root package name */
        private final String f13425a;

        /* renamed from: b, reason: collision with root package name */
        private final Mj.h f13426b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f13427c;

        l(String str, Mj.h hVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f13425a = str;
            this.f13426b = hVar;
            this.f13427c = z10;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f13426b.a(obj)) == null) {
                return;
            }
            uVar.g(this.f13425a, str, this.f13427c);
        }
    }

    static final class m extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13428a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13429b;

        /* renamed from: c, reason: collision with root package name */
        private final Mj.h f13430c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f13431d;

        m(Method method, int i10, Mj.h hVar, boolean z10) {
            this.f13428a = method;
            this.f13429b = i10;
            this.f13430c = hVar;
            this.f13431d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Mj.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, Map map) {
            if (map == null) {
                throw B.p(this.f13428a, this.f13429b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw B.p(this.f13428a, this.f13429b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw B.p(this.f13428a, this.f13429b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f13430c.a(value);
                if (str2 == null) {
                    throw B.p(this.f13428a, this.f13429b, "Query map value '" + value + "' converted to null by " + this.f13430c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                uVar.g(str, str2, this.f13431d);
            }
        }
    }

    static final class n extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Mj.h f13432a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13433b;

        n(Mj.h hVar, boolean z10) {
            this.f13432a = hVar;
            this.f13433b = z10;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            if (obj == null) {
                return;
            }
            uVar.g((String) this.f13432a.a(obj), null, this.f13433b);
        }
    }

    static final class o extends r {

        /* renamed from: a, reason: collision with root package name */
        static final o f13434a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Mj.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, MultipartBody.Part part) {
            if (part != null) {
                uVar.e(part);
            }
        }
    }

    static final class p extends r {

        /* renamed from: a, reason: collision with root package name */
        private final Method f13435a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13436b;

        p(Method method, int i10) {
            this.f13435a = method;
            this.f13436b = i10;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            if (obj == null) {
                throw B.p(this.f13435a, this.f13436b, "@Url parameter is null.", new Object[0]);
            }
            uVar.m(obj);
        }
    }

    static final class q extends r {

        /* renamed from: a, reason: collision with root package name */
        final Class f13437a;

        q(Class cls) {
            this.f13437a = cls;
        }

        @Override // Mj.r
        void a(u uVar, Object obj) {
            uVar.h(this.f13437a, obj);
        }
    }

    r() {
    }

    abstract void a(u uVar, Object obj);

    final r b() {
        return new b();
    }

    final r c() {
        return new a();
    }
}
