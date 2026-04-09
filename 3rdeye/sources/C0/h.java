package C0;

import B0.g;
import android.content.res.Resources;
import android.graphics.Typeface;
import m0.C5315h;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final n f808a;

    /* renamed from: b, reason: collision with root package name */
    public static final C5315h<String, Typeface> f809b;

    /* compiled from: TypefaceCompat.java */
    public static class a extends B7.d {

        /* renamed from: d, reason: collision with root package name */
        public g.e f810d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            C0.m r0 = new C0.m
            r0.<init>()
            C0.h.f808a = r0
            goto L46
        Le:
            r1 = 28
            if (r0 < r1) goto L1a
            C0.l r0 = new C0.l
            r0.<init>()
            C0.h.f808a = r0
            goto L46
        L1a:
            r1 = 26
            if (r0 < r1) goto L26
            C0.k r0 = new C0.k
            r0.<init>()
            C0.h.f808a = r0
            goto L46
        L26:
            r1 = 24
            if (r0 < r1) goto L3f
            java.lang.reflect.Method r0 = C0.j.f818c
            if (r0 != 0) goto L35
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L35:
            if (r0 == 0) goto L3f
            C0.j r0 = new C0.j
            r0.<init>()
            C0.h.f808a = r0
            goto L46
        L3f:
            C0.i r0 = new C0.i
            r0.<init>()
            C0.h.f808a = r0
        L46:
            m0.h r0 = new m0.h
            r1 = 16
            r0.<init>(r1)
            C0.h.f809b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.h.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r11, B0.e.b r12, android.content.res.Resources r13, int r14, java.lang.String r15, int r16, int r17, B0.g.e r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.h.a(android.content.Context, B0.e$b, android.content.res.Resources, int, java.lang.String, int, int, B0.g$e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i10, int i11) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i10 + '-' + i + '-' + i11;
    }
}
