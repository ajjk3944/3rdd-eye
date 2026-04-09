package o2;

import a5.d0;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import as.p;
import bf.s;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.h4;
import com.staircase3.opensignal.goldstar.widget.DateTimeView;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import com.staircase3.opensignal.goldstar.widget.TestStatusView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lq.b0;
import mq.l;
import n0.g2;
import n0.x0;
import o.e0;
import o.x;
import o5.z0;
import oh.u;
import org.json.JSONObject;
import p.l2;
import pb.g0;
import pb.j0;
import pb.n0;
import rr.m0;
import rr.n;
import rs.a0;
import ss.o;
import ss.t;
import ur.c0;
import ur.h0;
import ur.i0;
import ur.q0;
import ur.v;
import ur.z;
import w.m;
import w.q;
import x1.f0;
import x1.k;
import x1.u1;

/* loaded from: classes.dex */
public class g implements z0, x, bc.h, oh.c, g0, u, n, m, w.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18753a;

    /* renamed from: d, reason: collision with root package name */
    public Object f18754d;

    public /* synthetic */ g(int i10, Object obj) {
        this.f18753a = i10;
        this.f18754d = obj;
    }

    public static byte[] W(byte[] bArr, byte[] bArr2) {
        byte[] bArrG0 = l.g0(bArr2, 0, 16);
        byte[] bArrG02 = l.g0(bArr2, 16, bArr2.length);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrG0);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArrG02);
        br.l.d(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public static byte[] Z(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES/CBC/PKCS7Padding");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, secretKeySpec, secureRandom);
        byte[] bArr4 = new byte[bArr2.length + 16];
        System.arraycopy(bArr3, 0, bArr4, 0, 16);
        System.arraycopy(bArr2, 0, bArr4, 16, bArr2.length);
        byte[] bArrDoFinal = cipher.doFinal(bArr4);
        br.l.d(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    @Override // oh.c
    public long A() {
        return ((ya.m) this.f18754d).f26110c;
    }

    @Override // rr.n
    public Object B(z zVar, Object obj) throws IOException {
        ur.j jVarR;
        String str;
        StringBuilder sb2 = (StringBuilder) obj;
        ss.j jVar = (ss.j) this.f18754d;
        o oVar = jVar.f22246a;
        boolean z10 = zVar.f() == rr.g.ENUM_ENTRY;
        if (!jVar.r()) {
            jVar.y(sb2, zVar, null);
            List listK0 = zVar.K0();
            br.l.d(listK0, "klass.contextReceivers");
            jVar.C(sb2, listK0);
            if (!z10) {
                p pVarC = zVar.c();
                br.l.d(pVarC, "klass.visibility");
                jVar.h0(pVarC, sb2);
            }
            if ((zVar.f() != rr.g.INTERFACE || zVar.j() != rr.z.ABSTRACT) && (!zVar.f().isSingleton() || zVar.j() != rr.z.FINAL)) {
                rr.z zVarJ = zVar.j();
                br.l.d(zVarJ, "klass.modality");
                jVar.L(zVarJ, sb2, ss.j.v(zVar));
            }
            jVar.K(zVar, sb2);
            jVar.N(sb2, jVar.q().contains(ss.l.INNER) && zVar.m(), "inner");
            jVar.N(sb2, jVar.q().contains(ss.l.DATA) && zVar.P0(), "data");
            jVar.N(sb2, jVar.q().contains(ss.l.INLINE) && zVar.g(), "inline");
            jVar.N(sb2, jVar.q().contains(ss.l.VALUE) && zVar.k(), "value");
            jVar.N(sb2, jVar.q().contains(ss.l.FUN) && zVar.D(), "fun");
            if (zVar.w()) {
                str = "companion object";
            } else {
                switch (ss.d.f22231a[zVar.f().ordinal()]) {
                    case 1:
                        str = "class";
                        break;
                    case 2:
                        str = "interface";
                        break;
                    case 3:
                        str = "enum class";
                        break;
                    case 4:
                        str = "object";
                        break;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        str = "annotation class";
                        break;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "enum entry";
                        break;
                    default:
                        throw new bf.n();
                }
            }
            sb2.append(jVar.I(str));
        }
        if (ts.d.l(zVar)) {
            if (((Boolean) oVar.F.a(o.W[30], oVar)).booleanValue()) {
                if (jVar.r()) {
                    sb2.append("companion object");
                }
                ss.j.X(sb2);
                rr.l lVarO = zVar.o();
                if (lVarO != null) {
                    sb2.append("of ");
                    qs.g name = lVarO.getName();
                    br.l.d(name, "containingDeclaration.name");
                    sb2.append(jVar.O(name, false));
                }
            }
            if (jVar.u() || !br.l.a(zVar.getName(), qs.i.f21039b)) {
                if (!jVar.r()) {
                    ss.j.X(sb2);
                }
                qs.g name2 = zVar.getName();
                br.l.d(name2, "descriptor.name");
                sb2.append(jVar.O(name2, true));
            }
        } else {
            if (!jVar.r()) {
                ss.j.X(sb2);
            }
            jVar.P(zVar, sb2, true);
        }
        if (!z10) {
            List listS = zVar.s();
            br.l.d(listS, "klass.declaredTypeParameters");
            jVar.d0(sb2, listS, false);
            jVar.A(zVar, sb2);
            if (!zVar.f().isSingleton() && ((Boolean) oVar.f22258i.a(o.W[7], oVar)).booleanValue() && (jVarR = zVar.R()) != null) {
                sb2.append(" ");
                jVar.y(sb2, jVarR, null);
                ur.j jVar2 = jVarR;
                p pVarC2 = jVar2.c();
                br.l.d(pVarC2, "primaryConstructor.visibility");
                jVar.h0(pVarC2, sb2);
                sb2.append(jVar.I("constructor"));
                List listY = jVar2.Y();
                br.l.d(listY, "primaryConstructor.valueParameters");
                jVar.g0(sb2, listY, jVarR.G());
            }
            if (!((Boolean) oVar.f22270w.a(o.W[21], oVar)).booleanValue() && !or.h.E(zVar.q())) {
                Collection collectionQ = zVar.v().q();
                br.l.d(collectionQ, "klass.typeConstructor.supertypes");
                if (!collectionQ.isEmpty() && (collectionQ.size() != 1 || !or.h.x((ht.x) collectionQ.iterator().next()))) {
                    ss.j.X(sb2);
                    sb2.append(": ");
                    mq.o.w0(collectionQ, sb2, ", ", null, null, new ss.h(jVar, 2), 60);
                }
            }
            jVar.i0(sb2, listS);
        }
        return b0.f15562a;
    }

    @Override // rr.n
    public Object D(c0 c0Var, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        ss.j jVar = (ss.j) this.f18754d;
        jVar.getClass();
        jVar.T(c0Var.f23629y, "package-fragment", sb2);
        if (jVar.f22246a.n()) {
            sb2.append(" in ");
            jVar.P(c0Var.o(), sb2, false);
        }
        return b0.f15562a;
    }

    @Override // w.g0
    public w.l E(long j, w.l lVar, w.l lVar2, w.l lVar3) {
        return ((js.e) this.f18754d).E(j, lVar, lVar2, lVar3);
    }

    @Override // rr.n
    public Object F(i0 i0Var, Object obj) throws IOException {
        j0(i0Var, (StringBuilder) obj, "getter");
        return b0.f15562a;
    }

    @Override // oh.u
    public long G() {
        return ((androidx.media3.common.z0) this.f18754d).f1847y;
    }

    @Override // w.g0
    public void H() {
        ((js.e) this.f18754d).getClass();
    }

    @Override // rr.n
    public Object I(h0 h0Var, Object obj) throws IOException {
        br.l.e(h0Var, "descriptor");
        ss.j.n((ss.j) this.f18754d, h0Var, (StringBuilder) obj);
        return b0.f15562a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    @Override // rr.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object J(ur.j r20, java.lang.Object r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.g.J(ur.j, java.lang.Object):java.lang.Object");
    }

    @Override // pb.g0
    public void K(j0 j0Var, long j, long j7) {
        boolean z10;
        bb.f fVar = (bb.f) this.f18754d;
        synchronized (qb.b.f20765h) {
            z10 = qb.b.f20766i;
        }
        if (z10) {
            fVar.a();
        } else {
            fVar.f2519a.onUtcTimestampResolutionError(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // w.g0
    public long L(w.l lVar, w.l lVar2, w.l lVar3) {
        return ((js.e) this.f18754d).L(lVar, lVar2, lVar3);
    }

    @Override // oh.u
    public boolean M() {
        return ((androidx.media3.common.z0) this.f18754d).a();
    }

    @Override // oh.c
    public long N() {
        return ((ya.m) this.f18754d).f26109b;
    }

    @Override // rr.n
    public Object O(ur.i iVar, Object obj) {
        ((ss.j) this.f18754d).b0(iVar, (StringBuilder) obj, true);
        return b0.f15562a;
    }

    @Override // oh.u
    public long P() {
        return d0.P(((androidx.media3.common.z0) this.f18754d).I);
    }

    @Override // o.x
    public boolean Q(o.m mVar) {
        androidx.appcompat.widget.b bVar = (androidx.appcompat.widget.b) this.f18754d;
        if (mVar == bVar.f1045g) {
            return false;
        }
        bVar.U = ((e0) mVar).A.f18638a;
        x xVar = bVar.f1047x;
        if (xVar != null) {
            return xVar.Q(mVar);
        }
        return false;
    }

    @Override // rr.n
    public Object R(ur.x xVar, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        ss.j jVar = (ss.j) this.f18754d;
        jVar.getClass();
        jVar.T(xVar.f23679x, "package", sb2);
        if (jVar.f22246a.n()) {
            sb2.append(" in context of ");
            jVar.P(xVar.f23678r, sb2, false);
        }
        return b0.f15562a;
    }

    @Override // rr.n
    public Object S(ft.u uVar, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        ss.j jVar = (ss.j) this.f18754d;
        jVar.getClass();
        jVar.y(sb2, uVar, null);
        p pVar = uVar.f9119y;
        br.l.d(pVar, "typeAlias.visibility");
        jVar.h0(pVar, sb2);
        jVar.K(uVar, sb2);
        sb2.append(jVar.I("typealias"));
        sb2.append(" ");
        jVar.P(uVar, sb2, true);
        jVar.d0(sb2, uVar.s(), false);
        jVar.A(uVar, sb2);
        sb2.append(" = ");
        sb2.append(jVar.Y(uVar.x1()));
        return b0.f15562a;
    }

    public void T(f0 f0Var) {
        if (!f0Var.S()) {
            u1.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((u1) this.f18754d).add(f0Var);
    }

    public v3.c V(int i10) {
        return null;
    }

    public String X(String str) {
        byte[] bArr;
        br.l.e(str, "encryptedApiKey");
        ((df.c) this.f18754d).getClass();
        byte[] bArrN = cg.e.n("j70UUkwW+JEfWjpZJRWun8WQxLBoXVAR67p+D5zddDDJnK7qE0RlUbiJ079tWcKEqN39xeKw9Zmq+k8svN97Og==");
        int length = bArrN.length / 2;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr2[i11] = bArrN[i12];
            bArr3[i11] = bArrN[i12 + 1];
        }
        if (length == 0 || length == 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[length];
            Iterator it = new hr.d(0, length - 1, 1).iterator();
            while (true) {
                hr.c cVar = (hr.c) it;
                if (!cVar.f10868g) {
                    break;
                }
                cVar.nextInt();
                int i13 = i10 + 1;
                if (i10 < 0) {
                    e5.Q();
                    throw null;
                }
                bArr[i10] = (byte) (bArr2[i10] ^ bArr3[i10 % length]);
                i10 = i13;
            }
        }
        Charset charset = tt.a.f22975a;
        return new String(W(cg.e.n(new String(bArr, charset)), cg.e.n(str)), charset);
    }

    public void Y(rs.e eVar) {
        if (!eVar.g()) {
            if (!(eVar instanceof a0)) {
                String strValueOf = String.valueOf(eVar.getClass());
                throw new IllegalArgumentException(w.g.j(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            a0 a0Var = (a0) eVar;
            Y(a0Var.f21729g);
            Y(a0Var.f21730r);
            return;
        }
        int size = eVar.size();
        int[] iArr = a0.D;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i10 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f18754d;
        if (stack.isEmpty() || ((rs.e) stack.peek()).size() >= i10) {
            stack.push(eVar);
            return;
        }
        int i11 = iArr[iBinarySearch];
        rs.e a0Var2 = (rs.e) stack.pop();
        while (!stack.isEmpty() && ((rs.e) stack.peek()).size() < i11) {
            a0Var2 = new a0((rs.e) stack.pop(), a0Var2);
        }
        a0 a0Var3 = new a0(a0Var2, eVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = a0.D;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, a0Var3.f21728d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((rs.e) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                a0Var3 = new a0((rs.e) stack.pop(), a0Var3);
            }
        }
        stack.push(a0Var3);
    }

    @Override // oh.u
    public long a() {
        return d0.P(((androidx.media3.common.z0) this.f18754d).J);
    }

    public v3.c a0(int i10) {
        return null;
    }

    @Override // oh.c
    public oh.j b() {
        Uri uri = (Uri) ((ya.m) this.f18754d).f26108a.f17422f;
        br.l.d(uri, "uri");
        return new oh.j(uri);
    }

    public Integer b0(int i10) {
        al.c cVar = (al.c) this.f18754d;
        if (cVar == null) {
            br.l.l("binding");
            throw null;
        }
        Resources resources = ((ConstraintLayout) cVar.f820b).getResources();
        if (resources != null) {
            return Integer.valueOf(resources.getColor(i10));
        }
        return null;
    }

    @Override // o.x
    public void c(o.m mVar, boolean z10) {
        if (mVar instanceof e0) {
            ((e0) mVar).f18589z.k().c(false);
        }
        x xVar = ((androidx.appcompat.widget.b) this.f18754d).f1047x;
        if (xVar != null) {
            xVar.c(mVar, z10);
        }
    }

    public g2 c0() {
        j4.h hVarA = j4.h.a();
        if (hVarA.b() == 1) {
            return new a5.d(2, true);
        }
        x0 x0VarF = androidx.compose.runtime.c.f(Boolean.FALSE);
        hVarA.g(new f(x0VarF, this));
        return x0VarF;
    }

    @Override // o5.z0
    public long d() {
        long jMin = Long.MAX_VALUE;
        for (z0 z0Var : (z0[]) this.f18754d) {
            long jD = z0Var.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    public qf.b d0(JSONObject jSONObject) {
        qf.d fVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            io.sentry.android.core.e0.c("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            fVar = new io.sentry.hints.i(22);
        } else {
            fVar = new sm.f(22);
        }
        return fVar.l((ee.f) this.f18754d, jSONObject);
    }

    public boolean e0(int i10, int i11, Bundle bundle) {
        return false;
    }

    public boolean f0(f0 f0Var) {
        if (!f0Var.S()) {
            u1.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((u1) this.f18754d).remove(f0Var);
    }

    public void g0(boolean z10) {
        try {
            vc.d dVar = (vc.d) this.f18754d;
            Parcel parcelR = dVar.R();
            int i10 = qc.l.f20842a;
            parcelR.writeInt(z10 ? 1 : 0);
            dVar.S(parcelR, 3);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    @Override // w.m
    public q get(int i10) {
        return ((ee.z[]) this.f18754d)[i10];
    }

    @Override // rr.n
    public /* bridge */ /* synthetic */ Object h(rr.u uVar, Object obj) throws IOException {
        i0(uVar, (StringBuilder) obj);
        return b0.f15562a;
    }

    public void h0(String str, String str2) {
        br.l.e(str, "download");
        br.l.e(str2, "unit");
        al.c cVar = (al.c) this.f18754d;
        if (cVar == null) {
            br.l.l("binding");
            throw null;
        }
        ((TextView) cVar.f827i).setText(str);
        if (cVar != null) {
            ((TextView) cVar.f826h).setText(str2);
        } else {
            br.l.l("binding");
            throw null;
        }
    }

    @Override // o5.z0
    public boolean i(long j) {
        boolean zI;
        boolean z10 = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z10;
            }
            zI = false;
            for (z0 z0Var : (z0[]) this.f18754d) {
                long jD2 = z0Var.d();
                boolean z11 = jD2 != Long.MIN_VALUE && jD2 <= j;
                if (jD2 == jD || z11) {
                    zI |= z0Var.i(j);
                }
            }
            z10 |= zI;
        } while (zI);
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i0(rr.u r12, java.lang.StringBuilder r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.g.i0(rr.u, java.lang.StringBuilder):void");
    }

    @Override // o5.z0
    public boolean isLoading() {
        for (z0 z0Var : (z0[]) this.f18754d) {
            if (z0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // rr.n
    public Object j(v vVar, Object obj) {
        ((StringBuilder) obj).append(vVar.getName());
        return b0.f15562a;
    }

    public void j0(ur.g0 g0Var, StringBuilder sb2, String str) throws IOException {
        ss.j jVar = (ss.j) this.f18754d;
        o oVar = jVar.f22246a;
        int i10 = ss.f.f22233a[((t) oVar.G.a(o.W[31], oVar)).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            i0(g0Var, sb2);
        } else {
            jVar.K(g0Var, sb2);
            sb2.append(str.concat(" for "));
            m0 m0VarV1 = g0Var.v1();
            br.l.d(m0VarV1, "descriptor.correspondingProperty");
            ss.j.n(jVar, m0VarV1, sb2);
        }
    }

    @Override // o5.z0
    public long m() {
        long jMin = Long.MAX_VALUE;
        for (z0 z0Var : (z0[]) this.f18754d) {
            long jM = z0Var.m();
            if (jM != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jM);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // w.g0
    public w.l n(w.l lVar, w.l lVar2, w.l lVar3) {
        return ((js.e) this.f18754d).n(lVar, lVar2, lVar3);
    }

    @Override // o5.z0
    public void o(long j) {
        for (z0 z0Var : (z0[]) this.f18754d) {
            z0Var.o(j);
        }
    }

    @Override // pb.g0
    public pb.h0 q(j0 j0Var, long j, long j7, IOException iOException, int i10) {
        ((bb.f) this.f18754d).f2519a.onUtcTimestampResolutionError(iOException);
        return n0.f20391x;
    }

    @Override // oh.u
    public long r() {
        return d0.u(((androidx.media3.common.z0) this.f18754d).B);
    }

    @Override // rr.n
    public Object s(q0 q0Var, Object obj) {
        ((ss.j) this.f18754d).f0(q0Var, true, (StringBuilder) obj, true);
        return b0.f15562a;
    }

    public String toString() {
        switch (this.f18753a) {
            case 27:
                return ((u1) this.f18754d).toString();
            default:
                return super.toString();
        }
    }

    @Override // rr.n
    public Object u(ur.j0 j0Var, Object obj) throws IOException {
        j0(j0Var, (StringBuilder) obj, "setter");
        return b0.f15562a;
    }

    @Override // w.g0
    public w.l v(long j, w.l lVar, w.l lVar2, w.l lVar3) {
        return ((js.e) this.f18754d).v(j, lVar, lVar2, lVar3);
    }

    @Override // oh.c
    public long w() {
        return ((ya.m) this.f18754d).f26111d;
    }

    @Override // bc.h
    public void y(Object obj) {
        bc.g gVar;
        h4 h4Var = ((pc.g) this.f18754d).f20447e;
        synchronized (h4Var) {
            h4Var.f5055a = false;
            gVar = (bc.g) ((zb.g) h4Var.f5056d).f26826b;
        }
        if (gVar != null) {
            ((pc.a) h4Var.f5057g).b(gVar, 2441);
        }
    }

    @Override // rr.n
    public Object z(Object obj, ur.a0 a0Var) {
        ((ss.j) this.f18754d).P(a0Var, (StringBuilder) obj, true);
        return b0.f15562a;
    }

    public g(bm.d dVar) {
        this.f18753a = 13;
        br.l.e(dVar, "speedTestResultDao");
        this.f18754d = dVar;
    }

    public g(LayoutInflater layoutInflater) {
        this.f18753a = 4;
        br.l.e(layoutInflater, "layoutInflater");
        View viewInflate = layoutInflater.inflate(qk.i.widget_speed_result, (ViewGroup) null, false);
        int i10 = qk.h.DataCollectionSeparator;
        View viewA = b4.A(viewInflate, i10);
        if (viewA != null) {
            i10 = qk.h.dateTimeView;
            DateTimeView dateTimeView = (DateTimeView) b4.A(viewInflate, i10);
            if (dateTimeView != null) {
                i10 = qk.h.downloadLabel;
                if (((TextView) b4.A(viewInflate, i10)) != null) {
                    i10 = qk.h.downloadUnitView;
                    TextView textView = (TextView) b4.A(viewInflate, i10);
                    if (textView != null) {
                        i10 = qk.h.downloadValueView;
                        TextView textView2 = (TextView) b4.A(viewInflate, i10);
                        if (textView2 != null) {
                            i10 = qk.h.guideline35;
                            if (((Guideline) b4.A(viewInflate, i10)) != null) {
                                i10 = qk.h.guideline70;
                                if (((Guideline) b4.A(viewInflate, i10)) != null) {
                                    i10 = qk.h.guidelineLatency;
                                    if (((Guideline) b4.A(viewInflate, i10)) != null) {
                                        i10 = qk.h.latencyLabel;
                                        if (((TextView) b4.A(viewInflate, i10)) != null) {
                                            i10 = qk.h.latencyValueView;
                                            TextView textView3 = (TextView) b4.A(viewInflate, i10);
                                            if (textView3 != null) {
                                                i10 = qk.h.networkInfoView;
                                                NetworkInfoView networkInfoView = (NetworkInfoView) b4.A(viewInflate, i10);
                                                if (networkInfoView != null) {
                                                    i10 = qk.h.testStatusView;
                                                    TestStatusView testStatusView = (TestStatusView) b4.A(viewInflate, i10);
                                                    if (testStatusView != null) {
                                                        i10 = qk.h.uploadLabel;
                                                        if (((TextView) b4.A(viewInflate, i10)) != null) {
                                                            i10 = qk.h.uploadUnitView;
                                                            TextView textView4 = (TextView) b4.A(viewInflate, i10);
                                                            if (textView4 != null) {
                                                                i10 = qk.h.uploadValueView;
                                                                TextView textView5 = (TextView) b4.A(viewInflate, i10);
                                                                if (textView5 != null) {
                                                                    this.f18754d = new al.c((ConstraintLayout) viewInflate, viewA, dateTimeView, textView, textView2, textView3, networkInfoView, testStatusView, textView4, textView5);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public g(cg.e eVar, df.c cVar) {
        this.f18753a = 8;
        br.l.e(cVar, "masterKey");
        this.f18754d = cVar;
        Charset.forName("UTF-8");
    }

    public g(ya.m mVar) {
        this.f18753a = 7;
        br.l.e(mVar, "loadEventInfoDelegate");
        this.f18754d = mVar;
    }

    public g(s sVar) {
        this.f18753a = 17;
        this.f18754d = new AtomicReference();
        sVar.a(new s9.g(4, this));
    }

    public g(int i10) {
        this.f18753a = i10;
        switch (i10) {
            case 15:
                this.f18754d = new Stack();
                break;
            case 21:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f18754d = new v3.e(this);
                    break;
                } else {
                    this.f18754d = new v3.d(this);
                    break;
                }
            case 27:
                this.f18754d = new u1(k.f24870a);
                break;
        }
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f18753a = 24;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f18754d = new w3.e(uri, clipDescription, uri2);
        } else {
            this.f18754d = new qm.c(uri, clipDescription, uri2, 11);
        }
    }

    public g(w.l lVar, int i10) {
        m l2Var;
        this.f18753a = i10;
        switch (i10) {
            case 23:
                int i11 = w.f0.f24125a;
                if (lVar != null) {
                    l2Var = new g(lVar, 22);
                } else {
                    l2Var = new l2(19);
                }
                this.f18754d = new js.e(l2Var);
                break;
            default:
                int iB = lVar.b();
                ee.z[] zVarArr = new ee.z[iB];
                for (int i12 = 0; i12 < iB; i12++) {
                    zVarArr[i12] = new ee.z(lVar.a(i12));
                }
                this.f18754d = zVarArr;
                break;
        }
    }

    public void U(int i10, v3.c cVar, String str, Bundle bundle) {
    }

    @Override // pb.g0
    public void x(j0 j0Var, long j, long j7, boolean z10) {
    }
}
