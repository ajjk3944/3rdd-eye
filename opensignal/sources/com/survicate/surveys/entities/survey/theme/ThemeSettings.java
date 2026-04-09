package com.survicate.surveys.entities.survey.theme;

import br.g;
import br.l;
import h0.b;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/survicate/surveys/entities/survey/theme/ThemeSettings;", "", "companyLogo", "", "personalization", "", "shortTextMessage", "avatarImage", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarImage", "()Ljava/lang/String;", "getCompanyLogo", "getPersonalization", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShortTextMessage", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/survicate/surveys/entities/survey/theme/ThemeSettings;", "equals", "other", "hashCode", "", "toString", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ThemeSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String avatarImage;
    private final String companyLogo;
    private final Boolean personalization;
    private final String shortTextMessage;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/entities/survey/theme/ThemeSettings$Companion;", "", "()V", "empty", "Lcom/survicate/surveys/entities/survey/theme/ThemeSettings;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ThemeSettings empty() {
            return new ThemeSettings(null, null, null, null);
        }

        private Companion() {
        }
    }

    public ThemeSettings(@o(name = "company_logo") String str, @o(name = "personalization") Boolean bool, @o(name = "short_text_message") String str2, @o(name = "avatar_image") String str3) {
        this.companyLogo = str;
        this.personalization = bool;
        this.shortTextMessage = str2;
        this.avatarImage = str3;
    }

    public static /* synthetic */ ThemeSettings copy$default(ThemeSettings themeSettings, String str, Boolean bool, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = themeSettings.companyLogo;
        }
        if ((i10 & 2) != 0) {
            bool = themeSettings.personalization;
        }
        if ((i10 & 4) != 0) {
            str2 = themeSettings.shortTextMessage;
        }
        if ((i10 & 8) != 0) {
            str3 = themeSettings.avatarImage;
        }
        return themeSettings.copy(str, bool, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCompanyLogo() {
        return this.companyLogo;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getPersonalization() {
        return this.personalization;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShortTextMessage() {
        return this.shortTextMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarImage() {
        return this.avatarImage;
    }

    public final ThemeSettings copy(@o(name = "company_logo") String companyLogo, @o(name = "personalization") Boolean personalization, @o(name = "short_text_message") String shortTextMessage, @o(name = "avatar_image") String avatarImage) {
        return new ThemeSettings(companyLogo, personalization, shortTextMessage, avatarImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeSettings)) {
            return false;
        }
        ThemeSettings themeSettings = (ThemeSettings) other;
        return l.a(this.companyLogo, themeSettings.companyLogo) && l.a(this.personalization, themeSettings.personalization) && l.a(this.shortTextMessage, themeSettings.shortTextMessage) && l.a(this.avatarImage, themeSettings.avatarImage);
    }

    public final String getAvatarImage() {
        return this.avatarImage;
    }

    public final String getCompanyLogo() {
        return this.companyLogo;
    }

    public final Boolean getPersonalization() {
        return this.personalization;
    }

    public final String getShortTextMessage() {
        return this.shortTextMessage;
    }

    public int hashCode() {
        String str = this.companyLogo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.personalization;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.shortTextMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatarImage;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ThemeSettings(companyLogo=");
        sb2.append(this.companyLogo);
        sb2.append(", personalization=");
        sb2.append(this.personalization);
        sb2.append(", shortTextMessage=");
        sb2.append(this.shortTextMessage);
        sb2.append(", avatarImage=");
        return b.r(sb2, this.avatarImage, ')');
    }
}
