package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.ko;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends jg {
    public static int ouw = -1;
    String fkw;

    /* renamed from: lh, reason: collision with root package name */
    ryl f7656lh;
    HttpURLConnection vt;
    int yu;

    public pno(HttpURLConnection httpURLConnection, ryl rylVar) {
        this.yu = ouw;
        this.vt = httpURLConnection;
        this.f7656lh = rylVar;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            yu().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final com.bytedance.sdk.component.vt.ouw.le fkw() {
        if (this.vt == null) {
            return new com.bytedance.sdk.component.vt.ouw.le(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.vt.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || ouw() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.vt.ouw.le((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final com.bytedance.sdk.component.vt.ouw.tlj le() {
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        ryl rylVar = this.f7656lh;
        if (rylVar == null || (ouwVar = rylVar.vt) == null) {
            return null;
        }
        return new com.bytedance.sdk.component.vt.ouw.tlj(ouwVar);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final String lh() throws IOException {
        return !TextUtils.isEmpty(this.fkw) ? this.fkw : this.vt.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final int ouw() {
        try {
            return this.vt.getResponseCode();
        } catch (Exception unused) {
            return this.yu;
        }
    }

    public final String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final boolean vt() {
        return ouw() >= 200 && ouw() < 300;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.jg
    public final ko yu() {
        bly blyVar;
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar2;
        ryl rylVar = this.f7656lh;
        if (rylVar != null && (ouwVar2 = rylVar.vt) != null) {
            ouwVar2.ra = SystemClock.elapsedRealtime();
        }
        try {
            try {
                blyVar = new bly(this.vt);
            } catch (Exception unused) {
                HttpURLConnection httpURLConnection = this.vt;
                blyVar = new bly(httpURLConnection, httpURLConnection.getErrorStream());
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.yu(th2.getMessage());
            blyVar = null;
        }
        ryl rylVar2 = this.f7656lh;
        if (rylVar2 != null && (ouwVar = rylVar2.vt) != null) {
            ouwVar.pno = SystemClock.elapsedRealtime();
        }
        return blyVar;
    }

    public pno(int i4, String str, ryl rylVar) {
        this.fkw = str;
        this.f7656lh = rylVar;
        this.yu = i4;
    }
}
