package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPivot.kt */
/* renamed from: N7.d8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1138d8 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f8074a;

    /* compiled from: DivPivot.kt */
    /* renamed from: N7.d8$a */
    public static final class a extends AbstractC1138d8 {

        /* renamed from: b, reason: collision with root package name */
        public final C1153e8 f8075b;

        public a(C1153e8 c1153e8) {
            this.f8075b = c1153e8;
        }
    }

    /* compiled from: DivPivot.kt */
    /* renamed from: N7.d8$b */
    public static final class b extends AbstractC1138d8 {

        /* renamed from: b, reason: collision with root package name */
        public final C1241k8 f8076b;

        public b(C1241k8 c1241k8) {
            this.f8076b = c1241k8;
        }
    }

    public final boolean a(AbstractC1138d8 abstractC1138d8, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (abstractC1138d8 == null) {
            return false;
        }
        if (!(this instanceof a)) {
            if (!(this instanceof b)) {
                throw new b9.j();
            }
            b bVar = (b) this;
            Object objC = abstractC1138d8.c();
            C1241k8 c1241k8 = objC instanceof C1241k8 ? (C1241k8) objC : null;
            C1241k8 c1241k82 = bVar.f8076b;
            c1241k82.getClass();
            return c1241k8 != null && c1241k82.f8645a.a(resolver).doubleValue() == c1241k8.f8645a.a(otherResolver).doubleValue();
        }
        a aVar = (a) this;
        Object objC2 = abstractC1138d8.c();
        C1153e8 c1153e8 = objC2 instanceof C1153e8 ? (C1153e8) objC2 : null;
        C1153e8 c1153e82 = aVar.f8075b;
        c1153e82.getClass();
        if (c1153e8 == null || c1153e82.f8163a.a(resolver) != c1153e8.f8163a.a(otherResolver)) {
            return false;
        }
        A7.b<Long> bVar2 = c1153e82.f8164b;
        Long lA = bVar2 != null ? bVar2.a(resolver) : null;
        A7.b<Long> bVar3 = c1153e8.f8164b;
        return kotlin.jvm.internal.l.b(lA, bVar3 != null ? bVar3.a(otherResolver) : null);
    }

    public final int b() {
        int iIntValue;
        Integer num = this.f8074a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof a) {
            C1153e8 c1153e8 = ((a) this).f8075b;
            Integer num2 = c1153e8.f8165c;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode2 = c1153e8.f8163a.hashCode() + kotlin.jvm.internal.x.a(C1153e8.class).hashCode();
                A7.b<Long> bVar = c1153e8.f8164b;
                int iHashCode3 = (bVar != null ? bVar.hashCode() : 0) + iHashCode2;
                c1153e8.f8165c = Integer.valueOf(iHashCode3);
                iIntValue = iHashCode3;
            }
        } else {
            if (!(this instanceof b)) {
                throw new b9.j();
            }
            C1241k8 c1241k8 = ((b) this).f8076b;
            Integer num3 = c1241k8.f8646b;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                int iHashCode4 = c1241k8.f8645a.hashCode() + kotlin.jvm.internal.x.a(C1241k8.class).hashCode();
                c1241k8.f8646b = Integer.valueOf(iHashCode4);
                iIntValue = iHashCode4;
            }
        }
        int i = iHashCode + iIntValue;
        this.f8074a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof a) {
            return ((a) this).f8075b;
        }
        if (this instanceof b) {
            return ((b) this).f8076b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1198h8) D7.a.f1071b.Q5.getValue()).b(D7.a.f1070a, this);
    }
}
