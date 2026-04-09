package b4;

import android.database.Cursor;
import bc.z;
import bu.t;
import i3.g;
import i7.h;
import java.io.IOException;
import java.util.Objects;
import nq.i;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2397a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2398d;

    public /* synthetic */ e(int i10, Object obj) {
        this.f2397a = i10;
        this.f2398d = obj;
    }

    public i a() throws IOException {
        h hVar = (h) this.f2398d;
        i iVar = new i();
        Cursor cursorK = hVar.f11252a.k(new t("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (cursorK.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(cursorK.getInt(0)));
            } finally {
            }
        }
        cursorK.close();
        i iVarB = g.b(iVar);
        if (iVarB.f18516a.isEmpty()) {
            return iVarB;
        }
        if (((h) this.f2398d).f11258g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        o7.e eVar = ((h) this.f2398d).f11258g;
        if (eVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        eVar.n();
        return iVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0298  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r4v7, types: [jh.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.e.run():void");
    }

    public e(z zVar) {
        this.f2397a = 3;
        Objects.requireNonNull(zVar);
        this.f2398d = zVar;
    }
}
