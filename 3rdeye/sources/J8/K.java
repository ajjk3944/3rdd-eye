package J8;

import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import b9.C1992A;
import f9.InterfaceC4347e;
import va.a;

/* compiled from: ShakeDetector.kt */
@h9.e(c = "com.zipoapps.premiumhelper.util.ShakeDetector$2", f = "ShakeDetector.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class K extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f2822l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L f2823m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SensorManager f2824n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Sensor f2825o;

    /* compiled from: ShakeDetector.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.util.ShakeDetector$2$1", f = "ShakeDetector.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.q<Boolean, Boolean, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ boolean f2826l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ boolean f2827m;

        @Override // p9.q
        public final Object invoke(Boolean bool, Boolean bool2, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            a aVar = new a(3, interfaceC4347e);
            aVar.f2826l = zBooleanValue;
            aVar.f2827m = zBooleanValue2;
            return aVar.invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            boolean z10 = this.f2826l;
            boolean z11 = this.f2827m;
            a.b bVar = va.a.f47104a;
            bVar.a("inForeground - " + z10, new Object[0]);
            bVar.a("hasListeners - " + z11, new Object[0]);
            return Boolean.valueOf(z10 & z11);
        }
    }

    /* compiled from: ShakeDetector.kt */
    public static final class b<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SensorManager f2828b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L f2829c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Sensor f2830d;

        public b(SensorManager sensorManager, L l5, Sensor sensor) {
            this.f2828b = sensorManager;
            this.f2829c = l5;
            this.f2830d = sensor;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            SensorManager sensorManager = this.f2828b;
            L l5 = this.f2829c;
            if (zBooleanValue) {
                sensorManager.registerListener(l5.f2837g, this.f2830d, 3);
            } else {
                sensorManager.unregisterListener(l5.f2837g);
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l5, SensorManager sensorManager, Sensor sensor, InterfaceC4347e<? super K> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f2823m = l5;
        this.f2824n = sensorManager;
        this.f2825o = sensor;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new K(this.f2823m, this.f2824n, this.f2825o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((K) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = g9.a.COROUTINE_SUSPENDED;
        int i = this.f2822l;
        if (i == 0) {
            b9.n.b(obj);
            L l5 = this.f2823m;
            D9.J j4 = l5.f2835e;
            a aVar = new a(3, null);
            b bVar = new b(this.f2824n, l5, this.f2825o);
            this.f2822l = 1;
            Object objA = E9.i.a(bVar, this, D9.w.f1267g, new D9.v(aVar, null), new InterfaceC0644f[]{j4, l5.f2836f});
            if (objA != obj2) {
                objA = C1992A.f18074a;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C1992A.f18074a;
    }
}
