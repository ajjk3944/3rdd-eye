package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a9 implements Runnable {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ a9(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    private final void b() {
        ps1 ps1Var = (ps1) this.g;
        synchronized (ps1Var.t) {
            if (ps1Var.u) {
                return;
            }
            ps1Var.u = true;
            try {
                ps1Var.l();
            } catch (Exception e) {
                ((ps1) this.g).k.c(2023, -1L, e);
            }
            ps1 ps1Var2 = (ps1) this.g;
            synchronized (ps1Var2.t) {
                ps1Var2.u = false;
            }
        }
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor cursorG = ((o30) this.g).c.g(new ts3("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 2));
        while (cursorG.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorG.getInt(0)));
            } catch (Throwable th) {
                cursorG.close();
                throw th;
            }
        }
        cursorG.close();
        if (!hashSet.isEmpty()) {
            ((o30) this.g).f.t();
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v110, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a9.run():void");
    }

    public a9(ub1 ub1Var, t3 t3Var) {
        this.f = 22;
        this.g = t3Var;
    }
}
