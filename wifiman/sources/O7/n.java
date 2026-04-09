package o7;

import gg.y;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Yg.m f55556a = Yg.n.b(a.f55557a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f55557a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return Gg.a.b(Executors.newSingleThreadExecutor());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y b() {
        return (y) f55556a.getValue();
    }
}
