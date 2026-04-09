package J2;

import I2.n;
import I2.o;
import I2.r;
import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9729a;

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f9730a;

        public a(Context context) {
            this.f9730a = context;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new b(this.f9730a);
        }
    }

    public b(Context context) {
        this.f9729a = context.getApplicationContext();
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, C2.g gVar) {
        if (D2.b.e(i10, i11)) {
            return new n.a(new V2.b(uri), D2.c.f(this.f9729a, uri));
        }
        return null;
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return D2.b.b(uri);
    }
}
