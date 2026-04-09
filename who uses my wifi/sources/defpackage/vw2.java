package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vw2 {
    public final mw2 a;
    public final xu2 b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();
    public boolean e;

    public vw2(mw2 mw2Var, xu2 xu2Var) {
        this.a = mw2Var;
        this.b = xu2Var;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                if (!this.e) {
                    mw2 mw2Var = this.a;
                    if (!mw2Var.b) {
                        tw2 tw2Var = new tw2(0, this);
                        mw2 mw2Var2 = this.a;
                        mw2Var2.getClass();
                        mw2Var2.e.f.c(new n62(mw2Var2, tw2Var, 24), mw2Var2.j);
                        return jSONArray;
                    }
                    b(mw2Var.b());
                }
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jSONArray.put(((uw2) obj).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        i82 i82Var;
        wu2 wu2VarB;
        wu2 wu2VarB2;
        i82 i82Var2;
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    w42 w42Var = (w42) it.next();
                    iz1 iz1Var = mz1.ea;
                    tw1 tw1Var = tw1.e;
                    String string = (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue() || (wu2VarB2 = this.b.b(w42Var.f)) == null || (i82Var2 = wu2VarB2.c) == null) ? "" : i82Var2.toString();
                    String str = string;
                    boolean z = ((Boolean) tw1Var.c.a(mz1.fa)).booleanValue() && (wu2VarB = this.b.b(w42Var.f)) != null && wu2VarB.d;
                    ArrayList arrayList = this.d;
                    String str2 = w42Var.f;
                    wu2 wu2VarB3 = this.b.b(str2);
                    arrayList.add(new uw2(str2, str, (wu2VarB3 == null || (i82Var = wu2VarB3.b) == null) ? "" : i82Var.toString(), w42Var.g ? 1 : 0, w42Var.i, w42Var.h, z));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
