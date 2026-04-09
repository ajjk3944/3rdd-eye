package O5;

import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;
import r.InterfaceC7533i;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17565a;

    /* renamed from: b, reason: collision with root package name */
    private final E6.d f17566b;

    /* renamed from: c, reason: collision with root package name */
    private final E6.c f17567c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7533i f17568d;

    /* renamed from: O5.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0605a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17569a;

        static {
            int[] iArr = new int[E6.d.values().length];
            try {
                iArr[E6.d.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[E6.d.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17569a = iArr;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f17570a;

        /* renamed from: b, reason: collision with root package name */
        Object f17571b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f17572c;

        /* renamed from: e, reason: collision with root package name */
        int f17574e;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17572c = obj;
            this.f17574e |= PduHandle.NONE;
            return a.this.c(null, null, null, this);
        }
    }

    public a(boolean z10, E6.d initialScroll, E6.c autoScrollCondition, InterfaceC7533i autoScrollAnimationSpec) {
        AbstractC6492s.i(initialScroll, "initialScroll");
        AbstractC6492s.i(autoScrollCondition, "autoScrollCondition");
        AbstractC6492s.i(autoScrollAnimationSpec, "autoScrollAnimationSpec");
        this.f17565a = z10;
        this.f17566b = initialScroll;
        this.f17567c = autoScrollCondition;
        this.f17568d = autoScrollAnimationSpec;
    }

    public final E6.d a() {
        return this.f17566b;
    }

    public final boolean b() {
        return this.f17565a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(x6.b r6, x6.b r7, O5.c r8, dh.InterfaceC5380e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof O5.a.b
            if (r0 == 0) goto L13
            r0 = r9
            O5.a$b r0 = (O5.a.b) r0
            int r1 = r0.f17574e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17574e = r1
            goto L18
        L13:
            O5.a$b r0 = new O5.a$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f17572c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f17574e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2c
            Yg.v.b(r9)
            goto L97
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.f17571b
            r8 = r6
            O5.c r8 = (O5.c) r8
            java.lang.Object r6 = r0.f17570a
            O5.a r6 = (O5.a) r6
            Yg.v.b(r9)
            goto L63
        L42:
            Yg.v.b(r9)
            E6.c r9 = r5.f17567c
            boolean r6 = r9.a(r6, r7)
            if (r6 == 0) goto L9a
            boolean r6 = r8.a()
            if (r6 == 0) goto L62
            s.L r6 = s.EnumC7839L.PreventUserInput
            r0.f17570a = r5
            r0.f17571b = r8
            r0.f17574e = r4
            java.lang.Object r6 = w.u.c(r8, r6, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            r6 = r5
        L63:
            E6.d r7 = r6.f17566b
            int[] r9 = O5.a.C0605a.f17569a
            int r7 = r7.ordinal()
            r7 = r9[r7]
            if (r7 == r4) goto L82
            if (r7 != r3) goto L7c
            float r7 = r8.i()
            float r7 = -r7
            float r9 = r8.h()
            float r7 = r7 + r9
            goto L87
        L7c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L82:
            float r7 = r8.i()
            float r7 = -r7
        L87:
            r.i r6 = r6.f17568d
            r9 = 0
            r0.f17570a = r9
            r0.f17571b = r9
            r0.f17574e = r3
            java.lang.Object r6 = w.u.a(r8, r7, r6, r0)
            if (r6 != r1) goto L97
            return r1
        L97:
            Yg.J r6 = Yg.J.f24997a
            return r6
        L9a:
            Yg.J r6 = Yg.J.f24997a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.a.c(x6.b, x6.b, O5.c, dh.e):java.lang.Object");
    }
}
