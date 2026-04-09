package d0;

import C.J;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements b.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37230c;

    public /* synthetic */ f(AtomicReference atomicReference, int i) {
        this.f37229b = i;
        this.f37230c = atomicReference;
    }

    @Override // o0.b.c
    public final Object i(final b.a aVar) {
        switch (this.f37229b) {
            case 0:
                this.f37230c.set(aVar);
                return "Data closed";
            default:
                this.f37230c.set(new J.h() { // from class: v.D
                    @Override // C.J.h
                    public final void a() {
                        C.S.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                        aVar.b(null);
                    }
                });
                return "OnScreenFlashUiApplied";
        }
    }
}
