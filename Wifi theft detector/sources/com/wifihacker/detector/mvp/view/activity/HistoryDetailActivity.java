package com.wifihacker.detector.mvp.view.activity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.wifihacker.detector.data.HistoryInfo;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.s;
import l8.m;

/* loaded from: classes3.dex */
public class HistoryDetailActivity extends BaseActivity<m> {

    /* renamed from: j, reason: collision with root package name */
    public HistoryInfo f20344j;

    public class a implements m8.a {
        public a() {
        }

        @Override // m8.a
        public void a(boolean z10) {
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return getString(R.string.history_detail);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return ((m) this.f20418i).f23285x.f23339w;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_history_detail;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        HistoryInfo historyInfo = this.f20344j;
        if (historyInfo == null) {
            return;
        }
        s8.a aVar = new s8.a(this, historyInfo.onLineList, historyInfo.offLineList);
        aVar.k(true);
        ((m) this.f20418i).f23284w.setLayoutManager(new LinearLayoutManager(this));
        ((m) this.f20418i).f23284w.setAdapter(aVar);
        s.d(this, new a());
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
        this.f20344j = (HistoryInfo) getIntent().getSerializableExtra("history_detail_info");
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }
}
