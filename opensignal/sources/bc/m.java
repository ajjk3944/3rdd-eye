package bc;

import androidx.recyclerview.widget.RecyclerView;
import h7.r1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2620a;

    /* renamed from: d, reason: collision with root package name */
    public final int f2621d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2622g;

    public /* synthetic */ m(int i10, int i11, Object obj) {
        this.f2620a = i11;
        this.f2621d = i10;
        this.f2622g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2620a) {
            case 0:
                ((n) this.f2622g).b(this.f2621d);
                break;
            case 1:
                ((com.google.android.material.datepicker.m) this.f2622g).D0.l0(this.f2621d);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f2622g;
                int size = arrayList.size();
                int i10 = 0;
                if (this.f2621d == 1) {
                    while (i10 < size) {
                        ((j4.f) arrayList.get(i10)).b();
                        i10++;
                    }
                    break;
                } else {
                    while (i10 < size) {
                        ((j4.f) arrayList.get(i10)).a();
                        i10++;
                    }
                    break;
                }
            case 3:
                j3.b bVar = (j3.b) ((r1) this.f2622g).f10199d;
                if (bVar != null) {
                    bVar.h(this.f2621d);
                    break;
                }
                break;
            case 4:
                ((RecyclerView) this.f2622g).l0(this.f2621d);
                break;
            default:
                ((zd.e) this.f2622g).j(this.f2621d);
                break;
        }
    }

    public m(int i10, z7.m mVar) {
        this.f2620a = 4;
        this.f2621d = i10;
        this.f2622g = mVar;
    }

    public m(List list, int i10, Throwable th2) {
        this.f2620a = 2;
        se.b.m(list, "initCallbacks cannot be null");
        this.f2622g = new ArrayList(list);
        this.f2621d = i10;
    }
}
