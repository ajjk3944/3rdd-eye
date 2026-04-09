package org.kodein.type;

import Zg.AbstractC3689v;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class g extends e {

    /* renamed from: h, reason: collision with root package name */
    private final GenericArrayType f56956h;

    public g(GenericArrayType jvmType) {
        AbstractC6492s.i(jvmType, "jvmType");
        this.f56956h = jvmType;
    }

    @Override // org.kodein.type.q
    public boolean a() {
        return true;
    }

    @Override // org.kodein.type.q
    public q[] b() {
        Type genericComponentType = e().getGenericComponentType();
        AbstractC6492s.h(genericComponentType, "jvmType.genericComponentType");
        return new q[]{s.e(genericComponentType)};
    }

    @Override // org.kodein.type.q
    public q c() {
        Type genericComponentType = e().getGenericComponentType();
        AbstractC6492s.h(genericComponentType, "jvmType.genericComponentType");
        Type typeE = j.e(s.e(genericComponentType).c());
        Class cls = typeE instanceof Class ? (Class) typeE : null;
        if (cls == null) {
            throw new IllegalStateException("Could not get raw array component type.");
        }
        i iVarE = s.e(j.g(cls));
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.TypeToken<T of org.kodein.type.JVMGenericArrayTypeToken>");
        return iVarE;
    }

    @Override // org.kodein.type.q
    public boolean f() {
        return AbstractC6492s.d(e().getGenericComponentType(), Object.class) || (e().getGenericComponentType() instanceof WildcardType);
    }

    @Override // org.kodein.type.q
    public List g() {
        return AbstractC3689v.l();
    }

    @Override // org.kodein.type.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public GenericArrayType e() {
        return this.f56956h;
    }
}
