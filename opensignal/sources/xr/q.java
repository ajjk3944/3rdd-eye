package xr;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* loaded from: classes.dex */
public final class q extends b0 implements hs.d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f25511a;

    /* renamed from: b, reason: collision with root package name */
    public final s f25512b;

    public q(Type type) {
        s oVar;
        br.l.e(type, "reflectType");
        this.f25511a = type;
        if (type instanceof Class) {
            oVar = new o((Class) type);
        } else if (type instanceof TypeVariable) {
            oVar = new c0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            br.l.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            oVar = new o((Class) rawType);
        }
        this.f25512b = oVar;
    }

    @Override // xr.b0, hs.b
    public final e a(qs.c cVar) {
        br.l.e(cVar, "fqName");
        return null;
    }

    @Override // xr.b0
    public final Type b() {
        return this.f25511a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList c() {
        /*
            r6 = this;
            java.lang.reflect.Type r0 = r6.f25511a
            java.util.List r0 = xr.d.c(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = mq.p.a0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.String r3 = "type"
            br.l.e(r2, r3)
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L39
            r4 = r2
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r5 = r4.isPrimitive()
            if (r5 == 0) goto L39
            xr.z r2 = new xr.z
            r2.<init>(r4)
            goto L62
        L39:
            boolean r4 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r4 != 0) goto L5c
            if (r3 == 0) goto L49
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L49
            goto L5c
        L49:
            boolean r3 = r2 instanceof java.lang.reflect.WildcardType
            if (r3 == 0) goto L56
            xr.e0 r3 = new xr.e0
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            r3.<init>(r2)
        L54:
            r2 = r3
            goto L62
        L56:
            xr.q r3 = new xr.q
            r3.<init>(r2)
            goto L54
        L5c:
            xr.i r3 = new xr.i
            r3.<init>(r2)
            goto L54
        L62:
            r1.add(r2)
            goto L15
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.q.c():java.util.ArrayList");
    }

    public final boolean d() {
        Type type = this.f25511a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            br.l.d(typeParameters, "getTypeParameters()");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // hs.b
    public final Collection getAnnotations() {
        return mq.w.f16945a;
    }
}
