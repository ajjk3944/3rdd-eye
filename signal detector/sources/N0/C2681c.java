package n0;

import A.f;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import java.util.Arrays;
import q5.i;
import q5.p;
import s0.C2885f;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2681c implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f22144a;

    public C2681c(e... eVarArr) {
        i.e(eVarArr, "initializers");
        this.f22144a = eVarArr;
    }

    @Override // androidx.lifecycle.Z
    public final X a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.Z
    public final /* synthetic */ X b(q5.d dVar, d dVar2) {
        return f.a(this, dVar, dVar2);
    }

    @Override // androidx.lifecycle.Z
    public final X c(Class cls, d dVar) {
        e eVar;
        q5.d dVarA = p.a(cls);
        e[] eVarArr = this.f22144a;
        e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length);
        i.e(eVarArr2, "initializers");
        int length = eVarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArr2[i];
            if (eVar.f22145a.equals(dVarA)) {
                break;
            }
            i++;
        }
        C2885f.a aVar = eVar != null ? new C2885f.a() : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + com.bumptech.glide.d.s(dVarA)).toString());
    }
}
