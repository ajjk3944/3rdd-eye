package A2;

import R.a0;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import d1.C2264b;
import d4.C2267a;
import d4.RunnableC2270d;
import h0.C2351a;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148a;

    /* renamed from: b, reason: collision with root package name */
    public Object f149b;

    /* renamed from: c, reason: collision with root package name */
    public Object f150c;

    /* renamed from: d, reason: collision with root package name */
    public Object f151d;

    public /* synthetic */ C(int i) {
        this.f148a = i;
    }

    private final void a() {
        e1.h hVarH = ((WorkDatabase) this.f149b).t().h((String) this.f150c);
        if (hVarH == null || !hVarH.b()) {
            return;
        }
        synchronized (((C2264b) this.f151d).f19717d) {
            ((C2264b) this.f151d).f19720g.put((String) this.f150c, hVarH);
            ((C2264b) this.f151d).f19721h.add(hVarH);
            C2264b c2264b = (C2264b) this.f151d;
            c2264b.i.c(c2264b.f19721h);
        }
    }

    private final void b() {
        C2267a c2267a = (C2267a) this.f149b;
        ArrayList arrayList = (ArrayList) this.f150c;
        ArrayList arrayList2 = (ArrayList) this.f151d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            File file = (File) obj;
            String strQ = T2.g.Q(file);
            Uri uriFromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, c2267a.f19775b.getContentResolver().getType(uriFromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", strQ.split("\\.config\\.", 2)[0]);
            intent.putExtra("split_id", strQ);
            arrayList3.add(intent);
            arrayList4.add(T2.g.Q(file).split("\\.config\\.", 2)[0]);
        }
        a4.d dVar = (a4.d) c2267a.f19783k.get();
        if (dVar == null) {
            return;
        }
        c2267a.f19781h.execute(new RunnableC2270d(c2267a, dVar.f4683e, arrayList3, arrayList4, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0271 A[Catch: Exception -> 0x026b, TRY_LEAVE, TryCatch #2 {Exception -> 0x026b, blocks: (B:34:0x00d4, B:131:0x0271, B:128:0x026d, B:125:0x0267, B:122:0x0262, B:35:0x00e2, B:41:0x00ee, B:42:0x00f7, B:45:0x00ff, B:85:0x01b4, B:94:0x01ca, B:93:0x01c7, B:95:0x01cb, B:96:0x01d2, B:97:0x01e2, B:99:0x01e8, B:101:0x01ee, B:102:0x0202, B:104:0x0206, B:108:0x022c, B:119:0x0258, B:109:0x0233, B:113:0x023d, B:115:0x0245, B:117:0x024c, B:118:0x0252), top: B:275:0x00d4, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ae  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.C.run():void");
    }

    public /* synthetic */ C(Object obj, Object obj2, Object obj3, int i) {
        this.f148a = i;
        this.f149b = obj;
        this.f150c = obj2;
        this.f151d = obj3;
    }

    public /* synthetic */ C(Object obj, Object obj2, Object obj3, int i, boolean z6) {
        this.f148a = i;
        this.f151d = obj;
        this.f149b = obj2;
        this.f150c = obj3;
    }

    public C(View view, a0 a0Var, C2351a c2351a, ValueAnimator valueAnimator) {
        this.f148a = 5;
        this.f149b = view;
        this.f150c = c2351a;
        this.f151d = valueAnimator;
    }
}
