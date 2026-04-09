package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qb2 implements sb2 {
    public static final List l = Collections.synchronizedList(new ArrayList());
    public final y74 a;
    public final LinkedHashMap b;
    public final Context e;
    public boolean f;
    public final rb2 g;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Object h = new Object();
    public final HashSet i = new HashSet();
    public boolean j = false;
    public boolean k = false;

    public qb2(Context context, e51 e51Var, rb2 rb2Var, String str) {
        ou1.k(rb2Var, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = new LinkedHashMap();
        this.g = rb2Var;
        Iterator it = rb2Var.j.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        y74 y74VarD = c94.D();
        y74VarD.b();
        ((c94) y74VarD.g).O(9);
        if (str != null) {
            y74VarD.b();
            ((c94) y74VarD.g).E(str);
            y74VarD.b();
            ((c94) y74VarD.g).F(str);
        }
        z74 z74VarA = a84.A();
        String str2 = this.g.f;
        if (str2 != null) {
            z74VarA.b();
            ((a84) z74VarA.g).B(str2);
        }
        a84 a84Var = (a84) z74VarA.d();
        y74VarD.b();
        ((c94) y74VarD.g).G(a84Var);
        w84 w84VarA = x84.A();
        boolean zD = za1.a(this.e).d();
        w84VarA.b();
        ((x84) w84VarA.g).D(zD);
        String str3 = e51Var.f;
        if (str3 != null) {
            w84VarA.b();
            ((x84) w84VarA.g).B(str3);
        }
        gz gzVar = gz.b;
        Context context2 = this.e;
        gzVar.getClass();
        long jA = gz.a(context2);
        if (jA > 0) {
            w84VarA.b();
            ((x84) w84VarA.g).C(jA);
        }
        x84 x84Var = (x84) w84VarA.d();
        y74VarD.b();
        ((c94) y74VarD.g).L(x84Var);
        this.a = y74VarD;
    }

    public final void a(String str) {
        synchronized (this.h) {
            try {
                if (str == null) {
                    y74 y74Var = this.a;
                    y74Var.b();
                    ((c94) y74Var.g).J();
                } else {
                    y74 y74Var2 = this.a;
                    y74Var2.b();
                    ((c94) y74Var2.g).I(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, Map map, int i) {
        synchronized (this.h) {
            if (i == 3) {
                try {
                    this.k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    u84 u84Var = (u84) linkedHashMap.get(str);
                    u84Var.b();
                    ((v84) u84Var.g).H(4);
                }
                return;
            }
            u84 u84VarC = v84.C();
            int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i2 != 0) {
                u84VarC.b();
                ((v84) u84VarC.g).H(i2);
            }
            int size = linkedHashMap.size();
            u84VarC.b();
            ((v84) u84VarC.g).D(size);
            u84VarC.b();
            ((v84) u84VarC.g).E(str);
            i84 i84VarA = k84.A();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        g84 g84VarA = h84.A();
                        Charset charset = y54.a;
                        y44 y44Var = new y44(str2.getBytes(charset));
                        g84VarA.b();
                        ((h84) g84VarA.g).B(y44Var);
                        y44 y44Var2 = new y44(str3.getBytes(charset));
                        g84VarA.b();
                        ((h84) g84VarA.g).C(y44Var2);
                        h84 h84Var = (h84) g84VarA.d();
                        i84VarA.b();
                        ((k84) i84VarA.g).B(h84Var);
                    }
                }
            }
            k84 k84Var = (k84) i84VarA.d();
            u84VarC.b();
            ((v84) u84VarC.g).F(k84Var);
            linkedHashMap.put(str, u84VarC);
        }
    }
}
