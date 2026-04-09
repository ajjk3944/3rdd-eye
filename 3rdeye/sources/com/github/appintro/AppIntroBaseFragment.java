package com.github.appintro;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC1759l;
import com.github.appintro.internal.LogHelper;
import com.github.appintro.internal.TypefaceContainer;
import kotlin.jvm.internal.l;
import z0.C5848a;

/* compiled from: AppIntroBaseFragment.kt */
/* loaded from: classes.dex */
public abstract class AppIntroBaseFragment extends ComponentCallbacksC1759l implements SlideSelectionListener, SlideBackgroundColorHolder {
    private int bgDrawable;
    private int defaultBackgroundColor;
    private int defaultBackgroundColorRes;
    private int descColor;
    private int descColorRes;
    private TypefaceContainer descTypeface;
    private String description;
    private int drawable;
    private final String logTAG = LogHelper.makeLogTag((Class<?>) AppIntroBaseFragment.class);
    private String title;
    private int titleColor;
    private int titleColorRes;
    private TypefaceContainer titleTypeface;

    @Override // com.github.appintro.SlideBackgroundColorHolder
    public final int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    @Override // com.github.appintro.SlideBackgroundColorHolder
    public final int getDefaultBackgroundColorRes() {
        return this.defaultBackgroundColorRes;
    }

    public abstract int getLayoutId();

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.drawable = bundle.getInt(AppIntroBaseFragmentKt.ARG_DRAWABLE);
            this.title = bundle.getString(AppIntroBaseFragmentKt.ARG_TITLE);
            this.description = bundle.getString(AppIntroBaseFragmentKt.ARG_DESC);
            this.titleTypeface = new TypefaceContainer(bundle.getString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE), bundle.getInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES, 0));
            this.descTypeface = new TypefaceContainer(bundle.getString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE), bundle.getInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES, 0));
            this.defaultBackgroundColor = bundle.getInt(AppIntroBaseFragmentKt.ARG_BG_COLOR);
            this.defaultBackgroundColorRes = bundle.getInt(AppIntroBaseFragmentKt.ARG_BG_COLOR_RES);
            this.bgDrawable = bundle.getInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE);
            this.titleColor = bundle.getInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR);
            this.titleColorRes = bundle.getInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR_RES);
            this.descColor = bundle.getInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR);
            this.descColorRes = bundle.getInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR_RES);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        if (arguments == null || arguments.size() == 0) {
            return;
        }
        this.drawable = arguments.getInt(AppIntroBaseFragmentKt.ARG_DRAWABLE);
        this.title = arguments.getString(AppIntroBaseFragmentKt.ARG_TITLE);
        this.description = arguments.getString(AppIntroBaseFragmentKt.ARG_DESC);
        this.bgDrawable = arguments.getInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE);
        String string = arguments.getString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE);
        String string2 = arguments.getString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE);
        int i = arguments.getInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES);
        int i10 = arguments.getInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES);
        this.titleTypeface = new TypefaceContainer(string, i);
        this.descTypeface = new TypefaceContainer(string2, i10);
        this.defaultBackgroundColor = arguments.getInt(AppIntroBaseFragmentKt.ARG_BG_COLOR);
        this.defaultBackgroundColorRes = arguments.getInt(AppIntroBaseFragmentKt.ARG_BG_COLOR_RES);
        this.titleColor = arguments.getInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR, 0);
        this.titleColorRes = arguments.getInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR_RES, 0);
        this.descColor = arguments.getInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR, 0);
        this.descColorRes = arguments.getInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR_RES, 0);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        l.f(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayoutId(), viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.description);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(R.id.main);
        textView.setText(this.title);
        textView2.setText(this.description);
        if (this.titleColorRes != 0) {
            textView.setTextColor(C5848a.getColor(requireContext(), this.titleColorRes));
        } else {
            int i = this.titleColor;
            if (i != 0) {
                textView.setTextColor(i);
            }
        }
        if (this.descColorRes != 0) {
            textView2.setTextColor(C5848a.getColor(requireContext(), this.descColorRes));
        } else {
            int i10 = this.descColor;
            if (i10 != 0) {
                textView2.setTextColor(i10);
            }
        }
        TypefaceContainer typefaceContainer = this.titleTypeface;
        if (typefaceContainer != null) {
            typefaceContainer.applyTo(textView);
        }
        TypefaceContainer typefaceContainer2 = this.descTypeface;
        if (typefaceContainer2 != null) {
            typefaceContainer2.applyTo(textView2);
        }
        imageView.setImageResource(this.drawable);
        int i11 = this.bgDrawable;
        if (i11 != 0) {
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(i11);
            }
        } else if (this.defaultBackgroundColorRes != 0) {
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(C5848a.getColor(requireContext(), this.defaultBackgroundColorRes));
            }
        } else if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(this.defaultBackgroundColor);
        }
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView2.setMovementMethod(new ScrollingMovementMethod());
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public void onPause() {
        super.onPause();
        View view = getView();
        KeyEvent.Callback callback = view == null ? null : (ImageView) view.findViewById(R.id.image);
        if (callback instanceof Animatable) {
            ((Animatable) callback).start();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public void onResume() {
        super.onResume();
        View view = getView();
        KeyEvent.Callback callback = view == null ? null : (ImageView) view.findViewById(R.id.image);
        if (callback instanceof Animatable) {
            ((Animatable) callback).start();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public void onSaveInstanceState(Bundle outState) {
        l.f(outState, "outState");
        outState.putInt(AppIntroBaseFragmentKt.ARG_DRAWABLE, this.drawable);
        outState.putInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE, this.bgDrawable);
        outState.putString(AppIntroBaseFragmentKt.ARG_TITLE, this.title);
        outState.putString(AppIntroBaseFragmentKt.ARG_DESC, this.description);
        outState.putInt(AppIntroBaseFragmentKt.ARG_BG_COLOR, this.defaultBackgroundColor);
        outState.putInt(AppIntroBaseFragmentKt.ARG_BG_COLOR_RES, this.defaultBackgroundColorRes);
        outState.putInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR, this.titleColor);
        outState.putInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR_RES, this.titleColorRes);
        outState.putInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR, this.descColor);
        outState.putInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR_RES, this.descColorRes);
        TypefaceContainer typefaceContainer = this.titleTypeface;
        if (typefaceContainer != null) {
            outState.putString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE, typefaceContainer == null ? null : typefaceContainer.getTypeFaceUrl());
            TypefaceContainer typefaceContainer2 = this.titleTypeface;
            outState.putInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES, typefaceContainer2 == null ? 0 : typefaceContainer2.getTypeFaceResource());
        }
        TypefaceContainer typefaceContainer3 = this.descTypeface;
        if (typefaceContainer3 != null) {
            outState.putString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE, typefaceContainer3 != null ? typefaceContainer3.getTypeFaceUrl() : null);
            TypefaceContainer typefaceContainer4 = this.descTypeface;
            outState.putInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES, typefaceContainer4 != null ? typefaceContainer4.getTypeFaceResource() : 0);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
        LogHelper.d(this.logTAG, "Slide " + ((Object) this.title) + " has been deselected.");
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        LogHelper.d(this.logTAG, "Slide " + ((Object) this.title) + " has been selected.");
    }

    @Override // com.github.appintro.SlideBackgroundColorHolder
    public void setBackgroundColor(int i) {
        ConstraintLayout constraintLayout;
        View view = getView();
        if (view == null || (constraintLayout = (ConstraintLayout) view.findViewById(R.id.main)) == null) {
            return;
        }
        constraintLayout.setBackgroundColor(i);
    }
}
