package Gh;

import Qh.InterfaceC3444a;
import Qh.InterfaceC3446c;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class i extends AbstractC2916h implements InterfaceC3446c {

    /* renamed from: c, reason: collision with root package name */
    private final Annotation f7480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Zh.f fVar, Annotation annotation) {
        super(fVar, null);
        AbstractC6492s.i(annotation, "annotation");
        this.f7480c = annotation;
    }

    @Override // Qh.InterfaceC3446c
    public InterfaceC3444a a() {
        return new C2915g(this.f7480c);
    }
}
