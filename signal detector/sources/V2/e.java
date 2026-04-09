package V2;

import B4.InterfaceC0140b;
import C0.t;
import G3.C0152f;
import R3.k;
import U0.j;
import V0.n;
import Y2.C0203e;
import Y2.C0204f;
import Y2.C0209k;
import Y2.N;
import Y2.O;
import Y2.P;
import Y2.S;
import a4.o;
import a4.p;
import android.app.Dialog;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractServiceC0301x;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase_Impl;
import b4.C0344i;
import b4.C0351p;
import b4.InterfaceC0353r;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.VO;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lefan.signal.MainActivity;
import e1.C2300c;
import e1.C2301d;
import f0.C2319d;
import f0.InterfaceC2322g;
import f0.s;
import f0.v;
import f0.w;
import g0.C2328a;
import h.E;
import h1.InterfaceC2361a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import n0.AbstractC2680b;
import o.m1;
import q5.i;
import q5.l;
import q5.r;
import u2.C2951a;

/* loaded from: classes.dex */
public class e implements G2.a, InterfaceC0140b, Q.b, O0.a, S3.c, T.g, N, Z3.d, Z3.e, InterfaceC0353r, InterfaceC2361a {

    /* renamed from: e, reason: collision with root package name */
    public static e f3865e;

    /* renamed from: f, reason: collision with root package name */
    public static e f3866f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3867a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3868b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3869c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3870d;

    public /* synthetic */ e(int i) {
        this.f3867a = i;
    }

