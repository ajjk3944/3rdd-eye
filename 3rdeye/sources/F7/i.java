package F7;

import F7.g;
import android.database.Cursor;
import b9.C1992A;
import java.util.LinkedHashSet;

/* compiled from: DivStorageImpl.kt */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements p9.l<H7.h, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f1693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C9.r f1694h;
    public final /* synthetic */ LinkedHashSet i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, C9.r rVar, LinkedHashSet linkedHashSet) {
        super(1);
        this.f1693g = gVar;
        this.f1694h = rVar;
        this.i = linkedHashSet;
    }

    @Override // p9.l
    public final C1992A invoke(H7.h hVar) {
        H7.h it = hVar;
        kotlin.jvm.internal.l.f(it, "it");
        Cursor cursorA = it.a();
        if (cursorA.getCount() != 0 && cursorA.moveToFirst()) {
            do {
                g.a aVar = new g.a(this.f1693g, cursorA);
                if (((Boolean) this.f1694h.invoke(aVar)).booleanValue()) {
                    this.i.add(aVar.f1687d);
                }
                aVar.f1686c = true;
            } while (cursorA.moveToNext());
        }
        return C1992A.f18074a;
    }
}
