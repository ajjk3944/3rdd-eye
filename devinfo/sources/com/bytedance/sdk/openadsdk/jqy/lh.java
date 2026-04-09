package com.bytedance.sdk.openadsdk.jqy;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {

    /* renamed from: lh, reason: collision with root package name */
    public ouw f8556lh;
    public vt ouw;
    yu vt;
    private final String fkw = "StrategyCenter";
    int yu = 0;

    /* renamed from: le, reason: collision with root package name */
    private Runnable f8555le = new Runnable() { // from class: com.bytedance.sdk.openadsdk.jqy.lh.2
        @Override // java.lang.Runnable
        public final void run() {
            final lh lhVar = lh.this;
            yu yuVar = lhVar.vt;
            if (yuVar == null || yuVar.fkw() == null || lhVar.vt.le() == null) {
                return;
            }
            lhVar.vt.ouw().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jqy.lh.1
                @Override // java.lang.Runnable
                public final void run() {
                    HttpURLConnection httpURLConnection;
                    OutputStream outputStream;
                    lh lhVar2 = lh.this;
                    lhVar2.yu++;
                    try {
                        ouw ouwVar = lhVar2.f8556lh;
                        if (ouwVar != null) {
                            ouwVar.ouw();
                        }
                        httpURLConnection = (HttpURLConnection) new URL(lh.this.vt.fkw()).openConnection();
                        if (lh.this.vt.ra() != null && lh.this.vt.ra().size() > 0) {
                            for (Map.Entry<String, String> entry : lh.this.vt.ra().entrySet()) {
                                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/json");
                        try {
                            outputStream = httpURLConnection.getOutputStream();
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = null;
                        }
                    } catch (Throwable th3) {
                        Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                        ouw ouwVar2 = lh.this.f8556lh;
                        if (ouwVar2 != null) {
                            th3.getMessage();
                            ouwVar2.lh();
                        }
                    }
                    try {
                        outputStream.write(lh.this.vt.le().toString().getBytes());
                        outputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        Log.i("StrategyCenter", "executing strategy fetch");
                        if (responseCode == 200) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            StringBuffer stringBuffer = new StringBuffer();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    stringBuffer.append(line);
                                }
                            }
                            bufferedReader.close();
                            JSONObject jSONObjectOuw = lh.this.vt.ouw(new JSONObject(stringBuffer.toString()));
                            SharedPreferences sharedPreferencesOuw = lh.this.ouw.ouw();
                            if (sharedPreferencesOuw != null) {
                                SharedPreferences.Editor editorEdit = sharedPreferencesOuw.edit();
                                editorEdit.clear();
                                editorEdit.commit();
                            }
                            lh.this.ouw.ouw(jSONObjectOuw);
                            ouw ouwVar3 = lh.this.f8556lh;
                            if (ouwVar3 != null) {
                                ouwVar3.vt();
                            }
                        } else {
                            ouw ouwVar4 = lh.this.f8556lh;
                            if (ouwVar4 != null) {
                                httpURLConnection.getResponseMessage();
                                ouwVar4.lh();
                            }
                        }
                        vt vtVar = lh.this.ouw;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            SharedPreferences sharedPreferencesOuw2 = vtVar.ouw();
                            if (sharedPreferencesOuw2 != null) {
                                SharedPreferences.Editor editorEdit2 = sharedPreferencesOuw2.edit();
                                editorEdit2.putLong("local_last_update_time", jCurrentTimeMillis);
                                editorEdit2.apply();
                            }
                        } catch (Throwable th4) {
                            Log.e("SPUnit", th4.getMessage());
                        }
                        lh.this.ouw();
                    } catch (Throwable th5) {
                        th = th5;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                }
            });
        }
    };

    public lh(yu yuVar) {
        this.ouw = null;
        fkw fkwVar = new fkw(yuVar);
        this.vt = fkwVar;
        String strLh = fkwVar.lh();
        if (!TextUtils.isEmpty(strLh) && !strLh.startsWith("pag")) {
            strLh = "pag_".concat(strLh);
        }
        this.ouw = new vt(this.vt.vt(), strLh);
    }

    public final void ouw() {
        if (this.vt != null) {
            int i4 = 3600000;
            int iOuw = this.ouw.ouw("req_interval", 3600000);
            long jOuw = this.ouw.ouw("local_last_update_time");
            if (iOuw >= 600000 && iOuw <= 86400000) {
                i4 = iOuw;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jOuw;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            long j = 0;
            if (jCurrentTimeMillis >= 0) {
                long j8 = i4;
                if (jCurrentTimeMillis <= j8) {
                    j = j8 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j)));
            this.vt.yu().removeCallbacks(this.f8555le);
            if (this.yu > 24) {
                return;
            }
            this.vt.yu().postDelayed(this.f8555le, j);
        }
    }

    public final String ouw(String str, String str2) {
        vt vtVar = this.ouw;
        return vtVar == null ? str2 : vtVar.ouw(str, str2);
    }
}
