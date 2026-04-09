package k3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.measurement.y3;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends y3 {
    public static Font g0(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iI0 = i0(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iI02 = i0(fontStyle, font2.getStyle());
            if (iI02 < iI0) {
                font = font2;
                iI0 = iI02;
            }
        }
        return font;
    }

    public static FontFamily h0(q3.i[] iVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (q3.i iVar : iVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(iVar.f20704a, "r", null);
            } catch (IOException e4) {
                e0.q("TypefaceCompatApi29Impl", "Font load failed", e4);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.f20706c).setSlant(iVar.f20707d ? 1 : 0).setTtcIndex(iVar.f20705b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th2) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int i0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final Typeface i(Context context, j3.e eVar, Resources resources, int i10) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (j3.f fVar : eVar.f13176a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fVar.f13182f).setWeight(fVar.f13178b).setSlant(fVar.f13179c ? 1 : 0).setTtcIndex(fVar.f13181e).setFontVariationSettings(fVar.f13180d).build();
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
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(g0(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e4) {
            e0.q("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final Typeface j(Context context, q3.i[] iVarArr, int i10) {
        try {
            FontFamily fontFamilyH0 = h0(iVarArr, context.getContentResolver());
            if (fontFamilyH0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyH0).setStyle(g0(fontFamilyH0, i10).getStyle()).build();
        } catch (Exception e4) {
            e0.q("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final Typeface k(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyH0 = h0((q3.i[]) list.get(0), contentResolver);
            if (fontFamilyH0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyH0);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyH02 = h0((q3.i[]) list.get(i11), contentResolver);
                if (fontFamilyH02 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyH02);
                }
            }
            return customFallbackBuilder.setStyle(g0(fontFamilyH0, i10).getStyle()).build();
        } catch (Exception e4) {
            e0.q("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final Typeface m(Context context, Resources resources, int i10, String str, int i11) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e4) {
            e0.q("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final q3.i r(q3.i[] iVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
