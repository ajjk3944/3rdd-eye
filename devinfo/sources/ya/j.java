package ya;

import android.content.Context;
import com.google.android.gms.internal.ads.fa;
import com.google.android.gms.internal.ads.ha;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.w5;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends rt {

    /* renamed from: e, reason: collision with root package name */
    public final Context f37467e;

    public j(Context context, w5 w5Var) {
        super(w5Var);
        this.f37467e = context;
    }

    public static c1.o C(Context context) {
        c1.o oVar = new c1.o(new sa(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new j(context, new w5(21)));
        oVar.h();
        return oVar;
    }

    @Override // com.google.android.gms.internal.ads.rt, com.google.android.gms.internal.ads.ca
    public final fa l(ha haVar) throws ka {
        int i4 = haVar.f11781b;
        String str = haVar.f11782c;
        if (i4 == 0) {
            if (Pattern.matches((String) va.s.f36163e.f36166c.a(sk.f16152h5), str)) {
                za.d dVar = va.r.g.f36157a;
                nb.f fVar = nb.f.f29899b;
                Context context = this.f37467e;
                if (fVar.c(13400000, context) == 0) {
                    fa faVarL = new hp(context).l(haVar);
                    if (faVarL != null) {
                        a0.m("Got gmscore asset response: ".concat(String.valueOf(str)));
                        return faVarL;
                    }
                    a0.m("Failed to get gmscore asset response: ".concat(String.valueOf(str)));
                }
            }
        }
        return super.l(haVar);
    }
}
