package kotlin.text;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import sh.C7974i;

/* renamed from: kotlin.text.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6518l {

    /* renamed from: kotlin.text.l$a */
    public static final class a {
        public static b a(InterfaceC6518l interfaceC6518l) {
            return new b(interfaceC6518l);
        }
    }

    /* renamed from: kotlin.text.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6518l f52271a;

        public b(InterfaceC6518l match) {
            AbstractC6492s.i(match, "match");
            this.f52271a = match;
        }

        public final InterfaceC6518l a() {
            return this.f52271a;
        }
    }

    b a();

    List b();

    InterfaceC6517k c();

    C7974i d();

    String getValue();

    InterfaceC6518l next();
}
