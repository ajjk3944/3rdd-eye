package K6;

import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class B0 extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O6.p f3183h;
    public final /* synthetic */ A7.b i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f3184j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B0(O6.p pVar, A7.b bVar, A7.d dVar, int i) {
        super(1);
        this.f3182g = i;
        this.f3183h = pVar;
        this.i = bVar;
        this.f3184j = dVar;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f3182g) {
            case 0:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                this.f3183h.setInputHint((String) this.i.a(this.f3184j));
                break;
            default:
                kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
                long jLongValue = ((Number) this.i.a(this.f3184j)).longValue();
                long j4 = jLongValue >> 31;
                this.f3183h.setMaxLines((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
                break;
        }
        return C1992A.f18074a;
    }
}
