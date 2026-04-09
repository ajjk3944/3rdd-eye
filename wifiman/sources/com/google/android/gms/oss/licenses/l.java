package com.google.android.gms.oss.licenses;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class l implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f36949a;

    l(m mVar) {
        this.f36949a = mVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        G3.e eVar = (G3.e) adapterView.getItemAtPosition(i10);
        Intent intent = new Intent(this.f36949a.f36950a, (Class<?>) OssLicensesActivity.class);
        intent.putExtra("license", eVar);
        this.f36949a.f36950a.startActivity(intent);
    }
}
