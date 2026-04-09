package Jh;

import java.util.EnumMap;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f10090a;

    public E(EnumMap defaultQualifiers) {
        AbstractC6492s.i(defaultQualifiers, "defaultQualifiers");
        this.f10090a = defaultQualifiers;
    }

    public final w a(EnumC3109c enumC3109c) {
        return (w) this.f10090a.get(enumC3109c);
    }

    public final EnumMap b() {
        return this.f10090a;
    }
}
