package K1;

import java.util.ArrayList;

/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes.dex */
public final class e extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f2970e;

    public e(d dVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2970e = dVar;
        this.f2966a = obj;
        this.f2967b = arrayList;
        this.f2968c = obj2;
        this.f2969d = arrayList2;
    }

    @Override // K1.i.d
    public final void a(i iVar) {
        iVar.z(this);
    }

    @Override // K1.l, K1.i.d
    public final void b(i iVar) {
        d dVar = this.f2970e;
        Object obj = this.f2966a;
        if (obj != null) {
            dVar.s(obj, this.f2967b, null);
        }
        Object obj2 = this.f2968c;
        if (obj2 != null) {
            dVar.s(obj2, this.f2969d, null);
        }
    }
}
