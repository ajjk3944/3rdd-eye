package io.sentry.android.sqlite;

import android.database.CursorWindow;
import br.l;
import br.n;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import lq.b0;
import lq.k;
import lr.m1;
import lr.r1;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12042d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12043g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12044r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12045x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Object obj, Object obj2, int i11) {
        super(0);
        this.f12042d = i11;
        this.f12044r = obj;
        this.f12043g = i10;
        this.f12045x = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, lq.h] */
    @Override // ar.a
    public final Object c() {
        switch (this.f12042d) {
            case 0:
                ((c) this.f12044r).f12049a.fillWindow(this.f12043g, (CursorWindow) this.f12045x);
                return b0.f15562a;
            default:
                m1 m1Var = (m1) this.f12044r;
                r1 r1Var = m1Var.f15645d;
                Type type = r1Var != null ? (Type) r1Var.c() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    l.d(componentType, "{\n                      …                        }");
                    return componentType;
                }
                boolean z10 = type instanceof GenericArrayType;
                int i10 = this.f12043g;
                if (z10) {
                    if (i10 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        l.d(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new k("Array type has been queried for a non-0th argument: " + m1Var, 1);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new k("Non-generic type has been queried for arguments: " + m1Var, 1);
                }
                Type type2 = (Type) ((List) this.f12045x.getValue()).get(i10);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    l.d(lowerBounds, "argument.lowerBounds");
                    Type type3 = (Type) mq.l.n0(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        l.d(upperBounds, "argument.upperBounds");
                        type2 = (Type) mq.l.m0(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
                l.d(type2, "{\n                      …                        }");
                return type2;
        }
    }
}
