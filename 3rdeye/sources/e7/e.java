package e7;

import H6.C0678o;
import H6.C0681s;
import android.os.SystemClock;
import b9.C2001h;
import f7.C4337a;

/* compiled from: Div2ViewHistogramReporter.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C0678o f37729a;

    /* renamed from: b, reason: collision with root package name */
    public final C0681s f37730b;

    /* renamed from: c, reason: collision with root package name */
    public String f37731c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37732d;

    /* renamed from: e, reason: collision with root package name */
    public Long f37733e;

    /* renamed from: f, reason: collision with root package name */
    public Long f37734f;

    /* renamed from: g, reason: collision with root package name */
    public Long f37735g;

    /* renamed from: h, reason: collision with root package name */
    public Long f37736h;
    public Long i;

    /* renamed from: j, reason: collision with root package name */
    public Long f37737j;

    /* renamed from: k, reason: collision with root package name */
    public Long f37738k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f37739l;

    public e(C0678o c0678o, C0681s renderConfig) {
        kotlin.jvm.internal.l.f(renderConfig, "renderConfig");
        this.f37729a = c0678o;
        this.f37730b = renderConfig;
        this.f37739l = C2001h.a(b9.i.NONE, d.f37728b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b9.g, java.lang.Object] */
    public final C4337a a() {
        return (C4337a) this.f37739l.getValue();
    }

    public final void b() {
        long jUptimeMillis;
        long jLongValue;
        Long l5 = this.f37733e;
        Long l10 = this.f37734f;
        Long l11 = this.f37735g;
        C4337a c4337aA = a();
        if (l5 != null) {
            if (l10 != null && l11 != null) {
                jUptimeMillis = l10.longValue() + (SystemClock.uptimeMillis() - l11.longValue());
                jLongValue = l5.longValue();
            } else if (l10 == null && l11 == null) {
                jUptimeMillis = SystemClock.uptimeMillis();
                jLongValue = l5.longValue();
            }
            long j4 = jUptimeMillis - jLongValue;
            c4337aA.f37817a = j4;
            g7.a.a((g7.a) this.f37729a.invoke(), "Div.Binding", j4, this.f37731c, null, null, 24);
        }
        this.f37733e = null;
        this.f37734f = null;
        this.f37735g = null;
    }

    public final void c() {
        Long l5 = this.f37738k;
        if (l5 != null) {
            a().f37821e += SystemClock.uptimeMillis() - l5.longValue();
        }
        if (this.f37732d) {
            C4337a c4337aA = a();
            g7.a aVar = (g7.a) this.f37729a.invoke();
            o oVar = (o) this.f37730b.invoke();
            g7.a.a(aVar, "Div.Render.Total", Math.max(c4337aA.f37817a, c4337aA.f37818b) + c4337aA.f37819c + c4337aA.f37820d + c4337aA.f37821e, this.f37731c, null, oVar.f37759d, 8);
            g7.a.a(aVar, "Div.Render.Measure", c4337aA.f37819c, this.f37731c, null, oVar.f37756a, 8);
            g7.a.a(aVar, "Div.Render.Layout", c4337aA.f37820d, this.f37731c, null, oVar.f37757b, 8);
            g7.a.a(aVar, "Div.Render.Draw", c4337aA.f37821e, this.f37731c, null, oVar.f37758c, 8);
        }
        this.f37732d = false;
        this.f37737j = null;
        this.i = null;
        this.f37738k = null;
        C4337a c4337aA2 = a();
        c4337aA2.f37819c = 0L;
        c4337aA2.f37820d = 0L;
        c4337aA2.f37821e = 0L;
        c4337aA2.f37817a = 0L;
        c4337aA2.f37818b = 0L;
    }

    public final void d() {
        Long l5 = this.f37736h;
        C4337a c4337aA = a();
        if (l5 != null) {
            long jUptimeMillis = SystemClock.uptimeMillis() - l5.longValue();
            c4337aA.f37818b = jUptimeMillis;
            g7.a.a((g7.a) this.f37729a.invoke(), "Div.Rebinding", jUptimeMillis, this.f37731c, null, null, 24);
        }
        this.f37736h = null;
    }
}
