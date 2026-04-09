package K6;

import android.text.InputFilter;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class I0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.p f3239g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.b<Long> f3240h;
    public final /* synthetic */ A7.d i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(O6.p pVar, A7.b<Long> bVar, A7.d dVar) {
        super(1);
        this.f3239g = pVar;
        this.f3240h = bVar;
        this.i = dVar;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        long jLongValue = this.f3240h.a(this.i).longValue();
        long j4 = jLongValue >> 31;
        this.f3239g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION)});
        return C1992A.f18074a;
    }
}
