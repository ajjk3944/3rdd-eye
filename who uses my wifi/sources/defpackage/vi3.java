package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vi3 {
    public final Context a;
    public final gk3 b;
    public final wh3 c;
    public final String d;

    public vi3(Context context, gk3 gk3Var, wh3 wh3Var, vf3 vf3Var) {
        this.a = context;
        this.b = gk3Var;
        this.c = wh3Var;
        this.d = vf3Var.E();
    }

    public final String a(long j) {
        String string;
        boolean z;
        fk3 fk3VarA = this.b.a(55);
        try {
            try {
                fk3VarA.a();
                xr1 xr1VarA = yr1.A();
                String str = this.d;
                xr1VarA.b();
                ((yr1) xr1VarA.g).C(str);
                xr1VarA.b();
                ((yr1) xr1VarA.g).B("0.808261137");
                Context context = this.a;
                String packageName = context.getPackageName();
                xr1VarA.b();
                ((yr1) xr1VarA.g).E(packageName);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                xr1VarA.b();
                ((yr1) xr1VarA.g).D(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
                xr1VarA.b();
                ((yr1) xr1VarA.g).G(jCurrentTimeMillis2);
                try {
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    xr1VarA.b();
                    ((yr1) xr1VarA.g).F(j2);
                } catch (PackageManager.NameNotFoundException unused) {
                    xr1VarA.b();
                    ((yr1) xr1VarA.g).F(-1L);
                }
                wh3 wh3Var = this.c;
                synchronized (wh3Var) {
                    z = wh3Var.d;
                }
                if (!z) {
                    wh3Var.a();
                }
                bs1 bs1VarD = wh3Var.d(null, ((yr1) xr1VarA.d()).b());
                bs1VarD.b();
                ((cs1) bs1VarD.g).D(5);
                bs1VarD.b();
                ((cs1) bs1VarD.g).E(2);
                byte[] bArrB = ((cs1) bs1VarD.d()).b();
                ho3 ho3Var = jo3.e;
                if (ho3Var.b != null) {
                    ho3Var = new ho3(ho3Var.a, (Character) null);
                }
                string = ho3Var.g(bArrB.length, bArrB);
            } catch (UnsupportedEncodingException e) {
                fk3VarA.b(e);
                string = Integer.toString(7);
            } catch (Throwable th) {
                fk3VarA.b(th);
                throw th;
            }
            fk3VarA.c();
            return string;
        } catch (Throwable th2) {
            fk3VarA.c();
            throw th2;
        }
    }
}
