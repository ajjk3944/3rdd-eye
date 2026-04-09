package R2;

import R2.q;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* compiled from: ResourceUriLoader.java */
/* loaded from: classes.dex */
public final class w<DataT> implements q<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11716a;

    /* renamed from: b, reason: collision with root package name */
    public final q<Integer, DataT> f11717b;

    /* compiled from: ResourceUriLoader.java */
    public static final class a implements r<Uri, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11718a;

        public a(Context context) {
            this.f11718a = context;
        }

        @Override // R2.r
        public final q<Uri, AssetFileDescriptor> c(u uVar) {
            return new w(this.f11718a, uVar.b(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceUriLoader.java */
    public static final class b implements r<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11719a;

        public b(Context context) {
            this.f11719a = context;
        }

        @Override // R2.r
        public final q<Uri, InputStream> c(u uVar) {
            return new w(this.f11719a, uVar.b(Integer.class, InputStream.class));
        }
    }

    public w(Context context, q<Integer, DataT> qVar) {
        this.f11716a = context.getApplicationContext();
        this.f11717b = qVar;
    }

    @Override // R2.q
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.f11716a.getPackageName().equals(uri2.getAuthority());
    }

    @Override // R2.q
    public final q.a b(Uri uri, int i, int i10, L2.h hVar) throws NumberFormatException {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        q<Integer, DataT> qVar = this.f11717b;
        if (size == 1) {
            try {
                int i11 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i11 != 0) {
                    return qVar.b(Integer.valueOf(i11), i, i10, hVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                    return null;
                }
            } catch (NumberFormatException e4) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e4);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.f11716a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return qVar.b(Integer.valueOf(identifier), i, i10, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri2);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
        }
        return null;
    }
}
