package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o44 extends gi2 {
    public static final o44 j = new o44();

    public static void r0(r44 r44Var, b44 b44Var) throws IOException {
        n44 n44Var = r44Var.f;
        if (b44Var == null || (b44Var instanceof c44)) {
            if (r44Var.n != null) {
                r44Var.f();
            }
            r44Var.i();
            n44Var.write("null");
            return;
        }
        if (b44Var instanceof f44) {
            f44 f44VarC = b44Var.c();
            Serializable serializable = f44VarC.f;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) serializable).booleanValue();
                    r44Var.f();
                    r44Var.i();
                    n44Var.write(true != zBooleanValue ? "false" : "true");
                    return;
                }
                String strA = f44VarC.a();
                if (strA != null) {
                    r44Var.f();
                    r44Var.i();
                    r44Var.g(strA);
                    return;
                } else {
                    if (r44Var.n != null) {
                        r44Var.f();
                    }
                    r44Var.i();
                    n44Var.write("null");
                    return;
                }
            }
            Number numberD = f44VarC.d();
            r44Var.f();
            String string = numberD.toString();
            Class<?> cls = numberD.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (r44Var.m != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                    }
                } else if (cls != Float.class && cls != Double.class && !r44.o.matcher(string).matches()) {
                    String strValueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(ex0.m(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
                }
            }
            r44Var.i();
            n44Var.append((CharSequence) string);
            return;
        }
        boolean z = b44Var instanceof a44;
        if (z) {
            r44Var.f();
            r44Var.i();
            int i = r44Var.h;
            int[] iArr = r44Var.g;
            if (i == iArr.length) {
                r44Var.g = Arrays.copyOf(iArr, i + i);
            }
            int[] iArr2 = r44Var.g;
            int i2 = r44Var.h;
            r44Var.h = i2 + 1;
            iArr2[i2] = 1;
            n44Var.write(91);
            if (!z) {
                throw new IllegalStateException("Not a JSON Array: ".concat(b44Var.toString()));
            }
            ArrayList arrayList = ((a44) b44Var).f;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                r0(r44Var, (b44) obj);
            }
            r44Var.a(1, 2, ']');
            return;
        }
        if (!(b44Var instanceof d44)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(b44Var.getClass())));
        }
        r44Var.f();
        r44Var.i();
        int i4 = r44Var.h;
        int[] iArr3 = r44Var.g;
        if (i4 == iArr3.length) {
            r44Var.g = Arrays.copyOf(iArr3, i4 + i4);
        }
        int[] iArr4 = r44Var.g;
        int i5 = r44Var.h;
        r44Var.h = i5 + 1;
        iArr4[i5] = 3;
        n44Var.write(123);
        Iterator it = ((i44) b44Var.b().f.entrySet()).iterator();
        while (((h44) it).hasNext()) {
            j44 j44VarA = ((h44) it).a();
            String str = (String) j44VarA.getKey();
            Objects.requireNonNull(str, "name == null");
            if (r44Var.n != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int iC = r44Var.c();
            if (iC != 3 && iC != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            r44Var.n = str;
            r0(r44Var, (b44) j44VarA.getValue());
        }
        r44Var.a(3, 5, '}');
    }
}
