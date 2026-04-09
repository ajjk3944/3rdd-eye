package com.bytedance.sdk.component.uym.ypw;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.cf;
import com.bytedance.sdk.component.ypw.emc.emc;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.component.ypw.emc.uym;
import com.bytedance.sdk.component.ypw.emc.ycc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ypw extends xq {
    public static final com.bytedance.sdk.component.ypw.emc.emc emc = new emc.C0128emc().emc().ypw();
    public static final com.bytedance.sdk.component.ypw.emc.emc ypw = new emc.C0128emc().ypw();
    private boolean gbl;
    private com.bytedance.sdk.component.ypw.emc.emc ru;
    private Map<String, String> sup;

    public ypw(gbl gblVar) {
        super(gblVar);
        this.ru = emc;
        this.gbl = false;
        this.sup = new HashMap();
    }

    public void emc(boolean z10) {
        this.gbl = z10;
    }

    public void emc(final com.bytedance.sdk.component.uym.emc.emc emcVar) {
        try {
            sup.emc emcVar2 = new sup.emc();
            if (this.gbl) {
                emcVar2.ypw(this.msw);
            } else {
                uym.emc emcVar3 = new uym.emc();
                Uri uri = Uri.parse(this.msw);
                emcVar3.emc(uri.getScheme());
                emcVar3.ypw(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    emcVar3.xq(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.sup.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.sup.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        emcVar3.emc(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                emcVar2.emc(emcVar3.ypw());
            }
            emc(emcVar2);
            emcVar2.emc(this.ru);
            emcVar2.emc((Object) xq());
            if (!TextUtils.isEmpty(this.bw)) {
                emcVar2.emc(this.bw);
            }
            int i10 = this.ycc;
            if (i10 > 0) {
                emcVar2.emc(i10);
            }
            this.xq.emc(emcVar2.emc().ypw()).emc(new com.bytedance.sdk.component.ypw.emc.xq() { // from class: com.bytedance.sdk.component.uym.ypw.ypw.1
                @Override // com.bytedance.sdk.component.ypw.emc.xq
                public void emc(com.bytedance.sdk.component.ypw.emc.ypw ypwVar, IOException iOException) {
                    com.bytedance.sdk.component.uym.emc.emc emcVar4 = emcVar;
                    if (emcVar4 != null) {
                        emcVar4.emc(ypw.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.ypw.emc.xq
                public void emc(com.bytedance.sdk.component.ypw.emc.ypw ypwVar, qh qhVar) throws IOException {
                    String strYpw;
                    if (emcVar != null) {
                        HashMap map = new HashMap();
                        if (qhVar != null) {
                            ycc yccVarUym = qhVar.uym();
                            if (yccVarUym != null) {
                                for (int i11 = 0; i11 < yccVarUym.emc(); i11++) {
                                    map.put(yccVarUym.emc(i11), yccVarUym.ypw(i11));
                                }
                            }
                            cf cfVarYcc = qhVar.ycc();
                            if (cfVarYcc == null) {
                                strYpw = "";
                            } else {
                                strYpw = cfVarYcc.ypw();
                            }
                            emcVar.emc(ypw.this, new com.bytedance.sdk.component.uym.ypw(qhVar.dg(), qhVar.xq(), qhVar.bw(), map, strYpw, qhVar.ypw(), qhVar.emc()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (emcVar != null) {
                emcVar.emc(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.uym.ypw emc() {
        try {
            sup.emc emcVar = new sup.emc();
            if (this.gbl) {
                emcVar.ypw(this.msw);
            } else {
                uym.emc emcVar2 = new uym.emc();
                Uri uri = Uri.parse(this.msw);
                emcVar2.emc(uri.getScheme());
                emcVar2.ypw(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    emcVar2.xq(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.sup.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.sup.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        emcVar2.emc(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                emcVar.emc(emcVar2.ypw());
            }
            emc(emcVar);
            emcVar.emc(this.ru);
            emcVar.emc((Object) xq());
            qh qhVarYpw = this.xq.emc(emcVar.emc().ypw()).ypw();
            if (qhVarYpw == null) {
                return null;
            }
            HashMap map = new HashMap();
            ycc yccVarUym = qhVarYpw.uym();
            if (yccVarUym != null) {
                for (int i10 = 0; i10 < yccVarUym.emc(); i10++) {
                    map.put(yccVarUym.emc(i10), yccVarUym.ypw(i10));
                }
            }
            cf cfVarYcc = qhVarYpw.ycc();
            return new com.bytedance.sdk.component.uym.ypw(qhVarYpw.dg(), qhVarYpw.xq(), qhVarYpw.bw(), map, cfVarYcc != null ? cfVarYcc.ypw() : "", qhVarYpw.ypw(), qhVarYpw.emc());
        } catch (Throwable unused) {
            return null;
        }
    }
}
