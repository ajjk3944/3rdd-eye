package com.bytedance.sdk.component.adexpress.yu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import com.bytedance.sdk.component.utils.ko;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static Bitmap ouw(Context context, Bitmap bitmap, int i4) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            return com.bytedance.sdk.component.adexpress.yu.lh() == 0 ? vt(context, bitmapCreateScaledBitmap, i4) : com.bytedance.sdk.component.adexpress.yu.lh() == 1 ? ouw(bitmapCreateScaledBitmap, i4) : vt(bitmapCreateScaledBitmap, i4);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap vt(android.content.Context r7, android.graphics.Bitmap r8, int r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.yu.ouw.vt(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    private static Bitmap ouw(Bitmap bitmap, int i4) {
        int i10;
        int i11;
        int i12 = i4;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i13 = width * height;
            int[] iArr = new int[i13];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = iArr;
            int i14 = width - 1;
            int i15 = height - 1;
            int i16 = i12 + i12;
            int i17 = i16 + 1;
            char c9 = 2;
            int i18 = (i16 + 2) >> 1;
            int i19 = i18 * i18;
            int[] iArr3 = new int[Math.max(width, height)];
            int i20 = i19 * 256;
            int[] iArr4 = new int[i20];
            int[] iArr5 = new int[i13];
            int[] iArr6 = new int[i13];
            int[] iArr7 = new int[i13];
            int i21 = 0;
            for (int i22 = 0; i22 < i20; i22++) {
                iArr4[i22] = i22 / i19;
            }
            int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i17, 3);
            int i23 = i12 + 1;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i24 < height) {
                char c10 = c9;
                int i27 = -i12;
                int i28 = i21;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                int i33 = i32;
                int i34 = i33;
                int i35 = i34;
                int i36 = i35;
                while (i27 <= i12) {
                    int[] iArr9 = iArr2;
                    int[][] iArr10 = iArr8;
                    int i37 = iArr9[i25 + Math.min(i14, Math.max(i27, i21))];
                    int[] iArr11 = iArr10[i27 + i12];
                    iArr11[0] = (i37 & 16711680) >> 16;
                    iArr11[1] = (i37 & 65280) >> 8;
                    iArr11[c10] = i37 & 255;
                    int iAbs = i23 - Math.abs(i27);
                    int i38 = iArr11[0];
                    i28 = (i38 * iAbs) + i28;
                    int i39 = iArr11[1];
                    i29 = (i39 * iAbs) + i29;
                    int i40 = iArr11[c10];
                    i30 = (iAbs * i40) + i30;
                    if (i27 <= 0) {
                        i32 += i38;
                        i34 += i39;
                        i36 += i40;
                    } else {
                        i31 += i38;
                        i33 += i39;
                        i35 += i40;
                    }
                    i27++;
                    iArr2 = iArr9;
                    iArr8 = iArr10;
                    i21 = 0;
                }
                int[] iArr12 = iArr2;
                int[][] iArr13 = iArr8;
                int i41 = i12;
                int i42 = 0;
                while (i42 < width) {
                    iArr5[i25] = iArr4[i28];
                    iArr6[i25] = iArr4[i29];
                    iArr7[i25] = iArr4[i30];
                    int[] iArr14 = iArr13[((i41 - i12) + i17) % i17];
                    int i43 = i28 - i32;
                    int i44 = i29 - i34;
                    int i45 = i30 - i36;
                    int i46 = i32 - iArr14[0];
                    int i47 = i34 - iArr14[1];
                    int i48 = i36 - iArr14[c10];
                    if (i24 == 0) {
                        i11 = i42;
                        iArr3[i11] = Math.min(i42 + i12 + 1, i14);
                    } else {
                        i11 = i42;
                    }
                    int i49 = iArr12[i26 + iArr3[i11]];
                    int i50 = (i49 & 16711680) >> 16;
                    iArr14[0] = i50;
                    int i51 = (i49 & 65280) >> 8;
                    iArr14[1] = i51;
                    int i52 = i49 & 255;
                    iArr14[c10] = i52;
                    int i53 = i31 + i50;
                    int i54 = i33 + i51;
                    int i55 = i35 + i52;
                    i41 = (i41 + 1) % i17;
                    int[] iArr15 = iArr13[i41 % i17];
                    i28 = i43 + i53;
                    i29 = i44 + i54;
                    i30 = i45 + i55;
                    int i56 = iArr15[0];
                    i31 = i53 - i56;
                    int i57 = iArr15[1];
                    i33 = i54 - i57;
                    int i58 = iArr15[c10];
                    i35 = i55 - i58;
                    i32 = i46 + i56;
                    i34 = i47 + i57;
                    i36 = i48 + i58;
                    i25++;
                    i42 = i11 + 1;
                }
                i26 += width;
                i24++;
                c9 = c10;
                iArr2 = iArr12;
                iArr8 = iArr13;
                i21 = 0;
            }
            int[] iArr16 = iArr2;
            int[][] iArr17 = iArr8;
            char c11 = c9;
            int i59 = 0;
            while (i59 < width) {
                int i60 = -i12;
                int i61 = i60 * width;
                int i62 = 0;
                int i63 = 0;
                int i64 = 0;
                int i65 = 0;
                int i66 = 0;
                int i67 = 0;
                int i68 = 0;
                int i69 = 0;
                int i70 = 0;
                while (i60 <= i12) {
                    int[] iArr18 = iArr17[i60 + i12];
                    int iMax = Math.max(0, i61) + i59;
                    int iAbs2 = i23 - Math.abs(i60);
                    int i71 = iArr5[iMax];
                    i62 = (i71 * iAbs2) + i62;
                    i63 = (iArr6[iMax] * iAbs2) + i63;
                    i64 = (iArr7[iMax] * iAbs2) + i64;
                    iArr18[0] = i71;
                    int i72 = iArr6[iMax];
                    iArr18[1] = i72;
                    int i73 = iArr7[iMax];
                    iArr18[c11] = i73;
                    if (i60 <= 0) {
                        i66 += i71;
                        i68 += i72;
                        i70 += i73;
                    } else {
                        i65 += i71;
                        i67 += i72;
                        i69 += i73;
                    }
                    if (i60 < i15) {
                        i61 += width;
                    }
                    i60++;
                    i12 = i4;
                }
                int i74 = i4;
                int i75 = i59;
                int i76 = 0;
                while (i76 < height) {
                    iArr16[i75] = (iArr16[i75] & (-16777216)) | (iArr4[i62] << 16) | (iArr4[i63] << 8) | iArr4[i64];
                    int[] iArr19 = iArr17[((i74 - i4) + i17) % i17];
                    int i77 = i62 - i66;
                    int i78 = i63 - i68;
                    int i79 = i64 - i70;
                    int i80 = i66 - iArr19[0];
                    int i81 = i68 - iArr19[1];
                    int i82 = i70 - iArr19[c11];
                    if (i59 == 0) {
                        i10 = i76;
                        iArr3[i10] = Math.min(i10 + i23, i15) * width;
                    } else {
                        i10 = i76;
                    }
                    int i83 = iArr3[i10] + i59;
                    int i84 = iArr5[i83];
                    iArr19[0] = i84;
                    int i85 = iArr6[i83];
                    iArr19[1] = i85;
                    int i86 = iArr7[i83];
                    iArr19[c11] = i86;
                    int i87 = i65 + i84;
                    int i88 = i67 + i85;
                    int i89 = i69 + i86;
                    i62 = i77 + i87;
                    i63 = i78 + i88;
                    i64 = i79 + i89;
                    i74 = (i74 + 1) % i17;
                    int[] iArr20 = iArr17[i74];
                    int i90 = iArr20[0];
                    i65 = i87 - i90;
                    int i91 = iArr20[1];
                    i67 = i88 - i91;
                    int i92 = iArr20[c11];
                    i69 = i89 - i92;
                    i66 = i80 + i90;
                    i68 = i81 + i91;
                    i70 = i82 + i92;
                    i75 += width;
                    i76 = i10 + 1;
                }
                i59++;
                i12 = i4;
            }
            bitmap.setPixels(iArr16, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Throwable th2) {
            ko.fkw("BlurUtils", "gaussianBlur error: " + th2.getMessage());
            return null;
        }
    }

    private static Bitmap vt(Bitmap bitmap, int i4) {
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return ouw(bitmap, i4);
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
            RenderNode renderNode = new RenderNode("BlurEffect");
            HardwareRenderer hardwareRenderer = new HardwareRenderer();
            hardwareRenderer.setSurface(imageReaderNewInstance.getSurface());
            hardwareRenderer.setContentRoot(renderNode);
            renderNode.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
            float f10 = i4;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR));
            renderNode.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            renderNode.endRecording();
            hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
            Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
            HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
            Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            hardwareBuffer.close();
            imageAcquireNextImage.close();
            imageReaderNewInstance.close();
            renderNode.discardDisplayList();
            hardwareRenderer.destroy();
            return bitmapWrapHardwareBuffer;
        } catch (Throwable th2) {
            ko.fkw("BlurUtils", "gaussianBlur error: " + th2.getMessage());
            return ouw(bitmap, i4);
        }
    }
}
