package c0;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public interface y {
    static z0.m a() {
        if (1.0f <= 0.0d) {
            d0.a.a("invalid weight; must be greater than zero");
        }
        return new LayoutWeightElement(1.0f);
    }
}