    public static final SharedPreferences D(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void E(Context context) throws d {
        if (D(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new d("Failed to store the app set ID last used time.");
    }

    public static e k(View view) {
        int i = R.id.empty_btn;
        TextView textView = (TextView) p.e(R.id.empty_btn, view);
        if (textView != null) {
            i = R.id.empty_text;
            TextView textView2 = (TextView) p.e(R.id.empty_text, view);
            if (textView2 != null) {
                return new e((LinearLayout) view, textView, textView2, 6);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static boolean n(Editable editable, KeyEvent keyEvent, boolean z6) {
        w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
                for (w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public e A() {
        return new e((P) ((O) this.f3868b).a(), ((C0203e) this.f3869c).a(), (C0204f) ((O) this.f3870d).a(), 16);
    }

    public Object B() {
        Object obj = this.f3868b;
        Field field = (Field) this.f3869c;
        Class cls = (Class) this.f3870d;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e6) {
            throw new J0.c("Failed to get value of field " + field.getName() + " of type " + obj.getClass().getName() + " on object of type " + cls.getName(), e6);
        }
    }

    public void C(Object obj) throws IllegalAccessException, IllegalArgumentException {
        Object obj2 = this.f3868b;
        Field field = (Field) this.f3869c;
        try {
            field.set(obj2, obj);
        } catch (Exception e6) {
            throw new J0.c("Failed to set value of field " + field.getName() + " of type " + obj2.getClass().getName() + " on object of type " + ((Class) this.f3870d).getName(), e6);
        }
    }

    @Override // S3.c, Y2.O
    public Object a() {
        switch (this.f3867a) {
            case 9:
                return new R3.d((k) ((S3.c) this.f3868b).a(), (R3.c) ((S3.c) this.f3869c).a(), ((R3.e) ((j) this.f3870d).f3677b).f3409b);
            case 13:
                return A();
            case 15:
                return new S((C0204f) ((O) this.f3868b).a(), ((m1) this.f3869c).a(), (C0209k) ((O) this.f3870d).a());
            default:
                return new o(C0351p.b((InterfaceC0353r) this.f3868b), C0351p.b((InterfaceC0353r) this.f3869c), C0351p.b((InterfaceC0353r) this.f3870d));
        }
    }

    @Override // G2.a
    public c3.j b() {
        c3.f fVar = new c3.f();
        ((ExecutorService) this.f3870d).execute(new A1.d(this, fVar, 16, false));
        return fVar.f5902a;
    }

    @Override // Z3.d
    public void c(ZipFile zipFile, HashSet hashSet) {
        HashSet hashSet2 = (HashSet) this.f3868b;
        Z3.g gVar = (Z3.g) this.f3870d;
        Z3.b bVar = (Z3.b) this.f3869c;
        HashSet hashSet3 = new HashSet();
        gVar.c(bVar, hashSet, new e(hashSet3, bVar, zipFile, 18));
        hashSet2.addAll(hashSet3);
    }

    @Override // Q.b
    public boolean d(Object obj) {
        if (obj instanceof I1.b) {
            ((I1.b) obj).d().f1889a = true;
        }
        switch (((C0152f) this.f3869c).f1558a) {
            case 15:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((Q.d) this.f3870d).d(obj);
    }

    @Override // T.g
    public Uri e() {
        return (Uri) this.f3868b;
    }

    @Override // T.g
    public Uri g() {
        return (Uri) this.f3870d;
    }

    @Override // T.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f3869c;
    }

    @Override // O0.a
    public View getRoot() {
        switch (this.f3867a) {
        }
        return (LinearLayout) this.f3868b;
    }

    @Override // Q.b
    public Object h() {
        Object objH = ((Q.d) this.f3870d).h();
        if (objH == null) {
            objH = ((I1.a) this.f3868b).h();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objH.getClass());
            }
        }
        if (objH instanceof I1.b) {
            ((I1.b) objH).d().f1889a = false;
        }
        return objH;
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        l lVar = (l) this.f3868b;
        MainActivity mainActivity = (MainActivity) this.f3870d;
        if (dialog != null) {
            dialog.dismiss();
        }
        boolean z6 = !lVar.f23296a;
        lVar.f23296a = z6;
        SwitchMaterial switchMaterial = (SwitchMaterial) this.f3869c;
        if (switchMaterial != null) {
            switchMaterial.setChecked(z6);
        }
        boolean z7 = lVar.f23296a;
        i.e(mainActivity, "context");
        SharedPreferences sharedPreferences = mainActivity.getSharedPreferences("sp", 0);
        i.b(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("number_locale", z7);
        editorEdit.apply();
        Intent launchIntentForPackage = mainActivity.getPackageManager().getLaunchIntentForPackage(mainActivity.getBaseContext().getPackageName());
        i.b(launchIntentForPackage);
        launchIntentForPackage.addFlags(67108864);
        mainActivity.startActivity(launchIntentForPackage);
        mainActivity.finishAffinity();
    }

    @Override // T.g
    public Object j() {
        return null;
    }

    public n l() {
        UUID uuid = (UUID) this.f3868b;
        e1.h hVar = (e1.h) this.f3869c;
        HashSet hashSet = (HashSet) this.f3870d;
        n nVar = new n();
        nVar.f3831a = uuid;
        nVar.f3832b = hVar;
        nVar.f3833c = hashSet;
        V0.c cVar = hVar.f19916j;
        boolean z6 = (Build.VERSION.SDK_INT >= 24 && cVar.f3815h.f3818a.size() > 0) || cVar.f3811d || cVar.f3809b || cVar.f3810c;
        if (((e1.h) this.f3869c).f19923q && z6) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f3868b = UUID.randomUUID();
        e1.h hVar2 = (e1.h) this.f3869c;
        e1.h hVar3 = new e1.h();
        hVar3.f19909b = 1;
        V0.f fVar = V0.f.f3820c;
        hVar3.f19912e = fVar;
        hVar3.f19913f = fVar;
        hVar3.f19916j = V0.c.i;
        hVar3.f19918l = 1;
        hVar3.f19919m = 30000L;
        hVar3.f19922p = -1L;
        hVar3.f19924r = 1;
        hVar3.f19908a = hVar2.f19908a;
        hVar3.f19910c = hVar2.f19910c;
        hVar3.f19909b = hVar2.f19909b;
        hVar3.f19911d = hVar2.f19911d;
        hVar3.f19912e = new V0.f(hVar2.f19912e);
        hVar3.f19913f = new V0.f(hVar2.f19913f);
        hVar3.f19914g = hVar2.f19914g;
        hVar3.f19915h = hVar2.f19915h;
        hVar3.i = hVar2.i;
        V0.c cVar2 = hVar2.f19916j;
        V0.c cVar3 = new V0.c();
        cVar3.f3808a = 1;
        cVar3.f3813f = -1L;
        cVar3.f3814g = -1L;
        cVar3.f3815h = new V0.e();
        cVar3.f3809b = cVar2.f3809b;
        cVar3.f3810c = cVar2.f3810c;
        cVar3.f3808a = cVar2.f3808a;
        cVar3.f3811d = cVar2.f3811d;
        cVar3.f3812e = cVar2.f3812e;
        cVar3.f3815h = cVar2.f3815h;
        hVar3.f19916j = cVar3;
        hVar3.f19917k = hVar2.f19917k;
        hVar3.f19918l = hVar2.f19918l;
        hVar3.f19919m = hVar2.f19919m;
        hVar3.f19920n = hVar2.f19920n;
        hVar3.f19921o = hVar2.f19921o;
        hVar3.f19922p = hVar2.f19922p;
        hVar3.f19923q = hVar2.f19923q;
        hVar3.f19924r = hVar2.f19924r;
        this.f3869c = hVar3;
        hVar3.f19908a = ((UUID) this.f3868b).toString();
        return nVar;
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void o(Runnable runnable) {
        ((f1.j) this.f3868b).execute(runnable);
    }

    public C2300c p(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3868b;
        t tVarA = t.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            tVarA.l(1);
        } else {
            tVarA.c(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            return cursorL.moveToFirst() ? new C2300c(cursorL.getString(I5.b.p(cursorL, "work_spec_id")), cursorL.getInt(I5.b.p(cursorL, "system_id"))) : null;
        } finally {
            cursorL.close();
            tVarA.b();
        }
    }

    public X q(q5.d dVar, String str) {
        boolean zIsInstance;
        X xA;
        Z z6 = (Z) this.f3869c;
        i.e(str, "key");
        a0 a0Var = (a0) this.f3868b;
        a0Var.getClass();
        LinkedHashMap linkedHashMap = a0Var.f5233a;
        X x6 = (X) linkedHashMap.get(str);
        Class clsP = dVar.f23290a;
        Map map = q5.d.f23288b;
        i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsP);
        if (num != null) {
            zIsInstance = r.d(num.intValue(), x6);
        } else {
            if (clsP.isPrimitive()) {
                clsP = com.bumptech.glide.e.p(q5.p.a(clsP));
            }
            zIsInstance = clsP.isInstance(x6);
        }
        if (zIsInstance) {
            if (z6 instanceof U) {
                U u6 = (U) z6;
                i.b(x6);
                C0300w c0300w = u6.f5221d;
                if (c0300w != null) {
                    F0.f fVar = u6.f5222e;
                    i.b(fVar);
                    Q.a(x6, fVar, c0300w);
                }
            }
            i.c(x6, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return x6;
        }
        n0.d dVar2 = new n0.d((AbstractC2680b) this.f3870d);
        dVar2.f22143a.put(o0.c.f22669a, str);
        i.e(z6, "factory");
        try {
            try {
                xA = z6.b(dVar, dVar2);
            } catch (AbstractMethodError unused) {
                xA = z6.a(com.bumptech.glide.e.o(dVar));
            }
        } catch (AbstractMethodError unused2) {
            xA = z6.c(com.bumptech.glide.e.o(dVar), dVar2);
        }
        i.e(xA, "viewModel");
        X x7 = (X) linkedHashMap.put(str, xA);
        if (x7 != null) {
            x7.b();
        }
        return xA;
    }

    @Override // Z3.e
    public void r(Z3.f fVar, File file, boolean z6) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ((HashSet) this.f3868b).add(file);
        if (z6) {
            return;
        }
        Z3.b bVar = (Z3.b) this.f3869c;
        String str = bVar.f4529b;
        String str2 = fVar.f4533a;
        ZipEntry zipEntry = fVar.f4534b;
        String absolutePath = bVar.f4528a.getAbsolutePath();
        String name = zipEntry.getName();
        String absolutePath2 = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder("NativeLibraryExtractor: split '");
        sb.append(str);
        sb.append("' has native library '");
        sb.append(str2);
        sb.append("' that does not exist; extracting from '");
        A.f.w(sb, absolutePath, "!", name, "' to '");
        sb.append(absolutePath2);
        sb.append("'");
        Log.i("SplitCompat", sb.toString());
        ZipFile zipFile = (ZipFile) this.f3870d;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
    }

    public boolean s(CharSequence charSequence, int i, int i3, v vVar) {
        if ((vVar.f20025c & 3) == 0) {
            InterfaceC2322g interfaceC2322g = (InterfaceC2322g) this.f3870d;
            C2328a c2328aB = vVar.b();
            int iA = c2328aB.a(8);
            if (iA != 0) {
                ((ByteBuffer) c2328aB.f3262d).getShort(iA + c2328aB.f3259a);
            }
            C2319d c2319d = (C2319d) interfaceC2322g;
            c2319d.getClass();
            ThreadLocal threadLocal = C2319d.f19981b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i3) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c2319d.f19982a;
            String string = sb.toString();
            int i6 = J.d.f2011a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i7 = vVar.f20025c & 4;
            vVar.f20025c = zHasGlyph ? i7 | 2 : i7 | 1;
        }
        return (vVar.f20025c & 3) == 2;
    }

    public void t(C2300c c2300c) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3868b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((L4.b) this.f3869c).f(c2300c);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public boolean u(int i, C.f fVar, z.d dVar) {
        A.b bVar = (A.b) this.f3869c;
        int[] iArr = dVar.f24346p0;
        int[] iArr2 = dVar.f24350t;
        bVar.f0a = iArr[0];
        bVar.f1b = iArr[1];
        bVar.f2c = dVar.q();
        bVar.f3d = dVar.k();
        bVar.i = false;
        bVar.f8j = i;
        boolean z6 = bVar.f0a == 3;
        boolean z7 = bVar.f1b == 3;
        boolean z8 = z6 && dVar.f24313W > 0.0f;
        boolean z9 = z7 && dVar.f24313W > 0.0f;
        if (z8 && iArr2[0] == 4) {
            bVar.f0a = 1;
        }
        if (z9 && iArr2[1] == 4) {
            bVar.f1b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f4e);
        dVar.L(bVar.f5f);
        dVar.f24296E = bVar.f7h;
        dVar.I(bVar.f6g);
        bVar.f8j = 0;
        return bVar.i;
    }

    public void v(EnumC0291m enumC0291m) {
        W w6 = (W) this.f3870d;
        if (w6 != null) {
            w6.run();
        }
        W w7 = new W((C0300w) this.f3868b, enumC0291m);
        this.f3870d = w7;
        ((Handler) this.f3869c).postAtFrontOfQueue(w7);
    }

    public Object w(CharSequence charSequence, int i, int i3, int i6, boolean z6, f0.p pVar) {
        int i7;
        char c6;
        VO vo = new VO((s) ((c1.g) this.f3869c).f5898d);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i8 = 0;
        boolean zC = true;
        int iCharCount = i;
        loop0: while (true) {
            i7 = iCharCount;
            while (iCharCount < i3 && i8 < i6 && zC) {
                SparseArray sparseArray = ((s) vo.f11988b).f20016a;
                s sVar = sparseArray == null ? null : (s) sparseArray.get(iCodePointAt);
                if (vo.f11990d == 2) {
                    if (sVar != null) {
                        vo.f11988b = sVar;
                        vo.f11992f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            vo.a();
                        } else if (iCodePointAt != 65039) {
                            s sVar2 = (s) vo.f11988b;
                            if (sVar2.f20017b != null) {
                                if (vo.f11992f != 1) {
                                    vo.f11989c = sVar2;
                                    vo.a();
                                } else if (vo.b()) {
                                    vo.f11989c = (s) vo.f11988b;
                                    vo.a();
                                } else {
                                    vo.a();
                                }
                                c6 = 3;
                            } else {
                                vo.a();
                            }
                        }
                        c6 = 1;
                    }
                    c6 = 2;
                } else if (sVar == null) {
                    vo.a();
                    c6 = 1;
                } else {
                    vo.f11990d = 2;
                    vo.f11988b = sVar;
                    vo.f11992f = 1;
                    c6 = 2;
                }
                vo.f11991e = iCodePointAt;
                if (c6 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i7)) + i7;
                    if (iCharCount < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c6 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c6 == 3) {
                    if (z6 || !s(charSequence, i7, iCharCount, ((s) vo.f11989c).f20017b)) {
                        zC = pVar.c(charSequence, i7, iCharCount, ((s) vo.f11989c).f20017b);
                        i8++;
                    }
                }
            }
            break loop0;
        }
        if (vo.f11990d == 2 && ((s) vo.f11988b).f20017b != null && ((vo.f11992f > 1 || vo.b()) && i8 < i6 && zC && (z6 || !s(charSequence, i7, iCharCount, ((s) vo.f11988b).f20017b)))) {
            pVar.c(charSequence, i7, iCharCount, ((s) vo.f11988b).f20017b);
        }
        return pVar.b();
    }

    public void x(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3868b;
        workDatabase_Impl.b();
        C2301d c2301d = (C2301d) this.f3870d;
        H0.j jVarA = c2301d.a();
        if (str == null) {
            jVarA.l(1);
        } else {
            jVarA.c(1, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            c2301d.c(jVarA);
        }
    }

    public void y(z.e eVar, int i, int i3, int i6) {
        int i7 = eVar.b0;
        int i8 = eVar.f24321c0;
        eVar.b0 = 0;
        eVar.f24321c0 = 0;
        eVar.O(i3);
        eVar.L(i6);
        if (i7 < 0) {
            eVar.b0 = 0;
        } else {
            eVar.b0 = i7;
        }
        if (i8 < 0) {
            eVar.f24321c0 = 0;
        } else {
            eVar.f24321c0 = i8;
        }
        z.e eVar2 = (z.e) this.f3870d;
        eVar2.f24372t0 = i;
        eVar2.U();
    }

    public void z(z.e eVar) {
        ArrayList arrayList = (ArrayList) this.f3868b;
        arrayList.clear();
        int size = eVar.f24369q0.size();
        for (int i = 0; i < size; i++) {
            z.d dVar = (z.d) eVar.f24369q0.get(i);
            int[] iArr = dVar.f24346p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f24371s0.f12b = true;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f3867a = i;
        this.f3868b = obj;
        this.f3869c = obj2;
        this.f3870d = obj3;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i, boolean z6) {
        this.f3867a = i;
        this.f3870d = obj;
        this.f3868b = obj2;
        this.f3869c = obj3;
    }

    public e(Context context) {
        this.f3867a = 0;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f3869c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f3870d = Executors.newSingleThreadExecutor();
        this.f3868b = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new C0.k(10, this), 0L, 86400L, TimeUnit.SECONDS);
    }

    public e(Context context, C2951a c2951a) {
        this.f3867a = 2;
        this.f3868b = context;
        this.f3869c = context.getPackageName();
        this.f3870d = c2951a.f23784a;
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f3867a = 22;
        this.f3868b = workDatabase_Impl;
        this.f3869c = new L4.b(workDatabase_Impl, 9);
        this.f3870d = new C2301d(workDatabase_Impl, 0);
    }

    public e(AbstractServiceC0301x abstractServiceC0301x) {
        this.f3867a = 20;
        this.f3868b = new C0300w(abstractServiceC0301x);
        this.f3869c = new Handler();
    }

    public e(a0 a0Var, Z z6, AbstractC2680b abstractC2680b) {
        this.f3867a = 26;
        i.e(a0Var, "store");
        i.e(z6, "factory");
        i.e(abstractC2680b, "extras");
        this.f3868b = a0Var;
        this.f3869c = z6;
        this.f3870d = abstractC2680b;
    }

    public e(ExecutorService executorService) {
        this.f3867a = 25;
        this.f3869c = new Handler(Looper.getMainLooper());
        this.f3870d = new c3.i(this);
        this.f3868b = new f1.j(executorService);
    }

    @Override // T.g
    public void f() {
    }

    public e(LinearLayout linearLayout, RecyclerView recyclerView, MaterialButton materialButton, RecyclerView recyclerView2) {
        this.f3867a = 5;
        this.f3868b = linearLayout;
        this.f3869c = recyclerView;
        this.f3870d = recyclerView2;
    }

    public e(Runnable runnable) {
        this.f3867a = 8;
        this.f3869c = new CopyOnWriteArrayList();
        this.f3870d = new HashMap();
        this.f3868b = runnable;
    }

    public e(Context context, LocationManager locationManager) {
        this.f3867a = 24;
        this.f3870d = new E();
        this.f3868b = context;
        this.f3869c = locationManager;
    }

    public e(z.e eVar) {
        this.f3867a = 1;
        this.f3868b = new ArrayList();
        this.f3869c = new A.b();
        this.f3870d = eVar;
    }

    public e(Class cls) {
        this.f3867a = 11;
        this.f3870d = new HashSet();
        this.f3868b = UUID.randomUUID();
        this.f3869c = new e1.h(((UUID) this.f3868b).toString(), cls.getName());
        ((HashSet) this.f3870d).add(cls.getName());
        ((e1.h) this.f3869c).f19911d = OverwritingInputMerger.class.getName();
    }

    public e(c1.g gVar, C0344i c0344i, C2319d c2319d, Set set) {
        this.f3867a = 23;
        this.f3868b = c0344i;
        this.f3869c = gVar;
        this.f3870d = c2319d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            w(str, 0, str.length(), 1, true, new B2.a(str, 4));
        }
    }

    public e() {
        this.f3867a = 12;
        List list = Collections.EMPTY_LIST;
        this.f3868b = list;
        this.f3869c = list;
    }

    public e(n1.l lVar, D1.f fVar, n1.p pVar) {
        this.f3867a = 29;
        this.f3870d = lVar;
        this.f3869c = fVar;
        this.f3868b = pVar;
    }
}
