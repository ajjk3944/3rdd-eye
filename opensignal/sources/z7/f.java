package z7;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26703a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26704b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i10) {
        this.f26703a = i10;
        this.f26704b = viewPager2;
    }

    @Override // z7.i
    public void a(int i10) {
        switch (this.f26703a) {
            case 0:
                if (i10 == 0) {
                    ((ViewPager2) this.f26704b).c();
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f26704b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).a(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
        }
    }

    @Override // z7.i
    public void b(int i10, float f10, int i11) {
        switch (this.f26703a) {
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f26704b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).b(i10, f10, i11);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
            default:
                return;
        }
    }

    @Override // z7.i
    public final void c(int i10) {
        switch (this.f26703a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f26704b;
                if (viewPager2.f2152g != i10) {
                    viewPager2.f2152g = i10;
                    viewPager2.O.q0();
                    return;
                }
                return;
            case 1:
                ViewPager2 viewPager22 = (ViewPager2) this.f26704b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.E.requestFocus(2);
                    return;
                }
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f26704b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).c(i10);
                    }
                    return;
                } catch (ConcurrentModificationException e4) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e4);
                }
        }
    }

    public f() {
        this.f26703a = 2;
        this.f26704b = new ArrayList(3);
    }
}
