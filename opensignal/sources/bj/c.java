package bj;

import a5.b0;
import a5.u;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bc.f0;
import br.l;
import dj.i;
import ds.e;
import gt.j;
import h7.n1;
import h7.q0;
import h7.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import ma.a0;
import ma.d0;
import ma.g0;
import mu.d;
import rr.m;
import rr.r0;
import u3.i0;
import w6.q;
import xr.c0;
import z7.g;

/* loaded from: classes.dex */
public class c implements e, a0, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2793a;

    /* renamed from: d, reason: collision with root package name */
    public int f2794d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2795g;

    /* renamed from: r, reason: collision with root package name */
    public Object f2796r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f2797x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2798y;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2793a = i11;
        this.f2795g = obj;
        this.f2796r = obj2;
        this.f2797x = obj3;
        this.f2798y = obj4;
        this.f2794d = i10;
    }

    public static /* synthetic */ void u(c cVar, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = cVar.f2794d;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        cVar.t(str, i10, str2);
        throw null;
    }

    public View A(int i10) {
        return ((RecyclerView) ((b9.c) this.f2795g).f2478d).getChildAt(i10);
    }

    public int B() {
        return ((RecyclerView) ((b9.c) this.f2795g).f2478d).getChildCount();
    }

    public void C(View view) {
        ((ArrayList) this.f2797x).add(view);
        b9.c cVar = (b9.c) this.f2795g;
        n1 n1VarM = RecyclerView.M(view);
        if (n1VarM != null) {
            View view2 = n1VarM.f10155a;
            RecyclerView recyclerView = (RecyclerView) cVar.f2478d;
            int i10 = n1VarM.f10169q;
            if (i10 != -1) {
                n1VarM.f10168p = i10;
            } else {
                WeakHashMap weakHashMap = i0.f23177a;
                n1VarM.f10168p = view2.getImportantForAccessibility();
            }
            if (recyclerView.R()) {
                n1VarM.f10169q = 4;
                recyclerView.Q0.add(n1VarM);
            } else {
                WeakHashMap weakHashMap2 = i0.f23177a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public String D(String str) {
        l.e(str, "keyToMatch");
        int i10 = this.f2794d;
        try {
            if (l() == 6 && l.a(F(), str)) {
                this.f2796r = null;
                if (l() == 5) {
                    return F();
                }
            }
            return null;
        } finally {
            this.f2794d = i10;
            this.f2796r = null;
        }
    }

    public byte E() {
        String str = (String) this.f2798y;
        int i10 = this.f2794d;
        while (true) {
            int iG = G(i10);
            if (iG == -1) {
                this.f2794d = iG;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iG);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f2794d = iG;
                return mu.l.g(cCharAt);
            }
            i10 = iG + 1;
        }
    }

    public String F() {
        if (E() != 1) {
            return null;
        }
        String strP = p();
        this.f2796r = strP;
        return strP;
    }

    public int G(int i10) {
        if (i10 < ((String) this.f2798y).length()) {
            return i10;
        }
        return -1;
    }

    public int H() {
        char cCharAt;
        int i10 = this.f2794d;
        if (i10 == -1) {
            return i10;
        }
        String str = (String) this.f2798y;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f2794d = i10;
        return i10;
    }

    public boolean I() {
        int iH = H();
        String str = (String) this.f2798y;
        if (iH >= str.length() || iH == -1 || str.charAt(iH) != ',') {
            return false;
        }
        this.f2794d++;
        return true;
    }

    public void J(char c4) {
        int i10 = this.f2794d;
        if (i10 > 0 && c4 == '\"') {
            try {
                this.f2794d = i10 - 1;
                String strQ = q();
                this.f2794d = i10;
                if (l.a(strQ, "null")) {
                    t("Expected string literal but 'null' literal was found", this.f2794d - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f2794d = i10;
                throw th2;
            }
        }
        v(mu.l.g(c4), true);
        throw null;
    }

    public void K(View view) {
        if (((ArrayList) this.f2797x).remove(view)) {
            b9.c cVar = (b9.c) this.f2795g;
            n1 n1VarM = RecyclerView.M(view);
            if (n1VarM != null) {
                RecyclerView recyclerView = (RecyclerView) cVar.f2478d;
                int i10 = n1VarM.f10168p;
                if (recyclerView.R()) {
                    n1VarM.f10169q = i10;
                    recyclerView.Q0.add(n1VarM);
                } else {
                    View view2 = n1VarM.f10155a;
                    WeakHashMap weakHashMap = i0.f23177a;
                    view2.setImportantForAccessibility(i10);
                }
                n1VarM.f10168p = 0;
            }
        }
    }

    @Override // ds.e
    public r0 a(c0 c0Var) {
        l.e(c0Var, "javaTypeParameter");
        es.i0 i0Var = (es.i0) ((j) this.f2798y).a(c0Var);
        return i0Var != null ? i0Var : ((e) ((cj.a) this.f2795g).f3975g).a(c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    @Override // w6.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(a5.v r37) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.c.b(a5.v):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    @Override // ma.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(fb.f r37) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.c.c(fb.f):void");
    }

    public void e(View view, int i10, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((b9.c) this.f2795g).f2478d;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : z(i10);
        ((i) this.f2796r).D(childCount, z10);
        if (z10) {
            C(view);
        }
        recyclerView.addView(view, childCount);
        n1 n1VarM = RecyclerView.M(view);
        q0 q0Var = recyclerView.I;
        if (q0Var != null && n1VarM != null) {
            q0Var.n(n1VarM);
        }
        ArrayList arrayList = recyclerView.f2058b0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((g) recyclerView.f2058b0.get(size)).getClass();
                z0 z0Var = (z0) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) z0Var).width != -1 || ((ViewGroup.MarginLayoutParams) z0Var).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public int f(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            ((StringBuilder) this.f2797x).append((char) (w(charSequence, i10 + 3) + (w(charSequence, i10) << 12) + (w(charSequence, i10 + 1) << 8) + (w(charSequence, i10 + 2) << 4)));
            return i11;
        }
        this.f2794d = i10;
        if (i11 < charSequence.length()) {
            return f(charSequence, this.f2794d);
        }
        u(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void h(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        RecyclerView recyclerView = (RecyclerView) ((b9.c) this.f2795g).f2478d;
        int childCount = i10 < 0 ? recyclerView.getChildCount() : z(i10);
        ((i) this.f2796r).D(childCount, z10);
        if (z10) {
            C(view);
        }
        n1 n1VarM = RecyclerView.M(view);
        if (n1VarM != null) {
            if (!n1VarM.j() && !n1VarM.o()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(n1VarM);
                throw new IllegalArgumentException(h0.b.j(recyclerView, sb2));
            }
            if (RecyclerView.X0) {
                n1VarM.toString();
            }
            n1VarM.j &= -257;
        } else if (RecyclerView.W0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(childCount);
            throw new IllegalArgumentException(h0.b.j(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public boolean i() {
        int i10 = this.f2794d;
        if (i10 == -1) {
            return false;
        }
        String str = (String) this.f2798y;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f2794d = i10;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i10++;
        }
        this.f2794d = i10;
        return false;
    }

    public void j(int i10, String str) {
        String str2 = (String) this.f2798y;
        if (str2.length() - i10 < str.length()) {
            u(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (str2.charAt(i10 + i11) | ' ')) {
                u(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f2794d = str.length() + i10;
    }

    public String k() {
        StringBuilder sb2 = (StringBuilder) this.f2797x;
        String str = (String) this.f2798y;
        n('\"');
        int i10 = this.f2794d;
        int iA0 = tt.l.A0(str, '\"', i10, 4);
        if (iA0 == -1) {
            q();
            v((byte) 1, false);
            throw null;
        }
        int i11 = i10;
        while (i11 < iA0) {
            if (str.charAt(i11) == '\\') {
                int iG = this.f2794d;
                char cCharAt = str.charAt(i11);
                boolean z10 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb2.append((CharSequence) str, iG, i11);
                        int iG2 = G(i11 + 1);
                        if (iG2 == -1) {
                            u(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iF = iG2 + 1;
                        char cCharAt2 = str.charAt(iG2);
                        if (cCharAt2 == 'u') {
                            iF = f(str, iF);
                        } else {
                            char c4 = cCharAt2 < 'u' ? d.f17010a[cCharAt2] : (char) 0;
                            if (c4 == 0) {
                                u(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb2.append(c4);
                        }
                        iG = G(iF);
                        if (iG == -1) {
                            u(this, "Unexpected EOF", iG, null, 4);
                            throw null;
                        }
                    } else {
                        i11++;
                        if (i11 >= str.length()) {
                            sb2.append((CharSequence) str, iG, i11);
                            iG = G(i11);
                            if (iG == -1) {
                                u(this, "Unexpected EOF", iG, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i11);
                        }
                    }
                    i11 = iG;
                    z10 = true;
                    cCharAt = str.charAt(i11);
                }
                String string = !z10 ? str.subSequence(iG, i11).toString() : r(iG, i11);
                this.f2794d = i11 + 1;
                return string;
            }
            i11++;
        }
        this.f2794d = iA0 + 1;
        String strSubstring = str.substring(i10, iA0);
        l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public byte l() {
        String str = (String) this.f2798y;
        int i10 = this.f2794d;
        while (i10 != -1 && i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f2794d = i11;
                return mu.l.g(cCharAt);
            }
            i10 = i11;
        }
        this.f2794d = str.length();
        return (byte) 10;
    }

    public byte m(byte b2) {
        byte bL = l();
        if (bL == b2) {
            return bL;
        }
        v(b2, true);
        throw null;
    }

    public void n(char c4) {
        int i10 = this.f2794d;
        if (i10 == -1) {
            J(c4);
            throw null;
        }
        String str = (String) this.f2798y;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f2794d = i11;
                if (cCharAt == c4) {
                    return;
                }
                J(c4);
                throw null;
            }
            i10 = i11;
        }
        this.f2794d = -1;
        J(c4);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0182, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0188, code lost:
    
        throw new bf.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0191, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0194, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0195, code lost:
    
        u(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019b, code lost:
    
        u(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        u(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
    
        u(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        u(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        r21.f2794d = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013c, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0146, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        u(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        u(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long o() {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.c.o():long");
    }

    public String p() {
        String str = (String) this.f2796r;
        if (str == null) {
            return k();
        }
        l.b(str);
        this.f2796r = null;
        return str;
    }

    public String q() {
        String str = (String) this.f2798y;
        String str2 = (String) this.f2796r;
        if (str2 != null) {
            l.b(str2);
            this.f2796r = null;
            return str2;
        }
        int iH = H();
        if (iH >= str.length() || iH == -1) {
            u(this, "EOF", iH, null, 4);
            throw null;
        }
        byte bG = mu.l.g(str.charAt(iH));
        if (bG == 1) {
            return p();
        }
        if (bG != 0) {
            u(this, "Expected beginning of the string, but got " + str.charAt(iH), 0, null, 6);
            throw null;
        }
        boolean z10 = false;
        while (mu.l.g(str.charAt(iH)) == 0) {
            iH++;
            if (iH >= str.length()) {
                ((StringBuilder) this.f2797x).append((CharSequence) str, this.f2794d, iH);
                int iG = G(iH);
                if (iG == -1) {
                    this.f2794d = iH;
                    return r(0, 0);
                }
                iH = iG;
                z10 = true;
            }
        }
        String string = !z10 ? str.subSequence(this.f2794d, iH).toString() : r(this.f2794d, iH);
        this.f2794d = iH;
        return string;
    }

    public String r(int i10, int i11) {
        StringBuilder sb2 = (StringBuilder) this.f2797x;
        sb2.append((CharSequence) this.f2798y, i10, i11);
        String string = sb2.toString();
        l.d(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void s(int i10) {
        int iZ = z(i10);
        ((i) this.f2796r).E(iZ);
        RecyclerView recyclerView = (RecyclerView) ((b9.c) this.f2795g).f2478d;
        View childAt = recyclerView.getChildAt(iZ);
        if (childAt != null) {
            n1 n1VarM = RecyclerView.M(childAt);
            if (n1VarM != null) {
                if (n1VarM.j() && !n1VarM.o()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(n1VarM);
                    throw new IllegalArgumentException(h0.b.j(recyclerView, sb2));
                }
                if (RecyclerView.X0) {
                    n1VarM.toString();
                }
                n1VarM.a(256);
            }
        } else if (RecyclerView.W0) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(iZ);
            throw new IllegalArgumentException(h0.b.j(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(iZ);
    }

    public void t(String str, int i10, String str2) {
        l.e(str, "message");
        l.e(str2, "hint");
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbL = w.g.l(str, " at path: ");
        sbL.append(((f0) this.f2795g).g());
        sbL.append(strConcat);
        throw mu.l.d(i10, (String) this.f2798y, sbL.toString());
    }

    public String toString() {
        switch (this.f2793a) {
            case 2:
                return ((i) this.f2796r).toString() + ", hidden list:" + ((ArrayList) this.f2797x).size();
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.f2798y);
                sb2.append("', currentPosition=");
                return c7.a.q(sb2, this.f2794d, ')');
            default:
                return super.toString();
        }
    }

    public void v(byte b2, boolean z10) {
        String str = (String) this.f2798y;
        String strQ = mu.l.q(b2);
        int i10 = z10 ? this.f2794d - 1 : this.f2794d;
        u(this, "Expected " + strQ + ", but had '" + ((this.f2794d == str.length() || i10 < 0) ? "EOF" : String.valueOf(str.charAt(i10))) + "' instead", i10, null, 4);
        throw null;
    }

    public int w(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        u(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public View x(int i10) {
        return ((RecyclerView) ((b9.c) this.f2795g).f2478d).getChildAt(z(i10));
    }

    public int y() {
        return ((RecyclerView) ((b9.c) this.f2795g).f2478d).getChildCount() - ((ArrayList) this.f2797x).size();
    }

    public int z(int i10) {
        i iVar = (i) this.f2796r;
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((b9.c) this.f2795g).f2478d).getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            int iA = i10 - (i11 - iVar.A(i11));
            if (iA == 0) {
                while (iVar.C(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iA;
        }
        return -1;
    }

    public c(cj.a aVar, m mVar, hs.e eVar, int i10) {
        this.f2793a = 1;
        l.e(aVar, "c");
        l.e(eVar, "typeParameterOwner");
        this.f2795g = aVar;
        this.f2796r = mVar;
        this.f2794d = i10;
        ArrayList typeParameters = eVar.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        this.f2797x = linkedHashMap;
        this.f2798y = ((gt.l) ((ds.a) ((cj.a) this.f2795g).f3974d).f7446a).c(new as.d(9, this));
    }

    public c(b9.c cVar) {
        this.f2793a = 2;
        this.f2794d = 0;
        this.f2795g = cVar;
        this.f2796r = new i();
        this.f2797x = new ArrayList();
    }

    public c(String str) {
        this.f2793a = 5;
        l.e(str, "source");
        f0 f0Var = new f0(5, (byte) 0);
        f0Var.f2603g = new Object[8];
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        f0Var.f2604r = iArr;
        f0Var.f2602d = -1;
        this.f2795g = f0Var;
        this.f2797x = new StringBuilder();
        this.f2798y = str;
    }

    public c(d0 d0Var, int i10) {
        this.f2793a = 4;
        this.f2798y = d0Var;
        this.f2795g = new u(new byte[5], 5, 3, (byte) 0);
        this.f2796r = new SparseArray();
        this.f2797x = new SparseIntArray();
        this.f2794d = i10;
    }

    public c(w6.u uVar, int i10) {
        this.f2793a = 6;
        this.f2798y = uVar;
        this.f2795g = new u(new byte[5], 5, 0, (byte) 0);
        this.f2796r = new SparseArray();
        this.f2797x = new SparseIntArray();
        this.f2794d = i10;
    }

    @Override // ma.a0
    public void d(qb.u uVar, ca.m mVar, g0 g0Var) {
    }

    @Override // w6.q
    public void g(b0 b0Var, u5.m mVar, g0 g0Var) {
    }
}
