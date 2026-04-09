package com.google.android.exoplayer2;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4073a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4074d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4075g;

    public /* synthetic */ c(int i10, int i11, Object obj) {
        this.f4073a = i11;
        this.f4075g = obj;
        this.f4074d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.media3.common.f fVar;
        switch (this.f4073a) {
            case 0:
                f fVar2 = (f) ((d) this.f4075g).f4088c;
                int i10 = this.f4074d;
                if (i10 != -3 && i10 != -2) {
                    if (i10 == -1) {
                        e eVar = fVar2.f4110c;
                        if (eVar != null) {
                            eVar.executePlayerCommand(-1);
                        }
                        fVar2.a();
                        break;
                    } else if (i10 == 1) {
                        fVar2.b(1);
                        e eVar2 = fVar2.f4110c;
                        if (eVar2 != null) {
                            eVar2.executePlayerCommand(1);
                            break;
                        }
                    } else {
                        c7.a.y("Unknown focus change type: ", 38, i10, "AudioFocusManager");
                        break;
                    }
                } else if (i10 == -2) {
                    e eVar3 = fVar2.f4110c;
                    if (eVar3 != null) {
                        eVar3.executePlayerCommand(0);
                    }
                    fVar2.b(2);
                    break;
                } else {
                    fVar2.b(3);
                    break;
                }
                break;
            case 1:
                d5.a aVar = (d5.a) ((d) this.f4075g).f4088c;
                int i11 = this.f4074d;
                if (i11 != -3 && i11 != -2) {
                    if (i11 == -1) {
                        d5.w wVar = aVar.f6918c;
                        if (wVar != null) {
                            d5.z zVar = wVar.f7095a;
                            boolean playWhenReady = zVar.getPlayWhenReady();
                            zVar.O1(-1, playWhenReady, playWhenReady ? 2 : 1);
                        }
                        aVar.a();
                        break;
                    } else if (i11 == 1) {
                        aVar.c(1);
                        d5.w wVar2 = aVar.f6918c;
                        if (wVar2 != null) {
                            d5.z zVar2 = wVar2.f7095a;
                            zVar2.O1(1, zVar2.getPlayWhenReady(), 1);
                            break;
                        }
                    } else {
                        c7.a.z("Unknown focus change type: ", i11, "AudioFocusManager");
                        break;
                    }
                } else if (i11 != -2 && ((fVar = aVar.f6919d) == null || fVar.f1619a != 1)) {
                    aVar.c(3);
                    break;
                } else {
                    d5.w wVar3 = aVar.f6918c;
                    if (wVar3 != null) {
                        d5.z zVar3 = wVar3.f7095a;
                        boolean playWhenReady2 = zVar3.getPlayWhenReady();
                        zVar3.O1(0, playWhenReady2, playWhenReady2 ? 2 : 1);
                    }
                    aVar.c(2);
                    break;
                }
                break;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4075g;
                View view = (View) sideSheetBehavior.f5696p.get();
                if (view != null) {
                    sideSheetBehavior.u(view, this.f4074d, false);
                    break;
                }
                break;
            default:
                ((j3.b) this.f4075g).h(this.f4074d);
                break;
        }
    }
}
