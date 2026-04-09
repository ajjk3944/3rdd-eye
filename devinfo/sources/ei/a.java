package ei;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.d;
import com.liuzh.deviceinfo.DeviceInfoApp;
import nk.k;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f23483a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23484b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23485c;

    public a(c cVar, int i4, int i10) {
        k.e(cVar, "model");
        this.f23483a = cVar;
        this.f23484b = i4;
        this.f23485c = i10;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return Drawable.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(i iVar, com.bumptech.glide.load.data.c cVar) {
        c cVar2 = this.f23483a;
        k.e(iVar, "priority");
        try {
            PackageManager packageManagerA = DeviceInfoApp.f21145f.a();
            PackageInfo packageArchiveInfo = packageManagerA.getPackageArchiveInfo(cVar2.f23487a, 1);
            k.b(packageArchiveInfo);
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            k.b(applicationInfo);
            String str = cVar2.f23487a;
            applicationInfo.publicSourceDir = str;
            applicationInfo.sourceDir = str;
            Drawable applicationIcon = packageManagerA.getApplicationIcon(applicationInfo);
            k.d(applicationIcon, "let(...)");
            Bitmap bitmapP = e.p(applicationIcon, new Point(this.f23484b, this.f23485c));
            k.b(bitmapP);
            cVar.f(new BitmapDrawable(DeviceInfoApp.f21145f.getResources(), bitmapP));
        } catch (Exception e2) {
            cVar.c(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
