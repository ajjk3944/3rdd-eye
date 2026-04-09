package sk;

import android.view.View;

/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22073a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f22074d;

    public /* synthetic */ e(h hVar, int i10) {
        this.f22073a = i10;
        this.f22074d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22073a) {
            case 0:
                g gVar = g.DOWNLOAD;
                h hVar = this.f22074d;
                h.i(hVar, gVar, hVar.f22090l ? f.ASCENDING : f.DESCENDING);
                break;
            case 1:
                g gVar2 = g.UPLOAD;
                h hVar2 = this.f22074d;
                h.i(hVar2, gVar2, hVar2.f22091m ? f.ASCENDING : f.DESCENDING);
                break;
            case 2:
                g gVar3 = g.LATENCY;
                h hVar3 = this.f22074d;
                h.i(hVar3, gVar3, hVar3.f22092n ? f.ASCENDING : f.DESCENDING);
                break;
            default:
                g gVar4 = g.SIGNAL_BARS;
                h hVar4 = this.f22074d;
                h.i(hVar4, gVar4, hVar4.f22093o ? f.ASCENDING : f.DESCENDING);
                break;
        }
    }
}
