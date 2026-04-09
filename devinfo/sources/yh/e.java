package yh;

import android.graphics.Paint;
import android.view.View;
import yj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37620b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f37619a = i4;
        this.f37620b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zh.g gVar;
        int i4 = this.f37619a;
        Object obj = this.f37620b;
        switch (i4) {
            case 0:
                f fVar = (f) obj;
                if (!fVar.c0()) {
                    Object tag = fVar.Z.getTag();
                    ki.f fVar2 = fVar.Z;
                    if (tag != fVar2) {
                        Paint paint = fVar2.f28312d;
                        if (fVar2.f28313e == -16777216) {
                            fVar2.f28313e = -1;
                            paint.setColor(-16777216);
                        } else {
                            fVar2.f28313e = -16777216;
                            paint.setColor(-1);
                        }
                        fVar2.invalidate();
                        ki.f fVar3 = fVar.Z;
                        fVar3.setTag(fVar3);
                        break;
                    } else {
                        fVar.U().finish();
                        break;
                    }
                }
                break;
            case 1:
                n nVar = gg.b.g;
                com.bumptech.glide.c.m().a();
                com.liuzh.deviceinfo.utilities.f.k("user_granted_all_apps_permission", true);
                ((th.c) obj).run();
                break;
            default:
                zh.h hVar = (zh.h) obj;
                int bindingAdapterPosition = hVar.getBindingAdapterPosition();
                if (bindingAdapterPosition >= 0 && (gVar = (zh.g) hVar.getBindingAdapter()) != null) {
                    int i10 = gVar.f38294i;
                    gVar.f38294i = bindingAdapterPosition;
                    gVar.notifyItemChanged(bindingAdapterPosition);
                    if (i10 >= 0 && i10 < zh.a.f38283b.size()) {
                        gVar.notifyItemChanged(i10);
                        break;
                    }
                }
                break;
        }
    }
}
