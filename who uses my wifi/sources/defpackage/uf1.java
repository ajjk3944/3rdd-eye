package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uf1 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final void a(wn1 wn1Var) throws NumberFormatException {
        sn3 sn3VarA = wn1Var.a(th1.class, tf1.h);
        int i = sn3VarA.i;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zB = b(((th1) sn3VarA.get(i3)).d);
            i3++;
            if (zB) {
                return;
            }
        }
        sn3 sn3VarA2 = wn1Var.a(yh1.class, tf1.g);
        int i4 = sn3VarA2.i;
        while (i2 < i4) {
            boolean zB2 = b(((yh1) sn3VarA2.get(i2)).d);
            i2++;
            if (zB2) {
                return;
            }
        }
    }

    public final boolean b(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = v23.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
