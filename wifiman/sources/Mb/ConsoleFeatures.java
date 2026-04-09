package mb;

import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%\u0011&B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#¨\u0006'"}, d2 = {"Lmb/e;", "Landroid/os/Parcelable;", "Lmb/e$d;", "webrtc", "<init>", "(Lmb/e$d;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILmb/e$d;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lmb/e;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmb/e$d;", "Companion", "d", SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class ConsoleFeatures implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final WebRTC webrtc;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ConsoleFeatures> CREATOR = new c();

    /* renamed from: mb.e$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53781a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53781a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.ConsoleFeatures", aVar, 1);
            h02.p("webrtc", true);
            descriptor = h02;
        }

        private a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            return new Vi.b[]{Wi.a.u(WebRTC.a.f53786a)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ConsoleFeatures c(Yi.e decoder) {
            WebRTC webRTC;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i10 = 1;
            R0 r02 = null;
            if (cVarC.B()) {
                webRTC = (WebRTC) cVarC.h(fVar, 0, WebRTC.a.f53786a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                webRTC = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        webRTC = (WebRTC) cVarC.h(fVar, 0, WebRTC.a.f53786a, webRTC);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarC.b(fVar);
            return new ConsoleFeatures(i10, webRTC, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, ConsoleFeatures value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            ConsoleFeatures.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53781a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.e$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsoleFeatures createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new ConsoleFeatures(parcel.readInt() == 0 ? null : WebRTC.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConsoleFeatures[] newArray(int i10) {
            return new ConsoleFeatures[i10];
        }
    }

    @Vi.n
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u0014(B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'¨\u0006/"}, d2 = {"Lmb/e$d;", "Landroid/os/Parcelable;", "", "mediaStreams", "iceRestart", "twoWayAudio", "mediaStreamsH265", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lmb/e$d;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getMediaStreams", "()Ljava/lang/Boolean;", SnmpConfigurator.O_BIND_ADDRESS, "getIceRestart", SnmpConfigurator.O_COMMUNITY, "getTwoWayAudio", "d", "getMediaStreamsH265", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mb.e$d, reason: from toString */
    public static final /* data */ class WebRTC implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean mediaStreams;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean iceRestart;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean twoWayAudio;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean mediaStreamsH265;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<WebRTC> CREATOR = new c();

        /* renamed from: mb.e$d$a */
        public /* synthetic */ class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f53786a;
            private static final Xi.f descriptor;

            static {
                a aVar = new a();
                f53786a = aVar;
                H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.ConsoleFeatures.WebRTC", aVar, 4);
                h02.p("mediaStreams", true);
                h02.p("iceRestart", true);
                h02.p("twoWayAudio", true);
                h02.p("mediaStreamsH265", true);
                descriptor = h02;
            }

            private a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public final Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public final Vi.b[] d() {
                C3710i c3710i = C3710i.f25639a;
                return new Vi.b[]{Wi.a.u(c3710i), Wi.a.u(c3710i), Wi.a.u(c3710i), Wi.a.u(c3710i)};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final WebRTC c(Yi.e decoder) {
                int i10;
                Boolean bool;
                Boolean bool2;
                Boolean bool3;
                Boolean bool4;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar = descriptor;
                Yi.c cVarC = decoder.c(fVar);
                Boolean bool5 = null;
                if (cVarC.B()) {
                    C3710i c3710i = C3710i.f25639a;
                    Boolean bool6 = (Boolean) cVarC.h(fVar, 0, c3710i, null);
                    Boolean bool7 = (Boolean) cVarC.h(fVar, 1, c3710i, null);
                    Boolean bool8 = (Boolean) cVarC.h(fVar, 2, c3710i, null);
                    bool4 = (Boolean) cVarC.h(fVar, 3, c3710i, null);
                    i10 = 15;
                    bool3 = bool8;
                    bool2 = bool7;
                    bool = bool6;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Boolean bool9 = null;
                    Boolean bool10 = null;
                    Boolean bool11 = null;
                    while (z10) {
                        int iK = cVarC.k(fVar);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            bool5 = (Boolean) cVarC.h(fVar, 0, C3710i.f25639a, bool5);
                            i11 |= 1;
                        } else if (iK == 1) {
                            bool9 = (Boolean) cVarC.h(fVar, 1, C3710i.f25639a, bool9);
                            i11 |= 2;
                        } else if (iK == 2) {
                            bool10 = (Boolean) cVarC.h(fVar, 2, C3710i.f25639a, bool10);
                            i11 |= 4;
                        } else {
                            if (iK != 3) {
                                throw new UnknownFieldException(iK);
                            }
                            bool11 = (Boolean) cVarC.h(fVar, 3, C3710i.f25639a, bool11);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    bool = bool5;
                    bool2 = bool9;
                    bool3 = bool10;
                    bool4 = bool11;
                }
                cVarC.b(fVar);
                return new WebRTC(i10, bool, bool2, bool3, bool4, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, WebRTC value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                WebRTC.a(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: mb.e$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return a.f53786a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: mb.e$d$c */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WebRTC createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                Boolean boolValueOf3;
                AbstractC6492s.i(parcel, "parcel");
                Boolean boolValueOf4 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new WebRTC(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WebRTC[] newArray(int i10) {
                return new WebRTC[i10];
            }
        }

        public /* synthetic */ WebRTC(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, R0 r02) {
            if ((i10 & 1) == 0) {
                this.mediaStreams = null;
            } else {
                this.mediaStreams = bool;
            }
            if ((i10 & 2) == 0) {
                this.iceRestart = null;
            } else {
                this.iceRestart = bool2;
            }
            if ((i10 & 4) == 0) {
                this.twoWayAudio = null;
            } else {
                this.twoWayAudio = bool3;
            }
            if ((i10 & 8) == 0) {
                this.mediaStreamsH265 = null;
            } else {
                this.mediaStreamsH265 = bool4;
            }
        }

        public static final /* synthetic */ void a(WebRTC self, Yi.d output, Xi.f serialDesc) {
            if (output.o(serialDesc, 0) || self.mediaStreams != null) {
                output.t(serialDesc, 0, C3710i.f25639a, self.mediaStreams);
            }
            if (output.o(serialDesc, 1) || self.iceRestart != null) {
                output.t(serialDesc, 1, C3710i.f25639a, self.iceRestart);
            }
            if (output.o(serialDesc, 2) || self.twoWayAudio != null) {
                output.t(serialDesc, 2, C3710i.f25639a, self.twoWayAudio);
            }
            if (!output.o(serialDesc, 3) && self.mediaStreamsH265 == null) {
                return;
            }
            output.t(serialDesc, 3, C3710i.f25639a, self.mediaStreamsH265);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebRTC)) {
                return false;
            }
            WebRTC webRTC = (WebRTC) other;
            return AbstractC6492s.d(this.mediaStreams, webRTC.mediaStreams) && AbstractC6492s.d(this.iceRestart, webRTC.iceRestart) && AbstractC6492s.d(this.twoWayAudio, webRTC.twoWayAudio) && AbstractC6492s.d(this.mediaStreamsH265, webRTC.mediaStreamsH265);
        }

        public int hashCode() {
            Boolean bool = this.mediaStreams;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.iceRestart;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.twoWayAudio;
            int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.mediaStreamsH265;
            return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public String toString() {
            return "WebRTC(mediaStreams=" + this.mediaStreams + ", iceRestart=" + this.iceRestart + ", twoWayAudio=" + this.twoWayAudio + ", mediaStreamsH265=" + this.mediaStreamsH265 + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            Boolean bool = this.mediaStreams;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.iceRestart;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.twoWayAudio;
            if (bool3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Boolean bool4 = this.mediaStreamsH265;
            if (bool4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool4.booleanValue() ? 1 : 0);
            }
        }

        public WebRTC(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.mediaStreams = bool;
            this.iceRestart = bool2;
            this.twoWayAudio = bool3;
            this.mediaStreamsH265 = bool4;
        }
    }

    public /* synthetic */ ConsoleFeatures(int i10, WebRTC webRTC, R0 r02) {
        if ((i10 & 1) == 0) {
            this.webrtc = null;
        } else {
            this.webrtc = webRTC;
        }
    }

    public static final /* synthetic */ void a(ConsoleFeatures self, Yi.d output, Xi.f serialDesc) {
        if (!output.o(serialDesc, 0) && self.webrtc == null) {
            return;
        }
        output.t(serialDesc, 0, WebRTC.a.f53786a, self.webrtc);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConsoleFeatures) && AbstractC6492s.d(this.webrtc, ((ConsoleFeatures) other).webrtc);
    }

    public int hashCode() {
        WebRTC webRTC = this.webrtc;
        if (webRTC == null) {
            return 0;
        }
        return webRTC.hashCode();
    }

    public String toString() {
        return "ConsoleFeatures(webrtc=" + this.webrtc + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        WebRTC webRTC = this.webrtc;
        if (webRTC == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            webRTC.writeToParcel(dest, flags);
        }
    }

    public ConsoleFeatures(WebRTC webRTC) {
        this.webrtc = webRTC;
    }
}
