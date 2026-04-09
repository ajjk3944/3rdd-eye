package Q9;

import java.util.Arrays;

/* compiled from: InlineClassDescriptor.kt */
/* loaded from: classes3.dex */
public final class M extends C1547o0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11436l;

    public M(String str, N n9) {
        super(str, n9, 1);
        this.f11436l = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b9.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [b9.g, java.lang.Object] */
    @Override // Q9.C1547o0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            O9.e eVar = (O9.e) obj;
            if (this.f11508a.equals(eVar.a())) {
                M m10 = (M) obj;
                if (m10.f11436l && Arrays.equals((O9.e[]) this.f11516j.getValue(), (O9.e[]) m10.f11516j.getValue())) {
                    int iF = eVar.f();
                    int i = this.f11510c;
                    if (i == iF) {
                        for (int i10 = 0; i10 < i; i10++) {
                            if (kotlin.jvm.internal.l.b(i(i10).a(), eVar.i(i10).a()) && kotlin.jvm.internal.l.b(i(i10).e(), eVar.i(i10).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // Q9.C1547o0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // Q9.C1547o0, O9.e
    public final boolean isInline() {
        return this.f11436l;
    }
}
