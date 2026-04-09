package v;

import C.C0634v;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.impl.AbstractC1677a;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1703n;
import androidx.camera.core.impl.C1705o;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.T0;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import w.C5687a;
import w.C5698l;
import w.C5704r;
import w.C5710x;
import z.C5842l;

/* compiled from: SupportedSurfaceCombination.java */
/* loaded from: classes.dex */
public final class n0 {
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC5649d f46799j;

    /* renamed from: k, reason: collision with root package name */
    public final C5698l f46800k;

    /* renamed from: l, reason: collision with root package name */
    public final H6.I f46801l;

    /* renamed from: m, reason: collision with root package name */
    public final int f46802m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f46803n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f46804o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f46805p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f46806q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f46807r;

    /* renamed from: s, reason: collision with root package name */
    public C1705o f46808s;

    /* renamed from: u, reason: collision with root package name */
    public final c0 f46810u;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f46813x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f46791a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f46792b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f46793c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f46794d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f46795e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f46796f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f46797g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f46798h = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f46809t = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final k8.F f46811v = new k8.F();

    /* renamed from: w, reason: collision with root package name */
    public final C5842l f46812w = new C5842l();

    /* compiled from: SupportedSurfaceCombination.java */
    public static abstract class a {
        public abstract int a();

        public abstract int b();

        public abstract boolean c();

