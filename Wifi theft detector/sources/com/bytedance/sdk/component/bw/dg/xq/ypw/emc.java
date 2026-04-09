package com.bytedance.sdk.component.bw.dg.xq.ypw;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.bw.dg.xq.ycc;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.uym;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class emc {

    /* renamed from: com.bytedance.sdk.component.bw.dg.xq.ypw.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0115emc {
        void emc();

        void emc(Drawable drawable);

        void emc(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(byte[] bArr, ycc yccVar, InterfaceC0115emc interfaceC0115emc) {
        File fileEmc;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            boolean zUym = yccVar.uym();
            fileEmc = uym.emc(yccVar.emc(), zUym, zUym ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileEmc);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT < 28) {
                if (interfaceC0115emc != null) {
                    interfaceC0115emc.emc(bArr);
                }
                try {
                    fileOutputStream.close();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileEmc));
            if (interfaceC0115emc != null) {
                interfaceC0115emc.emc(drawableDecodeDrawable);
            }
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                ul.emc("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused3) {
                    }
                }
                if (interfaceC0115emc != null) {
                    interfaceC0115emc.emc();
                }
            } catch (Throwable th3) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th3;
            }
        }
    }

    public void emc(byte[] bArr, ycc yccVar, InterfaceC0115emc interfaceC0115emc) {
        if (Build.VERSION.SDK_INT <= 30) {
            emc(bArr, interfaceC0115emc, yccVar);
        } else {
            emc(bArr, interfaceC0115emc);
        }
    }

    public void emc(byte[] bArr, InterfaceC0115emc interfaceC0115emc) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0115emc != null) {
                interfaceC0115emc.emc(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0115emc != null) {
                interfaceC0115emc.emc(drawableDecodeDrawable);
            }
        } catch (Throwable th) {
            ul.xq("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0115emc != null) {
                interfaceC0115emc.emc();
            }
        }
    }

    private void emc(final byte[] bArr, final InterfaceC0115emc interfaceC0115emc, final ycc yccVar) {
        try {
            yccVar.msw().submit(new Runnable() { // from class: com.bytedance.sdk.component.bw.dg.xq.ypw.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.ypw(bArr, yccVar, interfaceC0115emc);
                }
            });
        } catch (Throwable th) {
            ul.xq("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0115emc != null) {
                interfaceC0115emc.emc();
            }
        }
    }
}
