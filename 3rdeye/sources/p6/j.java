package p6;

import b9.C1992A;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import o6.C5426c;
import p6.i;
import p9.l;
import r6.C5529f;

/* compiled from: RuntimeTree.kt */
/* loaded from: classes.dex */
public final class j extends m implements l<i.a, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f45235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar) {
        super(1);
        this.f45235g = iVar;
    }

    @Override // p9.l
    public final C1992A invoke(i.a aVar) {
        i.a it = aVar;
        kotlin.jvm.internal.l.f(it, "it");
        i iVar = this.f45235g;
        LinkedHashMap linkedHashMap = iVar.f45230a;
        C5426c c5426c = it.f45232a;
        linkedHashMap.remove(c5426c);
        iVar.f45231b.remove(it.f45233b);
        if (!(c5426c.f44858b instanceof s6.j) && !c5426c.f44862f) {
            c5426c.f44862f = true;
            C5529f c5529f = c5426c.f44859c;
            if (c5529f != null) {
                c5529f.a();
            }
            c5426c.f44858b.g();
        }
        return C1992A.f18074a;
    }
}
