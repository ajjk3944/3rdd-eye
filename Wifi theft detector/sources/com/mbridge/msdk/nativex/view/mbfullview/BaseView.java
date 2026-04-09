package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public class BaseView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected RelativeLayout f16400a;

    /* renamed from: b, reason: collision with root package name */
    protected RelativeLayout f16401b;

    /* renamed from: c, reason: collision with root package name */
    protected RelativeLayout f16402c;

    /* renamed from: d, reason: collision with root package name */
    protected ImageView f16403d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f16404e;

    /* renamed from: f, reason: collision with root package name */
    protected ProgressBar f16405f;

    /* renamed from: g, reason: collision with root package name */
    protected FrameLayout f16406g;

    /* renamed from: h, reason: collision with root package name */
    protected LinearLayout f16407h;

    /* renamed from: i, reason: collision with root package name */
    protected RelativeLayout f16408i;
    public a style;

    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullbasescreen", TtmlNode.TAG_LAYOUT), this);
        this.f16408i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f16400a = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f16401b = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f16402c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f16403d = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f16404e = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f16405f = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f16406g = (FrameLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f16407h = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f16402c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f16403d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f16405f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f16400a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f16401b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f16404e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f16406g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f16407h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
