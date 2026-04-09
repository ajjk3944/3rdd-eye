package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.function.Consumer;
import org.snmp4j.asn1.BER;

/* loaded from: classes3.dex */
public class ArCoreApk {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class Availability {
        final int nativeCode;
        public static final Availability UNKNOWN_ERROR = new C5038a();
        public static final Availability UNKNOWN_CHECKING = new C5054r();
        public static final Availability UNKNOWN_TIMED_OUT = new s();
        public static final Availability UNSUPPORTED_DEVICE_NOT_CAPABLE = new t();
        public static final Availability SUPPORTED_NOT_INSTALLED = new u();
        public static final Availability SUPPORTED_APK_TOO_OLD = new v();
        public static final Availability SUPPORTED_INSTALLED = new w();
        private static final /* synthetic */ Availability[] $VALUES = $values();

        private static /* synthetic */ Availability[] $values() {
            return new Availability[]{UNKNOWN_ERROR, UNKNOWN_CHECKING, UNKNOWN_TIMED_OUT, UNSUPPORTED_DEVICE_NOT_CAPABLE, SUPPORTED_NOT_INSTALLED, SUPPORTED_APK_TOO_OLD, SUPPORTED_INSTALLED};
        }

        /* synthetic */ Availability(String str, int i10, int i11, byte[] bArr) {
            this(str, i10, i11);
        }

        static Availability forNumber(int i10) {
            for (Availability availability : values()) {
                if (availability.nativeCode == i10) {
                    return availability;
                }
            }
            throw new FatalException(F.b(BER.SEQUENCE, i10, "Unexpected value for native Availability, value="));
        }

        public static Availability valueOf(String str) {
            return (Availability) Enum.valueOf(Availability.class, str);
        }

        public static Availability[] values() {
            return (Availability[]) $VALUES.clone();
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        private Availability(String str, int i10, int i11) {
            this.nativeCode = i11;
        }
    }

    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);

        final int nativeCode;

        InstallBehavior(int i10) {
            this.nativeCode = i10;
        }

        static InstallBehavior forNumber(int i10) {
            for (InstallBehavior installBehavior : values()) {
                if (installBehavior.nativeCode == i10) {
                    return installBehavior;
                }
            }
            throw new FatalException(F.b((byte) 51, i10, "Unexpected value for native InstallBehavior, value="));
        }
    }

    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);

        final int nativeCode;

        InstallStatus(int i10) {
            this.nativeCode = i10;
        }

        static InstallStatus forNumber(int i10) {
            for (InstallStatus installStatus : values()) {
                if (installStatus.nativeCode == i10) {
                    return installStatus;
                }
            }
            throw new FatalException(F.b((byte) 49, i10, "Unexpected value for native InstallStatus, value="));
        }
    }

    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);

        final int nativeCode;

        UserMessageType(int i10) {
            this.nativeCode = i10;
        }

        static UserMessageType forNumber(int i10) {
            for (UserMessageType userMessageType : values()) {
                if (userMessageType.nativeCode == i10) {
                    return userMessageType;
                }
            }
            throw new FatalException(F.b((byte) 51, i10, "Unexpected value for native UserMessageType, value="));
        }
    }

    protected ArCoreApk() {
    }

    public static ArCoreApk getInstance() {
        return A.a();
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public void checkAvailabilityAsync(Context context, Consumer<Availability> consumer) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z10) throws UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z10, InstallBehavior installBehavior, UserMessageType userMessageType) throws UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        throw new UnsupportedOperationException("Stub");
    }
}
