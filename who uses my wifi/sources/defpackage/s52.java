package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s52 implements y32 {
    public final /* synthetic */ long f;
    public final /* synthetic */ b62 g;
    public final /* synthetic */ q52 h;
    public final /* synthetic */ mm2 i;

    public s52(mm2 mm2Var, long j, b62 b62Var, q52 q52Var) {
        this.f = j;
        this.g = b62Var;
        this.h = q52Var;
        this.i = mm2Var;
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) {
        hg4.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(jCurrentTimeMillis);
        sb.append(" ms.");
        gi2.G(sb.toString());
        gi2.G("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        mm2 mm2Var = this.i;
        synchronized (mm2Var.b) {
            gi2.G("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            b62 b62Var = this.g;
            if (((AtomicInteger) b62Var.b).get() != -1 && ((AtomicInteger) b62Var.b).get() != 1) {
                mm2Var.g = 0;
                q52 q52Var = this.h;
                q52Var.p("/log", x32.c);
                q52Var.p("/result", x32.j);
                ((pd2) b62Var.a).a(q52Var);
                mm2Var.f = b62Var;
                gi2.G("Successfully loaded JS Engine.");
                gi2.G("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            gi2.G("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
