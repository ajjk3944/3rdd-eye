package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class p21 implements ld, kk1, ln2, bx1, qq2, o93, iq3 {
    public static p21 j;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public p21(View view, ag2 ag2Var, dl2 dl2Var, b83 b83Var) {
        this.g = view;
        this.i = ag2Var;
        this.f = dl2Var;
        this.h = b83Var;
    }

    public static final boolean I(Context context) {
        if (!((Boolean) g12.c.w()).booleanValue()) {
            return false;
        }
        List listAsList = Arrays.asList(((String) g12.d.w()).split(","));
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return listAsList.contains(lf4.I(context).g.toLowerCase(Locale.ROOT));
    }

    public static p21 h(View view) {
        int i = R.id.btn_back;
        MaterialButton materialButton = (MaterialButton) a30.e(view, R.id.btn_back);
        if (materialButton != null) {
            i = R.id.btn_close;
            MaterialButton materialButton2 = (MaterialButton) a30.e(view, R.id.btn_close);
            if (materialButton2 != null) {
                i = R.id.btn_enter;
                MaterialButton materialButton3 = (MaterialButton) a30.e(view, R.id.btn_enter);
                if (materialButton3 != null) {
                    i = R.id.ed_url;
                    TextInputEditText textInputEditText = (TextInputEditText) a30.e(view, R.id.ed_url);
                    if (textInputEditText != null) {
                        i = R.id.web_loading_progress_bar;
                        if (((ProgressBar) a30.e(view, R.id.web_loading_progress_bar)) != null) {
                            return new p21(materialButton, materialButton2, materialButton3, textInputEditText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static synchronized p21 o(Context context, l01 l01Var) {
        try {
            if (j == null) {
                p21 p21Var = new p21();
                Context applicationContext = context.getApplicationContext();
                p21Var.f = new ta(applicationContext, l01Var);
                p21Var.g = new ua(applicationContext, l01Var);
                p21Var.h = new zg0(applicationContext, l01Var);
                p21Var.i = new ky0(applicationContext, l01Var);
                j = p21Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public static p21 x(Context context, Executor executor, gd3 gd3Var) {
        p21 p21Var = new p21();
        p21Var.f = context;
        p21Var.g = executor;
        p21Var.h = gd3Var;
        w53 w53Var = new w53(4, p21Var);
        ou1.k(executor, "Executor must not be null");
        gi4 gi4Var = new gi4();
        executor.execute(new ve4(gi4Var, w53Var, 4));
        gi4Var.b.c(new mn2(executor, new zs1(28, p21Var)));
        gi4Var.h();
        p21Var.i = gi4Var;
        return p21Var;
    }

    public static p21 y(Reader reader, Bundle bundle) {
        try {
            try {
                return new p21(new JsonReader(reader), bundle);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
                throw new d83("unable to parse ServerResponse", e);
            }
        } finally {
            g82.c(reader);
        }
    }

    public void A(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f = Integer.valueOf(i);
    }

    public void B(zu3 zu3Var) throws GeneralSecurityException {
        mw3 mw3Var = new mw3(zu3Var.a, fw3.class);
        HashMap map = (HashMap) this.f;
        if (!map.containsKey(mw3Var)) {
            map.put(mw3Var, zu3Var);
            return;
        }
        zu3 zu3Var2 = (zu3) map.get(mw3Var);
        if (!zu3Var2.equals(zu3Var) || !zu3Var.equals(zu3Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(mw3Var.toString()));
        }
    }

    public i62 C(Context context, e51 e51Var, ea3 ea3Var) {
        i62 i62Var;
        synchronized (this.f) {
            try {
                if (((i62) this.h) == null) {
                    String str = I(context) ? ((Boolean) c12.g.w()).booleanValue() ? (String) g12.a.w() : (String) g12.e.w() : ((Boolean) c12.f.w()).booleanValue() ? (String) tw1.e.c.a(mz1.a) : (String) tw1.e.c.a(mz1.b);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.h = new i62(context, e51Var, str, ea3Var);
                }
                i62Var = (i62) this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i62Var;
    }

    public void D(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.g = Integer.valueOf(i);
    }

    public void E(wu3 wu3Var) throws GeneralSecurityException {
        wu3Var.getClass();
        lw3 lw3Var = new lw3(fw3.class, wu3Var.a);
        HashMap map = (HashMap) this.g;
        if (!map.containsKey(lw3Var)) {
            map.put(lw3Var, wu3Var);
            return;
        }
        wu3 wu3Var2 = (wu3) map.get(lw3Var);
        if (!wu3Var2.equals(wu3Var) || !wu3Var.equals(wu3Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(lw3Var.toString()));
        }
    }

    public void F() {
        this.h = 16;
    }

    public void G(vv3 vv3Var) throws GeneralSecurityException {
        mw3 mw3Var = new mw3(vv3Var.a, gw3.class);
        HashMap map = (HashMap) this.h;
        if (!map.containsKey(mw3Var)) {
            map.put(mw3Var, vv3Var);
            return;
        }
        vv3 vv3Var2 = (vv3) map.get(mw3Var);
        if (!vv3Var2.equals(vv3Var) || !vv3Var.equals(vv3Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(mw3Var.toString()));
        }
    }

    public void H(tv3 tv3Var) throws GeneralSecurityException {
        tv3Var.getClass();
        lw3 lw3Var = new lw3(gw3.class, tv3Var.a);
        HashMap map = (HashMap) this.i;
        if (!map.containsKey(lw3Var)) {
            map.put(lw3Var, tv3Var);
            return;
        }
        tv3 tv3Var2 = (tv3) map.get(lw3Var);
        if (!tv3Var2.equals(tv3Var) || !tv3Var.equals(tv3Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(lw3Var.toString()));
        }
    }

    public qn2 J(Set set) {
        return new qn2(set);
    }

    public hs3 K() throws GeneralSecurityException {
        Integer num = (Integer) this.f;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.g) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.h) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.g).intValue();
        ((Integer) this.h).getClass();
        return new hs3(iIntValue, iIntValue2, (gs3) this.i);
    }

    public l14 L() throws GeneralSecurityException {
        ls3 ls3Var = ls3.h;
        ps3 ps3Var = (ps3) this.f;
        if (ps3Var == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        j14 j14Var = (j14) this.g;
        if (j14Var == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        ls3 ls3Var2 = (ls3) this.h;
        if (ls3Var2 == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        ts3 ts3Var = (ts3) this.i;
        if (j14Var == j14.c && ls3Var2 != ls3.f) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (j14Var == j14.d && ls3Var2 != ls3.g && ls3Var2 != ls3Var) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (j14Var != j14.e || ls3Var2 == ls3Var) {
            return new l14(ps3Var, j14Var, ls3Var2, ts3Var);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public void M(int i, n70 n70Var) {
        if (((Boolean) tw1.e.c.a(mz1.t2)).booleanValue()) {
            t3 t3Var = new t3(this, i, 11);
            n70Var.c(new jq3(n70Var, t3Var, 0), (pq3) this.f);
        }
    }

    @Override // defpackage.ln2
    public Executor a() {
        return (Executor) this.i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:66:0x01e5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0231  */
    @Override // defpackage.ln2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.String r20, org.json.JSONObject r21) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p21.b(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // defpackage.o93
    public /* synthetic */ Object c(Object obj) {
        b23 b23Var = (b23) this.f;
        return ((f03) b23Var.e).a((h83) this.g, (a83) this.h, (c03) this.i);
    }

    @Override // defpackage.qq2
    public a83 d() {
        return (a83) this.f;
    }

    @Override // defpackage.bx1
    public void e(yy1 yy1Var) {
        ex1 ex1Var = (ex1) ((zy1) yy1Var.g).C().s();
        dx1 dx1Var = (dx1) this.f;
        ex1Var.b();
        ((fx1) ex1Var.g).B(dx1Var);
        yy1Var.b();
        ((zy1) yy1Var.g).H((fx1) ex1Var.d());
        vy1 vy1Var = (vy1) ((zy1) yy1Var.g).A().s();
        String str = (String) this.g;
        vy1Var.b();
        ((wy1) vy1Var.g).B(str);
        ux1 ux1Var = (ux1) this.h;
        vy1Var.b();
        ((wy1) vy1Var.g).C(ux1Var);
        yy1Var.b();
        ((zy1) yy1Var.g).G((wy1) vy1Var.d());
        String str2 = (String) this.i;
        yy1Var.b();
        ((zy1) yy1Var.g).B(str2);
    }

    public void f(iw iwVar) {
        if (((ArrayList) this.f).contains(iwVar)) {
            throw new IllegalStateException("Fragment already added: " + iwVar);
        }
        synchronized (((ArrayList) this.f)) {
            ((ArrayList) this.f).add(iwVar);
        }
        iwVar.p = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.kk1
    public void g(byte[] bArr, int i, int i2, lk1 lk1Var) {
        kz2 kz2Var;
        fi2 fi2Var;
        int i3;
        int i4;
        kz2 kz2Var2;
        int i5;
        int i6;
        int iO;
        kz2 kz2Var3 = (kz2) this.f;
        kz2Var3.z(i + i2, bArr);
        kz2Var3.E(i);
        if (((Inflater) this.i) == null) {
            this.i = new Inflater();
        }
        kz2 kz2Var4 = (kz2) this.g;
        if (v23.g(kz2Var3, kz2Var4, (Inflater) this.i)) {
            kz2Var3.z(kz2Var4.c, kz2Var4.a);
        }
        vk1 vk1Var = (vk1) this.h;
        int i7 = 0;
        vk1Var.d = 0;
        kz2 kz2Var5 = vk1Var.a;
        vk1Var.e = 0;
        vk1Var.f = 0;
        vk1Var.g = 0;
        vk1Var.h = 0;
        vk1Var.i = 0;
        kz2Var5.y(0);
        vk1Var.c = false;
        int[] iArr = vk1Var.b;
        ArrayList arrayList = new ArrayList();
        while (kz2Var3.B() >= 3) {
            int i8 = kz2Var3.c;
            int iK = kz2Var3.K();
            int iL = kz2Var3.L();
            int i9 = kz2Var3.b + iL;
            if (i9 > i8) {
                kz2Var3.E(i8);
                kz2Var = kz2Var5;
                fi2Var = null;
                i3 = i7;
            } else {
                if (iK != 128) {
                    switch (iK) {
                        case 20:
                            if (iL % 5 != 2) {
                                kz2Var2 = kz2Var3;
                                kz2Var = kz2Var5;
                            } else {
                                kz2Var3.G(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iL / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iK2 = kz2Var3.K();
                                    int iK3 = kz2Var3.K();
                                    int iK4 = kz2Var3.K();
                                    int iK5 = kz2Var3.K();
                                    double d = iK3;
                                    int iK6 = kz2Var3.K() << 24;
                                    String str = v23.a;
                                    kz2 kz2Var6 = kz2Var3;
                                    double d2 = iK4 - 128;
                                    double d3 = iK5 - 128;
                                    iArr[iK2] = (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | iK6 | (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | Math.max(0, Math.min((int) ((1.772d * d3) + d), 255));
                                    i11++;
                                    kz2Var3 = kz2Var6;
                                    kz2Var5 = kz2Var5;
                                }
                                kz2Var2 = kz2Var3;
                                kz2Var = kz2Var5;
                                vk1Var.c = true;
                            }
                            kz2Var3 = kz2Var2;
                            i3 = 0;
                            fi2Var = null;
                            break;
                        case zy1.zzm /* 21 */:
                            if (iL >= 4) {
                                kz2Var3.G(3);
                                int i12 = iL - 4;
                                if ((128 & kz2Var3.K()) == 0) {
                                    i5 = kz2Var5.b;
                                    i6 = kz2Var5.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        kz2Var3.H(kz2Var5.a, i5, iMin);
                                        kz2Var5.E(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iO = kz2Var3.O()) >= 4) {
                                    vk1Var.h = kz2Var3.L();
                                    vk1Var.i = kz2Var3.L();
                                    kz2Var5.y(iO - 4);
                                    i12 = iL - 11;
                                    i5 = kz2Var5.b;
                                    i6 = kz2Var5.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        kz2Var3.H(kz2Var5.a, i5, iMin2);
                                        kz2Var5.E(i5 + iMin2);
                                    }
                                }
                            }
                            kz2Var = kz2Var5;
                            fi2Var = null;
                            i3 = i7;
                            break;
                        case 22:
                            if (iL >= 19) {
                                vk1Var.d = kz2Var3.L();
                                vk1Var.e = kz2Var3.L();
                                kz2Var3.G(11);
                                vk1Var.f = kz2Var3.L();
                                vk1Var.g = kz2Var3.L();
                            }
                            kz2Var = kz2Var5;
                            fi2Var = null;
                            i3 = i7;
                            break;
                        default:
                            kz2Var = kz2Var5;
                            fi2Var = null;
                            i3 = i7;
                            break;
                    }
                } else {
                    kz2 kz2Var7 = kz2Var3;
                    kz2Var = kz2Var5;
                    if (vk1Var.d == 0 || vk1Var.e == 0 || vk1Var.h == 0 || vk1Var.i == 0 || (i4 = kz2Var.c) == 0 || kz2Var.b != i4 || !vk1Var.c) {
                        fi2Var = null;
                    } else {
                        kz2Var.E(0);
                        int i13 = vk1Var.h * vk1Var.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iK7 = kz2Var.K();
                            if (iK7 != 0) {
                                iArr2[i14] = iArr[iK7];
                                i14++;
                            } else {
                                int iK8 = kz2Var.K();
                                if (iK8 != 0) {
                                    int iK9 = iK8 & 63;
                                    if ((iK8 & 64) != 0) {
                                        iK9 = (iK9 << 8) | kz2Var.K();
                                    }
                                    int i15 = (iK8 & 128) == 0 ? iArr[0] : iArr[kz2Var.K()];
                                    int i16 = i14 + iK9;
                                    Arrays.fill(iArr2, i14, i16, i15);
                                    i14 = i16;
                                }
                            }
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, vk1Var.h, vk1Var.i, Bitmap.Config.ARGB_8888);
                        float f = vk1Var.f;
                        float f2 = vk1Var.d;
                        float f3 = f / f2;
                        float f4 = vk1Var.g;
                        float f5 = vk1Var.e;
                        fi2Var = new fi2(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, vk1Var.h / f2, vk1Var.i / f5, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    vk1Var.d = 0;
                    vk1Var.e = 0;
                    vk1Var.f = 0;
                    vk1Var.g = 0;
                    vk1Var.h = 0;
                    vk1Var.i = 0;
                    kz2Var.y(0);
                    vk1Var.c = false;
                    kz2Var3 = kz2Var7;
                }
                kz2Var3.E(i9);
            }
            if (fi2Var != null) {
                arrayList.add(fi2Var);
            }
            i7 = i3;
            kz2Var5 = kz2Var;
        }
        lk1Var.mo6c(new gk1(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public iw i(String str) {
        ex exVar = (ex) ((HashMap) this.g).get(str);
        if (exVar != null) {
            return exVar.c;
        }
        return null;
    }

    public iw j(String str) {
        for (ex exVar : ((HashMap) this.g).values()) {
            if (exVar != null) {
                iw iwVarJ = exVar.c;
                if (!str.equals(iwVarJ.j)) {
                    iwVarJ = iwVarJ.y.c.j(str);
                }
                if (iwVarJ != null) {
                    return iwVarJ;
                }
            }
        }
        return null;
    }

    public dz0 k(c2 c2Var) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dz0 dz0Var = (dz0) arrayList.get(i);
            if (dz0Var != null && dz0Var.b == c2Var) {
                return dz0Var;
            }
        }
        dz0 dz0Var2 = new dz0((Context) this.g, c2Var);
        arrayList.add(dz0Var2);
        return dz0Var2;
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (ex exVar : ((HashMap) this.g).values()) {
            if (exVar != null) {
                arrayList.add(exVar);
            }
        }
        return arrayList;
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (ex exVar : ((HashMap) this.g).values()) {
            if (exVar != null) {
                arrayList.add(exVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List n() {
        ArrayList arrayList;
        if (((ArrayList) this.f).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f)) {
            arrayList = new ArrayList((ArrayList) this.f);
        }
        return arrayList;
    }

    @Override // defpackage.ld
    public void onCancel() {
        View view = (View) this.f;
        view.clearAnimation();
        ((ViewGroup) this.g).endViewTransition(view);
        ((rn) this.h).e();
        if (xw.F(2)) {
            Objects.toString((lx0) this.i);
        }
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        da3 da3Var;
        z63 z63Var = (z63) this.i;
        ik2 ik2Var = (ik2) obj;
        synchronized (z63Var) {
            if (ik2Var != null) {
                try {
                    ik2Var.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z63Var.m) {
                z63Var.c();
            }
            if (!((Boolean) n02.c.w()).booleanValue() || (da3Var = (da3) this.f) == null) {
                ea3 ea3Var = z63Var.i;
                aa3 aa3Var = (aa3) this.g;
                aa3Var.o(ik2Var.a.b);
                aa3Var.q0(ik2Var.f.f);
                aa3Var.b(true);
                ea3Var.b(aa3Var.n());
            } else {
                da3Var.e(ik2Var.a.b);
                da3Var.g(ik2Var.f.f);
                aa3 aa3Var2 = (aa3) this.g;
                aa3Var2.b(true);
                da3Var.a(aa3Var2);
                da3Var.h();
            }
        }
    }

    @Override // defpackage.qq2
    public void q(boolean z, Context context, an2 an2Var) throws pq2 {
        boolean zH2;
        d82 d82Var = (d82) this.g;
        try {
            int iOrdinal = ((s2) this.h).ordinal();
            if (iOrdinal == 1) {
                zH2 = d82Var.h2(new oi0(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zH2 = d82Var.j3(new oi0(context));
                    }
                    throw new pq2("Adapter failed to show.");
                }
                zH2 = d82Var.H0(new oi0(context));
            }
            if (zH2) {
                cn2 cn2Var = (cn2) this.i;
                if (cn2Var == null) {
                    return;
                }
                if (((Boolean) tw1.e.c.a(mz1.E1)).booleanValue() || ((a83) this.f).Y != 2) {
                    return;
                }
                cn2Var.a();
                return;
            }
            throw new pq2("Adapter failed to show.");
        } catch (Throwable th) {
            throw new pq2(th);
        }
    }

    public m61 r(hf hfVar, String str) {
        m61 m61Var;
        boolean zIsInstance;
        m61 m61VarB;
        i30.m(str, "key");
        synchronized (((ts0) this.i)) {
            try {
                q61 q61Var = (q61) this.f;
                q61Var.getClass();
                m61Var = (m61) q61Var.a.get(str);
                Class clsI = hfVar.a;
                Map map = hf.b;
                i30.k(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
                Integer num = (Integer) map.get(clsI);
                if (num != null) {
                    zIsInstance = qb1.k(num.intValue(), m61Var);
                } else {
                    if (clsI.isPrimitive()) {
                        clsI = m54.i(dp0.a(clsI));
                    }
                    zIsInstance = clsI.isInstance(m61Var);
                }
                if (zIsInstance) {
                    p61 p61Var = (p61) this.g;
                    if (p61Var instanceof bt0) {
                        bt0 bt0Var = (bt0) p61Var;
                        i30.j(m61Var);
                        d60 d60Var = bt0Var.i;
                        if (d60Var != null) {
                            vq2 vq2Var = bt0Var.j;
                            i30.j(vq2Var);
                            i30.f(m61Var, vq2Var, d60Var);
                        }
                    }
                    i30.k(m61Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    mf0 mf0Var = new mf0((wk) this.h);
                    mf0Var.a.put(ug0.h, str);
                    p61 p61Var2 = (p61) this.g;
                    try {
                        try {
                            m61VarB = p61Var2.l(hfVar, mf0Var);
                        } catch (AbstractMethodError unused) {
                            m61VarB = p61Var2.h(m54.h(hfVar), mf0Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        m61VarB = p61Var2.b(m54.h(hfVar));
                    }
                    m61Var = m61VarB;
                    q61 q61Var2 = (q61) this.f;
                    q61Var2.getClass();
                    i30.m(m61Var, "viewModel");
                    m61 m61Var2 = (m61) q61Var2.a.put(str, m61Var);
                    if (m61Var2 != null) {
                        m61Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m61Var;
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        da3 da3Var;
        int i;
        if (((Boolean) tw1.e.c.a(mz1.h6)).booleanValue()) {
            gi2.R();
        }
        z63 z63Var = (z63) this.i;
        synchronized (z63Var) {
            bi2 bi2Var = (bi2) this.h;
            nx2 nx2VarJ = zt0.J(th, ((nl2) bi2Var.r.d()).l);
            z63Var.n = nx2VarJ;
            ((vm2) bi2Var.l.d()).d0(nx2VarJ);
            yc0.p(nx2VarJ.f, th, "BannerAdLoader.onFailure");
            if (z63Var.m) {
                z63Var.e();
                go2 go2Var = z63Var.h;
                wo2 wo2Var = z63Var.j;
                synchronized (wo2Var) {
                    i = wo2Var.f;
                }
                go2Var.U1(i);
            }
            if (!((Boolean) n02.c.w()).booleanValue() || (da3Var = (da3) this.f) == null) {
                ea3 ea3Var = z63Var.i;
                aa3 aa3Var = (aa3) this.g;
                aa3Var.k(nx2VarJ);
                aa3Var.j(th);
                aa3Var.b(false);
                ea3Var.b(aa3Var.n());
            } else {
                da3Var.f(nx2VarJ);
                aa3 aa3Var2 = (aa3) this.g;
                aa3Var2.j(th);
                aa3Var2.b(false);
                da3Var.a(aa3Var2);
                da3Var.h();
            }
        }
    }

    public void t(ex exVar) {
        iw iwVar = exVar.c;
        String str = iwVar.j;
        HashMap map = (HashMap) this.g;
        if (map.get(str) != null) {
            return;
        }
        map.put(iwVar.j, exVar);
        if (xw.F(2)) {
            iwVar.toString();
        }
    }

    public void u(ex exVar) {
        iw iwVar = exVar.c;
        if (iwVar.F) {
            ((ax) this.i).d(iwVar);
        }
        if (((ex) ((HashMap) this.g).put(iwVar.j, null)) != null && xw.F(2)) {
            iwVar.toString();
        }
    }

    public boolean v(c2 c2Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f).onActionItemClicked(k(c2Var), new wd0((Context) this.g, (iz0) menuItem));
    }

    public boolean w(c2 c2Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f;
        dz0 dz0VarK = k(c2Var);
        bw0 bw0Var = (bw0) this.i;
        Menu ie0Var = (Menu) bw0Var.get(menu);
        if (ie0Var == null) {
            ie0Var = new ie0((Context) this.g, (od0) menu);
            bw0Var.put(menu, ie0Var);
        }
        return callback.onCreateActionMode(dz0VarK, ie0Var);
    }

    public i62 z(Context context, e51 e51Var, ea3 ea3Var) {
        i62 i62Var;
        synchronized (this.g) {
            try {
                if (((i62) this.i) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    this.i = new i62(applicationContext, e51Var, I(context) ? (String) g12.b.w() : (String) g12.f.w(), ea3Var);
                }
                i62Var = (i62) this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i62Var;
    }

    public /* synthetic */ p21(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    public /* synthetic */ p21(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
    }

    public p21(th2 th2Var, t3 t3Var) {
        this.g = th2Var;
        this.f = t3Var;
        this.h = ba4.a(new u43(th2Var.t, 9));
        n63 n63Var = new n63(t3Var, 1);
        n63 n63Var2 = new n63(t3Var, 2);
        n63 n63Var3 = new n63(t3Var, 3);
        hh2 hh2Var = th2Var.g;
        ba4 ba4Var = th2Var.d;
        new ic2(hh2Var, ba4Var, n63Var, n63Var2, n63Var3, 17);
        int i = 5;
        new u43(hh2Var, i);
        n63 n63Var4 = new n63(t3Var, 0);
        new u12(22, n63Var4);
        int i2 = 10;
        new qk2(ba4Var, hh2Var, i2);
        n63 n63Var5 = new n63(t3Var, i);
        n63 n63Var6 = new n63(t3Var, 6);
        ba4 ba4Var2 = th2Var.U;
        new ar2(ba4Var2, n63Var3, n63Var4, ba4Var, n63Var5, n63Var6);
        new wb2(n63Var4, ba4Var2, ba4Var, 28);
        n63 n63Var7 = new n63(t3Var, 4);
        ba4 ba4VarA = ba4.a(qb1.s);
        ba4 ba4VarA2 = ba4.a(zt0.l);
        ba4 ba4VarA3 = ba4.a(i41.s);
        ba4 ba4VarA4 = ba4.a(ob1.m);
        int i3 = ea4.b;
        LinkedHashMap linkedHashMapF = qb1.F(4);
        linkedHashMapF.put(s93.k, ba4VarA);
        linkedHashMapF.put(s93.l, ba4VarA2);
        linkedHashMapF.put(s93.m, ba4VarA3);
        linkedHashMapF.put(s93.n, ba4VarA4);
        ba4 ba4VarA5 = ba4.a(new wb2(n63Var7, th2Var.g, new ea4(linkedHashMapF), i2));
        int i4 = ha4.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ba4VarA5);
        this.i = ba4.a(new k43(th2Var.d, new tm2(new ha4(list, arrayList), 25)));
    }

    public p21(a83 a83Var, d82 d82Var, s2 s2Var) {
        this.i = null;
        this.f = a83Var;
        this.g = d82Var;
        this.h = s2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public p21(JsonReader jsonReader, Bundle bundle) throws IOException {
        this.i = bundle;
        if (((Boolean) tw1.e.c.a(mz1.m2)).booleanValue() && bundle != null) {
            ga1.n(hg4.C.k, bundle, "server-response-parse-start");
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        c83 c83Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new a83(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        c83Var = new c83(jsonReader);
                        if (((Boolean) tw1.e.c.a(mz1.n2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", c83Var.s);
                            bundle.putLong("normalize-ad-response-end", c83Var.t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectN = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectN = bd2.N(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new g83(strNextString, jSONObjectN));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.h = arrayList2;
        this.f = arrayList;
        this.g = c83Var == null ? new c83(new JsonReader(new StringReader("{}"))) : c83Var;
    }

    public p21(sn3 sn3Var, v63 v63Var, v63 v63Var2, mr2 mr2Var) {
        Object objM;
        if (sn3Var != null) {
            objM = xm3.m(sn3Var);
        } else {
            vm3 vm3Var = xm3.g;
            objM = sn3.j;
        }
        this.f = objM;
        this.g = v63Var;
        this.h = v63Var2;
        this.i = mr2Var;
    }

    public p21(nw3 nw3Var) {
        this.f = new HashMap(nw3Var.a);
        this.g = new HashMap(nw3Var.b);
        this.h = new HashMap(nw3Var.c);
        this.i = new HashMap(nw3Var.d);
    }

    public p21(int i) {
        switch (i) {
            case 8:
                this.f = new kz2();
                this.g = new kz2();
                this.h = new vk1();
                break;
            case 11:
                this.f = new Object();
                this.g = new Object();
                break;
            case 24:
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = gs3.j;
                break;
            case 25:
                this.f = new HashMap();
                this.g = new HashMap();
                this.h = new HashMap();
                this.i = new HashMap();
                break;
            case 26:
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = ts3.n;
                break;
            default:
                this.f = new ArrayList();
                this.g = new HashMap();
                this.h = new HashMap();
                break;
        }
    }

    public p21(q61 q61Var, p61 p61Var, wk wkVar) {
        i30.m(q61Var, "store");
        i30.m(wkVar, "defaultExtras");
        this.f = q61Var;
        this.g = p61Var;
        this.h = wkVar;
        this.i = new ts0();
    }
}
