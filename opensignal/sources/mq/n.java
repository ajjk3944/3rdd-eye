package mq;

import com.google.android.gms.internal.measurement.i4;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements st.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16941a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16942b;

    public /* synthetic */ n(int i10, Object obj) {
        this.f16941a = i10;
        this.f16942b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ar.n, rq.i] */
    @Override // st.j
    public final Iterator iterator() {
        switch (this.f16941a) {
            case 0:
                return br.b0.e((Object[]) this.f16942b);
            case 1:
                return ((Iterable) this.f16942b).iterator();
            case 2:
                return i4.u((rq.i) this.f16942b);
            case 3:
                return (Iterator) this.f16942b;
            case 4:
                return new rt.g(1, this.f16942b);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new st.h(this);
            default:
                return new wq.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(ar.n nVar) {
        this.f16941a = 2;
        this.f16942b = (rq.i) nVar;
    }
}
