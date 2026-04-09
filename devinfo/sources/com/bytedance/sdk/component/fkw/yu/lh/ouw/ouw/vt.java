package com.bytedance.sdk.component.fkw.yu.lh.ouw.ouw;

import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.fkw.lh;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.tlj;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements lh {
    private int ouw;
    private ouw vt;

    public vt(File file, long j) {
        int i4 = (int) j;
        this.ouw = i4;
        this.vt = ouw.ouw(i4, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.component.fkw.ouw
    /* renamed from: lh, reason: merged with bridge method [inline-methods] */
    public boolean vt(String str) throws IOException {
        try {
            InputStream inputStreamOuw = this.vt.ouw(str);
            boolean z3 = inputStreamOuw != null;
            tlj.ouw(inputStreamOuw);
            return z3;
        } catch (Throwable th2) {
            try {
                ko.yu("LruCountDiskCache", th2.getMessage());
                return false;
            } finally {
                tlj.ouw(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // com.bytedance.sdk.component.fkw.ouw
    /* renamed from: vt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] ouw(String str) throws Throwable {
        ?? r72;
        ?? r02;
        InputStream inputStreamOuw;
        ByteArrayOutputStream byteArrayOutputStream;
        ouw ouwVar = this.vt;
        if (ouwVar != null) {
            try {
                if (str != null) {
                    try {
                        inputStreamOuw = ouwVar.ouw(str);
                        if (inputStreamOuw != null) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                            } catch (IOException e2) {
                                e = e2;
                                byteArrayOutputStream = null;
                                inputStreamOuw = inputStreamOuw;
                                ko.yu("LruCountDiskCache", e.toString());
                                tlj.ouw(inputStreamOuw);
                                tlj.ouw(byteArrayOutputStream);
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                r02 = 0;
                                r72 = inputStreamOuw;
                                tlj.ouw(r72);
                                tlj.ouw(r02);
                                throw th;
                            }
                            try {
                                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                                while (true) {
                                    int i4 = inputStreamOuw.read(bArr);
                                    if (i4 == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i4);
                                }
                            } catch (IOException e10) {
                                e = e10;
                                inputStreamOuw = inputStreamOuw;
                                ko.yu("LruCountDiskCache", e.toString());
                                tlj.ouw(inputStreamOuw);
                                tlj.ouw(byteArrayOutputStream);
                                return null;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        if (byteArrayOutputStream != null) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            tlj.ouw(inputStreamOuw);
                            tlj.ouw(byteArrayOutputStream);
                            return byteArray;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        inputStreamOuw = null;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        r02 = 0;
                        th = th3;
                        r72 = 0;
                    }
                    tlj.ouw(inputStreamOuw);
                    tlj.ouw(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                r02 = ouwVar;
                r72 = str;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fkw.ouw
    public final /* bridge */ /* synthetic */ boolean ouw(String str, byte[] bArr) {
        String str2 = str;
        byte[] bArr2 = bArr;
        ouw ouwVar = this.vt;
        if (ouwVar == null || bArr2 == null || str2 == null) {
            return false;
        }
        return ouwVar.ouw(str2, bArr2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.fkw.lh
    public final InputStream ouw(String str) {
        ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return null;
        }
        return ouwVar.ouw(str);
    }
}
