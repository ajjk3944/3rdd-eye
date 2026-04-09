package kg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import d.h;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public final ApplicationInfo f28282e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f28283f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final long f28284h;

    /* renamed from: i, reason: collision with root package name */
    public final long f28285i;

    public a(String str, ApplicationInfo applicationInfo, CharSequence charSequence, String str2, long j, long j8, aj.b bVar) {
        super(str, -1L, bVar);
        this.f28282e = applicationInfo;
        this.f28283f = charSequence;
        this.g = str2;
        this.f28284h = j;
        this.f28285i = j8;
    }

    @Override // kg.c, kg.d
    public final CharSequence a() {
        String string;
        String str = this.g;
        if (str == null) {
            return this.f28288a;
        }
        long j = this.f28285i;
        if (j < 0) {
            string = DeviceInfoApp.f21145f.getString(R.string.damaged);
            k.b(string);
        } else {
            long j8 = this.f28284h;
            if (j8 < 0) {
                string = DeviceInfoApp.f21145f.getString(R.string.apk_compare_not_installed);
                k.b(string);
            } else if (j8 < j) {
                string = DeviceInfoApp.f21145f.getString(R.string.apk_compare_new_version);
                k.b(string);
            } else if (j8 == j) {
                string = DeviceInfoApp.f21145f.getString(R.string.apk_compare_current_version);
                k.b(string);
            } else {
                string = DeviceInfoApp.f21145f.getString(R.string.apk_compare_old_version);
                k.b(string);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("(");
        sb2.append(j);
        sb2.append(", ");
        return h.w(sb2, string, ")");
    }

    @Override // kg.d
    public final Drawable b(Context context) {
        k.e(context, "context");
        Drawable drawableLoadIcon = null;
        try {
            ApplicationInfo applicationInfo = this.f28282e;
            if (applicationInfo != null) {
                drawableLoadIcon = applicationInfo.loadIcon(context.getPackageManager());
            }
        } catch (Exception unused) {
        }
        if (drawableLoadIcon != null) {
            return drawableLoadIcon;
        }
        Drawable drawable = context.getDrawable(R.drawable.ic_doc_apk);
        k.b(drawable);
        f fVar = f.f21256b;
        return wb.e.M(drawable, f.d());
    }

    @Override // kg.d
    public final CharSequence d() {
        String string = DeviceInfoApp.f21145f.getString(R.string.apk_file);
        k.d(string, "getString(...)");
        return string;
    }

    @Override // kg.c, kg.d
    public final CharSequence name() {
        CharSequence charSequence = this.f28283f;
        if (charSequence == null) {
            charSequence = "";
        }
        return charSequence.length() == 0 ? super.name() : charSequence;
    }
}
