package i3;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.telephony.NetworkRegistrationInfo;
import android.telephony.ServiceState;
import android.widget.EdgeEffect;
import androidx.core.graphics.drawable.IconCompat;
import at.k;
import at.p;
import bf.n;
import br.l;
import br.x;
import ca.q;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.infrastructure.network.URLRequest;
import g4.j;
import io.sentry.b2;
import io.sentry.b5;
import io.sentry.g4;
import io.sentry.protocol.d0;
import io.sentry.protocol.e0;
import io.sentry.protocol.r;
import io.sentry.protocol.t;
import io.sentry.s;
import io.sentry.u0;
import io.sentry.x2;
import io.sentry.x5;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import mq.o;
import nq.i;
import org.json.JSONException;
import org.json.JSONObject;
import qb.v;
import rr.h;
import ur.k0;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static volatile e f11192b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile ArrayList f11193c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11194a = 11;

    public static final long A(long j, long j7) {
        return ((((int) (j >> 32)) + ((int) (j7 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j7 & 4294967295L))) & 4294967295L);
    }

    public static void B(Context context, d dVar) {
        IconCompat iconCompat;
        int i10;
        InputStream inputStreamF;
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat2;
        context.getClass();
        int i11 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = i11 >= 25 ? b.f(context.getSystemService(b.g())).getMaxShortcutCountPerActivity() : 5;
        if (maxShortcutCountPerActivity == 0) {
            return;
        }
        if (i11 <= 29 && (iconCompat = dVar.f11190f) != null && (((i10 = iconCompat.f1222a) == 6 || i10 == 4) && (inputStreamF = iconCompat.f(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamF)) != null)) {
            if (i10 == 6) {
                iconCompat2 = new IconCompat(5);
                iconCompat2.f1223b = bitmapDecodeStream;
            } else {
                iconCompat2 = new IconCompat(1);
                iconCompat2.f1223b = bitmapDecodeStream;
            }
            dVar.f11190f = iconCompat2;
        }
        if (i11 >= 30) {
            b.f(context.getSystemService(b.g())).pushDynamicShortcut(dVar.a());
        } else if (i11 >= 25) {
            ShortcutManager shortcutManagerF = b.f(context.getSystemService(b.g()));
            if (shortcutManagerF.isRateLimitingActive()) {
                return;
            }
            List dynamicShortcuts = shortcutManagerF.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutManagerF.removeDynamicShortcuts(Arrays.asList(f.a(dynamicShortcuts)));
            }
            shortcutManagerF.addDynamicShortcuts(Arrays.asList(dVar.a()));
        }
        if (f11192b == null) {
            try {
                f11192b = (e) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, g.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f11192b == null) {
                f11192b = new e();
            }
        }
        try {
            f11192b.getClass();
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() >= maxShortcutCountPerActivity) {
                Iterator it = arrayList.iterator();
                char c4 = 65535;
                String str = null;
                while (it.hasNext()) {
                    d dVar2 = (d) it.next();
                    dVar2.getClass();
                    if (c4 < 0) {
                        str = dVar2.f11186b;
                        c4 = 0;
                    }
                }
                Arrays.asList(str);
            }
            Arrays.asList(dVar);
            Iterator it2 = ((ArrayList) t(context)).iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(dVar);
                throw null;
            }
        } catch (Exception unused2) {
            Iterator it3 = ((ArrayList) t(context)).iterator();
            if (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Collections.singletonList(dVar);
                throw null;
            }
        } catch (Throwable th2) {
            Iterator it4 = ((ArrayList) t(context)).iterator();
            if (!it4.hasNext()) {
                G(context, dVar.f11186b);
                throw th2;
            }
            if (it4.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(dVar);
            throw null;
        }
        G(context, dVar.f11186b);
    }

    public static final byte[] C(InputStream inputStream) throws IOException {
        l.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        int i10 = inputStream.read(bArr);
        while (i10 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i10);
            i10 = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final List D(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        nq.c cVar = new nq.c(10);
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            l.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            l.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new k7.c(string, i10, i11, string2));
        }
        return o.L0(e5.l(cVar));
    }

    public static int E(int i10, fb.f fVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case j.STRING_FIELD_NUMBER /* 5 */:
                return 576 << (i10 - 2);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return fVar.o() + 1;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return fVar.t() + 1;
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static final k7.d F(p7.b bVar, String str, boolean z10) throws IOException {
        Cursor cursorB = bVar.b("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorB.getColumnIndex("seqno");
            int columnIndex2 = cursorB.getColumnIndex("cid");
            int columnIndex3 = cursorB.getColumnIndex("name");
            int columnIndex4 = cursorB.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorB.moveToNext()) {
                    if (cursorB.getInt(columnIndex2) >= 0) {
                        int i10 = cursorB.getInt(columnIndex);
                        String string = cursorB.getString(columnIndex3);
                        String str2 = cursorB.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        l.d(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                l.d(collectionValues, "columnsMap.values");
                List listQ0 = o.Q0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                l.d(collectionValues2, "ordersMap.values");
                k7.d dVar = new k7.d(str, z10, listQ0, o.Q0(collectionValues2));
                cursorB.close();
                return dVar;
            }
            cursorB.close();
            return null;
        } finally {
        }
    }

    public static void G(Context context, String str) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            b.f(context.getSystemService(b.g())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) t(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            Collections.singletonList(str);
            throw null;
        }
    }

    public static Set H(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        l.d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static boolean I(x5 x5Var, x5 x5Var2, boolean z10) {
        boolean z11 = io.sentry.util.g.f12810a;
        if (!z11 && (x5Var2.getVersionDetector() instanceof x2)) {
            x5Var2.setVersionDetector(new s(x5Var2, 1));
        }
        if (!x5Var2.getVersionDetector().a()) {
            return !z10 || x5Var == null || x5Var2.isForceInit() || x5Var.getInitPriority().ordinal() <= x5Var2.getInitPriority().ordinal();
        }
        x5Var2.getLogger().m(b5.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException(h0.b.o("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z11 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
    }

    public static int J(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final int K(a.a aVar, m8.g gVar) {
        if (aVar instanceof m8.a) {
            return ((m8.a) aVar).f16320f;
        }
        int i10 = q8.a.f20725a[gVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new n();
    }

    public static String L(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + ic.a.P(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + ic.a.P(Float.intBitsToFloat(i10)) + ", " + ic.a.P(Float.intBitsToFloat(i11)) + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float a(v1.u r6, boolean r7, v1.j[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.b(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.g.a(v1.u, boolean, v1.j[], float):float");
    }

    public static i b(i iVar) {
        nq.f fVar = iVar.f18516a;
        fVar.b();
        return fVar.E > 0 ? iVar : i.f18515d;
    }

    public static boolean c(fb.f fVar, q qVar, int i10, ca.n nVar) {
        long jP = fVar.p();
        long j = jP >>> 16;
        if (j != i10) {
            return false;
        }
        boolean z10 = (j & 1) == 1;
        int i11 = (int) ((jP >> 12) & 15);
        int i12 = (int) ((jP >> 8) & 15);
        int i13 = (int) ((jP >> 4) & 15);
        int i14 = (int) ((jP >> 1) & 7);
        boolean z11 = (jP & 1) == 1;
        if (i13 <= 7) {
            if (i13 != qVar.f3497g - 1) {
                return false;
            }
        } else if (i13 > 10 || qVar.f3497g != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == qVar.f3499i) || z11) {
            return false;
        }
        try {
            long jU = fVar.u();
            if (!z10) {
                jU *= qVar.f3492b;
            }
            nVar.f3485a = jU;
            int iE = E(i11, fVar);
            if (iE == -1 || iE > qVar.f3492b) {
                return false;
            }
            int i15 = qVar.f3495e;
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != qVar.f3496f) {
                        return false;
                    }
                } else if (i12 != 12) {
                    if (i12 > 14) {
                        return false;
                    }
                    int iT = fVar.t();
                    if (i12 == 14) {
                        iT *= 10;
                    }
                    if (iT != i15) {
                        return false;
                    }
                } else if (fVar.o() * 1000 != i15) {
                    return false;
                }
            }
            int iO = fVar.o();
            int i16 = fVar.f8801b;
            byte[] bArr = fVar.f8800a;
            int i17 = i16 - 1;
            int i18 = 0;
            for (int i19 = fVar.f8801b; i19 < i17; i19++) {
                i18 = v.f20838m[i18 ^ (bArr[i19] & 255)];
            }
            int i20 = v.f20828a;
            return iO == i18;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static cj.a d(cj.a aVar, h hVar, xr.o oVar, int i10) {
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        l.e(aVar, "<this>");
        return new cj.a((ds.a) aVar.f3974d, oVar != null ? new bj.c(aVar, hVar, oVar, 0) : (ds.e) aVar.f3975g, kc.f.E(lq.j.NONE, new ah.d(aVar, 8, hVar)));
    }

    public static void e(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                ch.n.b("FileUtils", Thread.currentThread().getName() + " already closed the stream.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f(rr.u r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r6 = r6 & 2
            if (r6 == 0) goto Le
            r1 = r2
        Le:
            java.lang.String r6 = "<this>"
            br.l.e(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r1 == 0) goto L34
            boolean r1 = r5 instanceof rr.k
            if (r1 == 0) goto L21
            java.lang.String r1 = "<init>"
            goto L31
        L21:
            r1 = r5
            ur.n r1 = (ur.n) r1
            qs.g r1 = r1.getName()
            java.lang.String r1 = r1.b()
            java.lang.String r2 = "name.asString()"
            br.l.d(r1, r2)
        L31:
            r6.append(r1)
        L34:
            java.lang.String r1 = "("
            r6.append(r1)
            ur.v r1 = r5.j0()
            rt.c r2 = rt.c.f21785d
            if (r1 == 0) goto L55
            ht.x r1 = r1.getType()
            java.lang.String r3 = "it.type"
            br.l.d(r1, r3)
            js.v r3 = js.v.k
            java.lang.Object r1 = com.google.android.gms.internal.measurement.b4.M(r1, r3, r2)
            js.m r1 = (js.m) r1
            r6.append(r1)
        L55:
            java.util.List r1 = r5.Y()
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r1.next()
            ur.q0 r3 = (ur.q0) r3
            ur.r0 r3 = (ur.r0) r3
            ht.x r3 = r3.getType()
            java.lang.String r4 = "parameter.type"
            br.l.d(r3, r4)
            js.v r4 = js.v.k
            java.lang.Object r3 = com.google.android.gms.internal.measurement.b4.M(r3, r4, r2)
            js.m r3 = (js.m) r3
            r6.append(r3)
            goto L5d
        L80:
            java.lang.String r1 = ")"
            r6.append(r1)
            if (r0 == 0) goto Lc6
            boolean r0 = r5 instanceof rr.k
            if (r0 == 0) goto L8c
            goto Lae
        L8c:
            ht.x r0 = r5.i()
            br.l.b(r0)
            qs.g r1 = or.h.f19672e
            qs.e r1 = or.n.f19692d
            boolean r0 = or.h.D(r0, r1)
            if (r0 == 0) goto Lb4
            ht.x r0 = r5.i()
            br.l.b(r0)
            boolean r0 = ht.a1.e(r0)
            if (r0 != 0) goto Lb4
            boolean r0 = r5 instanceof ur.i0
            if (r0 != 0) goto Lb4
        Lae:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lc6
        Lb4:
            ht.x r5 = r5.i()
            br.l.b(r5)
            js.v r0 = js.v.k
            java.lang.Object r5 = com.google.android.gms.internal.measurement.b4.M(r5, r0, r2)
            js.m r5 = (js.m) r5
            r6.append(r5)
        Lc6:
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            br.l.d(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.g.f(rr.u, int):java.lang.String");
    }

    public static final String g(rr.b bVar) {
        l.e(bVar, "<this>");
        if (!ts.d.o(bVar)) {
            rr.l lVarO = bVar.o();
            rr.f fVar = lVarO instanceof rr.f ? (rr.f) lVarO : null;
            if (fVar != null && !fVar.getName().f21036d) {
                rr.b bVarA = bVar.u1();
                k0 k0Var = bVarA instanceof k0 ? (k0) bVarA : null;
                if (k0Var != null) {
                    return dr.a.I(fVar, f(k0Var, 3));
                }
            }
        }
        return null;
    }

    public static final cj.a h(cj.a aVar, sr.h hVar) {
        l.e(aVar, "<this>");
        l.e(hVar, "additionalAnnotations");
        return hVar.isEmpty() ? aVar : new cj.a((ds.a) aVar.f3974d, (ds.e) aVar.f3975g, kc.f.E(lq.j.NONE, new ah.d(aVar, 9, hVar)));
    }

    public static boolean i(g4 g4Var, String str, b2 b2Var, u0 u0Var) {
        int i10;
        int i11;
        i10 = 8;
        i11 = 0;
        switch (str) {
            case "debug_meta":
                g4Var.J = (io.sentry.protocol.d) b2Var.r0(u0Var, new io.sentry.clientreport.a(i10));
                return true;
            case "server_name":
                g4Var.G = b2Var.t0();
                return true;
            case "contexts":
                g4Var.f12269d.k(io.sentry.clientreport.a.c(b2Var, u0Var));
                return true;
            case "environment":
                g4Var.B = b2Var.t0();
                return true;
            case "breadcrumbs":
                g4Var.I = b2Var.f0(u0Var, new io.sentry.d(i11));
                return true;
            case "sdk":
                g4Var.f12270g = (r) b2Var.r0(u0Var, new io.sentry.clientreport.a(20));
                return true;
            case "dist":
                g4Var.H = b2Var.t0();
                return true;
            case "tags":
                g4Var.f12272x = b4.O((Map) b2Var.q0());
                return true;
            case "user":
                g4Var.E = (e0) b2Var.r0(u0Var, new d0(i11));
                return true;
            case "extra":
                g4Var.K = b4.O((Map) b2Var.q0());
                return true;
            case "event_id":
                g4Var.f12268a = (t) b2Var.r0(u0Var, new io.sentry.clientreport.a(22));
                return true;
            case "release":
                g4Var.f12273y = b2Var.t0();
                return true;
            case "request":
                g4Var.f12271r = (io.sentry.protocol.n) b2Var.r0(u0Var, new io.sentry.clientreport.a(18));
                return true;
            case "platform":
                g4Var.D = b2Var.t0();
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(long j, long j7) {
        return j == j7;
    }

    public static final boolean k(long j, long j7) {
        return j == j7;
    }

    public static final boolean l(long j, long j7) {
        return j == j7;
    }

    public static String m(androidx.datastore.preferences.protobuf.g gVar) {
        StringBuilder sb2 = new StringBuilder(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            byte bA = gVar.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb2.append("\\a");
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bA);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final long n(long j, boolean z10, int i10, float f10) {
        int iH = ((z10 || i10 == 2 || i10 == 4 || i10 == 5) && t2.a.d(j)) ? t2.a.h(j) : Integer.MAX_VALUE;
        if (t2.a.j(j) != iH) {
            iH = vc.e.h(dr.a.d(f10), t2.a.j(j), iH);
        }
        return dr.a.n(0, iH, 0, t2.a.g(j));
    }

    public static ni.l o(String str) {
        if (str == null || str.length() == 0 || tt.l.D0(str)) {
            ch.n.g("DeviceSettingsCoreResult", "Null or blank JSON");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ni.l(xu.d.r("IS_DATA_ENABLED", jSONObject), xu.d.y("PREFERRED_NETWORK_MODE", jSONObject), xu.d.r("IS_ADAPTIVE_CONNECTIVITY_ENABLED", jSONObject), xu.d.r("KEY_IS_AIRPLANE_MODE_ON", jSONObject), xu.d.r("IS_TETHERING", jSONObject));
        } catch (JSONException unused) {
            ch.n.c("DeviceSettingsCoreResult", "Trying to parse invalid JSON: ".concat(str));
            return null;
        }
    }

    public static final long p(Context context) throws PackageManager.NameNotFoundException {
        try {
            return Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode() : r3.versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            ch.n.e("ContextExtensions", e4);
            return -1L;
        } catch (NullPointerException e10) {
            ch.n.e("ContextExtensions", e10);
            return -1L;
        }
    }

    public static /* synthetic */ Collection q(p pVar, at.f fVar, int i10) {
        if ((i10 & 1) != 0) {
            fVar = at.f.f2280m;
        }
        at.n.f2304a.getClass();
        return pVar.a(fVar, k.f2297g);
    }

    public static float r(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y3.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Integer s(com.opensignal.sdk.common.measurements.base.f fVar, ServiceState serviceState) {
        Integer numA = null;
        if (serviceState == null) {
            return null;
        }
        List networkRegistrationInfoList = serviceState.getNetworkRegistrationInfoList();
        l.d(networkRegistrationInfoList, "getNetworkRegistrationInfoList(...)");
        Iterator it = networkRegistrationInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NetworkRegistrationInfo networkRegistrationInfoJ = a5.q.j(it.next());
            if (networkRegistrationInfoJ.getTransportType() == 1 && (networkRegistrationInfoJ.getDomain() & 2) != 0) {
                try {
                    numA = fVar.A(networkRegistrationInfoJ);
                    break;
                } catch (Exception e4) {
                    ch.n.g(fVar.t(), "Exception getting NrState: " + e4.getLocalizedMessage());
                }
            }
        }
        ch.n.b(fVar.t(), "getNrState() with nrState = [" + numA + ']');
        return numA;
    }

    public static List t(Context context) {
        Bundle bundle;
        String string;
        if (f11193c == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, g.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (f11193c == null) {
                f11193c = arrayList;
            }
        }
        return f11193c;
    }

    public static final int u(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            if (applicationInfo != null) {
                return applicationInfo.targetSdkVersion;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e4) {
            ch.n.d("ContextExtensions", "Cannot get Container App target Sdk version: " + context.getPackageName() + " not found", e4);
            return -1;
        } catch (NullPointerException e10) {
            ch.n.d("ContextExtensions", "Cannot get Container App target Sdk version: applicationInfo null", e10);
            return -1;
        }
    }

    public static p7.b v(p7.c cVar, SQLiteDatabase sQLiteDatabase) {
        l.e(cVar, "refHolder");
        p7.b bVar = cVar.f20317a;
        if (bVar != null && bVar.f20316a.equals(sQLiteDatabase)) {
            return bVar;
        }
        p7.b bVar2 = new p7.b(sQLiteDatabase);
        cVar.f20317a = bVar2;
        return bVar2;
    }

    public static final long w(long j, long j7) {
        return ((((int) (j >> 32)) - ((int) (j7 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j7 & 4294967295L))) & 4294967295L);
    }

    public static final com.staircase3.opensignal.utils.l x(String str) {
        l.e(str, "networkGeneration");
        mq.d dVar = (mq.d) com.staircase3.opensignal.utils.l.getEntries();
        dVar.getClass();
        br.b bVar = new br.b(6, dVar);
        while (bVar.hasNext()) {
            com.staircase3.opensignal.utils.l lVar = (com.staircase3.opensignal.utils.l) bVar.next();
            if (str.equals(lVar.name())) {
                return lVar;
            }
        }
        return com.staircase3.opensignal.utils.l.UNKNOWN;
    }

    public static float y(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y3.c.c(edgeEffect, f10, f11);
        }
        y3.b.a(edgeEffect, f10, f11);
        return f10;
    }

    public static final boolean z(String str) {
        l.e(str, "method");
        return (str.equals(URLRequest.METHOD_GET) || str.equals("HEAD")) ? false : true;
    }

    public int hashCode() {
        switch (this.f11194a) {
            case 11:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f11194a) {
            case 11:
                String strP = x.f2918a.b(getClass()).p();
                l.b(strP);
                return strP;
            default:
                return super.toString();
        }
    }
}
