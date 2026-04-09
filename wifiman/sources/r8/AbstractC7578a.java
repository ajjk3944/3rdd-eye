package r8;

import Cc.AbstractC2558b;
import k8.AbstractC6402b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import rd.b;
import s9.InterfaceC7929a;

/* renamed from: r8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7578a {

    /* renamed from: r8.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2091a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60131a;

        static {
            int[] iArr = new int[b.a.EnumC2104a.values().length];
            try {
                iArr[b.a.EnumC2104a.PHONE_ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.EnumC2104a.TABLET_ANDROID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.a.EnumC2104a.PHONE_IOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.a.EnumC2104a.TABLE_IOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f60131a = iArr;
        }
    }

    public static final InterfaceC7929a.b a(b.a.EnumC2104a enumC2104a) {
        AbstractC2558b abstractC2558b;
        AbstractC6492s.i(enumC2104a, "<this>");
        int i10 = C2091a.f60131a[enumC2104a.ordinal()];
        if (i10 == 1) {
            abstractC2558b = AbstractC2558b.a.C0118a.f2480b;
        } else if (i10 == 2) {
            abstractC2558b = AbstractC2558b.a.C0119b.f2481b;
        } else if (i10 == 3) {
            abstractC2558b = AbstractC2558b.AbstractC0120b.d.f2486c;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC2558b = AbstractC2558b.AbstractC0120b.c.f2485c;
        }
        return AbstractC6402b.b(abstractC2558b);
    }
}
