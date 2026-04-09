package k6;

import H6.C0675l;
import g0.C4356c;
import org.json.JSONArray;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* renamed from: k6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5225d extends kotlin.jvm.internal.m implements p9.l<JSONArray, JSONArray> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f43414g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0675l f43415h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f43416j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5225d(int i, C0675l c0675l, String str, Object obj) {
        super(1);
        this.f43414g = i;
        this.f43415h = c0675l;
        this.i = str;
        this.f43416j = obj;
    }

    @Override // p9.l
    public final JSONArray invoke(JSONArray jSONArray) {
        JSONArray array = jSONArray;
        kotlin.jvm.internal.l.f(array, "array");
        int length = array.length();
        int i = this.f43414g;
        if (i >= 0 && i < length) {
            return C5228g.a(array, new C5224c(i, this.f43416j));
        }
        StringBuilder sbJ = C4356c.j(i, "Index out of bound (", ") for mutation ");
        sbJ.append(this.i);
        sbJ.append(" (");
        sbJ.append(length);
        sbJ.append(')');
        C5246y.d(this.f43415h, new IndexOutOfBoundsException(sbJ.toString()));
        return array;
    }
}
