package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class me0 implements Cloneable {
    public static final i80 k = k80.d(me0.class);
    public l00 f;
    public List[] g;
    public int h;
    public a01 i;
    public a01 j;

    public me0(l00 l00Var) {
        this.g = new List[4];
        this.f = l00Var;
    }

    public static void a(kn0 kn0Var, List list, ArrayList arrayList) {
        int type = kn0Var.getType();
        if (type == 2 || type == 3 || type == 4 || type == 7 || type == 15 || type == 33 || type == 35 || type == 36) {
            for (tn0 tn0Var : kn0Var.f(false)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kn0 kn0Var2 = (kn0) it.next();
                    if (kn0Var2.e().f.equals(tn0Var.f()) && h(kn0Var2.getType(), 3)) {
                        arrayList.add(kn0Var2);
                    }
                }
            }
        }
    }

    public static boolean h(int i, int i2) {
        k31.a(i);
        tt0.a.d(i2);
        if (i2 == 2 ? i == 6 || i == 2 || i == 43 || i == 47 || i == 50 : i2 == 3 && (i == 1 || i == 28)) {
            return true;
        }
        return !Boolean.parseBoolean(System.getProperty("dnsjava.harden_unknown_additional", "true"));
    }

    public static ArrayList k(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kn0 kn0Var = (kn0) obj;
            arrayList2.addAll(kn0Var.f(false));
            arrayList2.addAll(Collections.unmodifiableList(kn0Var.g));
        }
        return arrayList2;
    }

    public final void b(tn0 tn0Var, int i) {
        List[] listArr = this.g;
        if (listArr[i] == null) {
            listArr[i] = new LinkedList();
        }
        int[] iArr = this.f.h;
        int i2 = iArr[i];
        if (i2 == 65535) {
            throw new IllegalStateException("DNS section count cannot be incremented");
        }
        iArr[i] = i2 + 1;
        this.g[i].add(tn0Var);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final me0 clone() {
        me0 me0Var = (me0) super.clone();
        me0Var.g = new List[this.g.length];
        int i = 0;
        while (true) {
            List[] listArr = this.g;
            if (i >= listArr.length) {
                break;
            }
            if (listArr[i] != null) {
                me0Var.g[i] = new LinkedList(this.g[i]);
            }
            i++;
        }
        me0Var.f = this.f.clone();
        a01 a01Var = this.j;
        if (a01Var != null) {
            me0Var.j = (a01) a01Var.d();
        }
        a01 a01Var2 = this.i;
        if (a01Var2 != null) {
            me0Var.i = (a01) a01Var2.d();
        }
        return me0Var;
    }

    public final ki0 d() {
        tt0.a.d(3);
        List list = this.g[3];
        for (tn0 tn0Var : list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list)) {
            if (tn0Var instanceof ki0) {
                return (ki0) tn0Var;
            }
        }
        return null;
    }

    public final tn0 e() {
        List list = this.g[0];
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (tn0) list.get(0);
    }

    public final int f() {
        int i = this.f.g & 15;
        ki0 ki0VarD = d();
        return ki0VarD != null ? i + (((int) (ki0VarD.i >>> 24)) << 4) : i;
    }

    public final List g(int i) {
        tt0.a.d(i);
        if (this.g[i] == null) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        for (tn0 tn0Var : this.g[i]) {
            int size = linkedList.size() - 1;
            while (true) {
                if (size < 0) {
                    linkedList.add(new kn0(tn0Var));
                    break;
                }
                kn0 kn0Var = (kn0) linkedList.get(size);
                if (tn0Var.h() != kn0Var.getType() || tn0Var.h != kn0Var.e().h || !tn0Var.f.equals(kn0Var.e().f)) {
                    size--;
                } else if (tn0Var instanceof jn0) {
                    kn0Var.c((jn0) tn0Var, kn0Var.g);
                } else {
                    kn0Var.c(tn0Var, kn0Var.f);
                }
            }
        }
        return linkedList;
    }

    public final void i(String str, kn0 kn0Var, gg0 gg0Var, me0 me0Var) {
        gg0 gg0Var2 = kn0Var.e().f;
        int i = kn0Var.e().h;
        xl xlVar = yl.a;
        String strE = xlVar.e(i);
        int type = kn0Var.getType();
        bs0 bs0Var = k31.a;
        k.e(str, gg0Var2, strE, bs0Var.e(type), gg0Var, xlVar.e(me0Var.e().h), bs0Var.e(me0Var.e().g), Integer.valueOf(this.f.f));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.me0 j(defpackage.me0 r28) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me0.j(me0):me0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r13 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r10 == 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        defpackage.l00.a(r18);
        r8 = r8 | 512;
        r4 = r6 + 4;
        r20.n(r19.f.h[r10] - r13, (r10 * 2) + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (r10 >= 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        r20.n(0, (r10 * 2) + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        if (r10 != 3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        r11 = r19.f.h[r10] - r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(defpackage.t3 r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me0.l(t3):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ki0 ki0VarD = d();
        if (ki0VarD != null) {
            sb.append(this.f.f(f()));
            sb.append("\n\n;; OPT PSEUDOSECTION: \n; EDNS: version: ");
            sb.append((int) ((ki0VarD.i >>> 16) & 255));
            sb.append("; flags: ");
            for (int i = 0; i < 16; i++) {
                int i2 = 1 << (15 - i);
                if ((((int) (ki0VarD.i & 65535)) & i2) != 0) {
                    sb.append(qt.a.e(i2));
                    sb.append(" ");
                }
            }
            sb.append("; udp: ");
            sb.append(ki0VarD.h);
            ArrayList arrayList = ki0VarD.k;
            if (arrayList != null) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    cr crVar = (cr) obj;
                    sb.append("\n; ");
                    sb.append(br.a.e(crVar.f));
                    sb.append(": ");
                    sb.append(crVar.b());
                }
            }
            sb.append('\n');
        } else {
            sb.append(this.f);
            sb.append('\n');
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if (this.f.d() != 5) {
                sb.append(";; ");
                tt0.a.d(i4);
                sb.append(tt0.b[i4]);
                sb.append(":\n");
            } else {
                sb.append(";; ");
                tt0.a.d(i4);
                sb.append(tt0.c[i4]);
                sb.append(":\n");
            }
            if (i4 <= 3) {
                tt0.a.d(i4);
                List list = this.g[i4];
                for (tn0 tn0Var : list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list)) {
                    if (i4 == 0) {
                        sb.append(";;\t");
                        sb.append(tn0Var.f);
                        sb.append(", type = ");
                        sb.append(k31.a.e(tn0Var.g));
                        sb.append(", class = ");
                        sb.append(yl.a.e(tn0Var.h));
                    } else if (!(tn0Var instanceof ki0)) {
                        sb.append(tn0Var);
                    }
                    sb.append("\n");
                }
            }
            sb.append("\n");
        }
        sb.append(";; Message size: ");
        return ex0.i(sb, this.h, " bytes");
    }

    public me0() {
        this(new l00(l00.i.nextInt(65535)));
    }

    public me0(byte[] bArr) throws t91 {
        cm cmVar = new cm(bArr);
        ByteBuffer byteBuffer = (ByteBuffer) cmVar.j;
        l00 l00Var = new l00(cmVar.f());
        l00Var.g = cmVar.f();
        int i = 0;
        while (true) {
            int[] iArr = l00Var.h;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = cmVar.f();
            i++;
        }
        this(l00Var);
        boolean z = l00Var.d() == 5;
        boolean zC = l00.c(this.f.g, 6);
        for (int i2 = 0; i2 < 4; i2++) {
            try {
                int i3 = this.f.h[i2];
                if (i3 > 0) {
                    this.g[i2] = new ArrayList(i3);
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    byteBuffer.position();
                    tn0 tn0VarE = tn0.e(cmVar, i2, z);
                    this.g[i2].add(tn0VarE);
                    if (i2 == 3) {
                        int i5 = tn0VarE.g;
                        if (i5 == 250 && i4 != i3 - 1) {
                            throw new t91("TSIG is not the last record in the message");
                        }
                        if (i5 == 24) {
                        }
                    }
                }
            } catch (t91 e) {
                if (!zC) {
                    throw e;
                }
            }
        }
        this.h = byteBuffer.position() - cmVar.f;
    }
}
