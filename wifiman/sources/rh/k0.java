package Rh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h f19933a;

    /* renamed from: b, reason: collision with root package name */
    private static final C3478f f19934b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19935a;

        static {
            int[] iArr = new int[EnumC3483k.values().length];
            try {
                iArr[EnumC3483k.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3483k.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19935a = iArr;
        }
    }

    static {
        Zh.c ENHANCED_NULLABILITY_ANNOTATION = Jh.I.f10123v;
        AbstractC6492s.h(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f19933a = new C3478f(ENHANCED_NULLABILITY_ANNOTATION);
        Zh.c ENHANCED_MUTABILITY_ANNOTATION = Jh.I.f10124w;
        AbstractC6492s.h(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f19934b = new C3478f(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h e(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new kotlin.reflect.jvm.internal.impl.descriptors.annotations.o(AbstractC3689v.i1(list)) : (kotlin.reflect.jvm.internal.impl.descriptors.annotations.h) AbstractC3689v.R0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2498h f(InterfaceC2498h interfaceC2498h, C3480h c3480h, h0 h0Var) {
        Ah.d dVar = Ah.d.f791a;
        if (!i0.a(h0Var) || !(interfaceC2498h instanceof InterfaceC2495e)) {
            return null;
        }
        if (c3480h.e() == EnumC3481i.READ_ONLY && h0Var == h0.FLEXIBLE_LOWER) {
            InterfaceC2495e interfaceC2495e = (InterfaceC2495e) interfaceC2498h;
            if (dVar.c(interfaceC2495e)) {
                return dVar.a(interfaceC2495e);
            }
        }
        if (c3480h.e() != EnumC3481i.MUTABLE || h0Var != h0.FLEXIBLE_UPPER) {
            return null;
        }
        InterfaceC2495e interfaceC2495e2 = (InterfaceC2495e) interfaceC2498h;
        if (dVar.d(interfaceC2495e2)) {
            return dVar.b(interfaceC2495e2);
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.h g() {
        return f19933a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(C3480h c3480h, h0 h0Var) {
        if (!i0.a(h0Var)) {
            return null;
        }
        EnumC3483k enumC3483kF = c3480h.f();
        int i10 = enumC3483kF == null ? -1 : a.f19935a[enumC3483kF.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(pi.S s10) {
        AbstractC6492s.i(s10, "<this>");
        return l0.c(kotlin.reflect.jvm.internal.impl.types.checker.s.f52171a, s10);
    }
}
