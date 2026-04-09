package com.ui.wifiman.model.android.secure;

import com.ui.wifiman.model.android.secure.AndroidPassphraseManager;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.z;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface AndroidPassphraseManager {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "StorageError", "Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error$StorageError;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error$StorageError;", "Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StorageError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public /* synthetic */ StorageError(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
            public StorageError(String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
                this.cause = th2;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a TELEPORT = new a("TELEPORT", 0, "teleport", new InterfaceC6824a() { // from class: sc.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return AndroidPassphraseManager.a._init_$lambda$0();
            }
        });
        private final String alias;
        private final InterfaceC6824a generator;

        private static final /* synthetic */ a[] $values() {
            return new a[]{TELEPORT};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2, InterfaceC6824a interfaceC6824a) {
            this.alias = str2;
            this.generator = interfaceC6824a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _init_$lambda$0() {
            String string = UUID.randomUUID().toString();
            AbstractC6492s.h(string, "toString(...)");
            return string;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String getAlias() {
            return this.alias;
        }

        public final InterfaceC6824a getGenerator() {
            return this.generator;
        }
    }

    z a(a aVar);

    AbstractC5912b clear();
}
