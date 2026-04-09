package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gx2 {
    public final Context a;
    public final e51 b;
    public final Executor c;
    public final AtomicReference d = new AtomicReference("");

    public gx2(Context context, e51 e51Var, ld2 ld2Var) {
        this.a = context;
        this.b = e51Var;
        this.c = ld2Var;
    }

    public static final String c(String str) {
        return lf4.H(new String(Base64.decode(str, 0)), new String(Base64.decode((String) tw1.e.c.a(mz1.Se), 10), StandardCharsets.UTF_8));
    }

    public final String a() {
        iz1 iz1Var = mz1.Oe;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (!((Boolean) kz1Var.a(iz1Var)).booleanValue() || ((String) kz1Var2.a(mz1.Qe)).isEmpty() || ((String) kz1Var2.a(mz1.Re)).isEmpty() || ((String) kz1Var2.a(mz1.Se)).isEmpty()) {
            return null;
        }
        String str = (String) this.d.get();
        if (!str.isEmpty()) {
            return str;
        }
        this.c.execute(new bs2(5, this));
        return null;
    }

    public final String b() throws SecurityException {
        String name;
        e51 e51Var = this.b;
        String strC = null;
        if (e51Var.i) {
            name = sg2.class.getName();
        } else {
            try {
                name = (String) new JSONObject(c((String) tw1.e.c.a(mz1.Qe))).get(Integer.toString(e51Var.h));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) tw1.e.c.a(mz1.Pe)).booleanValue()) {
                    hg4.C.h.d("SdkIE", e);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strC = c((String) tw1.e.c.a(mz1.Re));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) tw1.e.c.a(mz1.Pe)).booleanValue()) {
                hg4.C.h.d("SdkIE", e2);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            return "3";
        }
        try {
            for (Method method : this.a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strC)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }
}
