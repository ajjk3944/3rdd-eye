package w6;

/* loaded from: classes3.dex */
public interface b {

    public static final class a {
        public static float a(b bVar, boolean z10) {
            return z10 ? bVar.d() : bVar.b();
        }

        public static float b(b bVar, boolean z10) {
            return z10 ? bVar.b() : bVar.d();
        }
    }

    float a();

    float b();

    float c();

    float d();
}
