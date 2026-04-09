package r0;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class l extends C5508e {

    /* renamed from: r0, reason: collision with root package name */
    public ArrayList<C5508e> f45667r0 = new ArrayList<>();

    @Override // r0.C5508e
    public void C() {
        this.f45667r0.clear();
        super.C();
    }

    @Override // r0.C5508e
    public final void F(N5.c cVar) {
        super.F(cVar);
        int size = this.f45667r0.size();
        for (int i = 0; i < size; i++) {
            this.f45667r0.get(i).F(cVar);
        }
    }

    public void R() {
        ArrayList<C5508e> arrayList = this.f45667r0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5508e c5508e = this.f45667r0.get(i);
            if (c5508e instanceof l) {
                ((l) c5508e).R();
            }
        }
    }
}
