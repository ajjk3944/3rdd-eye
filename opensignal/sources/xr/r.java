package xr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends w implements hs.e {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor f25513a;

    public r(Constructor constructor) {
        br.l.e(constructor, "member");
        this.f25513a = constructor;
    }

    @Override // xr.w
    public final Member b() {
        return this.f25513a;
    }

    @Override // hs.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f25513a.getTypeParameters();
        br.l.d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}
