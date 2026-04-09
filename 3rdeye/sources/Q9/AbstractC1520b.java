package Q9;

import t4.C5606d;
import w9.InterfaceC5748c;

/* compiled from: AbstractPolymorphicSerializer.kt */
/* renamed from: Q9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1520b<T> implements M9.b<T> {
    public abstract InterfaceC5748c<T> a();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M9.b
    public final T deserialize(P9.d dVar) {
        M9.g gVar = (M9.g) this;
        O9.e descriptor = gVar.getDescriptor();
        P9.b bVarD = dVar.d(descriptor);
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        T t10 = null;
        while (true) {
            int iX = bVarD.x(gVar.getDescriptor());
            if (iX == -1) {
                if (t10 != null) {
                    bVarD.b(descriptor);
                    return t10;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) wVar.f43660b)).toString());
            }
            if (iX == 0) {
                wVar.f43660b = (T) bVarD.n(gVar.getDescriptor(), iX);
            } else {
                if (iX != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) wVar.f43660b;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iX);
                    throw new M9.i(sb.toString());
                }
                T t11 = wVar.f43660b;
                if (t11 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                wVar.f43660b = t11;
                String str2 = (String) t11;
                M9.b bVarT = bVarD.a().T(str2, a());
                if (bVarT == null) {
                    C5606d.F(str2, a());
                    throw null;
                }
                t10 = (T) bVarD.h(gVar.getDescriptor(), iX, bVarT, null);
            }
        }
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, T value) {
        kotlin.jvm.internal.l.f(value, "value");
        M9.b bVarT = A9.I.t(this, eVar, value);
        M9.g gVar = (M9.g) this;
        O9.e descriptor = gVar.getDescriptor();
        P9.c cVarD = eVar.d(descriptor);
        cVarD.k(gVar.getDescriptor(), 0, bVarT.getDescriptor().a());
        cVarD.y(gVar.getDescriptor(), 1, bVarT, value);
        cVarD.b(descriptor);
    }
}
