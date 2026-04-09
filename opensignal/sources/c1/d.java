package c1;

import a8.f;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import ar.k;
import br.l;
import br.n;
import br.w;
import e1.p;
import x1.x1;
import x1.y1;

/* loaded from: classes.dex */
public final class d extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3123d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3124g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3125r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3126x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(p pVar, f fVar, k kVar) {
        super(1);
        this.f3123d = 1;
        this.f3124g = pVar;
        this.f3125r = fVar;
        this.f3126x = (n) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [ar.k, br.n] */
    @Override // ar.k
    public final Object a(Object obj) {
        boolean zBooleanValue;
        switch (this.f3123d) {
            case 0:
                y1 y1Var = (y1) obj;
                e eVar = (e) y1Var;
                if (!((a) x1.k.s((e) this.f3125r).getDragAndDropManager()).f3120b.contains(eVar) || !se.b.c(eVar, vc.e.w((b9.e) this.f3126x))) {
                    return x1.ContinueTraversal;
                }
                ((w) this.f3124g).f2917a = y1Var;
                return x1.CancelTraversal;
            case 1:
                p pVar = (p) obj;
                if (l.a(pVar, (p) this.f3124g)) {
                    zBooleanValue = false;
                } else {
                    if (l.a(pVar, (p) ((f) this.f3125r).f197c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((n) this.f3126x).a(pVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                return Long.valueOf(((ContentProviderClient) obj) != null ? r5.update((Uri) this.f3124g, (ContentValues) this.f3125r, "id=?", (String[]) this.f3126x) : 0L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f3123d = i10;
        this.f3124g = obj;
        this.f3125r = obj2;
        this.f3126x = obj3;
    }
}
