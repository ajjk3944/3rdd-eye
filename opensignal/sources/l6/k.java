package l6;

import a5.d0;
import a5.v;
import java.util.ArrayDeque;
import java.util.ArrayList;
import u5.x;

/* loaded from: classes.dex */
public final class k implements u5.k, x {

    /* renamed from: i, reason: collision with root package name */
    public int f14836i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public v f14837l;

    /* renamed from: n, reason: collision with root package name */
    public int f14839n;

    /* renamed from: o, reason: collision with root package name */
    public int f14840o;

    /* renamed from: p, reason: collision with root package name */
    public int f14841p;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f14844s;

    /* renamed from: t, reason: collision with root package name */
    public int f14845t;

    /* renamed from: u, reason: collision with root package name */
    public long f14846u;

    /* renamed from: v, reason: collision with root package name */
    public int f14847v;

    /* renamed from: h, reason: collision with root package name */
    public int f14835h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final m f14833f = new m();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f14834g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final v f14831d = new v(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f14832e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public final v f14828a = new v(u5.b.f23265t);

    /* renamed from: b, reason: collision with root package name */
    public final v f14829b = new v(4);

    /* renamed from: c, reason: collision with root package name */
    public final v f14830c = new v();

    /* renamed from: m, reason: collision with root package name */
    public int f14838m = -1;

    /* renamed from: q, reason: collision with root package name */
    public u5.m f14842q = u5.m.A;

    /* renamed from: r, reason: collision with root package name */
    public j[] f14843r = new j[0];

    public k(int i10) {
    }

    @Override // u5.x
    public final boolean b() {
        return true;
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        this.f14832e.clear();
        this.k = 0;
        this.f14838m = -1;
        this.f14839n = 0;
        this.f14840o = 0;
        this.f14841p = 0;
        if (j == 0) {
            if (this.f14835h != 3) {
                this.f14835h = 0;
                this.k = 0;
                return;
            } else {
                m mVar = this.f14833f;
                mVar.f14852a.clear();
                mVar.f14853b = 0;
                this.f14834g.clear();
                return;
            }
        }
        for (j jVar : this.f14843r) {
            r rVar = jVar.f14824b;
            int iE = d0.e(rVar.f14890f, j7, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((rVar.f14891g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = rVar.a(j7);
            }
            jVar.f14827e = iE;
            ha.d dVar = jVar.f14826d;
            if (dVar != null) {
                dVar.f10565b = false;
                dVar.f10566c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    @Override // u5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u5.w d(long r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.d(long):u5.w");
    }

    @Override // u5.x
    public final long e() {
        return this.f14846u;
    }

    @Override // u5.k
    public final void f(u5.m mVar) {
        this.f14842q = mVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:384:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r40, ca.n r41) throws androidx.media3.common.k0 {
        /*
            Method dump skipped, instructions count: 1630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(u5.l lVar) {
        return n.c(lVar, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c1, code lost:
    
        if (r13 >= r8) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c3, code lost:
    
        r19 = r7.g();
        r29 = r0;
        r0 = r7.g();
        r30 = r4;
        r7.F(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d6, code lost:
    
        if (r0 != 1835360622) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d8, code lost:
    
        r14 = r7.p(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e2, code lost:
    
        if (r0 != 1851878757) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e4, code lost:
    
        r15 = r7.p(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ee, code lost:
    
        if (r0 != 1684108385) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f0, code lost:
    
        r9 = r13;
        r10 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01f3, code lost:
    
        r7.F(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f8, code lost:
    
        r0 = r29;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01fd, code lost:
    
        r29 = r0;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0201, code lost:
    
        if (r14 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0203, code lost:
    
        if (r15 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
    
        if (r9 != (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0209, code lost:
    
        r7.E(r9);
        r7.F(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x021c, code lost:
    
        r10 = new androidx.media3.extractor.metadata.id3.InternalFrame(r14, r15, r7.p(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021e, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x021f, code lost:
    
        r7.E(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0224, code lost:
    
        r29 = r0;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022a, code lost:
    
        r0 = 16777215 & r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0231, code lost:
    
        if (r0 != 6516084) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0233, code lost:
    
        r10 = l6.i.a(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023b, code lost:
    
        if (r0 == 7233901) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0240, code lost:
    
        if (r0 != 7631467) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0247, code lost:
    
        if (r0 == 6516589) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024c, code lost:
    
        if (r0 != 7828084) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0252, code lost:
    
        if (r0 != 6578553) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0254, code lost:
    
        r10 = l6.i.d(r9, "TDRC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025e, code lost:
    
        if (r0 != 4280916) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0260, code lost:
    
        r10 = l6.i.d(r9, "TPE1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026a, code lost:
    
        if (r0 != 7630703) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x026c, code lost:
    
        r10 = l6.i.d(r9, "TSSE", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0276, code lost:
    
        if (r0 != 6384738) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0278, code lost:
    
        r10 = l6.i.d(r9, "TALB", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0282, code lost:
    
        if (r0 != 7108978) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0284, code lost:
    
        r10 = l6.i.d(r9, "USLT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x028e, code lost:
    
        if (r0 != 6776174) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0290, code lost:
    
        r10 = l6.i.d(r9, "TCON", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0298, code lost:
    
        if (r0 != 6779504) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x029a, code lost:
    
        r10 = l6.i.d(r9, "TIT1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02a2, code lost:
    
        c5.a.d(r9);
        a5.a.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a8, code lost:
    
        r7.E(r8);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ad, code lost:
    
        r10 = l6.i.d(r9, "TCOM", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b5, code lost:
    
        r10 = l6.i.d(r9, "TIT2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02bd, code lost:
    
        if (r10 == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02bf, code lost:
    
        r3.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c2, code lost:
    
        r9 = r26;
        r0 = r29;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02ce, code lost:
    
        r7.E(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d2, code lost:
    
        r29 = r0;
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02da, code lost:
    
        if (r3.isEmpty() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02dc, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e0, code lost:
    
        r19 = new androidx.media3.common.Metadata(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        r7.E(r4);
        r4 = r4 + r10;
        r7.F(r9);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r8 = r7.f166b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r8 >= r4) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r8 = r7.g() + r8;
        r26 = r9;
        r9 = r7.g();
        r15 = (r9 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r15 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        if (r15 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        r29 = r0;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        if (r9 != 1735291493) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        r9 = l6.i.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        if (r9 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        r13 = l6.i.f14822a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if (r9 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        r9 = r13[r9 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r9 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r10 = new androidx.media3.extractor.metadata.id3.TextInformationFrame("TCON", null, oe.h0.p(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        a5.a.B("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        r7.E(r8);
        r29 = r0;
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        if (r9 != 1684632427) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
    
        r10 = l6.i.c(r9, "TPOS", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        if (r9 != 1953655662) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
    
        r10 = l6.i.c(r9, "TRCK", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        if (r9 != 1953329263) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0115, code lost:
    
        r10 = l6.i.e(r9, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
    
        if (r9 != 1668311404) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        r10 = l6.i.e(r9, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012e, code lost:
    
        if (r9 != 1668249202) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0130, code lost:
    
        r10 = l6.i.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        if (r9 != 1631670868) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013a, code lost:
    
        r10 = l6.i.d(r9, "TPE2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
    
        if (r9 != 1936682605) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        r10 = l6.i.d(r9, "TSOT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0150, code lost:
    
        if (r9 != 1936679276) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0152, code lost:
    
        r10 = l6.i.d(r9, "TSO2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015c, code lost:
    
        if (r9 != 1936679282) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015e, code lost:
    
        r10 = l6.i.d(r9, "TSOA", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0168, code lost:
    
        if (r9 != 1936679265) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016a, code lost:
    
        r10 = l6.i.d(r9, "TSOP", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0175, code lost:
    
        if (r9 != 1936679791) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0177, code lost:
    
        r10 = l6.i.d(r9, "TSOC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0182, code lost:
    
        if (r9 != 1920233063) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0184, code lost:
    
        r10 = l6.i.e(r9, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0190, code lost:
    
        if (r9 != 1885823344) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0192, code lost:
    
        r10 = l6.i.e(r9, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        if (r9 != 1936683886) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        r10 = l6.i.d(r9, "TVSHOWSORT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ac, code lost:
    
        if (r9 != 1953919848) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ae, code lost:
    
        r10 = l6.i.d(r9, "TVSHOW", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        if (r9 != 757935405) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:
    
        r14 = null;
        r15 = null;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bf, code lost:
    
        r13 = r7.f166b;
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0625 A[LOOP:12: B:304:0x0622->B:306:0x0625, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0644  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r32) {
        /*
            Method dump skipped, instructions count: 1719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.i(long):void");
    }

    @Override // u5.k
    public final void release() {
    }
}
