package xg;

import ah.j;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.slider.Slider;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import i.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import nk.k;
import nk.v;
import p.o2;
import t7.m;
import wg.p;
import wg.s;
import xk.a0;
import yj.u;
import zh.i;
import zj.n;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends oc.g {

    /* renamed from: p0, reason: collision with root package name */
    public qg.e f37101p0;

    /* renamed from: q0, reason: collision with root package name */
    public final f1 f37102q0;

    /* renamed from: r0, reason: collision with root package name */
    public a0 f37103r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Handler f37104s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f37105t0;

    public g() {
        a aVar = new a(this, 0);
        yj.f fVarT = a.a.t(yj.g.f37636b, new w2.c(3, new w2.c(2, this)));
        this.f37102q0 = new f1(v.a(h.class), new ej.h(fVarT, 16), aVar, new ej.h(fVarT, 17));
        this.f37104s0 = new Handler(Looper.getMainLooper());
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        k.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_custom_bottom_sheet, viewGroup, false);
        int i4 = R.id.btn_add;
        ImageView imageView = (ImageView) wb.e.s(R.id.btn_add, viewInflate);
        if (imageView != null) {
            i4 = R.id.btn_confirm;
            MaterialButton materialButton = (MaterialButton) wb.e.s(R.id.btn_confirm, viewInflate);
            if (materialButton != null) {
                i4 = R.id.btn_move_down;
                ImageView imageView2 = (ImageView) wb.e.s(R.id.btn_move_down, viewInflate);
                if (imageView2 != null) {
                    i4 = R.id.btn_move_left;
                    ImageView imageView3 = (ImageView) wb.e.s(R.id.btn_move_left, viewInflate);
                    if (imageView3 != null) {
                        i4 = R.id.btn_move_right;
                        ImageView imageView4 = (ImageView) wb.e.s(R.id.btn_move_right, viewInflate);
                        if (imageView4 != null) {
                            i4 = R.id.btn_move_up;
                            ImageView imageView5 = (ImageView) wb.e.s(R.id.btn_move_up, viewInflate);
                            if (imageView5 != null) {
                                i4 = R.id.chip_color_dark;
                                Chip chip = (Chip) wb.e.s(R.id.chip_color_dark, viewInflate);
                                if (chip != null) {
                                    i4 = R.id.chip_color_light;
                                    Chip chip2 = (Chip) wb.e.s(R.id.chip_color_light, viewInflate);
                                    if (chip2 != null) {
                                        i4 = R.id.chip_display_name;
                                        Chip chip3 = (Chip) wb.e.s(R.id.chip_display_name, viewInflate);
                                        if (chip3 != null) {
                                            i4 = R.id.chip_layout_horizontal;
                                            Chip chip4 = (Chip) wb.e.s(R.id.chip_layout_horizontal, viewInflate);
                                            if (chip4 != null) {
                                                i4 = R.id.chip_layout_vertical;
                                                Chip chip5 = (Chip) wb.e.s(R.id.chip_layout_vertical, viewInflate);
                                                if (chip5 != null) {
                                                    i4 = R.id.chip_not_display_name;
                                                    Chip chip6 = (Chip) wb.e.s(R.id.chip_not_display_name, viewInflate);
                                                    if (chip6 != null) {
                                                        i4 = R.id.contents_container;
                                                        LinearLayout linearLayout = (LinearLayout) wb.e.s(R.id.contents_container, viewInflate);
                                                        if (linearLayout != null) {
                                                            i4 = R.id.edit_text_input;
                                                            EditText editText = (EditText) wb.e.s(R.id.edit_text_input, viewInflate);
                                                            if (editText != null) {
                                                                i4 = R.id.slider_container_padding;
                                                                Slider slider = (Slider) wb.e.s(R.id.slider_container_padding, viewInflate);
                                                                if (slider != null) {
                                                                    i4 = R.id.slider_item_spacing;
                                                                    Slider slider2 = (Slider) wb.e.s(R.id.slider_item_spacing, viewInflate);
                                                                    if (slider2 != null) {
                                                                        i4 = R.id.slider_text_size;
                                                                        Slider slider3 = (Slider) wb.e.s(R.id.slider_text_size, viewInflate);
                                                                        if (slider3 != null) {
                                                                            i4 = R.id.slider_transparency;
                                                                            Slider slider4 = (Slider) wb.e.s(R.id.slider_transparency, viewInflate);
                                                                            if (slider4 != null) {
                                                                                i4 = R.id.text_title;
                                                                                if (((TextView) wb.e.s(R.id.text_title, viewInflate)) != null) {
                                                                                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                                                                    this.f37101p0 = new qg.e(linearLayout2, imageView, materialButton, imageView2, imageView3, imageView4, imageView5, chip, chip2, chip3, chip4, chip5, chip6, linearLayout, editText, slider, slider2, slider3, slider4);
                                                                                    k.d(linearLayout2, "getRoot(...)");
                                                                                    return linearLayout2;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // b5.s, b5.z
    public final void I() {
        super.I();
        l0();
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        h hVarK0 = k0();
        Context contextW = W();
        hVarK0.getClass();
        hVarK0.g(contextW);
        Object objD = hVarK0.f37106b.d();
        k.b(objD);
        MonitorManager monitorManager = MonitorManager.f21223f;
        monitorManager.f("monitor_preview");
        monitorManager.c(((CustomMonitorConfig) objD).getId(), false);
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        h hVarK0 = k0();
        Context contextW = W();
        hVarK0.getClass();
        Object objD = hVarK0.f37106b.d();
        k.b(objD);
        CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD;
        MonitorManager monitorManager = MonitorManager.f21223f;
        monitorManager.g(CustomMonitorConfig.copy$default(customMonitorConfig, "monitor_preview", null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, true, false, false, null, 245758, null));
        hVarK0.g(contextW);
        monitorManager.c(customMonitorConfig.getId(), true);
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) throws Resources.NotFoundException {
        float itemSpacingDp;
        float f10;
        Float fValueOf = Float.valueOf(40.0f);
        k.e(view, "view");
        ArrayList arrayList = i.f38298a;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        final int iA = com.liuzh.deviceinfo.utilities.f.a();
        final int iD = com.liuzh.deviceinfo.utilities.f.d();
        Object parent = view.getParent();
        k.c(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B((View) parent);
        final int i4 = 3;
        bottomSheetBehaviorB.J(3);
        bottomSheetBehaviorB.f20366l = pd.b.j(480);
        com.liuzh.deviceinfo.utilities.f.a();
        int iD2 = com.liuzh.deviceinfo.utilities.f.d();
        qg.e eVar = this.f37101p0;
        if (eVar == null) {
            k.k("viewBinding");
            throw null;
        }
        dj.b.h((MaterialButton) eVar.f32349f, iD2);
        qg.e eVar2 = this.f37101p0;
        if (eVar2 == null) {
            k.k("viewBinding");
            throw null;
        }
        final int i10 = 1;
        final int i11 = 0;
        dj.b.g(iD2, (EditText) eVar2.f32355n);
        qg.e eVar3 = this.f37101p0;
        if (eVar3 == null) {
            k.k("viewBinding");
            throw null;
        }
        dj.b.e(iD2, (Chip) eVar3.f32350h);
        qg.e eVar4 = this.f37101p0;
        if (eVar4 == null) {
            k.k("viewBinding");
            throw null;
        }
        dj.b.e(iD2, (Chip) eVar4.g);
        qg.e eVar5 = this.f37101p0;
        if (eVar5 == null) {
            k.k("viewBinding");
            throw null;
        }
        dj.b.e(iD2, (Chip) eVar5.f32351i);
        qg.e eVar6 = this.f37101p0;
        if (eVar6 == null) {
            k.k("viewBinding");
            throw null;
        }
        dj.b.e(iD2, (Chip) eVar6.f32353l);
        qg.e eVar7 = this.f37101p0;
        if (eVar7 == null) {
            k.k("viewBinding");
            throw null;
        }
        dj.b.e(iD2, (Chip) eVar7.f32352k);
        qg.e eVar8 = this.f37101p0;
        if (eVar8 == null) {
            k.k("viewBinding");
            throw null;
        }
        dj.b.e(iD2, (Chip) eVar8.j);
        qg.e eVar9 = this.f37101p0;
        if (eVar9 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((EditText) eVar9.f32355n).addTextChangedListener(new o2(1, this));
        qg.e eVar10 = this.f37101p0;
        if (eVar10 == null) {
            k.k("viewBinding");
            throw null;
        }
        eVar10.f32344a.setOnClickListener(new View.OnClickListener(this) { // from class: xg.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37097b;

            {
                this.f37097b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r1v5 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                g gVar;
                ?? r12;
                switch (i11) {
                    case 0:
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        g gVar2 = this.f37097b;
                        qg.e eVar11 = gVar2.f37101p0;
                        if (eVar11 == null) {
                            k.k("viewBinding");
                            throw null;
                        }
                        LinearLayout linearLayout = (LinearLayout) eVar11.f32354m;
                        int childCount = linearLayout.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            Object tag = linearLayout.getChildAt(i12).getTag();
                            k.c(tag, "null cannot be cast to non-null type com.liuzh.deviceinfo.monitor.MonitorContent");
                            linkedHashSet.add((s) tag);
                        }
                        fk.b<s> bVar = s.f36704n;
                        ArrayList arrayList2 = new ArrayList();
                        for (s sVar : bVar) {
                            if (linkedHashSet.contains(sVar)) {
                                sVar = null;
                            }
                            if (sVar != null) {
                                arrayList2.add(sVar);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            Toast.makeText(gVar2.p(), R.string.all_contents_added, 0).show();
                            return;
                        }
                        ArrayList arrayList3 = new ArrayList(o.T(arrayList2, 10));
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            arrayList3.add(((s) obj).f36705a);
                        }
                        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                        m mVar = new m(gVar2.W());
                        mVar.y(R.string.content);
                        qh.h hVar = new qh.h(3, arrayList2, gVar2);
                        i.b bVar2 = (i.b) mVar.f34474c;
                        bVar2.f25244q = strArr;
                        bVar2.f25246s = hVar;
                        mVar.w(R.string.cancel, null);
                        mVar.A().setCanceledOnTouchOutside(false);
                        return;
                    default:
                        g gVar3 = this.f37097b;
                        h hVarK0 = gVar3.k0();
                        Context contextW = gVar3.W();
                        hVarK0.getClass();
                        hVarK0.g(contextW);
                        Object objD = hVarK0.f37106b.d();
                        k.b(objD);
                        CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD;
                        if (vk.i.H0(customMonitorConfig.getName())) {
                            Toast.makeText(contextW, R.string.please_input_name, 0).show();
                            return;
                        }
                        if (customMonitorConfig.getContent().isEmpty()) {
                            Toast.makeText(contextW, R.string.please_add_content, 0).show();
                            return;
                        }
                        List listB = com.liuzh.deviceinfo.utilities.f.f21256b.b();
                        k.d(listB, "getCustomMonitors(...)");
                        ArrayList arrayListS0 = n.s0(listB);
                        int size2 = arrayListS0.size();
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = arrayListS0.get(i15);
                                i15++;
                                if (!k.a(((CustomMonitorConfig) obj2).getId(), customMonitorConfig.getId())) {
                                    i14++;
                                }
                            } else {
                                i14 = -1;
                            }
                        }
                        if (i14 >= 0) {
                            gVar = gVar3;
                            r12 = 0;
                            arrayListS0.set(i14, CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, System.currentTimeMillis(), false, false, false, null, 253951, null));
                        } else {
                            gVar = gVar3;
                            r12 = 0;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            arrayListS0.add(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, jCurrentTimeMillis, jCurrentTimeMillis, false, false, false, null, 249855, null));
                        }
                        com.liuzh.deviceinfo.utilities.f.f21256b.o(arrayListS0);
                        Toast.makeText(contextW, R.string.save_successful, (int) r12).show();
                        y yVar = gVar;
                        Dialog dialog = yVar.f1867k0;
                        if (dialog instanceof oc.f) {
                            oc.f fVar2 = (oc.f) dialog;
                            if (fVar2.g == null) {
                                fVar2.f();
                            }
                            boolean z3 = fVar2.g.I;
                        }
                        yVar.d0(r12, r12);
                        return;
                }
            }
        });
        qg.e eVar11 = this.f37101p0;
        if (eVar11 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((Chip) eVar11.f32350h).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: xg.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37099b;

            {
                this.f37099b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i11) {
                    case 0:
                        k.e(compoundButton, "<unused var>");
                        h hVarK0 = this.f37099b.k0();
                        hVarK0.getClass();
                        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp, "instance");
                        hVarK0.g(deviceInfoApp);
                        Object objD = hVarK0.f37106b.d();
                        k.b(objD);
                        hVarK0.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD, null, null, !z3, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262139, null));
                        return;
                    case 1:
                        k.e(compoundButton, "<unused var>");
                        g gVar = this.f37099b;
                        h hVarK02 = gVar.k0();
                        qg.e eVar12 = gVar.f37101p0;
                        if (eVar12 == null) {
                            k.k("viewBinding");
                            throw null;
                        }
                        int iS = pk.a.s(((Slider) eVar12.f32357p).getValue());
                        hVarK02.getClass();
                        DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp2, "instance");
                        hVarK02.g(deviceInfoApp2);
                        Object objD2 = hVarK02.f37106b.d();
                        k.b(objD2);
                        hVarK02.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD2, null, null, false, 0.0f, 0.0f, z3, 0.0f, ((iS * 10.0f) / 100.0f) + (z3 ? 0.0f : 2.0f), 0, 0, 0, 0, 0L, 0L, false, false, false, null, 261983, null));
                        return;
                    default:
                        k.e(compoundButton, "<unused var>");
                        h hVarK03 = this.f37099b.k0();
                        hVarK03.getClass();
                        DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp3, "instance");
                        hVarK03.g(deviceInfoApp3);
                        Object objD3 = hVarK03.f37106b.d();
                        k.b(objD3);
                        hVarK03.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD3, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, z3, false, null, 229375, null));
                        return;
                }
            }
        });
        qg.e eVar12 = this.f37101p0;
        if (eVar12 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((Chip) eVar12.f32352k).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: xg.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37099b;

            {
                this.f37099b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i10) {
                    case 0:
                        k.e(compoundButton, "<unused var>");
                        h hVarK0 = this.f37099b.k0();
                        hVarK0.getClass();
                        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp, "instance");
                        hVarK0.g(deviceInfoApp);
                        Object objD = hVarK0.f37106b.d();
                        k.b(objD);
                        hVarK0.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD, null, null, !z3, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262139, null));
                        return;
                    case 1:
                        k.e(compoundButton, "<unused var>");
                        g gVar = this.f37099b;
                        h hVarK02 = gVar.k0();
                        qg.e eVar122 = gVar.f37101p0;
                        if (eVar122 == null) {
                            k.k("viewBinding");
                            throw null;
                        }
                        int iS = pk.a.s(((Slider) eVar122.f32357p).getValue());
                        hVarK02.getClass();
                        DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp2, "instance");
                        hVarK02.g(deviceInfoApp2);
                        Object objD2 = hVarK02.f37106b.d();
                        k.b(objD2);
                        hVarK02.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD2, null, null, false, 0.0f, 0.0f, z3, 0.0f, ((iS * 10.0f) / 100.0f) + (z3 ? 0.0f : 2.0f), 0, 0, 0, 0, 0L, 0L, false, false, false, null, 261983, null));
                        return;
                    default:
                        k.e(compoundButton, "<unused var>");
                        h hVarK03 = this.f37099b.k0();
                        hVarK03.getClass();
                        DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp3, "instance");
                        hVarK03.g(deviceInfoApp3);
                        Object objD3 = hVarK03.f37106b.d();
                        k.b(objD3);
                        hVarK03.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD3, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, z3, false, null, 229375, null));
                        return;
                }
            }
        });
        qg.e eVar13 = this.f37101p0;
        if (eVar13 == null) {
            k.k("viewBinding");
            throw null;
        }
        final int i12 = 2;
        ((Chip) eVar13.f32351i).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: xg.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37099b;

            {
                this.f37099b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i12) {
                    case 0:
                        k.e(compoundButton, "<unused var>");
                        h hVarK0 = this.f37099b.k0();
                        hVarK0.getClass();
                        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp, "instance");
                        hVarK0.g(deviceInfoApp);
                        Object objD = hVarK0.f37106b.d();
                        k.b(objD);
                        hVarK0.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD, null, null, !z3, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262139, null));
                        return;
                    case 1:
                        k.e(compoundButton, "<unused var>");
                        g gVar = this.f37099b;
                        h hVarK02 = gVar.k0();
                        qg.e eVar122 = gVar.f37101p0;
                        if (eVar122 == null) {
                            k.k("viewBinding");
                            throw null;
                        }
                        int iS = pk.a.s(((Slider) eVar122.f32357p).getValue());
                        hVarK02.getClass();
                        DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp2, "instance");
                        hVarK02.g(deviceInfoApp2);
                        Object objD2 = hVarK02.f37106b.d();
                        k.b(objD2);
                        hVarK02.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD2, null, null, false, 0.0f, 0.0f, z3, 0.0f, ((iS * 10.0f) / 100.0f) + (z3 ? 0.0f : 2.0f), 0, 0, 0, 0, 0L, 0L, false, false, false, null, 261983, null));
                        return;
                    default:
                        k.e(compoundButton, "<unused var>");
                        h hVarK03 = this.f37099b.k0();
                        hVarK03.getClass();
                        DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
                        k.d(deviceInfoApp3, "instance");
                        hVarK03.g(deviceInfoApp3);
                        Object objD3 = hVarK03.f37106b.d();
                        k.b(objD3);
                        hVarK03.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD3, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, z3, false, null, 229375, null));
                        return;
                }
            }
        });
        mk.e eVar14 = new mk.e(iA, iD) { // from class: xg.f

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f37100a;

            {
                this.f37100a = iD;
            }

            @Override // mk.e
            public final Object invoke(Object obj, Object obj2) {
                Slider slider = (Slider) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                dj.b.o(slider, this.f37100a);
                slider.setValue(fFloatValue);
                slider.setLabelFormatter(new p(4));
                return u.f37649a;
            }
        };
        qg.e eVar15 = this.f37101p0;
        if (eVar15 == null) {
            k.k("viewBinding");
            throw null;
        }
        eVar14.invoke((Slider) eVar15.f32359r, fValueOf);
        qg.e eVar16 = this.f37101p0;
        if (eVar16 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((Slider) eVar16.f32359r).a(new gd.g(this) { // from class: xg.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37093b;

            {
                this.f37093b = this;
            }

            @Override // gd.g
            public final /* bridge */ /* synthetic */ void a(gd.e eVar17, float f11, boolean z3) {
                int i13 = i11;
                b((Slider) eVar17, f11, z3);
            }

            public final void b(Slider slider, float f11, boolean z3) {
                switch (i11) {
                    case 0:
                        h hVarK0 = this.f37093b.k0();
                        int iS = pk.a.s(f11);
                        hVarK0.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp, "instance");
                            hVarK0.g(deviceInfoApp);
                            Object objD = hVarK0.f37106b.d();
                            k.b(objD);
                            hVarK0.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD, null, null, false, 0.0f, iS / 100.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262127, null));
                            break;
                        }
                        break;
                    case 1:
                        h hVarK02 = this.f37093b.k0();
                        int iS2 = pk.a.s(f11);
                        hVarK02.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp2, "instance");
                            hVarK02.g(deviceInfoApp2);
                            Object objD2 = hVarK02.f37106b.d();
                            k.b(objD2);
                            hVarK02.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD2, null, null, false, ((iS2 * 20.0f) / 100.0f) + 8, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262135, null));
                            break;
                        }
                        break;
                    case 2:
                        h hVarK03 = this.f37093b.k0();
                        int iS3 = pk.a.s(f11);
                        hVarK03.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp3, "instance");
                            hVarK03.g(deviceInfoApp3);
                            Object objD3 = hVarK03.f37106b.d();
                            k.b(objD3);
                            hVarK03.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD3, null, null, false, 0.0f, 0.0f, false, (iS3 * 12.0f) / 100.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262079, null));
                            break;
                        }
                        break;
                    default:
                        h hVarK04 = this.f37093b.k0();
                        int iS4 = pk.a.s(f11);
                        hVarK04.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp4 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp4, "instance");
                            hVarK04.g(deviceInfoApp4);
                            Object objD4 = hVarK04.f37106b.d();
                            k.b(objD4);
                            CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD4;
                            hVarK04.h(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, ((iS4 * 10.0f) / 100.0f) + (customMonitorConfig.getVerticalLayout() ? 0.0f : 2.0f), 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262015, null));
                            break;
                        }
                        break;
                }
            }
        });
        qg.e eVar17 = this.f37101p0;
        if (eVar17 == null) {
            k.k("viewBinding");
            throw null;
        }
        eVar14.invoke((Slider) eVar17.f32358q, fValueOf);
        qg.e eVar18 = this.f37101p0;
        if (eVar18 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((Slider) eVar18.f32358q).a(new gd.g(this) { // from class: xg.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37093b;

            {
                this.f37093b = this;
            }

            @Override // gd.g
            public final /* bridge */ /* synthetic */ void a(gd.e eVar172, float f11, boolean z3) {
                int i13 = i10;
                b((Slider) eVar172, f11, z3);
            }

            public final void b(Slider slider, float f11, boolean z3) {
                switch (i10) {
                    case 0:
                        h hVarK0 = this.f37093b.k0();
                        int iS = pk.a.s(f11);
                        hVarK0.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp, "instance");
                            hVarK0.g(deviceInfoApp);
                            Object objD = hVarK0.f37106b.d();
                            k.b(objD);
                            hVarK0.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD, null, null, false, 0.0f, iS / 100.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262127, null));
                            break;
                        }
                        break;
                    case 1:
                        h hVarK02 = this.f37093b.k0();
                        int iS2 = pk.a.s(f11);
                        hVarK02.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp2, "instance");
                            hVarK02.g(deviceInfoApp2);
                            Object objD2 = hVarK02.f37106b.d();
                            k.b(objD2);
                            hVarK02.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD2, null, null, false, ((iS2 * 20.0f) / 100.0f) + 8, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262135, null));
                            break;
                        }
                        break;
                    case 2:
                        h hVarK03 = this.f37093b.k0();
                        int iS3 = pk.a.s(f11);
                        hVarK03.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp3, "instance");
                            hVarK03.g(deviceInfoApp3);
                            Object objD3 = hVarK03.f37106b.d();
                            k.b(objD3);
                            hVarK03.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD3, null, null, false, 0.0f, 0.0f, false, (iS3 * 12.0f) / 100.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262079, null));
                            break;
                        }
                        break;
                    default:
                        h hVarK04 = this.f37093b.k0();
                        int iS4 = pk.a.s(f11);
                        hVarK04.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp4 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp4, "instance");
                            hVarK04.g(deviceInfoApp4);
                            Object objD4 = hVarK04.f37106b.d();
                            k.b(objD4);
                            CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD4;
                            hVarK04.h(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, ((iS4 * 10.0f) / 100.0f) + (customMonitorConfig.getVerticalLayout() ? 0.0f : 2.0f), 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262015, null));
                            break;
                        }
                        break;
                }
            }
        });
        qg.e eVar19 = this.f37101p0;
        if (eVar19 == null) {
            k.k("viewBinding");
            throw null;
        }
        eVar14.invoke((Slider) eVar19.f32356o, fValueOf);
        qg.e eVar20 = this.f37101p0;
        if (eVar20 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((Slider) eVar20.f32356o).a(new gd.g(this) { // from class: xg.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37093b;

            {
                this.f37093b = this;
            }

            @Override // gd.g
            public final /* bridge */ /* synthetic */ void a(gd.e eVar172, float f11, boolean z3) {
                int i13 = i12;
                b((Slider) eVar172, f11, z3);
            }

            public final void b(Slider slider, float f11, boolean z3) {
                switch (i12) {
                    case 0:
                        h hVarK0 = this.f37093b.k0();
                        int iS = pk.a.s(f11);
                        hVarK0.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp, "instance");
                            hVarK0.g(deviceInfoApp);
                            Object objD = hVarK0.f37106b.d();
                            k.b(objD);
                            hVarK0.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD, null, null, false, 0.0f, iS / 100.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262127, null));
                            break;
                        }
                        break;
                    case 1:
                        h hVarK02 = this.f37093b.k0();
                        int iS2 = pk.a.s(f11);
                        hVarK02.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp2, "instance");
                            hVarK02.g(deviceInfoApp2);
                            Object objD2 = hVarK02.f37106b.d();
                            k.b(objD2);
                            hVarK02.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD2, null, null, false, ((iS2 * 20.0f) / 100.0f) + 8, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262135, null));
                            break;
                        }
                        break;
                    case 2:
                        h hVarK03 = this.f37093b.k0();
                        int iS3 = pk.a.s(f11);
                        hVarK03.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp3, "instance");
                            hVarK03.g(deviceInfoApp3);
                            Object objD3 = hVarK03.f37106b.d();
                            k.b(objD3);
                            hVarK03.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD3, null, null, false, 0.0f, 0.0f, false, (iS3 * 12.0f) / 100.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262079, null));
                            break;
                        }
                        break;
                    default:
                        h hVarK04 = this.f37093b.k0();
                        int iS4 = pk.a.s(f11);
                        hVarK04.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp4 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp4, "instance");
                            hVarK04.g(deviceInfoApp4);
                            Object objD4 = hVarK04.f37106b.d();
                            k.b(objD4);
                            CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD4;
                            hVarK04.h(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, ((iS4 * 10.0f) / 100.0f) + (customMonitorConfig.getVerticalLayout() ? 0.0f : 2.0f), 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262015, null));
                            break;
                        }
                        break;
                }
            }
        });
        qg.e eVar21 = this.f37101p0;
        if (eVar21 == null) {
            k.k("viewBinding");
            throw null;
        }
        eVar14.invoke((Slider) eVar21.f32357p, fValueOf);
        qg.e eVar22 = this.f37101p0;
        if (eVar22 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((Slider) eVar22.f32357p).a(new gd.g(this) { // from class: xg.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37093b;

            {
                this.f37093b = this;
            }

            @Override // gd.g
            public final /* bridge */ /* synthetic */ void a(gd.e eVar172, float f11, boolean z3) {
                int i13 = i4;
                b((Slider) eVar172, f11, z3);
            }

            public final void b(Slider slider, float f11, boolean z3) {
                switch (i4) {
                    case 0:
                        h hVarK0 = this.f37093b.k0();
                        int iS = pk.a.s(f11);
                        hVarK0.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp, "instance");
                            hVarK0.g(deviceInfoApp);
                            Object objD = hVarK0.f37106b.d();
                            k.b(objD);
                            hVarK0.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD, null, null, false, 0.0f, iS / 100.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262127, null));
                            break;
                        }
                        break;
                    case 1:
                        h hVarK02 = this.f37093b.k0();
                        int iS2 = pk.a.s(f11);
                        hVarK02.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp2, "instance");
                            hVarK02.g(deviceInfoApp2);
                            Object objD2 = hVarK02.f37106b.d();
                            k.b(objD2);
                            hVarK02.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD2, null, null, false, ((iS2 * 20.0f) / 100.0f) + 8, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262135, null));
                            break;
                        }
                        break;
                    case 2:
                        h hVarK03 = this.f37093b.k0();
                        int iS3 = pk.a.s(f11);
                        hVarK03.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp3, "instance");
                            hVarK03.g(deviceInfoApp3);
                            Object objD3 = hVarK03.f37106b.d();
                            k.b(objD3);
                            hVarK03.h(CustomMonitorConfig.copy$default((CustomMonitorConfig) objD3, null, null, false, 0.0f, 0.0f, false, (iS3 * 12.0f) / 100.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262079, null));
                            break;
                        }
                        break;
                    default:
                        h hVarK04 = this.f37093b.k0();
                        int iS4 = pk.a.s(f11);
                        hVarK04.getClass();
                        if (z3) {
                            DeviceInfoApp deviceInfoApp4 = DeviceInfoApp.f21145f;
                            k.d(deviceInfoApp4, "instance");
                            hVarK04.g(deviceInfoApp4);
                            Object objD4 = hVarK04.f37106b.d();
                            k.b(objD4);
                            CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD4;
                            hVarK04.h(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, ((iS4 * 10.0f) / 100.0f) + (customMonitorConfig.getVerticalLayout() ? 0.0f : 2.0f), 0, 0, 0, 0, 0L, 0L, false, false, false, null, 262015, null));
                            break;
                        }
                        break;
                }
            }
        });
        qg.e eVar23 = this.f37101p0;
        if (eVar23 == null) {
            k.k("viewBinding");
            throw null;
        }
        ImageView imageView = (ImageView) eVar23.f32348e;
        final a aVar = new a(this, 1);
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: xg.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                g gVar = this.f37094a;
                mk.a aVar2 = aVar;
                if (action == 0) {
                    gVar.f37105t0 = false;
                    gVar.l0();
                    view2.setPressed(true);
                    gVar.f37104s0.postDelayed(new oi.f(gVar, view2, aVar2), ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                if (action != 1 && action != 3) {
                    return false;
                }
                view2.setPressed(false);
                if (!gVar.f37105t0) {
                    aVar2.invoke();
                }
                gVar.l0();
                return true;
            }
        });
        qg.e eVar24 = this.f37101p0;
        if (eVar24 == null) {
            k.k("viewBinding");
            throw null;
        }
        ImageView imageView2 = (ImageView) eVar24.f32345b;
        final a aVar2 = new a(this, 2);
        imageView2.setOnTouchListener(new View.OnTouchListener() { // from class: xg.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                g gVar = this.f37094a;
                mk.a aVar22 = aVar2;
                if (action == 0) {
                    gVar.f37105t0 = false;
                    gVar.l0();
                    view2.setPressed(true);
                    gVar.f37104s0.postDelayed(new oi.f(gVar, view2, aVar22), ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                if (action != 1 && action != 3) {
                    return false;
                }
                view2.setPressed(false);
                if (!gVar.f37105t0) {
                    aVar22.invoke();
                }
                gVar.l0();
                return true;
            }
        });
        qg.e eVar25 = this.f37101p0;
        if (eVar25 == null) {
            k.k("viewBinding");
            throw null;
        }
        ImageView imageView3 = (ImageView) eVar25.f32346c;
        final a aVar3 = new a(this, 3);
        imageView3.setOnTouchListener(new View.OnTouchListener() { // from class: xg.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                g gVar = this.f37094a;
                mk.a aVar22 = aVar3;
                if (action == 0) {
                    gVar.f37105t0 = false;
                    gVar.l0();
                    view2.setPressed(true);
                    gVar.f37104s0.postDelayed(new oi.f(gVar, view2, aVar22), ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                if (action != 1 && action != 3) {
                    return false;
                }
                view2.setPressed(false);
                if (!gVar.f37105t0) {
                    aVar22.invoke();
                }
                gVar.l0();
                return true;
            }
        });
        qg.e eVar26 = this.f37101p0;
        if (eVar26 == null) {
            k.k("viewBinding");
            throw null;
        }
        ImageView imageView4 = (ImageView) eVar26.f32347d;
        final a aVar4 = new a(this, 4);
        imageView4.setOnTouchListener(new View.OnTouchListener() { // from class: xg.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                g gVar = this.f37094a;
                mk.a aVar22 = aVar4;
                if (action == 0) {
                    gVar.f37105t0 = false;
                    gVar.l0();
                    view2.setPressed(true);
                    gVar.f37104s0.postDelayed(new oi.f(gVar, view2, aVar22), ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                if (action != 1 && action != 3) {
                    return false;
                }
                view2.setPressed(false);
                if (!gVar.f37105t0) {
                    aVar22.invoke();
                }
                gVar.l0();
                return true;
            }
        });
        qg.e eVar27 = this.f37101p0;
        if (eVar27 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((MaterialButton) eVar27.f32349f).setOnClickListener(new View.OnClickListener(this) { // from class: xg.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f37097b;

            {
                this.f37097b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r1v5 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Resources.NotFoundException {
                g gVar;
                ?? r12;
                switch (i10) {
                    case 0:
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        g gVar2 = this.f37097b;
                        qg.e eVar112 = gVar2.f37101p0;
                        if (eVar112 == null) {
                            k.k("viewBinding");
                            throw null;
                        }
                        LinearLayout linearLayout = (LinearLayout) eVar112.f32354m;
                        int childCount = linearLayout.getChildCount();
                        for (int i122 = 0; i122 < childCount; i122++) {
                            Object tag = linearLayout.getChildAt(i122).getTag();
                            k.c(tag, "null cannot be cast to non-null type com.liuzh.deviceinfo.monitor.MonitorContent");
                            linkedHashSet.add((s) tag);
                        }
                        fk.b<s> bVar = s.f36704n;
                        ArrayList arrayList2 = new ArrayList();
                        for (s sVar : bVar) {
                            if (linkedHashSet.contains(sVar)) {
                                sVar = null;
                            }
                            if (sVar != null) {
                                arrayList2.add(sVar);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            Toast.makeText(gVar2.p(), R.string.all_contents_added, 0).show();
                            return;
                        }
                        ArrayList arrayList3 = new ArrayList(o.T(arrayList2, 10));
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            arrayList3.add(((s) obj).f36705a);
                        }
                        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
                        m mVar = new m(gVar2.W());
                        mVar.y(R.string.content);
                        qh.h hVar = new qh.h(3, arrayList2, gVar2);
                        i.b bVar2 = (i.b) mVar.f34474c;
                        bVar2.f25244q = strArr;
                        bVar2.f25246s = hVar;
                        mVar.w(R.string.cancel, null);
                        mVar.A().setCanceledOnTouchOutside(false);
                        return;
                    default:
                        g gVar3 = this.f37097b;
                        h hVarK0 = gVar3.k0();
                        Context contextW = gVar3.W();
                        hVarK0.getClass();
                        hVarK0.g(contextW);
                        Object objD = hVarK0.f37106b.d();
                        k.b(objD);
                        CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD;
                        if (vk.i.H0(customMonitorConfig.getName())) {
                            Toast.makeText(contextW, R.string.please_input_name, 0).show();
                            return;
                        }
                        if (customMonitorConfig.getContent().isEmpty()) {
                            Toast.makeText(contextW, R.string.please_add_content, 0).show();
                            return;
                        }
                        List listB = com.liuzh.deviceinfo.utilities.f.f21256b.b();
                        k.d(listB, "getCustomMonitors(...)");
                        ArrayList arrayListS0 = n.s0(listB);
                        int size2 = arrayListS0.size();
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj2 = arrayListS0.get(i15);
                                i15++;
                                if (!k.a(((CustomMonitorConfig) obj2).getId(), customMonitorConfig.getId())) {
                                    i14++;
                                }
                            } else {
                                i14 = -1;
                            }
                        }
                        if (i14 >= 0) {
                            gVar = gVar3;
                            r12 = 0;
                            arrayListS0.set(i14, CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, System.currentTimeMillis(), false, false, false, null, 253951, null));
                        } else {
                            gVar = gVar3;
                            r12 = 0;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            arrayListS0.add(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, jCurrentTimeMillis, jCurrentTimeMillis, false, false, false, null, 249855, null));
                        }
                        com.liuzh.deviceinfo.utilities.f.f21256b.o(arrayListS0);
                        Toast.makeText(contextW, R.string.save_successful, (int) r12).show();
                        y yVar = gVar;
                        Dialog dialog = yVar.f1867k0;
                        if (dialog instanceof oc.f) {
                            oc.f fVar2 = (oc.f) dialog;
                            if (fVar2.g == null) {
                                fVar2.f();
                            }
                            boolean z3 = fVar2.g.I;
                        }
                        yVar.d0(r12, r12);
                        return;
                }
            }
        });
        Object objD = k0().f37106b.d();
        k.b(objD);
        CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD;
        qg.e eVar28 = this.f37101p0;
        if (eVar28 == null) {
            k.k("viewBinding");
            throw null;
        }
        ((EditText) eVar28.f32355n).setText(customMonitorConfig.getName());
        ((Chip) eVar28.g).setChecked(customMonitorConfig.getDarkText());
        ((Chip) eVar28.f32350h).setChecked(!customMonitorConfig.getDarkText());
        ((Chip) eVar28.f32351i).setChecked(customMonitorConfig.getShowName());
        ((Slider) eVar28.f32358q).setValue(((customMonitorConfig.getTextSizeSp() - 8.0f) / 20.0f) * 100.0f);
        ((Slider) eVar28.f32359r).setValue(customMonitorConfig.getTransparency() * 100.0f);
        ((Chip) eVar28.f32352k).setChecked(customMonitorConfig.getVerticalLayout());
        ((Chip) eVar28.j).setChecked(!customMonitorConfig.getVerticalLayout());
        ((Slider) eVar28.f32356o).setValue((customMonitorConfig.getContainerPaddingDp() / 12.0f) * 100.0f);
        Slider slider = (Slider) eVar28.f32357p;
        if (customMonitorConfig.getVerticalLayout()) {
            itemSpacingDp = customMonitorConfig.getItemSpacingDp();
            f10 = 0.0f;
        } else {
            itemSpacingDp = customMonitorConfig.getItemSpacingDp();
            f10 = 2.0f;
        }
        slider.setValue(((itemSpacingDp - f10) / 10.0f) * 100.0f);
        ((LinearLayout) eVar28.f32354m).removeAllViews();
        Iterator<s> it = customMonitorConfig.getContent().iterator();
        while (it.hasNext()) {
            j0(it.next());
        }
    }

    @Override // oc.g, i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        Dialog dialogE0 = super.e0(bundle);
        dialogE0.setCanceledOnTouchOutside(false);
        dialogE0.setOnShowListener(new j(1, this));
        Window window = dialogE0.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        Window window2 = dialogE0.getWindow();
        if (window2 != null) {
            window2.addFlags(LinearLayoutManager.INVALID_OFFSET);
        }
        return dialogE0;
    }

    public final void j0(s sVar) {
        LayoutInflater layoutInflaterQ = q();
        qg.e eVar = this.f37101p0;
        if (eVar == null) {
            k.k("viewBinding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) eVar.f32354m;
        View viewInflate = layoutInflaterQ.inflate(R.layout.item_custom_monitor_chip_content, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        Chip chip = (Chip) viewInflate;
        o.e eVar2 = new o.e(7, chip);
        chip.setText(sVar.f36705a);
        chip.setTag(sVar);
        chip.setOnCloseIconClickListener(new hh.a(eVar2, this, sVar, 4));
    }

    public final h k0() {
        return (h) this.f37102q0.getValue();
    }

    public final void l0() {
        this.f37104s0.removeCallbacksAndMessages(null);
        a0 a0Var = this.f37103r0;
        if (a0Var != null) {
            a0Var.e(null);
        }
        this.f37103r0 = null;
    }
}
