package com.bytedance.sdk.component.bw.xq.emc.emc;

import android.util.Log;
import com.bytedance.sdk.component.bw.xq.emc.emc.emc;
import com.bytedance.sdk.component.utils.ru;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class ypw implements com.bytedance.sdk.component.bw.xq {
    private long emc;
    private emc ypw;

    public ypw(File file, long j10, ExecutorService executorService) {
        this.emc = j10;
        try {
            this.ypw = emc.emc(file, 20210302, 1, j10, executorService);
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.bw.emc
    /* renamed from: xq, reason: merged with bridge method [inline-methods] */
    public boolean ypw(String str) throws IOException {
        try {
            try {
                emc.xq xqVarEmc = this.ypw.emc(str);
                boolean z10 = xqVarEmc != null;
                ru.emc(xqVarEmc);
                return z10;
            } catch (IOException e10) {
                Log.w("LruCountDiskCache", e10.getMessage());
                ru.emc(null);
                return false;
            }
        } catch (Throwable th) {
            ru.emc(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    @Override // com.bytedance.sdk.component.bw.emc
    /* renamed from: ypw, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] emc(String str) throws Throwable {
        Closeable closeable;
        Closeable closeable2;
        ByteArrayOutputStream byteArrayOutputStream;
        emc emcVar = this.ypw;
        Closeable closeable3 = null;
        if (emcVar != null) {
            try {
                if (str != 0) {
                    try {
                        emc.xq xqVarEmc = emcVar.emc((String) str);
                        if (xqVarEmc == null) {
                            ru.emc(null);
                            ru.emc(null);
                            return null;
                        }
                        str = xqVarEmc.emc(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                            } catch (IOException e10) {
                                e = e10;
                                byteArrayOutputStream = null;
                                closeable2 = str;
                                Log.w("LruCountDiskCache", e.toString());
                                ru.emc(closeable2);
                                ru.emc(byteArrayOutputStream);
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                closeable = null;
                                closeable3 = str;
                                ru.emc(closeable3);
                                ru.emc(closeable);
                                throw th;
                            }
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i10 = str.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i10);
                                }
                            } catch (IOException e11) {
                                e = e11;
                                closeable2 = str;
                                Log.w("LruCountDiskCache", e.toString());
                                ru.emc(closeable2);
                                ru.emc(byteArrayOutputStream);
                                return null;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ru.emc(str);
                        ru.emc(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e12) {
                        e = e12;
                        closeable2 = null;
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = null;
                        ru.emc(closeable3);
                        ru.emc(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.bw.xq
    public InputStream emc(String str) throws Throwable {
        emc emcVar = this.ypw;
        if (emcVar == null) {
            return null;
        }
        try {
            emc.xq xqVarEmc = emcVar.emc(str);
            if (xqVarEmc != null) {
                return xqVarEmc.emc(0);
            }
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.bw.emc
    public boolean emc(String str, byte[] bArr) throws Throwable {
        Closeable closeable;
        emc emcVar = this.ypw;
        if (emcVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        emc.C0116emc c0116emc = null;
        try {
            try {
                emc.C0116emc c0116emcYpw = emcVar.ypw(str);
                try {
                    if (c0116emcYpw == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        ru.emc(null);
                        return false;
                    }
                    OutputStream outputStreamEmc = c0116emcYpw.emc(0);
                    if (outputStreamEmc == emc.xq) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        ru.emc(outputStreamEmc);
                        return false;
                    }
                    outputStreamEmc.write(bArr);
                    c0116emcYpw.emc();
                    this.ypw.emc();
                    ru.emc(outputStreamEmc);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    closeable = null;
                    c0116emc = c0116emcYpw;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0116emc != null) {
                            try {
                                c0116emc.ypw();
                            } catch (IOException unused) {
                            }
                        }
                        ru.emc(closeable);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeable2 = closeable;
                        ru.emc(closeable2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                ru.emc(closeable2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            closeable = null;
        }
    }
}
