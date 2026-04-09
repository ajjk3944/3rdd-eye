package Sh;

import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface D {

    public static final class a implements D {

        /* renamed from: a, reason: collision with root package name */
        public static final a f20702a = new a();

        private a() {
        }

        @Override // Sh.D
        public List a(String packageFqName) {
            AbstractC6492s.i(packageFqName, "packageFqName");
            return AbstractC3689v.l();
        }
    }

    List a(String str);
}
