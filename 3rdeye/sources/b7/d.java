package B7;

import A9.C0575f;
import A9.F;
import A9.U;
import E.u;
import F9.C0663f;
import R9.h;
import R9.r;
import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Color;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1790x;
import b2.C1834o;
import b2.C1842w;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.gson.internal.g;
import d9.C4284b;
import h4.C4414b;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import o.g0;
import org.json.JSONArray;
import org.json.JSONObject;
import w1.k;
import y1.q;
import y9.n;
import z0.C5848a;

/* compiled from: TemplateProvider.kt */
/* loaded from: classes.dex */
public class d implements f, H3.a, g, RewardItem {

    /* renamed from: c, reason: collision with root package name */
    public static d f579c;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f580b;

    public /* synthetic */ d(int i) {
        this.f580b = i;
    }

    public static final void A(View view, InterfaceC1790x interfaceC1790x) {
        l.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1790x);
    }

    public static String B(JSONArray jSONArray) {
        String string = u.w(jSONArray, 1).toString();
        l.e(string, "copy.toString()");
        return string;
    }

    public static String C(JSONObject jSONObject) {
        l.f(jSONObject, "<this>");
        String string = u.x(jSONObject, 1).toString();
        l.e(string, "copy.toString()");
        return string;
    }

    public static final boolean a(List... listArr) {
        for (List list : listArr) {
            if (list != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static final h c(P9.d dVar) {
        l.f(dVar, "<this>");
        h hVar = dVar instanceof h ? (h) dVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + x.a(dVar.getClass()));
    }

    public static final r d(P9.e eVar) {
        l.f(eVar, "<this>");
        r rVar = eVar instanceof r ? (r) eVar : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + x.a(eVar.getClass()));
    }

    public static void e(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static float g(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static int h(int i, int i10, int i11) {
        return i < i10 ? i10 : i > i11 ? i11 : i;
    }

    public static final void i(Closeable closeable) throws IOException {
        l.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void j(E1.a connection) throws Exception {
        l.f(connection, "connection");
        C4284b c4284bU = u.u();
        E1.c cVarK0 = connection.K0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarK0.x()) {
            try {
                c4284bU.add(cVarK0.g0(0));
            } finally {
            }
        }
        C1992A c1992a = C1992A.f18074a;
        cVarK0.close();
        ListIterator listIterator = u.m(c4284bU).listIterator(0);
        while (true) {
            C4284b.C0442b c0442b = (C4284b.C0442b) listIterator;
            if (!c0442b.hasNext()) {
                return;
            }
            String str = (String) c0442b.next();
            if (n.a0(str, "room_fts_content_sync_", false)) {
                A2.l.v(connection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static void k(View view, String str, ArrayList arrayList) {
        if (l.b(str, view.getTag())) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                l.e(childAt, "view.getChildAt(i)");
                k(childAt, str, arrayList);
            }
        }
    }

    public static final C1834o l(C1842w c1842w) {
        l.f(c1842w, "<this>");
        return new C1834o(c1842w.f17138a, c1842w.f17156t);
    }

    public static int m(int i, View view) {
        Context context = view.getContext();
        TypedValue typedValueC = C4414b.c(view.getContext(), i, view.getClass().getCanonicalName());
        int i10 = typedValueC.resourceId;
        return i10 != 0 ? C5848a.getColor(context, i10) : typedValueC.data;
    }

    public static int o(Context context, int i, int i10) {
        Integer numValueOf;
        TypedValue typedValueA = C4414b.a(context, i);
        if (typedValueA != null) {
            int i11 = typedValueA.resourceId;
            numValueOf = Integer.valueOf(i11 != 0 ? C5848a.getColor(context, i11) : typedValueA.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i10;
    }

    public static final int p(int i, int i10, int i11) {
        if (i11 > 0) {
            if (i < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else {
            if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i10) {
                int i15 = -i11;
                int i16 = i % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        }
        return i10;
    }

    public static boolean q(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal<double[]> threadLocal = C0.d.f799a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = iRed / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = iGreen / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = iBlue / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static boolean r(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static int s(float f10, int i, int i10) {
        return C0.d.c(C0.d.e(i10, Math.round(Color.alpha(i10) * f10)), i);
    }

    public static void t(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof g0) {
                editorInfo.hintText = ((g0) parent).a();
                return;
            }
        }
    }

    public static final Object u(k db, boolean z10, boolean z11, p9.l lVar) {
        l.f(db, "db");
        db.a();
        db.b();
        return q.a(new C1.b(null, lVar, db, z11, z10));
    }

    public static void v(float[] fArr, float f10) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void w(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static Z0.b x(String name, Y0.b bVar) {
        C0663f c0663fA = F.a(U.f212b.plus(C0575f.a()));
        l.f(name, "name");
        Z0.a produceMigrations = Z0.a.f13981g;
        l.f(produceMigrations, "produceMigrations");
        return new Z0.b(name, bVar, produceMigrations, c0663fA);
    }

    public static final Cursor y(k db, F1.e eVar, boolean z10) throws IOException {
        l.f(db, "db");
        db.a();
        db.b();
        Cursor c10 = db.i().getWritableDatabase().E(eVar);
        if (z10 && (c10 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c10;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                l.f(c10, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c10.getColumnNames(), c10.getCount());
                    while (c10.moveToNext()) {
                        Object[] objArr = new Object[c10.getColumnCount()];
                        int columnCount = c10.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = c10.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(c10.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(c10.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = c10.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = c10.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    c10.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c10;
    }

    public static final long z(long j4) {
        if (j4 < 0) {
            return 0L;
        }
        if (j4 < 100) {
            return (j4 / 20) * 20;
        }
        if (j4 < 1000) {
            return (j4 / 100) * 100;
        }
        if (j4 < 2000) {
            return (j4 / 200) * 200;
        }
        if (j4 < 5000) {
            return (j4 / 500) * 500;
        }
        if (j4 < 10000) {
            return (j4 / 1000) * 1000;
        }
        if (j4 < 20000) {
            return (j4 / 2000) * 2000;
        }
        if (j4 < 50000) {
            return (j4 / 5000) * 5000;
        }
        return 50000L;
    }

    @Override // H3.a
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // B7.f
    public /* synthetic */ Z6.b f(String str, JSONObject jSONObject) {
        return c.a(this, str, jSONObject);
    }

    @Override // B7.f
    public Z6.b get(String str) {
        return null;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return "";
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        return new ArrayDeque();
    }

    public String toString() {
        switch (this.f580b) {
            case 2:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public d(K7.a aVar, z7.c cVar) {
        this.f580b = 6;
    }
}
