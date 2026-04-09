package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qo1 {
    public static final boolean c = ro1.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(String str, long j) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new po1(j, SystemClock.elapsedRealtime(), str));
    }

    public final synchronized void b(String str) {
        long j;
        this.b = true;
        ArrayList arrayList = this.a;
        int i = 0;
        if (arrayList.size() == 0) {
            j = 0;
        } else {
            j = ((po1) arrayList.get(arrayList.size() - 1)).c - ((po1) arrayList.get(0)).c;
        }
        if (j > 0) {
            long j2 = ((po1) arrayList.get(0)).c;
            ro1.c("(%-4d ms) %s", Long.valueOf(j), str);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                po1 po1Var = (po1) obj;
                long j3 = po1Var.c;
                ro1.c("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(po1Var.b), po1Var.a);
                j2 = j3;
            }
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        ro1.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
