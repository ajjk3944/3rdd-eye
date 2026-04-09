package lf;

import android.text.format.DateUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final long f28762i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final df.d f28763a;

    /* renamed from: b, reason: collision with root package name */
    public final cf.b f28764b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f28765c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f28766d;

    /* renamed from: e, reason: collision with root package name */
    public final b f28767e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f28768f;
    public final l g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f28769h;

    public g(df.d dVar, cf.b bVar, Executor executor, Random random, b bVar2, ConfigFetchHttpClient configFetchHttpClient, l lVar, HashMap map) {
        this.f28763a = dVar;
        this.f28764b = bVar;
        this.f28765c = executor;
        this.f28766d = random;
        this.f28767e = bVar2;
        this.f28768f = configFetchHttpClient;
        this.g = lVar;
        this.f28769h = map;
    }

    public final f a(String str, String str2, Date date, HashMap map) throws kf.d {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f28768f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f28768f;
            HashMap mapD = d();
            String string = this.g.f28797a.getString("last_fetch_etag", null);
            ae.b bVar = (ae.b) this.f28764b.get();
            f fVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, bVar != null ? (Long) ((k1) ((ae.c) bVar).f354a.f30421b).a(null, null, true).get("_fot") : null, date, this.g.b());
            c cVar = fVarFetch.f28760b;
            if (cVar != null) {
                l lVar = this.g;
                long j8 = cVar.f28751f;
                synchronized (lVar.f28798b) {
                    lVar.f28797a.edit().putLong("last_template_version", j8).apply();
                }
            }
            String str4 = fVarFetch.f28761c;
            if (str4 != null) {
                this.g.e(str4);
            }
            this.g.d(0, l.f28796f);
            return fVarFetch;
        } catch (kf.f e2) {
            int i4 = e2.f28270a;
            l lVar2 = this.g;
            if (i4 == 429 || i4 == 502 || i4 == 503 || i4 == 504) {
                int i10 = lVar2.a().f28793a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                lVar2.d(i10, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f28766d.nextInt((int) r3)));
            }
            k kVarA = lVar2.a();
            int i11 = e2.f28270a;
            if (kVarA.f28793a > 1 || i11 == 429) {
                kVarA.f28794b.getTime();
                throw new kf.e("Fetch was throttled.");
            }
            if (i11 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i11 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i11 == 429) {
                    throw new kf.c("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i11 != 500) {
                    switch (i11) {
                        case PglCryptUtils.INPUT_INVALID /* 502 */:
                        case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                        case PglCryptUtils.BASE64_FAILED /* 504 */:
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
            throw new kf.f(e2.f28270a, "Fetch failed: ".concat(str3), e2);
        }
    }

    public final Task b(Task task, long j8, HashMap map) {
        Task taskContinueWithTask;
        Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        l lVar = this.g;
        if (zIsSuccessful) {
            Date date2 = new Date(lVar.f28797a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(l.f28795e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j8) + date2.getTime()))) {
                return Tasks.forResult(new f(2, null, null));
            }
        }
        Date date3 = lVar.a().f28794b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f28765c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new kf.e(str));
        } else {
            df.c cVar = (df.c) this.f28763a;
            Task taskD = cVar.d();
            Task taskF = cVar.f();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskF}).continueWithTask(executor, new d(this, taskD, taskF, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new com.applovin.impl.sdk.ad.f(12, this, date));
    }

    public final Task c(int i4) {
        HashMap map = new HashMap(this.f28769h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i4);
        return this.f28767e.b().continueWithTask(this.f28765c, new com.applovin.impl.sdk.ad.f(13, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        ae.b bVar = (ae.b) this.f28764b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((k1) ((ae.c) bVar).f354a.f30421b).a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
