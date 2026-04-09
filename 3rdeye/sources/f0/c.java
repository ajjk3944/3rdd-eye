package f0;

import A2.l;
import C.S;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import b0.C1811b;
import d0.InterfaceC4256C;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: VideoEncoderInfoWrapper.java */
/* loaded from: classes.dex */
public final class c implements InterfaceC4256C {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4256C f37800a;

    /* renamed from: b, reason: collision with root package name */
    public final Range<Integer> f37801b;

    /* renamed from: c, reason: collision with root package name */
    public final Range<Integer> f37802c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f37803d;

    public c(InterfaceC4256C interfaceC4256C) {
        HashSet hashSet = new HashSet();
        this.f37803d = hashSet;
        this.f37800a = interfaceC4256C;
        int iB = interfaceC4256C.b();
        this.f37801b = Range.create(Integer.valueOf(iB), Integer.valueOf(((int) Math.ceil(4096.0d / iB)) * iB));
        int iG = interfaceC4256C.g();
        this.f37802c = Range.create(Integer.valueOf(iG), Integer.valueOf(((int) Math.ceil(2160.0d / iG)) * iG));
        List<String> list = MediaCodecInfoReportIncorrectInfoQuirk.f15156a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f15156a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static InterfaceC4256C k(InterfaceC4256C interfaceC4256C, Size size) {
        if (!(interfaceC4256C instanceof c)) {
            if (C1811b.f17055a.e(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                interfaceC4256C = new c(interfaceC4256C);
            } else if (size != null && !interfaceC4256C.a(size.getWidth(), size.getHeight())) {
                S.g("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + interfaceC4256C.h() + "/" + interfaceC4256C.j());
                interfaceC4256C = new c(interfaceC4256C);
            }
        }
        if (size != null && (interfaceC4256C instanceof c)) {
            ((c) interfaceC4256C).f37803d.add(size);
        }
        return interfaceC4256C;
    }

    @Override // d0.InterfaceC4256C
    public final /* synthetic */ boolean a(int i, int i10) {
        return com.google.android.gms.measurement.internal.a.c(this, i, i10);
    }

    @Override // d0.InterfaceC4256C
    public final int b() {
        return this.f37800a.b();
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> c() {
        return this.f37800a.c();
    }

    @Override // d0.InterfaceC4256C
    public final boolean d() {
        return this.f37800a.d();
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> e(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range<Integer> range = this.f37802c;
        boolean zContains = range.contains((Range<Integer>) numValueOf);
        InterfaceC4256C interfaceC4256C = this.f37800a;
        l.k("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + interfaceC4256C.g(), zContains && i % interfaceC4256C.g() == 0);
        return this.f37801b;
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> f(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range<Integer> range = this.f37801b;
        boolean zContains = range.contains((Range<Integer>) numValueOf);
        InterfaceC4256C interfaceC4256C = this.f37800a;
        l.k("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + interfaceC4256C.b(), zContains && i % interfaceC4256C.b() == 0);
        return this.f37802c;
    }

    @Override // d0.InterfaceC4256C
    public final int g() {
        return this.f37800a.g();
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> h() {
        return this.f37801b;
    }

    @Override // d0.InterfaceC4256C
    public final boolean i(int i, int i10) {
        InterfaceC4256C interfaceC4256C = this.f37800a;
        if (interfaceC4256C.i(i, i10)) {
            return true;
        }
        Iterator it = this.f37803d.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i10) {
                return true;
            }
        }
        if (this.f37801b.contains((Range<Integer>) Integer.valueOf(i))) {
            return this.f37802c.contains((Range<Integer>) Integer.valueOf(i10)) && i % interfaceC4256C.b() == 0 && i10 % interfaceC4256C.g() == 0;
        }
        return false;
    }

    @Override // d0.InterfaceC4256C
    public final Range<Integer> j() {
        return this.f37802c;
    }
}
