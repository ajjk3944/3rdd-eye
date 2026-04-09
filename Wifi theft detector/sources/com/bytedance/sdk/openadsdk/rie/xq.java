package com.bytedance.sdk.openadsdk.rie;

import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    private emc dg;
    private dg xq;
    private ypw ypw;
    private final String emc = "StrategyCenter";
    private int bw = 0;
    private Runnable ycc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.rie.xq.2
        @Override // java.lang.Runnable
        public void run() {
            xq.this.ypw();
        }
    };

    public xq(dg dgVar) {
        this.ypw = null;
        bw bwVar = new bw(dgVar);
        this.xq = bwVar;
        String strXq = bwVar.xq();
        if (!TextUtils.isEmpty(strXq) && !strXq.startsWith("pag")) {
            strXq = "pag_".concat(strXq);
        }
        this.ypw = new ypw(this.xq.ypw(), strXq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw() {
        dg dgVar = this.xq;
        if (dgVar == null || dgVar.bw() == null || this.xq.ycc() == null) {
            return;
        }
        this.xq.emc().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.rie.xq.1
            @Override // java.lang.Runnable
            public void run() {
                HttpURLConnection httpURLConnection;
                OutputStream outputStream;
                xq.this.bw++;
                try {
                    if (xq.this.dg != null) {
                        xq.this.dg.emc();
                    }
                    httpURLConnection = (HttpURLConnection) new URL(xq.this.xq.bw()).openConnection();
                    if (xq.this.xq.uym() != null && xq.this.xq.uym().size() > 0) {
                        for (Map.Entry<String, String> entry : xq.this.xq.uym().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                    } catch (Throwable th) {
                        th = th;
                        outputStream = null;
                    }
                } catch (Throwable th2) {
                    Log.e("StrategyCenter", th2.getMessage() == null ? "error " : th2.getMessage());
                    if (xq.this.dg != null) {
                        xq.this.dg.emc(-1, th2.getMessage());
                    }
                }
                try {
                    outputStream.write(xq.this.xq.ycc().toString().getBytes());
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
                        JSONObject jSONObjectEmc = xq.this.xq.emc(new JSONObject(stringBuffer.toString()));
                        xq.this.ypw.emc();
                        xq.this.ypw.emc(jSONObjectEmc);
                        if (xq.this.dg != null) {
                            xq.this.dg.ypw();
                        }
                    } else if (xq.this.dg != null) {
                        xq.this.dg.emc(responseCode, httpURLConnection.getResponseMessage());
                    }
                    xq.this.ypw.emc("local_last_update_time", System.currentTimeMillis());
                    xq.this.emc();
                } catch (Throwable th3) {
                    th = th3;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            }
        });
    }

    public void emc(emc emcVar) {
        this.dg = emcVar;
    }

    public void emc() {
        if (this.xq != null) {
            int i10 = 3600000;
            int iEmc = this.ypw.emc("req_interval", 3600000);
            long j10 = 0;
            long jYpw = this.ypw.ypw("local_last_update_time", 0L);
            if (iEmc >= 600000 && iEmc <= 86400000) {
                i10 = iEmc;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jYpw;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j11 = i10;
                if (jCurrentTimeMillis <= j11) {
                    j10 = j11 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j10)));
            this.xq.dg().removeCallbacks(this.ycc);
            if (this.bw > 24) {
                return;
            }
            this.xq.dg().postDelayed(this.ycc, j10);
        }
    }

    public int emc(String str, int i10) {
        ypw ypwVar = this.ypw;
        return ypwVar == null ? i10 : ypwVar.emc(str, i10);
    }

    public String emc(String str, String str2) {
        ypw ypwVar = this.ypw;
        return ypwVar == null ? str2 : ypwVar.emc(str, str2);
    }

    public boolean emc(String str, boolean z10) {
        ypw ypwVar = this.ypw;
        return ypwVar == null ? z10 : ypwVar.emc(str, z10);
    }
}
