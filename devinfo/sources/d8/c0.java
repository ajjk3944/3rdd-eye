package d8;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21999a;

    /* renamed from: b, reason: collision with root package name */
    public final v f22000b;

    public /* synthetic */ c0(v vVar, int i4) {
        this.f21999a = i4;
        this.f22000b = vVar;
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, x7.h hVar) {
        Uri uriFromFile;
        switch (this.f21999a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                v vVar = this.f22000b;
                if (vVar.b(uriFromFile)) {
                    return vVar.a(uriFromFile, i4, i10, hVar);
                }
                return null;
            default:
                return this.f22000b.a(new l((URL) obj), i4, i10, hVar);
        }
    }

    @Override // d8.v
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f21999a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
