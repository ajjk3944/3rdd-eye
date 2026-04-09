package androidx.compose.ui.platform;

import c0.InterfaceC4179h;
import java.util.Map;
import mh.InterfaceC6824a;

/* renamed from: androidx.compose.ui.platform.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3943o0 implements InterfaceC4179h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f29461a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4179h f29462b;

    public C3943o0(InterfaceC4179h interfaceC4179h, InterfaceC6824a interfaceC6824a) {
        this.f29461a = interfaceC6824a;
        this.f29462b = interfaceC4179h;
    }

    @Override // c0.InterfaceC4179h
    public boolean a(Object obj) {
        return this.f29462b.a(obj);
    }

    @Override // c0.InterfaceC4179h
    public Map b() {
        return this.f29462b.b();
    }

    @Override // c0.InterfaceC4179h
    public Object c(String str) {
        return this.f29462b.c(str);
    }

    public final void d() {
        this.f29461a.invoke();
    }

    @Override // c0.InterfaceC4179h
    public InterfaceC4179h.a e(String str, InterfaceC6824a interfaceC6824a) {
        return this.f29462b.e(str, interfaceC6824a);
    }
}
