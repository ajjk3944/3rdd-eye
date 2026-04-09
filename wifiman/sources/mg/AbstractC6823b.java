package mg;

import java.util.Objects;
import kg.InterfaceC6466c;

/* renamed from: mg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6823b {

    /* renamed from: a, reason: collision with root package name */
    static final InterfaceC6466c f54037a = new a();

    /* renamed from: mg.b$a */
    static final class a implements InterfaceC6466c {
        a() {
        }

        @Override // kg.InterfaceC6466c
        public boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public static InterfaceC6466c a() {
        return f54037a;
    }

    public static int b(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }
}
