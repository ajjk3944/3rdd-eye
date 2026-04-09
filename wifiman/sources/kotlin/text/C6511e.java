package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import nh.InterfaceC6944a;
import sh.AbstractC7978m;
import sh.C7974i;
import zi.InterfaceC8780j;

/* renamed from: kotlin.text.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6511e implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f52223a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52224b;

    /* renamed from: c, reason: collision with root package name */
    private final int f52225c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6839p f52226d;

    /* renamed from: kotlin.text.e$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private int f52227a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f52228b;

        /* renamed from: c, reason: collision with root package name */
        private int f52229c;

        /* renamed from: d, reason: collision with root package name */
        private C7974i f52230d;

        /* renamed from: e, reason: collision with root package name */
        private int f52231e;

        a() {
            int iK = AbstractC7978m.k(C6511e.this.f52224b, 0, C6511e.this.f52223a.length());
            this.f52228b = iK;
            this.f52229c = iK;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void d() {
            /*
                r6 = this;
                int r0 = r6.f52229c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f52227a = r1
                r0 = 0
                r6.f52230d = r0
                goto L9e
            Lc:
                kotlin.text.e r0 = kotlin.text.C6511e.this
                int r0 = kotlin.text.C6511e.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f52231e
                int r0 = r0 + r3
                r6.f52231e = r0
                kotlin.text.e r4 = kotlin.text.C6511e.this
                int r4 = kotlin.text.C6511e.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f52229c
                kotlin.text.e r4 = kotlin.text.C6511e.this
                java.lang.CharSequence r4 = kotlin.text.C6511e.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                sh.i r0 = new sh.i
                int r1 = r6.f52228b
                kotlin.text.e r4 = kotlin.text.C6511e.this
                java.lang.CharSequence r4 = kotlin.text.C6511e.d(r4)
                int r4 = kotlin.text.t.e0(r4)
                r0.<init>(r1, r4)
                r6.f52230d = r0
                r6.f52229c = r2
                goto L9c
            L47:
                kotlin.text.e r0 = kotlin.text.C6511e.this
                mh.p r0 = kotlin.text.C6511e.c(r0)
                kotlin.text.e r4 = kotlin.text.C6511e.this
                java.lang.CharSequence r4 = kotlin.text.C6511e.d(r4)
                int r5 = r6.f52229c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                Yg.s r0 = (Yg.s) r0
                if (r0 != 0) goto L77
                sh.i r0 = new sh.i
                int r1 = r6.f52228b
                kotlin.text.e r4 = kotlin.text.C6511e.this
                java.lang.CharSequence r4 = kotlin.text.C6511e.d(r4)
                int r4 = kotlin.text.t.e0(r4)
                r0.<init>(r1, r4)
                r6.f52230d = r0
                r6.f52229c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.c()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f52228b
                sh.i r4 = sh.AbstractC7978m.s(r4, r2)
                r6.f52230d = r4
                int r2 = r2 + r0
                r6.f52228b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f52229c = r2
            L9c:
                r6.f52227a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C6511e.a.d():void");
        }

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C7974i next() {
            if (this.f52227a == -1) {
                d();
            }
            if (this.f52227a == 0) {
                throw new NoSuchElementException();
            }
            C7974i c7974i = this.f52230d;
            AbstractC6492s.g(c7974i, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f52230d = null;
            this.f52227a = -1;
            return c7974i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52227a == -1) {
                d();
            }
            return this.f52227a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6511e(CharSequence input, int i10, int i11, InterfaceC6839p getNextMatch) {
        AbstractC6492s.i(input, "input");
        AbstractC6492s.i(getNextMatch, "getNextMatch");
        this.f52223a = input;
        this.f52224b = i10;
        this.f52225c = i11;
        this.f52226d = getNextMatch;
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a();
    }
}
