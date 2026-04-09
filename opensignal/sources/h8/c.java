package h8;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import br.l;
import l8.n;
import q8.i;

/* loaded from: classes.dex */
public final class c implements b {
    @Override // h8.b
    public final String a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (!l.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        Configuration configuration = nVar.f14948a.getResources().getConfiguration();
        Bitmap.Config[] configArr = i.f20736a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
