package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class e extends View {

    /* renamed from: a, reason: collision with root package name */
    protected float f19038a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f19039b;

    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f19045a;

        a(int i) {
            this.f19045a = i;
        }

        public int b() {
            return this.f19045a;
        }
    }

    public e(Context context) {
        super(context);
        this.f19038a = 1.0f;
        this.f19039b = context;
    }

    public void a(int i) {
        setViewScale(i / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f19038a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f10) {
        this.f19038a = f10;
    }

    public static e a(a aVar, Context context) {
        if (aVar.equals(a.INVISIBLE)) {
            return new h(context);
        }
        if (aVar.equals(a.WHITE_ON_TRANSPARENT)) {
            return new i(context);
        }
        if (aVar.equals(a.TRANSPARENT_SKIP)) {
            return new j(context);
        }
        return new n(context);
    }
}
