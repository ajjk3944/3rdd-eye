package R0;

import S0.i;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3377a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3378b;

    public c() {
        this.f3377a = 1;
        this.f3378b = new ArrayList(3);
    }

    @Override // S0.i
    public final void a(int i) {
        switch (this.f3377a) {
            case 0:
                ((d) this.f3378b).b(false);
                return;
            default:
                try {
                    ArrayList arrayList = (ArrayList) this.f3378b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((i) obj).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e6) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e6);
                }
        }
    }

    @Override // S0.i
    public void b(int i, float f2, int i3) {
        switch (this.f3377a) {
            case 1:
                try {
                    ArrayList arrayList = (ArrayList) this.f3378b;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        ((i) obj).b(i, f2, i3);
                    }
                    return;
                } catch (ConcurrentModificationException e6) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e6);
                }
            default:
                return;
        }
    }

    @Override // S0.i
    public final void c(int i) {
        switch (this.f3377a) {
            case 0:
                ((d) this.f3378b).b(false);
                return;
            default:
                try {
                    ArrayList arrayList = (ArrayList) this.f3378b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((i) obj).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e6) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e6);
                }
        }
    }

    public c(d dVar) {
        this.f3377a = 0;
        this.f3378b = dVar;
    }
}
