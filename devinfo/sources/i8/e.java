package i8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.d5;
import java.util.List;
import x7.g;
import x7.h;
import x7.j;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final g f25939b = new g("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, g.f36999e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f25940a;

    public e(Context context) {
        this.f25940a = context.getApplicationContext();
    }

    @Override // x7.j
    public final /* bridge */ /* synthetic */ y a(Object obj, int i4, int i10, h hVar) {
        return c((Uri) obj, hVar);
    }

    @Override // x7.j
    public final boolean b(Object obj, h hVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final y c(Uri uri, h hVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f25940a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e2);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) hVar.c(f25939b) : null;
        Drawable drawableI = theme == null ? d5.i(context, contextCreatePackageContext, identifier, null) : d5.i(context, context, identifier, theme);
        if (drawableI != null) {
            return new d(drawableI, 0);
        }
        return null;
    }
}
