package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.zin;
import com.bytedance.sdk.openadsdk.core.yu.le;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw {
    final View.OnAttachStateChangeListener fkw;
    zin ouw;
    private final le.ouw pno;
    private final le.vt ra;
    le vt;

    /* renamed from: lh, reason: collision with root package name */
    List<ouw> f8524lh = new ArrayList();

    /* renamed from: le, reason: collision with root package name */
    private final String f8523le = "BannerSwiperManager";
    int yu = -1;

    public fkw(zin zinVar, Context context, int i4, int i10) {
        le.vt vtVar = new le.vt() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.1
            @Override // com.bytedance.sdk.openadsdk.core.yu.le.vt
            public final void ouw(boolean z3) {
                try {
                    if (z3) {
                        fkw.vt(fkw.this);
                    } else {
                        fkw.ouw(fkw.this);
                    }
                } catch (Throwable th2) {
                    ko.lh("BannerSwiperManager", "onWindowFocusChanged", th2);
                }
            }
        };
        this.ra = vtVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.2
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) throws Resources.NotFoundException {
                final fkw fkwVar = fkw.this;
                if (fkwVar.ouw == null) {
                    fkwVar.ouw = new zin();
                }
                boolean zEquals = TextUtils.equals(fkwVar.ouw.ouw, "vertical");
                le leVar = fkwVar.vt;
                leVar.pno = zEquals ? 1 : 0;
                com.bytedance.adsdk.ugeno.le.ouw ouwVarOuw = leVar.ouw("dot");
                ouwVarOuw.yu = false;
                com.bytedance.adsdk.ugeno.le.ouw ouwVarOuw2 = ouwVarOuw.vt(fkwVar.ouw.yu == 1).ouw(fkwVar.ouw.vt == 1).ouw(fkwVar.ouw.bly);
                zin zinVar2 = fkwVar.ouw;
                ouwVarOuw2.f6897le = zinVar2.tlj == 1;
                com.bytedance.adsdk.ugeno.le.ouw ouwVarVt = ouwVarOuw2.vt(zinVar2.pno);
                zin zinVar3 = fkwVar.ouw;
                ouwVarVt.fkw = zinVar3.f8325lh == 1;
                ouwVarVt.le(zinVar3.fkw).ra(fkwVar.ouw.f8324le).fkw(fkwVar.ouw.ra);
                fkwVar.vt.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.le.lh() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.4
                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z3, int i11, float f10, int i12) {
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z3, int i11, int i12, boolean z10, boolean z11) {
                        ouw ouwVar;
                        fkw fkwVar2 = fkw.this;
                        try {
                            int i13 = fkwVar2.yu;
                            if (i13 != -1 && i13 != i11 && (ouwVar = fkwVar2.f8524lh.get(i13)) != null) {
                                ouwVar.ouw(ouwVar.vt);
                                ouwVar.ra = 0L;
                                ouwVar.le();
                            }
                            ouw ouwVar2 = fkwVar2.f8524lh.get(i11);
                            if (ouwVar2 != null) {
                                ouwVar2.ra = System.currentTimeMillis();
                            }
                        } catch (Throwable unused) {
                        }
                        fkw fkwVar3 = fkw.this;
                        fkwVar3.yu = i11;
                        fkwVar3.ouw(i11);
                        fkw.this.vt(i11);
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z3, int i11) {
                        if (i11 == 1 || i11 == 2) {
                            fkw.this.vt(-1);
                        } else if (i11 == 0) {
                            fkw fkwVar2 = fkw.this;
                            fkwVar2.ouw(fkwVar2.yu);
                        }
                    }
                });
                List<ouw> list = fkwVar.f8524lh;
                if (list != null && !list.isEmpty()) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        fkwVar.vt.ouw((le) list.get(i11).ouw());
                    }
                }
                fkwVar.vt.ouw();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) throws Resources.NotFoundException {
                List<ouw> list = fkw.this.f8524lh;
                if (list != null && !list.isEmpty()) {
                    for (int i11 = 0; i11 < fkw.this.f8524lh.size(); i11++) {
                        fkw.this.f8524lh.get(i11).yu();
                    }
                }
                fkw fkwVar = fkw.this;
                fkwVar.yu = -1;
                le leVar = fkwVar.vt;
                if (leVar != null) {
                    leVar.vt();
                }
            }
        };
        this.fkw = onAttachStateChangeListener;
        le.ouw ouwVar = new le.ouw() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.3
            @Override // com.bytedance.sdk.openadsdk.core.yu.le.ouw
            public final void ouw(boolean z3) {
                if (z3) {
                    fkw.vt(fkw.this);
                } else {
                    fkw.ouw(fkw.this);
                }
            }
        };
        this.pno = ouwVar;
        this.ouw = zinVar;
        le leVar = new le(context);
        this.vt = leVar;
        leVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.vt.setSwiperWindowFocusChangedListener(vtVar);
        this.vt.setSwiperVisibleChangeListener(ouwVar);
        int iOuw = osn.ouw(context, i4);
        int iOuw2 = osn.ouw(context, i10);
        ViewGroup.LayoutParams layoutParams = this.vt.getLayoutParams();
        layoutParams = layoutParams == null ? new ViewGroup.LayoutParams(iOuw, iOuw2) : layoutParams;
        layoutParams.width = iOuw;
        layoutParams.height = iOuw2;
        this.vt.setLayoutParams(layoutParams);
    }

    public final void ouw(final int i4) {
        ouw ouwVar;
        try {
            final int size = this.f8524lh.size();
            if (i4 < size && (ouwVar = this.f8524lh.get(i4)) != null) {
                ouwVar.ouw(new com.bytedance.sdk.openadsdk.ouw.ouw.vt() { // from class: com.bytedance.sdk.openadsdk.core.yu.fkw.5
                    @Override // com.bytedance.sdk.openadsdk.ouw.ouw.vt
                    public final void ouw() {
                        int i10 = i4 + 1;
                        if (i10 >= size) {
                            return;
                        }
                        fkw.this.ouw(i10);
                    }
                });
            }
        } catch (Throwable th2) {
            ko.fkw("BannerSwiperManager", th2.getMessage());
        }
    }

    public final void vt(int i4) {
        ouw ouwVar;
        for (int i10 = 0; i10 < this.f8524lh.size(); i10++) {
            try {
                if (i10 != i4 && (ouwVar = this.f8524lh.get(i10)) != null) {
                    ouwVar.ra();
                }
            } catch (Throwable th2) {
                ko.fkw("BannerSwiperManager", th2.getMessage());
                return;
            }
        }
    }

    public static /* synthetic */ void ouw(fkw fkwVar) {
        le leVar;
        zin zinVar = fkwVar.ouw;
        if (zinVar != null && zinVar.vt == 1 && (leVar = fkwVar.vt) != null) {
            leVar.yu();
        }
        if (fkwVar.yu >= 0) {
            fkwVar.vt(-1);
        }
    }

    public static /* synthetic */ void vt(fkw fkwVar) {
        le leVar;
        zin zinVar = fkwVar.ouw;
        if (zinVar != null && zinVar.vt == 1 && (leVar = fkwVar.vt) != null) {
            leVar.lh();
        }
        int i4 = fkwVar.yu;
        if (i4 >= 0) {
            fkwVar.ouw(i4);
            fkwVar.vt(fkwVar.yu);
        }
    }
}
