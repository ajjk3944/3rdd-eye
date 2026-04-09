package ee;

import android.util.StateSet;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.l2;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8164a;

    /* renamed from: b, reason: collision with root package name */
    public int f8165b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8166c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8167d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8168e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8169f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8170g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8171h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8172i;

    public x(ou.a aVar, l2 l2Var, su.i iVar, ou.p pVar) {
        List listK;
        this.f8164a = 2;
        br.l.e(l2Var, "routeDatabase");
        br.l.e(pVar, "eventListener");
        this.f8166c = aVar;
        this.f8167d = l2Var;
        this.f8168e = iVar;
        this.f8169f = pVar;
        mq.w wVar = mq.w.f16945a;
        this.f8170g = wVar;
        this.f8171h = wVar;
        this.f8172i = new ArrayList();
        ou.t tVar = aVar.f19858h;
        pVar.p(iVar, tVar);
        URI uriG = tVar.g();
        if (uriG.getHost() == null) {
            listK = pu.b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = aVar.f19857g.select(uriG);
            listK = (listSelect == null || listSelect.isEmpty()) ? pu.b.k(Proxy.NO_PROXY) : pu.b.w(listSelect);
        }
        this.f8170g = listK;
        this.f8165b = 0;
        pVar.o(iVar, tVar, listK);
    }

    public void a(int[] iArr, l lVar) {
        int i10 = this.f8165b;
        if (i10 == 0 || iArr.length == 0) {
            this.f8166c = lVar;
        }
        int[][] iArr2 = (int[][]) this.f8167d;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            int[][] iArr3 = new int[i11][];
            System.arraycopy(iArr2, 0, iArr3, 0, i10);
            this.f8167d = iArr3;
            l[] lVarArr = new l[i11];
            System.arraycopy((l[]) this.f8168e, 0, lVarArr, 0, i10);
            this.f8168e = lVarArr;
        }
        int[][] iArr4 = (int[][]) this.f8167d;
        int i12 = this.f8165b;
        iArr4[i12] = iArr;
        ((l[]) this.f8168e)[i12] = lVar;
        this.f8165b = i12 + 1;
    }

    public ou.t b() {
        ArrayList arrayList;
        String str = (String) this.f8166c;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = ou.b.e((String) this.f8167d, 0, 0, 7);
        String strE2 = ou.b.e((String) this.f8168e, 0, 0, 7);
        String str2 = (String) this.f8169f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iC = c();
        ArrayList arrayList2 = (ArrayList) this.f8170g;
        ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(ou.b.e((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f8171h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(mq.p.a0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? ou.b.e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f8172i;
        return new ou.t(str, strE, strE2, str2, iC, arrayList3, arrayList, str4 != null ? ou.b.e(str4, 0, 0, 7) : null, toString());
    }

    public int c() {
        int i10 = this.f8165b;
        if (i10 != -1) {
            return i10;
        }
        String str = (String) this.f8166c;
        br.l.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public boolean d() {
        return this.f8165b < ((List) this.f8170g).size() || !((ArrayList) this.f8172i).isEmpty();
    }

    public void e() {
        this.f8166c = new l();
        this.f8167d = new int[10][];
        this.f8168e = new l[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(ou.t r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.x.f(ou.t, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.x.toString():java.lang.String");
    }

    public x(l lVar) {
        this.f8164a = 0;
        e();
        a(StateSet.WILD_CARD, lVar);
    }

    public x(int i10) {
        this.f8164a = i10;
        switch (i10) {
            case 1:
                this.f8167d = "";
                this.f8168e = "";
                this.f8165b = -1;
                ArrayList arrayList = new ArrayList();
                this.f8170g = arrayList;
                arrayList.add("");
                break;
        }
    }
}
