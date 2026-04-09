package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class c02 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa2 b;

    public /* synthetic */ c02(fa2 fa2Var, int i) {
        this.a = i;
        this.b = fa2Var;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) {
        switch (this.a) {
            case 0:
                ny2 ny2Var = (ny2) obj;
                l22 l22Var = new l22(new JsonReader(new InputStreamReader(ny2Var.a)), ny2Var.b);
                fa2 fa2Var = this.b;
                try {
                    l22Var.b = sv1.f.a.j(fa2Var.f).toString();
                } catch (JSONException unused) {
                    l22Var.b = "{}";
                }
                Bundle bundle = fa2Var.s;
                if (!bundle.isEmpty()) {
                    try {
                        l22Var.c = sv1.f.a.j(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return pu1.r(l22Var);
            case 1:
                return pu1.r(new ny2((InputStream) obj, this.b));
            case 2:
                return pu1.r(new ny2((InputStream) obj, this.b));
            default:
                String str = new String(mo3.a((InputStream) obj), StandardCharsets.UTF_8);
                fa2 fa2Var2 = this.b;
                fa2Var2.o = str;
                return pu1.r(fa2Var2);
        }
    }
}
