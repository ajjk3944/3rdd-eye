package jm;

import a0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import androidx.lifecycle.f1;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.measurement.d5;
import com.liuzh.deviceinfo.R;
import d3.j;
import d6.c;
import h3.m;
import i0.f;
import i2.q;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import je.u;
import me.t1;
import nk.e;
import nk.k;
import p.k2;
import t6.h;
import t6.i;
import t6.v;
import wd.b;
import zj.n;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static f1 f27720a;

    public static byte[] A(h hVar) {
        k.e(hVar, "data");
        HashMap map = hVar.f34356a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    B(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                k.b(byteArray);
                return byteArray;
            } finally {
            }
        } catch (IOException e2) {
            v.e().d(i.f34367a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void B(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i4;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + nk.v.a(obj.getClass()).c());
            }
            Object[] objArr = (Object[]) obj;
            e eVarA = nk.v.a(objArr.getClass());
            if (eVarA.equals(nk.v.a(Boolean[].class))) {
                i4 = 8;
            } else if (eVarA.equals(nk.v.a(Byte[].class))) {
                i4 = 9;
            } else if (eVarA.equals(nk.v.a(Integer[].class))) {
                i4 = 10;
            } else if (eVarA.equals(nk.v.a(Long[].class))) {
                i4 = 11;
            } else if (eVarA.equals(nk.v.a(Float[].class))) {
                i4 = 12;
            } else if (eVarA.equals(nk.v.a(Double[].class))) {
                i4 = 13;
            } else {
                if (!eVarA.equals(nk.v.a(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + nk.v.a(objArr.getClass()).b());
                }
                i4 = 14;
            }
            dataOutputStream.writeByte(i4);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i4 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i4 == 9) {
                    Byte b10 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                } else if (i4 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i4 == 11) {
                    Long l10 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                } else if (i4 == 12) {
                    Float f10 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
                } else if (i4 == 13) {
                    Double d10 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                } else if (i4 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static String C(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strN;
        int i4 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                strN = "null";
            } else {
                try {
                    strN = obj.toString();
                } catch (Exception e2) {
                    String strE = d.h.E(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strE), (Throwable) e2);
                    strN = g.n("<", strE, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i10] = strN;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(objArr[i4]);
            i4++;
            i11 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i4 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i4]);
            for (int i12 = i4 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void D(int i4, int i10) {
        String strJ;
        if (i4 < 0 || i4 >= i10) {
            if (i4 < 0) {
                strJ = t1.J("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(d.h.q(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
                }
                strJ = t1.J("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static void E(int i4, int i10, int i11) {
        if (i4 < 0 || i10 < i4 || i10 > i11) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i11) ? F(i4, i11, "start index") : (i10 < 0 || i10 > i11) ? F(i10, i11, "end index") : t1.J("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i4)));
        }
    }

    public static String F(int i4, int i10, String str) {
        if (i4 < 0) {
            return t1.J("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i10 >= 0) {
            return t1.J("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(d.h.q(i10, "negative size: ", new StringBuilder(String.valueOf(i10).length() + 15)));
    }

    public static final boolean a(l1.e eVar, long j) {
        if (!eVar.f25554a.f25565n) {
            return false;
        }
        q qVar = (q) i2.k.s(eVar).G.f19257d;
        if (!qVar.R.f25565n) {
            return false;
        }
        long jE = qVar.E(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        long j8 = eVar.f28544q;
        float f10 = ((int) (j8 >> 32)) + fIntBitsToFloat;
        float f11 = ((int) (j8 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f10) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = c(r8, r9, r10)
            boolean r1 = c(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = s(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.a.b(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean c(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static Object f(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final rj.k g(rj.a aVar) {
        String strC = aVar.f32986c.c();
        k.d(strC, "getPath(...)");
        k.d(strC.toLowerCase(Locale.ROOT), "toLowerCase(...)");
        return new rj.k(!aVar.b(), !vk.i.y0(r0, "cache", false), !vk.i.y0(r0, "temp", false), aVar.f32986c.f407b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t6.h h(byte[] r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jm.a.h(byte[]):t6.h");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable i(DataInputStream dataInputStream, byte b10) throws IOException {
        if (b10 == 0) {
            return null;
        }
        if (b10 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b10 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b10 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b10 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b10 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b10 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b10 == 7) {
            return dataInputStream.readUTF();
        }
        int i4 = 0;
        if (b10 == 8) {
            int i10 = dataInputStream.readInt();
            ?? r02 = new Boolean[i10];
            while (i4 < i10) {
                r02[i4] = Boolean.valueOf(dataInputStream.readBoolean());
                i4++;
            }
            return r02;
        }
        if (b10 == 9) {
            int i11 = dataInputStream.readInt();
            ?? r03 = new Byte[i11];
            while (i4 < i11) {
                r03[i4] = Byte.valueOf(dataInputStream.readByte());
                i4++;
            }
            return r03;
        }
        if (b10 == 10) {
            int i12 = dataInputStream.readInt();
            ?? r04 = new Integer[i12];
            while (i4 < i12) {
                r04[i4] = Integer.valueOf(dataInputStream.readInt());
                i4++;
            }
            return r04;
        }
        if (b10 == 11) {
            int i13 = dataInputStream.readInt();
            ?? r05 = new Long[i13];
            while (i4 < i13) {
                r05[i4] = Long.valueOf(dataInputStream.readLong());
                i4++;
            }
            return r05;
        }
        if (b10 == 12) {
            int i14 = dataInputStream.readInt();
            ?? r06 = new Float[i14];
            while (i4 < i14) {
                r06[i4] = Float.valueOf(dataInputStream.readFloat());
                i4++;
            }
            return r06;
        }
        if (b10 == 13) {
            int i15 = dataInputStream.readInt();
            ?? r07 = new Double[i15];
            while (i4 < i15) {
                r07[i4] = Double.valueOf(dataInputStream.readDouble());
                i4++;
            }
            return r07;
        }
        if (b10 != 14) {
            throw new IllegalStateException(u.r(b10, "Unsupported type "));
        }
        int i16 = dataInputStream.readInt();
        ?? r12 = new String[i16];
        while (i4 < i16) {
            String utf = dataInputStream.readUTF();
            if (k.a(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r12[i4] = utf;
            i4++;
        }
        return r12;
    }

    public static ColorStateList j(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList colorStateListR;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateListR = b.r(resourceId, context)) == null) ? typedArray.getColorStateList(i4) : colorStateListR;
    }

    public static ColorStateList k(Context context, f fVar, int i4) {
        int resourceId;
        ColorStateList colorStateListR;
        TypedArray typedArray = (TypedArray) fVar.f25417c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (colorStateListR = b.r(resourceId, context)) == null) ? fVar.y(i4) : colorStateListR;
    }

    public static Drawable l(int i4, Context context) {
        return k2.d().f(i4, context);
    }

    public static Drawable m(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable drawableL;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (drawableL = l(resourceId, context)) == null) ? typedArray.getDrawable(i4) : drawableL;
    }

    public static h3.k n(h3.i iVar) {
        h3.h hVar = new h3.h();
        hVar.f24835c = new m();
        h3.k kVar = new h3.k(hVar);
        hVar.f24834b = kVar;
        hVar.f24833a = iVar.getClass();
        try {
            Object objI = iVar.i(hVar);
            if (objI == null) {
                return kVar;
            }
            hVar.f24833a = objI;
            return kVar;
        } catch (Exception e2) {
            kVar.f24839b.l(e2);
            return kVar;
        }
    }

    public static final int o(int i4, int i10) {
        return (i4 >> i10) & 31;
    }

    public static boolean p(int i4, Rect rect, Rect rect2) {
        if (i4 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i4 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i4 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i4 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static boolean q(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static uk.g r(mk.e eVar) {
        uk.g gVar = new uk.g();
        gVar.f35526d = a.a.h(gVar, gVar, eVar);
        return gVar;
    }

    public static int s(int i4, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i4 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i4 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i4 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static int t(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static x4.b u(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i4 = byteBufferDuplicate.getShort() & 65535;
        if (i4 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i4) {
                j = -1;
                break;
            }
            int i11 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j8 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i12 = 0; i12 < j8; i12++) {
                int i13 = byteBufferDuplicate.getInt();
                long j9 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    byteBufferDuplicate.position((int) (j9 + j));
                    x4.b bVar = new x4.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f446d = byteBufferDuplicate;
                    bVar.f443a = iPosition;
                    int i14 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f444b = i14;
                    bVar.f445c = ((ByteBuffer) bVar.f446d).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final List v(c cVar) {
        int iG = ii.a.g(cVar, FacebookMediationAdapter.KEY_ID);
        int iG2 = ii.a.g(cVar, "seq");
        int iG3 = ii.a.g(cVar, "from");
        int iG4 = ii.a.g(cVar, "to");
        ak.c cVarF = cm.g.f();
        while (cVar.P()) {
            cVarF.add(new z5.f((int) cVar.getLong(iG), (int) cVar.getLong(iG2), cVar.D(iG3), cVar.D(iG4)));
        }
        return n.n0(cm.g.d(cVarF));
    }

    public static final z5.i w(d6.a aVar, String str, boolean z3) throws Exception {
        c cVarS = aVar.S("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iG = ii.a.g(cVarS, "seqno");
            int iG2 = ii.a.g(cVarS, "cid");
            int iG3 = ii.a.g(cVarS, "name");
            int iG4 = ii.a.g(cVarS, "desc");
            if (iG != -1 && iG2 != -1 && iG3 != -1 && iG4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarS.P()) {
                    if (((int) cVarS.getLong(iG2)) >= 0) {
                        int i4 = (int) cVarS.getLong(iG);
                        String strD = cVarS.D(iG3);
                        String str2 = cVarS.getLong(iG4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i4), strD);
                        linkedHashMap2.put(Integer.valueOf(i4), str2);
                    }
                }
                List listO0 = n.o0(linkedHashMap.entrySet(), new androidx.recyclerview.widget.m(22));
                ArrayList arrayList = new ArrayList(o.T(listO0, 10));
                Iterator it = listO0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listR0 = n.r0(arrayList);
                List listO02 = n.o0(linkedHashMap2.entrySet(), new androidx.recyclerview.widget.m(23));
                ArrayList arrayList2 = new ArrayList(o.T(listO02, 10));
                Iterator it2 = listO02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                z5.i iVar = new z5.i(str, z3, listR0, n.r0(arrayList2));
                d5.c(cVarS, null);
                return iVar;
            }
            d5.c(cVarS, null);
            return null;
        } finally {
        }
    }

    public static final j x(o1.c cVar) {
        return new j(Math.round(cVar.f30366a), Math.round(cVar.f30367b), Math.round(cVar.f30368c), Math.round(cVar.f30369d));
    }

    public static int y() {
        ((p6.i) f27720a.f1137e).getClass();
        return R.style.AppTheme_FileAnalyzer;
    }

    public static z2.k z() {
        return (z2.k) ((p6.i) f27720a.f1137e).f31385a;
    }

    public ob.c d(Context context, Looper looper, va.o oVar, Object obj, ob.g gVar, ob.h hVar) {
        return e(context, looper, oVar, obj, (com.google.android.gms.common.api.internal.n) gVar, (com.google.android.gms.common.api.internal.n) hVar);
    }

    public ob.c e(Context context, Looper looper, va.o oVar, Object obj, com.google.android.gms.common.api.internal.n nVar, com.google.android.gms.common.api.internal.n nVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
