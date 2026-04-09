package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8058c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f8059a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f8060b = -1;

    public final void a(U3 u32) throws NumberFormatException {
        C1197gC c1197gCA = u32.a(C1.class, E0.f7864c);
        int i = c1197gCA.f14229d;
        int i3 = 0;
        int i6 = 0;
        while (i6 < i) {
            boolean zB = b(((C1) c1197gCA.get(i6)).f7492d);
            i6++;
            if (zB) {
                return;
            }
        }
        C1197gC c1197gCA2 = u32.a(H1.class, E0.f7863b);
        int i7 = c1197gCA2.f14229d;
        while (i3 < i7) {
            boolean zB2 = b(((H1) c1197gCA2.get(i3)).f8537d);
            i3++;
            if (zB2) {
                return;
            }
        }
    }

    public final boolean b(String str) throws NumberFormatException {
        Matcher matcher = f8058c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = Vt.f12096a;
            int i = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i3 <= 0) {
                return false;
            }
            this.f8059a = i;
            this.f8060b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
