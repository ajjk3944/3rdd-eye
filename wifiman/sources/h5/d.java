package H5;

import Mj.h;
import Vi.o;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes3.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    private final MediaType f7627a;

    /* renamed from: b, reason: collision with root package name */
    private final o f7628b;

    /* renamed from: c, reason: collision with root package name */
    private final e f7629c;

    public d(MediaType contentType, o saver, e serializer) {
        AbstractC6492s.i(contentType, "contentType");
        AbstractC6492s.i(saver, "saver");
        AbstractC6492s.i(serializer, "serializer");
        this.f7627a = contentType;
        this.f7628b = saver;
        this.f7629c = serializer;
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(Object obj) {
        return this.f7629c.d(this.f7627a, this.f7628b, obj);
    }
}
