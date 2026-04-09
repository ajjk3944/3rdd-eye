package com.github.appintro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1759l;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: AppIntroCustomLayoutFragment.kt */
/* loaded from: classes.dex */
public final class AppIntroCustomLayoutFragment extends ComponentCallbacksC1759l {
    private static final String ARG_LAYOUT_RES_ID = "layoutResId";
    public static final Companion Companion = new Companion(null);
    private int layoutResId;

    /* compiled from: AppIntroCustomLayoutFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AppIntroCustomLayoutFragment newInstance(int i) {
            AppIntroCustomLayoutFragment appIntroCustomLayoutFragment = new AppIntroCustomLayoutFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(AppIntroCustomLayoutFragment.ARG_LAYOUT_RES_ID, i);
            appIntroCustomLayoutFragment.setArguments(bundle);
            return appIntroCustomLayoutFragment;
        }

        private Companion() {
        }
    }

    public static final AppIntroCustomLayoutFragment newInstance(int i) {
        return Companion.newInstance(i);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.layoutResId = arguments == null ? 0 : arguments.getInt(ARG_LAYOUT_RES_ID);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(inflater, "inflater");
        return inflater.inflate(this.layoutResId, viewGroup, false);
    }
}
