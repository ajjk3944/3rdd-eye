package a8;

import a8.HandlerThreadC1675g;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import c8.C2074a;
import c8.C2075b;
import c8.C2076c;
import com.zipoapps.premiumhelper.e;
import java.lang.Thread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import va.a;

/* compiled from: BLyticsEngine.java */
/* renamed from: a8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1671c {

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f14239a;

    /* renamed from: b, reason: collision with root package name */
    public final C1672d f14240b;

    /* renamed from: c, reason: collision with root package name */
    public final C1673e f14241c;

    /* renamed from: d, reason: collision with root package name */
    public c8.d f14242d;

    /* renamed from: g, reason: collision with root package name */
    public String f14245g;

    /* renamed from: h, reason: collision with root package name */
    public C1670b f14246h;

    /* renamed from: f, reason: collision with root package name */
    public List<AbstractC1669a> f14244f = Collections.EMPTY_LIST;

    /* renamed from: e, reason: collision with root package name */
    public HandlerThreadC1675g f14243e = new HandlerThreadC1675g(this);

    public C1671c(com.zipoapps.premiumhelper.d dVar) {
        this.f14239a = dVar;
        this.f14240b = new C1672d(dVar);
        this.f14241c = new C1673e(dVar);
    }

    public final void a(C2075b c2075b) {
        Iterator it = c2075b.f18556e.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.first;
            C2074a c2074a = (C2074a) pair.second;
            C2074a c2074aR = (this.f14242d.R(c2074a) != null ? this.f14242d : this.f14240b).R(c2074a);
            c2075b.a(Integer.valueOf(c2074aR != null ? c2074aR.f18551c : 0), str);
        }
    }

    public final void b(C2075b c2075b, boolean z10) {
        C1672d c1672d = this.f14240b;
        if (z10) {
            try {
                C2074a c2074aS = c1672d.S("com.zipoapps.blytics#session", "session");
                if (c2074aS != null) {
                    c2075b.a(Integer.valueOf(c2074aS.f18551c), "session");
                }
                c2075b.a(Boolean.valueOf(this.f14242d.f18560d), "isForegroundSession");
                C2074a c2074aS2 = c1672d.S("com.zipoapps.blytics#session", "x-app-open");
                if (c2074aS2 != null) {
                    c2075b.a(Integer.valueOf(c2074aS2.f18551c), "x-app-open");
                }
            } catch (Throwable th) {
                a.b bVar = va.a.f47104a;
                bVar.o("BLytics");
                bVar.e(th, "Failed to send event: %s", c2075b.f18552a);
                return;
            }
        }
        Iterator it = c2075b.f18555d.iterator();
        while (it.hasNext()) {
            C2074a c2074a = (C2074a) it.next();
            c2074a.getClass();
            c1672d.W(c2074a);
            c2075b.a(Integer.valueOf(c2074a.f18551c), c2074a.f18550b);
        }
        a(c2075b);
        Iterator it2 = c2075b.f18557f.iterator();
        while (it2.hasNext()) {
            ((C2076c) it2.next()).getClass();
            c2075b.b(null, this.f14241c.f14248a.getString(null, null));
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f14245g);
        String str = c2075b.f18552a;
        String str2 = (zIsEmpty || !c2075b.f18553b) ? str : this.f14245g + str;
        for (AbstractC1669a abstractC1669a : this.f14244f) {
            try {
                abstractC1669a.f(c2075b.f18554c, str2);
            } catch (Throwable th2) {
                a.b bVar2 = va.a.f47104a;
                bVar2.o("BLytics");
                bVar2.e(th2, "Failed to send event: " + str + " to platform " + abstractC1669a.toString(), new Object[0]);
            }
        }
    }

    public final void c(boolean z10) {
        this.f14242d = new c8.d(z10);
        if (this.f14243e == null) {
            this.f14243e = new HandlerThreadC1675g(this);
        }
        if (z10) {
            C1672d c1672d = this.f14240b;
            C2074a c2074aS = c1672d.S("com.zipoapps.blytics#session", "session");
            if (c2074aS == null) {
                c2074aS = new C2074a("com.zipoapps.blytics#session", "session");
            }
            c1672d.W(c2074aS);
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            long j4 = e.a.a().i.f37004a.getLong("app_close_time", -1L);
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            long millis = TimeUnit.MINUTES.toMillis(((Integer) eVarA.f37020j.h(i8.d.f38543W)).longValue());
            if (j4 < 0 || System.currentTimeMillis() - j4 >= millis) {
                C2074a c2074aS2 = c1672d.S("com.zipoapps.blytics#session", "x-app-open");
                if (c2074aS2 == null) {
                    c2074aS2 = new C2074a("com.zipoapps.blytics#session", "x-app-open");
                }
                c1672d.W(c2074aS2);
            }
        }
        HandlerThreadC1675g handlerThreadC1675g = this.f14243e;
        if (handlerThreadC1675g.getState() == Thread.State.NEW) {
            handlerThreadC1675g.start();
        }
    }

    public final void d() {
        HandlerThreadC1675g handlerThreadC1675g = this.f14243e;
        HandlerThreadC1675g.a aVar = handlerThreadC1675g.f14251c;
        if (aVar != null) {
            aVar.removeMessages(2);
        }
        handlerThreadC1675g.quitSafely();
        this.f14243e = null;
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        SharedPreferences.Editor editorEdit = e.a.a().i.f37004a.edit();
        editorEdit.putLong("app_close_time", System.currentTimeMillis());
        editorEdit.apply();
        Iterator<AbstractC1669a> it = this.f14244f.iterator();
        while (it.hasNext()) {
            it.next().b(this.f14242d);
        }
    }
}
