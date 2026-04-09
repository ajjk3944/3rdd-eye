package com.apm.insight.nativecrash;

import com.apm.insight.l.j;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c {
    private static final Pattern i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f6347j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f6348k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f6349l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f6350m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a, reason: collision with root package name */
    private String f6351a;

    /* renamed from: b, reason: collision with root package name */
    private String f6352b;

    /* renamed from: c, reason: collision with root package name */
    private String f6353c;

    /* renamed from: d, reason: collision with root package name */
    private String f6354d;

    /* renamed from: e, reason: collision with root package name */
    private String f6355e;

    /* renamed from: f, reason: collision with root package name */
    private String f6356f;

    /* renamed from: g, reason: collision with root package name */
    private String f6357g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f6358h = new HashMap();

    public c(File file) {
        c(j.b(file));
    }

    public final String a() {
        return this.f6357g;
    }

    public final Map<String, String> b() {
        return this.f6358h;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f6355e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f6356f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f6357g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public final void a(File file) {
        File fileB = j.b(file);
        if (fileB.exists()) {
            fileB.renameTo(new File(fileB.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(j.b(file));
    }

    public final void b(File file) {
        c(j.b(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
    
        if (r12 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        if (r12.contains("BuildId:") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
    
        r12 = com.apm.insight.nativecrash.c.f6350m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a2, code lost:
    
        if (r12.find() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a4, code lost:
    
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b6, code lost:
    
        if (r0.equals("data") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b8, code lost:
    
        r11.f6358h.put(r1, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(java.io.File r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.c(java.io.File):void");
    }
}
