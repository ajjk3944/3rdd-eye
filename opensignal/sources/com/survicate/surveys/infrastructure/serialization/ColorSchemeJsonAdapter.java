package com.survicate.surveys.infrastructure.serialization;

import br.l;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.ThemeType;
import java.util.Map;
import kotlin.Metadata;
import nk.c0;
import nk.n;
import nk.q0;
import nk.r;
import nk.w;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/ColorSchemeJsonAdapter;", "Lnk/r;", "Lcom/survicate/surveys/entities/survey/theme/ColorScheme;", "Lcom/survicate/surveys/entities/survey/theme/MicroColorScheme;", "microColorSchemeAdapter", "Lcom/survicate/surveys/entities/survey/theme/ThemeType;", "themeTypeAdapter", "<init>", "(Lnk/r;Lnk/r;)V", "Lnk/w;", "reader", "fromJson", "(Lnk/w;)Lcom/survicate/surveys/entities/survey/theme/ColorScheme;", "Lnk/c0;", "writer", "value", "Llq/b0;", "toJson", "(Lnk/c0;Lcom/survicate/surveys/entities/survey/theme/ColorScheme;)V", "Lnk/r;", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSchemeJsonAdapter extends r {
    public static final String COLOR_SCHEME_TYPE = "color_scheme_type";
    private final r microColorSchemeAdapter;
    private final r themeTypeAdapter;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeType.values().length];
            try {
                iArr[ThemeType.MICRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ColorSchemeJsonAdapter(r rVar, r rVar2) {
        l.e(rVar, "microColorSchemeAdapter");
        l.e(rVar2, "themeTypeAdapter");
        this.microColorSchemeAdapter = rVar;
        this.themeTypeAdapter = rVar2;
    }

    @Override // nk.r
    @n
    public ColorScheme fromJson(w reader) {
        l.e(reader, "reader");
        Object objO0 = reader.o0();
        l.c(objO0, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map = (Map) objO0;
        Object obj = map.get(COLOR_SCHEME_TYPE);
        if (obj == null) {
            throw new bf.n("Color scheme type is missing");
        }
        ThemeType themeType = (ThemeType) this.themeTypeAdapter.fromJsonValue(obj);
        if (themeType == null) {
            throw new bf.n("Invalid color scheme type");
        }
        if (WhenMappings.$EnumSwitchMapping$0[themeType.ordinal()] != 1) {
            throw new bf.n();
        }
        Object objFromJsonValue = this.microColorSchemeAdapter.fromJsonValue(map);
        l.c(objFromJsonValue, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.theme.ColorScheme");
        return (ColorScheme) objFromJsonValue;
    }

    @Override // nk.r
    @q0
    public void toJson(c0 writer, ColorScheme value) {
        l.e(writer, "writer");
        throw new UnsupportedOperationException();
    }
}
