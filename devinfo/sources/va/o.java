package va;

import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.consent_sdk.e6;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.i7;
import com.google.android.gms.internal.consent_sdk.j7;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.BatteryCard;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o implements i7, d0.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36145a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36146b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36147c;

    /* renamed from: d, reason: collision with root package name */
    public Object f36148d;

    /* renamed from: e, reason: collision with root package name */
    public Object f36149e;

    /* renamed from: f, reason: collision with root package name */
    public Object f36150f;
    public Object g;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4) {
        this.f36145a = i4;
        this.f36146b = obj;
        this.f36147c = obj2;
        this.f36148d = obj3;
        this.f36149e = obj4;
        this.f36150f = obj5;
        this.g = obj6;
    }

    public static boolean g(int i4, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList i(int i4, Context context) {
        int iC = p.d3.c(R.attr.colorControlHighlight, context);
        return new ColorStateList(new int[][]{p.d3.f30679b, p.d3.f30681d, p.d3.f30680c, p.d3.f30683f}, new int[]{p.d3.b(R.attr.colorButtonNormal, context), v3.a.b(iC, i4), v3.a.b(iC, i4), i4});
    }

    public static LayerDrawable j(p.k2 k2Var, Context context, int i4) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
        Drawable drawableF = k2Var.f(R.drawable.abc_star_black_48dp, context);
        Drawable drawableF2 = k2Var.f(R.drawable.abc_star_half_black_48dp, context);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void q(Drawable drawable, int i4, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = p.s.f30850b;
        }
        drawableMutate.setColorFilter(p.s.c(i4, mode));
    }

    public static void t(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        r rVar = r.g;
        za.d dVar = rVar.f36157a;
        String str2 = rVar.f36160d.f38129a;
        dVar.getClass();
        za.d.a(context, str2, bundle, new ya.n(dVar, context));
    }

    @Override // d0.t1
    public boolean b() {
        return ((Boolean) ((u0.d1) this.f36149e).getValue()).booleanValue();
    }

    @Override // d0.t1
    public /* synthetic */ boolean c() {
        return true;
    }

    @Override // d0.t1
    public /* synthetic */ boolean d() {
        return true;
    }

    @Override // d0.t1
    public float e(float f10) {
        return ((Number) ((b7.u) this.f36146b).invoke(Float.valueOf(f10))).floatValue();
    }

    @Override // d0.t1
    public Object f(c0.v0 v0Var, mk.e eVar, ek.c cVar) {
        Object objH = xk.x.h(new bh.t(this, v0Var, eVar, null, 7), cVar);
        return objH == dk.a.f22275a ? objH : yj.u.f37649a;
    }

    public km.f h(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f36150f;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i4 = iIndexOf; i4 < size; i4++) {
            km.f fVarA = ((km.e) list.get(i4)).a(type, annotationArr);
            if (fVarA != null) {
                return fVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((km.e) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public ColorStateList k(int i4, Context context) {
        if (i4 == R.drawable.abc_edit_text_material) {
            return wd.b.r(R.color.abc_tint_edittext, context);
        }
        if (i4 == 2131230836) {
            return wd.b.r(R.color.abc_tint_switch_track, context);
        }
        if (i4 != R.drawable.abc_switch_thumb_material) {
            if (i4 == R.drawable.abc_btn_default_mtrl_shape) {
                return i(p.d3.c(R.attr.colorButtonNormal, context), context);
            }
            if (i4 == R.drawable.abc_btn_borderless_material) {
                return i(0, context);
            }
            if (i4 == R.drawable.abc_btn_colored_material) {
                return i(p.d3.c(R.attr.colorAccent, context), context);
            }
            if (i4 == 2131230831 || i4 == R.drawable.abc_spinner_textfield_background_material) {
                return wd.b.r(R.color.abc_tint_spinner, context);
            }
            if (g(i4, (int[]) this.f36147c)) {
                return p.d3.d(R.attr.colorControlNormal, context);
            }
            if (g(i4, (int[]) this.f36150f)) {
                return wd.b.r(R.color.abc_tint_default, context);
            }
            if (g(i4, (int[]) this.g)) {
                return wd.b.r(R.color.abc_tint_btn_checkable, context);
            }
            if (i4 == R.drawable.abc_seekbar_thumb_material) {
                return wd.b.r(R.color.abc_tint_seek_thumb, context);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = p.d3.d(R.attr.colorSwitchThumbNormal, context);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = p.d3.f30679b;
            iArr2[0] = p.d3.b(R.attr.colorSwitchThumbNormal, context);
            iArr[1] = p.d3.f30682e;
            iArr2[1] = p.d3.c(R.attr.colorControlActivated, context);
            iArr[2] = p.d3.f30683f;
            iArr2[2] = p.d3.c(R.attr.colorSwitchThumbNormal, context);
        } else {
            int[] iArr3 = p.d3.f30679b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = p.d3.f30682e;
            iArr2[1] = p.d3.c(R.attr.colorControlActivated, context);
            iArr[2] = p.d3.f30683f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public hm.m l() throws IOException {
        bm.e eVar = bm.e.f2349a;
        Object obj = bm.e.f2349a;
        bm.d dVar = obj != null ? (bm.d) obj : null;
        Context contextB = dVar != null ? dVar.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open((String) this.g);
        nk.k.d(inputStreamOpen, "open(...)");
        return u6.t.q(inputStreamOpen);
    }

    public androidx.lifecycle.f1 m() {
        androidx.lifecycle.f1 f1Var = new androidx.lifecycle.f1(false);
        f1Var.f1134b = (rl.n) this.f36146b;
        f1Var.f1135c = (String) this.f36147c;
        f1Var.f1137e = (rl.x) this.f36149e;
        f1Var.f1138f = (cm.g) this.f36150f;
        f1Var.f1136d = ((rl.m) this.f36148d).d();
        return f1Var;
    }

    public void n() {
        try {
            hm.q qVarD = u6.t.d(l());
            try {
                hm.h byteString = qVarD.readByteString(qVarD.readInt());
                hm.h byteString2 = qVarD.readByteString(qVarD.readInt());
                qVarD.close();
                synchronized (this) {
                    nk.k.b(byteString);
                    this.f36148d = byteString;
                    nk.k.b(byteString2);
                    this.f36149e = byteString2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f36147c).countDown();
        }
    }

    public km.m o(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f36149e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i4 = iIndexOf; i4 < size; i4++) {
            km.m mVarA = ((km.l) list.get(i4)).a(type);
            if (mVarA != null) {
                return mVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((km.l) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public km.m p(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f36149e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i4 = iIndexOf; i4 < size; i4++) {
            km.m mVarB = ((km.l) list.get(i4)).b(type, annotationArr, this);
            if (mVarB != null) {
                return mVarB;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((km.l) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public void r(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f36149e;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((km.l) list.get(i4)).getClass();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.consent_sdk.x a() {
        Application application = (Application) ((j7) this.f36146b).a();
        com.google.android.gms.internal.consent_sdk.v vVar = (com.google.android.gms.internal.consent_sdk.v) ((h7) this.f36147c).a();
        Handler handler = com.google.android.gms.internal.consent_sdk.j0.f19383a;
        com.google.android.gms.internal.consent_sdk.l0.c(handler);
        com.google.android.gms.internal.consent_sdk.i0 i0Var = com.google.android.gms.internal.consent_sdk.j0.f19384b;
        com.google.android.gms.internal.consent_sdk.l0.c(i0Var);
        return new com.google.android.gms.internal.consent_sdk.x(application, vVar, handler, i0Var, (com.google.android.gms.internal.consent_sdk.v0) ((j7) this.f36148d).a(), ((com.google.android.gms.internal.consent_sdk.g) ((j7) this.f36149e)).a(), (com.google.android.gms.internal.consent_sdk.m) ((e6) this.f36150f).a(), (com.google.android.gms.internal.consent_sdk.h) ((j7) this.g).a());
    }

    public String toString() {
        switch (this.f36145a) {
            case 12:
                cm.g gVar = (cm.g) this.f36150f;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Request{method=");
                sb2.append((String) this.f36147c);
                sb2.append(", url=");
                sb2.append((rl.n) this.f36146b);
                rl.m mVar = (rl.m) this.f36148d;
                if (mVar.size() != 0) {
                    sb2.append(", headers=[");
                    int i4 = 0;
                    for (Object obj : mVar) {
                        int i10 = i4 + 1;
                        if (i4 < 0) {
                            cm.g.N();
                            throw null;
                        }
                        yj.i iVar = (yj.i) obj;
                        String str = (String) iVar.f37638a;
                        String str2 = (String) iVar.f37639b;
                        if (i4 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(str);
                        sb2.append(':');
                        if (sl.f.j(str)) {
                            str2 = "██";
                        }
                        sb2.append(str2);
                        i4 = i10;
                    }
                    sb2.append(']');
                }
                if (!nk.k.a(gVar, sl.a.f33825e)) {
                    sb2.append(", tags=");
                    sb2.append(gVar);
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public o(Context context, String str) {
        String strConcat;
        this.f36145a = 13;
        this.f36146b = context.getApplicationContext();
        this.f36147c = str;
        this.f36148d = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = ub.b.a(context).e(0, context.getPackageName()).versionName;
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb2.append(packageName);
            sb2.append("-");
            sb2.append(str2);
            strConcat = sb2.toString();
        } catch (PackageManager.NameNotFoundException e2) {
            za.i.f("Unable to get package version name for reporting", e2);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.g = strConcat;
    }

    public o(Set set, String str, String str2) {
        this.f36145a = 8;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f36146b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f36148d = str;
        this.f36149e = str2;
        this.f36150f = gc.a.f24627b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f36147c = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw je.u.o(it);
    }

    public o(int i4) {
        this.f36145a = i4;
        switch (i4) {
            case 7:
                this.f36146b = new int[]{2131230846, 2131230844, 2131230770};
                this.f36147c = new int[]{2131230794, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f36148d = new int[]{2131230843, 2131230845, 2131230787, R.drawable.abc_text_cursor_material, 2131230840, 2131230841, 2131230842};
                this.f36149e = new int[]{2131230819, R.drawable.abc_cab_background_internal_bg, 2131230818};
                this.f36150f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            default:
                this.f36145a = 4;
                this.f36146b = new AtomicBoolean(false);
                this.f36147c = new CountDownLatch(1);
                this.g = "PublicSuffixDatabase.list";
                break;
        }
    }

    public o(androidx.lifecycle.f1 f1Var) {
        this.f36145a = 12;
        nk.k.e(f1Var, "builder");
        rl.n nVar = (rl.n) f1Var.f1134b;
        if (nVar != null) {
            this.f36146b = nVar;
            this.f36147c = (String) f1Var.f1135c;
            this.f36148d = ((km.y) f1Var.f1136d).x();
            this.f36149e = (rl.x) f1Var.f1137e;
            this.f36150f = (cm.g) f1Var.f1138f;
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public o(BatteryCard batteryCard, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f36145a = 9;
        this.f36146b = textView;
        this.f36147c = textView2;
        this.f36148d = textView3;
        this.f36149e = textView4;
        this.f36150f = textView5;
        this.g = textView6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r10v29 */
    public o(r3.o oVar) {
        Bundle bundle;
        int i4;
        ArrayList arrayList;
        Bundle bundle2;
        int i10;
        this.f36145a = 11;
        new ArrayList();
        this.g = new Bundle();
        this.f36148d = oVar;
        Context context = oVar.f32756a;
        ArrayList arrayList2 = oVar.f32774u;
        ArrayList arrayList3 = oVar.f32758c;
        ArrayList arrayList4 = oVar.f32759d;
        this.f36146b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36147c = r3.q.a(context, oVar.f32771r);
        } else {
            this.f36147c = new Notification.Builder(context);
        }
        Notification notification = oVar.f32773t;
        ?? r10 = 0;
        ((Notification.Builder) this.f36147c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(oVar.f32760e).setContentText(oVar.f32761f).setContentInfo(null).setContentIntent(oVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f36147c;
        IconCompat iconCompat = oVar.f32762h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.g(context));
        ((Notification.Builder) this.f36147c).setSubText(null).setUsesChronometer(false).setPriority(oVar.f32763i);
        ArrayList arrayList5 = oVar.f32757b;
        int size = arrayList5.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList5.get(i11);
            i11++;
            r3.i iVar = (r3.i) obj;
            int i12 = Build.VERSION.SDK_INT;
            if (iVar.f32747b == null && (i10 = iVar.f32750e) != 0) {
                iVar.f32747b = IconCompat.b(r10, "", i10);
            }
            IconCompat iconCompat2 = iVar.f32747b;
            boolean z3 = iVar.f32748c;
            Bundle bundle3 = iVar.f32746a;
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = arrayList3;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != 0 ? iconCompat2.g(r10) : r10, iVar.f32751f, iVar.g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z3);
            if (i12 >= 24) {
                r3.p.b(builder2, z3);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i12 >= 28) {
                r3.r.a(builder2);
            }
            if (i12 >= 29) {
                r3.f.d(builder2);
            }
            if (i12 >= 31) {
                r3.s.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", iVar.f32749d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f36147c).addAction(builder2.build());
            arrayList5 = arrayList6;
            arrayList3 = arrayList7;
            r10 = 0;
        }
        ArrayList arrayList8 = arrayList3;
        Bundle bundle4 = oVar.f32768o;
        if (bundle4 != null) {
            ((Bundle) this.g).putAll(bundle4);
        }
        int i13 = Build.VERSION.SDK_INT;
        this.f36149e = oVar.f32769p;
        this.f36150f = oVar.f32770q;
        ((Notification.Builder) this.f36147c).setShowWhen(oVar.j);
        ((Notification.Builder) this.f36147c).setLocalOnly(oVar.f32766m);
        ((Notification.Builder) this.f36147c).setGroup(oVar.f32765l);
        ((Notification.Builder) this.f36147c).setSortKey(null);
        ((Notification.Builder) this.f36147c).setGroupSummary(false);
        ((Notification.Builder) this.f36147c).setCategory(oVar.f32767n);
        ((Notification.Builder) this.f36147c).setColor(0);
        ((Notification.Builder) this.f36147c).setVisibility(0);
        ((Notification.Builder) this.f36147c).setPublicVersion(null);
        ((Notification.Builder) this.f36147c).setSound(notification.sound, notification.audioAttributes);
        if (i13 < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    throw je.u.o(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    x.f fVar = new x.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                ((Notification.Builder) this.f36147c).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (oVar.f32768o == null) {
                oVar.f32768o = new Bundle();
            }
            Bundle bundle5 = oVar.f32768o.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                String string = Integer.toString(i15);
                r3.i iVar2 = (r3.i) arrayList4.get(i15);
                Bundle bundle8 = new Bundle();
                if (iVar2.f32747b == null && (i4 = iVar2.f32750e) != 0) {
                    iVar2.f32747b = IconCompat.b(null, "", i4);
                }
                IconCompat iconCompat3 = iVar2.f32747b;
                Bundle bundle9 = iVar2.f32746a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", iVar2.f32751f);
                bundle8.putParcelable("actionIntent", iVar2.g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", iVar2.f32748c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", iVar2.f32749d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (oVar.f32768o == null) {
                oVar.f32768o = new Bundle();
            }
            oVar.f32768o.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.g).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            ((Notification.Builder) this.f36147c).setExtras(oVar.f32768o);
            r3.p.e((Notification.Builder) this.f36147c);
            RemoteViews remoteViews = oVar.f32769p;
            if (remoteViews != null) {
                r3.p.d((Notification.Builder) this.f36147c, remoteViews);
            }
            RemoteViews remoteViews2 = oVar.f32770q;
            if (remoteViews2 != null) {
                r3.p.c((Notification.Builder) this.f36147c, remoteViews2);
            }
        }
        if (i16 >= 26) {
            r3.q.c((Notification.Builder) this.f36147c);
            r3.q.e((Notification.Builder) this.f36147c);
            r3.q.f((Notification.Builder) this.f36147c);
            r3.q.g((Notification.Builder) this.f36147c);
            r3.q.d((Notification.Builder) this.f36147c);
            if (!TextUtils.isEmpty(oVar.f32771r)) {
                ((Notification.Builder) this.f36147c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                throw je.u.o(it2);
            }
        }
        if (i16 >= 29) {
            r3.f.b((Notification.Builder) this.f36147c, oVar.f32772s);
            r3.f.c((Notification.Builder) this.f36147c);
        }
        if (i16 >= 36) {
            r3.t.a((Notification.Builder) this.f36147c);
        }
    }

    public o(rl.d dVar, rl.n nVar, List list, List list2, Executor executor) {
        this.f36145a = 6;
        this.f36146b = new ConcurrentHashMap();
        this.f36147c = dVar;
        this.f36148d = nVar;
        this.f36149e = list;
        this.f36150f = list2;
        this.g = executor;
    }

    public o(androidx.lifecycle.g gVar, al.p pVar, cl.d dVar, a6.e eVar) {
        this.f36145a = 1;
        this.f36146b = gVar;
        this.f36147c = pVar;
        this.f36148d = dVar;
        this.f36149e = eVar;
    }

    public o(b7.u uVar) {
        this.f36145a = 3;
        this.f36146b = uVar;
        this.f36147c = new d0.l(this);
        this.f36148d = new c0.z0();
        Boolean bool = Boolean.FALSE;
        this.f36149e = u0.q.r(bool);
        this.f36150f = u0.q.r(bool);
        this.g = u0.q.r(bool);
    }
}
