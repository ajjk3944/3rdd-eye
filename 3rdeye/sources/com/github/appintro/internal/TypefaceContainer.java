package com.github.appintro.internal;

import B0.g;
import N7.H7;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.widget.TextView;
import kotlin.jvm.internal.l;

/* compiled from: TypefaceContainer.kt */
/* loaded from: classes.dex */
public final class TypefaceContainer {
    private int typeFaceResource;
    private String typeFaceUrl;

    public TypefaceContainer() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TypefaceContainer copy$default(TypefaceContainer typefaceContainer, String str, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = typefaceContainer.typeFaceUrl;
        }
        if ((i10 & 2) != 0) {
            i = typefaceContainer.typeFaceResource;
        }
        return typefaceContainer.copy(str, i);
    }

    public final void applyTo(final TextView textView) throws Resources.NotFoundException {
        if (textView == null || textView.getContext() == null) {
            return;
        }
        if (this.typeFaceUrl == null && this.typeFaceResource == 0) {
            return;
        }
        g.e eVar = new g.e() { // from class: com.github.appintro.internal.TypefaceContainer$applyTo$callback$1
            @Override // B0.g.e
            /* renamed from: onFontRetrieved */
            public void lambda$callbackSuccessAsync$0(Typeface typeface) {
                l.f(typeface, "typeface");
                textView.setTypeface(typeface);
            }

            @Override // B0.g.e
            /* renamed from: onFontRetrievalFailed */
            public void lambda$callbackFailAsync$1(int i) {
            }
        };
        if (this.typeFaceResource == 0) {
            CustomFontCache customFontCache = CustomFontCache.INSTANCE;
            Context context = textView.getContext();
            l.e(context, "textView.context");
            customFontCache.getFont(context, this.typeFaceUrl, eVar);
            return;
        }
        Context context2 = textView.getContext();
        int i = this.typeFaceResource;
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        if (context2.isRestricted()) {
            eVar.callbackFailAsync(-4, null);
        } else {
            g.c(context2, i, new TypedValue(), 0, eVar, false, false);
        }
    }

    public final String component1() {
        return this.typeFaceUrl;
    }

    public final int component2() {
        return this.typeFaceResource;
    }

    public final TypefaceContainer copy(String str, int i) {
        return new TypefaceContainer(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceContainer)) {
            return false;
        }
        TypefaceContainer typefaceContainer = (TypefaceContainer) obj;
        return l.b(this.typeFaceUrl, typefaceContainer.typeFaceUrl) && this.typeFaceResource == typefaceContainer.typeFaceResource;
    }

    public final int getTypeFaceResource() {
        return this.typeFaceResource;
    }

    public final String getTypeFaceUrl() {
        return this.typeFaceUrl;
    }

    public int hashCode() {
        String str = this.typeFaceUrl;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.typeFaceResource;
    }

    public final void setTypeFaceResource(int i) {
        this.typeFaceResource = i;
    }

    public final void setTypeFaceUrl(String str) {
        this.typeFaceUrl = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TypefaceContainer(typeFaceUrl=");
        sb.append((Object) this.typeFaceUrl);
        sb.append(", typeFaceResource=");
        return H7.p(sb, this.typeFaceResource, ')');
    }

    public TypefaceContainer(String str, int i) {
        this.typeFaceUrl = str;
        this.typeFaceResource = i;
    }

    public /* synthetic */ TypefaceContainer(String str, int i, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0 : i);
    }
}
