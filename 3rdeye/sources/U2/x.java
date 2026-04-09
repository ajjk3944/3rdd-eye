package U2;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes.dex */
public final class x implements L2.j<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final W2.e f12456a;

    /* renamed from: b, reason: collision with root package name */
    public final O2.b f12457b;

    public x(W2.e eVar, O2.b bVar) {
        this.f12456a = eVar;
        this.f12457b = bVar;
    }

    @Override // L2.j
    public final boolean a(Uri uri, L2.h hVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // L2.j
    public final N2.u<Bitmap> b(Uri uri, int i, int i10, L2.h hVar) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        N2.u uVarC = this.f12456a.c(uri, hVar);
        if (uVarC == null) {
            return null;
        }
        return n.a(this.f12457b, (Drawable) ((W2.c) uVarC).get(), i, i10);
    }
}
