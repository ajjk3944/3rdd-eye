package Q9;

import b9.C2001h;
import c9.C2091l;
import java.lang.Enum;
import java.util.Arrays;
import p9.InterfaceC5480a;

/* compiled from: Enums.kt */
/* loaded from: classes3.dex */
public final class D<T extends Enum<T>> implements M9.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T[] f11401a;

    /* renamed from: b, reason: collision with root package name */
    public C f11402b;

    /* renamed from: c, reason: collision with root package name */
    public final b9.p f11403c;

    /* compiled from: Enums.kt */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<O9.e> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ D<T> f11404g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f11405h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D<T> d10, String str) {
            super(0);
            this.f11404g = d10;
            this.f11405h = str;
        }

        @Override // p9.InterfaceC5480a
        public final O9.e invoke() {
            D<T> d10 = this.f11404g;
            C c10 = d10.f11402b;
            if (c10 == null) {
                T[] tArr = d10.f11401a;
                c10 = new C(this.f11405h, tArr.length);
                for (T t10 : tArr) {
                    c10.k(t10.name(), false);
                }
            }
            return c10;
        }
    }

    public D(String str, T[] tArr) {
        this.f11401a = tArr;
        this.f11403c = C2001h.b(new a(this, str));
    }

    @Override // M9.b
    public final Object deserialize(P9.d dVar) {
        int iH = dVar.H(getDescriptor());
        T[] tArr = this.f11401a;
        if (iH >= 0 && iH < tArr.length) {
            return tArr[iH];
        }
        throw new M9.i(iH + " is not among valid " + getDescriptor().a() + " enum values, values size is " + tArr.length);
    }

    @Override // M9.b
    public final O9.e getDescriptor() {
        return (O9.e) this.f11403c.getValue();
    }

    @Override // M9.b
    public final void serialize(P9.e eVar, Object obj) {
        Enum value = (Enum) obj;
        kotlin.jvm.internal.l.f(value, "value");
        T[] tArr = this.f11401a;
        int iO = C2091l.o(tArr, value);
        if (iO != -1) {
            eVar.p(getDescriptor(), iO);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String string = Arrays.toString(tArr);
        kotlin.jvm.internal.l.e(string, "toString(this)");
        sb.append(string);
        throw new M9.i(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
