package d9;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.AbstractC6507a;
import kotlin.text.t;

/* renamed from: d9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5316a {
    public static final byte[] a(String str) {
        AbstractC6492s.i(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalStateException("Must have an even length");
        }
        List listS1 = t.s1(str, 2);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listS1, 10));
        Iterator it = listS1.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), AbstractC6507a.a(16))));
        }
        return AbstractC3689v.d1(arrayList);
    }
}
