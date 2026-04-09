package e8;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import d8.u;
import d8.v;
import x7.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22457a;

    /* renamed from: b, reason: collision with root package name */
    public final v f22458b;

    /* renamed from: c, reason: collision with root package name */
    public final v f22459c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f22460d;

    public d(Context context, v vVar, v vVar2, Class cls) {
        this.f22457a = context.getApplicationContext();
        this.f22458b = vVar;
        this.f22459c = vVar2;
        this.f22460d = cls;
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, h hVar) {
        Uri uri = (Uri) obj;
        return new u(new s8.d(uri), new c(this.f22457a, this.f22458b, this.f22459c, uri, i4, i10, hVar, this.f22460d));
    }

    @Override // d8.v
    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && f4.d.g((Uri) obj);
    }
}
