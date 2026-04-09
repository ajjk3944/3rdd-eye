package hj;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import i.y;
import nk.k;
import t7.m;
import yb.e;
import yj.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends y {

    /* renamed from: p0, reason: collision with root package name */
    public e f25154p0;

    /* renamed from: q0, reason: collision with root package name */
    public i f25155q0;

    @Override // i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        View viewInflate = q().inflate(R.layout.fa_deleting_progress, (ViewGroup) null, false);
        int i4 = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) wb.e.s(R.id.progressBar, viewInflate);
        if (progressBar != null) {
            i4 = R.id.progress_text;
            TextView textView = (TextView) wb.e.s(R.id.progress_text, viewInflate);
            if (textView != null) {
                this.f25154p0 = new e((LinearLayout) viewInflate, progressBar, textView, 27);
                i iVar = this.f25155q0;
                if (iVar != null) {
                    j0(iVar);
                }
                m mVar = new m(W());
                mVar.y(R.string.fa_string_cleaning);
                e eVar = this.f25154p0;
                if (eVar != null) {
                    mVar.z((LinearLayout) eVar.f37509b);
                    return mVar.f();
                }
                k.k("binding");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public final void j0(i iVar) {
        e eVar = this.f25154p0;
        if (eVar == null) {
            k.k("binding");
            throw null;
        }
        ProgressBar progressBar = (ProgressBar) eVar.f37510c;
        Object obj = iVar.f37638a;
        Object obj2 = iVar.f37639b;
        progressBar.setProgress(((Number) obj).intValue());
        e eVar2 = this.f25154p0;
        if (eVar2 == null) {
            k.k("binding");
            throw null;
        }
        ((ProgressBar) eVar2.f37510c).setMax(((Number) obj2).intValue());
        e eVar3 = this.f25154p0;
        if (eVar3 == null) {
            k.k("binding");
            throw null;
        }
        ((TextView) eVar3.f37511d).setText(iVar.f37638a + "/" + obj2);
    }
}
