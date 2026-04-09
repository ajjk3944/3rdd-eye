package com.bytedance.sdk.component.adexpress.dg;

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
import e3.i;
import e3.j;
import e3.k;
import e3.m;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class emc {
    public static Bitmap emc(Context context, Bitmap bitmap, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            return com.bytedance.sdk.component.adexpress.dg.dg() == 0 ? ypw(context, bitmapCreateScaledBitmap, i10) : com.bytedance.sdk.component.adexpress.dg.dg() == 1 ? emc(bitmapCreateScaledBitmap, i10) : ypw(bitmapCreateScaledBitmap, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap ypw(android.content.Context r4, android.graphics.Bitmap r5, int r6) {
        /*
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5)     // Catch: java.lang.Throwable -> L6e
            android.renderscript.RenderScript r4 = android.renderscript.RenderScript.create(r4)     // Catch: java.lang.Throwable -> L6e
            if (r4 != 0) goto L22
            com.bytedance.sdk.component.adexpress.emc.emc.emc r5 = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc()     // Catch: java.lang.Throwable -> L1b
            com.bytedance.sdk.component.adexpress.emc.emc.xq r5 = r5.xq()     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L1d
            if (r4 == 0) goto L1d
            android.renderscript.RenderScript.releaseAllContexts()     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r4 = move-exception
            goto L1e
        L1d:
            return r0
        L1e:
            r4.getMessage()
            return r0
        L22:
            android.renderscript.Element r2 = android.renderscript.Element.U8_4(r4)     // Catch: java.lang.Throwable -> L69
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r4, r2)     // Catch: java.lang.Throwable -> L69
            android.renderscript.Allocation r5 = android.renderscript.Allocation.createFromBitmap(r4, r5)     // Catch: java.lang.Throwable -> L65
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r4, r1)     // Catch: java.lang.Throwable -> L62
            float r6 = (float) r6
            r2.setRadius(r6)     // Catch: java.lang.Throwable -> L60
            r2.setInput(r5)     // Catch: java.lang.Throwable -> L60
            r2.forEach(r3)     // Catch: java.lang.Throwable -> L60
            r3.copyTo(r1)     // Catch: java.lang.Throwable -> L60
            com.bytedance.sdk.component.adexpress.emc.emc.emc r4 = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc()     // Catch: java.lang.Throwable -> L52
            com.bytedance.sdk.component.adexpress.emc.emc.xq r4 = r4.xq()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L5e
            android.renderscript.RenderScript.releaseAllContexts()     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L54
            r5.destroy()     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r4 = move-exception
            goto L5b
        L54:
            r3.destroy()     // Catch: java.lang.Throwable -> L52
            r2.destroy()     // Catch: java.lang.Throwable -> L52
            goto L5e
        L5b:
            r4.getMessage()
        L5e:
            r0 = r1
            goto L9a
        L60:
            r6 = move-exception
            goto L72
        L62:
            r6 = move-exception
            r3 = r0
            goto L72
        L65:
            r6 = move-exception
            r5 = r0
            r3 = r5
            goto L72
        L69:
            r6 = move-exception
            r5 = r0
        L6b:
            r2 = r5
            r3 = r2
            goto L72
        L6e:
            r6 = move-exception
            r4 = r0
            r5 = r4
            goto L6b
        L72:
            r6.getMessage()     // Catch: java.lang.Throwable -> L9b
            com.bytedance.sdk.component.adexpress.emc.emc.emc r6 = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc()     // Catch: java.lang.Throwable -> L85
            com.bytedance.sdk.component.adexpress.emc.emc.xq r6 = r6.xq()     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L9a
            if (r4 == 0) goto L87
            android.renderscript.RenderScript.releaseAllContexts()     // Catch: java.lang.Throwable -> L85
            goto L87
        L85:
            r4 = move-exception
            goto L97
        L87:
            if (r5 == 0) goto L8c
            r5.destroy()     // Catch: java.lang.Throwable -> L85
        L8c:
            if (r3 == 0) goto L91
            r3.destroy()     // Catch: java.lang.Throwable -> L85
        L91:
            if (r2 == 0) goto L9a
            r2.destroy()     // Catch: java.lang.Throwable -> L85
            goto L9a
        L97:
            r4.getMessage()
        L9a:
            return r0
        L9b:
            r6 = move-exception
            com.bytedance.sdk.component.adexpress.emc.emc.emc r0 = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc()     // Catch: java.lang.Throwable -> Lac
            com.bytedance.sdk.component.adexpress.emc.emc.xq r0 = r0.xq()     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto Lc1
            if (r4 == 0) goto Lae
            android.renderscript.RenderScript.releaseAllContexts()     // Catch: java.lang.Throwable -> Lac
            goto Lae
        Lac:
            r4 = move-exception
            goto Lbe
        Lae:
            if (r5 == 0) goto Lb3
            r5.destroy()     // Catch: java.lang.Throwable -> Lac
        Lb3:
            if (r3 == 0) goto Lb8
            r3.destroy()     // Catch: java.lang.Throwable -> Lac
        Lb8:
            if (r2 == 0) goto Lc1
            r2.destroy()     // Catch: java.lang.Throwable -> Lac
            goto Lc1
        Lbe:
            r4.getMessage()
        Lc1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dg.emc.ypw(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static Bitmap emc(Bitmap bitmap, int i10) {
        int i11;
        int i12;
        int i13 = i10;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i14 = width * height;
            int[] iArr = new int[i14];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = iArr;
            int i15 = width - 1;
            int i16 = height - 1;
            int i17 = i13 + i13;
            int i18 = i17 + 1;
            char c10 = 2;
            int i19 = (i17 + 2) >> 1;
            int i20 = i19 * i19;
            int[] iArr3 = new int[Math.max(width, height)];
            int i21 = i20 * 256;
            int[] iArr4 = new int[i21];
            int[] iArr5 = new int[i14];
            int[] iArr6 = new int[i14];
            int[] iArr7 = new int[i14];
            int i22 = 0;
            for (int i23 = 0; i23 < i21; i23++) {
                iArr4[i23] = i23 / i20;
            }
            int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i18, 3);
            int i24 = i13 + 1;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i25 < height) {
                char c11 = c10;
                int i28 = -i13;
                int i29 = i22;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                int i33 = i32;
                int i34 = i33;
                int i35 = i34;
                int i36 = i35;
                int i37 = i36;
                while (i28 <= i13) {
                    int[] iArr9 = iArr2;
                    int[][] iArr10 = iArr8;
                    int i38 = iArr9[i26 + Math.min(i15, Math.max(i28, i22))];
                    int[] iArr11 = iArr10[i28 + i13];
                    iArr11[0] = (i38 & 16711680) >> 16;
                    iArr11[1] = (i38 & 65280) >> 8;
                    iArr11[c11] = i38 & 255;
                    int iAbs = i24 - Math.abs(i28);
                    int i39 = iArr11[0];
                    i29 += i39 * iAbs;
                    int i40 = iArr11[1];
                    i30 += i40 * iAbs;
                    int i41 = iArr11[c11];
                    i31 += iAbs * i41;
                    if (i28 <= 0) {
                        i33 += i39;
                        i35 += i40;
                        i37 += i41;
                    } else {
                        i32 += i39;
                        i34 += i40;
                        i36 += i41;
                    }
                    i28++;
                    iArr2 = iArr9;
                    iArr8 = iArr10;
                    i22 = 0;
                }
                int[] iArr12 = iArr2;
                int[][] iArr13 = iArr8;
                int i42 = i13;
                int i43 = 0;
                while (i43 < width) {
                    iArr5[i26] = iArr4[i29];
                    iArr6[i26] = iArr4[i30];
                    iArr7[i26] = iArr4[i31];
                    int[] iArr14 = iArr13[((i42 - i13) + i18) % i18];
                    int i44 = i29 - i33;
                    int i45 = i30 - i35;
                    int i46 = i31 - i37;
                    int i47 = i33 - iArr14[0];
                    int i48 = i35 - iArr14[1];
                    int i49 = i37 - iArr14[c11];
                    if (i25 == 0) {
                        i12 = i43;
                        iArr3[i12] = Math.min(i43 + i13 + 1, i15);
                    } else {
                        i12 = i43;
                    }
                    int i50 = iArr12[i27 + iArr3[i12]];
                    int i51 = (i50 & 16711680) >> 16;
                    iArr14[0] = i51;
                    int i52 = (i50 & 65280) >> 8;
                    iArr14[1] = i52;
                    int i53 = i50 & 255;
                    iArr14[c11] = i53;
                    int i54 = i32 + i51;
                    int i55 = i34 + i52;
                    int i56 = i36 + i53;
                    i42 = (i42 + 1) % i18;
                    int[] iArr15 = iArr13[i42 % i18];
                    i29 = i44 + i54;
                    i30 = i45 + i55;
                    i31 = i46 + i56;
                    int i57 = iArr15[0];
                    i32 = i54 - i57;
                    int i58 = iArr15[1];
                    i34 = i55 - i58;
                    int i59 = iArr15[c11];
                    i36 = i56 - i59;
                    i33 = i47 + i57;
                    i35 = i48 + i58;
                    i37 = i49 + i59;
                    i26++;
                    i43 = i12 + 1;
                }
                i27 += width;
                i25++;
                c10 = c11;
                iArr2 = iArr12;
                iArr8 = iArr13;
                i22 = 0;
            }
            int[] iArr16 = iArr2;
            int[][] iArr17 = iArr8;
            char c12 = c10;
            int i60 = 0;
            while (i60 < width) {
                int i61 = -i13;
                int i62 = i61 * width;
                int i63 = 0;
                int i64 = 0;
                int i65 = 0;
                int i66 = 0;
                int i67 = 0;
                int i68 = 0;
                int i69 = 0;
                int i70 = 0;
                int i71 = 0;
                while (i61 <= i13) {
                    int[] iArr18 = iArr17[i61 + i13];
                    int iMax = Math.max(0, i62) + i60;
                    int iAbs2 = i24 - Math.abs(i61);
                    int i72 = iArr5[iMax];
                    i63 += i72 * iAbs2;
                    i64 += iArr6[iMax] * iAbs2;
                    i65 += iArr7[iMax] * iAbs2;
                    iArr18[0] = i72;
                    int i73 = iArr6[iMax];
                    iArr18[1] = i73;
                    int i74 = iArr7[iMax];
                    iArr18[c12] = i74;
                    if (i61 <= 0) {
                        i67 += i72;
                        i69 += i73;
                        i71 += i74;
                    } else {
                        i66 += i72;
                        i68 += i73;
                        i70 += i74;
                    }
                    if (i61 < i16) {
                        i62 += width;
                    }
                    i61++;
                    i13 = i10;
                }
                int i75 = i10;
                int i76 = i60;
                int i77 = 0;
                while (i77 < height) {
                    iArr16[i76] = (iArr16[i76] & (-16777216)) | (iArr4[i63] << 16) | (iArr4[i64] << 8) | iArr4[i65];
                    int[] iArr19 = iArr17[((i75 - i10) + i18) % i18];
                    int i78 = i63 - i67;
                    int i79 = i64 - i69;
                    int i80 = i65 - i71;
                    int i81 = i67 - iArr19[0];
                    int i82 = i69 - iArr19[1];
                    int i83 = i71 - iArr19[c12];
                    if (i60 == 0) {
                        i11 = i77;
                        iArr3[i11] = Math.min(i11 + i24, i16) * width;
                    } else {
                        i11 = i77;
                    }
                    int i84 = iArr3[i11] + i60;
                    int i85 = iArr5[i84];
                    iArr19[0] = i85;
                    int i86 = iArr6[i84];
                    iArr19[1] = i86;
                    int i87 = iArr7[i84];
                    iArr19[c12] = i87;
                    int i88 = i66 + i85;
                    int i89 = i68 + i86;
                    int i90 = i70 + i87;
                    i63 = i78 + i88;
                    i64 = i79 + i89;
                    i65 = i80 + i90;
                    i75 = (i75 + 1) % i18;
                    int[] iArr20 = iArr17[i75];
                    int i91 = iArr20[0];
                    i66 = i88 - i91;
                    int i92 = iArr20[1];
                    i68 = i89 - i92;
                    int i93 = iArr20[c12];
                    i70 = i90 - i93;
                    i67 = i81 + i91;
                    i69 = i82 + i92;
                    i71 = i83 + i93;
                    i76 += width;
                    i77 = i11 + 1;
                }
                i60++;
                i13 = i10;
            }
            bitmap.setPixels(iArr16, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static Bitmap ypw(Bitmap bitmap, int i10) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                k.a();
                RenderNode renderNodeA = i.a("BlurEffect");
                m.a();
                HardwareRenderer hardwareRendererA = j.a();
                hardwareRendererA.setSurface(imageReaderNewInstance.getSurface());
                hardwareRendererA.setContentRoot(renderNodeA);
                renderNodeA.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
                float f10 = i10;
                renderNodeA.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR));
                renderNodeA.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                renderNodeA.endRecording();
                hardwareRendererA.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                hardwareBuffer.close();
                imageAcquireNextImage.close();
                imageReaderNewInstance.close();
                renderNodeA.discardDisplayList();
                hardwareRendererA.destroy();
                return bitmapWrapHardwareBuffer;
            }
            return emc(bitmap, i10);
        } catch (Throwable th) {
            th.getMessage();
            return emc(bitmap, i10);
        }
    }
}
