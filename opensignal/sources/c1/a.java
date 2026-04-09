package c1;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import br.t;
import g4.j;
import u.f;
import x1.k;
import x1.x1;
import x1.z0;
import z0.l;

/* loaded from: classes.dex */
public final class a implements View.OnDragListener, b {

    /* renamed from: a, reason: collision with root package name */
    public final e f3119a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3120b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f3121c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        e eVar = new e();
        eVar.f3129r = 0L;
        this.f3119a = eVar;
        this.f3120b = new f(0);
        this.f3121c = new z0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            @Override // x1.z0
            public final l d() {
                return this.f1120a.f3119a;
            }

            @Override // x1.z0
            public final /* bridge */ /* synthetic */ void e(l lVar) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f1120a.f3119a.hashCode();
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        b9.e eVar = new b9.e(7, dragEvent);
        int action = dragEvent.getAction();
        f fVar = this.f3120b;
        e eVar2 = this.f3119a;
        switch (action) {
            case 1:
                t tVar = new t();
                as.d dVar = new as.d(eVar, eVar2, tVar);
                if (dVar.a(eVar2) == x1.ContinueTraversal) {
                    k.u(eVar2, dVar);
                }
                boolean z10 = tVar.f2914a;
                fVar.getClass();
                u.a aVar = new u.a(fVar);
                while (aVar.hasNext()) {
                    ((e) aVar.next()).g0(eVar);
                }
                break;
            case 2:
                eVar2.f0(eVar);
                break;
            case 4:
                as.d dVar2 = new as.d(5, eVar);
                if (dVar2.a(eVar2) == x1.ContinueTraversal) {
                    k.u(eVar2, dVar2);
                }
                fVar.clear();
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                eVar2.d0(eVar);
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                eVar2.e0(eVar);
                break;
        }
        return false;
    }
}
