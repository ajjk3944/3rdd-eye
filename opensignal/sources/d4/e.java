package d4;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import lf.t1;

/* loaded from: classes.dex */
public final class e extends rq.j implements ar.k {
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6794x;

    /* renamed from: y, reason: collision with root package name */
    public int f6795y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, pq.c cVar, int i10) {
        super(1, cVar);
        this.f6794x = i10;
        this.B = obj;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        pq.c cVar = (pq.c) obj;
        switch (this.f6794x) {
            case 0:
                return new e((f4.c) this.B, cVar, 0).q(lq.b0.f15562a);
            default:
                return new e((z) this.B, cVar, 1).q(lq.b0.f15562a);
        }
    }

    @Override // rq.a
    public final Object q(Object obj) throws IOException {
        Context context;
        String str;
        switch (this.f6794x) {
            case 0:
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i10 = this.f6795y;
                lq.b0 b0Var = lq.b0.f15562a;
                if (i10 == 0) {
                    t1.G(obj);
                    f4.c cVar = (f4.c) this.B;
                    this.f6795y = 1;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f8438e.getValue()).edit();
                    Set set = cVar.f8439f;
                    if (set == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (!editorEdit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) cVar.f8438e.getValue()).getAll().isEmpty() && (context = cVar.f8436c) != null && (str = cVar.f8437d) != null) {
                        f4.a.a(context, str);
                    }
                    if (set != null) {
                        set.clear();
                    }
                    if (b0Var == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                }
                return b0Var;
            default:
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i11 = this.f6795y;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return obj;
                }
                t1.G(obj);
                z zVar = (z) this.B;
                this.f6795y = 1;
                Object objA = zVar.a(this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }
}
