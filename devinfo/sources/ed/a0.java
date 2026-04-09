package ed;

import android.text.TextUtils;
import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ui.i0;
import ui.j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23256a;

    /* renamed from: b, reason: collision with root package name */
    public int f23257b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23258c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f23259d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f23260e;

    /* renamed from: f, reason: collision with root package name */
    public Object f23261f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f23262h;

    /* renamed from: i, reason: collision with root package name */
    public Object f23263i;

    public a0(o oVar) {
        this.f23256a = 0;
        d();
        a(StateSet.WILD_CARD, oVar);
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 <= str.length()) {
            int iE0 = vk.i.E0(str, '&', i4, 4);
            if (iE0 == -1) {
                iE0 = str.length();
            }
            int iE02 = vk.i.E0(str, '=', i4, 4);
            if (iE02 == -1 || iE02 > iE0) {
                String strSubstring = str.substring(i4, iE0);
                nk.k.d(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i4, iE02);
                nk.k.d(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iE02 + 1, iE0);
                nk.k.d(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i4 = iE0 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ed.o[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, o oVar) {
        int i4 = this.f23257b;
        if (i4 == 0 || iArr.length == 0) {
            this.f23258c = oVar;
        }
        int[][] iArr2 = (int[][]) this.f23259d;
        if (i4 >= iArr2.length) {
            int i10 = i4 + 10;
            ?? r32 = new int[i10][];
            System.arraycopy(iArr2, 0, r32, 0, i4);
            this.f23259d = r32;
            ?? r12 = new o[i10];
            System.arraycopy((o[]) this.f23260e, 0, r12, 0, i4);
            this.f23260e = r12;
        }
        int[][] iArr3 = (int[][]) this.f23259d;
        int i11 = this.f23257b;
        iArr3[i11] = iArr;
        ((o[]) this.f23260e)[i11] = oVar;
        this.f23257b = i11 + 1;
    }

    public rl.n b() {
        ArrayList arrayList;
        String str = (String) this.f23258c;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strD = gm.a.d(0, 0, 7, (String) this.f23259d);
        String strD2 = gm.a.d(0, 0, 7, (String) this.f23260e);
        String str2 = (String) this.f23261f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iC = c();
        ArrayList arrayList2 = (ArrayList) this.g;
        ArrayList arrayList3 = new ArrayList(zj.o.T(arrayList2, 10));
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            arrayList3.add(gm.a.d(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = (ArrayList) this.f23262h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(zj.o.T(arrayList4, 10));
            int size2 = arrayList4.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList4.get(i10);
                i10++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? gm.a.d(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f23263i;
        return new rl.n(str, strD, strD2, str2, iC, arrayList3, arrayList, str4 != null ? gm.a.d(0, 0, 7, str4) : null, toString());
    }

    public int c() {
        int i4 = this.f23257b;
        if (i4 != -1) {
            return i4;
        }
        String str = (String) this.f23258c;
        nk.k.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ed.o[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void d() {
        this.f23258c = new o();
        this.f23259d = new int[10][];
        this.f23260e = new o[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(rl.n r18, java.lang.String r19) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.a0.e(rl.n, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.a0.toString():java.lang.String");
    }

    public a0(o.e eVar) {
        this.f23256a = 2;
        this.f23263i = new ArrayList();
        int i4 = 0;
        ui.y yVar = (ui.y) eVar.o(0);
        if (yVar != null) {
            this.f23258c = yVar.f35479a;
            this.f23259d = yVar.f35480b;
            this.f23260e = yVar.f35492p;
            this.f23257b = yVar.f35485h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(yVar.f35482d);
            sb2.append("(");
            this.f23261f = je.u.s(yVar.f35483e, ")", sb2);
            this.f23262h = yVar.f35495s;
            this.g = yVar.f35498v;
        }
        j0 j0Var = (j0) eVar.o(9);
        if (j0Var != null) {
            ArrayList arrayList = j0Var.f35396b;
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                i0 i0Var = (i0) obj;
                if (i0Var != null && !TextUtils.isEmpty(i0Var.f35392c)) {
                    String str = i0Var.f35392c;
                    List list = ti.e.f34667a;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str) && !str.contains("normal")) {
                        ((ArrayList) this.f23263i).add(i0Var);
                    }
                }
            }
        }
    }

    public a0(int i4) {
        this.f23256a = i4;
        switch (i4) {
            case 1:
                this.f23259d = "";
                this.f23260e = "";
                this.f23257b = -1;
                this.g = cm.g.v("");
                break;
        }
    }
}
