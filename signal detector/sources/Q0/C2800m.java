package q0;

import android.os.Bundle;
import c5.C0412i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2800m extends q5.j implements p5.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q5.l f22993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f22994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q5.m f22995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f22996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f22997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2800m(q5.l lVar, ArrayList arrayList, q5.m mVar, z zVar, Bundle bundle) {
        super(1);
        this.f22993b = lVar;
        this.f22994c = arrayList;
        this.f22995d = mVar;
        this.f22996e = zVar;
        this.f22997f = bundle;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        List listSubList;
        C2794g c2794g = (C2794g) obj;
        q5.i.e(c2794g, "entry");
        this.f22993b.f23296a = true;
        ArrayList arrayList = this.f22994c;
        int iIndexOf = arrayList.indexOf(c2794g);
        if (iIndexOf != -1) {
            q5.m mVar = this.f22995d;
            int i = iIndexOf + 1;
            listSubList = arrayList.subList(mVar.f23297a, i);
            mVar.f23297a = i;
        } else {
            listSubList = d5.s.f19824a;
        }
        this.f22996e.a(c2794g.f22965b, this.f22997f, c2794g, listSubList);
        return C0412i.f5929a;
    }
}
