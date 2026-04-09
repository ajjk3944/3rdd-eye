package com.bytedance.sdk.openadsdk.uym;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.ypw.emc.bw;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.component.ypw.emc.sz;
import com.bytedance.sdk.component.ypw.emc.xq;
import com.bytedance.sdk.component.ypw.emc.ycc;
import com.bytedance.sdk.component.ypw.emc.zz;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class emc implements INetWork {
    protected gbl emc;
    protected gbl ypw;

    public emc() {
        gbl.emc emcVar = new gbl.emc();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.emc = emcVar.emc(10L, timeUnit).ypw(10L, timeUnit).xq(10L, timeUnit).emc();
        this.ypw = new gbl.emc().emc(10L, timeUnit).ypw(30L, timeUnit).xq(30L, timeUnit).emc();
    }

    private Map<String, String> emc(ycc yccVar) {
        if (yccVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < yccVar.emc(); i++) {
            map.put(yccVar.emc(i), yccVar.ypw(i));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) {
        qh qhVarYpw = this.emc.emc(new sup.emc().emc().ypw(str).emc("gecko").ypw()).ypw();
        return new Response(emc(qhVarYpw.uym()), qhVarYpw.xq() == 200 ? qhVarYpw.ycc().ypw() : null, qhVarYpw.xq(), qhVarYpw.bw());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) {
        bw.emc emcVar = new bw.emc();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                emcVar.emc((String) pair.first, (String) pair.second);
            }
        }
        qh qhVarYpw = this.emc.emc(new sup.emc().ypw(str).emc((sz) emcVar.emc()).emc("gecko").ypw()).ypw();
        return new Response(emc(qhVarYpw.uym()), qhVarYpw.xq() == 200 ? qhVarYpw.ycc().ypw() : null, qhVarYpw.xq(), qhVarYpw.bw());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j6, BufferOutputStream bufferOutputStream) throws Throwable {
        Exception e6;
        Closeable closeable;
        Closeable closeable2 = null;
        int i = 0;
        try {
            try {
                try {
                    qh qhVarYpw = this.ypw.emc(new sup.emc().emc().emc("gecko").ypw(str).ypw()).ypw();
                    int iXq = qhVarYpw.xq();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(qhVarYpw.ycc().xq());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i3 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i3 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i3);
                            }
                        } catch (Exception e7) {
                            e6 = e7;
                            i = iXq;
                            throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e6.getMessage(), e6);
                        }
                    } catch (Exception e8) {
                        e6 = e8;
                    }
                } catch (Throwable th) {
                    th = th;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e9) {
                e6 = e9;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.emc.emc(new sup.emc().emc().ypw(str).emc("gecko").ypw()).emc(new xq() { // from class: com.bytedance.sdk.openadsdk.uym.emc.1
            @Override // com.bytedance.sdk.component.ypw.emc.xq
            public void emc(com.bytedance.sdk.component.ypw.emc.ypw ypwVar, qh qhVar) {
            }

            @Override // com.bytedance.sdk.component.ypw.emc.xq
            public void emc(com.bytedance.sdk.component.ypw.emc.ypw ypwVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) {
        qh qhVarYpw = this.emc.emc(new sup.emc().ypw(str).emc(sz.emc(zz.emc("application/json; charset=utf-8"), str2)).emc("gecko").ypw()).ypw();
        return new Response(emc(qhVarYpw.uym()), qhVarYpw.xq() == 200 ? qhVarYpw.ycc().ypw() : null, qhVarYpw.xq(), qhVarYpw.bw());
    }
}
