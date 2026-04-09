package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class vk3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ x03 g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ vk3(x03 x03Var, Runnable runnable, int i) {
        this.f = i;
        this.g = x03Var;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f) {
            case 0:
                x03 x03Var = this.g;
                Runnable runnable = this.h;
                if (((kk3) x03Var.o) != null || x03Var.f) {
                    if (!x03Var.f) {
                        runnable.run();
                        return;
                    }
                    ((er3) x03Var.i).a("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) x03Var.k;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                    }
                    return;
                }
                ((er3) x03Var.i).a("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) x03Var.k;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                }
                sk3 sk3Var = new sk3(x03Var);
                x03Var.n = sk3Var;
                x03Var.f = true;
                if (((Context) x03Var.g).bindService((Intent) x03Var.l, sk3Var, 1)) {
                    return;
                }
                ((er3) x03Var.i).a("Failed to bind to the service.", new Object[0]);
                x03Var.f = false;
                ArrayList arrayList3 = (ArrayList) x03Var.k;
                synchronized (arrayList3) {
                    arrayList3.clear();
                }
                return;
            default:
                x03 x03Var2 = this.g;
                try {
                    this.h.run();
                    return;
                } catch (RuntimeException e) {
                    ((er3) x03Var2.i).e("error caused by ", e);
                    return;
                }
        }
    }
}
