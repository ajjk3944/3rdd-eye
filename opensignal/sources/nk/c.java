package nk;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18349h;

    /* renamed from: i, reason: collision with root package name */
    public r f18350i;
    public final /* synthetic */ Type[] j;
    public final /* synthetic */ Type k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set f18351l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set f18352m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Type type, Set set, Object obj, Method method, int i10, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3, int i11) {
        super(type, set, obj, method, i10, 1, z10);
        this.f18349h = i11;
        this.j = typeArr;
        this.k = type2;
        this.f18351l = set2;
        this.f18352m = set3;
    }

    @Override // nk.d
    public final void a(j0 j0Var, e eVar) {
        switch (this.f18349h) {
            case 0:
                super.a(j0Var, eVar);
                Type type = this.j[0];
                Type type2 = this.k;
                boolean zB = p0.b(type, type2);
                Set set = this.f18352m;
                this.f18350i = (zB && this.f18351l.equals(set)) ? j0Var.c(eVar, type2, set) : j0Var.b(type2, set, null);
                break;
            default:
                super.a(j0Var, eVar);
                Type[] typeArr = this.j;
                boolean zB2 = p0.b(typeArr[0], this.k);
                Set set2 = this.f18351l;
                this.f18350i = (zB2 && set2.equals(this.f18352m)) ? j0Var.c(eVar, typeArr[0], set2) : j0Var.b(typeArr[0], set2, null);
                break;
        }
    }

    @Override // nk.d
    public Object b(w wVar) {
        switch (this.f18349h) {
            case 1:
                return c(this.f18350i.fromJson(wVar));
            default:
                return super.b(wVar);
        }
    }

    @Override // nk.d
    public void d(c0 c0Var, Object obj) {
        switch (this.f18349h) {
            case 0:
                this.f18350i.toJson(c0Var, c(obj));
                break;
            default:
                super.d(c0Var, obj);
                break;
        }
    }
}
