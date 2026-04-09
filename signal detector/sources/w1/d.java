package w1;

import T2.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import l1.C2641g;
import l1.h;
import l1.j;
import n1.z;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final C2641g f23945b = new C2641g("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C2641g.f21818e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f23946a;

    public d(Context context) {
        this.f23946a = context.getApplicationContext();
    }

    @Override // l1.j
    public final boolean a(Object obj, h hVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // l1.j
    public final /* bridge */ /* synthetic */ z b(Object obj, int i, int i3, h hVar) {
        return c((Uri) obj, hVar);
    }

    public final z c(Uri uri, h hVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f23946a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e6) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e6);
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
            } catch (NumberFormatException e7) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e7);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) hVar.c(f23945b) : null;
        Drawable drawableP = theme == null ? g.p(context, contextCreatePackageContext, identifier, null) : g.p(context, context, identifier, theme);
        if (drawableP != null) {
            return new c(drawableP, 0);
        }
        return null;
    }
}
