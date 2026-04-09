package Sh;

import Sh.s;
import gi.C5922d;
import gi.EnumC5923e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f20806a = new u();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20807a;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.l.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.l.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f20807a = iArr;
        }
    }

    private u() {
    }

    @Override // Sh.t
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s d(s possiblyPrimitiveType) {
        AbstractC6492s.i(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof s.d)) {
            return possiblyPrimitiveType;
        }
        s.d dVar = (s.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String strF = C5922d.c(dVar.i().getWrapperFqName()).f();
        AbstractC6492s.h(strF, "getInternalName(...)");
        return c(strF);
    }

    @Override // Sh.t
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public s b(String representation) {
        EnumC5923e enumC5923e;
        AbstractC6492s.i(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        EnumC5923e[] enumC5923eArrValues = EnumC5923e.values();
        int length = enumC5923eArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumC5923e = null;
                break;
            }
            enumC5923e = enumC5923eArrValues[i10];
            if (enumC5923e.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (enumC5923e != null) {
            return new s.d(enumC5923e);
        }
        if (cCharAt == 'V') {
            return new s.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            AbstractC6492s.h(strSubstring, "substring(...)");
            return new s.a(b(strSubstring));
        }
        if (cCharAt == 'L') {
            kotlin.text.t.a0(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        AbstractC6492s.h(strSubstring2, "substring(...)");
        return new s.c(strSubstring2);
    }

    @Override // Sh.t
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s.c c(String internalName) {
        AbstractC6492s.i(internalName, "internalName");
        return new s.c(internalName);
    }

    @Override // Sh.t
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public s f(kotlin.reflect.jvm.internal.impl.builtins.l primitiveType) {
        AbstractC6492s.i(primitiveType, "primitiveType");
        switch (a.f20807a[primitiveType.ordinal()]) {
            case 1:
                return s.f20794a.a();
            case 2:
                return s.f20794a.c();
            case 3:
                return s.f20794a.b();
            case 4:
                return s.f20794a.h();
            case 5:
                return s.f20794a.f();
            case 6:
                return s.f20794a.e();
            case 7:
                return s.f20794a.g();
            case 8:
                return s.f20794a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // Sh.t
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public s e() {
        return c("java/lang/Class");
    }

    @Override // Sh.t
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String a(s type) {
        String desc;
        AbstractC6492s.i(type, "type");
        if (type instanceof s.a) {
            return '[' + a(((s.a) type).i());
        }
        if (type instanceof s.d) {
            EnumC5923e enumC5923eI = ((s.d) type).i();
            return (enumC5923eI == null || (desc = enumC5923eI.getDesc()) == null) ? "V" : desc;
        }
        if (!(type instanceof s.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((s.c) type).i() + ';';
    }
}
