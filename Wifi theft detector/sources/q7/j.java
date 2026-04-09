package q7;

import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.d;
import q7.e;
import q7.i;

/* loaded from: classes3.dex */
public final class j {

    @NotNull
    public static final b Companion = new b(null);

    @NotNull
    private final e device;

    @Nullable
    private final d.h ext;
    private final int ordinalView;

    @Nullable
    private final i request;

    @Nullable
    private final d.j user;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.RtbToken", aVar, 5);
            pluginGeneratedSerialDescriptor.k("device", false);
            pluginGeneratedSerialDescriptor.k("user", true);
            pluginGeneratedSerialDescriptor.k("ext", true);
            pluginGeneratedSerialDescriptor.k(AdActivity.REQUEST_KEY_EXTRA, true);
            pluginGeneratedSerialDescriptor.k("ordinal_view", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            return new kotlinx.serialization.b[]{e.a.INSTANCE, x9.a.s(d.j.a.INSTANCE), x9.a.s(d.h.a.INSTANCE), x9.a.s(i.a.INSTANCE), r0.f22908a};
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public j deserialize(@NotNull y9.e decoder) {
            int i10;
            Object objN;
            Object objN2;
            Object objN3;
            int i11;
            Object objY;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            if (cVarB.p()) {
                objY = cVarB.y(descriptor2, 0, e.a.INSTANCE, null);
                objN = cVarB.n(descriptor2, 1, d.j.a.INSTANCE, null);
                objN2 = cVarB.n(descriptor2, 2, d.h.a.INSTANCE, null);
                objN3 = cVarB.n(descriptor2, 3, i.a.INSTANCE, null);
                i10 = 31;
                i11 = cVarB.i(descriptor2, 4);
            } else {
                boolean z10 = true;
                int i12 = 0;
                Object objY2 = null;
                Object objN4 = null;
                Object objN5 = null;
                Object objN6 = null;
                int i13 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objY2 = cVarB.y(descriptor2, 0, e.a.INSTANCE, objY2);
                        i13 |= 1;
                    } else if (iO == 1) {
                        objN4 = cVarB.n(descriptor2, 1, d.j.a.INSTANCE, objN4);
                        i13 |= 2;
                    } else if (iO == 2) {
                        objN5 = cVarB.n(descriptor2, 2, d.h.a.INSTANCE, objN5);
                        i13 |= 4;
                    } else if (iO == 3) {
                        objN6 = cVarB.n(descriptor2, 3, i.a.INSTANCE, objN6);
                        i13 |= 8;
                    } else {
                        if (iO != 4) {
                            throw new UnknownFieldException(iO);
                        }
                        i12 = cVarB.i(descriptor2, 4);
                        i13 |= 16;
                    }
                }
                i10 = i13;
                objN = objN4;
                objN2 = objN5;
                objN3 = objN6;
                i11 = i12;
                objY = objY2;
            }
            cVarB.c(descriptor2);
            return new j(i10, (e) objY, (d.j) objN, (d.h) objN2, (i) objN3, i11, (w1) null);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull j value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            j.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ j(int i10, e eVar, d.j jVar, d.h hVar, i iVar, @SerialName("ordinal_view") int i11, w1 w1Var) {
        if (17 != (i10 & 17)) {
            m1.a(i10, 17, a.INSTANCE.getDescriptor());
        }
        this.device = eVar;
        if ((i10 & 2) == 0) {
            this.user = null;
        } else {
            this.user = jVar;
        }
        if ((i10 & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = hVar;
        }
        if ((i10 & 8) == 0) {
            this.request = null;
        } else {
            this.request = iVar;
        }
        this.ordinalView = i11;
    }

    public static /* synthetic */ j copy$default(j jVar, e eVar, d.j jVar2, d.h hVar, i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = jVar.device;
        }
        if ((i11 & 2) != 0) {
            jVar2 = jVar.user;
        }
        if ((i11 & 4) != 0) {
            hVar = jVar.ext;
        }
        if ((i11 & 8) != 0) {
            iVar = jVar.request;
        }
        if ((i11 & 16) != 0) {
            i10 = jVar.ordinalView;
        }
        int i12 = i10;
        d.h hVar2 = hVar;
        return jVar.copy(eVar, jVar2, hVar2, iVar, i12);
    }

    @JvmStatic
    public static final void write$Self(@NotNull j self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        output.C(serialDesc, 0, e.a.INSTANCE, self.device);
        if (output.z(serialDesc, 1) || self.user != null) {
            output.i(serialDesc, 1, d.j.a.INSTANCE, self.user);
        }
        if (output.z(serialDesc, 2) || self.ext != null) {
            output.i(serialDesc, 2, d.h.a.INSTANCE, self.ext);
        }
        if (output.z(serialDesc, 3) || self.request != null) {
            output.i(serialDesc, 3, i.a.INSTANCE, self.request);
        }
        output.w(serialDesc, 4, self.ordinalView);
    }

    @NotNull
    public final e component1() {
        return this.device;
    }

    @Nullable
    public final d.j component2() {
        return this.user;
    }

    @Nullable
    public final d.h component3() {
        return this.ext;
    }

    @Nullable
    public final i component4() {
        return this.request;
    }

    public final int component5() {
        return this.ordinalView;
    }

    @NotNull
    public final j copy(@NotNull e device, @Nullable d.j jVar, @Nullable d.h hVar, @Nullable i iVar, int i10) {
        p.e(device, "device");
        return new j(device, jVar, hVar, iVar, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p.a(this.device, jVar.device) && p.a(this.user, jVar.user) && p.a(this.ext, jVar.ext) && p.a(this.request, jVar.request) && this.ordinalView == jVar.ordinalView;
    }

    @NotNull
    public final e getDevice() {
        return this.device;
    }

    @Nullable
    public final d.h getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    @Nullable
    public final i getRequest() {
        return this.request;
    }

    @Nullable
    public final d.j getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        d.j jVar = this.user;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        d.h hVar = this.ext;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.request;
        return ((iHashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.ordinalView;
    }

    @NotNull
    public String toString() {
        return "RtbToken(device=" + this.device + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ", ordinalView=" + this.ordinalView + ')';
    }

    public j(@NotNull e device, @Nullable d.j jVar, @Nullable d.h hVar, @Nullable i iVar, int i10) {
        p.e(device, "device");
        this.device = device;
        this.user = jVar;
        this.ext = hVar;
        this.request = iVar;
        this.ordinalView = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(e eVar, d.j jVar, d.h hVar, i iVar, int i10, int i11, kotlin.jvm.internal.i iVar2) {
        int i12;
        i iVar3;
        jVar = (i11 & 2) != 0 ? null : jVar;
        hVar = (i11 & 4) != 0 ? null : hVar;
        if ((i11 & 8) != 0) {
            i12 = i10;
            iVar3 = null;
        } else {
            i12 = i10;
            iVar3 = iVar;
        }
        this(eVar, jVar, hVar, iVar3, i12);
    }

    @SerialName("ordinal_view")
    public static /* synthetic */ void getOrdinalView$annotations() {
    }
}
