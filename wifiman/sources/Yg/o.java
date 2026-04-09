package Yg;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class o {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25014a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25014a = iArr;
        }
    }

    public static m a(q mode, InterfaceC6824a initializer) {
        AbstractC6492s.i(mode, "mode");
        AbstractC6492s.i(initializer, "initializer");
        int i10 = a.f25014a[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new x(initializer, defaultConstructorMarker, i11, defaultConstructorMarker);
        }
        if (i10 == 2) {
            return new w(initializer);
        }
        if (i10 == 3) {
            return new K(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static m b(InterfaceC6824a initializer) {
        AbstractC6492s.i(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new x(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }
}
