package n7;

import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import y1.i2;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17386a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17387d;

    public /* synthetic */ a(int i10, Object obj) {
        this.f17386a = i10;
        this.f17387d = obj;
    }

    @Override // androidx.lifecycle.t
    public final void b(v vVar, m mVar) {
        switch (this.f17386a) {
            case 0:
                b bVar = (b) this.f17387d;
                if (mVar != m.ON_START) {
                    if (mVar == m.ON_STOP) {
                        bVar.f17395h = false;
                        break;
                    }
                } else {
                    bVar.f17395h = true;
                    break;
                }
                break;
            default:
                y1.a aVar = (y1.a) this.f17387d;
                if (mVar == m.ON_DESTROY) {
                    i2 i2Var = aVar.f25622g;
                    if (i2Var != null) {
                        i2Var.a();
                    }
                    aVar.f25622g = null;
                    aVar.requestLayout();
                    break;
                }
                break;
        }
    }
}
