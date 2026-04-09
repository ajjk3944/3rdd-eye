package I2;

import I2.n;
import com.bumptech.glide.load.data.d;

/* loaded from: classes.dex */
public class w implements n {

    /* renamed from: a, reason: collision with root package name */
    private static final w f8547a = new w();

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private static final a f8548a = new a();

        public static a a() {
            return f8548a;
        }

        @Override // I2.o
        public n d(r rVar) {
            return w.c();
        }
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final Object f8549a;

        b(Object obj) {
            this.f8549a = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f8549a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public C2.a d() {
            return C2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            aVar.f(this.f8549a);
        }
    }

    public static w c() {
        return f8547a;
    }

    @Override // I2.n
    public n.a a(Object obj, int i10, int i11, C2.g gVar) {
        return new n.a(new V2.b(obj), new b(obj));
    }

    @Override // I2.n
    public boolean b(Object obj) {
        return true;
    }
}
