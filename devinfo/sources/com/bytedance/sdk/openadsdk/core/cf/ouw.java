package com.bytedance.sdk.openadsdk.core.cf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.applovin.shadow.okio.a;
import com.bytedance.adsdk.ugeno.ouw;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.fkw.tlj;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements com.bytedance.adsdk.ugeno.ouw {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.cf.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0077ouw {
        void ouw(Drawable drawable);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements rn {

        /* renamed from: lh, reason: collision with root package name */
        private final int f8150lh;
        private final WeakReference<ImageView> ouw;
        private final ouw vt;
        private final int yu;

        public vt(ImageView imageView, ouw ouwVar, int i4, int i10) {
            this.ouw = new WeakReference<>(imageView);
            this.vt = ouwVar;
            this.f8150lh = i4;
            this.yu = i10;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i4, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(cf cfVar) {
            try {
                final ImageView imageView = this.ouw.get();
                if (imageView == null) {
                    return;
                }
                final Object objVt = cfVar.vt();
                if (objVt instanceof Drawable) {
                    bs.ouw((Runnable) new pno("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Object obj = objVt;
                                if (a.i(obj)) {
                                    a.c(obj).start();
                                }
                            }
                            imageView.setImageDrawable((Drawable) objVt);
                        }
                    });
                    return;
                }
                if (!(objVt instanceof byte[])) {
                    if (objVt instanceof Bitmap) {
                        bs.ouw((Runnable) new pno("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageView.setImageBitmap((Bitmap) objVt);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (!cfVar.fkw()) {
                    if (com.bytedance.sdk.component.utils.cf.ouw((byte[]) objVt)) {
                        ouw.ouw(this.vt, imageView, (byte[]) objVt, this.f8150lh, this.yu);
                        return;
                    }
                    ko.vt("ImageLoaderProvider", "load static image");
                    final Bitmap bitmapOuw = new com.bytedance.sdk.component.fkw.yu.lh.vt.vt(this.f8150lh, this.yu, imageView.getScaleType(), Bitmap.Config.RGB_565, this.f8150lh, this.yu).ouw((byte[]) objVt);
                    if (bitmapOuw != null) {
                        bs.ouw((Runnable) new pno("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.vt.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageView.setImageBitmap(bitmapOuw);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (Build.VERSION.SDK_INT > 30) {
                    ouw.ouw(this.vt, imageView, (byte[]) objVt, this.f8150lh, this.yu);
                    return;
                }
                final ouw ouwVar = this.vt;
                final byte[] bArr = (byte[]) objVt;
                try {
                    ko.fkw("ImageLoaderProvider", "load animation image");
                    final InterfaceC0077ouw interfaceC0077ouw = new InterfaceC0077ouw() { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.3
                        @Override // com.bytedance.sdk.openadsdk.core.cf.ouw.InterfaceC0077ouw
                        public final void ouw(final Drawable drawable) {
                            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        Drawable drawable2 = drawable;
                                        if (a.i(drawable2)) {
                                            a.c(drawable2).start();
                                        }
                                    }
                                    imageView.setImageDrawable(drawable);
                                }
                            });
                        }
                    };
                    bs.vt(new pno("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            Drawable drawableOuw = ouw.ouw(bArr);
                            InterfaceC0077ouw interfaceC0077ouw2 = interfaceC0077ouw;
                            if (interfaceC0077ouw2 != null) {
                                interfaceC0077ouw2.ouw(drawableOuw);
                            }
                        }
                    });
                } catch (Exception e2) {
                    qbp.lh("ImageLoaderProvider", e2.getMessage());
                }
            } catch (Throwable th2) {
                qbp.lh("ImageLoaderProvider", th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.core.cf cfVar, String str, ImageView imageView, int i4, int i10) {
        String strOuw = lh.ouw(str);
        tlj tljVarLh = yu.ouw.ouw(yu.ouw.vt.ouw(strOuw).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).lh(1);
        ouw(cfVar, tljVarLh, strOuw);
        tljVarLh.ouw(new vt(imageView, this, i4, i10));
    }

    public static Drawable ouw(byte[] bArr) {
        FileOutputStream fileOutputStream;
        File fileOuw;
        try {
            boolean zLh = com.bytedance.sdk.openadsdk.multipro.vt.lh();
            fileOuw = ra.ouw(zih.ouw(), zLh, zLh ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileOuw);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileOuw));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                return drawableDecodeDrawable;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(zih.ouw().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            return bitmapDrawable;
        } catch (Throwable th3) {
            th = th3;
            try {
                qbp.ouw("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            } catch (Throwable th4) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.core.cf cfVar, String str, final ouw.InterfaceC0033ouw interfaceC0033ouw) {
        String strOuw = lh.ouw(str);
        tlj tljVarLh = yu.ouw.ouw(yu.ouw.vt.ouw(strOuw).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).lh(2);
        ouw(cfVar, tljVarLh, strOuw);
        tljVarLh.ouw(new rn() { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.5
            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(cf cfVar2) {
                if (cfVar2 == null) {
                    interfaceC0033ouw.ouw(null);
                    return;
                }
                if (interfaceC0033ouw != null) {
                    Object objVt = cfVar2.vt();
                    if (objVt instanceof Bitmap) {
                        interfaceC0033ouw.ouw((Bitmap) objVt);
                        return;
                    }
                    if (cfVar2.vt() instanceof byte[]) {
                        try {
                            interfaceC0033ouw.ouw(BitmapFactory.decodeByteArray((byte[]) cfVar2.vt(), 0, ((byte[]) cfVar2.vt()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0033ouw.ouw(null);
                }
            }

            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(int i4, String str2, Throwable th2) {
                ouw.InterfaceC0033ouw interfaceC0033ouw2 = interfaceC0033ouw;
                if (interfaceC0033ouw2 != null) {
                    interfaceC0033ouw2.ouw(null);
                }
            }
        });
    }

    private static void ouw(com.bytedance.adsdk.ugeno.core.cf cfVar, tlj tljVar, String str) {
        Map<String, Object> map;
        if (cfVar == null || (map = cfVar.yu) == null) {
            return;
        }
        Object obj = map.get("image_info");
        if (obj instanceof Map) {
            tljVar.ouw((String) ((Map) obj).get(str));
        }
        String str2 = (String) map.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        tljVar.vt(str2);
    }

    public static /* synthetic */ void ouw(ouw ouwVar, final ImageView imageView, byte[] bArr, int i4, int i10) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    bs.ouw((Runnable) new pno("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Drawable drawable = drawableDecodeDrawable;
                            if (a.i(drawable)) {
                                a.c(drawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e2) {
                qbp.lh("ImageLoaderProvider", e2.getMessage());
                return;
            }
        }
        final Bitmap bitmapOuw = new com.bytedance.sdk.component.fkw.yu.lh.vt.vt(i4, i10, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i4, i10).ouw(bArr);
        if (bitmapOuw != null) {
            bs.ouw((Runnable) new pno("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.cf.ouw.2
                @Override // java.lang.Runnable
                public final void run() {
                    imageView.setImageBitmap(bitmapOuw);
                }
            });
        }
    }
}
