package S2;

import L2.h;
import M2.a;
import R2.q;
import R2.r;
import R2.u;
import T1.B;
import android.content.Context;
import android.net.Uri;
import g3.C4389b;
import java.io.InputStream;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: classes.dex */
public final class b implements q<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11868a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements r<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11869a;

        public a(Context context) {
            this.f11869a = context;
        }

        @Override // R2.r
        public final q<Uri, InputStream> c(u uVar) {
            return new b(this.f11869a);
        }
    }

    public b(Context context) {
        this.f11868a = context.getApplicationContext();
    }

    @Override // R2.q
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        return B.p(uri2) && !uri2.getPathSegments().contains("video");
    }

    @Override // R2.q
    public final q.a<InputStream> b(Uri uri, int i, int i10, h hVar) {
        Uri uri2 = uri;
        if (i == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i > 512 || i10 > 384) {
            return null;
        }
        C4389b c4389b = new C4389b(uri2);
        Context context = this.f11868a;
        return new q.a<>(c4389b, M2.a.c(context, uri2, new a.C0073a(context.getContentResolver())));
    }
}
