package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vv2 implements b8, jo2, fd1, um2, dn2, en2, rn2, wm2, v93 {
    public final List f;
    public final sv2 g;
    public long h;

    public vv2(sv2 sv2Var, th2 th2Var) {
        this.g = sv2Var;
        this.f = Collections.singletonList(th2Var);
    }

    @Override // defpackage.fd1
    public final void C() throws IOException {
        S(fd1.class, "onAdClicked", new Object[0]);
    }

    @Override // defpackage.dn2
    public final void D0() throws IOException {
        S(dn2.class, "onAdImpression", new Object[0]);
    }

    @Override // defpackage.jo2
    public final void G0(fa2 fa2Var) throws IOException {
        hg4.C.k.getClass();
        this.h = SystemClock.elapsedRealtime();
        S(jo2.class, "onAdRequest", new Object[0]);
    }

    @Override // defpackage.v93
    public final void H(s93 s93Var, String str, Throwable th) throws IOException {
        S(t93.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // defpackage.um2
    public final void J(ka2 ka2Var, String str, String str2) throws IOException {
        S(um2.class, "onRewarded", ka2Var, str, str2);
    }

    @Override // defpackage.b8
    public final void O(String str, String str2) throws IOException {
        S(b8.class, "onAppEvent", str, str2);
    }

    @Override // defpackage.v93
    public final void R(String str, s93 s93Var) throws IOException {
        S(t93.class, "onTaskSucceeded", str);
    }

    public final void S(Class cls, String str, Object... objArr) throws IOException {
        String simpleName = cls.getSimpleName();
        List list = this.f;
        String strConcat = "Event-".concat(simpleName);
        sv2 sv2Var = this.g;
        sv2Var.getClass();
        if (((Boolean) u02.a.w()).booleanValue()) {
            sv2Var.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jCurrentTimeMillis);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                gi2.c0("unable to log", e);
            }
            gi2.f0("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // defpackage.um2
    public final void T() throws IOException {
        S(um2.class, "onAdClosed", new Object[0]);
    }

    @Override // defpackage.um2
    public final void a() throws IOException {
        S(um2.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // defpackage.um2
    public final void b() throws IOException {
        S(um2.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // defpackage.um2
    public final void c() throws IOException {
        S(um2.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // defpackage.wm2
    public final void d0(nx2 nx2Var) throws IOException {
        S(wm2.class, "onAdFailedToLoad", Integer.valueOf(nx2Var.f), nx2Var.g, nx2Var.h);
    }

    @Override // defpackage.rn2
    public final void e() throws IOException {
        hg4.C.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        gi2.G(sb.toString());
        S(rn2.class, "onAdLoaded", new Object[0]);
    }

    @Override // defpackage.en2
    public final void h(Context context) throws IOException {
        S(en2.class, "onDestroy", context);
    }

    @Override // defpackage.en2
    public final void l(Context context) throws IOException {
        S(en2.class, "onPause", context);
    }

    @Override // defpackage.en2
    public final void p(Context context) throws IOException {
        S(en2.class, "onResume", context);
    }

    @Override // defpackage.um2
    public final void r() throws IOException {
        S(um2.class, "onAdOpened", new Object[0]);
    }

    @Override // defpackage.v93
    public final void s(String str) throws IOException {
        S(t93.class, "onTaskCreated", str);
    }

    @Override // defpackage.v93
    public final void w(String str, s93 s93Var) throws IOException {
        S(t93.class, "onTaskStarted", str);
    }

    @Override // defpackage.jo2
    public final void B(h83 h83Var) {
    }
}
