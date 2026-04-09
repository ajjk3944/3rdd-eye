package ku;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v implements gu.a {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f14627a;

    /* renamed from: b, reason: collision with root package name */
    public final u f14628b;

    /* renamed from: c, reason: collision with root package name */
    public final lq.q f14629c;

    public v(String str, Enum[] enumArr, u uVar) {
        br.l.e(enumArr, "values");
        this.f14627a = enumArr;
        this.f14629c = kc.f.F(new c8.x(this, 2, str));
        this.f14628b = uVar;
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        int iD = cVar.D(getDescriptor());
        Enum[] enumArr = this.f14627a;
        if (iD >= 0 && iD < enumArr.length) {
            return enumArr[iD];
        }
        throw new gu.e(iD + " is not among valid " + getDescriptor().h() + " enum values, values size is " + enumArr.length);
    }

    @Override // gu.a
    public final iu.e getDescriptor() {
        return (iu.e) this.f14629c.getValue();
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        Enum r52 = (Enum) obj;
        br.l.e(r52, "value");
        Enum[] enumArr = this.f14627a;
        int iR0 = mq.l.r0(r52, enumArr);
        if (iR0 != -1) {
            dVar.o(getDescriptor(), iR0);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r52);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().h());
        sb2.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        br.l.d(string, "toString(...)");
        sb2.append(string);
        throw new gu.e(sb2.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
    }
}
