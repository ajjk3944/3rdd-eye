package com.google.firebase.remoteconfig.internal;

import N7.G8;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import r5.C5523a;
import r5.f;
import r5.g;
import r5.i;
import s5.C5576b;

/* compiled from: ConfigAutoFetch.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f23287a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f23288b;

    /* renamed from: c, reason: collision with root package name */
    public final c f23289c;

    /* renamed from: d, reason: collision with root package name */
    public final C5576b f23290d;

    /* renamed from: e, reason: collision with root package name */
    public final e.b f23291e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f23292f;

    /* renamed from: g, reason: collision with root package name */
    public final Random f23293g = new Random();

    /* compiled from: ConfigAutoFetch.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    public class RunnableC0349a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23294b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f23295c;

        public RunnableC0349a(int i, long j4) {
            this.f23294b = i;
            this.f23295c = j4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final a aVar = a.this;
            int i = this.f23294b;
            final long j4 = this.f23295c;
            synchronized (aVar) {
                final int i10 = i - 1;
                final Task<c.a> taskC = aVar.f23289c.c(c.b.REALTIME, 3 - i10);
                final Task<b> taskB = aVar.f23290d.b();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask(aVar.f23292f, new Continuation() { // from class: s5.a
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) throws JSONException {
                        Boolean boolValueOf;
                        JSONObject jSONObject;
                        com.google.firebase.remoteconfig.internal.a aVar2 = aVar;
                        Task task2 = taskC;
                        Task task3 = taskB;
                        long j10 = j4;
                        int i11 = i10;
                        aVar2.getClass();
                        if (!task2.isSuccessful()) {
                            return Tasks.forException(new f("Failed to auto-fetch config update.", task2.getException()));
                        }
                        if (!task3.isSuccessful()) {
                            return Tasks.forException(new f("Failed to get activated config for auto-fetch", task3.getException()));
                        }
                        c.a aVar3 = (c.a) task2.getResult();
                        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) task3.getResult();
                        com.google.firebase.remoteconfig.internal.b bVar2 = aVar3.f23322b;
                        if (bVar2 != null) {
                            boolValueOf = Boolean.valueOf(bVar2.f23303f >= j10);
                        } else {
                            boolValueOf = Boolean.valueOf(aVar3.f23321a == 1);
                        }
                        if (!boolValueOf.booleanValue()) {
                            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                            aVar2.a(i11, j10);
                            return Tasks.forResult(null);
                        }
                        if (aVar3.f23322b == null) {
                            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                            return Tasks.forResult(null);
                        }
                        if (bVar == null) {
                            b.a aVarC = com.google.firebase.remoteconfig.internal.b.c();
                            bVar = new com.google.firebase.remoteconfig.internal.b(aVarC.f23305a, aVarC.f23306b, aVarC.f23307c, aVarC.f23308d, aVarC.f23309e, aVarC.f23310f);
                        }
                        com.google.firebase.remoteconfig.internal.b bVar3 = aVar3.f23322b;
                        com.google.firebase.remoteconfig.internal.b bVarA = com.google.firebase.remoteconfig.internal.b.a(new JSONObject(bVar3.f23298a.toString()));
                        HashMap mapB = bVar.b();
                        HashMap mapB2 = bVar3.b();
                        HashSet hashSet = new HashSet();
                        JSONObject jSONObject2 = bVar.f23299b;
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (true) {
                            boolean zHasNext = itKeys.hasNext();
                            jSONObject = bVarA.f23299b;
                            if (!zHasNext) {
                                break;
                            }
                            String next = itKeys.next();
                            JSONObject jSONObject3 = bVar3.f23299b;
                            if (!jSONObject3.has(next)) {
                                hashSet.add(next);
                            } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                                JSONObject jSONObject4 = bVar.f23302e;
                                boolean zHas = jSONObject4.has(next);
                                JSONObject jSONObject5 = bVar3.f23302e;
                                if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                    hashSet.add(next);
                                } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                                    hashSet.add(next);
                                } else {
                                    jSONObject.remove(next);
                                }
                            } else {
                                hashSet.add(next);
                            }
                        }
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (itKeys2.hasNext()) {
                            hashSet.add(itKeys2.next());
                        }
                        if (hashSet.isEmpty()) {
                            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                            return Tasks.forResult(null);
                        }
                        new C5523a(hashSet);
                        synchronized (aVar2) {
                            Iterator it = aVar2.f23287a.iterator();
                            while (it.hasNext()) {
                                ((r5.c) it.next()).getClass();
                            }
                        }
                        return Tasks.forResult(null);
                    }
                });
            }
        }
    }

    public a(HttpURLConnection httpURLConnection, c cVar, C5576b c5576b, LinkedHashSet linkedHashSet, e.b bVar, ScheduledExecutorService scheduledExecutorService) {
        this.f23288b = httpURLConnection;
        this.f23289c = cVar;
        this.f23290d = c5576b;
        this.f23287a = linkedHashSet;
        this.f23291e = bVar;
        this.f23292f = scheduledExecutorService;
    }

    public final void a(int i, long j4) {
        if (i == 0) {
            g.a aVar = g.a.UNKNOWN;
            d(new i("Unable to fetch the latest version of the template."));
            return;
        }
        this.f23292f.schedule(new RunnableC0349a(i, j4), this.f23293g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strS = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strS = G8.s(strS, line);
            if (line.contains("}")) {
                int iIndexOf = strS.indexOf(123);
                int iLastIndexOf = strS.lastIndexOf(125);
                strS = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strS.substring(iIndexOf, iLastIndexOf + 1);
                if (!strS.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strS);
                    } catch (JSONException e4) {
                        Throwable cause = e4.getCause();
                        g.a aVar = g.a.UNKNOWN;
                        d(new f("Unable to parse config update message.", cause));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e4);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        e.b bVar = this.f23291e;
                        g.a aVar2 = g.a.UNKNOWN;
                        bVar.a(new i("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = this.f23287a.isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j4 = this.f23289c.f23320h.f23326a.getLong("last_template_version", 0L);
                        long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j10 > j4) {
                            a(3, j10);
                        }
                    }
                    strS = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f23288b;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            b(inputStream);
            inputStream.close();
        } catch (IOException e4) {
            Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e4);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final synchronized void d(g gVar) {
        Iterator it = this.f23287a.iterator();
        while (it.hasNext()) {
            ((r5.c) it.next()).a(gVar);
        }
    }
}
