package Q0;

import Q0.AbstractC3442t;
import Yg.u;
import android.content.Context;
import android.graphics.Typeface;
import dh.InterfaceC5380e;
import org.snmp4j.mp.PduHandle;

/* renamed from: Q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3424a implements G {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19021a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f19022b;

    /* renamed from: Q0.a$a, reason: collision with other inner class name */
    static final class C0669a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f19023a;

        /* renamed from: b, reason: collision with root package name */
        Object f19024b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f19025c;

        /* renamed from: e, reason: collision with root package name */
        int f19027e;

        C0669a(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19025c = obj;
            this.f19027e |= PduHandle.NONE;
            return C3424a.this.b(null, this);
        }
    }

    public C3424a(Context context) {
        this.f19021a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Q0.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(Q0.InterfaceC3433j r5, dh.InterfaceC5380e r6) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Q0.C3424a.C0669a
            if (r0 == 0) goto L13
            r0 = r6
            Q0.a$a r0 = (Q0.C3424a.C0669a) r0
            int r1 = r0.f19027e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19027e = r1
            goto L18
        L13:
            Q0.a$a r0 = new Q0.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19025c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f19027e
            r3 = 2
            if (r2 == 0) goto L40
            r5 = 1
            if (r2 == r5) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f19024b
            Q0.j r5 = (Q0.InterfaceC3433j) r5
            java.lang.Object r0 = r0.f19023a
            Q0.a r0 = (Q0.C3424a) r0
            Yg.v.b(r6)
            goto L5a
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            Yg.v.b(r6)
            return r6
        L40:
            Yg.v.b(r6)
            boolean r6 = r5 instanceof Q0.N
            if (r6 == 0) goto L69
            r6 = r5
            Q0.N r6 = (Q0.N) r6
            android.content.Context r2 = r4.f19021a
            r0.f19023a = r4
            r0.f19024b = r5
            r0.f19027e = r3
            java.lang.Object r6 = Q0.AbstractC3425b.b(r6, r2, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r4
        L5a:
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            Q0.N r5 = (Q0.N) r5
            Q0.z r5 = r5.e()
            android.content.Context r0 = r0.f19021a
            android.graphics.Typeface r5 = Q0.M.c(r6, r5, r0)
            return r5
        L69:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C3424a.b(Q0.j, dh.e):java.lang.Object");
    }

    @Override // Q0.G
    public Object c() {
        return this.f19022b;
    }

    @Override // Q0.G
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface a(InterfaceC3433j interfaceC3433j) {
        Object objC;
        Typeface typefaceC;
        if (!(interfaceC3433j instanceof N)) {
            return null;
        }
        int iA = interfaceC3433j.a();
        AbstractC3442t.a aVar = AbstractC3442t.f19096a;
        if (AbstractC3442t.e(iA, aVar.b())) {
            typefaceC = AbstractC3425b.c((N) interfaceC3433j, this.f19021a);
        } else {
            if (!AbstractC3442t.e(iA, aVar.c())) {
                if (AbstractC3442t.e(iA, aVar.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) AbstractC3442t.g(interfaceC3433j.a())));
            }
            try {
                u.a aVar2 = Yg.u.f25017b;
                objC = Yg.u.c(AbstractC3425b.c((N) interfaceC3433j, this.f19021a));
            } catch (Throwable th2) {
                u.a aVar3 = Yg.u.f25017b;
                objC = Yg.u.c(Yg.v.a(th2));
            }
            typefaceC = (Typeface) (Yg.u.l(objC) ? null : objC);
        }
        return M.c(typefaceC, ((N) interfaceC3433j).e(), this.f19021a);
    }
}
