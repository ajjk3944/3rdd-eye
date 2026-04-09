package com.bytedance.sdk.openadsdk.ra;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.vt.ouw.bly;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.fkw;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.le;
import com.bytedance.sdk.component.vt.ouw.lh;
import com.bytedance.sdk.component.vt.ouw.mwh;
import com.bytedance.sdk.component.vt.ouw.ryl;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements INetWork {
    protected cf ouw;
    protected cf vt;

    public ouw() {
        cf.ouw ouwVar = new cf.ouw();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.ouw = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(ouwVar.ouw(10L, timeUnit).vt(10L, timeUnit).lh(10L, timeUnit));
        this.vt = com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw(new cf.ouw().ouw(10L, timeUnit).vt(30L, timeUnit).lh(30L, timeUnit));
    }

    private static Map<String, String> ouw(le leVar) {
        if (leVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i4 = 0; i4 < leVar.ouw.length / 2; i4++) {
            map.put(leVar.ouw(i4), leVar.vt(i4));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final Response doGet(String str) throws Exception {
        ryl.ouw ouwVarOuw = new ryl.ouw().ouw("GET", (mwh) null).ouw(str);
        ouwVarOuw.pno = "gecko";
        jg jgVarVt = this.ouw.ouw(ouwVarOuw.ouw()).vt();
        return new Response(ouw(jgVarVt.fkw()), jgVarVt.ouw() == 200 ? jgVarVt.yu().vt() : null, jgVarVt.ouw(), jgVarVt.lh());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        fkw.ouw ouwVar = new fkw.ouw();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                String str2 = (String) pair.first;
                String str3 = (String) pair.second;
                ouwVar.ouw.add(str2);
                ouwVar.vt.add(str3);
            }
        }
        ryl.ouw ouwVarOuw = new ryl.ouw().ouw(str).ouw("POST", new fkw(ouwVar.ouw, ouwVar.vt));
        ouwVarOuw.pno = "gecko";
        jg jgVarVt = this.ouw.ouw(ouwVarOuw.ouw()).vt();
        return new Response(ouw(jgVarVt.fkw()), jgVarVt.ouw() == 200 ? jgVarVt.yu().vt() : null, jgVarVt.ouw(), jgVarVt.lh());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e2;
        Closeable closeable;
        Closeable closeable2 = null;
        int i4 = 0;
        try {
            try {
                try {
                    ryl.ouw ouwVarOuw = new ryl.ouw().ouw("GET", (mwh) null);
                    ouwVarOuw.pno = "gecko";
                    jg jgVarVt = this.vt.ouw(ouwVarOuw.ouw(str).ouw()).vt();
                    int iOuw = jgVarVt.ouw();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(jgVarVt.yu().lh());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i10 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i10 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i10);
                            }
                        } catch (Exception e10) {
                            e2 = e10;
                            i4 = iOuw;
                            throw new RuntimeException("downloadFile failed, code: " + i4 + ", url:" + str + ", caused by:" + e2.getMessage(), e2);
                        }
                    } catch (Exception e11) {
                        e2 = e11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e12) {
                e2 = e12;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final void syncDoGet(final String str) {
        ryl.ouw ouwVarOuw = new ryl.ouw().ouw("GET", (mwh) null).ouw(str);
        ouwVarOuw.pno = "gecko";
        this.ouw.ouw(ouwVarOuw.ouw()).ouw(new lh() { // from class: com.bytedance.sdk.openadsdk.ra.ouw.1
            @Override // com.bytedance.sdk.component.vt.ouw.lh
            public final void ouw(jg jgVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.vt.ouw.lh
            public final void ouw(IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public final Response doPost(String str, String str2) throws Exception {
        ryl.ouw ouwVarOuw = new ryl.ouw().ouw(str).ouw("POST", mwh.ouw(bly.ouw("application/json; charset=utf-8"), str2));
        ouwVarOuw.pno = "gecko";
        jg jgVarVt = this.ouw.ouw(ouwVarOuw.ouw()).vt();
        return new Response(ouw(jgVarVt.fkw()), jgVarVt.ouw() == 200 ? jgVarVt.yu().vt() : null, jgVarVt.ouw(), jgVarVt.lh());
    }
}
