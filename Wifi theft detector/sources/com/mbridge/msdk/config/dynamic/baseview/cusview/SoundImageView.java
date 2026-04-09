package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.i0;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class SoundImageView extends ComponentImageView {

    /* renamed from: c, reason: collision with root package name */
    private boolean f13891c;

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13891c = true;
        setSoundStatus(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        boolean z10 = this.f13891c;
        setSoundStatus(!z10);
        HashMap map = new HashMap();
        map.put("soundStatus", !z10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), map);
    }

    public boolean getStatus() {
        return this.f13891c;
    }

    public void setSoundStatus(boolean z10) {
        this.f13891c = z10;
        if (z10) {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView
    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13900a.a(view);
            }
        });
    }
}
