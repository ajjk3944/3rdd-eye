package d3;

import android.content.Context;
import m3.InterfaceC6756a;

/* renamed from: d3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5295i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f45739a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6756a f45740b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6756a f45741c;

    C5295i(Context context, InterfaceC6756a interfaceC6756a, InterfaceC6756a interfaceC6756a2) {
        this.f45739a = context;
        this.f45740b = interfaceC6756a;
        this.f45741c = interfaceC6756a2;
    }

    AbstractC5294h a(String str) {
        return AbstractC5294h.a(this.f45739a, this.f45740b, this.f45741c, str);
    }
}
