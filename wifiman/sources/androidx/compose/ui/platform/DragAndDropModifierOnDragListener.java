package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import i0.C6052b;
import i0.C6055e;
import i0.InterfaceC6053c;
import i0.InterfaceC6054d;
import i0.InterfaceC6057g;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import o.C7011b;

/* loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements View.OnDragListener, InterfaceC6053c {

    /* renamed from: a, reason: collision with root package name */
    private final mh.q f29139a;

    /* renamed from: b, reason: collision with root package name */
    private final C6055e f29140b = new C6055e(a.f29143a);

    /* renamed from: c, reason: collision with root package name */
    private final C7011b f29141c = new C7011b(0, 1, null);

    /* renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.e f29142d = new E0.V() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // E0.V
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C6055e a() {
            return this.f29144a.f29140b;
        }

        @Override // E0.V
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(C6055e node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f29144a.f29140b.hashCode();
        }
    };

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29143a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6057g invoke(C6052b c6052b) {
            return null;
        }
    }

    public DragAndDropModifierOnDragListener(mh.q qVar) {
        this.f29139a = qVar;
    }

    @Override // i0.InterfaceC6053c
    public boolean a(InterfaceC6054d interfaceC6054d) {
        return this.f29141c.contains(interfaceC6054d);
    }

    @Override // i0.InterfaceC6053c
    public void b(InterfaceC6054d interfaceC6054d) {
        this.f29141c.add(interfaceC6054d);
    }

    public androidx.compose.ui.e d() {
        return this.f29142d;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        C6052b c6052b = new C6052b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zD2 = this.f29140b.D2(c6052b);
                Iterator<E> it = this.f29141c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6054d) it.next()).R1(c6052b);
                }
                break;
            case 2:
                this.f29140b.G0(c6052b);
                break;
            case 4:
                this.f29140b.y0(c6052b);
                break;
            case 5:
                this.f29140b.T(c6052b);
                break;
            case 6:
                this.f29140b.z1(c6052b);
                break;
        }
        return false;
    }
}
