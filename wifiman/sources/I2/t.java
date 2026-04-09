package I2;

import I2.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8541a;

    /* renamed from: b, reason: collision with root package name */
    private final n f8542b;

    private static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8543a;

        a(Context context) {
            this.f8543a = context;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new t(this.f8543a, rVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    private static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8544a;

        b(Context context) {
            this.f8544a = context;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new t(this.f8544a, rVar.d(Integer.class, InputStream.class));
        }
    }

    t(Context context, n nVar) {
        this.f8541a = context.getApplicationContext();
        this.f8542b = nVar;
    }

    public static o e(Context context) {
        return new a(context);
    }

    public static o f(Context context) {
        return new b(context);
    }

    private n.a g(Uri uri, int i10, int i11, C2.g gVar) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f8542b.a(Integer.valueOf(i12), i10, i11, gVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    private n.a h(Uri uri, int i10, int i11, C2.g gVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f8541a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f8541a.getPackageName());
        if (identifier != 0) {
            return this.f8542b.a(Integer.valueOf(identifier), i10, i11, gVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, C2.g gVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, gVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, gVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f8541a.getPackageName().equals(uri.getAuthority());
    }
}
