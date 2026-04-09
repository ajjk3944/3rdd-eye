package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2470o0 extends AbstractC2489s0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EnumC2494t0 f21127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f21128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470o0(EnumC2494t0 enumC2494t0, Predicate predicate) {
        super(enumC2494t0);
        this.f21127c = enumC2494t0;
        this.f21128d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f21157a) {
            return;
        }
        boolean zTest = this.f21128d.test(obj);
        EnumC2494t0 enumC2494t0 = this.f21127c;
        if (zTest == enumC2494t0.f21163a) {
            this.f21157a = true;
            this.f21158b = enumC2494t0.f21164b;
        }
    }
}
