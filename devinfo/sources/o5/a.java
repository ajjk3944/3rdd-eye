package o5;

import al.p;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import cl.o;
import com.bumptech.glide.d;
import l5.b;
import nk.k;
import q5.e;
import u6.t;
import xk.g0;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f30408a;

    public a(d dVar) {
        this.f30408a = dVar;
    }

    public static final a a(Context context) {
        d eVar;
        Object objInvoke;
        Object objInvoke2;
        int i4 = Build.VERSION.SDK_INT;
        b bVar = b.f28590a;
        if ((i4 >= 33 ? bVar.a() : 0) >= 11) {
            eVar = new e(context, 2);
        } else {
            if ((i4 >= 33 ? bVar.a() : 0) >= 5) {
                eVar = new e(context, 4);
            } else {
                if ((i4 >= 33 ? bVar.a() : 0) == 4) {
                    eVar = new e(context, 3);
                } else {
                    l5.a aVar = l5.a.f28589a;
                    if (((i4 == 31 || i4 == 32) ? aVar.a() : 0) >= 11) {
                        try {
                            objInvoke2 = new p5.b(context, 1).invoke(context);
                        } catch (NoClassDefFoundError unused) {
                            StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                            int i10 = Build.VERSION.SDK_INT;
                            sb2.append((i10 == 31 || i10 == 32) ? aVar.a() : 0);
                            Log.d("TopicsManager", sb2.toString());
                            objInvoke2 = null;
                        }
                        eVar = (d) objInvoke2;
                    } else {
                        if (((i4 == 31 || i4 == 32) ? aVar.a() : 0) >= 9) {
                            try {
                                objInvoke = new p5.b(context, 2).invoke(context);
                            } catch (NoClassDefFoundError unused2) {
                                StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                                int i11 = Build.VERSION.SDK_INT;
                                sb3.append((i11 == 31 || i11 == 32) ? aVar.a() : 0);
                                Log.d("TopicsManager", sb3.toString());
                                objInvoke = null;
                            }
                            eVar = (d) objInvoke;
                        } else {
                            eVar = null;
                        }
                    }
                }
            }
        }
        if (eVar != null) {
            return new a(eVar);
        }
        return null;
    }

    public vd.b b(q5.b bVar) {
        k.e(bVar, "request");
        el.e eVar = g0.f37189a;
        return t.b(x.e(x.b(o.f2935a), new p(this, bVar, null, 25)));
    }
}
