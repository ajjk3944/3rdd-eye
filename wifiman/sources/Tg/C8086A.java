package tg;

import java.util.Objects;
import og.AbstractC7133c;

/* renamed from: tg.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8086A extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final Object[] f62111a;

    /* renamed from: tg.A$a */
    static final class a extends AbstractC7133c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62112a;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f62113b;

        /* renamed from: c, reason: collision with root package name */
        int f62114c;

        /* renamed from: d, reason: collision with root package name */
        boolean f62115d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f62116e;

        a(gg.x xVar, Object[] objArr) {
            this.f62112a = xVar;
            this.f62113b = objArr;
        }

        void a() {
            Object[] objArr = this.f62113b;
            int length = objArr.length;
            for (int i10 = 0; i10 < length && !isDisposed(); i10++) {
                Object obj = objArr[i10];
                if (obj == null) {
                    this.f62112a.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                this.f62112a.h(obj);
            }
            if (isDisposed()) {
                return;
            }
            this.f62112a.a();
        }

        @Override // Dg.g
        public void clear() {
            this.f62114c = this.f62113b.length;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62116e = true;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62116e;
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return this.f62114c == this.f62113b.length;
        }

        @Override // Dg.g
        public Object poll() {
            int i10 = this.f62114c;
            Object[] objArr = this.f62113b;
            if (i10 == objArr.length) {
                return null;
            }
            this.f62114c = i10 + 1;
            Object obj = objArr[i10];
            Objects.requireNonNull(obj, "The array element is null");
            return obj;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f62115d = true;
            return 1;
        }
    }

    public C8086A(Object[] objArr) {
        this.f62111a = objArr;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        a aVar = new a(xVar, this.f62111a);
        xVar.c(aVar);
        if (aVar.f62115d) {
            return;
        }
        aVar.a();
    }
}
