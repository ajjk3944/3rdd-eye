package fb;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.x80;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p implements x80 {

    /* renamed from: a, reason: collision with root package name */
    public final k f23960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23961b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23962c;

    public p(k kVar, int i4, String str) {
        this.f23960a = kVar;
        this.f23961b = i4;
        this.f23962c = str;
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void a(o oVar) throws JSONException, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException, ClassNotFoundException {
        if (oVar == null || this.f23961b != 2 || TextUtils.isEmpty(this.f23962c)) {
            return;
        }
        vd.a aVar = new vd.a(29, this, oVar);
        ya.b0 b0Var = ya.f0.f37440l;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            aVar.run();
        } else {
            fx.f11274a.execute(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void k(String str) {
    }
}
