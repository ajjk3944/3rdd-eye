package i2;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import l2.p;

/* loaded from: classes.dex */
public class d extends c {
    public d(Context context, o2.a aVar) {
        super(j2.h.c(context, aVar).d());
    }

    @Override // i2.c
    public boolean b(p pVar) {
        return pVar.f23101j.b() == NetworkType.CONNECTED;
    }

    @Override // i2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h2.b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? (bVar.a() && bVar.d()) ? false : true : !bVar.a();
    }
}
