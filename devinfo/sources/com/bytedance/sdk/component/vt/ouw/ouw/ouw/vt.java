package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.pno;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements com.bytedance.sdk.component.vt.ouw.vt {
    private static List<Object> yu;

    /* renamed from: lh, reason: collision with root package name */
    private AtomicBoolean f7657lh = new AtomicBoolean(false);
    ryl ouw;
    com.bytedance.sdk.component.vt.ouw.yu vt;

    static {
        try {
            yu = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                yu.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                yu.add(enumValueOf2);
            }
        } catch (Throwable th2) {
            ko.fkw("get protocol error", th2.getMessage());
        }
    }

    public vt(ryl rylVar, com.bytedance.sdk.component.vt.ouw.yu yuVar) {
        this.ouw = rylVar;
        this.vt = yuVar;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new vt(this.ouw, this.vt);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final void lh() {
        this.f7657lh.set(true);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final ryl ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final jg vt() throws IOException {
        List<com.bytedance.sdk.component.vt.ouw.pno> list;
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        ryl rylVar = this.ouw;
        if (rylVar != null && (ouwVar = rylVar.vt) != null) {
            if (ouwVar.vt == 0) {
                ouwVar.vt = SystemClock.elapsedRealtime();
            }
            this.ouw.vt.f7589lh = SystemClock.elapsedRealtime();
        }
        this.vt.yu().remove(this);
        this.vt.fkw().add(this);
        com.bytedance.sdk.component.vt.ouw.yu yuVar = this.vt;
        if (yuVar instanceof le) {
            if (this.vt.fkw().size() + yuVar.yu().size() > this.vt.vt() || this.f7657lh.get()) {
                this.vt.fkw().remove(this);
                return new pno(pno.ouw, "Maximum number of requests exceeded", this.ouw);
            }
        }
        try {
            cf cfVar = this.ouw.ouw;
            if (cfVar == null || (list = cfVar.ouw) == null || list.size() <= 0) {
                return ouw(this.ouw);
            }
            ArrayList arrayList = new ArrayList(this.ouw.ouw.ouw);
            arrayList.add(new com.bytedance.sdk.component.vt.ouw.pno() { // from class: com.bytedance.sdk.component.vt.ouw.ouw.ouw.vt.1
                @Override // com.bytedance.sdk.component.vt.ouw.pno
                public final jg ouw(pno.ouw ouwVar2) throws IOException {
                    return vt.this.ouw(ouwVar2.ouw());
                }
            });
            return ((com.bytedance.sdk.component.vt.ouw.pno) arrayList.get(0)).ouw(new lh(arrayList, this.ouw));
        } catch (Throwable th2) {
            throw new IOException(th2.getMessage());
        }
    }

    public final jg ouw(ryl rylVar) throws IOException {
        return ouw(rylVar, com.bytedance.sdk.component.ra.ouw.yu());
    }

    private jg ouw(ryl rylVar, boolean z3) throws IOException {
        String strOuw;
        jg jgVarOuw;
        HttpURLConnection httpURLConnection;
        ryl rylVar2;
        ryl rylVar3;
        byte[] bArr;
        int responseCode = pno.ouw;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(rylVar.vt().ouw().toString()).openConnection();
                if (z3) {
                    try {
                        if (!"setting".equals(rylVar.le()) && !"gecko".equals(rylVar.le()) && !"load_ug_t".equals(rylVar.le())) {
                            try {
                                Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
                                declaredField.setAccessible(true);
                                Object obj = declaredField.get(httpURLConnection);
                                Field declaredField2 = obj.getClass().getDeclaredField("client");
                                declaredField2.setAccessible(true);
                                Object obj2 = declaredField2.get(obj);
                                if (yu.size() == 2) {
                                    obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, yu);
                                }
                            } catch (Throwable th2) {
                                ko.fkw("openHttp2 error", th2.getMessage());
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        httpURLConnection2 = httpURLConnection;
                        if (responseCode == -1 && z3) {
                            jgVarOuw = ouw(rylVar, false);
                            this.vt.fkw().remove(this);
                            return jgVarOuw;
                        }
                        strOuw = ouw(httpURLConnection2, e);
                        this.vt.fkw().remove(this);
                        return new pno(responseCode, strOuw, rylVar);
                    } catch (Exception e10) {
                        e = e10;
                        httpURLConnection2 = httpURLConnection;
                        strOuw = ouw(httpURLConnection2, e);
                        this.vt.fkw().remove(this);
                        return new pno(responseCode, strOuw, rylVar);
                    }
                }
                if (rylVar.yu() != null && rylVar.yu().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : rylVar.yu().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && "1".equals(str)) {
                                try {
                                    Field declaredField3 = httpURLConnection.getClass().getDeclaredField("delegate");
                                    declaredField3.setAccessible(true);
                                    Object obj3 = declaredField3.get(httpURLConnection);
                                    Field declaredField4 = obj3.getClass().getDeclaredField("client");
                                    declaredField4.setAccessible(true);
                                    Object obj4 = declaredField4.get(obj3);
                                    obj4.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj4, Boolean.FALSE);
                                } catch (Exception unused) {
                                }
                            } else {
                                httpURLConnection.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                cf cfVar = rylVar.ouw;
                if (cfVar != null) {
                    TimeUnit timeUnit = cfVar.f7647lh;
                    if (timeUnit != null) {
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(cfVar.vt));
                    }
                    cf cfVar2 = rylVar.ouw;
                    if (cfVar2.f7647lh != null) {
                        httpURLConnection.setReadTimeout((int) cfVar2.fkw.toMillis(cfVar2.yu));
                    }
                }
                if (rylVar.pno() == null) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    if (!(this.ouw.yu() == null ? false : this.ouw.yu().containsKey("Content-Type")) && rylVar.pno().f7651lh != null) {
                        httpURLConnection.addRequestProperty("Content-Type", rylVar.pno().f7651lh.ouw);
                    }
                    httpURLConnection.setRequestMethod(rylVar.lh());
                    if ("POST".equalsIgnoreCase(rylVar.lh())) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        mwh mwhVarPno = rylVar.pno();
                        if (mwhVarPno != null && (rylVar3 = this.ouw) != null && "POST".equalsIgnoreCase(rylVar3.lh()) && mwhVarPno.f7650le == mwh.ouw.BYTE_ARRAY_TYPE && (bArr = mwhVarPno.fkw) != null && bArr.length > 0) {
                            outputStream.write(rylVar.pno().fkw);
                        } else {
                            mwh mwhVarPno2 = rylVar.pno();
                            if ((mwhVarPno2 == null || (rylVar2 = this.ouw) == null || !"POST".equalsIgnoreCase(rylVar2.lh()) || mwhVarPno2.f7650le != mwh.ouw.STRING_TYPE || TextUtils.isEmpty(mwhVarPno2.yu)) ? false : true) {
                                outputStream.write(rylVar.pno().yu.getBytes());
                            }
                        }
                        outputStream.flush();
                        outputStream.close();
                    }
                }
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar = rylVar.vt;
                if (ouwVar != null) {
                    ouwVar.yu = SystemClock.elapsedRealtime();
                }
                httpURLConnection.connect();
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar2 = rylVar.vt;
                if (ouwVar2 != null) {
                    ouwVar2.fkw = SystemClock.elapsedRealtime();
                }
                responseCode = httpURLConnection.getResponseCode();
                com.bytedance.sdk.component.lh.ouw.ouw ouwVar3 = rylVar.vt;
                if (ouwVar3 != null) {
                    ouwVar3.f7588le = SystemClock.elapsedRealtime();
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Exception e12) {
                e = e12;
            }
            if (this.f7657lh.get()) {
                httpURLConnection.disconnect();
                this.vt.fkw().remove(this);
                strOuw = "internal error";
                return new pno(responseCode, strOuw, rylVar);
            }
            jgVarOuw = new pno(httpURLConnection, rylVar);
            this.vt.fkw().remove(this);
            return jgVarOuw;
        } catch (Throwable th3) {
            this.vt.fkw().remove(this);
            throw th3;
        }
    }

    private static String ouw(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt
    public final void ouw(final com.bytedance.sdk.component.vt.ouw.lh lhVar) {
        com.bytedance.sdk.component.lh.ouw.ouw ouwVar;
        ryl rylVar = this.ouw;
        if (rylVar != null && (ouwVar = rylVar.vt) != null) {
            ouwVar.vt = SystemClock.elapsedRealtime();
        }
        this.vt.lh().submit(new com.bytedance.sdk.component.pno.lh.vt(this.ouw.ra(), this.ouw.le()) { // from class: com.bytedance.sdk.component.vt.ouw.ouw.ouw.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    jg jgVarVt = vt.this.vt();
                    if (jgVarVt == null) {
                        lhVar.ouw(new IOException("response is null"));
                    } else {
                        lhVar.ouw(jgVarVt);
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    lhVar.ouw(e2);
                }
            }
        });
    }
}
