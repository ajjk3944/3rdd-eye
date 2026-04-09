package com.bytedance.sdk.component.bw.dg.xq.emc.emc;

import com.bytedance.sdk.component.bw.xq;
import com.bytedance.sdk.component.utils.ru;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ypw implements xq {
    private int emc;
    private emc ypw;

    public ypw(File file, long j10) {
        int i10 = (int) j10;
        this.emc = i10;
        this.ypw = emc.emc(i10, file);
    }

    @Override // com.bytedance.sdk.component.bw.emc
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public boolean ypw(String str) throws IOException {
        try {
            InputStream inputStreamEmc = this.ypw.emc(str);
            boolean z10 = inputStreamEmc != null;
            ru.emc(inputStreamEmc);
            return z10;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                ru.emc(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.bw.emc
    /* renamed from: ypw, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] emc(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStreamEmc;
        emc emcVar = this.ypw;
        if (emcVar != null && str != null) {
            try {
                inputStreamEmc = emcVar.emc(str);
                if (inputStreamEmc != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (IOException unused) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = null;
                        ru.emc(inputStreamEmc);
                        ru.emc(byteArrayOutputStream);
                        throw th;
                    }
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i10 = inputStreamEmc.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        ru.emc(inputStreamEmc);
                        ru.emc(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    ru.emc(inputStreamEmc);
                    ru.emc(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamEmc = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStreamEmc = null;
            }
            ru.emc(inputStreamEmc);
            ru.emc(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.bw.xq
    public InputStream emc(String str) {
        emc emcVar = this.ypw;
        if (emcVar == null) {
            return null;
        }
        return emcVar.emc(str);
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean emc(String str, byte[] bArr) {
        emc emcVar = this.ypw;
        if (emcVar == null || bArr == null || str == null) {
            return false;
        }
        return emcVar.emc(str, bArr);
    }
}
