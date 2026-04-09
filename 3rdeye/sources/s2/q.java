package s2;

import java.io.IOException;
import t2.AbstractC5601b;

/* compiled from: IntegerParser.java */
/* loaded from: classes.dex */
public final class q implements K<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final q f45999a = new q();

    @Override // s2.K
    public final Integer a(AbstractC5601b abstractC5601b, float f10) throws IOException {
        return Integer.valueOf(Math.round(r.d(abstractC5601b) * f10));
    }
}
