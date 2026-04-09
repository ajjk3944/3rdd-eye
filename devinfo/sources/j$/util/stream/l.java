package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final class l extends i5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26654b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(a aVar, m5 m5Var, int i4) {
        super(m5Var);
        this.f26654b = i4;
        this.f26655c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m5 m5Var) {
        super(m5Var);
        this.f26654b = 0;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public void end() {
        switch (this.f26654b) {
            case 0:
                this.f26655c = null;
                this.f26617a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public void c(long j) {
        switch (this.f26654b) {
            case 0:
                this.f26655c = new HashSet();
                this.f26617a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.f26617a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f26654b) {
            case 0:
                if (!((Set) this.f26655c).contains(obj)) {
                    ((Set) this.f26655c).add(obj);
                    this.f26617a.accept((m5) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((p) this.f26655c).f26707t).accept(obj);
                this.f26617a.accept((m5) obj);
                break;
            case 2:
                if (((Predicate) ((p) this.f26655c).f26707t).test(obj)) {
                    this.f26617a.accept((m5) obj);
                    break;
                }
                break;
            case 3:
                this.f26617a.accept((m5) ((Function) ((p) this.f26655c).f26707t).apply(obj));
                break;
            case 4:
                this.f26617a.accept(((ToIntFunction) ((t0) this.f26655c).f26759t).applyAsInt(obj));
                break;
            case 5:
                this.f26617a.accept(((ToLongFunction) ((d1) this.f26655c).f26551t).applyAsLong(obj));
                break;
            default:
                this.f26617a.accept(((ToDoubleFunction) ((q) this.f26655c).f26718t).applyAsDouble(obj));
                break;
        }
    }
}
