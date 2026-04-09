package D7;

import C.C0624k;
import C.S;
import C.k0;
import E.C0657e;
import E.o;
import G3.b;
import O6.t;
import W.F;
import android.app.usage.UsageStatsManager;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.core.impl.InterfaceC1700l0;
import androidx.camera.core.impl.X;
import com.applovin.impl.sdk.c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e.InterfaceC4291b;
import g5.InterfaceC4391a;
import g5.InterfaceC4392b;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.C4679i2;
import io.appmetrica.analytics.impl.G2;
import io.appmetrica.analytics.impl.RunnableC4502b6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.l;
import o0.b;
import u5.InterfaceC5635a;
import v.C5658m;
import v.C5664t;
import v.C5670z;
import v.O;
import v.r;
import w.C5687a;
import w3.b;
import x3.E;
import x3.m;
import y7.c;
import y7.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements z7.c, InterfaceC1700l0.a, b.a, N4.b, InterfaceC4391a.InterfaceC0459a, b.c, c.f, Continuation, I.a, k0.e, c.b, InterfaceC4291b, FunctionWithThrowable, ActivationBarrierCallback, t.b, v.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1075c;

    public /* synthetic */ c(Object obj, int i) {
        this.f1074b = i;
        this.f1075c = obj;
    }

    @Override // com.applovin.impl.sdk.c.b
    public void a(c.a aVar) {
        ((com.applovin.impl.sdk.d) this.f1075c).c(aVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, I.a
    public Object apply(Object obj) {
        return G2.a((C4679i2) this.f1075c, (UsageStatsManager) obj);
    }

    @Override // z7.c
    public void b(Exception exc) {
        d(exc);
    }

    @Override // androidx.camera.core.impl.InterfaceC1700l0.a
    public void c(InterfaceC1700l0 interfaceC1700l0) throws Exception {
        o oVar = (o) this.f1075c;
        try {
            androidx.camera.core.c cVarB = interfaceC1700l0.b();
            if (cVarB != null) {
                if (oVar.f1324a == null) {
                    S.g("CaptureNode", "Postview image is closed due to request completed or aborted");
                    cVarB.close();
                } else {
                    C0657e c0657e = oVar.f1327d;
                    Objects.requireNonNull(c0657e);
                    c0657e.f1309b.accept(new E.f(oVar.f1324a, cVarB));
                }
            }
        } catch (IllegalStateException e4) {
            S.c("CaptureNode", "Failed to acquire latest image of postview", e4);
        }
    }

    @Override // z7.c
    public void d(Exception exc) {
        d this$0 = (d) this.f1075c;
        l.f(this$0, "this$0");
        this$0.f1077c.add(exc);
        this$0.f1076b.a().d(exc);
    }

    @Override // N4.b
    public void e(N4.a aVar) {
        K4.a aVar2 = (K4.a) this.f1075c;
        synchronized (aVar2) {
            try {
                if (aVar2.f3140b instanceof N4.c) {
                    aVar2.f3141c.add(aVar);
                }
                aVar2.f3140b.e(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G3.b.a
    public Object execute() {
        return Integer.valueOf(((F3.d) this.f1075c).s());
    }

    @Override // C.k0.e
    public void f(C0624k c0624k) {
        ((F) this.f1075c).f13126r = c0624k;
    }

    public b.C0544b g(b.a aVar) throws IOException {
        w3.b bVar = (w3.b) this.f1075c;
        bVar.getClass();
        String strC = C3.a.c("CctTransportBackend");
        boolean zIsLoggable = Log.isLoggable(strC, 4);
        URL url = aVar.f47336a;
        if (zIsLoggable) {
            Log.i(strC, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f47335g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f47338c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    F3.f fVar = bVar.f47329a;
                    m mVar = aVar.f47337b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    b5.d dVar = (b5.d) fVar.f1607b;
                    b5.e eVar = new b5.e(bufferedWriter, dVar.f17187a, dVar.f17188b, dVar.f17189c, dVar.f17190d);
                    eVar.g(mVar);
                    eVar.i();
                    eVar.f17193b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strC2 = C3.a.c("CctTransportBackend");
                    if (Log.isLoggable(strC2, 4)) {
                        Log.i(strC2, String.format("Status Code: %d", numValueOf));
                    }
                    C3.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C3.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b.C0544b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b.C0544b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            b.C0544b c0544b = new b.C0544b(responseCode, null, E.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f47756a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c0544b;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Z4.b e4) {
            e = e4;
            C3.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b.C0544b(400, null, 0L);
        } catch (ConnectException e10) {
            e = e10;
            C3.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b.C0544b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            C3.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b.C0544b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            C3.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b.C0544b(400, null, 0L);
        }
    }

    @Override // g5.InterfaceC4391a.InterfaceC0459a
    public void h(InterfaceC4392b interfaceC4392b) {
        switch (this.f1074b) {
            case 4:
                L4.b bVar = (L4.b) this.f1075c;
                bVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                bVar.f4055b.set((L4.a) interfaceC4392b.get());
                break;
            default:
                ((InterfaceC5635a) interfaceC4392b.get()).a((L4.c) this.f1075c);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    break;
                }
                break;
        }
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        switch (this.f1074b) {
            case 6:
                ((N.t) this.f1075c).f4459l = aVar;
                return "SurfaceOutputImpl close future complete";
            case 11:
                X x10 = (X) this.f1075c;
                synchronized (x10.f14987a) {
                    x10.f14992f = aVar;
                }
                return "DeferrableSurface-close(" + x10 + ")";
            case 20:
                C5658m c5658m = (C5658m) this.f1075c;
                c5658m.getClass();
                c5658m.f46753c.execute(new B.a(29, c5658m, aVar));
                return "updateSessionConfigAsync";
            case 21:
                C5664t c5664t = (C5664t) this.f1075c;
                c5664t.getClass();
                try {
                    ArrayList arrayList = new ArrayList(c5664t.f46872b.a().b().f14880c);
                    arrayList.add(c5664t.f46895z.f46667f);
                    arrayList.add(new r(c5664t, aVar));
                    c5664t.f46873c.f47151a.d(c5664t.f46880k.f46923a, c5664t.f46874d, O.a(arrayList));
                    return "configAndCloseTask";
                } catch (SecurityException | C5687a e4) {
                    c5664t.u("Unable to open camera for configAndClose: " + e4.getMessage(), e4);
                    aVar.d(e4);
                    return "configAndCloseTask";
                }
            default:
                C5670z.a aVar2 = (C5670z.a) this.f1075c;
                aVar2.f46961a.f46758h.c(aVar);
                aVar2.f46962b.f48393b = true;
                return "AePreCapture";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[LOOP:0: B:24:0x0085->B:25:0x0087, LOOP_END] */
    @Override // e.InterfaceC4291b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(java.lang.Object r7) {
        /*
            r6 = this;
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = "result"
            kotlin.jvm.internal.l.f(r7, r0)
            java.lang.Object r0 = r6.f1075c
            e8.c r0 = (e8.c) r0
            r0.getClass()
            java.util.Collection r1 = r7.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L23
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L23
            goto L67
        L23:
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L27
            java.util.Set r1 = r7.keySet()
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            x2.a r2 = r0.f37760b
            boolean r1 = e8.f.b(r2, r1)
            if (r1 == 0) goto L57
            I2.j r1 = r0.f37765f
            if (r1 == 0) goto L91
            r1.invoke(r0, r7)
            goto L91
        L57:
            I2.l r1 = r0.f37767h
            if (r1 == 0) goto L91
            boolean r2 = r0.f37761c
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.invoke(r0, r7, r2)
            goto L91
        L67:
            I2.i r7 = r0.f37764e
            if (r7 == 0) goto L6e
            r7.invoke(r0)
        L6e:
            com.zipoapps.premiumhelper.e$a r7 = com.zipoapps.premiumhelper.e.f37006D
            r7.getClass()
            com.zipoapps.premiumhelper.e r7 = com.zipoapps.premiumhelper.e.a.a()
            J8.H r7 = r7.f37022l
            r7.getClass()
            java.lang.String r7 = "permissions"
            java.lang.String[] r1 = r0.f37763d
            kotlin.jvm.internal.l.f(r1, r7)
            int r7 = r1.length
            r2 = r3
        L85:
            if (r2 >= r7) goto L91
            r4 = r1[r2]
            java.lang.String r5 = "true"
            J8.H.a(r4, r5)
            int r2 = r2 + 1
            goto L85
        L91:
            r0.f37761c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D7.c.onActivityResult(java.lang.Object):void");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        RunnableC4502b6.a((RunnableC4502b6) this.f1075c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        switch (this.f1074b) {
            case 8:
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1075c;
                if (zIsSuccessful) {
                    taskCompletionSource.setResult(task.getResult());
                    return null;
                }
                if (task.getException() == null) {
                    return null;
                }
                taskCompletionSource.setException(task.getException());
                return null;
            default:
                ((n5.l) this.f1075c).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString(com.vungle.ads.internal.presenter.g.ERROR);
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // y7.c.f
    public List a() {
        return (ArrayList) this.f1075c;
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        switch (this.f1074b) {
            case 9:
                return ((E.i) ((A4.a) this.f1075c).get()).b();
            case 14:
                return ((androidx.camera.view.a) this.f1075c).f15174d.g();
            default:
                return ((C5670z.g) this.f1075c).f46986a.f46758h.b(true);
        }
    }
}
