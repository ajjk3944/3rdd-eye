package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v52 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ mm2 g;
    public final /* synthetic */ b62 h;
    public final /* synthetic */ q52 i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ long k;

    public /* synthetic */ v52(mm2 mm2Var, b62 b62Var, q52 q52Var, ArrayList arrayList, long j, int i) {
        this.f = i;
        this.h = b62Var;
        this.i = q52Var;
        this.j = arrayList;
        this.k = j;
        this.g = mm2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        switch (this.f) {
            case 0:
                gi2.G("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                mm2 mm2Var = this.g;
                synchronized (mm2Var.b) {
                    try {
                        gi2.G("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        b62 b62Var = this.h;
                        if (((AtomicInteger) b62Var.b).get() != -1 && ((AtomicInteger) b62Var.b).get() != 1) {
                            iz1 iz1Var = mz1.g8;
                            tw1 tw1Var = tw1.e;
                            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                                b62Var.v("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                b62Var.u();
                            }
                            md2.f.execute(new u52(this.i, 0));
                            String strValueOf = String.valueOf(tw1Var.c.a(mz1.d));
                            int i = ((AtomicInteger) b62Var.b).get();
                            int i2 = mm2Var.g;
                            ArrayList arrayList = this.j;
                            if (arrayList.isEmpty()) {
                                string = ". Still waiting for the engine to be loaded";
                            } else {
                                String strValueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb = new StringBuilder(strValueOf2.length() + 88);
                                sb.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb.append(strValueOf2);
                                string = sb.toString();
                            }
                            hg4.C.k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(i).length() + 36 + String.valueOf(i2).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                            sb2.append("Could not finish the full JS engine loading in ");
                            sb2.append(strValueOf);
                            sb2.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb2.append(i);
                            sb2.append(". Update status(fullLoadTimeout) is ");
                            sb2.append(i2);
                            sb2.append(string);
                            sb2.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb2.append(jCurrentTimeMillis);
                            sb2.append(" ms at timeout. Rejecting.");
                            gi2.G(sb2.toString());
                            gi2.G("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        gi2.G("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
            default:
                mm2 mm2Var2 = this.g;
                b62 b62Var2 = this.h;
                q52 q52Var = this.i;
                ArrayList arrayList2 = this.j;
                long j = this.k;
                gi2.G("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (mm2Var2.b) {
                    try {
                        gi2.G("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) b62Var2.b).get() != -1 && ((AtomicInteger) b62Var2.b).get() != 1) {
                            iz1 iz1Var2 = mz1.g8;
                            tw1 tw1Var2 = tw1.e;
                            if (((Boolean) tw1Var2.c.a(iz1Var2)).booleanValue()) {
                                b62Var2.v("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                b62Var2.u();
                            }
                            md2.f.execute(new u52(q52Var, 1));
                            String strValueOf3 = String.valueOf(tw1Var2.c.a(mz1.c));
                            int i3 = ((AtomicInteger) b62Var2.b).get();
                            int i4 = mm2Var2.g;
                            String strValueOf4 = String.valueOf(arrayList2.get(0));
                            hg4.C.k.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 94 + String.valueOf(i3).length() + 39 + String.valueOf(i4).length() + 57 + strValueOf4.length() + 42 + String.valueOf(jCurrentTimeMillis2).length() + 15);
                            sb3.append("Could not receive /jsLoaded in ");
                            sb3.append(strValueOf3);
                            sb3.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb3.append(i3);
                            sb3.append(". Update status(onEngLoadedTimeout) is ");
                            sb3.append(i4);
                            sb3.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb3.append(strValueOf4);
                            sb3.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb3.append(jCurrentTimeMillis2);
                            sb3.append(" ms. Rejecting.");
                            gi2.G(sb3.toString());
                            gi2.G("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        gi2.G("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
        }
    }
}
