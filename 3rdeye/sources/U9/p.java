package U9;

import U9.v;
import ia.C4468d;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: FormBody.kt */
/* loaded from: classes3.dex */
public final class p extends D {

    /* renamed from: c, reason: collision with root package name */
    public static final v f12697c;

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f12698a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f12699b;

    /* compiled from: FormBody.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12700a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f12701b = new ArrayList();
    }

    static {
        Pattern pattern = v.f12729d;
        f12697c = v.a.a("application/x-www-form-urlencoded");
    }

    public p(ArrayList encodedNames, ArrayList encodedValues) {
        kotlin.jvm.internal.l.f(encodedNames, "encodedNames");
        kotlin.jvm.internal.l.f(encodedValues, "encodedValues");
        this.f12698a = V9.b.w(encodedNames);
        this.f12699b = V9.b.w(encodedValues);
    }

    public final long a(ia.f fVar, boolean z10) throws EOFException {
        C4468d c4468dQ;
        if (z10) {
            c4468dQ = new C4468d();
        } else {
            kotlin.jvm.internal.l.c(fVar);
            c4468dQ = fVar.q();
        }
        List<String> list = this.f12698a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c4468dQ.C0(38);
            }
            c4468dQ.R0(list.get(i));
            c4468dQ.C0(61);
            c4468dQ.R0(this.f12699b.get(i));
        }
        if (!z10) {
            return 0L;
        }
        long j4 = c4468dQ.f38643c;
        c4468dQ.a();
        return j4;
    }

    @Override // U9.D
    public final long contentLength() {
        return a(null, true);
    }

    @Override // U9.D
    public final v contentType() {
        return f12697c;
    }

    @Override // U9.D
    public final void writeTo(ia.f sink) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        a(sink, false);
    }
}
