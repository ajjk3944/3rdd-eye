package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6484j;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;
import p.AbstractC7173a;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public long[] f54928a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f54929b;

    /* renamed from: c, reason: collision with root package name */
    public int f54930c;

    /* renamed from: d, reason: collision with root package name */
    public int f54931d;

    public class a implements Set, InterfaceC6944a {
        public a() {
        }

        public int b() {
            return T.this.f54931d;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return T.this.a(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection elements) {
            AbstractC6492s.i(elements, "elements");
            T t10 = T.this;
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                if (!t10.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return T.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC6484j.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] array) {
            AbstractC6492s.i(array, "array");
            return AbstractC6484j.b(this, array);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj == T.this ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ T(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String g(T t10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return t10.f(charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f54930c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f54928a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f54929b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC6492s.d(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.T.a(java.lang.Object):boolean");
    }

    public final int b() {
        return this.f54930c;
    }

    public final int c() {
        return this.f54931d;
    }

    public final boolean d() {
        return this.f54931d == 0;
    }

    public final boolean e() {
        return this.f54931d != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof o.T
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            o.T r1 = (o.T) r1
            int r3 = r1.c()
            int r5 = r17.c()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.f54929b
            long[] r5 = r0.f54928a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L61
            r7 = r4
        L25:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3f:
            if (r12 >= r10) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L56
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.a(r13)
            if (r13 != 0) goto L56
            return r4
        L56:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L5a:
            if (r10 != r11) goto L61
        L5c:
            if (r7 == r6) goto L61
            int r7 = r7 + 1
            goto L25
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.T.equals(java.lang.Object):boolean");
    }

    public final String f(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f54929b;
        long[] jArr = this.f54928a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr[(i11 << 3) + i15];
                            if (i12 == i10) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb2.append(separator);
                            }
                            if (interfaceC6835l == null) {
                                sb2.append(obj);
                            } else {
                                sb2.append((CharSequence) interfaceC6835l.invoke(obj));
                            }
                            i12++;
                            i13 = 8;
                        }
                        j10 >>= i13;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
            sb2.append(postfix);
        } else {
            sb2.append(postfix);
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public int hashCode() {
        Object[] objArr = this.f54929b;
        long[] jArr = this.f54928a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            iHashCode += obj != null ? obj.hashCode() : 0;
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 == length) {
                    i10 = iHashCode;
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public String toString() {
        return g(this, null, "[", "]", 0, null, new b(), 25, null);
    }

    private T() {
        this.f54928a = S.f54926a;
        this.f54929b = AbstractC7173a.f57283c;
    }
}
