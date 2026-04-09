package com.survicate.surveys.entities.survey.theme;

import br.l;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/survicate/surveys/entities/survey/theme/Theme;", "", "id", "", "type", "Lcom/survicate/surveys/entities/survey/theme/ThemeType;", "colorScheme", "Lcom/survicate/surveys/entities/survey/theme/ColorScheme;", "settings", "Lcom/survicate/surveys/entities/survey/theme/ThemeSettings;", "(ILcom/survicate/surveys/entities/survey/theme/ThemeType;Lcom/survicate/surveys/entities/survey/theme/ColorScheme;Lcom/survicate/surveys/entities/survey/theme/ThemeSettings;)V", "getColorScheme", "()Lcom/survicate/surveys/entities/survey/theme/ColorScheme;", "getId", "()I", "getSettings", "()Lcom/survicate/surveys/entities/survey/theme/ThemeSettings;", "getType", "()Lcom/survicate/surveys/entities/survey/theme/ThemeType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Theme {
    private final ColorScheme colorScheme;
    private final int id;
    private final ThemeSettings settings;
    private final ThemeType type;

    public Theme(@o(name = "id") int i10, @o(name = "type") ThemeType themeType, @o(name = "color_scheme") ColorScheme colorScheme, @o(name = "settings") ThemeSettings themeSettings) {
        l.e(themeType, "type");
        l.e(colorScheme, "colorScheme");
        l.e(themeSettings, "settings");
        this.id = i10;
        this.type = themeType;
        this.colorScheme = colorScheme;
        this.settings = themeSettings;
    }

    public static /* synthetic */ Theme copy$default(Theme theme, int i10, ThemeType themeType, ColorScheme colorScheme, ThemeSettings themeSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = theme.id;
        }
        if ((i11 & 2) != 0) {
            themeType = theme.type;
        }
        if ((i11 & 4) != 0) {
            colorScheme = theme.colorScheme;
        }
        if ((i11 & 8) != 0) {
            themeSettings = theme.settings;
        }
        return theme.copy(i10, themeType, colorScheme, themeSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemeType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final ColorScheme getColorScheme() {
        return this.colorScheme;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemeSettings getSettings() {
        return this.settings;
    }

    public final Theme copy(@o(name = "id") int id2, @o(name = "type") ThemeType type, @o(name = "color_scheme") ColorScheme colorScheme, @o(name = "settings") ThemeSettings settings) {
        l.e(type, "type");
        l.e(colorScheme, "colorScheme");
        l.e(settings, "settings");
        return new Theme(id2, type, colorScheme, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Theme)) {
            return false;
        }
        Theme theme = (Theme) other;
        return this.id == theme.id && this.type == theme.type && l.a(this.colorScheme, theme.colorScheme) && l.a(this.settings, theme.settings);
    }

    public final ColorScheme getColorScheme() {
        return this.colorScheme;
    }

    public final int getId() {
        return this.id;
    }

    public final ThemeSettings getSettings() {
        return this.settings;
    }

    public final ThemeType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.settings.hashCode() + ((this.colorScheme.hashCode() + ((this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Theme(id=" + this.id + ", type=" + this.type + ", colorScheme=" + this.colorScheme + ", settings=" + this.settings + ')';
    }
}
