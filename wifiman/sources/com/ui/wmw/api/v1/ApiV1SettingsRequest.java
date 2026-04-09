package com.ui.wmw.api.v1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public abstract class ApiV1SettingsRequest {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$HwReset;", "Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;", "", "blocked", "<init>", "(Z)V", "copy", "(Z)Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$HwReset;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Z", "()Z", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class HwReset extends ApiV1SettingsRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean blocked;

        public HwReset(@Y6.g(name = "hwResetBlocked") boolean z10) {
            super(null);
            this.blocked = z10;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getBlocked() {
            return this.blocked;
        }

        public final HwReset copy(@Y6.g(name = "hwResetBlocked") boolean blocked) {
            return new HwReset(blocked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HwReset) && this.blocked == ((HwReset) other).blocked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.blocked);
        }

        public String toString() {
            return "HwReset(blocked=" + this.blocked + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$Led;", "Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;", "", "enabled", "<init>", "(Z)V", "copy", "(Z)Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$Led;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Z", "()Z", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class Led extends ApiV1SettingsRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enabled;

        public Led(@Y6.g(name = "ledEnabled") boolean z10) {
            super(null);
            this.enabled = z10;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Led copy(@Y6.g(name = "ledEnabled") boolean enabled) {
            return new Led(enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Led) && this.enabled == ((Led) other).enabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public String toString() {
            return "Led(enabled=" + this.enabled + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$Name;", "Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;", "", "name", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$Name;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class Name extends ApiV1SettingsRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Name(@Y6.g(name = "name") String name) {
            super(null);
            AbstractC6492s.i(name, "name");
            this.name = name;
        }

        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Name copy(@Y6.g(name = "name") String name) {
            AbstractC6492s.i(name, "name");
            return new Name(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Name) && AbstractC6492s.d(this.name, ((Name) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "Name(name=" + this.name + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;", "Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;", "", "statisticsIntervalSeconds", "<init>", "(I)V", "copy", "(I)Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "I", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class StatisticsInterval extends ApiV1SettingsRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int statisticsIntervalSeconds;

        public StatisticsInterval(@Y6.g(name = "intStats") int i10) {
            super(null);
            this.statisticsIntervalSeconds = i10;
        }

        /* renamed from: a, reason: from getter */
        public final int getStatisticsIntervalSeconds() {
            return this.statisticsIntervalSeconds;
        }

        public final StatisticsInterval copy(@Y6.g(name = "intStats") int statisticsIntervalSeconds) {
            return new StatisticsInterval(statisticsIntervalSeconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatisticsInterval) && this.statisticsIntervalSeconds == ((StatisticsInterval) other).statisticsIntervalSeconds;
        }

        public int hashCode() {
            return Integer.hashCode(this.statisticsIntervalSeconds);
        }

        public String toString() {
            return "StatisticsInterval(statisticsIntervalSeconds=" + this.statisticsIntervalSeconds + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$WifiPriorityChannel;", "Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;", "", "", "channels", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$WifiPriorityChannel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "()Ljava/util/List;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class WifiPriorityChannel extends ApiV1SettingsRequest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List channels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WifiPriorityChannel(@Y6.g(name = "channel") List<Integer> channels) {
            super(null);
            AbstractC6492s.i(channels, "channels");
            this.channels = channels;
        }

        /* renamed from: a, reason: from getter */
        public final List getChannels() {
            return this.channels;
        }

        public final WifiPriorityChannel copy(@Y6.g(name = "channel") List<Integer> channels) {
            AbstractC6492s.i(channels, "channels");
            return new WifiPriorityChannel(channels);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WifiPriorityChannel) && AbstractC6492s.d(this.channels, ((WifiPriorityChannel) other).channels);
        }

        public int hashCode() {
            return this.channels.hashCode();
        }

        public String toString() {
            return "WifiPriorityChannel(channels=" + this.channels + ")";
        }
    }

    public /* synthetic */ ApiV1SettingsRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiV1SettingsRequest() {
    }
}
