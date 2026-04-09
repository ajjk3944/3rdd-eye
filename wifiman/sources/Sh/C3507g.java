package Sh;

import Sh.AbstractC3505e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Sh.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3507g extends AbstractC3505e.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f20745a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f20746b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f20747c;

    public C3507g(Map memberAnnotations, Map propertyConstants, Map annotationParametersDefaultValues) {
        AbstractC6492s.i(memberAnnotations, "memberAnnotations");
        AbstractC6492s.i(propertyConstants, "propertyConstants");
        AbstractC6492s.i(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f20745a = memberAnnotations;
        this.f20746b = propertyConstants;
        this.f20747c = annotationParametersDefaultValues;
    }

    @Override // Sh.AbstractC3505e.a
    public Map a() {
        return this.f20745a;
    }

    public final Map b() {
        return this.f20747c;
    }

    public final Map c() {
        return this.f20746b;
    }
}
