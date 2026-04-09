package kg;

import android.R;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.utilities.f;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: e, reason: collision with root package name */
    public final ApplicationInfo f28286e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f28287f;
    public final long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, ApplicationInfo applicationInfo, CharSequence charSequence, long j, yi.d dVar) {
        super(str, -1L, null);
        k.e(str, "path");
        this.f28286e = applicationInfo;
        this.f28287f = charSequence;
        this.g = j;
    }

    @Override // kg.c, kg.d
    public final CharSequence a() {
        String str;
        ApplicationInfo applicationInfo = this.f28286e;
        return (applicationInfo == null || (str = applicationInfo.packageName) == null) ? "" : str;
    }

    @Override // kg.d
    public final Drawable b(Context context) {
        k.e(context, "context");
        Drawable drawable = null;
        try {
            ApplicationInfo applicationInfo = this.f28286e;
            if (applicationInfo != null) {
                drawable = applicationInfo.loadIcon(context.getPackageManager());
            }
        } catch (Exception unused) {
        }
        if (drawable == null) {
            drawable = context.getDrawable(R.drawable.sym_def_app_icon);
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = context.getDrawable(com.liuzh.deviceinfo.R.drawable.ic_doc_apk);
        k.b(drawable2);
        f fVar = f.f21256b;
        return wb.e.M(drawable2, f.d());
    }

    @Override // kg.d
    public final CharSequence d() {
        String string = DeviceInfoApp.f21145f.getString(com.liuzh.deviceinfo.R.string.application_cache);
        k.d(string, "getString(...)");
        return string;
    }

    @Override // kg.c, kg.d
    public final CharSequence name() {
        return this.f28287f;
    }

    @Override // kg.c, kg.d
    public final long size() {
        return Math.max(0L, this.g);
    }
}
