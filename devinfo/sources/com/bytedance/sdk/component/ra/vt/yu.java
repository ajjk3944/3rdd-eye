package com.bytedance.sdk.component.ra.vt;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.vt.ouw.bly;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends lh {
    mwh ouw;

    public yu(cf cfVar) {
        super(cfVar);
        this.ouw = null;
    }

    private static byte[] yu(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(str.getBytes("utf-8"));
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException e2) {
                            ko.fkw("PostExecutor", e2.toString());
                        }
                    } catch (IOException e10) {
                        e = e10;
                        gZIPOutputStream = gZIPOutputStream2;
                        ko.fkw("PostExecutor", e.toString());
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e11) {
                                ko.fkw("PostExecutor", e11.toString());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        }
                        return byteArray;
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException e12) {
                                ko.fkw("PostExecutor", e12.toString());
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e13) {
                            ko.fkw("PostExecutor", e13.toString());
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e14) {
                e = e14;
            }
        } catch (IOException e15) {
            e = e15;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException e16) {
            ko.fkw("PostExecutor", e16.toString());
        }
        return byteArray;
    }

    public final void lh(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.ouw = mwh.ouw(bly.ouw("application/json; charset=utf-8"), str);
    }

    public final void ouw(JSONObject jSONObject) {
        this.ouw = mwh.ouw(bly.ouw("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    public final void ouw(String str, byte[] bArr) {
        this.ouw = new mwh(bly.ouw(str), bArr, mwh.ouw.BYTE_ARRAY_TYPE);
    }

    public final void ouw(final com.bytedance.sdk.component.ra.ouw.ouw ouwVar) {
        try {
            ryl.ouw ouwVar2 = new ryl.ouw();
            if (TextUtils.isEmpty(this.bly)) {
                ouwVar.ouw(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.f7626le)) {
                ouwVar2.pno = this.f7626le;
            }
            int i4 = this.ra;
            if (i4 > 0) {
                ouwVar2.ra = i4;
            }
            ouwVar2.ouw(this.bly);
            if (this.ouw == null) {
                ouwVar.ouw(this, new IOException("RequestBody is null, content type is not support!!"));
                return;
            }
            ouw(ouwVar2);
            ouwVar2.fkw = yu();
            this.yu.ouw(ouwVar2.ouw("POST", this.ouw).ouw()).ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bytedance.sdk.component.ra.vt.yu.1
                @Override // com.bytedance.sdk.component.vt.ouw.lh
                public final void ouw(IOException iOException) {
                    com.bytedance.sdk.component.ra.ouw.ouw ouwVar3 = ouwVar;
                    if (ouwVar3 != null) {
                        ouwVar3.ouw(yu.this, iOException);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
                /* JADX WARN: Type inference failed for: r15v2, types: [com.bytedance.sdk.component.ra.ouw.ouw] */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v13, types: [com.bytedance.sdk.component.ra.vt] */
                /* JADX WARN: Type inference failed for: r2v15 */
                /* JADX WARN: Type inference failed for: r2v16 */
                /* JADX WARN: Type inference failed for: r2v17 */
                /* JADX WARN: Type inference failed for: r2v18 */
                /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.sdk.component.ra.vt] */
                /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
                /* JADX WARN: Type inference failed for: r2v7 */
                @Override // com.bytedance.sdk.component.vt.ouw.lh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void ouw(com.bytedance.sdk.component.vt.ouw.jg r15) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 283
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ra.vt.yu.AnonymousClass1.ouw(com.bytedance.sdk.component.vt.ouw.jg):void");
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
            ouwVar.ouw(this, new IOException(th2.getMessage()));
        }
    }

    public final com.bytedance.sdk.component.ra.vt ouw() {
        com.bytedance.sdk.component.ra.vt vtVar;
        try {
            ryl.ouw ouwVar = new ryl.ouw();
            if (TextUtils.isEmpty(this.bly)) {
                com.bytedance.sdk.component.ra.lh.yu.ouw("PostExecutor", "execute: Url is Empty");
                return new com.bytedance.sdk.component.ra.vt(false, PAGErrorCode.LOAD_FACTORY_NULL_CODE, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            ouwVar.ouw(this.bly);
            if (this.ouw == null) {
                com.bytedance.sdk.component.ra.lh.yu.ouw("PostExecutor", "RequestBody is null, content type is not support!!");
                return new com.bytedance.sdk.component.ra.vt(false, PAGErrorCode.LOAD_FACTORY_NULL_CODE, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            ouw(ouwVar);
            ouwVar.fkw = yu();
            jg jgVarVt = this.yu.ouw(ouwVar.ouw("POST", this.ouw).ouw()).vt();
            if (jgVarVt == null) {
                return null;
            }
            HashMap map = new HashMap();
            le leVarFkw = jgVarVt.fkw();
            for (int i4 = 0; i4 < leVarFkw.ouw.length / 2; i4++) {
                String strOuw = leVarFkw.ouw(i4);
                String strVt = leVarFkw.vt(i4);
                map.put(strOuw, strVt);
                if (strOuw != null && strOuw.equalsIgnoreCase("content-type")) {
                    map.put("content-type", strVt == null ? "" : strVt.toLowerCase());
                }
            }
            com.bytedance.sdk.component.vt.ouw.ko koVarYu = jgVarVt.yu();
            if (com.bytedance.sdk.component.ra.lh.ouw.ouw(map)) {
                byte[] bArrYu = koVarYu.yu();
                vtVar = new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, null, 0L, 0L);
                vtVar.bly = bArrYu;
            } else if (this.tlj) {
                byte[] bArrYu2 = koVarYu.yu();
                vtVar = new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, new String(bArrYu2, ouw(ouw(koVarYu))), 0L, 0L);
                vtVar.bly = bArrYu2;
            } else if (koVarYu != null) {
                vtVar = new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, koVarYu.vt(), 0L, 0L);
            } else {
                throw new IOException(jgVarVt.lh());
            }
            ouw(vtVar, jgVarVt);
            return vtVar;
        } catch (Throwable th2) {
            return new com.bytedance.sdk.component.ra.vt(false, 5001, th2.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public final void ouw(String str, boolean z3) {
        if (z3) {
            ouw("application/json; charset=utf-8", yu(str));
            vt("Content-Encoding", "gzip");
        } else {
            lh(str);
        }
    }

    public static Charset ouw(bly blyVar) {
        try {
            return blyVar != null ? blyVar.ouw(com.bytedance.sdk.component.vt.ouw.vt.bly.ouw) : com.bytedance.sdk.component.vt.ouw.vt.bly.ouw;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.vt.ouw.vt.bly.ouw;
        }
    }

    public static bly ouw(com.bytedance.sdk.component.vt.ouw.ko koVar) {
        try {
            return koVar.fkw();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void ouw(com.bytedance.sdk.component.ra.vt vtVar, jg jgVar) {
        if (jgVar != null) {
            vtVar.tlj = jgVar.le();
        }
    }
}
