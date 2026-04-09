package K6;

import com.polidea.rxandroidble3.exceptions.BleGattException;
import kg.InterfaceC6469f;
import mg.AbstractC6822a;

/* loaded from: classes3.dex */
class Q implements InterfaceC3141n, P, InterfaceC6469f {

    /* renamed from: a, reason: collision with root package name */
    private Integer f10316a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.s f10317b;

    /* renamed from: c, reason: collision with root package name */
    private final hg.g f10318c = new hg.g();

    class a implements kg.p {
        a() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Throwable th2) {
            return (th2 instanceof BleGattException) && ((BleGattException) th2).c() == H6.a.f7641l;
        }
    }

    Q(l0 l0Var, int i10) {
        this.f10317b = l0Var.f().z0(new a());
        this.f10316a = Integer.valueOf(i10);
    }

    @Override // K6.P
    public int a() {
        return this.f10316a.intValue();
    }

    @Override // K6.InterfaceC3141n
    public void b() {
        this.f10318c.dispose();
    }

    @Override // K6.InterfaceC3141n
    public void c() {
        this.f10318c.a(this.f10317b.J0(this, AbstractC6822a.e()));
    }

    @Override // kg.InterfaceC6469f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void accept(Integer num) {
        this.f10316a = num;
    }
}
