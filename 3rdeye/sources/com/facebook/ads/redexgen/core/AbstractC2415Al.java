package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2415Al<E> extends AbstractC3811ma<E> implements Set<E> {
    public static byte[] A01 = null;
    public static String[] A02 = {"tpMJzZrhhsrMkwhOFEYR9GbFlaKVIskH", "YlBA8T7Fro2", "USXGP8OuBAzNSq5CbRyfQ0SKNWZdvns1", "IwkjEd2x85ogj6Hkpqc", "vhSxYEQIRpWfy1n6I2fIJfhoZxh6fLOY", "PMh9AUA5ndLdUxX8KVZJ5S1GU2oeFGKJ", "nfsou9g6KKUnvuudu0UQjvY", "janJ9NtfQ2imEKBo1ypA"};
    public static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    public transient AbstractC2416Am<E> A00;

    public static String A0B(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A01 = new byte[]{-55, -25, -39, -108, -57, -39, -26, -35, -43, -32, -35, -18, -39, -40, -70, -29, -26, -31, -67, -55, -58, -58, -65, -67, -50, -61, -55, -56, 122, -50, -55, -55, 122, -58, -69, -52, -63, -65};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC3811ma
    public AbstractC2416Am<E> A0J() {
        AbstractC2416Am<E> abstractC2416Am = this.A00;
        if (abstractC2416Am != null) {
            return abstractC2416Am;
        }
        AbstractC2416Am<E> abstractC2416AmA0M = A0M();
        this.A00 = abstractC2416AmA0M;
        return abstractC2416AmA0M;
    }

    /* renamed from: A0N */
    public abstract AbstractC3983pg<E> iterator();

    static {
        A0C();
    }

    public static int A03(int setSize) {
        int iMax = Math.max(setSize, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        AbstractC3614jA.A0E(iMax < 1073741824, A0B(18, 20, 20));
        return 1073741824;
    }

    public static <E> AbstractC2415Al<E> A04(int n9, Object... elements) {
        Object[] objArrCopyOf = elements;
        switch (n9) {
            case 0:
                C1W c1wA09 = A09();
                if (A02[1].length() == 11) {
                    A02[6] = "xMSzqHeYX9fl0z6G3xaNHOB";
                    return c1wA09;
                }
                break;
            case 1:
                return A0A(Objects.requireNonNull(objArrCopyOf[0]));
            default:
                int iA03 = A03(n9);
                Object[] objArr = new Object[iA03];
                int i = iA03 - 1;
                int uniques = 0;
                int i10 = 0;
                for (int j4 = 0; j4 < n9; j4++) {
                    Object objA00 = AbstractC3924oR.A00(objArrCopyOf[j4], j4);
                    int iHashCode = objA00.hashCode();
                    int tableSize = AbstractC3805mU.A00(iHashCode);
                    while (true) {
                        int i11 = tableSize & i;
                        Object obj = objArr[i11];
                        if (obj == null) {
                            int index = i10 + 1;
                            int tableSize2 = A02[3].length();
                            if (tableSize2 == 32) {
                                break;
                            } else {
                                String[] strArr = A02;
                                strArr[0] = "Zw143axrDatzvvuiLOoxXPNJBQDLOllI";
                                strArr[2] = "imRh362HWPXwfaqxgHfljoqeqcFI5Kex";
                                objArrCopyOf[i10] = objA00;
                                objArr[i11] = objA00;
                                uniques += iHashCode;
                                i10 = index;
                            }
                        } else {
                            if (obj.equals(objA00)) {
                                break;
                            }
                            tableSize++;
                        }
                    }
                }
                Arrays.fill(objArrCopyOf, i10, n9, (Object) null);
                if (i10 == 1) {
                    return new C1J(Objects.requireNonNull(objArrCopyOf[0]));
                }
                int tableSize3 = A03(i10);
                if (tableSize3 < iA03 / 2) {
                    return A04(i10, objArrCopyOf);
                }
                if (A0D(i10, objArrCopyOf.length)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
                }
                return new C1W(objArrCopyOf, uniques, objArr, i, i10);
        }
        throw new RuntimeException();
    }

    public static <E> AbstractC2415Al<E> A05(E e12, E e22) {
        return A04(2, e12, e22);
    }

    public static <E> AbstractC2415Al<E> A06(E e12, E e22, E e32) {
        return A04(3, e12, e22, e32);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Al != com.google.common.collect.ImmutableSet<E> */
    public static <E> AbstractC2415Al<E> A07(Collection<? extends E> elements) {
        if ((elements instanceof AbstractC2415Al) && !(elements instanceof SortedSet)) {
            AbstractC2415Al<E> abstractC2415Al = (AbstractC2415Al) elements;
            if (!abstractC2415Al.A0K()) {
                return abstractC2415Al;
            }
        }
        Object[] array = elements.toArray();
        int length = array.length;
        if (A02[3].length() == 32) {
            throw new RuntimeException();
        }
        A02[4] = "vJyPhnBCGNruVJXdAMH0mrO2J76B9Swt";
        return A04(length, array);
    }

    public static <E> AbstractC2415Al<E> A08(E[] elements) {
        switch (elements.length) {
            case 0:
                return A09();
            case 1:
                C1J c1jA0A = A0A(elements[0]);
                if (A02[3].length() == 32) {
                    throw new RuntimeException();
                }
                A02[7] = "14gyZ0VPjhYiFYlwFK2N";
                return c1jA0A;
            default:
                return A04(elements.length, (Object[]) elements.clone());
        }
    }

    public static <E> AbstractC2415Al<E> A09() {
        return C1W.A05;
    }

    public static <E> AbstractC2415Al<E> A0A(E element) {
        return new C1J(element);
    }

    public static boolean A0D(int actualUnique, int expectedUnique) {
        return actualUnique < (expectedUnique >> 1) + (expectedUnique >> 2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Al != com.google.common.collect.ImmutableSet<E> */
    public AbstractC2416Am<E> A0M() {
        return AbstractC2416Am.A06(toArray());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Al != com.google.common.collect.ImmutableSet<E> */
    public boolean A0O() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Al != com.google.common.collect.ImmutableSet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof AbstractC2415Al) && A0O() && ((AbstractC2415Al) object).A0O() && hashCode() != object.hashCode()) {
            return false;
        }
        return AbstractC3952ou.A09(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Al != com.google.common.collect.ImmutableSet<E> */
    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC3952ou.A00(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Al != com.google.common.collect.ImmutableSet<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0B(0, 18, 46));
    }
}
