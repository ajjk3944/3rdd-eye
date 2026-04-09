package pg;

import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i1;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import dd.r;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kg.q;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final long f20513i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final fg.e f20514a;

    /* renamed from: b, reason: collision with root package name */
    public final eg.b f20515b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f20516c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f20517d;

    /* renamed from: e, reason: collision with root package name */
    public final c f20518e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f20519f;

    /* renamed from: g, reason: collision with root package name */
    public final m f20520g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f20521h;

    public h(fg.e eVar, eg.b bVar, Executor executor, Random random, c cVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, HashMap map) {
        this.f20514a = eVar;
        this.f20515b = bVar;
        this.f20516c = executor;
        this.f20517d = random;
        this.f20518e = cVar;
        this.f20519f = configFetchHttpClient;
        this.f20520g = mVar;
        this.f20521h = map;
    }

    public final f a(String str, String str2, Date date, HashMap map) throws og.e {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f20519f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f20519f;
            HashMap mapD = d();
            String string = this.f20520g.f20550a.getString("last_fetch_etag", null);
            we.b bVar = (we.b) this.f20515b.get();
            f fVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, bVar != null ? (Long) ((i1) ((we.c) bVar).f24485a.f25996d).a(null, null, true).get("_fot") : null, date, this.f20520g.b());
            d dVar = fVarFetch.f20511b;
            if (dVar != null) {
                m mVar = this.f20520g;
                long j7 = dVar.f20503f;
                synchronized (mVar.f20551b) {
                    mVar.f20550a.edit().putLong("last_template_version", j7).apply();
                }
            }
            String str4 = fVarFetch.f20512c;
            if (str4 != null) {
                m mVar2 = this.f20520g;
                synchronized (mVar2.f20551b) {
                    mVar2.f20550a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f20520g.d(0, m.f20549f);
            return fVarFetch;
        } catch (og.g e4) {
            int i10 = e4.f19437a;
            m mVar3 = this.f20520g;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = mVar3.a().f20546a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                mVar3.d(i11, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]) / 2) + this.f20517d.nextInt((int) r3)));
            }
            l lVarA = mVar3.a();
            int i12 = e4.f19437a;
            if (lVarA.f20546a > 1 || i12 == 429) {
                lVarA.f20547b.getTime();
                throw new og.f("Fetch was throttled.");
            }
            if (i12 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i12 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i12 == 429) {
                    throw new og.c("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new og.g(e4.f19437a, "Fetch failed: ".concat(str3), e4);
        }
    }

    public final r b(r rVar, long j7, final HashMap map) {
        r rVarF;
        final Date date = new Date(System.currentTimeMillis());
        boolean zJ = rVar.j();
        m mVar = this.f20520g;
        if (zJ) {
            Date date2 = new Date(mVar.f20550a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(m.f20548e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j7) + date2.getTime()))) {
                return e5.u(new f(2, null, null));
            }
        }
        Date date3 = mVar.a().f20547b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f20516c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            rVarF = e5.t(new og.f(str));
        } else {
            fg.d dVar = (fg.d) this.f20514a;
            final r rVarC = dVar.c();
            final r rVarD = dVar.d();
            rVarF = e5.V(rVarC, rVarD).f(executor, new dd.a() { // from class: pg.e
                @Override // dd.a
                public final Object j(r rVar2) {
                    h hVar = this.f20505a;
                    Date date5 = date;
                    HashMap map2 = map;
                    r rVar3 = rVarC;
                    if (!rVar3.j()) {
                        return e5.t(new og.c(rVar3.g(), "Firebase Installations failed to get installation ID for fetch."));
                    }
                    r rVar4 = rVarD;
                    if (!rVar4.j()) {
                        return e5.t(new og.c(rVar4.g(), "Firebase Installations failed to get installation auth token for fetch."));
                    }
                    try {
                        f fVarA = hVar.a((String) rVar3.h(), ((fg.a) rVar4.h()).f8838a, date5, map2);
                        return fVarA.f20510a != 0 ? e5.u(fVarA) : hVar.f20518e.d(fVarA.f20511b).k(hVar.f20516c, new io.sentry.android.replay.capture.e(21, fVarA));
                    } catch (og.e e4) {
                        return e5.t(e4);
                    }
                }
            });
        }
        return rVarF.f(executor, new q(this, 5, date));
    }

    public final r c(g gVar, int i10) {
        HashMap map = new HashMap(this.f20521h);
        map.put("X-Firebase-RC-Fetch-Type", gVar.getValue() + "/" + i10);
        return this.f20518e.b().f(this.f20516c, new q(this, 4, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        we.b bVar = (we.b) this.f20515b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((i1) ((we.c) bVar).f24485a.f25996d).a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
