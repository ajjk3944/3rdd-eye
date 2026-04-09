package com.ui.wmw;

import Z8.a;
import android.content.Context;
import com.ui.wmw.g;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import h9.C5969a;
import i9.InterfaceC6137a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public final class WMWizard {

    /* renamed from: a, reason: collision with root package name */
    public static final WMWizard f45247a = new WMWizard();

    /* renamed from: b, reason: collision with root package name */
    private static InterfaceC6137a f45248b;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ui/wmw/WMWizard$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "RequirementNotMet", "Connection", "Session", "Lcom/ui/wmw/WMWizard$Error$Connection;", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;", "Lcom/ui/wmw/WMWizard$Error$Session;", "Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;", "Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Type;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Connection;", "Lcom/ui/wmw/WMWizard$Error;", "<init>", "()V", "Btle", "Protocol", "Lcom/ui/wmw/WMWizard$Error$Connection$Btle;", "Lcom/ui/wmw/WMWizard$Error$Connection$Protocol;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Connection extends Error {

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Connection$Btle;", "Lcom/ui/wmw/WMWizard$Error$Connection;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Btle extends Connection {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                public Btle(String str, Throwable th2) {
                    super(null);
                    this.message = str;
                    this.cause = th2;
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Connection$Protocol;", "Lcom/ui/wmw/WMWizard$Error$Connection;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Protocol extends Connection {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                public Protocol(String str, Throwable th2) {
                    super(null);
                    this.message = str;
                    this.cause = th2;
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            public /* synthetic */ Connection(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Connection() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;", "Lcom/ui/wmw/WMWizard$Error;", "<init>", "()V", "LocationDisabled", "InsufficientPermission", "BluetoothAdapterUnavailable", "BluetoothAdapterDisabled", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterDisabled;", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterUnavailable;", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$InsufficientPermission;", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$LocationDisabled;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class RequirementNotMet extends Error {

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterDisabled;", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class BluetoothAdapterDisabled extends RequirementNotMet {

                /* renamed from: a, reason: collision with root package name */
                public static final BluetoothAdapterDisabled f45253a = new BluetoothAdapterDisabled();

                private BluetoothAdapterDisabled() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof BluetoothAdapterDisabled);
                }

                public int hashCode() {
                    return 2079538680;
                }

                @Override // java.lang.Throwable
                public String toString() {
                    return "BluetoothAdapterDisabled";
                }
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterUnavailable;", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class BluetoothAdapterUnavailable extends RequirementNotMet {

                /* renamed from: a, reason: collision with root package name */
                public static final BluetoothAdapterUnavailable f45254a = new BluetoothAdapterUnavailable();

                private BluetoothAdapterUnavailable() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof BluetoothAdapterUnavailable);
                }

                public int hashCode() {
                    return -1090628780;
                }

                @Override // java.lang.Throwable
                public String toString() {
                    return "BluetoothAdapterUnavailable";
                }
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$InsufficientPermission;", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class InsufficientPermission extends RequirementNotMet {

                /* renamed from: a, reason: collision with root package name */
                public static final InsufficientPermission f45255a = new InsufficientPermission();

                private InsufficientPermission() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof InsufficientPermission);
                }

                public int hashCode() {
                    return -1618871155;
                }

                @Override // java.lang.Throwable
                public String toString() {
                    return "InsufficientPermission";
                }
            }

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$LocationDisabled;", "Lcom/ui/wmw/WMWizard$Error$RequirementNotMet;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class LocationDisabled extends RequirementNotMet {

                /* renamed from: a, reason: collision with root package name */
                public static final LocationDisabled f45256a = new LocationDisabled();

                private LocationDisabled() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof LocationDisabled);
                }

                public int hashCode() {
                    return 1137753068;
                }

                @Override // java.lang.Throwable
                public String toString() {
                    return "LocationDisabled";
                }
            }

            public /* synthetic */ RequirementNotMet(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private RequirementNotMet() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session;", "Lcom/ui/wmw/WMWizard$Error;", "<init>", "()V", "UnsupportedApiLevel", "UnsupportedFirmwareVersion", "InvalidResponse", "RequestFailed", "RequestTimeout", "CommunicationProtocol", "Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;", "Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse;", "Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;", "Lcom/ui/wmw/WMWizard$Error$Session$RequestTimeout;", "Lcom/ui/wmw/WMWizard$Error$Session$UnsupportedApiLevel;", "Lcom/ui/wmw/WMWizard$Error$Session$UnsupportedFirmwareVersion;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Session extends Error {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;", "Lcom/ui/wmw/WMWizard$Error$Session;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class CommunicationProtocol extends Session {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CommunicationProtocol(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse;", "Lcom/ui/wmw/WMWizard$Error$Session;", "<init>", "()V", "Type", "Content", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class InvalidResponse extends Session {

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Content;", "Lcom/ui/wmw/WMWizard$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Content extends Error {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final String message;

                    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final Throwable cause;

                    public /* synthetic */ Content(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, (i10 & 2) != 0 ? null : th2);
                    }

                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return this.cause;
                    }

                    @Override // java.lang.Throwable
                    public String getMessage() {
                        return this.message;
                    }

                    public Content(String str, Throwable th2) {
                        super(null);
                        this.message = str;
                        this.cause = th2;
                    }
                }

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Type;", "Lcom/ui/wmw/WMWizard$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Type extends Error {

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final String message;

                    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                    private final Throwable cause;

                    public /* synthetic */ Type(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, (i10 & 2) != 0 ? null : th2);
                    }

                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return this.cause;
                    }

                    @Override // java.lang.Throwable
                    public String getMessage() {
                        return this.message;
                    }

                    public Type(String str, Throwable th2) {
                        super(null);
                        this.message = str;
                        this.cause = th2;
                    }
                }

                private InvalidResponse() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;", "Lcom/ui/wmw/WMWizard$Error$Session;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class RequestFailed extends Session {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                public /* synthetic */ RequestFailed(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i10 & 2) != 0 ? null : th2);
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RequestFailed(String message, Throwable th2) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                    this.cause = th2;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session$RequestTimeout;", "Lcom/ui/wmw/WMWizard$Error$Session;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class RequestTimeout extends Session {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RequestTimeout(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session$UnsupportedApiLevel;", "Lcom/ui/wmw/WMWizard$Error$Session;", "", "version", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "getMessage", "message", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UnsupportedApiLevel extends Session {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String version;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnsupportedApiLevel(String version) {
                    super(null);
                    AbstractC6492s.i(version, "version");
                    this.version = version;
                    this.message = "Unsupported Msg API Level " + version;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lcom/ui/wmw/WMWizard$Error$Session$UnsupportedFirmwareVersion;", "Lcom/ui/wmw/WMWizard$Error$Session;", "", "version", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "getMessage", "message", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UnsupportedFirmwareVersion extends Session {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String version;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnsupportedFirmwareVersion(String version) {
                    super(null);
                    AbstractC6492s.i(version, "version");
                    this.version = version;
                    this.message = "Unsupported Firmware Version " + version;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            public /* synthetic */ Session(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Session() {
                super(null);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public interface a {

        /* renamed from: com.ui.wmw.WMWizard$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1657a {

            /* renamed from: com.ui.wmw.WMWizard$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC1658a extends AbstractC1657a {

                /* renamed from: com.ui.wmw.WMWizard$a$a$a$a, reason: collision with other inner class name */
                public static final class C1659a extends AbstractC1658a {

                    /* renamed from: a, reason: collision with root package name */
                    private final g f45269a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1659a(g session) {
                        super(null);
                        AbstractC6492s.i(session, "session");
                        this.f45269a = session;
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a
                    public g a() {
                        return this.f45269a;
                    }
                }

                /* renamed from: com.ui.wmw.WMWizard$a$a$a$b */
                public static final class b extends AbstractC1658a {

                    /* renamed from: a, reason: collision with root package name */
                    private final g f45270a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(g session) {
                        super(null);
                        AbstractC6492s.i(session, "session");
                        this.f45270a = session;
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a
                    public g a() {
                        return this.f45270a;
                    }
                }

                public /* synthetic */ AbstractC1658a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public abstract g a();

                private AbstractC1658a() {
                    super(null);
                }
            }

            /* renamed from: com.ui.wmw.WMWizard$a$a$b */
            public static abstract class b extends AbstractC1657a {

                /* renamed from: com.ui.wmw.WMWizard$a$a$b$a, reason: collision with other inner class name */
                public static final class C1660a extends b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1660a f45271a = new C1660a();

                    private C1660a() {
                        super(null);
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1660a);
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public int hashCode() {
                        return -787056025;
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public String toString() {
                        return "Btle";
                    }
                }

                /* renamed from: com.ui.wmw.WMWizard$a$a$b$b, reason: collision with other inner class name */
                public static final class C1661b extends b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1661b f45272a = new C1661b();

                    private C1661b() {
                        super(null);
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1661b);
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public int hashCode() {
                        return 2087137339;
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public String toString() {
                        return "HandShake";
                    }
                }

                /* renamed from: com.ui.wmw.WMWizard$a$a$b$c */
                public static final class c extends b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final c f45273a = new c();

                    private c() {
                        super(null);
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof c);
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public int hashCode() {
                        return 820637690;
                    }

                    @Override // com.ui.wmw.WMWizard.a.AbstractC1657a
                    public String toString() {
                        return "Session";
                    }
                }

                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private b() {
                    super(null);
                }
            }

            public /* synthetic */ AbstractC1657a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
            
                if (kotlin.jvm.internal.AbstractC6492s.d(((com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.b) r4).a(), ((com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.b) r3).a()) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
            
                if (kotlin.jvm.internal.AbstractC6492s.d(((com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a) r4).a(), ((com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.C1659a) r3).a()) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
            
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean equals(java.lang.Object r4) {
                /*
                    r3 = this;
                    boolean r0 = r3 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.b.C1660a
                    if (r0 == 0) goto L7
                    boolean r4 = r4 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.b.C1660a
                    goto L52
                L7:
                    boolean r0 = r3 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.b.C1661b
                    if (r0 == 0) goto Le
                    boolean r4 = r4 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.b.C1661b
                    goto L52
                Le:
                    boolean r0 = r3 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.b.c
                    if (r0 == 0) goto L15
                    boolean r4 = r4 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.b.c
                    goto L52
                L15:
                    boolean r0 = r3 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.b
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L36
                    boolean r0 = r4 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.b
                    if (r0 == 0) goto L34
                    com.ui.wmw.WMWizard$a$a$a$b r4 = (com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.b) r4
                    com.ui.wmw.g r4 = r4.a()
                    r0 = r3
                    com.ui.wmw.WMWizard$a$a$a$b r0 = (com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.b) r0
                    com.ui.wmw.g r0 = r0.a()
                    boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r0)
                    if (r4 == 0) goto L34
                L32:
                    r4 = r2
                    goto L52
                L34:
                    r4 = r1
                    goto L52
                L36:
                    boolean r0 = r3 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.C1659a
                    if (r0 == 0) goto L53
                    boolean r0 = r4 instanceof com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a
                    if (r0 == 0) goto L34
                    com.ui.wmw.WMWizard$a$a$a r4 = (com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a) r4
                    com.ui.wmw.g r4 = r4.a()
                    r0 = r3
                    com.ui.wmw.WMWizard$a$a$a$a r0 = (com.ui.wmw.WMWizard.a.AbstractC1657a.AbstractC1658a.C1659a) r0
                    com.ui.wmw.g r0 = r0.a()
                    boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r0)
                    if (r4 == 0) goto L34
                    goto L32
                L52:
                    return r4
                L53:
                    kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                    r4.<init>()
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ui.wmw.WMWizard.a.AbstractC1657a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                if (this instanceof b) {
                    return super.hashCode();
                }
                if (this instanceof AbstractC1658a) {
                    return g.a.c(((AbstractC1658a) this).a().e());
                }
                throw new NoWhenBranchMatchedException();
            }

            public String toString() {
                String str;
                if (this instanceof b.C1660a) {
                    str = "CONNECTING [Btle]";
                } else if (this instanceof b.C1661b) {
                    str = "CONNECTING [Handshake]";
                } else if (this instanceof b.c) {
                    str = "CONNECTING [Session]";
                } else if (this instanceof AbstractC1658a.b) {
                    str = "CONNECTED " + g.a.d(((AbstractC1658a.b) this).a().e()) + " [Reconnection]";
                } else {
                    if (!(this instanceof AbstractC1658a.C1659a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "CONNECTED " + g.a.d(((AbstractC1658a.C1659a) this).a().e());
                }
                return "WMWizard Conection State " + str;
            }

            private AbstractC1657a() {
            }
        }

        gg.i a();
    }

    public static final class b implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f45274a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5969a f45275b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5969a f45276c;

        public b(Context context, C5969a c5969a, C5969a c5969a2) {
            this.f45274a = context;
            this.f45275b = c5969a;
            this.f45276c = c5969a2;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new com.ui.wmw.a(this.f45274a, this.f45275b, this.f45276c));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    private WMWizard() {
    }

    public final a.AbstractC0966a a() {
        return a.AbstractC0966a.b.f25191a;
    }

    public final InterfaceC6137a b() {
        return f45248b;
    }

    public final z c(Context context, C5969a mac, C5969a btleMac) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(mac, "mac");
        AbstractC6492s.i(btleMac, "btleMac");
        z zVarI = z.i(new b(context, mac, btleMac));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    public final void d(InterfaceC6137a interfaceC6137a) {
        f45248b = interfaceC6137a;
    }

    public final boolean e(Throwable error) {
        AbstractC6492s.i(error, "error");
        if (error instanceof Error) {
            return true;
        }
        return com.ui.btle.rxandroidble.a.f41105a.e(error);
    }
}
