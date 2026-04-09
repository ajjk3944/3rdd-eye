package ne;

/* loaded from: classes.dex */
public abstract class d implements j {
    public abstract boolean a(char c4);

    @Override // ne.j
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
