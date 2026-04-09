package P9;

import androidx.lifecycle.E;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class i implements Gb.d {

    /* renamed from: a, reason: collision with root package name */
    private final E f18487a;

    public i(E savedState) {
        AbstractC6492s.i(savedState, "savedState");
        this.f18487a = savedState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(String str, String str2) {
        return "SSO Client Storage GET " + str + " -> " + str2 + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String str, String str2) {
        return "SSO Client Storage SET " + str + " -> " + str2;
    }

    @Override // Gb.d
    public void a(final String key, final String str) {
        AbstractC6492s.i(key, "key");
        S9.a.d(new InterfaceC6824a() { // from class: P9.h
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return i.f(key, str);
            }
        });
        this.f18487a.i(key, str);
    }

    @Override // Gb.d
    public String b(final String key) {
        AbstractC6492s.i(key, "key");
        final String str = (String) this.f18487a.d(key);
        S9.a.d(new InterfaceC6824a() { // from class: P9.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return i.e(key, str);
            }
        });
        return str;
    }
}
