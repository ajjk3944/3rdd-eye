package J;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends com.bumptech.glide.e {
    public static Font B(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iD = D(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int iD2 = D(fontStyle, font2.getStyle());
            if (iD2 < iD) {
                font = font2;
                iD = iD2;
            }
        }
        return font;
    }

    public static FontFamily C(O.i[] iVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (O.i iVar : iVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(iVar.f3052a, "r", null);
            } catch (IOException e6) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.f3054c).setSlant(iVar.f3055d ? 1 : 0).setTtcIndex(iVar.f3053b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int D(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // com.bumptech.glide.e
    public final Typeface d(Context context, I.f fVar, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (I.g gVar : fVar.f1853a) {
                try {
                    Font fontBuild = new Font.Builder(resources, gVar.f1859f).setWeight(gVar.f1855b).setSlant(gVar.f1856c ? 1 : 0).setTtcIndex(gVar.f1858e).setFontVariationSettings(gVar.f1857d).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(B(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // com.bumptech.glide.e
    public final Typeface e(Context context, O.i[] iVarArr, int i) {
        try {
            FontFamily fontFamilyC = C(iVarArr, context.getContentResolver());
            if (fontFamilyC == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyC).setStyle(B(fontFamilyC, i).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // com.bumptech.glide.e
    public final Typeface f(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyC = C((O.i[]) list.get(0), contentResolver);
            if (fontFamilyC == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyC);
            for (int i3 = 1; i3 < list.size(); i3++) {
                FontFamily fontFamilyC2 = C((O.i[]) list.get(i3), contentResolver);
                if (fontFamilyC2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyC2);
                }
            }
            return customFallbackBuilder.setStyle(B(fontFamilyC, i).getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // com.bumptech.glide.e
    public final Typeface g(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.bumptech.glide.e
    public final Typeface h(Context context, Resources resources, int i, String str, int i3) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e6) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e6);
            return null;
        }
    }

    @Override // com.bumptech.glide.e
    public final O.i j(O.i[] iVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
