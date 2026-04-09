package F3;

import java.util.Arrays;

/* renamed from: F3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2789e extends AbstractC2786b {
    public C2789e() {
        super(4);
    }

    public final C2789e b(Object obj) {
        obj.getClass();
        int i10 = this.f5890b + 1;
        Object[] objArr = this.f5889a;
        int length = objArr.length;
        if (length < i10) {
            this.f5889a = Arrays.copyOf(objArr, AbstractC2787c.a(length, i10));
            this.f5891c = false;
        } else if (this.f5891c) {
            this.f5889a = (Object[]) objArr.clone();
            this.f5891c = false;
        }
        Object[] objArr2 = this.f5889a;
        int i11 = this.f5890b;
        this.f5890b = i11 + 1;
        objArr2[i11] = obj;
        return this;
    }

    public final AbstractC2792h c() {
        this.f5891c = true;
        return AbstractC2792h.v(this.f5889a, this.f5890b);
    }
}
