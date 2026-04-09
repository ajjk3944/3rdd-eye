package kotlin.jvm.internal;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class W implements th.q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f51695a = new a(null);

    public static final class a {

        /* renamed from: kotlin.jvm.internal.W$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1919a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f51696a;

            static {
                int[] iArr = new int[th.s.values().length];
                try {
                    iArr[th.s.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[th.s.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[th.s.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f51696a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(th.q typeParameter) {
            AbstractC6492s.i(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C1919a.f51696a[typeParameter.p().ordinal()];
            if (i10 == 1) {
                Yg.J j10 = Yg.J.f24997a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            return sb2.toString();
        }

        private a() {
        }
    }
}
