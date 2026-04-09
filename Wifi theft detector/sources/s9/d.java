package s9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class d implements kotlin.sequences.g {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f24349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24350b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24351c;

    /* renamed from: d, reason: collision with root package name */
    public final l9.p f24352d;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public int f24353a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f24354b;

        /* renamed from: c, reason: collision with root package name */
        public int f24355c;

        /* renamed from: d, reason: collision with root package name */
        public q9.c f24356d;

        /* renamed from: e, reason: collision with root package name */
        public int f24357e;

        public a() {
            int iF = q9.e.f(d.this.f24350b, 0, d.this.f24349a.length());
            this.f24354b = iF;
            this.f24355c = iF;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f24355c
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f24353a = r1
                r0 = 0
                r6.f24356d = r0
                return
            Lb:
                s9.d r0 = s9.d.this
                int r0 = s9.d.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f24357e
                int r0 = r0 + r3
                r6.f24357e = r0
                s9.d r4 = s9.d.this
                int r4 = s9.d.e(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f24355c
                s9.d r4 = s9.d.this
                java.lang.CharSequence r4 = s9.d.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                q9.c r0 = new q9.c
                int r1 = r6.f24354b
                s9.d r4 = s9.d.this
                java.lang.CharSequence r4 = s9.d.d(r4)
                int r4 = s9.u.V(r4)
                r0.<init>(r1, r4)
                r6.f24356d = r0
                r6.f24355c = r2
                goto L9b
            L46:
                s9.d r0 = s9.d.this
                l9.p r0 = s9.d.c(r0)
                s9.d r4 = s9.d.this
                java.lang.CharSequence r4 = s9.d.d(r4)
                int r5 = r6.f24355c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L76
                q9.c r0 = new q9.c
                int r1 = r6.f24354b
                s9.d r4 = s9.d.this
                java.lang.CharSequence r4 = s9.d.d(r4)
                int r4 = s9.u.V(r4)
                r0.<init>(r1, r4)
                r6.f24356d = r0
                r6.f24355c = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.getFirst()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.getSecond()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f24354b
                q9.c r4 = q9.e.j(r4, r2)
                r6.f24356d = r4
                int r2 = r2 + r0
                r6.f24354b = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f24355c = r2
            L9b:
                r6.f24353a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s9.d.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q9.c next() {
            if (this.f24353a == -1) {
                a();
            }
            if (this.f24353a == 0) {
                throw new NoSuchElementException();
            }
            q9.c cVar = this.f24356d;
            kotlin.jvm.internal.p.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f24356d = null;
            this.f24353a = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24353a == -1) {
                a();
            }
            return this.f24353a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(CharSequence input, int i10, int i11, l9.p getNextMatch) {
        kotlin.jvm.internal.p.e(input, "input");
        kotlin.jvm.internal.p.e(getNextMatch, "getNextMatch");
        this.f24349a = input;
        this.f24350b = i10;
        this.f24351c = i11;
        this.f24352d = getNextMatch;
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a();
    }
}
