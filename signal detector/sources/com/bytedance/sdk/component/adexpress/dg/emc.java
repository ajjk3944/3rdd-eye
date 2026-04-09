package com.bytedance.sdk.component.adexpress.dg;

import U4.s;
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
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class emc {
    public static Bitmap emc(Context context, Bitmap bitmap, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            return com.bytedance.sdk.component.adexpress.dg.dg() == 0 ? ypw(context, bitmapCreateScaledBitmap, i) : com.bytedance.sdk.component.adexpress.dg.dg() == 1 ? emc(bitmapCreateScaledBitmap, i) : ypw(bitmapCreateScaledBitmap, i);
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

    public static Bitmap emc(Bitmap bitmap, int i) {
        int i3;
        int i6;
        int i7 = i;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i8 = width * height;
            int[] iArr = new int[i8];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = iArr;
            int i9 = width - 1;
            int i10 = height - 1;
            int i11 = i7 + i7;
            int i12 = i11 + 1;
            char c6 = 2;
            int i13 = (i11 + 2) >> 1;
            int i14 = i13 * i13;
            int[] iArr3 = new int[Math.max(width, height)];
            int i15 = i14 * 256;
            int[] iArr4 = new int[i15];
            int[] iArr5 = new int[i8];
            int[] iArr6 = new int[i8];
            int[] iArr7 = new int[i8];
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                iArr4[i17] = i17 / i14;
            }
            int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i12, 3);
            int i18 = i7 + 1;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i19 < height) {
                char c7 = c6;
                int i22 = -i7;
                int i23 = i16;
                int i24 = i23;
                int i25 = i24;
                int i26 = i25;
                int i27 = i26;
                int i28 = i27;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                while (i22 <= i7) {
                    int[] iArr9 = iArr2;
                    int[][] iArr10 = iArr8;
                    int i32 = iArr9[i20 + Math.min(i9, Math.max(i22, i16))];
                    int[] iArr11 = iArr10[i22 + i7];
                    iArr11[0] = (i32 & 16711680) >> 16;
                    iArr11[1] = (i32 & 65280) >> 8;
                    iArr11[c7] = i32 & 255;
                    int iAbs = i18 - Math.abs(i22);
                    int i33 = iArr11[0];
                    i23 = (i33 * iAbs) + i23;
                    int i34 = iArr11[1];
                    i24 = (i34 * iAbs) + i24;
                    int i35 = iArr11[c7];
                    i25 = (iAbs * i35) + i25;
                    if (i22 <= 0) {
                        i27 += i33;
                        i29 += i34;
                        i31 += i35;
                    } else {
                        i26 += i33;
                        i28 += i34;
                        i30 += i35;
                    }
                    i22++;
                    iArr2 = iArr9;
                    iArr8 = iArr10;
                    i16 = 0;
                }
                int[] iArr12 = iArr2;
                int[][] iArr13 = iArr8;
                int i36 = i7;
                int i37 = 0;
                while (i37 < width) {
                    iArr5[i20] = iArr4[i23];
                    iArr6[i20] = iArr4[i24];
                    iArr7[i20] = iArr4[i25];
                    int[] iArr14 = iArr13[((i36 - i7) + i12) % i12];
                    int i38 = i23 - i27;
                    int i39 = i24 - i29;
                    int i40 = i25 - i31;
                    int i41 = i27 - iArr14[0];
                    int i42 = i29 - iArr14[1];
                    int i43 = i31 - iArr14[c7];
                    if (i19 == 0) {
                        i6 = i37;
                        iArr3[i6] = Math.min(i37 + i7 + 1, i9);
                    } else {
                        i6 = i37;
                    }
                    int i44 = iArr12[i21 + iArr3[i6]];
                    int i45 = (i44 & 16711680) >> 16;
                    iArr14[0] = i45;
                    int i46 = (i44 & 65280) >> 8;
                    iArr14[1] = i46;
                    int i47 = i44 & 255;
                    iArr14[c7] = i47;
                    int i48 = i26 + i45;
                    int i49 = i28 + i46;
                    int i50 = i30 + i47;
                    i36 = (i36 + 1) % i12;
                    int[] iArr15 = iArr13[i36 % i12];
                    i23 = i38 + i48;
                    i24 = i39 + i49;
                    i25 = i40 + i50;
                    int i51 = iArr15[0];
                    i26 = i48 - i51;
                    int i52 = iArr15[1];
                    i28 = i49 - i52;
                    int i53 = iArr15[c7];
                    i30 = i50 - i53;
                    i27 = i41 + i51;
                    i29 = i42 + i52;
                    i31 = i43 + i53;
                    i20++;
                    i37 = i6 + 1;
                }
                i21 += width;
                i19++;
                c6 = c7;
                iArr2 = iArr12;
                iArr8 = iArr13;
                i16 = 0;
            }
            int[] iArr16 = iArr2;
            int[][] iArr17 = iArr8;
            char c8 = c6;
            int i54 = 0;
            while (i54 < width) {
                int i55 = -i7;
                int i56 = i55 * width;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                int i60 = 0;
                int i61 = 0;
                int i62 = 0;
                int i63 = 0;
                int i64 = 0;
                int i65 = 0;
                while (i55 <= i7) {
                    int[] iArr18 = iArr17[i55 + i7];
                    int iMax = Math.max(0, i56) + i54;
                    int iAbs2 = i18 - Math.abs(i55);
                    int i66 = iArr5[iMax];
                    i57 = (i66 * iAbs2) + i57;
                    i58 = (iArr6[iMax] * iAbs2) + i58;
                    i59 = (iArr7[iMax] * iAbs2) + i59;
                    iArr18[0] = i66;
                    int i67 = iArr6[iMax];
                    iArr18[1] = i67;
                    int i68 = iArr7[iMax];
                    iArr18[c8] = i68;
                    if (i55 <= 0) {
                        i61 += i66;
                        i63 += i67;
                        i65 += i68;
                    } else {
                        i60 += i66;
                        i62 += i67;
                        i64 += i68;
                    }
                    if (i55 < i10) {
                        i56 += width;
                    }
                    i55++;
                    i7 = i;
                }
                int i69 = i;
                int i70 = i54;
                int i71 = 0;
                while (i71 < height) {
                    iArr16[i70] = (iArr16[i70] & (-16777216)) | (iArr4[i57] << 16) | (iArr4[i58] << 8) | iArr4[i59];
                    int[] iArr19 = iArr17[((i69 - i) + i12) % i12];
                    int i72 = i57 - i61;
                    int i73 = i58 - i63;
                    int i74 = i59 - i65;
                    int i75 = i61 - iArr19[0];
                    int i76 = i63 - iArr19[1];
                    int i77 = i65 - iArr19[c8];
                    if (i54 == 0) {
                        i3 = i71;
                        iArr3[i3] = Math.min(i3 + i18, i10) * width;
                    } else {
                        i3 = i71;
                    }
                    int i78 = iArr3[i3] + i54;
                    int i79 = iArr5[i78];
                    iArr19[0] = i79;
                    int i80 = iArr6[i78];
                    iArr19[1] = i80;
                    int i81 = iArr7[i78];
                    iArr19[c8] = i81;
                    int i82 = i60 + i79;
                    int i83 = i62 + i80;
                    int i84 = i64 + i81;
                    i57 = i72 + i82;
                    i58 = i73 + i83;
                    i59 = i74 + i84;
                    i69 = (i69 + 1) % i12;
                    int[] iArr20 = iArr17[i69];
                    int i85 = iArr20[0];
                    i60 = i82 - i85;
                    int i86 = iArr20[1];
                    i62 = i83 - i86;
                    int i87 = iArr20[c8];
                    i64 = i84 - i87;
                    i61 = i75 + i85;
                    i63 = i76 + i86;
                    i65 = i77 + i87;
                    i70 += width;
                    i71 = i3 + 1;
                }
                i54++;
                i7 = i;
            }
            bitmap.setPixels(iArr16, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static Bitmap ypw(Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                s.n();
                RenderNode renderNodeH = s.h();
                s.B();
                HardwareRenderer hardwareRendererF = s.f();
                hardwareRendererF.setSurface(imageReaderNewInstance.getSurface());
                hardwareRendererF.setContentRoot(renderNodeH);
                renderNodeH.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
                float f2 = i;
                Shader.TileMode tileMode = Shader.TileMode.MIRROR;
                renderNodeH.setRenderEffect(RenderEffect.createBlurEffect(f2, f2, Shader.TileMode.MIRROR));
                renderNodeH.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                renderNodeH.endRecording();
                hardwareRendererF.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                hardwareBuffer.close();
                imageAcquireNextImage.close();
                imageReaderNewInstance.close();
                renderNodeH.discardDisplayList();
                hardwareRendererF.destroy();
                return bitmapWrapHardwareBuffer;
            }
            return emc(bitmap, i);
        } catch (Throwable th) {
            th.getMessage();
            return emc(bitmap, i);
        }
    }
}
