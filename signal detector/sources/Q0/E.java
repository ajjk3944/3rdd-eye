package q0;

import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public final class E extends I {

    /* renamed from: n, reason: collision with root package name */
    public final Class f22922n;

    public E(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f22922n = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // q0.I, q0.J
    public final String b() {
        return this.f22922n.getName();
    }

    @Override // q0.I
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(String str) {
        Object obj;
        q5.i.e(str, "value");
        Class cls = this.f22922n;
        Object[] enumConstants = cls.getEnumConstants();
        q5.i.d(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (y5.l.X(((Enum) obj).name(), str)) {
                break;
            }
            i++;
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder sbQ = AbstractC1135f5.q("Enum value ", str, " not found for type ");
        sbQ.append(cls.getName());
        sbQ.append('.');
        throw new IllegalArgumentException(sbQ.toString());
    }
}
