package com.google.firebase.remoteconfig.internal;

import C.C0635w;
import P7.w;
import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.d;
import g5.InterfaceC4392b;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import r5.f;
import r5.g;
import r5.h;
import r5.i;
import s5.C5576b;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    public static final long f23311j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f23312k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final h5.c f23313a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4392b<F4.a> f23314b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f23315c;

    /* renamed from: d, reason: collision with root package name */
    public final Clock f23316d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f23317e;

    /* renamed from: f, reason: collision with root package name */
    public final C5576b f23318f;

    /* renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f23319g;

    /* renamed from: h, reason: collision with root package name */
    public final d f23320h;
    public final HashMap i;

    /* compiled from: ConfigFetchHandler.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f23321a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.firebase.remoteconfig.internal.b f23322b;

        /* renamed from: c, reason: collision with root package name */
        public final String f23323c;

        public a(int i, com.google.firebase.remoteconfig.internal.b bVar, String str) {
            this.f23321a = i;
            this.f23322b = bVar;
            this.f23323c = str;
        }
    }

    /* compiled from: ConfigFetchHandler.java */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        b(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public c(h5.c cVar, InterfaceC4392b interfaceC4392b, Executor executor, Clock clock, Random random, C5576b c5576b, ConfigFetchHttpClient configFetchHttpClient, d dVar, HashMap map) {
        this.f23313a = cVar;
        this.f23314b = interfaceC4392b;
        this.f23315c = executor;
        this.f23316d = clock;
        this.f23317e = random;
        this.f23318f = c5576b;
        this.f23319g = configFetchHttpClient;
        this.f23320h = dVar;
        this.i = map;
    }

    public final a a(String str, String str2, Date date, HashMap map) throws g {
        Date date2;
        String str3;
        HttpURLConnection httpURLConnectionB;
        ConfigFetchHttpClient configFetchHttpClient;
        HashMap mapD;
        String string;
        F4.a aVar;
        try {
            httpURLConnectionB = this.f23319g.b();
            configFetchHttpClient = this.f23319g;
            mapD = d();
            string = this.f23320h.f23326a.getString("last_fetch_etag", null);
            aVar = this.f23314b.get();
            date2 = date;
        } catch (i e4) {
            e = e4;
            date2 = date;
        }
        try {
            a aVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, aVar != null ? (Long) aVar.a(true).get("_fot") : null, date2);
            com.google.firebase.remoteconfig.internal.b bVar = aVarFetch.f23322b;
            if (bVar != null) {
                d dVar = this.f23320h;
                long j4 = bVar.f23303f;
                synchronized (dVar.f23327b) {
                    dVar.f23326a.edit().putLong("last_template_version", j4).apply();
                }
            }
            String str4 = aVarFetch.f23323c;
            if (str4 != null) {
                this.f23320h.d(str4);
            }
            this.f23320h.c(0, d.f23325f);
            return aVarFetch;
        } catch (i e10) {
            e = e10;
            i iVar = e;
            int i = iVar.f45699b;
            d dVar2 = this.f23320h;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i10 = dVar2.a().f23330a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f23312k;
                dVar2.c(i10, new Date(date2.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f23317e.nextInt((int) r2)));
            }
            d.a aVarA = dVar2.a();
            int i11 = iVar.f45699b;
            if (aVarA.f23330a > 1 || i11 == 429) {
                aVarA.f23331b.getTime();
                throw new h("Fetch was throttled.");
            }
            if (i11 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i11 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i11 == 429) {
                    throw new f("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i11 != 500) {
                    switch (i11) {
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
            throw new i(iVar.f45699b, "Fetch failed: ".concat(str3), iVar);
        }
    }

    public final Task b(Task task, long j4, HashMap map) {
        Task taskContinueWithTask;
        Date date = new Date(this.f23316d.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        d dVar = this.f23320h;
        if (zIsSuccessful) {
            Date date2 = new Date(dVar.f23326a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(d.f23324e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j4) + date2.getTime()))) {
                return Tasks.forResult(new a(2, null, null));
            }
        }
        Date date3 = dVar.a().f23331b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f23315c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new h(str));
        } else {
            h5.c cVar = this.f23313a;
            Task<String> id = cVar.getId();
            Task taskA = cVar.a();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, taskA}).continueWithTask(executor, new w(this, id, taskA, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new N.g(this, date));
    }

    public final Task<a> c(b bVar, int i) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.getValue() + "/" + i);
        return this.f23318f.b().continueWithTask(this.f23315c, new C0635w(10, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        F4.a aVar = this.f23314b.get();
        if (aVar != null) {
            for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
