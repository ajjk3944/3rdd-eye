package i2;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import l2.p;

/* loaded from: classes.dex */
public class g extends c {
    public g(Context context, o2.a aVar) {
        super(j2.h.c(context, aVar).d());
    }

    @Override // i2.c
    public boolean b(p pVar) {
        if (pVar.f23101j.b() != NetworkType.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && pVar.f23101j.b() == NetworkType.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // i2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h2.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
