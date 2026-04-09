package s6;

import H6.C0672i;
import H6.C0675l;
import b9.C1992A;
import i7.l;
import kotlin.jvm.internal.w;
import o6.C5428e;

/* compiled from: TwoWayVariableBinder.kt */
/* loaded from: classes.dex */
public abstract class i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Q6.d f46092a;

    /* renamed from: b, reason: collision with root package name */
    public final C5428e f46093b;

    /* compiled from: TwoWayVariableBinder.kt */
    public interface a<T> {
        void b(T t10);

        void c(b bVar);
    }

    /* compiled from: TwoWayVariableBinder.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<T, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ w<T> f46094g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ C0675l f46095h;
        public final /* synthetic */ String i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ i<T> f46096j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ C0672i f46097k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w<T> wVar, C0675l c0675l, String str, i<T> iVar, C0672i c0672i) {
            super(1);
            this.f46094g = wVar;
            this.f46095h = c0675l;
            this.i = str;
            this.f46096j = iVar;
            this.f46097k = c0672i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p9.l
        public final C1992A invoke(Object obj) {
            w<T> wVar = this.f46094g;
            if (!kotlin.jvm.internal.l.b(wVar.f43660b, obj)) {
                wVar.f43660b = obj;
                l.a aVar = i7.l.f38481a;
                String strB = this.f46096j.b(obj);
                A7.d dVar = this.f46097k.f2147b;
                aVar.getClass();
                l.a.a(this.f46095h, this.i, strB, dVar);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: TwoWayVariableBinder.kt */
    public static final class c extends kotlin.jvm.internal.m implements p9.l<Z6.d, C1992A> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ w<T> f46098g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ a<T> f46099h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w<T> wVar, a<T> aVar) {
            super(1);
            this.f46098g = wVar;
            this.f46099h = aVar;
        }

        @Override // p9.l
        public final C1992A invoke(Z6.d dVar) {
            Z6.d changed = dVar;
            kotlin.jvm.internal.l.f(changed, "changed");
            T t10 = (T) changed.b();
            if (t10 == null) {
                t10 = null;
            }
            w<T> wVar = this.f46098g;
            if (!kotlin.jvm.internal.l.b(wVar.f43660b, t10)) {
                wVar.f43660b = t10;
                this.f46099h.b(t10);
            }
            return C1992A.f18074a;
        }
    }

    public i(Q6.d dVar, C5428e c5428e) {
        this.f46092a = dVar;
        this.f46093b = c5428e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j6.d a(H6.C0672i r9, java.lang.String r10, s6.i.a<T> r11, z6.C5865d r12) {
        /*
            r8 = this;
            java.lang.String r0 = "bindingContext"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "variableName"
            kotlin.jvm.internal.l.f(r10, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.l.f(r12, r0)
            H6.l r3 = r9.f2146a
            N7.U3 r12 = r3.getDivData()
            if (r12 != 0) goto L1a
            j6.c r9 = j6.d.f42990m8
            return r9
        L1a:
            kotlin.jvm.internal.w r2 = new kotlin.jvm.internal.w
            r2.<init>()
            i6.a r0 = r3.getDataTag()
            p6.h r1 = r9.f2148c
            if (r1 == 0) goto L38
            A7.d r4 = r9.f2147b
            o6.c r1 = r1.c(r4)
            if (r1 == 0) goto L32
            s6.k r1 = r1.f44858b
            goto L33
        L32:
            r1 = 0
        L33:
            if (r1 != 0) goto L36
            goto L38
        L36:
            r7 = r1
            goto L41
        L38:
            o6.e r1 = r8.f46093b
            o6.c r1 = r1.b(r0, r12, r3)
            s6.k r1 = r1.f44858b
            goto L36
        L41:
            s6.i$b r1 = new s6.i$b
            r5 = r8
            r6 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r11.c(r1)
            Q6.d r9 = r5.f46092a
            Q6.c r9 = r9.a(r12, r0)
            s6.i$c r10 = new s6.i$c
            r10.<init>(r2, r11)
            r11 = 1
            j6.d r9 = r7.o(r4, r9, r11, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.a(H6.i, java.lang.String, s6.i$a, z6.d):j6.d");
    }

    public abstract String b(T t10);
}
