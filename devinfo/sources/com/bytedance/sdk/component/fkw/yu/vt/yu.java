package com.bytedance.sdk.component.fkw.yu.vt;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.fkw.mwh;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.fkw.yu.lh.le;
import com.bytedance.sdk.component.fkw.yu.lh.vt.ouw;
import com.bytedance.sdk.component.utils.cf;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.ra;
import com.facebook.ads.AdError;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu<T> implements le {
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "decode";
    }

    public static void ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, byte[] bArr, boolean z3, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        try {
            com.bytedance.sdk.component.fkw.yu.lh.le leVar = lhVar.qbp;
            Bitmap bitmapOuw = com.bytedance.sdk.component.fkw.yu.lh.le.ouw(lhVar).ouw(bArr);
            if (bitmapOuw == null) {
                ko.vt("PagImageRequest", "step 5 decode fail bitmap is null image key is " + lhVar.vt + " url is " + lhVar.ouw);
                ouwVar.ouw(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, "decode failed bitmap null", new Exception("decode failed bitmap null"));
                return;
            }
            ko.vt("PagImageRequest", "step 5 decode success  image key is " + lhVar.vt + " url is " + lhVar.ouw + " bitmap is width = " + bitmapOuw.getWidth() + " height " + bitmapOuw.getHeight() + " size = " + ((bitmapOuw.getByteCount() * 1.0f) / 1024.0f));
            ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, bitmapOuw, null, false));
            if (z3) {
                ouw(lhVar.zin, leVar, lhVar.vt, bitmapOuw);
            }
        } catch (Throwable th2) {
            ko.ouw("PagImageRequest", "step 5 decode exception bitmap is null image key is " + lhVar.vt + " url is " + lhVar.ouw, th2);
            StringBuilder sb2 = new StringBuilder("decode failed:");
            sb2.append(th2.getMessage());
            ouwVar.ouw(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, sb2.toString(), th2);
        }
    }

    private static void ouw(com.bytedance.sdk.component.fkw.vt vtVar, com.bytedance.sdk.component.fkw.yu.lh.le leVar, String str, Bitmap bitmap) {
        if (vtVar == null || leVar == null || !vtVar.fkw()) {
            return;
        }
        leVar.ouw(vtVar).ouw(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(final com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, final com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        final byte[] bArr = lhVar.tc;
        if (bArr == null) {
            ouwVar.ouw(AdError.SERVER_ERROR_CODE, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int i4 = lhVar.tlj;
        lhVar.f7503th = bArr.length;
        if (i4 == 2) {
            boolean z3 = (com.bytedance.sdk.component.utils.le.vt(bArr) || cf.ouw(bArr)) ? false : true;
            if (com.bytedance.sdk.component.utils.le.ouw(bArr)) {
                ouw(lhVar, bArr, z3, ouwVar);
            } else {
                ouwVar.ouw(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (i4 != 3) {
            if (com.bytedance.sdk.component.utils.le.vt(bArr)) {
                try {
                    final com.bytedance.sdk.component.fkw.yu.lh.le leVar = lhVar.qbp;
                    final com.bytedance.sdk.component.fkw.yu.lh.vt.ouw ouwVar2 = new com.bytedance.sdk.component.fkw.yu.lh.vt.ouw();
                    final ouw.InterfaceC0052ouw interfaceC0052ouw = new ouw.InterfaceC0052ouw() { // from class: com.bytedance.sdk.component.fkw.yu.vt.yu.2
                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0052ouw
                        public final void ouw(Drawable drawable) {
                            ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, drawable, null, true));
                        }

                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0052ouw
                        public final void vt() {
                            if (com.bytedance.sdk.component.utils.le.ouw(bArr)) {
                                yu.ouw(lhVar, bArr, true, ouwVar);
                            } else {
                                ouwVar.ouw(1001, "result type is gif but data not image", new Exception("gif not image format"));
                            }
                        }

                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0052ouw
                        public final void ouw() {
                            ouwVar.ouw(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, "decode gif fail", new Exception("decode gif fail"));
                        }
                    };
                    if (Build.VERSION.SDK_INT <= 30) {
                        try {
                            ko.vt("PAGGifDefaultDecoder", "load animation image");
                            leVar.vt().submit(new Runnable() { // from class: com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.1

                                /* renamed from: lh */
                                final /* synthetic */ InterfaceC0052ouw f7516lh;
                                final /* synthetic */ byte[] ouw;
                                final /* synthetic */ le vt;

                                public AnonymousClass1(final byte[] bArr2, final le leVar2, final InterfaceC0052ouw interfaceC0052ouw2) {
                                    bArr = bArr2;
                                    leVar = leVar2;
                                    interfaceC0052ouw = interfaceC0052ouw2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    File fileOuw;
                                    FileOutputStream fileOutputStream;
                                    byte[] bArr2 = bArr;
                                    le leVar2 = leVar;
                                    InterfaceC0052ouw interfaceC0052ouw2 = interfaceC0052ouw;
                                    FileOutputStream fileOutputStream2 = null;
                                    try {
                                        mwh mwhVar = leVar2.vt;
                                        boolean zTlj = mwhVar != null ? mwhVar.tlj() : false;
                                        fileOuw = ra.ouw(leVar2.f7495le, zTlj, zTlj ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
                                        fileOutputStream = new FileOutputStream(fileOuw);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    try {
                                        fileOutputStream.write(bArr2, 0, bArr2.length);
                                        if (Build.VERSION.SDK_INT < 28) {
                                            if (interfaceC0052ouw2 != null) {
                                                interfaceC0052ouw2.vt();
                                            }
                                            try {
                                                fileOutputStream.close();
                                                return;
                                            } catch (Throwable unused) {
                                                return;
                                            }
                                        }
                                        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileOuw));
                                        if (interfaceC0052ouw2 != null) {
                                            interfaceC0052ouw2.ouw(drawableDecodeDrawable);
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable unused2) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream2 = fileOutputStream;
                                        try {
                                            qbp.ouw("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                                            if (fileOutputStream2 != null) {
                                                try {
                                                    fileOutputStream2.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            if (interfaceC0052ouw2 != null) {
                                                interfaceC0052ouw2.ouw();
                                            }
                                        } catch (Throwable th4) {
                                            if (fileOutputStream2 != null) {
                                                try {
                                                    fileOutputStream2.close();
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                            throw th4;
                                        }
                                    }
                                }
                            });
                        } catch (Throwable th2) {
                            qbp.lh("PAGGifDefaultDecoder", th2.getMessage());
                            interfaceC0052ouw2.ouw();
                        }
                    } else {
                        com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.ouw(bArr2, interfaceC0052ouw2);
                    }
                } catch (Throwable th3) {
                    ouwVar.ouw(AdError.SERVER_ERROR_CODE, "decode gif error", th3);
                }
            } else if (cf.ouw(bArr2)) {
                try {
                    new com.bytedance.sdk.component.fkw.yu.lh.vt.ouw();
                    com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.ouw(bArr2, new ouw.InterfaceC0052ouw() { // from class: com.bytedance.sdk.component.fkw.yu.vt.yu.1
                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0052ouw
                        public final void ouw(Drawable drawable) {
                            ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, drawable, null, false));
                        }

                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0052ouw
                        public final void vt() {
                            if (com.bytedance.sdk.component.utils.le.ouw(bArr2)) {
                                yu.ouw(lhVar, bArr2, true, ouwVar);
                            } else {
                                ouwVar.ouw(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                            }
                        }

                        @Override // com.bytedance.sdk.component.fkw.yu.lh.vt.ouw.InterfaceC0052ouw
                        public final void ouw() {
                            ouwVar.ouw(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, "decode webp animate fail", new Exception("decode webp animate fail"));
                        }
                    });
                } catch (Throwable th4) {
                    ouwVar.ouw(AdError.SERVER_ERROR_CODE, "decode webp animation error", th4);
                }
            } else if (com.bytedance.sdk.component.utils.le.ouw(bArr2)) {
                ouw(lhVar, bArr2, true, ouwVar);
            } else {
                ouwVar.ouw(1001, "is not supprot image type", new Exception("not supprot image type"));
            }
        } else {
            ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, bArr2, null, com.bytedance.sdk.component.utils.le.vt(bArr2)));
        }
        return false;
    }
}
