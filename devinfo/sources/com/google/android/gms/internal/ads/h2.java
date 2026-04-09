package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h2 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11684c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f11685a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f11686b = -1;

    public final void a(v8 v8Var) throws NumberFormatException {
        u51 u51VarA = v8Var.a(d4.class, g2.f11347c);
        int i4 = u51VarA.f17098d;
        int i10 = 0;
        int i11 = 0;
        while (i11 < i4) {
            boolean zB = b(((d4) u51VarA.get(i11)).f10315d);
            i11++;
            if (zB) {
                return;
            }
        }
        u51 u51VarA2 = v8Var.a(i4.class, g2.f11346b);
        int i12 = u51VarA2.f17098d;
        while (i10 < i12) {
            boolean zB2 = b(((i4) u51VarA2.get(i10)).f12140d);
            i10++;
            if (zB2) {
                return;
            }
        }
    }

    public final boolean b(String str) throws NumberFormatException {
        Matcher matcher = f11684c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = bq0.f9768a;
            int i4 = Integer.parseInt(strGroup, 16);
            int i10 = Integer.parseInt(matcher.group(2), 16);
            if (i4 <= 0 && i10 <= 0) {
                return false;
            }
            this.f11685a = i4;
            this.f11686b = i10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
