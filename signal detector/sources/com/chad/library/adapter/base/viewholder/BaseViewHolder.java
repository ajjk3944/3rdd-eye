package com.chad.library.adapter.base.viewholder;

import Y.c;
import Y.h;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.g0;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import q5.i;

@Keep
/* loaded from: classes.dex */
public class BaseViewHolder extends g0 {
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(View view) {
        super(view);
        i.e(view, "view");
        this.views = new SparseArray<>();
    }

    public <T extends View> T findView(int i) {
        return (T) this.itemView.findViewById(i);
    }

    public <B extends h> B getBinding() {
        View view = this.itemView;
        DataBinderMapperImpl dataBinderMapperImpl = c.f4195a;
        return (B) h.d(view);
    }

    public <T extends View> T getView(int i) {
        T t6 = (T) getViewOrNull(i);
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException(AbstractC1135f5.l(i, "No view found with id ").toString());
    }

    public <T extends View> T getViewOrNull(int i) {
        T t6;
        T t7 = (T) this.views.get(i);
        if (t7 == null && (t6 = (T) this.itemView.findViewById(i)) != null) {
            this.views.put(i, t6);
            return t6;
        }
        if (t7 == null) {
            return null;
        }
        return t7;
    }

    public BaseViewHolder setBackgroundColor(int i, int i3) {
        getView(i).setBackgroundColor(i3);
        return this;
    }

    public BaseViewHolder setBackgroundResource(int i, int i3) {
        getView(i).setBackgroundResource(i3);
        return this;
    }

    public BaseViewHolder setEnabled(int i, boolean z6) {
        getView(i).setEnabled(z6);
        return this;
    }

    public BaseViewHolder setGone(int i, boolean z6) {
        getView(i).setVisibility(z6 ? 8 : 0);
        return this;
    }

    public BaseViewHolder setImageBitmap(int i, Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    public BaseViewHolder setImageDrawable(int i, Drawable drawable) {
        ((ImageView) getView(i)).setImageDrawable(drawable);
        return this;
    }

    public BaseViewHolder setImageResource(int i, int i3) {
        ((ImageView) getView(i)).setImageResource(i3);
        return this;
    }

    public BaseViewHolder setText(int i, CharSequence charSequence) {
        ((TextView) getView(i)).setText(charSequence);
        return this;
    }

    public BaseViewHolder setTextColor(int i, int i3) {
        ((TextView) getView(i)).setTextColor(i3);
        return this;
    }

    public BaseViewHolder setTextColorRes(int i, int i3) {
        ((TextView) getView(i)).setTextColor(this.itemView.getContext().getColor(i3));
        return this;
    }

    public BaseViewHolder setVisible(int i, boolean z6) {
        getView(i).setVisibility(z6 ? 0 : 4);
        return this;
    }

    public BaseViewHolder setText(int i, int i3) {
        ((TextView) getView(i)).setText(i3);
        return this;
    }
}
