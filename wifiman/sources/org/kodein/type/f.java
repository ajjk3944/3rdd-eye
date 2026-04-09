package org.kodein.type;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class f extends e {

    /* renamed from: h, reason: collision with root package name */
    private final Class f56955h;

    public f(Class jvmType) {
        AbstractC6492s.i(jvmType, "jvmType");
        this.f56955h = jvmType;
    }

    @Override // org.kodein.type.q
    public boolean a() {
        return false;
    }

    @Override // org.kodein.type.q
    public q[] b() {
        TypeVariable[] typeParameters = e().getTypeParameters();
        AbstractC6492s.h(typeParameters, "jvmType.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            Type type = typeVariable.getBounds()[0];
            AbstractC6492s.h(type, "it.bounds[0]");
            arrayList.add(s.e(type));
        }
        return (q[]) arrayList.toArray(new q[0]);
    }

    @Override // org.kodein.type.a, org.kodein.type.q
    public boolean d(q typeToken) {
        AbstractC6492s.i(typeToken, "typeToken");
        return typeToken instanceof f ? e().isAssignableFrom(((f) typeToken).e()) : super.d(typeToken);
    }

    @Override // org.kodein.type.q
    public boolean f() {
        return !e().isArray() || AbstractC6492s.d(e().getComponentType(), Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // org.kodein.type.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List g() {
        /*
            r7 = this;
            java.lang.Class r0 = r7.e()
            java.lang.reflect.Type r0 = org.kodein.type.j.c(r0)
            if (r0 == 0) goto L24
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r0, r1)
            if (r1 != 0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L24
            java.lang.reflect.Type r0 = org.kodein.type.j.k(r0)
            org.kodein.type.i r0 = org.kodein.type.s.e(r0)
            java.util.List r0 = Zg.AbstractC3689v.e(r0)
            if (r0 != 0) goto L28
        L24:
            java.util.List r0 = Zg.AbstractC3689v.l()
        L28:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Class r1 = r7.e()
            java.lang.reflect.Type[] r1 = r1.getGenericInterfaces()
            java.lang.String r2 = "jvmType.genericInterfaces"
            kotlin.jvm.internal.AbstractC6492s.h(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = 0
        L40:
            if (r4 >= r3) goto L58
            r5 = r1[r4]
            java.lang.String r6 = "it"
            kotlin.jvm.internal.AbstractC6492s.h(r5, r6)
            java.lang.reflect.Type r5 = org.kodein.type.j.k(r5)
            org.kodein.type.i r5 = org.kodein.type.s.e(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L40
        L58:
            java.util.List r0 = Zg.AbstractC3689v.M0(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kodein.type.f.g():java.util.List");
    }

    @Override // org.kodein.type.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Class e() {
        return this.f56955h;
    }

    @Override // org.kodein.type.q
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public f c() {
        return this;
    }
}
