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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mm1 extends yo0 {

    /* renamed from: b, reason: collision with root package name */
    public static final mm1 f13958b = new mm1();

    public static void J(pm1 pm1Var, zl1 zl1Var) throws IOException {
        b5.e1 e1Var = pm1Var.f15047a;
        if (zl1Var == null || (zl1Var instanceof am1)) {
            if (pm1Var.f15054i != null) {
                pm1Var.g();
            }
            pm1Var.v();
            e1Var.write("null");
            return;
        }
        if (zl1Var instanceof dm1) {
            dm1 dm1VarD = zl1Var.d();
            Serializable serializable = dm1VarD.f10523a;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) serializable).booleanValue();
                    pm1Var.g();
                    pm1Var.v();
                    e1Var.write(true != zBooleanValue ? "false" : "true");
                    return;
                }
                String strA = dm1VarD.a();
                if (strA != null) {
                    pm1Var.g();
                    pm1Var.v();
                    pm1Var.m(strA);
                    return;
                } else {
                    if (pm1Var.f15054i != null) {
                        pm1Var.g();
                    }
                    pm1Var.v();
                    e1Var.write("null");
                    return;
                }
            }
            Number numberF = dm1VarD.f();
            pm1Var.g();
            String string = numberF.toString();
            Class<?> cls = numberF.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (pm1Var.f15053h != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                    }
                } else if (cls != Float.class && cls != Double.class && !pm1.j.matcher(string).matches()) {
                    String strValueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(a0.g.p(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
                }
            }
            pm1Var.v();
            e1Var.append((CharSequence) string);
            return;
        }
        boolean z3 = zl1Var instanceof yl1;
        if (z3) {
            pm1Var.g();
            pm1Var.v();
            int i4 = pm1Var.f15049c;
            int[] iArr = pm1Var.f15048b;
            if (i4 == iArr.length) {
                pm1Var.f15048b = Arrays.copyOf(iArr, i4 + i4);
            }
            int[] iArr2 = pm1Var.f15048b;
            int i10 = pm1Var.f15049c;
            pm1Var.f15049c = i10 + 1;
            iArr2[i10] = 1;
            e1Var.write(91);
            if (!z3) {
                throw new IllegalStateException("Not a JSON Array: ".concat(zl1Var.toString()));
            }
            ArrayList arrayList = ((yl1) zl1Var).f18797a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                J(pm1Var, (zl1) obj);
            }
            pm1Var.c(1, 2, ']');
            return;
        }
        if (!(zl1Var instanceof bm1)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zl1Var.getClass())));
        }
        pm1Var.g();
        pm1Var.v();
        int i12 = pm1Var.f15049c;
        int[] iArr3 = pm1Var.f15048b;
        if (i12 == iArr3.length) {
            pm1Var.f15048b = Arrays.copyOf(iArr3, i12 + i12);
        }
        int[] iArr4 = pm1Var.f15048b;
        int i13 = pm1Var.f15049c;
        pm1Var.f15049c = i13 + 1;
        iArr4[i13] = 3;
        e1Var.write(123);
        Iterator it = ((gm1) zl1Var.c().f9723a.entrySet()).iterator();
        while (((im1) it).hasNext()) {
            jm1 jm1VarB = ((fm1) it).b();
            String str = (String) jm1VarB.getKey();
            Objects.requireNonNull(str, "name == null");
            if (pm1Var.f15054i != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int iE = pm1Var.e();
            if (iE != 3 && iE != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            pm1Var.f15054i = str;
            J(pm1Var, (zl1) jm1VarB.getValue());
        }
        pm1Var.c(3, 5, '}');
    }
}
