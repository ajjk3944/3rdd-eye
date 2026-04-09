package E;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.e f1322c;

    public /* synthetic */ m(androidx.camera.core.e eVar, int i) {
        this.f1321b = i;
        this.f1322c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1321b) {
            case 0:
                androidx.camera.core.e eVar = this.f1322c;
                if (eVar != null) {
                    eVar.c();
                    break;
                }
                break;
            default:
                this.f1322c.c();
                break;
        }
    }
}
