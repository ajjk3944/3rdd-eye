package com.bytedance.sdk.component.ra.vt;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.ko;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ouw;
import com.bytedance.sdk.component.vt.ouw.ra;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends lh {
    public static final com.bytedance.sdk.component.vt.ouw.ouw ouw;
    public static final com.bytedance.sdk.component.vt.ouw.ouw vt;

    /* renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.component.vt.ouw.ouw f7629cf;

    /* renamed from: lh, reason: collision with root package name */
    public boolean f7630lh;
    private Map<String, String> ryl;

    static {
        ouw.C0062ouw c0062ouw = new ouw.C0062ouw();
        c0062ouw.ouw = true;
        ouw = c0062ouw.ouw();
        vt = new ouw.C0062ouw().ouw();
    }

    public vt(cf cfVar) {
        super(cfVar);
        this.f7629cf = ouw;
        this.f7630lh = false;
        this.ryl = new HashMap();
    }

    public final void ouw(final com.bytedance.sdk.component.ra.ouw.ouw ouwVar) {
        try {
            ryl.ouw ouwVar2 = new ryl.ouw();
            if (this.f7630lh) {
                ouwVar2.ouw(this.bly);
            } else {
                ra.ouw ouwVar3 = new ra.ouw();
                Uri uri = Uri.parse(this.bly);
                ouwVar3.ouw(uri.getScheme());
                ouwVar3.vt(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    ouwVar3.lh(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.ryl.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.ryl.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        ouwVar3.ouw(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                ouwVar2.f7665lh = ouwVar3.vt();
            }
            ouw(ouwVar2);
            ouwVar2.ouw = this.f7629cf;
            ouwVar2.fkw = yu();
            if (!TextUtils.isEmpty(this.f7626le)) {
                ouwVar2.pno = this.f7626le;
            }
            int i4 = this.ra;
            if (i4 > 0) {
                ouwVar2.ra = i4;
            }
            this.yu.ouw(ouwVar2.ouw("GET", (mwh) null).ouw()).ouw(new com.bytedance.sdk.component.vt.ouw.lh() { // from class: com.bytedance.sdk.component.ra.vt.vt.1
                @Override // com.bytedance.sdk.component.vt.ouw.lh
                public final void ouw(IOException iOException) {
                    com.bytedance.sdk.component.ra.ouw.ouw ouwVar4 = ouwVar;
                    if (ouwVar4 != null) {
                        ouwVar4.ouw(vt.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.vt.ouw.lh
                public final void ouw(jg jgVar) throws IOException {
                    String strVt;
                    if (ouwVar != null) {
                        HashMap map = new HashMap();
                        if (jgVar != null) {
                            le leVarFkw = jgVar.fkw();
                            for (int i10 = 0; i10 < leVarFkw.ouw.length / 2; i10++) {
                                map.put(leVarFkw.ouw(i10), leVarFkw.vt(i10));
                            }
                            ko koVarYu = jgVar.yu();
                            if (koVarYu == null) {
                                strVt = "";
                            } else {
                                strVt = koVarYu.vt();
                            }
                            ouwVar.ouw(vt.this, new com.bytedance.sdk.component.ra.vt(jgVar.vt(), jgVar.ouw(), jgVar.lh(), map, strVt, 0L, 0L));
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            if (com.bytedance.sdk.component.ra.lh.yu.ouw()) {
                th2.printStackTrace();
            }
            ouwVar.ouw(this, new IOException(th2.getMessage()));
        }
    }

    public final com.bytedance.sdk.component.ra.vt ouw() {
        try {
            ryl.ouw ouwVar = new ryl.ouw();
            if (this.f7630lh) {
                ouwVar.ouw(this.bly);
            } else {
                ra.ouw ouwVar2 = new ra.ouw();
                Uri uri = Uri.parse(this.bly);
                ouwVar2.ouw(uri.getScheme());
                ouwVar2.vt(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    ouwVar2.lh(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.ryl.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.ryl.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        ouwVar2.ouw(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                ouwVar.f7665lh = ouwVar2.vt();
            }
            ouw(ouwVar);
            ouwVar.ouw = this.f7629cf;
            ouwVar.fkw = yu();
            jg jgVarVt = this.yu.ouw(ouwVar.ouw("GET", (mwh) null).ouw()).vt();
            if (jgVarVt != null) {
                HashMap map = new HashMap();
                le leVarFkw = jgVarVt.fkw();
                for (int i4 = 0; i4 < leVarFkw.ouw.length / 2; i4++) {
                    map.put(leVarFkw.ouw(i4), leVarFkw.vt(i4));
                }
                ko koVarYu = jgVarVt.yu();
                return new com.bytedance.sdk.component.ra.vt(jgVarVt.vt(), jgVarVt.ouw(), jgVarVt.lh(), map, koVarYu != null ? koVarYu.vt() : "", 0L, 0L);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return null;
    }
}
