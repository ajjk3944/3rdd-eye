package com.bytedance.sdk.component.uym.ypw;

import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.cf;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.component.ypw.emc.sz;
import com.bytedance.sdk.component.ypw.emc.ycc;
import com.bytedance.sdk.component.ypw.emc.zz;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends xq {
    sz emc;

    public dg(gbl gblVar) {
        super(gblVar);
        this.emc = null;
    }

    private byte[] bw(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(str.getBytes("utf-8"));
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        throw th;
                    }
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused5) {
                        throw th;
                    }
                }
            } catch (IOException unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused7) {
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        return byteArray;
    }

    public void dg(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.emc = sz.emc(zz.emc("application/json; charset=utf-8"), str);
    }

    public void emc(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = "{}";
        }
        this.emc = sz.emc(zz.emc("application/json; charset=utf-8"), string);
    }

    public void emc(String str, byte[] bArr) {
        this.emc = sz.emc(zz.emc(str), bArr);
    }

    public void emc(final com.bytedance.sdk.component.uym.emc.emc emcVar) {
        try {
            sup.emc emcVar2 = new sup.emc();
            if (TextUtils.isEmpty(this.msw)) {
                emcVar.emc(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.bw)) {
                emcVar2.emc(this.bw);
            }
            int i = this.ycc;
            if (i > 0) {
                emcVar2.emc(i);
            }
            emcVar2.ypw(this.msw);
            if (this.emc == null) {
                if (emcVar != null) {
                    emcVar.emc(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                emc(emcVar2);
                emcVar2.emc((Object) xq());
                this.xq.emc(emcVar2.emc(this.emc).ypw()).emc(new com.bytedance.sdk.component.ypw.emc.xq() { // from class: com.bytedance.sdk.component.uym.ypw.dg.1
                    @Override // com.bytedance.sdk.component.ypw.emc.xq
                    public void emc(com.bytedance.sdk.component.ypw.emc.ypw ypwVar, IOException iOException) {
                        com.bytedance.sdk.component.uym.emc.emc emcVar3 = emcVar;
                        if (emcVar3 != null) {
                            emcVar3.emc(dg.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.sdk.component.ypw.emc.ycc] */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.uym.emc.emc] */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.uym.ypw] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.uym.ypw] */
                    @Override // com.bytedance.sdk.component.ypw.emc.xq
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void emc(com.bytedance.sdk.component.ypw.emc.ypw r13, com.bytedance.sdk.component.ypw.emc.qh r14) {
                        /*
                            Method dump skipped, instructions count: 307
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.uym.ypw.dg.AnonymousClass1.emc(com.bytedance.sdk.component.ypw.emc.ypw, com.bytedance.sdk.component.ypw.emc.qh):void");
                    }
                });
            }
        } catch (Throwable th) {
            emcVar.emc(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.uym.ypw emc() {
        com.bytedance.sdk.component.uym.ypw ypwVar;
        try {
            sup.emc emcVar = new sup.emc();
            if (TextUtils.isEmpty(this.msw)) {
                return new com.bytedance.sdk.component.uym.ypw(false, PAGErrorCode.LOAD_FACTORY_NULL_CODE, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            emcVar.ypw(this.msw);
            if (this.emc == null) {
                return new com.bytedance.sdk.component.uym.ypw(false, PAGErrorCode.LOAD_FACTORY_NULL_CODE, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            emc(emcVar);
            emcVar.emc((Object) xq());
            qh qhVarYpw = this.xq.emc(emcVar.emc(this.emc).ypw()).ypw();
            if (qhVarYpw == null) {
                return null;
            }
            HashMap map = new HashMap();
            ycc yccVarUym = qhVarYpw.uym();
            if (yccVarUym != null) {
                for (int i = 0; i < yccVarUym.emc(); i++) {
                    String strEmc = yccVarUym.emc(i);
                    String strYpw = yccVarUym.ypw(i);
                    map.put(strEmc, strYpw);
                    if (strEmc != null && strEmc.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strYpw == null ? "" : strYpw.toLowerCase());
                    }
                }
            }
            cf cfVarYcc = qhVarYpw.ycc();
            if (com.bytedance.sdk.component.uym.xq.emc.emc(map)) {
                byte[] bArrDg = cfVarYcc.dg();
                ypwVar = new com.bytedance.sdk.component.uym.ypw(qhVarYpw.dg(), qhVarYpw.xq(), qhVarYpw.bw(), map, null, qhVarYpw.ypw(), qhVarYpw.emc());
                ypwVar.emc(bArrDg);
            } else if (this.zz) {
                byte[] bArrDg2 = cfVarYcc.dg();
                ypwVar = new com.bytedance.sdk.component.uym.ypw(qhVarYpw.dg(), qhVarYpw.xq(), qhVarYpw.bw(), map, new String(bArrDg2, emc(emc(cfVarYcc))), qhVarYpw.ypw(), qhVarYpw.emc());
                ypwVar.emc(bArrDg2);
            } else if (cfVarYcc != null) {
                ypwVar = new com.bytedance.sdk.component.uym.ypw(qhVarYpw.dg(), qhVarYpw.xq(), qhVarYpw.bw(), map, cfVarYcc.ypw(), qhVarYpw.ypw(), qhVarYpw.emc());
            } else {
                throw new IOException(qhVarYpw.bw());
            }
            emc(ypwVar, qhVarYpw);
            return ypwVar;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.uym.ypw(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void emc(String str, boolean z6) {
        if (z6) {
            emc("application/json; charset=utf-8", bw(str));
            ypw("Content-Encoding", "gzip");
        } else {
            dg(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset emc(zz zzVar) {
        try {
            return zzVar != null ? zzVar.emc(com.bytedance.sdk.component.ypw.emc.ypw.zz.emc) : com.bytedance.sdk.component.ypw.emc.ypw.zz.emc;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.ypw.emc.ypw.zz.emc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zz emc(cf cfVar) {
        try {
            return cfVar.bw();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.component.uym.ypw ypwVar, qh qhVar) {
        if (ypwVar == null || qhVar == null) {
            return;
        }
        ypwVar.emc(qhVar.msw());
    }
}
