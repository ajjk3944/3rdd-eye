package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;

/* loaded from: classes4.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22784a = new a();

        public a() {
            super(null);
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22785a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.i iVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String strI = t.b(getClass()).i();
        p.b(strI);
        return strI;
    }

    public h() {
    }
}
