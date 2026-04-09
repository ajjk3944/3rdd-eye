package com.bytedance.sdk.openadsdk.core.gbl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.ugeno.emc;
import com.bytedance.adsdk.ugeno.zz.dg.a;
import com.bytedance.adsdk.ugeno.zz.dg.b;
import com.bytedance.sdk.component.bw.gbl;
import com.bytedance.sdk.component.bw.ru;
import com.bytedance.sdk.component.bw.vk;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.uym;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class emc implements com.bytedance.adsdk.ugeno.emc {

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbl.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0142emc {
        void emc(Drawable drawable);
    }

    public static class ypw implements vk {
        private final int dg;
        private final WeakReference<ImageView> emc;
        private final int xq;
        private final emc ypw;

        public ypw(ImageView imageView, emc emcVar, int i10, int i11) {
            this.emc = new WeakReference<>(imageView);
            this.ypw = emcVar;
            this.xq = i10;
            this.dg = i11;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(int i10, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(gbl gblVar) {
            try {
                final ImageView imageView = this.emc.get();
                if (imageView == null) {
                    return;
                }
                final Object objYpw = gblVar.ypw();
                if (objYpw instanceof Drawable) {
                    iyl.emc((Runnable) new msw("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && a.a(objYpw)) {
                                b.a(objYpw).start();
                            }
                            imageView.setImageDrawable((Drawable) objYpw);
                        }
                    });
                    return;
                }
                if (!(objYpw instanceof byte[])) {
                    if (objYpw instanceof Bitmap) {
                        iyl.emc((Runnable) new msw("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.3
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap((Bitmap) objYpw);
                            }
                        });
                    }
                } else {
                    if (gblVar.bw()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.ypw.emc((byte[]) objYpw, imageView);
                            return;
                        } else {
                            this.ypw.emc(imageView, (byte[]) objYpw, this.xq, this.dg);
                            return;
                        }
                    }
                    if (this.ypw.emc((byte[]) objYpw)) {
                        this.ypw.emc(imageView, (byte[]) objYpw, this.xq, this.dg);
                        return;
                    }
                    final Bitmap bitmapEmc = new com.bytedance.sdk.component.bw.dg.xq.ypw.ypw(this.xq, this.dg, imageView.getScaleType(), Bitmap.Config.RGB_565, this.xq, this.dg).emc((byte[]) objYpw);
                    if (bitmapEmc != null) {
                        iyl.emc((Runnable) new msw("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.ypw.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapEmc);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                ul.xq("ImageLoaderProvider", th.getMessage());
            }
        }
    }

    private void ypw(final ImageView imageView, byte[] bArr, int i10, int i11) {
        final Bitmap bitmapEmc = new com.bytedance.sdk.component.bw.dg.xq.ypw.ypw(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).emc(bArr);
        if (bitmapEmc != null) {
            iyl.emc((Runnable) new msw("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapEmc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable ypw(byte[] bArr) {
        FileOutputStream fileOutputStream;
        File fileEmc;
        try {
            boolean zXq = com.bytedance.sdk.openadsdk.multipro.ypw.xq();
            fileEmc = uym.emc(aa.emc(), zXq, zXq ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileEmc);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileEmc));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                return drawableDecodeDrawable;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(aa.emc().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            return bitmapDrawable;
        } catch (Throwable th2) {
            th = th2;
            try {
                ul.emc("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            } catch (Throwable th3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th3;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.emc
    public void emc(com.bytedance.adsdk.ugeno.core.gbl gblVar, String str, ImageView imageView, int i10, int i11, emc.InterfaceC0094emc interfaceC0094emc) {
        String strEmc = dg.emc(str);
        ru ruVarXq = com.bytedance.sdk.openadsdk.ru.dg.emc(strEmc).xq(1);
        emc(gblVar, ruVarXq, strEmc);
        ruVarXq.emc(new ypw(imageView, this, i10, i11), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final ImageView imageView, byte[] bArr, int i10, int i11) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    iyl.emc((Runnable) new msw("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (a.a(drawableDecodeDrawable)) {
                                b.a(drawableDecodeDrawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e10) {
                ul.xq("ImageLoaderProvider", e10.getMessage());
                return;
            }
        }
        ypw(imageView, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(byte[] bArr, final ImageView imageView) {
        try {
            emc(bArr, new InterfaceC0142emc() { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.3
                @Override // com.bytedance.sdk.openadsdk.core.gbl.emc.InterfaceC0142emc
                public void emc(final Drawable drawable) {
                    iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                                b.a(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e10) {
            ul.xq("ImageLoaderProvider", e10.getMessage());
        }
    }

    private void emc(final byte[] bArr, final InterfaceC0142emc interfaceC0142emc) {
        iyl.ypw(new msw("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableYpw = emc.this.ypw(bArr);
                InterfaceC0142emc interfaceC0142emc2 = interfaceC0142emc;
                if (interfaceC0142emc2 != null) {
                    interfaceC0142emc2.emc(drawableYpw);
                }
            }
        });
    }

    public boolean emc(byte[] bArr) {
        return com.bytedance.sdk.component.utils.gbl.emc(bArr, 0);
    }

    public void ypw(com.bytedance.adsdk.ugeno.core.gbl gblVar, String str, final emc.InterfaceC0094emc interfaceC0094emc) {
        ru ruVarXq = com.bytedance.sdk.openadsdk.ru.dg.emc(str).xq(2);
        emc(gblVar, ruVarXq, str);
        ruVarXq.emc(new vk() { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.5
            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(gbl gblVar2) {
                if (gblVar2 == null) {
                    interfaceC0094emc.emc(null);
                    return;
                }
                if (interfaceC0094emc != null) {
                    Object objYpw = gblVar2.ypw();
                    if (objYpw instanceof Bitmap) {
                        interfaceC0094emc.emc((Bitmap) objYpw);
                        return;
                    }
                    if (gblVar2.ypw() instanceof byte[]) {
                        try {
                            interfaceC0094emc.emc(BitmapFactory.decodeByteArray((byte[]) gblVar2.ypw(), 0, ((byte[]) gblVar2.ypw()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0094emc.emc(null);
                }
            }

            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(int i10, String str2, Throwable th) {
                emc.InterfaceC0094emc interfaceC0094emc2 = interfaceC0094emc;
                if (interfaceC0094emc2 != null) {
                    interfaceC0094emc2.emc(null);
                }
            }
        }, 4);
    }

    @Override // com.bytedance.adsdk.ugeno.emc
    public void emc(com.bytedance.adsdk.ugeno.core.gbl gblVar, String str, emc.InterfaceC0094emc interfaceC0094emc) {
        ypw(gblVar, dg.emc(str), interfaceC0094emc);
    }

    private void emc(com.bytedance.adsdk.ugeno.core.gbl gblVar, @NonNull ru ruVar, String str) {
        Map<String, Object> mapYpw;
        if (gblVar == null || (mapYpw = gblVar.ypw()) == null) {
            return;
        }
        Object obj = mapYpw.get("image_info");
        if (obj instanceof Map) {
            ruVar.emc((String) ((Map) obj).get(str));
        }
        String str2 = (String) mapYpw.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ruVar.ypw(str2);
    }
}
