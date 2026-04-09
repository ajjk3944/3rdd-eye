package s7;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: s7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7920g {

    /* renamed from: a, reason: collision with root package name */
    private final C7916c f61371a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7914a f61372b;

    /* renamed from: c, reason: collision with root package name */
    private final List f61373c;

    public C7920g(C7916c identification, AbstractC7914a connection, List extras) {
        AbstractC6492s.i(identification, "identification");
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(extras, "extras");
        this.f61371a = identification;
        this.f61372b = connection;
        this.f61373c = extras;
    }

    public final AbstractC7914a a() {
        return this.f61372b;
    }

    public final List b() {
        return this.f61373c;
    }

    public final C7916c c() {
        return this.f61371a;
    }
}
