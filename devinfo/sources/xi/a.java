package xi;

import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import com.google.android.gms.internal.play_billing.m1;
import java.util.List;
import nk.k;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f37164c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f37165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37166b;

    static {
        String path = Environment.getExternalStorageDirectory().getPath();
        k.b(path);
        if (!p.w0(path, "/", false)) {
            path = "/".concat(path);
        }
        f37164c = path;
    }

    public a(Context context, String str) {
        k.e(str, "rootPath");
        this.f37165a = context;
        this.f37166b = str;
    }

    public final boolean a() {
        String str = this.f37166b;
        k.e(str, "path");
        List<UriPermission> persistedUriPermissions = this.f37165a.getContentResolver().getPersistedUriPermissions();
        k.d(persistedUriPermissions, "getPersistedUriPermissions(...)");
        Uri uriBuildTreeDocumentUri = DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", m1.n(str));
        if (persistedUriPermissions.isEmpty()) {
            return false;
        }
        for (UriPermission uriPermission : persistedUriPermissions) {
            if (uriPermission.isReadPermission() && uriPermission.isWritePermission() && k.a(uriPermission.getUri().toString(), uriBuildTreeDocumentUri.toString())) {
                return true;
            }
        }
        return false;
    }
}
