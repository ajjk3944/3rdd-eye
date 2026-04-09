package C0;

/* loaded from: classes.dex */
public abstract class d extends z {
    public abstract void e(H0.j jVar, Object obj);

    public void f(Object obj) {
        H0.j jVarA = a();
        try {
            e(jVarA, obj);
            jVarA.a();
        } finally {
            c(jVarA);
        }
    }
}
