package J2;

import I2.n;
import I2.o;
import I2.r;
import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.A;

/* loaded from: classes.dex */
public class c implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9731a;

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f9732a;

        public a(Context context) {
            this.f9732a = context;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new c(this.f9732a);
        }
    }

    public c(Context context) {
        this.f9731a = context.getApplicationContext();
    }

    private boolean e(C2.g gVar) {
        Long l10 = (Long) gVar.c(A.f34507d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, C2.g gVar) {
        if (D2.b.e(i10, i11) && e(gVar)) {
            return new n.a(new V2.b(uri), D2.c.g(this.f9731a, uri));
        }
        return null;
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return D2.b.d(uri);
    }
}
