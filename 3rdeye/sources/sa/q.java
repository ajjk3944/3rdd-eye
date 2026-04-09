package sa;

import N7.C1154e9;
import U9.D;
import U9.s;
import U9.w;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import sa.C5589a;

/* compiled from: ParameterHandler.java */
/* loaded from: classes3.dex */
public abstract class q<T> {

    /* compiled from: ParameterHandler.java */
    public static final class a<T> extends q<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46242a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46243b;

        /* renamed from: c, reason: collision with root package name */
        public final sa.f<T, D> f46244c;

        public a(Method method, int i, sa.f<T, D> fVar) {
            this.f46242a = method;
            this.f46243b = i;
            this.f46244c = fVar;
        }

        @Override // sa.q
        public final void a(s sVar, T t10) {
            Method method = this.f46242a;
            int i = this.f46243b;
            if (t10 == null) {
                throw A.j(method, i, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                sVar.f46296k = this.f46244c.convert(t10);
            } catch (IOException e4) {
                throw A.k(method, e4, i, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class b<T> extends q<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f46245a;

        /* renamed from: b, reason: collision with root package name */
        public final C5589a.d f46246b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46247c;

        public b(String str, boolean z10) {
            C5589a.d dVar = C5589a.d.f46194a;
            Objects.requireNonNull(str, "name == null");
            this.f46245a = str;
            this.f46246b = dVar;
            this.f46247c = z10;
        }

        @Override // sa.q
        public final void a(s sVar, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            this.f46246b.getClass();
            String string = t10.toString();
            if (string == null) {
                return;
            }
            sVar.a(this.f46245a, string, this.f46247c);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class c<T> extends q<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46248a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46249b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46250c;

        public c(Method method, int i, boolean z10) {
            this.f46248a = method;
            this.f46249b = i;
            this.f46250c = z10;
        }

        @Override // sa.q
        public final void a(s sVar, Object obj) throws IOException {
            Map map = (Map) obj;
            Method method = this.f46248a;
            int i = this.f46249b;
            if (map == null) {
                throw A.j(method, i, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw A.j(method, i, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw A.j(method, i, C1154e9.i("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw A.j(method, i, "Field map value '" + value + "' converted to null by " + C5589a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                sVar.a(str, string, this.f46250c);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class d<T> extends q<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f46251a;

        /* renamed from: b, reason: collision with root package name */
        public final C5589a.d f46252b;

        public d(String str) {
            C5589a.d dVar = C5589a.d.f46194a;
            Objects.requireNonNull(str, "name == null");
            this.f46251a = str;
            this.f46252b = dVar;
        }

        @Override // sa.q
        public final void a(s sVar, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            this.f46252b.getClass();
            String string = t10.toString();
            if (string == null) {
                return;
            }
            sVar.b(this.f46251a, string);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class e<T> extends q<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46253a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46254b;

        public e(int i, Method method) {
            this.f46253a = method;
            this.f46254b = i;
        }

        @Override // sa.q
        public final void a(s sVar, Object obj) throws IOException {
            Map map = (Map) obj;
            Method method = this.f46253a;
            int i = this.f46254b;
            if (map == null) {
                throw A.j(method, i, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw A.j(method, i, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw A.j(method, i, C1154e9.i("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                sVar.b(str, value.toString());
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class f extends q<U9.s> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46255a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46256b;

        public f(int i, Method method) {
            this.f46255a = method;
            this.f46256b = i;
        }

        @Override // sa.q
        public final void a(s sVar, U9.s sVar2) throws IOException {
            U9.s sVar3 = sVar2;
            if (sVar3 == null) {
                throw A.j(this.f46255a, this.f46256b, "Headers parameter must not be null.", new Object[0]);
            }
            s.a aVar = sVar.f46292f;
            aVar.getClass();
            int size = sVar3.size();
            for (int i = 0; i < size; i++) {
                aVar.c(sVar3.d(i), sVar3.f(i));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class g<T> extends q<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46257a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46258b;

        /* renamed from: c, reason: collision with root package name */
        public final U9.s f46259c;

        /* renamed from: d, reason: collision with root package name */
        public final sa.f<T, D> f46260d;

        public g(Method method, int i, U9.s sVar, sa.f<T, D> fVar) {
            this.f46257a = method;
            this.f46258b = i;
            this.f46259c = sVar;
            this.f46260d = fVar;
        }

        @Override // sa.q
        public final void a(s sVar, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                sVar.c(this.f46259c, this.f46260d.convert(t10));
            } catch (IOException e4) {
                throw A.j(this.f46257a, this.f46258b, "Unable to convert " + t10 + " to RequestBody", e4);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class h<T> extends q<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46261a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46262b;

        /* renamed from: c, reason: collision with root package name */
        public final sa.f<T, D> f46263c;

        /* renamed from: d, reason: collision with root package name */
        public final String f46264d;

        public h(Method method, int i, sa.f<T, D> fVar, String str) {
            this.f46261a = method;
            this.f46262b = i;
            this.f46263c = fVar;
            this.f46264d = str;
        }

        @Override // sa.q
        public final void a(s sVar, Object obj) throws IOException {
            Map map = (Map) obj;
            Method method = this.f46261a;
            int i = this.f46262b;
            if (map == null) {
                throw A.j(method, i, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw A.j(method, i, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw A.j(method, i, C1154e9.i("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                sVar.c(s.b.c("Content-Disposition", C1154e9.i("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f46264d), (D) this.f46263c.convert(value));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class i<T> extends q<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46265a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46266b;

        /* renamed from: c, reason: collision with root package name */
        public final String f46267c;

        /* renamed from: d, reason: collision with root package name */
        public final C5589a.d f46268d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f46269e;

        public i(Method method, int i, String str, boolean z10) {
            C5589a.d dVar = C5589a.d.f46194a;
            this.f46265a = method;
            this.f46266b = i;
            Objects.requireNonNull(str, "name == null");
            this.f46267c = str;
            this.f46268d = dVar;
            this.f46269e = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
        @Override // sa.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(sa.s r18, T r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: sa.q.i.a(sa.s, java.lang.Object):void");
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class j<T> extends q<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f46270a;

        /* renamed from: b, reason: collision with root package name */
        public final C5589a.d f46271b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46272c;

        public j(String str, boolean z10) {
            C5589a.d dVar = C5589a.d.f46194a;
            Objects.requireNonNull(str, "name == null");
            this.f46270a = str;
            this.f46271b = dVar;
            this.f46272c = z10;
        }

        @Override // sa.q
        public final void a(s sVar, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            this.f46271b.getClass();
            String string = t10.toString();
            if (string == null) {
                return;
            }
            sVar.d(this.f46270a, string, this.f46272c);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class k<T> extends q<Map<String, T>> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46273a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46274b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46275c;

        public k(Method method, int i, boolean z10) {
            this.f46273a = method;
            this.f46274b = i;
            this.f46275c = z10;
        }

        @Override // sa.q
        public final void a(s sVar, Object obj) throws IOException {
            Map map = (Map) obj;
            Method method = this.f46273a;
            int i = this.f46274b;
            if (map == null) {
                throw A.j(method, i, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw A.j(method, i, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw A.j(method, i, C1154e9.i("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw A.j(method, i, "Query map value '" + value + "' converted to null by " + C5589a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                sVar.d(str, string, this.f46275c);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class l<T> extends q<T> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f46276a;

        public l(boolean z10) {
            this.f46276a = z10;
        }

        @Override // sa.q
        public final void a(s sVar, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            sVar.d(t10.toString(), null, this.f46276a);
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class m extends q<w.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f46277a = new m();

        @Override // sa.q
        public final void a(s sVar, w.b bVar) throws IOException {
            w.b bVar2 = bVar;
            if (bVar2 != null) {
                w.a aVar = sVar.i;
                aVar.getClass();
                aVar.f12744c.add(bVar2);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class n extends q<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Method f46278a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46279b;

        public n(int i, Method method) {
            this.f46278a = method;
            this.f46279b = i;
        }

        @Override // sa.q
        public final void a(s sVar, Object obj) {
            if (obj != null) {
                sVar.f46289c = obj.toString();
            } else {
                throw A.j(this.f46278a, this.f46279b, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    public static final class o<T> extends q<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f46280a;

        public o(Class<T> cls) {
            this.f46280a = cls;
        }

        @Override // sa.q
        public final void a(s sVar, T t10) {
            sVar.f46291e.e(this.f46280a, t10);
        }
    }

    public abstract void a(s sVar, T t10) throws IOException;
}
