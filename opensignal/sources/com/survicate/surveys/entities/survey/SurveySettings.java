package com.survicate.surveys.entities.survey;

import ba.m;
import br.g;
import br.l;
import c7.a;
import com.survicate.surveys.entities.survey.translations.SurveySettingsTranslation;
import com.survicate.surveys.entities.survey.translations.Translatable;
import h0.b;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001IB¡\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u0012\b\b\u0003\u0010\r\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0017J\u0010\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019Jª\u0001\u0010@\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u0012\u001a\u00020\u00062\b\b\u0003\u0010\u0013\u001a\u00020\u00062\b\b\u0003\u0010\u0014\u001a\u00020\u00062\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\bHÖ\u0001J\b\u0010F\u001a\u00020\fH\u0016J\u0012\u0010G\u001a\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010\u0002H\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b1\u0010\u0019¨\u0006J"}, d2 = {"Lcom/survicate/surveys/entities/survey/SurveySettings;", "Lcom/survicate/surveys/entities/survey/translations/Translatable;", "Lcom/survicate/surveys/entities/survey/translations/SurveySettingsTranslation;", "percentage", "", "displayNotEngaged", "", "displayDelaySeconds", "", "messages", "Lcom/survicate/surveys/entities/survey/SurveyMessages;", "presentationStyle", "", "recurring", "recurringPeriodSeconds", "", "recurringStopAfterSeconds", "surveyThrottleDays", "hideFooter", "showProgressBar", "navigationEnabled", "followupLimit", "surveyLanguage", "(Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/survicate/surveys/entities/survey/SurveyMessages;Ljava/lang/String;ZJLjava/lang/Long;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/String;)V", "getDisplayDelaySeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDisplayNotEngaged", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFollowupLimit", "getHideFooter", "()Z", "getMessages", "()Lcom/survicate/surveys/entities/survey/SurveyMessages;", "getNavigationEnabled", "getPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPresentationStyle", "()Ljava/lang/String;", "getRecurring", "getRecurringPeriodSeconds", "()J", "getRecurringStopAfterSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShowProgressBar", "getSurveyLanguage", "getSurveyThrottleDays", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/survicate/surveys/entities/survey/SurveyMessages;Ljava/lang/String;ZJLjava/lang/Long;Ljava/lang/Integer;ZZZLjava/lang/Integer;Ljava/lang/String;)Lcom/survicate/surveys/entities/survey/SurveySettings;", "equals", "other", "", "hashCode", "toString", "translatedWith", "translation", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SurveySettings implements Translatable<SurveySettingsTranslation, SurveySettings> {
    public static final long RECURRING_PERIOD_INSTANTLY = -1;
    private final Integer displayDelaySeconds;
    private final Boolean displayNotEngaged;
    private final Integer followupLimit;
    private final boolean hideFooter;
    private final SurveyMessages messages;
    private final boolean navigationEnabled;
    private final Double percentage;
    private final String presentationStyle;
    private final boolean recurring;
    private final long recurringPeriodSeconds;
    private final Long recurringStopAfterSeconds;
    private final boolean showProgressBar;
    private final String surveyLanguage;
    private final Integer surveyThrottleDays;

    public SurveySettings() {
        this(null, null, null, null, null, false, 0L, null, null, false, false, false, null, null, 16383, null);
    }

    public static /* synthetic */ SurveySettings copy$default(SurveySettings surveySettings, Double d6, Boolean bool, Integer num, SurveyMessages surveyMessages, String str, boolean z10, long j, Long l10, Integer num2, boolean z11, boolean z12, boolean z13, Integer num3, String str2, int i10, Object obj) {
        return surveySettings.copy((i10 & 1) != 0 ? surveySettings.percentage : d6, (i10 & 2) != 0 ? surveySettings.displayNotEngaged : bool, (i10 & 4) != 0 ? surveySettings.displayDelaySeconds : num, (i10 & 8) != 0 ? surveySettings.messages : surveyMessages, (i10 & 16) != 0 ? surveySettings.presentationStyle : str, (i10 & 32) != 0 ? surveySettings.recurring : z10, (i10 & 64) != 0 ? surveySettings.recurringPeriodSeconds : j, (i10 & 128) != 0 ? surveySettings.recurringStopAfterSeconds : l10, (i10 & 256) != 0 ? surveySettings.surveyThrottleDays : num2, (i10 & 512) != 0 ? surveySettings.hideFooter : z11, (i10 & 1024) != 0 ? surveySettings.showProgressBar : z12, (i10 & 2048) != 0 ? surveySettings.navigationEnabled : z13, (i10 & 4096) != 0 ? surveySettings.followupLimit : num3, (i10 & 8192) != 0 ? surveySettings.surveyLanguage : str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getPercentage() {
        return this.percentage;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHideFooter() {
        return this.hideFooter;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getNavigationEnabled() {
        return this.navigationEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getFollowupLimit() {
        return this.followupLimit;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSurveyLanguage() {
        return this.surveyLanguage;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getDisplayNotEngaged() {
        return this.displayNotEngaged;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getDisplayDelaySeconds() {
        return this.displayDelaySeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final SurveyMessages getMessages() {
        return this.messages;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPresentationStyle() {
        return this.presentationStyle;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getRecurring() {
        return this.recurring;
    }

    /* renamed from: component7, reason: from getter */
    public final long getRecurringPeriodSeconds() {
        return this.recurringPeriodSeconds;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getRecurringStopAfterSeconds() {
        return this.recurringStopAfterSeconds;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getSurveyThrottleDays() {
        return this.surveyThrottleDays;
    }

    public final SurveySettings copy(@o(name = "display_percentage") Double percentage, @o(name = "display_not_engaged") Boolean displayNotEngaged, @o(name = "display_delay") Integer displayDelaySeconds, @o(name = "messages") SurveyMessages messages, @o(name = "place_to_show") String presentationStyle, @o(name = "recurring") boolean recurring, @o(name = "recurring_period") long recurringPeriodSeconds, @o(name = "recurring_stop_after") Long recurringStopAfterSeconds, @o(name = "survey_throttle") Integer surveyThrottleDays, @o(name = "hide_footer") boolean hideFooter, @o(name = "show_progress_bar") boolean showProgressBar, @o(name = "navigation_enabled") boolean navigationEnabled, @o(name = "followup_limit") Integer followupLimit, @o(name = "survey_language") String surveyLanguage) {
        l.e(presentationStyle, "presentationStyle");
        return new SurveySettings(percentage, displayNotEngaged, displayDelaySeconds, messages, presentationStyle, recurring, recurringPeriodSeconds, recurringStopAfterSeconds, surveyThrottleDays, hideFooter, showProgressBar, navigationEnabled, followupLimit, surveyLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveySettings)) {
            return false;
        }
        SurveySettings surveySettings = (SurveySettings) other;
        return l.a(this.percentage, surveySettings.percentage) && l.a(this.displayNotEngaged, surveySettings.displayNotEngaged) && l.a(this.displayDelaySeconds, surveySettings.displayDelaySeconds) && l.a(this.messages, surveySettings.messages) && l.a(this.presentationStyle, surveySettings.presentationStyle) && this.recurring == surveySettings.recurring && this.recurringPeriodSeconds == surveySettings.recurringPeriodSeconds && l.a(this.recurringStopAfterSeconds, surveySettings.recurringStopAfterSeconds) && l.a(this.surveyThrottleDays, surveySettings.surveyThrottleDays) && this.hideFooter == surveySettings.hideFooter && this.showProgressBar == surveySettings.showProgressBar && this.navigationEnabled == surveySettings.navigationEnabled && l.a(this.followupLimit, surveySettings.followupLimit) && l.a(this.surveyLanguage, surveySettings.surveyLanguage);
    }

    public final Integer getDisplayDelaySeconds() {
        return this.displayDelaySeconds;
    }

    public final Boolean getDisplayNotEngaged() {
        return this.displayNotEngaged;
    }

    public final Integer getFollowupLimit() {
        return this.followupLimit;
    }

    public final boolean getHideFooter() {
        return this.hideFooter;
    }

    public final SurveyMessages getMessages() {
        return this.messages;
    }

    public final boolean getNavigationEnabled() {
        return this.navigationEnabled;
    }

    public final Double getPercentage() {
        return this.percentage;
    }

    public final String getPresentationStyle() {
        return this.presentationStyle;
    }

    public final boolean getRecurring() {
        return this.recurring;
    }

    public final long getRecurringPeriodSeconds() {
        return this.recurringPeriodSeconds;
    }

    public final Long getRecurringStopAfterSeconds() {
        return this.recurringStopAfterSeconds;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final String getSurveyLanguage() {
        return this.surveyLanguage;
    }

    public final Integer getSurveyThrottleDays() {
        return this.surveyThrottleDays;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Double d6 = this.percentage;
        int iHashCode = (d6 == null ? 0 : d6.hashCode()) * 31;
        Boolean bool = this.displayNotEngaged;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.displayDelaySeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        SurveyMessages surveyMessages = this.messages;
        int iG = a.g(this.presentationStyle, (iHashCode3 + (surveyMessages == null ? 0 : surveyMessages.hashCode())) * 31, 31);
        boolean z10 = this.recurring;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iB = b.b((iG + i10) * 31, 31, this.recurringPeriodSeconds);
        Long l10 = this.recurringStopAfterSeconds;
        int iHashCode4 = (iB + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num2 = this.surveyThrottleDays;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z11 = this.hideFooter;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (iHashCode5 + i11) * 31;
        boolean z12 = this.showProgressBar;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z13 = this.navigationEnabled;
        int i15 = (i14 + (z13 ? 1 : z13 ? 1 : 0)) * 31;
        Integer num3 = this.followupLimit;
        int iHashCode6 = (i15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.surveyLanguage;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return m.N(this);
    }

    public SurveySettings(@o(name = "display_percentage") Double d6, @o(name = "display_not_engaged") Boolean bool, @o(name = "display_delay") Integer num, @o(name = "messages") SurveyMessages surveyMessages, @o(name = "place_to_show") String str, @o(name = "recurring") boolean z10, @o(name = "recurring_period") long j, @o(name = "recurring_stop_after") Long l10, @o(name = "survey_throttle") Integer num2, @o(name = "hide_footer") boolean z11, @o(name = "show_progress_bar") boolean z12, @o(name = "navigation_enabled") boolean z13, @o(name = "followup_limit") Integer num3, @o(name = "survey_language") String str2) {
        l.e(str, "presentationStyle");
        this.percentage = d6;
        this.displayNotEngaged = bool;
        this.displayDelaySeconds = num;
        this.messages = surveyMessages;
        this.presentationStyle = str;
        this.recurring = z10;
        this.recurringPeriodSeconds = j;
        this.recurringStopAfterSeconds = l10;
        this.surveyThrottleDays = num2;
        this.hideFooter = z11;
        this.showProgressBar = z12;
        this.navigationEnabled = z13;
        this.followupLimit = num3;
        this.surveyLanguage = str2;
    }

    @Override // com.survicate.surveys.entities.survey.translations.Translatable
    public SurveySettings translatedWith(SurveySettingsTranslation translation) {
        SurveyMessages surveyMessagesTranslatedWith2;
        if (translation != null) {
            SurveyMessages surveyMessages = this.messages;
            surveyMessagesTranslatedWith2 = surveyMessages != null ? surveyMessages.translatedWith(translation.getMessages()) : null;
        } else {
            surveyMessagesTranslatedWith2 = this.messages;
        }
        return copy$default(this, null, null, null, surveyMessagesTranslatedWith2, null, false, 0L, null, null, false, false, false, null, null, 16375, null);
    }

    public /* synthetic */ SurveySettings(Double d6, Boolean bool, Integer num, SurveyMessages surveyMessages, String str, boolean z10, long j, Long l10, Integer num2, boolean z11, boolean z12, boolean z13, Integer num3, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? Double.valueOf(0.0d) : d6, (i10 & 2) != 0 ? Boolean.FALSE : bool, (i10 & 4) != 0 ? 0 : num, (i10 & 8) != 0 ? null : surveyMessages, (i10 & 16) != 0 ? "fullscreen" : str, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? 0L : j, (i10 & 128) != 0 ? null : l10, (i10 & 256) != 0 ? null : num2, (i10 & 512) != 0 ? false : z11, (i10 & 1024) != 0 ? true : z12, (i10 & 2048) == 0 ? z13 : false, (i10 & 4096) != 0 ? null : num3, (i10 & 8192) != 0 ? null : str2);
    }
}
