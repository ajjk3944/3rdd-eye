package com.google.android.material.theme;

import T3.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.q;
import androidx.appcompat.widget.C3879d;
import androidx.appcompat.widget.C3881f;
import androidx.appcompat.widget.C3882g;
import androidx.appcompat.widget.C3896v;
import androidx.appcompat.widget.D;
import b4.C4070a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.v;
import h4.C5948a;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends q {
    @Override // androidx.appcompat.app.q
    protected C3879d c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.q
    protected C3881f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.q
    protected C3882g e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.q
    protected C3896v k(Context context, AttributeSet attributeSet) {
        return new C4070a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.q
    protected D o(Context context, AttributeSet attributeSet) {
        return new C5948a(context, attributeSet);
    }
}
