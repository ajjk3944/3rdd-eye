package kotlinx.coroutines;

/* loaded from: classes4.dex */
public abstract class c2 extends CoroutineDispatcher {
    public abstract c2 b0();

    public final String c0() {
        c2 c2VarB0;
        c2 c2VarC = w0.c();
        if (this == c2VarC) {
            return "Dispatchers.Main";
        }
        try {
            c2VarB0 = c2VarC.b0();
        } catch (UnsupportedOperationException unused) {
            c2VarB0 = null;
        }
        if (this == c2VarB0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
