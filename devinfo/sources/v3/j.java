package v3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class j extends wd.b {
    public static Font V(FontFamily fontFamily, int i4) {
        FontStyle fontStyle = new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iY = Y(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int iY2 = Y(fontStyle, font2.getStyle());
            if (iY2 < iY) {
                font = font2;
                iY = iY2;
            }
        }
        return font;
    }

    public static int Y(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily W(b4.k[] kVarArr, ContentResolver contentResolver) throws IOException {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (b4.k kVar : kVarArr) {
            if (Objects.equals(kVar.f1694a.getScheme(), "systemfont")) {
                fontBuild = X(kVar);
            } else {
                try {
                    Uri uri = kVar.f1694a;
                    str = kVar.f1698e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e2) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(kVar.f1696c).setSlant(kVar.f1697d ? 1 : 0).setTtcIndex(kVar.f1695b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font X(b4.k kVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // wd.b
    public final Typeface h(Context context, u3.e eVar, Resources resources, int i4) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (u3.f fVar : eVar.f35075a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fVar.f35081f).setWeight(fVar.f35077b).setSlant(fVar.f35078c ? 1 : 0).setTtcIndex(fVar.f35080e).setFontVariationSettings(fVar.f35079d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(V(fontFamilyBuild, i4).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // wd.b
    public final Typeface i(Context context, b4.k[] kVarArr, int i4) {
        try {
            FontFamily fontFamilyW = W(kVarArr, context.getContentResolver());
            if (fontFamilyW == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyW).setStyle(V(fontFamilyW, i4).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // wd.b
    public final Typeface j(Context context, List list, int i4) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyW = W((b4.k[]) list.get(0), contentResolver);
            if (fontFamilyW == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyW);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily fontFamilyW2 = W((b4.k[]) list.get(i10), contentResolver);
                if (fontFamilyW2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyW2);
                }
            }
            return customFallbackBuilder.setStyle(V(fontFamilyW, i4).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // wd.b
    public final Typeface k(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // wd.b
    public final Typeface l(Context context, Resources resources, int i4, String str, int i10) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // wd.b
    public final b4.k n(b4.k[] kVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
