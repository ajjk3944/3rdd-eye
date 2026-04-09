package com.bytedance.sdk.openadsdk.core.gbl;

import U4.e;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.emc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
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
    public interface InterfaceC0057emc {
        void emc(Drawable drawable);
    }

    public static class ypw implements vk {
        private final int dg;
        private final WeakReference<ImageView> emc;
        private final int xq;
        private final emc ypw;

        public ypw(ImageView imageView, emc emcVar, int i, int i3) {
            this.emc = new WeakReference<>(imageView);
            this.ypw = emcVar;
            this.xq = i;
            this.dg = i3;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(int i, String str, Throwable th) {
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
                            if (Build.VERSION.SDK_INT >= 28 && e.t(objYpw)) {
                                a.j(objYpw).start();
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

    private void ypw(final ImageView imageView, byte[] bArr, int i, int i3) {
        final Bitmap bitmapEmc = new com.bytedance.sdk.component.bw.dg.xq.ypw.ypw(i, i3, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i3).emc(bArr);
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
    public void emc(com.bytedance.adsdk.ugeno.core.gbl gblVar, String str, ImageView imageView, int i, int i3, emc.InterfaceC0009emc interfaceC0009emc) {
        String strEmc = dg.emc(str);
        ru ruVarXq = com.bytedance.sdk.openadsdk.ru.dg.emc(strEmc).xq(1);
        emc(gblVar, ruVarXq, strEmc);
        ruVarXq.emc(new ypw(imageView, this, i, i3), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final ImageView imageView, byte[] bArr, int i, int i3) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    iyl.emc((Runnable) new msw("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (e.t(drawableDecodeDrawable)) {
                                a.j(drawableDecodeDrawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e6) {
                ul.xq("ImageLoaderProvider", e6.getMessage());
                return;
            }
        }
        ypw(imageView, bArr, i, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(byte[] bArr, final ImageView imageView) {
        try {
            emc(bArr, new InterfaceC0057emc() { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.3
                @Override // com.bytedance.sdk.openadsdk.core.gbl.emc.InterfaceC0057emc
                public void emc(final Drawable drawable) {
                    iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && e.t(drawable)) {
                                a.j(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e6) {
            ul.xq("ImageLoaderProvider", e6.getMessage());
        }
    }

    private void emc(final byte[] bArr, final InterfaceC0057emc interfaceC0057emc) {
        iyl.ypw(new msw("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableYpw = emc.this.ypw(bArr);
                InterfaceC0057emc interfaceC0057emc2 = interfaceC0057emc;
                if (interfaceC0057emc2 != null) {
                    interfaceC0057emc2.emc(drawableYpw);
                }
            }
        });
    }

    public boolean emc(byte[] bArr) {
        return com.bytedance.sdk.component.utils.gbl.emc(bArr, 0);
    }

    public void ypw(com.bytedance.adsdk.ugeno.core.gbl gblVar, String str, final emc.InterfaceC0009emc interfaceC0009emc) {
        ru ruVarXq = com.bytedance.sdk.openadsdk.ru.dg.emc(str).xq(2);
        emc(gblVar, ruVarXq, str);
        ruVarXq.emc(new vk() { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.5
            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(gbl gblVar2) {
                if (gblVar2 == null) {
                    interfaceC0009emc.emc(null);
                    return;
                }
                if (interfaceC0009emc != null) {
                    Object objYpw = gblVar2.ypw();
                    if (objYpw instanceof Bitmap) {
                        interfaceC0009emc.emc((Bitmap) objYpw);
                        return;
                    }
                    if (gblVar2.ypw() instanceof byte[]) {
                        try {
                            interfaceC0009emc.emc(BitmapFactory.decodeByteArray((byte[]) gblVar2.ypw(), 0, ((byte[]) gblVar2.ypw()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0009emc.emc(null);
                }
            }

            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(int i, String str2, Throwable th) {
                emc.InterfaceC0009emc interfaceC0009emc2 = interfaceC0009emc;
                if (interfaceC0009emc2 != null) {
                    interfaceC0009emc2.emc(null);
                }
            }
        }, 4);
    }

    @Override // com.bytedance.adsdk.ugeno.emc
    public void emc(com.bytedance.adsdk.ugeno.core.gbl gblVar, String str, emc.InterfaceC0009emc interfaceC0009emc) {
        ypw(gblVar, dg.emc(str), interfaceC0009emc);
    }

    private void emc(com.bytedance.adsdk.ugeno.core.gbl gblVar, ru ruVar, String str) {
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
