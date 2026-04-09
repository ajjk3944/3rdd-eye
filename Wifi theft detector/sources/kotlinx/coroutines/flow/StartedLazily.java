package kotlinx.coroutines.flow;

/* loaded from: classes4.dex */
public final class StartedLazily implements b1 {
    @Override // kotlinx.coroutines.flow.b1
    public b a(d1 d1Var) {
        return d.u(new StartedLazily$command$1(d1Var, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
