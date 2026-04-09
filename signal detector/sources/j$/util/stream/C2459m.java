package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2459m extends AbstractC2452k2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21118b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2459m(AbstractC2404b abstractC2404b, InterfaceC2472o2 interfaceC2472o2, int i) {
        super(interfaceC2472o2);
        this.f21118b = i;
        this.f21119c = abstractC2404b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2459m(InterfaceC2472o2 interfaceC2472o2) {
        super(interfaceC2472o2);
        this.f21118b = 0;
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public void m() {
        switch (this.f21118b) {
            case 0:
                this.f21119c = null;
                this.f21108a.m();
                break;
            default:
                super.m();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC2452k2, j$.util.stream.InterfaceC2472o2
    public void c(long j6) {
        switch (this.f21118b) {
            case 0:
                this.f21119c = new HashSet();
                this.f21108a.c(-1L);
                break;
            case 1:
            default:
                super.c(j6);
                break;
            case 2:
                this.f21108a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f21118b) {
            case 0:
                if (!((Set) this.f21119c).contains(obj)) {
                    ((Set) this.f21119c).add(obj);
                    this.f21108a.accept((InterfaceC2472o2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((C2479q) this.f21119c).f21139t).accept(obj);
                this.f21108a.accept((InterfaceC2472o2) obj);
                break;
            case 2:
                if (((Predicate) ((C2479q) this.f21119c).f21139t).test(obj)) {
                    this.f21108a.accept((InterfaceC2472o2) obj);
                    break;
                }
                break;
            case 3:
                this.f21108a.accept((InterfaceC2472o2) ((Function) ((C2479q) this.f21119c).f21139t).apply(obj));
                break;
            case 4:
                this.f21108a.accept(((ToIntFunction) ((V) this.f21119c).f20972t).applyAsInt(obj));
                break;
            case 5:
                this.f21108a.accept(((ToLongFunction) ((C2425f0) this.f21119c).f21075t).applyAsLong(obj));
                break;
            default:
                this.f21108a.accept(((ToDoubleFunction) ((C2503v) this.f21119c).f21175t).applyAsDouble(obj));
                break;
        }
    }
}
