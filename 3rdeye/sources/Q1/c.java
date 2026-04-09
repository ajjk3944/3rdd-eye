package Q1;

import Q1.f;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes.dex */
public final class c extends f.e {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10865d = new ArrayList(3);

    @Override // Q1.f.e
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.f10865d.iterator();
            while (it.hasNext()) {
                ((f.e) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e4) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
        }
    }

    @Override // Q1.f.e
    public final void onPageScrolled(int i, float f10, int i10) {
        try {
            Iterator it = this.f10865d.iterator();
            while (it.hasNext()) {
                ((f.e) it.next()).onPageScrolled(i, f10, i10);
            }
        } catch (ConcurrentModificationException e4) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
        }
    }

    @Override // Q1.f.e
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.f10865d.iterator();
            while (it.hasNext()) {
                ((f.e) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e4) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
        }
    }
}
