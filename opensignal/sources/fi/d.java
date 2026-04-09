package fi;

import android.database.Cursor;
import ar.k;
import br.l;
import br.n;
import java.util.ArrayList;
import lq.b0;

/* loaded from: classes.dex */
public final class d extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8889d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hi.a f8890g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8891r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(hi.a aVar, ArrayList arrayList, int i10) {
        super(1);
        this.f8889d = i10;
        this.f8890g = aVar;
        this.f8891r = arrayList;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f8889d) {
            case 0:
                Cursor cursor = (Cursor) obj;
                l.e(cursor, "cursor");
                this.f8891r.add(Long.valueOf(this.f8890g.f(cursor, "task_id")));
                break;
            case 1:
                Cursor cursor2 = (Cursor) obj;
                l.e(cursor2, "cursor");
                String strH = this.f8890g.h(cursor2, "task_name");
                if (strH != null) {
                    this.f8891r.add(strH);
                }
                break;
            case 2:
                Cursor cursor3 = (Cursor) obj;
                l.e(cursor3, "cursor");
                this.f8891r.add(Long.valueOf(this.f8890g.f(cursor3, "task_id")));
                break;
            default:
                Cursor cursor4 = (Cursor) obj;
                l.e(cursor4, "cursor");
                String strH2 = this.f8890g.h(cursor4, "task_name");
                if (strH2 != null) {
                    this.f8891r.add(strH2);
                }
                break;
        }
        return b0.f15562a;
    }
}
