package org.xbill.DNS;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class Generator {
    private long current;
    public final int dclass;
    public long end;
    public final String namePattern;
    public final Name origin;
    public final String rdataPattern;
    public long start;
    public long step;
    public final long ttl;
    public final int type;

    public Generator(long j10, long j11, long j12, String str, int i10, int i11, long j13, String str2, Name name) {
        if (j10 < 0 || j11 < 0 || j10 > j11 || j12 <= 0) {
            throw new IllegalArgumentException("invalid range specification");
        }
        if (!supportedType(i10)) {
            throw new IllegalArgumentException("unsupported type");
        }
        DClass.check(i11);
        this.start = j10;
        this.end = j11;
        this.step = j12;
        this.namePattern = str;
        this.type = i10;
        this.dclass = i11;
        this.ttl = j13;
        this.rdataPattern = str2;
        this.origin = name;
        this.current = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if (r3 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        if (r5 != ',') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        r3 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        if (r3 >= r0.length) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r5 = (char) (r0[r3] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a7, code lost:
    
        if (r5 == ',') goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        if (r5 != '}') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        if (r5 < r2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b0, code lost:
    
        if (r5 > '9') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        r5 = (char) (r5 - '0');
        r9 = (r9 * 10) + r5;
        r8 = r3;
        r2 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        throw new org.xbill.DNS.TextParseException("invalid width");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        if (r5 != ',') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d1, code lost:
    
        if (r8 == r0.length) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        r2 = (char) (r0[r8] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
    
        if (r2 != 'o') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
    
        r22 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00de, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e2, code lost:
    
        if (r2 != 'x') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e4, code lost:
    
        r22 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e9, code lost:
    
        if (r2 != 'X') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00eb, code lost:
    
        r2 = true;
        r22 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f2, code lost:
    
        if (r2 != 'd') goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fa, code lost:
    
        throw new org.xbill.DNS.TextParseException("invalid base");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0100, code lost:
    
        throw new org.xbill.DNS.TextParseException("invalid base");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        r3 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0104, code lost:
    
        if (r3 == r0.length) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0108, code lost:
    
        if (r0[r3] != 125) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0112, code lost:
    
        throw new org.xbill.DNS.TextParseException("invalid modifiers");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String substitute(java.lang.String r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.Generator.substitute(java.lang.String, long):java.lang.String");
    }

    public static boolean supportedType(int i10) {
        Type.check(i10);
        return i10 == 12 || i10 == 5 || i10 == 39 || i10 == 1 || i10 == 28 || i10 == 2;
    }

    public Record[] expand() throws IOException {
        ArrayList arrayList = new ArrayList();
        long j10 = this.start;
        while (j10 < this.end) {
            arrayList.add(Record.fromString(Name.fromString(substitute(this.namePattern, this.current), this.origin), this.type, this.dclass, this.ttl, substitute(this.rdataPattern, this.current), this.origin));
            j10 += this.step;
        }
        return (Record[]) arrayList.toArray(new Record[arrayList.size()]);
    }

    public Record nextRecord() throws IOException {
        long j10 = this.current;
        if (j10 > this.end) {
            return null;
        }
        Name nameFromString = Name.fromString(substitute(this.namePattern, j10), this.origin);
        String strSubstitute = substitute(this.rdataPattern, this.current);
        this.current += this.step;
        return Record.fromString(nameFromString, this.type, this.dclass, this.ttl, strSubstitute, this.origin);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("$GENERATE ");
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.start);
        stringBuffer2.append("-");
        stringBuffer2.append(this.end);
        stringBuffer.append(stringBuffer2.toString());
        if (this.step > 1) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("/");
            stringBuffer3.append(this.step);
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append(" ");
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(this.namePattern);
        stringBuffer4.append(" ");
        stringBuffer.append(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append(this.ttl);
        stringBuffer5.append(" ");
        stringBuffer.append(stringBuffer5.toString());
        if (this.dclass != 1 || !Options.check("noPrintIN")) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(DClass.string(this.dclass));
            stringBuffer6.append(" ");
            stringBuffer.append(stringBuffer6.toString());
        }
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append(Type.string(this.type));
        stringBuffer7.append(" ");
        stringBuffer.append(stringBuffer7.toString());
        StringBuffer stringBuffer8 = new StringBuffer();
        stringBuffer8.append(this.rdataPattern);
        stringBuffer8.append(" ");
        stringBuffer.append(stringBuffer8.toString());
        return stringBuffer.toString();
    }
}
