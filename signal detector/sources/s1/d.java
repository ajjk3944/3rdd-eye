package s1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import l1.h;
import m1.AbstractC2652a;
import r1.q;
import r1.r;

/* loaded from: classes.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23439a;

    /* renamed from: b, reason: collision with root package name */
    public final r f23440b;

    /* renamed from: c, reason: collision with root package name */
    public final r f23441c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f23442d;

    public d(Context context, r rVar, r rVar2, Class cls) {
        this.f23439a = context.getApplicationContext();
        this.f23440b = rVar;
        this.f23441c = rVar2;
        this.f23442d = cls;
    }

    @Override // r1.r
    public final q a(Object obj, int i, int i3, h hVar) {
        Uri uri = (Uri) obj;
        return new q(new G1.b(uri), new c(this.f23439a, this.f23440b, this.f23441c, uri, i, i3, hVar, this.f23442d));
    }

    @Override // r1.r
    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC2652a.a((Uri) obj);
    }
}
