package I2;

import java.util.Queue;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final W2.h f8505a;

    class a extends W2.h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // W2.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue f8507d = W2.l.f(0);

        /* renamed from: a, reason: collision with root package name */
        private int f8508a;

        /* renamed from: b, reason: collision with root package name */
        private int f8509b;

        /* renamed from: c, reason: collision with root package name */
        private Object f8510c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f8507d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f8510c = obj;
            this.f8509b = i10;
            this.f8508a = i11;
        }

        public void c() {
            Queue queue = f8507d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8509b == bVar.f8509b && this.f8508a == bVar.f8508a && this.f8510c.equals(bVar.f8510c);
        }

        public int hashCode() {
            return (((this.f8508a * 31) + this.f8509b) * 31) + this.f8510c.hashCode();
        }
    }

    public m(long j10) {
        this.f8505a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b bVarA = b.a(obj, i10, i11);
        Object objG = this.f8505a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f8505a.k(b.a(obj, i10, i11), obj2);
    }
}
