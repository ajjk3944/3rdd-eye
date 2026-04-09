package i2;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.k;
import l2.p;

/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f21567e = k.f("NetworkNotRoamingCtrlr");

    public f(Context context, o2.a aVar) {
        super(j2.h.c(context, aVar).d());
    }

    @Override // i2.c
    public boolean b(p pVar) {
        return pVar.f23101j.b() == NetworkType.NOT_ROAMING;
    }

    @Override // i2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h2.b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (bVar.a() && bVar.c()) ? false : true;
        }
        k.c().a(f21567e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
