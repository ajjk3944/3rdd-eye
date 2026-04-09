package ja;

import ca.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import qb.v;

/* loaded from: classes.dex */
public final class l implements ca.k, u {

    /* renamed from: i, reason: collision with root package name */
    public int f13497i;
    public long j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public fb.f f13498l;

    /* renamed from: n, reason: collision with root package name */
    public int f13500n;

    /* renamed from: o, reason: collision with root package name */
    public int f13501o;

    /* renamed from: p, reason: collision with root package name */
    public int f13502p;

    /* renamed from: q, reason: collision with root package name */
    public ca.m f13503q;

    /* renamed from: r, reason: collision with root package name */
    public k[] f13504r;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f13505s;

    /* renamed from: t, reason: collision with root package name */
    public int f13506t;

    /* renamed from: u, reason: collision with root package name */
    public long f13507u;

    /* renamed from: v, reason: collision with root package name */
    public int f13508v;

    /* renamed from: h, reason: collision with root package name */
    public int f13496h = 0;

    /* renamed from: f, reason: collision with root package name */
    public final o f13494f = new o();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13495g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final fb.f f13492d = new fb.f(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f13493e = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    public final fb.f f13489a = new fb.f(qb.b.f20760c);

    /* renamed from: b, reason: collision with root package name */
    public final fb.f f13490b = new fb.f(4);

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f13491c = new fb.f();

    /* renamed from: m, reason: collision with root package name */
    public int f13499m = -1;

    public l(int i10) {
    }

    @Override // ca.u
    public final boolean b() {
        return true;
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        this.f13493e.clear();
        this.k = 0;
        this.f13499m = -1;
        this.f13500n = 0;
        this.f13501o = 0;
        this.f13502p = 0;
        if (j == 0) {
            if (this.f13496h != 3) {
                this.f13496h = 0;
                this.k = 0;
                return;
            } else {
                o oVar = this.f13494f;
                oVar.f13514a.clear();
                oVar.f13515b = 0;
                this.f13495g.clear();
                return;
            }
        }
        k[] kVarArr = this.f13504r;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                t tVar = kVar.f13486b;
                int iE = v.e(tVar.f13553f, j7, false);
                while (true) {
                    if (iE < 0) {
                        iE = -1;
                        break;
                    } else if ((tVar.f13554g[iE] & 1) != 0) {
                        break;
                    } else {
                        iE--;
                    }
                }
                if (iE == -1) {
                    iE = tVar.a(j7);
                }
                kVar.f13488d = iE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3 A[EDGE_INSN: B:73:0x00e3->B:65:0x00e3 BREAK  A[LOOP:1: B:32:0x0070->B:64:0x00de], SYNTHETIC] */
    @Override // ca.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ca.t d(long r21) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.l.d(long):ca.t");
    }

    @Override // ca.u
    public final long e() {
        return this.f13507u;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:376:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r38, ca.n r39) throws com.google.android.exoplayer2.y0 {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.l.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(ca.l lVar) {
        return p.c(lVar, false, false);
    }

    @Override // ca.k
    public final void h(ca.m mVar) {
        this.f13503q = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
    
        if (r14 >= r10) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        r20 = r7.d();
        r30 = r0;
        r0 = r7.d();
        r31 = r4;
        r7.z(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01cf, code lost:
    
        if (r0 != 1835360622) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d1, code lost:
    
        r13 = r7.l(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01db, code lost:
    
        if (r0 != 1851878757) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01dd, code lost:
    
        r15 = r7.l(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e7, code lost:
    
        if (r0 != 1684108385) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e9, code lost:
    
        r8 = r14;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ec, code lost:
    
        r7.z(r20 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f1, code lost:
    
        r0 = r30;
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f6, code lost:
    
        r30 = r0;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fa, code lost:
    
        if (r13 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fc, code lost:
    
        if (r15 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ff, code lost:
    
        if (r8 != (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0202, code lost:
    
        r7.y(r8);
        r7.z(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0215, code lost:
    
        r9 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r13, r15, r7.l(r9 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0217, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0218, code lost:
    
        r7.y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021d, code lost:
    
        r30 = r0;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0223, code lost:
    
        r0 = 16777215 & r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x022a, code lost:
    
        if (r0 != 6516084) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022c, code lost:
    
        r9 = ja.j.a(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0234, code lost:
    
        if (r0 == 7233901) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0239, code lost:
    
        if (r0 != 7631467) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0240, code lost:
    
        if (r0 == 6516589) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0245, code lost:
    
        if (r0 != 7828084) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024c, code lost:
    
        if (r0 != 6578553) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x024e, code lost:
    
        r9 = ja.j.d(r8, r7, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0258, code lost:
    
        if (r0 != 4280916) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x025a, code lost:
    
        r9 = ja.j.d(r8, r7, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0264, code lost:
    
        if (r0 != 7630703) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0266, code lost:
    
        r9 = ja.j.d(r8, r7, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0270, code lost:
    
        if (r0 != 6384738) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0272, code lost:
    
        r9 = ja.j.d(r8, r7, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x027c, code lost:
    
        if (r0 != 7108978) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x027e, code lost:
    
        r9 = ja.j.d(r8, r7, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0288, code lost:
    
        if (r0 != 6776174) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x028a, code lost:
    
        r9 = ja.j.d(r8, r7, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0292, code lost:
    
        if (r0 != 6779504) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0294, code lost:
    
        r9 = ja.j.d(r8, r7, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029c, code lost:
    
        r4 = java.lang.String.valueOf(c5.a.c(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02aa, code lost:
    
        if (r4.length() == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ac, code lost:
    
        "Skipped unknown metadata entry: ".concat(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02af, code lost:
    
        r7.y(r10);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b4, code lost:
    
        r9 = ja.j.d(r8, r7, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02bc, code lost:
    
        r9 = ja.j.d(r8, r7, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c4, code lost:
    
        if (r9 == null) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02c6, code lost:
    
        r3.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c9, code lost:
    
        r9 = r27;
        r0 = r30;
        r4 = r31;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02d6, code lost:
    
        r7.y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02d9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02da, code lost:
    
        r30 = r0;
        r27 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02e2, code lost:
    
        if (r3.isEmpty() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02e4, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02e8, code lost:
    
        r20 = new com.google.android.exoplayer2.metadata.Metadata(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r7.y(r4);
        r4 = r4 + r10;
        r7.z(r9);
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r8 = r7.f8801b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r8 >= r4) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        r10 = r7.d() + r8;
        r8 = r7.d();
        r27 = r9;
        r9 = (r8 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r9 == 169) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        if (r9 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        r30 = r0;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r8 != 1735291493) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        r8 = ja.j.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        if (r8 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        r9 = ja.j.f13484a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if (r8 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        r8 = r9[r8 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        r9 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", r14, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dd, code lost:
    
        io.sentry.android.core.e0.p("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r7.y(r10);
        r30 = r0;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        if (r8 != 1684632427) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f3, code lost:
    
        r9 = ja.j.c(r8, r7, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r8 != 1953655662) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
    
        r9 = ja.j.c(r8, r7, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
    
        if (r8 != 1953329263) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        r9 = ja.j.e(r8, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (r8 != 1668311404) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        r9 = ja.j.e(r8, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        if (r8 != 1668249202) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
    
        r9 = ja.j.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0131, code lost:
    
        if (r8 != 1631670868) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        r9 = ja.j.d(r8, r7, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:
    
        if (r8 != 1936682605) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013f, code lost:
    
        r9 = ja.j.d(r8, r7, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0149, code lost:
    
        if (r8 != 1936679276) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014b, code lost:
    
        r9 = ja.j.d(r8, r7, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
    
        if (r8 != 1936679282) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0157, code lost:
    
        r9 = ja.j.d(r8, r7, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0161, code lost:
    
        if (r8 != 1936679265) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0163, code lost:
    
        r9 = ja.j.d(r8, r7, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016e, code lost:
    
        if (r8 != 1936679791) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0170, code lost:
    
        r9 = ja.j.d(r8, r7, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017b, code lost:
    
        if (r8 != 1920233063) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017d, code lost:
    
        r9 = ja.j.e(r8, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0189, code lost:
    
        if (r8 != 1885823344) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018b, code lost:
    
        r9 = ja.j.e(r8, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0198, code lost:
    
        if (r8 != 1936683886) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019a, code lost:
    
        r9 = ja.j.d(r8, r7, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r8 != 1953919848) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        r9 = ja.j.d(r8, r7, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b2, code lost:
    
        if (r8 != 757935405) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b4, code lost:
    
        r13 = r14;
        r15 = r13;
        r8 = -1;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        r14 = r7.f8801b;
     */
    /* JADX WARN: Removed duplicated region for block: B:236:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0560 A[PHI: r0
  0x0560: PHI (r0v16 com.google.android.exoplayer2.metadata.Metadata) = 
  (r0v4 com.google.android.exoplayer2.metadata.Metadata)
  (r0v4 com.google.android.exoplayer2.metadata.Metadata)
  (r0v11 com.google.android.exoplayer2.metadata.Metadata)
  (r0v4 com.google.android.exoplayer2.metadata.Metadata)
 binds: [B:271:0x0564, B:272:0x0566, B:373:0x0560, B:267:0x0559] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0618 A[LOOP:12: B:304:0x0615->B:306:0x0618, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05ca A[EDGE_INSN: B:370:0x05ca->B:294:0x05ca BREAK  A[LOOP:10: B:284:0x0597->B:293:0x05c5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r33) {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.l.i(long):void");
    }

    @Override // ca.k
    public final void release() {
    }
}
