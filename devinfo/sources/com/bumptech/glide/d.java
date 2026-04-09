package com.bumptech.glide;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.w3;
import d.d0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.u;
import km.y;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d {
    public static int C(int i4, Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final long D(int i4, wk.c cVar) {
        nk.k.e(cVar, "unit");
        return cVar.compareTo(wk.c.SECONDS) <= 0 ? n(e.p(i4, cVar, wk.c.NANOSECONDS)) : E(i4, cVar);
    }

    public static final long E(long j, wk.c cVar) {
        nk.k.e(cVar, "unit");
        wk.c cVar2 = wk.c.NANOSECONDS;
        long jP = e.p(4611686018426999999L, cVar2, cVar);
        return ((-jP) > j || j > jP) ? m(ci.b.f(e.o(j, cVar, wk.c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : n(e.p(j, cVar, cVar2));
    }

    public static com.google.android.gms.internal.measurement.n F(Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.n.K8;
        }
        if (obj instanceof String) {
            return new q((String) obj);
        }
        if (obj instanceof Double) {
            return new com.google.android.gms.internal.measurement.g((Double) obj);
        }
        if (obj instanceof Long) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new com.google.android.gms.internal.measurement.g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new com.google.android.gms.internal.measurement.e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            com.google.android.gms.internal.measurement.d dVar = new com.google.android.gms.internal.measurement.d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dVar.p(dVar.m(), F(it.next()));
            }
            return dVar;
        }
        com.google.android.gms.internal.measurement.k kVar = new com.google.android.gms.internal.measurement.k();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            com.google.android.gms.internal.measurement.n nVarF = F(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                kVar.a((String) string, nVarF);
            }
        }
        return kVar;
    }

    public static com.google.android.gms.internal.measurement.n G(w3 w3Var) {
        if (w3Var == null) {
            return com.google.android.gms.internal.measurement.n.J8;
        }
        int iX = w3Var.x() - 1;
        if (iX == 1) {
            return w3Var.r() ? new q(w3Var.s()) : com.google.android.gms.internal.measurement.n.Q8;
        }
        if (iX == 2) {
            return w3Var.v() ? new com.google.android.gms.internal.measurement.g(Double.valueOf(w3Var.w())) : new com.google.android.gms.internal.measurement.g(null);
        }
        if (iX == 3) {
            return w3Var.t() ? new com.google.android.gms.internal.measurement.e(Boolean.valueOf(w3Var.u())) : new com.google.android.gms.internal.measurement.e(null);
        }
        if (iX != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listP = w3Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(G((w3) it.next()));
        }
        return new com.google.android.gms.internal.measurement.o(w3Var.q(), arrayList);
    }

    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static ak.j c(ak.j jVar) {
        ak.g gVar = jVar.f464a;
        gVar.b();
        return gVar.f455i > 0 ? jVar : ak.j.f463b;
    }

    public static final Bundle d(yj.i... iVarArr) {
        Bundle bundle = new Bundle(iVarArr.length);
        for (yj.i iVar : iVarArr) {
            String str = (String) iVar.f37638a;
            Object obj = iVar.f37639b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                nk.k.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final int f(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static void g(int i4) {
        if (2 > i4 || i4 >= 37) {
            StringBuilder sbW = u.w(i4, "radix ", " was not in valid range ");
            sbW.append(new sk.d(2, 36, 1));
            throw new IllegalArgumentException(sbW.toString());
        }
    }

    public static float h(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static int i(int i4, int i10, int i11) {
        return i4 < i10 ? i10 : i4 > i11 ? i11 : i4;
    }

    public static final void j(y yVar, String str, String str2) {
        nk.k.e(yVar, "<this>");
        nk.k.e(str, "name");
        nk.k.e(str2, "value");
        ArrayList arrayList = (ArrayList) yVar.f28522b;
        arrayList.add(str);
        arrayList.add(vk.i.V0(str2).toString());
    }

    public static i1.n k(i1.n nVar, mk.f fVar) {
        return nVar.b(new i1.h(fVar));
    }

    public static final long l() {
        return Thread.currentThread().getId();
    }

    public static final long m(long j) {
        long j8 = (j << 1) + 1;
        int i4 = wk.a.f36814d;
        int i10 = wk.b.f36816a;
        return j8;
    }

    public static final long n(long j) {
        long j8 = j << 1;
        int i4 = wk.a.f36814d;
        int i10 = wk.b.f36816a;
        return j8;
    }

    public static final boolean o(char c9, char c10, boolean z3) {
        if (c9 == c10) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static int p(int i4) {
        if (i4 >= 1 && i4 <= 32) {
            return 0;
        }
        if (i4 == 33 || i4 == 39) {
            return 6;
        }
        if ((i4 >= 40 && i4 <= 41) || i4 == 46 || i4 == 48 || i4 == 49 || i4 == 51) {
            return 6;
        }
        if (i4 >= 65 && i4 <= 96) {
            return 1;
        }
        if (i4 >= 193 && i4 <= 200) {
            return 3;
        }
        if (i4 < 201 || i4 > 235) {
            return (i4 < 301 || i4 > 336) ? -1 : 4;
        }
        return 2;
    }

    public static final void r(String str) {
        nk.k.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                g(16);
                String string = Integer.toString(cCharAt, 16);
                nk.k.d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i4);
                sb2.append(" in header name: ");
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static final void s(String str, String str2) {
        nk.k.e(str, "value");
        nk.k.e(str2, "name");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                g(16);
                String string = Integer.toString(cCharAt, 16);
                nk.k.d(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i4);
                sb2.append(" in ");
                sb2.append(str2);
                sb2.append(" value");
                sb2.append(sl.f.j(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static boolean t(MotionEvent motionEvent, int i4) {
        return (motionEvent.getSource() & i4) == i4;
    }

    public static boolean u(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }

    public static final i1.n v(i1.n nVar, u0.p pVar) {
        if (nVar.a(i1.i.f25550a)) {
            return nVar;
        }
        pVar.S(1219399079, null, 0, null);
        i1.n nVar2 = (i1.n) nVar.c(i1.k.f25553a, new i1.j(0, pVar));
        pVar.p(false);
        return nVar2;
    }

    public static final i1.n w(i1.n nVar, u0.p pVar) {
        pVar.W(439770924);
        i1.n nVarV = v(nVar, pVar);
        pVar.p(false);
        return nVarV;
    }

    public static LinkedHashSet x(Set set, Iterable iterable) {
        nk.k.e(set, "<this>");
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.H(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        zj.n.W(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public abstract void A();

    public abstract void B();

    public boolean e() {
        return false;
    }

    public abstract Object q(q5.b bVar, ck.c cVar);

    public abstract void z(d0 d0Var, d0 d0Var2, Window window, View view, boolean z3, boolean z10);

    public void y() {
    }

    public void b(Window window) {
    }
}
