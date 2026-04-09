package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class AK extends AbstractC1984ut {

    /* renamed from: b, reason: collision with root package name */
    public static final AK f6979b = new AK();

    public static void J(DK dk, AbstractC1527mK abstractC1527mK) throws IOException {
        C2228zK c2228zK = dk.f7747a;
        if (abstractC1527mK == null || (abstractC1527mK instanceof C1581nK)) {
            dk.a();
            return;
        }
        if (abstractC1527mK instanceof C1743qK) {
            C1743qK c1743qKC = abstractC1527mK.c();
            Serializable serializable = c1743qKC.f16339a;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean zBooleanValue = A.f.y(serializable) ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c1743qKC.a());
                    dk.e();
                    dk.m();
                    c2228zK.write(true != zBooleanValue ? "false" : "true");
                    return;
                }
                String strA = c1743qKC.a();
                if (strA == null) {
                    dk.a();
                    return;
                }
                dk.e();
                dk.m();
                dk.h(strA);
                return;
            }
            Number numberD = c1743qKC.d();
            if (numberD == null) {
                dk.a();
                return;
            }
            dk.e();
            String string = numberD.toString();
            Class<?> cls = numberD.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (dk.f7754h != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                    }
                } else if (cls != Float.class && cls != Double.class && !DK.f7745j.matcher(string).matches()) {
                    String strValueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(AbstractC1135f5.o(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
                }
            }
            dk.m();
            c2228zK.append((CharSequence) string);
            return;
        }
        boolean z6 = abstractC1527mK instanceof C1473lK;
        if (z6) {
            dk.e();
            dk.m();
            int i = dk.f7749c;
            int[] iArr = dk.f7748b;
            if (i == iArr.length) {
                dk.f7748b = Arrays.copyOf(iArr, i + i);
            }
            int[] iArr2 = dk.f7748b;
            int i3 = dk.f7749c;
            dk.f7749c = i3 + 1;
            iArr2[i3] = 1;
            c2228zK.write(91);
            if (!z6) {
                throw new IllegalStateException("Not a JSON Array: ".concat(abstractC1527mK.toString()));
            }
            ArrayList arrayList = ((C1473lK) abstractC1527mK).f15380a;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                J(dk, (AbstractC1527mK) obj);
            }
            dk.b(1, 2, ']');
            return;
        }
        if (!(abstractC1527mK instanceof C1635oK)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(abstractC1527mK.getClass())));
        }
        dk.e();
        dk.m();
        int i7 = dk.f7749c;
        int[] iArr3 = dk.f7748b;
        if (i7 == iArr3.length) {
            dk.f7748b = Arrays.copyOf(iArr3, i7 + i7);
        }
        int[] iArr4 = dk.f7748b;
        int i8 = dk.f7749c;
        dk.f7749c = i8 + 1;
        iArr4[i8] = 3;
        c2228zK.write(123);
        Iterator it = ((C1904tK) abstractC1527mK.b().f15933a.entrySet()).iterator();
        while (((AbstractC2012vK) it).hasNext()) {
            C2066wK c2066wKB = ((C1850sK) it).b();
            String str = (String) c2066wKB.getKey();
            Objects.requireNonNull(str, "name == null");
            if (dk.i != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int iD = dk.d();
            if (iD != 3 && iD != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            dk.i = str;
            J(dk, (AbstractC1527mK) c2066wKB.getValue());
        }
        dk.b(3, 5, '}');
    }
}
