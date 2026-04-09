package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yz0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class ce0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f25611c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f25612a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f25613b = -1;

    public final void a(yz0 yz0Var) {
        for (int i = 0; i < yz0Var.c(); i++) {
            yz0.b bVarA = yz0Var.a(i);
            if (bVarA instanceof nq) {
                nq nqVar = (nq) bVarA;
                if ("iTunSMPB".equals(nqVar.f30973d) && a(nqVar.f30974e)) {
                    return;
                }
            } else if (bVarA instanceof dp0) {
                dp0 dp0Var = (dp0) bVarA;
                if ("com.apple.iTunes".equals(dp0Var.f26284c) && "iTunSMPB".equals(dp0Var.f26285d) && a(dp0Var.f26286e)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    private boolean a(String str) throws NumberFormatException {
        Matcher matcher = f25611c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = s82.f32899a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f25612a = i10;
            this.f25613b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
