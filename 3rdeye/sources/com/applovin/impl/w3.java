package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class w3 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21689a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21690b = com.applovin.impl.sdk.k.o();

    /* renamed from: c, reason: collision with root package name */
    private String f21691c;

    public w3(com.applovin.impl.sdk.k kVar) {
        this.f21689a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() throws IOException {
        if (this.f21691c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f21690b.getResources().openRawResource(R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f21691c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb.append(line);
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e4);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
            }
        } catch (Throwable th3) {
            this.f21689a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21689a.O().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f21690b);
        this.f21689a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVarO = this.f21689a.O();
            StringBuilder sb = new StringBuilder("Init ");
            sb.append(d() ? "succeeded" : "failed");
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append("ms");
            oVarO.a("OpenMeasurementService", sb.toString());
        }
        h();
    }

    private void h() {
        this.f21689a.q0().a((w4) new f6(this.f21689a, "OpenMeasurementService", new C2.h(this, 24)), r5.b.OTHER);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.f21689a.n0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f21689a.a(l4.f19911e0)).booleanValue()) {
            this.f21689a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21689a.O().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new L0(this, 6));
        }
    }

    public String a() {
        return this.f21691c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f21689a.a(l4.f19918f0), AppLovinSdk.VERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r4, java.util.Map r5) {
        /*
            r3 = this;
            boolean r0 = r3.e()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            com.applovin.impl.sdk.k r0 = r3.f21689a     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = com.applovin.impl.x3.a(r0, r5)     // Catch: java.lang.Throwable -> L17
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r5 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r5, r4)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r5 = move-exception
            goto L21
        L19:
            r5 = r4
        L1a:
            java.lang.String r0 = r3.f21691c     // Catch: java.lang.Throwable -> L17
            java.lang.String r4 = com.iab.omid.library.applovin.ScriptInjector.injectScriptContentIntoHtml(r0, r5)     // Catch: java.lang.Throwable -> L17
            return r4
        L21:
            com.applovin.impl.sdk.k r0 = r3.f21689a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L39
            com.applovin.impl.sdk.k r0 = r3.f21689a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.String r1 = "OpenMeasurementService"
            java.lang.String r2 = "Failed to inject JavaScript SDK into HTML"
            r0.a(r1, r2, r5)
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.w3.a(java.lang.String, java.util.Map):java.lang.String");
    }
}
