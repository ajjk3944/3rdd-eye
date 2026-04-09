package yf;

import ah.o;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import si.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public static volatile a f37587a;

    @Override // si.g
    public void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((si.c) it.next()).f33798a, "devinfo_vip")) {
                o.f400d.a();
                return;
            }
        }
    }

    @Override // si.g
    public void c() {
    }
}
