package kg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.h;
import nk.k;
import wi.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public final int f28292e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28293f;

    public e(String str, long j, int i4, aj.b bVar) {
        super(str, j, bVar);
        this.f28292e = i4;
    }

    @Override // kg.d
    public final Drawable b(Context context) {
        String mimeTypeFromExtension;
        int iLastIndexOf;
        Drawable drawable;
        k.e(context, "context");
        int i4 = this.f28292e;
        yi.d dVar = this.f28291d;
        if (i4 == 2) {
            drawable = context.getDrawable(dVar.isDirectory() ? R.drawable.ic_doc_folder : R.drawable.ic_doc_generic);
            k.b(drawable);
        } else {
            if (dVar.isDirectory()) {
                mimeTypeFromExtension = "vnd.android.document/directory";
            } else {
                String string = name().toString();
                String[] strArr = h.f21261a;
                String lowerCase = "";
                if (!TextUtils.isEmpty(string) && (iLastIndexOf = string.lastIndexOf(".")) > 0) {
                    lowerCase = string.substring(iLastIndexOf + 1).toLowerCase();
                }
                if (TextUtils.isEmpty(lowerCase) || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase)) == null) {
                    mimeTypeFromExtension = "application/octet-stream";
                }
            }
            Drawable drawable2 = context.getDrawable(g.c(mimeTypeFromExtension));
            drawable = drawable2 == null ? context.getDrawable(R.drawable.bu_ic_doc_generic) : drawable2;
            k.b(drawable);
        }
        f fVar = f.f21256b;
        return wb.e.M(drawable, f.d());
    }

    @Override // kg.c, kg.d
    public final boolean c() {
        return this.f28293f;
    }

    @Override // kg.d
    public final CharSequence d() {
        int i4 = this.f28292e;
        if (i4 == 0) {
            String string = DeviceInfoApp.f21145f.getString(R.string.log_file);
            k.d(string, "getString(...)");
            return string;
        }
        if (i4 == 1) {
            String string2 = DeviceInfoApp.f21145f.getString(R.string.temporary_files);
            k.d(string2, "getString(...)");
            return string2;
        }
        if (i4 == 2) {
            String string3 = DeviceInfoApp.f21145f.getString(R.string.empty_files_and_folders);
            k.d(string3, "getString(...)");
            return string3;
        }
        if (i4 == 3) {
            String string4 = DeviceInfoApp.f21145f.getString(R.string.trash_type_thumbnails);
            k.d(string4, "getString(...)");
            return string4;
        }
        if (i4 != 4) {
            return "";
        }
        String string5 = DeviceInfoApp.f21145f.getString(R.string.trash_type_cache_file_dir);
        k.d(string5, "getString(...)");
        return string5;
    }
}
