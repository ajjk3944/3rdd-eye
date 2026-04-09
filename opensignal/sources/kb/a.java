package kb;

import eb.c;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f14265p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f14266q = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: n, reason: collision with root package name */
    public final StringBuilder f14267n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f14268o;

    public a() {
        super(0);
        this.f14267n = new StringBuilder();
        this.f14268o = new ArrayList();
    }

    public static long n(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j7 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j10 = (Long.parseLong(strGroup3) * 1000) + j7;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j10 += Long.parseLong(strGroup4);
        }
        return j10 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0246, code lost:
    
        return new i4.b((eb.b[]) r2.toArray(new eb.b[r5]), java.util.Arrays.copyOf(r3, r6));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ac  */
    @Override // eb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final eb.e f(byte[] r30, int r31, boolean r32) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.a.f(byte[], int, boolean):eb.e");
    }
}
