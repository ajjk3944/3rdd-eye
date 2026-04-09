package com.bytedance.sdk.component.ypw.emc.emc.emc;

import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.msw;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.component.ypw.emc.sz;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ypw implements com.bytedance.sdk.component.ypw.emc.ypw {
    private static List<Object> dg;
    sup emc;
    private AtomicBoolean xq = new AtomicBoolean(false);
    com.bytedance.sdk.component.ypw.emc.dg ypw;

    static {
        try {
            dg = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                dg.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                dg.add(enumValueOf2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public ypw(sup supVar, com.bytedance.sdk.component.ypw.emc.dg dgVar) {
        this.emc = supVar;
        this.ypw = dgVar;
    }

    private boolean bw() {
        if (this.emc.dg() == null) {
            return false;
        }
        return this.emc.dg().containsKey("Content-Type");
    }

    /* renamed from: dg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.ypw.emc.ypw clone() {
        return new ypw(this.emc, this.ypw);
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw
    public sup emc() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw
    public void xq() {
        this.xq.set(true);
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw
    public qh ypw() throws IOException {
        List<com.bytedance.sdk.component.ypw.emc.msw> list;
        com.bytedance.sdk.component.xq.emc.emc emcVar;
        sup supVar = this.emc;
        if (supVar != null && (emcVar = supVar.ypw) != null) {
            if (emcVar.qh() == 0) {
                this.emc.ypw.cf();
            }
            this.emc.ypw.emc();
        }
        this.ypw.xq().remove(this);
        this.ypw.dg().add(this);
        com.bytedance.sdk.component.ypw.emc.dg dgVar = this.ypw;
        if (dgVar instanceof ycc) {
            if (this.ypw.dg().size() + dgVar.xq().size() > this.ypw.emc() || this.xq.get()) {
                this.ypw.dg().remove(this);
                return new msw(msw.emc, "Maximum number of requests exceeded", this.emc);
            }
        }
        try {
            gbl gblVar = this.emc.emc;
            if (gblVar == null || (list = gblVar.emc) == null || list.size() <= 0) {
                return emc(this.emc);
            }
            ArrayList arrayList = new ArrayList(this.emc.emc.emc);
            arrayList.add(new com.bytedance.sdk.component.ypw.emc.msw() { // from class: com.bytedance.sdk.component.ypw.emc.emc.emc.ypw.1
                @Override // com.bytedance.sdk.component.ypw.emc.msw
                public qh emc(msw.emc emcVar2) {
                    return ypw.this.emc(emcVar2.emc());
                }
            });
            return ((com.bytedance.sdk.component.ypw.emc.msw) arrayList.get(0)).emc(new xq(arrayList, this.emc));
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    private boolean emc(sz szVar) {
        sup supVar;
        byte[] bArr;
        return szVar != null && (supVar = this.emc) != null && "POST".equalsIgnoreCase(supVar.xq()) && szVar.ycc == sz.emc.BYTE_ARRAY_TYPE && (bArr = szVar.bw) != null && bArr.length > 0;
    }

    public qh emc(sup supVar) {
        return emc(supVar, com.bytedance.sdk.component.uym.emc.bw());
    }

    public qh emc(sup supVar, boolean z6) {
        HttpURLConnection httpURLConnection;
        IOException e6;
        String strEmc;
        int responseCode = msw.emc;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(supVar.ypw().emc().toString()).openConnection();
                if (z6) {
                    try {
                        if (!"setting".equals(supVar.ycc()) && !"gecko".equals(supVar.ycc()) && !"load_ug_t".equals(supVar.ycc())) {
                            emc(httpURLConnection);
                        }
                    } catch (IOException e7) {
                        e6 = e7;
                        if (responseCode == -1 && z6) {
                            qh qhVarEmc = emc(supVar, false);
                            this.ypw.dg().remove(this);
                            return qhVarEmc;
                        }
                        strEmc = emc(httpURLConnection, e6);
                        this.ypw.dg().remove(this);
                        return new msw(responseCode, strEmc, supVar);
                    } catch (Exception e8) {
                        e = e8;
                        httpURLConnection2 = httpURLConnection;
                        strEmc = emc(httpURLConnection2, e);
                        this.ypw.dg().remove(this);
                        return new msw(responseCode, strEmc, supVar);
                    }
                }
                if (supVar.dg() != null && supVar.dg().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : supVar.dg().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && "1".equals(str)) {
                                ypw(httpURLConnection);
                            } else {
                                httpURLConnection.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                gbl gblVar = supVar.emc;
                if (gblVar != null) {
                    TimeUnit timeUnit = gblVar.xq;
                    if (timeUnit != null) {
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(gblVar.ypw));
                    }
                    gbl gblVar2 = supVar.emc;
                    if (gblVar2.xq != null) {
                        httpURLConnection.setReadTimeout((int) gblVar2.bw.toMillis(gblVar2.dg));
                    }
                }
                if (supVar.msw() == null) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    if (!bw() && supVar.msw().xq != null) {
                        httpURLConnection.addRequestProperty("Content-Type", supVar.msw().xq.emc());
                    }
                    httpURLConnection.setRequestMethod(supVar.xq());
                    if ("POST".equalsIgnoreCase(supVar.xq())) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        if (emc(supVar.msw())) {
                            outputStream.write(supVar.msw().bw);
                        } else if (ypw(supVar.msw())) {
                            outputStream.write(supVar.msw().dg.getBytes());
                        }
                        outputStream.flush();
                        outputStream.close();
                    }
                }
                com.bytedance.sdk.component.xq.emc.emc emcVar = supVar.ypw;
                if (emcVar != null) {
                    emcVar.ypw();
                }
                httpURLConnection.connect();
                com.bytedance.sdk.component.xq.emc.emc emcVar2 = supVar.ypw;
                if (emcVar2 != null) {
                    emcVar2.xq();
                }
                responseCode = httpURLConnection.getResponseCode();
                com.bytedance.sdk.component.xq.emc.emc emcVar3 = supVar.ypw;
                if (emcVar3 != null) {
                    emcVar3.bw();
                }
            } catch (IOException e9) {
                httpURLConnection = null;
                e6 = e9;
            } catch (Exception e10) {
                e = e10;
            }
            if (this.xq.get()) {
                httpURLConnection.disconnect();
                this.ypw.dg().remove(this);
                strEmc = "internal error";
                return new msw(responseCode, strEmc, supVar);
            }
            msw mswVar = new msw(httpURLConnection, supVar);
            this.ypw.dg().remove(this);
            return mswVar;
        } catch (Throwable th) {
            this.ypw.dg().remove(this);
            throw th;
        }
    }

    private boolean ypw(sz szVar) {
        sup supVar;
        return (szVar == null || (supVar = this.emc) == null || !"POST".equalsIgnoreCase(supVar.xq()) || szVar.ycc != sz.emc.STRING_TYPE || TextUtils.isEmpty(szVar.dg)) ? false : true;
    }

    private static void ypw(HttpURLConnection httpURLConnection) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private static String emc(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    private static void emc(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (dg.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, dg);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw
    public void emc(final com.bytedance.sdk.component.ypw.emc.xq xqVar) {
        com.bytedance.sdk.component.xq.emc.emc emcVar;
        sup supVar = this.emc;
        if (supVar != null && (emcVar = supVar.ypw) != null) {
            emcVar.cf();
        }
        this.ypw.ypw().submit(new com.bytedance.sdk.component.msw.xq.ypw(this.emc.uym(), this.emc.ycc()) { // from class: com.bytedance.sdk.component.ypw.emc.emc.emc.ypw.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    qh qhVarYpw = ypw.this.ypw();
                    if (qhVarYpw == null) {
                        xqVar.emc(ypw.this, new IOException("response is null"));
                    } else {
                        xqVar.emc(ypw.this, qhVarYpw);
                    }
                } catch (IOException e6) {
                    xqVar.emc(ypw.this, e6);
                }
            }
        });
    }
}
