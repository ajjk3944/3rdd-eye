package v3;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import androidx.recyclerview.widget.g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final wd.b f35800a;

    /* renamed from: b, reason: collision with root package name */
    public static final g2 f35801b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f35802c;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    static {
        /*
            java.lang.String r0 = "TypefaceCompat static init"
            java.lang.String r0 = com.google.android.gms.internal.measurement.z3.w(r0)
            android.os.Trace.beginSection(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L17
            v3.k r0 = new v3.k
            r0.<init>()
            v3.e.f35800a = r0
            goto L5b
        L17:
            r1 = 29
            if (r0 < r1) goto L23
            v3.j r0 = new v3.j
            r0.<init>()
            v3.e.f35800a = r0
            goto L5b
        L23:
            r1 = 28
            if (r0 < r1) goto L2f
            v3.i r0 = new v3.i
            r0.<init>()
            v3.e.f35800a = r0
            goto L5b
        L2f:
            r1 = 26
            if (r0 < r1) goto L3b
            v3.h r0 = new v3.h
            r0.<init>()
            v3.e.f35800a = r0
            goto L5b
        L3b:
            r1 = 24
            if (r0 < r1) goto L54
            java.lang.reflect.Method r0 = v3.g.f35810d
            if (r0 != 0) goto L4a
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L4a:
            if (r0 == 0) goto L54
            v3.g r0 = new v3.g
            r0.<init>()
            v3.e.f35800a = r0
            goto L5b
        L54:
            v3.f r0 = new v3.f
            r0.<init>()
            v3.e.f35800a = r0
        L5b:
            androidx.recyclerview.widget.g2 r0 = new androidx.recyclerview.widget.g2
            r1 = 16
            r0.<init>(r1)
            v3.e.f35801b = r0
            r0 = 0
            v3.e.f35802c = r0
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.e.<clinit>():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e7, code lost:
    
        r7 = r12.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, u3.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, u3.b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.e.a(android.content.Context, u3.d, android.content.res.Resources, int, java.lang.String, int, int, u3.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i4, String str, int i10, int i11) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i10 + '-' + i4 + '-' + i11;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f35802c == null) {
            f35802c = new Paint();
        }
        f35802c.setTextSize(10.0f);
        f35802c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f35802c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
