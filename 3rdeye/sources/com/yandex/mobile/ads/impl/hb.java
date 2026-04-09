package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class hb {

    /* renamed from: a, reason: collision with root package name */
    private final tb f28152a;

    /* renamed from: b, reason: collision with root package name */
    private final mq0 f28153b;

    public static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final Dialog f28154a;

        /* renamed from: b, reason: collision with root package name */
        private final mq0 f28155b;

        public a(Dialog dialog, mq0 keyboardUtils) {
            kotlin.jvm.internal.l.f(dialog, "dialog");
            kotlin.jvm.internal.l.f(keyboardUtils, "keyboardUtils");
            this.f28154a = dialog;
            this.f28155b = keyboardUtils;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            kotlin.jvm.internal.l.f(view, "view");
            this.f28155b.getClass();
            mq0.a(view);
            i10.a(this.f28154a);
        }
    }

    public static final class b implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f28156a;

        /* renamed from: b, reason: collision with root package name */
        private final Dialog f28157b;

        /* renamed from: c, reason: collision with root package name */
        private final mq0 f28158c;

        /* renamed from: d, reason: collision with root package name */
        private float f28159d;

        public b(ViewGroup adTuneContainer, Dialog dialog, mq0 keyboardUtils) {
            kotlin.jvm.internal.l.f(adTuneContainer, "adTuneContainer");
            kotlin.jvm.internal.l.f(dialog, "dialog");
            kotlin.jvm.internal.l.f(keyboardUtils, "keyboardUtils");
            this.f28156a = adTuneContainer;
            this.f28157b = dialog;
            this.f28158c = keyboardUtils;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent event) {
            kotlin.jvm.internal.l.f(view, "view");
            kotlin.jvm.internal.l.f(event, "event");
            float rawY = event.getRawY();
            int action = event.getAction();
            if (action == 0) {
                this.f28159d = rawY;
                return true;
            }
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                float f10 = this.f28159d;
                if (rawY > f10) {
                    this.f28156a.setTranslationY(rawY - f10);
                } else {
                    this.f28156a.setTranslationY(0.0f);
                }
            } else if (rawY > this.f28159d) {
                this.f28158c.getClass();
                mq0.a(view);
                i10.a(this.f28157b);
            }
            return true;
        }
    }

    public /* synthetic */ hb() {
        this(new tb(), new mq0());
    }

    public final void a(ViewGroup adTuneContainer, Dialog dialog) {
        kotlin.jvm.internal.l.f(adTuneContainer, "adTuneContainer");
        kotlin.jvm.internal.l.f(dialog, "dialog");
        this.f28152a.getClass();
        View viewFindViewById = adTuneContainer.findViewById(R.id.adtune_drag_view_container);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new b(adTuneContainer, dialog, this.f28153b));
        }
        this.f28152a.getClass();
        ViewGroup viewGroup = (ViewGroup) adTuneContainer.findViewById(R.id.adtune_background_view);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new a(dialog, this.f28153b));
        }
    }

    public hb(tb adtuneViewProvider, mq0 keyboardUtils) {
        kotlin.jvm.internal.l.f(adtuneViewProvider, "adtuneViewProvider");
        kotlin.jvm.internal.l.f(keyboardUtils, "keyboardUtils");
        this.f28152a = adtuneViewProvider;
        this.f28153b = keyboardUtils;
    }
}
