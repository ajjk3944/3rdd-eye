package E6;

import E6.a;
import E6.f;
import b9.C1992A;
import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.l;
import org.json.JSONException;

/* compiled from: PhoneInputMask.kt */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public final E7.a f1467e;

    public d(E7.a aVar) {
        super(e.f1469b);
        this.f1467e = aVar;
    }

    @Override // E6.a
    public final void a(String str, Integer num) throws JSONException {
        f fVarA = f.a.a(j(), str);
        int iIntValue = num.intValue();
        int i = fVarA.f1471b;
        int i10 = iIntValue - i;
        int i11 = 0;
        if (i10 < 0) {
            i10 = 0;
        }
        f fVar = new f(i10, i, fVarA.f1472c);
        String strI = i();
        int iM = m(fVar, str);
        String strI2 = i();
        String strA = e.a(strI2);
        if (l.b(strA, this.f1446a.f1454a)) {
            strA = null;
        }
        if (strA == null) {
            b(fVar, iM);
            return;
        }
        o(new a.b(strA, e.f1468a, this.f1446a.f1456c), false);
        n(strI2, 0, null);
        f fVarA2 = f.a.a(strI, strI2);
        int i12 = fVarA2.f1470a + fVarA2.f1471b;
        int i13 = 0;
        while (i11 < ((ArrayList) g()).size() && i13 < i12) {
            int i14 = i11 + 1;
            if (((ArrayList) g()).get(i11) instanceof a.AbstractC0017a.C0018a) {
                i13++;
            }
            i11 = i14;
        }
        while (i11 < ((ArrayList) g()).size() && !(((a.AbstractC0017a) ((ArrayList) g()).get(i11)) instanceof a.AbstractC0017a.C0018a)) {
            i11++;
        }
        this.f1449d = i11;
    }

    @Override // E6.a
    public final void k(PatternSyntaxException patternSyntaxException) throws Exception {
        this.f1467e.invoke(patternSyntaxException);
    }

    @Override // E6.a
    public final void l(String str) throws JSONException {
        String strA = e.a(str);
        if (l.b(strA, this.f1446a.f1454a)) {
            strA = null;
        }
        if (strA != null) {
            o(new a.b(strA, e.f1468a, this.f1446a.f1456c), false);
            C1992A c1992a = C1992A.f18074a;
        }
        super.l(str);
    }
}
