package W2;

import L2.g;
import L2.h;
import L2.j;
import N2.u;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: classes.dex */
public final class e implements j<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public static final g<Resources.Theme> f13336b = new g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, g.f4028e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f13337a;

    public e(Context context) {
        this.f13337a = context.getApplicationContext();
    }

    @Override // L2.j
    public final boolean a(Uri uri, h hVar) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // L2.j
    public final /* bridge */ /* synthetic */ u<Drawable> b(Uri uri, int i, int i10, h hVar) throws IOException {
        return c(uri, hVar);
    }

    public final u c(Uri uri, h hVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f13337a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e4) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e4);
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
                identifier = Resources.getSystem().getIdentifier(str2, str, ConstantDeviceInfo.APP_PLATFORM);
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
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) hVar.c(f13336b) : null;
        Drawable drawableA = theme == null ? b.a(context, contextCreatePackageContext, identifier, null) : b.a(context, context, identifier, theme);
        if (drawableA != null) {
            return new d(drawableA);
        }
        return null;
    }
}
