package h9;

import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10443a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10444b;

    public p(df.c cVar) {
        this.f10443a = 2;
        this.f10444b = new ArrayList();
    }

    public void a(o oVar) {
        if (this.f10444b == null) {
            this.f10444b = new ArrayList();
        }
        for (int i10 = 0; i10 < this.f10444b.size(); i10++) {
            if (((o) this.f10444b.get(i10)).f10426a.f10458b > oVar.f10426a.f10458b) {
                this.f10444b.add(i10, oVar);
                return;
            }
        }
        this.f10444b.add(oVar);
    }

    public void b(p pVar) {
        if (pVar.f10444b == null) {
            return;
        }
        if (this.f10444b == null) {
            this.f10444b = new ArrayList(pVar.f10444b.size());
        }
        Iterator it = pVar.f10444b.iterator();
        while (it.hasNext()) {
            a((o) it.next());
        }
    }

    public List c() {
        List listH;
        synchronized (this.f10444b) {
            st.k kVarU = i4.u(new tj.a(this, null, 0));
            if (kVarU.hasNext()) {
                Object next = kVarU.next();
                if (kVarU.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (kVarU.hasNext()) {
                        arrayList.add(kVarU.next());
                    }
                    listH = arrayList;
                } else {
                    listH = e5.H(next);
                }
            } else {
                listH = mq.w.f16945a;
            }
        }
        return listH;
    }

    public void d() {
        synchronized (this.f10444b) {
            if (this.f10444b.size() > 10) {
                List listM0 = mq.o.m0(this.f10444b.size() - 10, this.f10444b);
                this.f10444b.clear();
                this.f10444b.addAll(listM0);
            }
        }
    }

    public String toString() {
        switch (this.f10443a) {
            case 0:
                if (this.f10444b == null) {
                    return "";
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = this.f10444b.iterator();
                while (it.hasNext()) {
                    sb2.append(((o) it.next()).toString());
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public p(int i10) {
        this.f10443a = i10;
        switch (i10) {
            case 1:
                this.f10444b = new ArrayList();
                break;
            default:
                this.f10444b = null;
                break;
        }
    }
}
