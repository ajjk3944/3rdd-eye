package com.liuzh.deviceinfo.view.togglebuttongroup;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.liuzh.deviceinfo.utilities.l;
import java.util.ArrayList;
import ki.a;
import lf.e;
import mi.c;
import mi.f;
import sh.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SingleSelectToggleGroup extends f {

    /* renamed from: o, reason: collision with root package name */
    public c f21389o;

    /* renamed from: p, reason: collision with root package name */
    public int f21390p;

    public SingleSelectToggleGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21390p = -1;
    }

    private void setCheckedId(int i4) {
        this.f21390p = i4;
        c cVar = this.f21389o;
        if (cVar != null) {
            d dVar = (d) ((e) cVar).f28758b;
            a aVar = (a) findViewById(getCheckedId());
            ArrayList arrayList = dVar.f33667d0;
            arrayList.clear();
            if (dVar.c0()) {
                return;
            }
            try {
                CameraCharacteristics cameraCharacteristics = dVar.f33668e0.getCameraCharacteristics(String.valueOf(aVar.getCameraId()));
                arrayList.clear();
                for (CameraCharacteristics.Key<?> key : cameraCharacteristics.getKeys()) {
                    if (dVar.c0()) {
                        break;
                    }
                    String strQ = l.q(key, cameraCharacteristics);
                    if (!TextUtils.isEmpty(strQ)) {
                        arrayList.add(new vg.a(l.E(dVar.p(), key.getName()), strQ));
                    }
                }
            } catch (Throwable unused) {
            }
            dVar.f33666c0.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if ((view instanceof Checkable) && ((Checkable) view).isChecked()) {
            int i10 = this.f21390p;
            if (i10 != -1) {
                e(i10, false);
            }
            if (view.getId() == -1) {
                view.setId(View.generateViewId());
            }
            setCheckedId(view.getId());
        }
        super.addView(view, i4, layoutParams);
    }

    @Override // mi.f
    public final void d(View view, boolean z3) {
        if (z3) {
            int i4 = this.f21390p;
            if (i4 != -1 && i4 != view.getId()) {
                e(this.f21390p, false);
            }
            int id2 = view.getId();
            if (this.f29394k != id2) {
                setCheckedId(id2);
            } else {
                this.f29394k = -1;
                this.f21390p = id2;
            }
        }
    }

    public int getCheckedId() {
        return this.f21390p;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.j;
        if (i4 == -1) {
            i4 = this.f29394k;
        }
        if (i4 != -1) {
            e(i4, true);
            this.f21390p = i4;
        }
    }

    public void setOnCheckedChangeListener(c cVar) {
        this.f21389o = cVar;
    }
}
