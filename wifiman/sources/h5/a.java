package H5;

import Mj.h;
import Vi.InterfaceC3627a;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3627a f7623a;

    /* renamed from: b, reason: collision with root package name */
    private final e f7624b;

    public a(InterfaceC3627a loader, e serializer) {
        AbstractC6492s.i(loader, "loader");
        AbstractC6492s.i(serializer, "serializer");
        this.f7623a = loader;
        this.f7624b = serializer;
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(ResponseBody value) {
        AbstractC6492s.i(value, "value");
        return this.f7624b.a(this.f7623a, value);
    }
}
