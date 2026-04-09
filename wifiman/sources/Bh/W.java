package Bh;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2499i f1769a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1770b;

    /* renamed from: c, reason: collision with root package name */
    private final W f1771c;

    public W(InterfaceC2499i classifierDescriptor, List arguments, W w10) {
        AbstractC6492s.i(classifierDescriptor, "classifierDescriptor");
        AbstractC6492s.i(arguments, "arguments");
        this.f1769a = classifierDescriptor;
        this.f1770b = arguments;
        this.f1771c = w10;
    }

    public final List a() {
        return this.f1770b;
    }

    public final InterfaceC2499i b() {
        return this.f1769a;
    }

    public final W c() {
        return this.f1771c;
    }
}
