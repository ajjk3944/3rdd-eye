package com.wifihacker.detector.mvp.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.g;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.s;
import l8.q1;

/* loaded from: classes3.dex */
public class MoreToolsView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public q1 f20507a;

    public MoreToolsView(Context context) {
        this(context, null);
    }

    public final void a() {
        this.f20507a = (q1) g.d(LayoutInflater.from(getContext()), R.layout.view_more_tools, this, true);
        b();
    }

    public final void b() {
        this.f20507a.f23317y.setOnClickListener(this);
        this.f20507a.f23316x.setOnClickListener(this);
        this.f20507a.f23315w.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_duplicate_file /* 2131230868 */:
                s.v(getContext(), "com.duplicatefile.remover.duplicatefilefinder.duplicatefileremover");
                break;
            case R.id.btn_empty_folder_cleaner /* 2131230869 */:
                s.v(getContext(), "com.empty.folder.cleaner.emptyfoldercleaner.removeemptyfolders");
                break;
            case R.id.btn_junk_cleaner /* 2131230870 */:
                s.v(getContext(), "com.cleanmyphone.cleanmyandroid.freeupspace");
                break;
        }
    }

    public MoreToolsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MoreToolsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}
