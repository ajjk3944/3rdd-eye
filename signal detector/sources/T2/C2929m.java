package t2;

import android.content.Context;
import com.google.android.gms.internal.ads.A4;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C1994v2;
import com.google.android.gms.internal.ads.C4;
import com.google.android.gms.internal.ads.F4;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.N4;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import q2.C2841s;

/* renamed from: t2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2929m extends C0697Ql {

    /* renamed from: d, reason: collision with root package name */
    public final Context f23638d;

    public C2929m(Context context, C1994v2 c1994v2) {
        super(c1994v2);
        this.f23638d = context;
    }

    public static K4.j E(Context context) {
        K4.j jVar = new K4.j(new N4(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new C2929m(context, new C1994v2(21)));
        jVar.a();
        return jVar;
    }

    @Override // com.google.android.gms.internal.ads.C0697Ql, com.google.android.gms.internal.ads.InterfaceC2104x4
    public final A4 g(C4 c42) throws IOException, F4 {
        int i = c42.f7517b;
        String str = c42.f7518c;
        if (i == 0) {
            if (Pattern.matches((String) C2841s.f23267e.f23270c.a(H9.f8757h5), str)) {
                u2.f fVar = q2.r.f23260g.f23261a;
                J2.f fVar2 = J2.f.f2059b;
                Context context = this.f23638d;
                if (fVar2.c(context, 13400000) == 0) {
                    A4 a4G = new H1.h(context).g(c42);
                    if (a4G != null) {
                        AbstractC2907C.m("Got gmscore asset response: ".concat(String.valueOf(str)));
                        return a4G;
                    }
                    AbstractC2907C.m("Failed to get gmscore asset response: ".concat(String.valueOf(str)));
                }
            }
        }
        return super.g(c42);
    }
}
