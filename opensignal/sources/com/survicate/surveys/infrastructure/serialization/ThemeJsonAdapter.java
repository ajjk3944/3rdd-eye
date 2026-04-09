package com.survicate.surveys.infrastructure.serialization;

import bf.n;
import br.l;
import com.survicate.surveys.entities.survey.theme.ColorScheme;
import com.survicate.surveys.entities.survey.theme.Theme;
import com.survicate.surveys.entities.survey.theme.ThemeSettings;
import com.survicate.surveys.entities.survey.theme.ThemeType;
import java.util.Map;
import kotlin.Metadata;
import mq.b0;
import nk.c0;
import nk.q0;
import nk.r;
import nk.w;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00052\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%¨\u0006'"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/ThemeJsonAdapter;", "Lnk/r;", "Lcom/survicate/surveys/entities/survey/theme/Theme;", "Lcom/survicate/surveys/infrastructure/serialization/ColorSchemeJsonAdapter;", "colorSchemeJsonAdapter", "Lcom/survicate/surveys/entities/survey/theme/ThemeSettings;", "themeSettingsJsonAdapter", "Lcom/survicate/surveys/entities/survey/theme/ThemeType;", "themeTypeJsonAdapter", "<init>", "(Lcom/survicate/surveys/infrastructure/serialization/ColorSchemeJsonAdapter;Lnk/r;Lnk/r;)V", "", "rawTheme", "", "parseId", "(Ljava/util/Map;)I", "parseType", "(Ljava/util/Map;)Lcom/survicate/surveys/entities/survey/theme/ThemeType;", "", "parseRawType", "(Ljava/util/Map;)Ljava/lang/String;", "Lcom/survicate/surveys/entities/survey/theme/ColorScheme;", "parseColorScheme", "(Ljava/util/Map;)Lcom/survicate/surveys/entities/survey/theme/ColorScheme;", "parseSettings", "(Ljava/util/Map;)Lcom/survicate/surveys/entities/survey/theme/ThemeSettings;", "Lnk/w;", "reader", "fromJson", "(Lnk/w;)Lcom/survicate/surveys/entities/survey/theme/Theme;", "Lnk/c0;", "writer", "value", "Llq/b0;", "toJson", "(Lnk/c0;Lcom/survicate/surveys/entities/survey/theme/Theme;)V", "Lcom/survicate/surveys/infrastructure/serialization/ColorSchemeJsonAdapter;", "Lnk/r;", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThemeJsonAdapter extends r {
    private static final String COLOR_SCHEME = "color_scheme";
    private static final String ID = "id";
    private static final String THEME_SETTINGS = "settings";
    private static final String TYPE = "type";
    private final ColorSchemeJsonAdapter colorSchemeJsonAdapter;
    private final r themeSettingsJsonAdapter;
    private final r themeTypeJsonAdapter;

    public ThemeJsonAdapter(ColorSchemeJsonAdapter colorSchemeJsonAdapter, r rVar, r rVar2) {
        l.e(colorSchemeJsonAdapter, "colorSchemeJsonAdapter");
        l.e(rVar, "themeSettingsJsonAdapter");
        l.e(rVar2, "themeTypeJsonAdapter");
        this.colorSchemeJsonAdapter = colorSchemeJsonAdapter;
        this.themeSettingsJsonAdapter = rVar;
        this.themeTypeJsonAdapter = rVar2;
    }

    private final ColorScheme parseColorScheme(Map<?, ?> rawTheme) {
        Object obj = rawTheme.get(COLOR_SCHEME);
        Map mapT = obj instanceof Map ? (Map) obj : null;
        if (mapT == null) {
            throw new n("Color scheme should be an object");
        }
        String rawType = parseRawType(rawTheme);
        if (!mapT.containsKey(ColorSchemeJsonAdapter.COLOR_SCHEME_TYPE)) {
            mapT = b0.T(mapT, new lq.l(ColorSchemeJsonAdapter.COLOR_SCHEME_TYPE, rawType));
        }
        ColorScheme colorScheme = (ColorScheme) this.colorSchemeJsonAdapter.fromJsonValue(mapT);
        if (colorScheme != null) {
            return colorScheme;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final int parseId(Map<?, ?> rawTheme) {
        Object obj = rawTheme.get(ID);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return number.intValue();
        }
        throw new n("Theme id is missing");
    }

    private final String parseRawType(Map<?, ?> rawTheme) {
        Object obj = rawTheme.get(TYPE);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return str;
        }
        throw new n("Theme type should be a string");
    }

    private final ThemeSettings parseSettings(Map<?, ?> rawTheme) {
        Object obj = rawTheme.get(THEME_SETTINGS);
        if (obj == null) {
            throw new n("Theme settings are missing");
        }
        ThemeSettings themeSettings = (ThemeSettings) this.themeSettingsJsonAdapter.fromJsonValue(obj);
        if (themeSettings != null) {
            return themeSettings;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final ThemeType parseType(Map<?, ?> rawTheme) {
        ThemeType themeType = (ThemeType) this.themeTypeJsonAdapter.fromJsonValue(parseRawType(rawTheme));
        if (themeType != null) {
            return themeType;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // nk.r
    @nk.n
    public Theme fromJson(w reader) {
        l.e(reader, "reader");
        Object objO0 = reader.o0();
        Map<?, ?> map = objO0 instanceof Map ? (Map) objO0 : null;
        if (map != null) {
            return new Theme(parseId(map), parseType(map), parseColorScheme(map), parseSettings(map));
        }
        throw new n("Theme should be an object");
    }

    @Override // nk.r
    @q0
    public void toJson(c0 writer, Theme value) {
        l.e(writer, "writer");
        throw new UnsupportedOperationException();
    }
}
