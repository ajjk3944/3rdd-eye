package com.bytedance.sdk.component.fkw.lh.ouw.ouw;

import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw;
import com.bytedance.sdk.component.utils.tlj;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements com.bytedance.sdk.component.fkw.lh {
    private long ouw;
    private ouw vt;

    public vt(File file, long j, ExecutorService executorService) {
        this.ouw = j;
        try {
            this.vt = ouw.ouw(file, j, executorService);
        } catch (IOException e2) {
            Log.w("LruCountDiskCache", e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    /* renamed from: lh, reason: merged with bridge method [inline-methods] */
    public boolean vt(String str) throws IOException {
        try {
            try {
                ouw.lh lhVarOuw = this.vt.ouw(str);
                boolean z3 = lhVarOuw != null;
                tlj.ouw(lhVarOuw);
                return z3;
            } catch (IOException e2) {
                Log.w("LruCountDiskCache", e2.getMessage());
                tlj.ouw(null);
                return false;
            }
        } catch (Throwable th2) {
            tlj.ouw(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.InputStream[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.Closeable, java.io.InputStream] */
    @Override // com.bytedance.sdk.component.fkw.ouw
    /* renamed from: vt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] ouw(String str) throws Throwable {
        Closeable closeable;
        Closeable closeable2;
        ByteArrayOutputStream byteArrayOutputStream;
        ouw ouwVar = this.vt;
        Closeable closeable3 = null;
        if (ouwVar != null) {
            try {
                if (str != 0) {
                    try {
                        ouw.lh lhVarOuw = ouwVar.ouw((String) str);
                        if (lhVarOuw == null) {
                            tlj.ouw(null);
                            tlj.ouw(null);
                            return null;
                        }
                        str = lhVarOuw.ouw[0];
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                            } catch (IOException e2) {
                                e = e2;
                                byteArrayOutputStream = null;
                                closeable2 = str;
                                Log.w("LruCountDiskCache", e.toString());
                                tlj.ouw(closeable2);
                                tlj.ouw(byteArrayOutputStream);
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                closeable = null;
                                closeable3 = str;
                                tlj.ouw(closeable3);
                                tlj.ouw(closeable);
                                throw th;
                            }
                            try {
                                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                                while (true) {
                                    int i4 = str.read(bArr);
                                    if (i4 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i4);
                                }
                            } catch (IOException e10) {
                                e = e10;
                                closeable2 = str;
                                Log.w("LruCountDiskCache", e.toString());
                                tlj.ouw(closeable2);
                                tlj.ouw(byteArrayOutputStream);
                                return null;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        tlj.ouw(str);
                        tlj.ouw(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e11) {
                        e = e11;
                        closeable2 = null;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = null;
                        tlj.ouw(closeable3);
                        tlj.ouw(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.fkw.lh
    public final InputStream ouw(String str) throws Throwable {
        ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return null;
        }
        try {
            ouw.lh lhVarOuw = ouwVar.ouw(str);
            if (lhVarOuw != null) {
                return lhVarOuw.ouw[0];
            }
        } catch (IOException e2) {
            Log.w("LruCountDiskCache", e2.getMessage());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    public boolean ouw(String str, byte[] bArr) throws Throwable {
        Closeable closeable;
        ouw.C0050ouw c0050ouwVt;
        ouw ouwVar = this.vt;
        if (ouwVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable2 = null;
        ouw.C0050ouw c0050ouw = null;
        try {
            try {
                c0050ouwVt = ouwVar.vt(str);
            } catch (Throwable th2) {
                th = th2;
                tlj.ouw(closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            closeable = null;
        }
        try {
            if (c0050ouwVt == null) {
                Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                tlj.ouw(null);
                return false;
            }
            OutputStream outputStreamOuw = c0050ouwVt.ouw();
            if (outputStreamOuw == ouw.f7473lh) {
                Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                tlj.ouw(outputStreamOuw);
                return false;
            }
            outputStreamOuw.write(bArr);
            if (c0050ouwVt.f7478lh) {
                ouw.this.ouw(c0050ouwVt, false);
                ouw.this.lh(c0050ouwVt.ouw.ouw);
            } else {
                ouw.this.ouw(c0050ouwVt, true);
            }
            c0050ouwVt.yu = true;
            this.vt.ouw();
            tlj.ouw(outputStreamOuw);
            return true;
        } catch (IOException e10) {
            e = e10;
            closeable = null;
            c0050ouw = c0050ouwVt;
            try {
                Log.w("LruCountDiskCache", e.toString());
                if (c0050ouw != null) {
                    try {
                        c0050ouw.vt();
                    } catch (IOException unused) {
                    }
                }
                tlj.ouw(closeable);
                return false;
            } catch (Throwable th3) {
                th = th3;
                closeable2 = closeable;
                tlj.ouw(closeable2);
                throw th;
            }
        }
    }
}
