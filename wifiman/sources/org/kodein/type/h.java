package org.kodein.type;

import Zg.AbstractC3682n;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class h extends e {

    /* renamed from: h, reason: collision with root package name */
    private final ParameterizedType f56957h;

    public h(ParameterizedType jvmType) {
        AbstractC6492s.i(jvmType, "jvmType");
        this.f56957h = jvmType;
    }

    @Override // org.kodein.type.q
    public boolean a() {
        return true;
    }

    @Override // org.kodein.type.q
    public q[] b() {
        Type[] actualTypeArguments = e().getActualTypeArguments();
        AbstractC6492s.h(actualTypeArguments, "jvmType.actualTypeArguments");
        ArrayList arrayList = new ArrayList(actualTypeArguments.length);
        for (Type it : actualTypeArguments) {
            AbstractC6492s.h(it, "it");
            arrayList.add(s.e(it));
        }
        return (q[]) arrayList.toArray(new q[0]);
    }

    @Override // org.kodein.type.q
    public q c() {
        return new f(j.f(e()));
    }

    @Override // org.kodein.type.q
    public boolean f() {
        TypeVariable[] typeParameters = j.f(e()).getTypeParameters();
        AbstractC6492s.h(typeParameters, "jvmType.rawClass.typeParameters");
        int length = typeParameters.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            TypeVariable typeVariable = typeParameters[i10];
            int i12 = i11 + 1;
            Type type = e().getActualTypeArguments()[i11];
            if (!AbstractC6492s.d(type, Object.class)) {
                if (type instanceof WildcardType) {
                    Type[] bounds = typeVariable.getBounds();
                    AbstractC6492s.h(bounds, "variable.bounds");
                    for (Type type2 : bounds) {
                        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                        AbstractC6492s.h(upperBounds, "argument.upperBounds");
                        if (AbstractC3682n.U(upperBounds, type2)) {
                        }
                    }
                }
                return false;
            }
            i10++;
            i11 = i12;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    @Override // org.kodein.type.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List g() {
        /*
            r11 = this;
            java.lang.reflect.ParameterizedType r0 = r11.e()
            java.lang.Class r0 = org.kodein.type.j.f(r0)
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            if (r0 != 0) goto L1a
            java.lang.reflect.ParameterizedType r0 = r11.e()
            java.lang.Class r0 = org.kodein.type.j.f(r0)
            java.lang.Class r0 = r0.getSuperclass()
        L1a:
            if (r0 == 0) goto L40
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = kotlin.jvm.internal.AbstractC6492s.d(r0, r1)
            if (r1 != 0) goto L26
        L24:
            r2 = r0
            goto L28
        L26:
            r0 = 0
            goto L24
        L28:
            if (r2 == 0) goto L40
            java.lang.reflect.ParameterizedType r1 = r11.e()
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            java.lang.reflect.Type r0 = org.kodein.type.j.j(r1, r2, r3, r4, r5, r6)
            org.kodein.type.i r0 = org.kodein.type.s.e(r0)
            java.util.List r0 = Zg.AbstractC3689v.e(r0)
            if (r0 != 0) goto L44
        L40:
            java.util.List r0 = Zg.AbstractC3689v.l()
        L44:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.reflect.ParameterizedType r1 = r11.e()
            java.lang.Class r1 = org.kodein.type.j.f(r1)
            java.lang.reflect.Type[] r1 = r1.getGenericInterfaces()
            java.lang.String r2 = "jvmType.rawClass.genericInterfaces"
            kotlin.jvm.internal.AbstractC6492s.h(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = 0
        L60:
            if (r4 >= r3) goto L80
            r6 = r1[r4]
            java.lang.reflect.ParameterizedType r5 = r11.e()
            java.lang.String r7 = "it"
            kotlin.jvm.internal.AbstractC6492s.h(r6, r7)
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            java.lang.reflect.Type r5 = org.kodein.type.j.j(r5, r6, r7, r8, r9, r10)
            org.kodein.type.i r5 = org.kodein.type.s.e(r5)
            r2.add(r5)
            int r4 = r4 + 1
            goto L60
        L80:
            java.util.List r0 = Zg.AbstractC3689v.M0(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kodein.type.h.g():java.util.List");
    }

    @Override // org.kodein.type.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ParameterizedType e() {
        return this.f56957h;
    }
}
