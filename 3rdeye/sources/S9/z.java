package S9;

import O9.l;

/* compiled from: JsonPath.kt */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f12111a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f12112b;

    /* renamed from: c, reason: collision with root package name */
    public int f12113c;

    /* compiled from: JsonPath.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12114a = new a();
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f12113c + 1;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj = this.f12111a[i10];
            if (obj instanceof O9.e) {
                O9.e eVar = (O9.e) obj;
                if (!kotlin.jvm.internal.l.b(eVar.e(), l.b.f10524a)) {
                    int i11 = this.f12112b[i10];
                    if (i11 >= 0) {
                        sb.append(".");
                        sb.append(eVar.g(i11));
                    }
                } else if (this.f12112b[i10] != -1) {
                    sb.append("[");
                    sb.append(this.f12112b[i10]);
                    sb.append("]");
                }
            } else if (obj != a.f12114a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String toString() {
        return a();
    }
}