        public abstract boolean d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.List] */
    public n0(Context context, String str, C5704r c5704r, InterfaceC5649d interfaceC5649d) throws NumberFormatException, C0634v {
        ArrayList arrayListSingletonList;
        int[] outputFormats;
        long[] jArr;
        boolean z10;
        int[] iArr;
        boolean z11;
        this.f46803n = false;
        this.f46804o = false;
        this.f46805p = false;
        this.f46806q = false;
        this.f46807r = false;
        str.getClass();
        this.i = str;
        interfaceC5649d.getClass();
        this.f46799j = interfaceC5649d;
        this.f46801l = new H6.I(18);
        this.f46810u = c0.b(context);
        try {
            C5698l c5698lB = c5704r.b(str);
            this.f46800k = c5698lB;
            Integer num = (Integer) c5698lB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f46802m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) c5698lB.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.f46803n = true;
                    } else if (i == 6) {
                        this.f46804o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.f46807r = true;
                    }
                }
            }
            d0 d0Var = new d0(this.f46800k);
            this.f46813x = d0Var;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            M0 m02 = new M0();
            N0.b bVar = N0.b.PRIV;
            N0.a aVar = N0.a.MAXIMUM;
            M0 m0F = C4356c.f(bVar, aVar, m02, arrayList2, m02);
            N0.b bVar2 = N0.b.JPEG;
            M0 m0F2 = C4356c.f(bVar2, aVar, m0F, arrayList2, m0F);
            N0.b bVar3 = N0.b.YUV;
            M0 m0F3 = C4356c.f(bVar3, aVar, m0F2, arrayList2, m0F2);
            N0.a aVar2 = N0.a.PREVIEW;
            j6.l.f(bVar, aVar2, m0F3, bVar2, aVar);
            M0 m0C = Oo.c(arrayList2, m0F3);
            j6.l.f(bVar3, aVar2, m0C, bVar2, aVar);
            M0 m0C2 = Oo.c(arrayList2, m0C);
            j6.l.f(bVar, aVar2, m0C2, bVar, aVar2);
            M0 m0C3 = Oo.c(arrayList2, m0C2);
            j6.l.f(bVar, aVar2, m0C3, bVar3, aVar2);
            M0 m0C4 = Oo.c(arrayList2, m0C3);
            j6.l.f(bVar, aVar2, m0C4, bVar3, aVar2);
            m0C4.a(N0.a(bVar2, aVar));
            arrayList2.add(m0C4);
            arrayList.addAll(arrayList2);
            int i10 = this.f46802m;
            if (i10 == 0 || i10 == 1 || i10 == 3) {
                ArrayList arrayList3 = new ArrayList();
                M0 m03 = new M0();
                m03.a(N0.a(bVar, aVar2));
                N0.a aVar3 = N0.a.RECORD;
                M0 m0F4 = C4356c.f(bVar, aVar3, m03, arrayList3, m03);
                j6.l.f(bVar, aVar2, m0F4, bVar3, aVar3);
                M0 m0C5 = Oo.c(arrayList3, m0F4);
                j6.l.f(bVar3, aVar2, m0C5, bVar3, aVar3);
                M0 m0C6 = Oo.c(arrayList3, m0C5);
                j6.l.f(bVar, aVar2, m0C6, bVar, aVar3);
                M0 m0F5 = C4356c.f(bVar2, aVar3, m0C6, arrayList3, m0C6);
                j6.l.f(bVar, aVar2, m0F5, bVar3, aVar3);
                M0 m0F6 = C4356c.f(bVar2, aVar3, m0F5, arrayList3, m0F5);
                j6.l.f(bVar3, aVar2, m0F6, bVar3, aVar2);
                m0F6.a(N0.a(bVar2, aVar));
                arrayList3.add(m0F6);
                arrayList.addAll(arrayList3);
            }
            if (i10 == 1 || i10 == 3) {
                ArrayList arrayList4 = new ArrayList();
                M0 m04 = new M0();
                j6.l.f(bVar, aVar2, m04, bVar, aVar);
                M0 m0C7 = Oo.c(arrayList4, m04);
                j6.l.f(bVar, aVar2, m0C7, bVar3, aVar);
                M0 m0C8 = Oo.c(arrayList4, m0C7);
                j6.l.f(bVar3, aVar2, m0C8, bVar3, aVar);
                M0 m0C9 = Oo.c(arrayList4, m0C8);
                j6.l.f(bVar, aVar2, m0C9, bVar, aVar2);
                M0 m0F7 = C4356c.f(bVar2, aVar, m0C9, arrayList4, m0C9);
                N0.a aVar4 = N0.a.VGA;
                j6.l.f(bVar3, aVar4, m0F7, bVar, aVar2);
                M0 m0F8 = C4356c.f(bVar3, aVar, m0F7, arrayList4, m0F7);
                j6.l.f(bVar3, aVar4, m0F8, bVar3, aVar2);
                m0F8.a(N0.a(bVar3, aVar));
                arrayList4.add(m0F8);
                arrayList.addAll(arrayList4);
            }
            if (this.f46803n) {
                ArrayList arrayList5 = new ArrayList();
                M0 m05 = new M0();
                N0.b bVar4 = N0.b.RAW;
                M0 m0F9 = C4356c.f(bVar4, aVar, m05, arrayList5, m05);
                j6.l.f(bVar, aVar2, m0F9, bVar4, aVar);
                M0 m0C10 = Oo.c(arrayList5, m0F9);
                j6.l.f(bVar3, aVar2, m0C10, bVar4, aVar);
                M0 m0C11 = Oo.c(arrayList5, m0C10);
                j6.l.f(bVar, aVar2, m0C11, bVar, aVar2);
                M0 m0F10 = C4356c.f(bVar4, aVar, m0C11, arrayList5, m0C11);
                j6.l.f(bVar, aVar2, m0F10, bVar3, aVar2);
                M0 m0F11 = C4356c.f(bVar4, aVar, m0F10, arrayList5, m0F10);
                j6.l.f(bVar3, aVar2, m0F11, bVar3, aVar2);
                M0 m0F12 = C4356c.f(bVar4, aVar, m0F11, arrayList5, m0F11);
                j6.l.f(bVar, aVar2, m0F12, bVar2, aVar);
                M0 m0F13 = C4356c.f(bVar4, aVar, m0F12, arrayList5, m0F12);
                j6.l.f(bVar3, aVar2, m0F13, bVar2, aVar);
                m0F13.a(N0.a(bVar4, aVar));
                arrayList5.add(m0F13);
                arrayList.addAll(arrayList5);
            }
            if (this.f46804o && i10 == 0) {
                ArrayList arrayList6 = new ArrayList();
                M0 m06 = new M0();
                j6.l.f(bVar, aVar2, m06, bVar, aVar);
                M0 m0C12 = Oo.c(arrayList6, m06);
                j6.l.f(bVar, aVar2, m0C12, bVar3, aVar);
                M0 m0C13 = Oo.c(arrayList6, m0C12);
                j6.l.f(bVar3, aVar2, m0C13, bVar3, aVar);
                arrayList6.add(m0C13);
                arrayList.addAll(arrayList6);
            }
            if (i10 == 3) {
                ArrayList arrayList7 = new ArrayList();
                M0 m07 = new M0();
                m07.a(N0.a(bVar, aVar2));
                N0.a aVar5 = N0.a.VGA;
                j6.l.f(bVar, aVar5, m07, bVar3, aVar);
                N0.b bVar5 = N0.b.RAW;
                M0 m0F14 = C4356c.f(bVar5, aVar, m07, arrayList7, m07);
                j6.l.f(bVar, aVar2, m0F14, bVar, aVar5);
                j6.l.f(bVar2, aVar, m0F14, bVar5, aVar);
                arrayList7.add(m0F14);
                arrayList.addAll(arrayList7);
            }
            ArrayList arrayList8 = this.f46791a;
            arrayList8.addAll(arrayList);
            if (((ExtraSupportedSurfaceCombinationsQuirk) this.f46801l.f2053c) == null) {
                arrayListSingletonList = new ArrayList();
            } else {
                M0 m08 = ExtraSupportedSurfaceCombinationsQuirk.f14809a;
                String str2 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayListSingletonList = arrayList9;
                    if (this.i.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f14809a);
                        arrayListSingletonList = arrayList9;
                    }
                } else {
                    arrayListSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.f14811c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.d()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f14810b) : Collections.EMPTY_LIST;
                }
            }
            arrayList8.addAll(arrayListSingletonList);
            if (this.f46807r) {
                ArrayList arrayList10 = new ArrayList();
                M0 m09 = new M0();
                N0.a aVar6 = N0.a.ULTRA_MAXIMUM;
                j6.l.f(bVar3, aVar6, m09, bVar, aVar2);
                N0.a aVar7 = N0.a.RECORD;
                M0 m0F15 = C4356c.f(bVar, aVar7, m09, arrayList10, m09);
                j6.l.f(bVar2, aVar6, m0F15, bVar, aVar2);
                M0 m0F16 = C4356c.f(bVar, aVar7, m0F15, arrayList10, m0F15);
                N0.b bVar6 = N0.b.RAW;
                j6.l.f(bVar6, aVar6, m0F16, bVar, aVar2);
                M0 m0F17 = C4356c.f(bVar, aVar7, m0F16, arrayList10, m0F16);
                j6.l.f(bVar3, aVar6, m0F17, bVar, aVar2);
                M0 m0F18 = C4356c.f(bVar2, aVar, m0F17, arrayList10, m0F17);
                j6.l.f(bVar2, aVar6, m0F18, bVar, aVar2);
                M0 m0F19 = C4356c.f(bVar2, aVar, m0F18, arrayList10, m0F18);
                j6.l.f(bVar6, aVar6, m0F19, bVar, aVar2);
                M0 m0F20 = C4356c.f(bVar2, aVar, m0F19, arrayList10, m0F19);
                j6.l.f(bVar3, aVar6, m0F20, bVar, aVar2);
                M0 m0F21 = C4356c.f(bVar3, aVar, m0F20, arrayList10, m0F20);
                j6.l.f(bVar2, aVar6, m0F21, bVar, aVar2);
                M0 m0F22 = C4356c.f(bVar3, aVar, m0F21, arrayList10, m0F21);
                j6.l.f(bVar6, aVar6, m0F22, bVar, aVar2);
                M0 m0F23 = C4356c.f(bVar3, aVar, m0F22, arrayList10, m0F22);
                j6.l.f(bVar3, aVar6, m0F23, bVar, aVar2);
                M0 m0F24 = C4356c.f(bVar6, aVar, m0F23, arrayList10, m0F23);
                j6.l.f(bVar2, aVar6, m0F24, bVar, aVar2);
                M0 m0F25 = C4356c.f(bVar6, aVar, m0F24, arrayList10, m0F24);
                j6.l.f(bVar6, aVar6, m0F25, bVar, aVar2);
                m0F25.a(N0.a(bVar6, aVar));
                arrayList10.add(m0F25);
                this.f46792b.addAll(arrayList10);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f46805p = zHasSystemFeature;
            if (zHasSystemFeature) {
                ArrayList arrayList11 = new ArrayList();
                M0 m010 = new M0();
                N0.a aVar8 = N0.a.s1440p;
                M0 m0F26 = C4356c.f(bVar3, aVar8, m010, arrayList11, m010);
                M0 m0F27 = C4356c.f(bVar, aVar8, m0F26, arrayList11, m0F26);
                M0 m0F28 = C4356c.f(bVar2, aVar8, m0F27, arrayList11, m0F27);
                N0.a aVar9 = N0.a.s720p;
                j6.l.f(bVar3, aVar9, m0F28, bVar2, aVar8);
                M0 m0C14 = Oo.c(arrayList11, m0F28);
                j6.l.f(bVar, aVar9, m0C14, bVar2, aVar8);
                M0 m0C15 = Oo.c(arrayList11, m0C14);
                j6.l.f(bVar3, aVar9, m0C15, bVar3, aVar8);
                M0 m0C16 = Oo.c(arrayList11, m0C15);
                j6.l.f(bVar3, aVar9, m0C16, bVar, aVar8);
                M0 m0C17 = Oo.c(arrayList11, m0C16);
                j6.l.f(bVar, aVar9, m0C17, bVar3, aVar8);
                M0 m0C18 = Oo.c(arrayList11, m0C17);
                j6.l.f(bVar, aVar9, m0C18, bVar, aVar8);
                arrayList11.add(m0C18);
                this.f46793c.addAll(arrayList11);
            }
            if (d0Var.f46691c) {
                ArrayList arrayList12 = new ArrayList();
                M0 m011 = new M0();
                M0 m0F29 = C4356c.f(bVar, aVar, m011, arrayList12, m011);
                M0 m0F30 = C4356c.f(bVar3, aVar, m0F29, arrayList12, m0F29);
                j6.l.f(bVar, aVar2, m0F30, bVar2, aVar);
                M0 m0C19 = Oo.c(arrayList12, m0F30);
                j6.l.f(bVar, aVar2, m0C19, bVar3, aVar);
                M0 m0C20 = Oo.c(arrayList12, m0C19);
                j6.l.f(bVar3, aVar2, m0C20, bVar3, aVar);
                M0 m0C21 = Oo.c(arrayList12, m0C20);
                m0C21.a(N0.a(bVar, aVar2));
                N0.a aVar10 = N0.a.RECORD;
                M0 m0F31 = C4356c.f(bVar, aVar10, m0C21, arrayList12, m0C21);
                j6.l.f(bVar, aVar2, m0F31, bVar, aVar10);
                M0 m0F32 = C4356c.f(bVar3, aVar10, m0F31, arrayList12, m0F31);
                j6.l.f(bVar, aVar2, m0F32, bVar, aVar10);
                m0F32.a(N0.a(bVar2, aVar10));
                arrayList12.add(m0F32);
                this.f46796f.addAll(arrayList12);
            }
            C5710x c5710x = this.f46800k.b().f47161a;
            c5710x.getClass();
            try {
                outputFormats = c5710x.f47164a.getOutputFormats();
            } catch (IllegalArgumentException | NullPointerException e4) {
                C.S.h("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e4);
                outputFormats = null;
            }
            int[] iArr3 = outputFormats != null ? (int[]) outputFormats.clone() : null;
            if (iArr3 != null) {
                int length = iArr3.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (iArr3[i11] == 4101) {
                        ArrayList arrayList13 = new ArrayList();
                        M0 m012 = new M0();
                        N0.b bVar7 = N0.b.JPEG_R;
                        N0.a aVar11 = N0.a.MAXIMUM;
                        M0 m0F33 = C4356c.f(bVar7, aVar11, m012, arrayList13, m012);
                        j6.l.f(N0.b.PRIV, N0.a.PREVIEW, m0F33, bVar7, aVar11);
                        arrayList13.add(m0F33);
                        this.f46797g.addAll(arrayList13);
                        break;
                    }
                    i11++;
                }
            }
            C5698l c5698l = this.f46800k;
            C1683d c1683d = m0.f46780a;
            int i12 = Build.VERSION.SDK_INT;
            boolean z12 = (i12 < 33 || (jArr = (long[]) c5698l.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.f46806q = z12;
            if (!z12 || i12 < 33) {
                z10 = true;
            } else {
                ArrayList arrayList14 = new ArrayList();
                M0 m013 = new M0();
                N0.b bVar8 = N0.b.PRIV;
                N0.a aVar12 = N0.a.s1440p;
                m013.a(new C1703n(bVar8, aVar12, 4L));
                M0 m0C22 = Oo.c(arrayList14, m013);
                N0.b bVar9 = N0.b.YUV;
                m0C22.a(new C1703n(bVar9, aVar12, 4L));
                M0 m0C23 = Oo.c(arrayList14, m0C22);
                N0.a aVar13 = N0.a.RECORD;
                m0C23.a(new C1703n(bVar8, aVar13, 3L));
                M0 m0C24 = Oo.c(arrayList14, m0C23);
                m0C24.a(new C1703n(bVar9, aVar13, 3L));
                M0 m0C25 = Oo.c(arrayList14, m0C24);
                N0.b bVar10 = N0.b.JPEG;
                N0.a aVar14 = N0.a.MAXIMUM;
                z10 = true;
                m0C25.a(new C1703n(bVar10, aVar14, 2L));
                M0 m0C26 = Oo.c(arrayList14, m0C25);
                m0C26.a(new C1703n(bVar9, aVar14, 2L));
                M0 m0C27 = Oo.c(arrayList14, m0C26);
                N0.a aVar15 = N0.a.PREVIEW;
                m0C27.a(new C1703n(bVar8, aVar15, 1L));
                m0C27.a(new C1703n(bVar10, aVar14, 2L));
                M0 m0C28 = Oo.c(arrayList14, m0C27);
                m0C28.a(new C1703n(bVar8, aVar15, 1L));
                m0C28.a(new C1703n(bVar9, aVar14, 2L));
                M0 m0C29 = Oo.c(arrayList14, m0C28);
                m0C29.a(new C1703n(bVar8, aVar15, 1L));
                m0C29.a(new C1703n(bVar8, aVar13, 3L));
                M0 m0C30 = Oo.c(arrayList14, m0C29);
                m0C30.a(new C1703n(bVar8, aVar15, 1L));
                m0C30.a(new C1703n(bVar9, aVar13, 3L));
                M0 m0C31 = Oo.c(arrayList14, m0C30);
                m0C31.a(new C1703n(bVar8, aVar15, 1L));
                m0C31.a(new C1703n(bVar9, aVar15, 1L));
                M0 m0C32 = Oo.c(arrayList14, m0C31);
                m0C32.a(new C1703n(bVar8, aVar15, 1L));
                m0C32.a(new C1703n(bVar8, aVar13, 3L));
                m0C32.a(new C1703n(bVar10, aVar13, 2L));
                M0 m0C33 = Oo.c(arrayList14, m0C32);
                m0C33.a(new C1703n(bVar8, aVar15, 1L));
                m0C33.a(new C1703n(bVar9, aVar13, 3L));
                m0C33.a(new C1703n(bVar10, aVar13, 2L));
                M0 m0C34 = Oo.c(arrayList14, m0C33);
                m0C34.a(new C1703n(bVar8, aVar15, 1L));
                m0C34.a(new C1703n(bVar9, aVar15, 1L));
                m0C34.a(new C1703n(bVar10, aVar14, 2L));
                arrayList14.add(m0C34);
                this.f46798h.addAll(arrayList14);
            }
            C5698l c5698l2 = this.f46800k;
            if (i12 < 33 || (iArr = (int[]) c5698l2.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z11 = false;
            } else {
                for (int i13 : iArr) {
                    if (i13 == 2) {
                        z11 = z10;
                        break;
                    }
                }
                z11 = false;
            }
            if (z11 && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList15 = new ArrayList();
                M0 m014 = new M0();
                N0.b bVar11 = N0.b.PRIV;
                N0.a aVar16 = N0.a.s1440p;
                M0 m0F34 = C4356c.f(bVar11, aVar16, m014, arrayList15, m014);
                N0.b bVar12 = N0.b.YUV;
                M0 m0F35 = C4356c.f(bVar12, aVar16, m0F34, arrayList15, m0F34);
                m0F35.a(N0.a(bVar11, aVar16));
                N0.b bVar13 = N0.b.JPEG;
                N0.a aVar17 = N0.a.MAXIMUM;
                M0 m0F36 = C4356c.f(bVar13, aVar17, m0F35, arrayList15, m0F35);
                j6.l.f(bVar12, aVar16, m0F36, bVar13, aVar17);
                M0 m0C35 = Oo.c(arrayList15, m0F36);
                j6.l.f(bVar11, aVar16, m0C35, bVar12, aVar17);
                M0 m0C36 = Oo.c(arrayList15, m0C35);
                j6.l.f(bVar12, aVar16, m0C36, bVar12, aVar17);
                M0 m0C37 = Oo.c(arrayList15, m0C36);
                N0.a aVar18 = N0.a.PREVIEW;
                j6.l.f(bVar11, aVar18, m0C37, bVar11, aVar16);
                M0 m0C38 = Oo.c(arrayList15, m0C37);
                j6.l.f(bVar12, aVar18, m0C38, bVar11, aVar16);
                M0 m0C39 = Oo.c(arrayList15, m0C38);
                j6.l.f(bVar11, aVar18, m0C39, bVar12, aVar16);
                M0 m0C40 = Oo.c(arrayList15, m0C39);
                j6.l.f(bVar12, aVar18, m0C40, bVar12, aVar16);
                arrayList15.add(m0C40);
                this.f46794d.addAll(arrayList15);
            }
            b();
        } catch (C5687a e10) {
            throw new C0634v(e10);
        }
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i, boolean z10) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        G.d dVar = new G.d(false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), dVar);
        Size size2 = M.c.f4110a;
        if (z10 && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), dVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), dVar);
    }

    public static int e(Range<Integer> range, Range<Integer> range2) {
        A2.l.q("Ranges must not intersect", (range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(C5648c c5648c, List list) {
        List list2;
        HashMap map = this.f46795e;
        if (map.containsKey(c5648c)) {
            list2 = (List) map.get(c5648c);
        } else {
            ArrayList arrayList = new ArrayList();
            int i = c5648c.f46677a;
            if (!c5648c.f46680d) {
                int i10 = c5648c.f46678b;
                if (i10 == 8) {
                    if (i != 1) {
                        ArrayList arrayList2 = this.f46791a;
                        if (i != 2) {
                            if (c5648c.f46679c) {
                                arrayList2 = this.f46794d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.f46792b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        arrayList = this.f46793c;
                    }
                } else if (i10 == 10 && i == 0) {
                    arrayList.addAll(this.f46796f);
                }
            } else if (i == 0) {
                arrayList.addAll(this.f46797g);
            }
            map.put(c5648c, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 = ((M0) it.next()).c(list) != null;
            if (z10) {
                break;
            }
        }
        return z10;
    }

    public final void b() throws NumberFormatException {
        Size size;
        Size size2;
        Size size3;
        int i;
        InterfaceC5649d interfaceC5649d;
        CamcorderProfile camcorderProfileA;
        CamcorderProfile camcorderProfileA2;
        Size sizeE = this.f46810u.e();
        try {
            i = Integer.parseInt(this.i);
            interfaceC5649d = this.f46799j;
            camcorderProfileA = null;
            camcorderProfileA2 = interfaceC5649d.c(i, 1) ? interfaceC5649d.a(i, 1) : null;
        } catch (NumberFormatException unused) {
            Size[] outputSizes = this.f46800k.b().f47161a.f47164a.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = M.c.f4113d;
            } else {
                Arrays.sort(outputSizes, new G.d(true));
                for (Size size4 : outputSizes) {
                    int width = size4.getWidth();
                    Size size5 = M.c.f4115f;
                    if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                        size2 = size4;
                        break;
                    }
                }
                size = M.c.f4113d;
            }
            size2 = size;
        }
        if (camcorderProfileA2 != null) {
            size2 = new Size(camcorderProfileA2.videoFrameWidth, camcorderProfileA2.videoFrameHeight);
        } else {
            Size size6 = M.c.f4113d;
            if (interfaceC5649d.c(i, 10)) {
                camcorderProfileA = interfaceC5649d.a(i, 10);
            } else if (interfaceC5649d.c(i, 8)) {
                camcorderProfileA = interfaceC5649d.a(i, 8);
            } else if (interfaceC5649d.c(i, 12)) {
                camcorderProfileA = interfaceC5649d.a(i, 12);
            } else if (interfaceC5649d.c(i, 6)) {
                camcorderProfileA = interfaceC5649d.a(i, 6);
            } else if (interfaceC5649d.c(i, 5)) {
                camcorderProfileA = interfaceC5649d.a(i, 5);
            } else if (interfaceC5649d.c(i, 4)) {
                camcorderProfileA = interfaceC5649d.a(i, 4);
            }
            if (camcorderProfileA == null) {
                size3 = size6;
                this.f46808s = new C1705o(M.c.f4112c, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
            }
            size2 = new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
        }
        size3 = size2;
        this.f46808s = new C1705o(M.c.f4112c, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
    }

    public final List d(C5648c c5648c, List list) {
        C1683d c1683d = m0.f46780a;
        if (c5648c.f46677a != 0 || c5648c.f46678b != 8) {
            return null;
        }
        Iterator it = this.f46798h.iterator();
        while (it.hasNext()) {
            List<N0> listC = ((M0) it.next()).c(list);
            if (listC != null) {
                return listC;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0e01  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0537 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair g(int r38, java.util.ArrayList r39, java.util.HashMap r40, boolean r41, boolean r42) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 3798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n0.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i10, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1677a abstractC1677a = (AbstractC1677a) it.next();
            arrayList4.add(abstractC1677a.f());
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), abstractC1677a);
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            Size size = (Size) list.get(i11);
            T0 t02 = (T0) arrayList2.get(((Integer) arrayList3.get(i11)).intValue());
            int iH = t02.h();
            arrayList4.add(N0.f(i, iH, size, i(iH)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), t02);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.f46800k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(t02.h(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i10 = Math.min(i10, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i10));
    }

    public final C1705o i(int i) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.f46809t;
        if (!arrayList.contains(Integer.valueOf(i))) {
            j(this.f46808s.f15106b, M.c.f4114e, i);
            j(this.f46808s.f15108d, M.c.f4116g, i);
            Map<Integer, Size> map = this.f46808s.f15110f;
            C5698l c5698l = this.f46800k;
            Size sizeC = c(c5698l.b().f47161a.f47164a, i, true);
            if (sizeC != null) {
                map.put(Integer.valueOf(i), sizeC);
            }
            Map<Integer, Size> map2 = this.f46808s.f15111g;
            if (Build.VERSION.SDK_INT >= 31 && this.f46807r && (streamConfigurationMap = (StreamConfigurationMap) c5698l.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i), c(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.f46808s;
    }

    public final void j(Map<Integer, Size> map, Size size, int i) {
        if (this.f46805p) {
            Size sizeC = c(this.f46800k.b().f47161a.f47164a, i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeC != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeC), new G.d(false));
            }
            map.put(numValueOf, size);
        }
    }
}
