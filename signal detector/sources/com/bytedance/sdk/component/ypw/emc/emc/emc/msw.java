package com.bytedance.sdk.component.ypw.emc.emc.emc;

import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.cf;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class msw extends qh {
    public static int emc = -1;
    String bw;
    int dg;
    sup xq;
    HttpURLConnection ypw;

    public msw(HttpURLConnection httpURLConnection, sup supVar) {
        this.dg = emc;
        this.ypw = httpURLConnection;
        this.xq = supVar;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh
    public String bw() {
        return !TextUtils.isEmpty(this.bw) ? this.bw : this.ypw.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ycc().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh
    public boolean dg() {
        return xq() >= 200 && xq() < 300;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh
    public long emc() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh
    public com.bytedance.sdk.component.ypw.emc.ru msw() {
        if (zz() == null || zz().ypw == null) {
            return null;
        }
        return new com.bytedance.sdk.component.ypw.emc.ru(zz().ypw);
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh
    public com.bytedance.sdk.component.ypw.emc.ycc uym() {
        if (this.ypw == null) {
            return new com.bytedance.sdk.component.ypw.emc.ycc(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.ypw.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || xq() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.ypw.emc.ycc((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh
    public int xq() {
        try {
            return this.ypw.getResponseCode();
        } catch (Exception unused) {
            return this.dg;
        }
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh
    public cf ycc() {
        zz zzVar;
        com.bytedance.sdk.component.xq.emc.emc emcVar;
        com.bytedance.sdk.component.xq.emc.emc emcVar2;
        sup supVar = this.xq;
        if (supVar != null && (emcVar2 = supVar.ypw) != null) {
            emcVar2.gbl();
        }
        try {
            try {
                zzVar = new zz(this.ypw);
            } catch (Throwable th) {
                th.getMessage();
                zzVar = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.ypw;
            zzVar = new zz(httpURLConnection, httpURLConnection.getErrorStream());
        }
        sup supVar2 = this.xq;
        if (supVar2 != null && (emcVar = supVar2.ypw) != null) {
            emcVar.sz();
        }
        return zzVar;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.qh
    public long ypw() {
        return 0L;
    }

    public sup zz() {
        return this.xq;
    }

    public msw(int i, String str, sup supVar) {
        this.bw = str;
        this.xq = supVar;
        this.dg = i;
    }
}
