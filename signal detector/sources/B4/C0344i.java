package b4;

import R.r0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.internal.ads.Rr;
import com.lefan.signal.tracroute.TraceDataRoom;
import d3.AbstractC2266a;
import java.io.File;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.HashSet;
import l1.InterfaceC2639e;
import l1.InterfaceC2640f;
import n.MenuC2677k;
import o1.InterfaceC2753a;
import p1.InterfaceC2770a;
import x3.InterfaceC2994C;

/* renamed from: b4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0344i implements InterfaceC0342g, InterfaceC0341f, InterfaceC2994C, InterfaceC2640f, I1.a, n.v, InterfaceC2753a, InterfaceC2770a {

    /* renamed from: b, reason: collision with root package name */
    public static C0344i f5753b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0344i f5754c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5755a;

    public /* synthetic */ C0344i(int i) {
        this.f5755a = i;
    }

    public static String p(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static C0344i q(Context context, int i) throws Resources.NotFoundException {
        a4.t.c("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC2266a.f19769x);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 4);
        com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 9);
        com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        G3.o.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        C0344i c0344i = new C0344i(5);
        a4.t.d(rect.left);
        a4.t.d(rect.top);
        a4.t.d(rect.right);
        a4.t.d(rect.bottom);
        return c0344i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean u(h0.C2354d r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.C0344i.u(h0.d, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // o1.InterfaceC2753a
    public Bitmap a(int i, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i3, config);
    }

    @Override // b4.InterfaceC0342g
    public boolean b(Object obj, File file, File file2) {
        return true;
    }

    @Override // o1.InterfaceC2753a
    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // b4.InterfaceC0341f
    public boolean f(ClassLoader classLoader, File file, File file2, boolean z6) {
        return R2.a.J(classLoader, file, file2, z6, new S4.r(21), "path", new C0344i(0));
    }

    @Override // n.v
    public boolean g(MenuC2677k menuC2677k) {
        return false;
    }

    @Override // I1.a
    public Object h() {
        return new n1.y();
    }

    @Override // b4.InterfaceC0341f
    public void j(ClassLoader classLoader, HashSet hashSet) {
        S4.r.l(classLoader, hashSet, new S4.r(26));
    }

    @Override // p1.InterfaceC2770a
    public File k(InterfaceC2639e interfaceC2639e) {
        return null;
    }

    @Override // x3.InterfaceC2994C
    public r0 l(View view, r0 r0Var, Rr rr) {
        rr.f11057d = r0Var.a() + rr.f11057d;
        boolean z6 = view.getLayoutDirection() == 1;
        int iB = r0Var.b();
        int iC = r0Var.c();
        int i = rr.f11054a + (z6 ? iC : iB);
        rr.f11054a = i;
        int i3 = rr.f11056c;
        if (!z6) {
            iB = iC;
        }
        int i6 = i3 + iB;
        rr.f11056c = i6;
        view.setPaddingRelative(i, rr.f11055b, i6, rr.f11057d);
        return r0Var;
    }

    @Override // o1.InterfaceC2753a
    public Bitmap m(int i, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i3, config);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i4.p r(n4.C2689a r9, boolean r10) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.C0344i.r(n4.a, boolean):i4.p");
    }

    public TraceDataRoom s(Context context) {
        TraceDataRoom traceDataRoom;
        TraceDataRoom traceDataRoom2 = TraceDataRoom.f18856l;
        if (traceDataRoom2 != null) {
            return traceDataRoom2;
        }
        synchronized (this) {
            traceDataRoom = TraceDataRoom.f18856l;
            if (traceDataRoom == null) {
                Context applicationContext = context.getApplicationContext();
                q5.i.d(applicationContext, "getApplicationContext(...)");
                C0.o oVarH = a4.t.h(applicationContext, TraceDataRoom.class, "trace_history.db");
                oVarH.c();
                oVarH.f1078j = true;
                traceDataRoom = (TraceDataRoom) oVarH.b();
                TraceDataRoom.f18856l = traceDataRoom;
            }
        }
        return traceDataRoom;
    }

    public Signature[] t(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.f5755a) {
            case 17:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    public boolean v(CharSequence charSequence) {
        return charSequence instanceof P.e;
    }

    @Override // o1.InterfaceC2753a
    public void o() {
    }

    @Override // o1.InterfaceC2753a
    public void n(int i) {
    }

    @Override // n.v
    public void c(MenuC2677k menuC2677k, boolean z6) {
    }

    @Override // p1.InterfaceC2770a
    public void i(InterfaceC2639e interfaceC2639e, V2.e eVar) {
    }

    @Override // l1.InterfaceC2640f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
