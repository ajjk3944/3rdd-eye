package com.survicate.surveys.infrastructure.serialization;

import android.graphics.Color;
import br.l;
import kotlin.Metadata;
import nk.n;
import nk.q0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/MoshiColorAdapter;", "", "()V", "fromJson", "", "rgb", "", "toJson", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MoshiColorAdapter {
    @n
    @HexColor
    public final int fromJson(String rgb) {
        l.e(rgb, "rgb");
        try {
            return Color.parseColor(rgb);
        } catch (Exception unused) {
            return 0;
        }
    }

    @q0
    public final String toJson(@HexColor int rgb) {
        return "#" + Integer.toHexString(rgb);
    }
}
