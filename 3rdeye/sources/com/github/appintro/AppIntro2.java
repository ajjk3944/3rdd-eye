package com.github.appintro;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.l;

/* compiled from: AppIntro2.kt */
/* loaded from: classes.dex */
public abstract class AppIntro2 extends AppIntroBase {
    private Drawable backgroundDrawable;
    private ConstraintLayout backgroundFrame;
    private Integer backgroundResource;
    private View bottomBar;
    private final int layoutId = R.layout.appintro_intro_layout2;
    private ImageButton skipImageButton;

    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public final Integer getBackgroundResource() {
        return this.backgroundResource;
    }

    @Override // com.github.appintro.AppIntroBase
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.github.appintro.AppIntroBase, androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewFindViewById = findViewById(R.id.background);
        l.e(viewFindViewById, "findViewById(R.id.background)");
        this.backgroundFrame = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.bottom);
        l.e(viewFindViewById2, "findViewById(R.id.bottom)");
        this.bottomBar = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.skip);
        l.e(viewFindViewById3, "findViewById(R.id.skip)");
        this.skipImageButton = (ImageButton) viewFindViewById3;
        if (isRtl$appintro_release()) {
            ImageButton imageButton = this.skipImageButton;
            if (imageButton != null) {
                imageButton.setScaleX(-1.0f);
            } else {
                l.l("skipImageButton");
                throw null;
            }
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.backgroundDrawable = drawable;
        if (drawable != null) {
            ConstraintLayout constraintLayout = this.backgroundFrame;
            if (constraintLayout != null) {
                constraintLayout.setBackground(drawable);
            } else {
                l.l("backgroundFrame");
                throw null;
            }
        }
    }

    public final void setBackgroundResource(Integer num) {
        this.backgroundResource = num;
        if (num == null || num == null) {
            return;
        }
        int iIntValue = num.intValue();
        ConstraintLayout constraintLayout = this.backgroundFrame;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(iIntValue);
        } else {
            l.l("backgroundFrame");
            throw null;
        }
    }

    public final void setBarColor(int i) {
        View view = this.bottomBar;
        if (view != null) {
            view.setBackgroundColor(i);
        } else {
            l.l("bottomBar");
            throw null;
        }
    }

    public final void setImageSkipButton(Drawable imageSkipButton) {
        l.f(imageSkipButton, "imageSkipButton");
        ImageButton imageButton = this.skipImageButton;
        if (imageButton != null) {
            imageButton.setImageDrawable(imageSkipButton);
        } else {
            l.l("skipImageButton");
            throw null;
        }
    }

    public final void setNextArrowColor(int i) {
        ((ImageButton) findViewById(R.id.next)).setColorFilter(i);
    }

    public final void setSkipArrowColor(int i) {
        ((ImageButton) findViewById(R.id.skip)).setColorFilter(i);
    }
}
