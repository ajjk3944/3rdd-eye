package androidx.work;

/* loaded from: classes.dex */
public abstract class i {

    public class a extends i {
        @Override // androidx.work.i
        public h a(String str) {
            return null;
        }
    }

    public static i c() {
        return new a();
    }

    public abstract h a(String str);

    public final h b(String str) {
        h hVarA = a(str);
        return hVarA == null ? h.a(str) : hVarA;
    }
}
