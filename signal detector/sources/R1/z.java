package r1;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class z implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23391a;

    /* renamed from: b, reason: collision with root package name */
    public final r f23392b;

    public /* synthetic */ z(r rVar, int i) {
        this.f23391a = i;
        this.f23392b = rVar;
    }

    @Override // r1.r
    public final q a(Object obj, int i, int i3, l1.h hVar) {
        Uri uriFromFile;
        switch (this.f23391a) {
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
                r rVar = this.f23392b;
                if (rVar.b(uriFromFile)) {
                    return rVar.a(uriFromFile, i, i3, hVar);
                }
                return null;
            default:
                return this.f23392b.a(new h((URL) obj), i, i3, hVar);
        }
    }

    @Override // r1.r
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f23391a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
