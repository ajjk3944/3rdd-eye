package el;

import br.l;
import dd.d;
import dd.r;
import java.util.Objects;
import kg.q;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements dd.c, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8201a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f8202d;

    public /* synthetic */ a(b bVar, q qVar) {
        this.f8201a = bVar;
        this.f8202d = qVar;
    }

    @Override // dd.c
    public void s(r rVar) {
        l.e(rVar, "task");
        if (rVar.j()) {
            Objects.toString(rVar.h());
        }
        this.f8201a.a();
        this.f8202d.c();
    }

    @Override // dd.d
    public void y(Exception exc) {
        this.f8201a.a();
        this.f8202d.c();
    }
}
