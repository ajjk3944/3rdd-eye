package k6;

import H6.C0675l;
import g0.C4356c;
import org.json.JSONArray;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5223b extends kotlin.jvm.internal.m implements p9.l<JSONArray, JSONArray> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f43410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0675l f43411h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5223b(int i, C0675l c0675l, String str) {
        super(1);
        this.f43410g = i;
        this.f43411h = c0675l;
        this.i = str;
    }

    @Override // p9.l
    public final JSONArray invoke(JSONArray jSONArray) {
        JSONArray array = jSONArray;
        kotlin.jvm.internal.l.f(array, "array");
        int length = array.length();
        int i = this.f43410g;
        if (i >= 0 && i < length) {
            return C5228g.a(array, new C5222a(i));
        }
        StringBuilder sbJ = C4356c.j(i, "Index out of bound (", ") for mutation ");
        sbJ.append(this.i);
        sbJ.append(" (");
        sbJ.append(length);
        sbJ.append(')');
        C5246y.d(this.f43411h, new IndexOutOfBoundsException(sbJ.toString()));
        return array;
    }
}
