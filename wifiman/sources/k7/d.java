package k7;

import android.content.Context;
import android.graphics.PointF;
import android.media.Image;
import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.exceptions.NotYetAvailableException;
import gg.i;
import gg.y;
import java.util.ArrayList;
import java.util.List;
import k7.d;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import m9.C6783c;

/* loaded from: classes3.dex */
public final class d implements e7.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f51258a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.c f51259b;

    /* renamed from: c, reason: collision with root package name */
    private final y f51260c;

    /* renamed from: d, reason: collision with root package name */
    private Long f51261d;

    /* renamed from: e, reason: collision with root package name */
    private Frame f51262e;

    /* renamed from: f, reason: collision with root package name */
    private final D7.d f51263f;

    /* renamed from: g, reason: collision with root package name */
    private final D7.b f51264g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f51265h;

    /* renamed from: i, reason: collision with root package name */
    private long f51266i;

    /* renamed from: j, reason: collision with root package name */
    private final i f51267j;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Image f51268a;

        /* renamed from: b, reason: collision with root package name */
        private final int f51269b;

        public a(Image image, int i10) {
            AbstractC6492s.i(image, "image");
            this.f51268a = image;
            this.f51269b = i10;
        }

        public final Image a() {
            return this.f51268a;
        }

        public final int b() {
            return this.f51269b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f51268a, aVar.f51268a) && this.f51269b == aVar.f51269b;
        }

        public int hashCode() {
            return (this.f51268a.hashCode() * 31) + Integer.hashCode(this.f51269b);
        }

        public String toString() {
            return "Data(image=" + this.f51268a + ", orientationDegrees=" + this.f51269b + ")";
        }
    }

    static final class b implements n {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(d dVar, Image image) {
            dVar.f51261d = Long.valueOf(System.currentTimeMillis());
            image.close();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(a aVar) {
            Pose poseA;
            final Image imageA = aVar.a();
            List<D7.c> listA = d.this.f51263f.a(imageA, aVar.b());
            d dVar = d.this;
            ArrayList arrayList = new ArrayList();
            for (D7.c cVar : listA) {
                Frame frame = dVar.f51262e;
                C6399b c6399b = (frame == null || (poseA = dVar.f51264g.a(cVar, frame)) == null) ? null : new C6399b(cVar.b(), cVar.a(), new PointF(-poseA.tx(), poseA.tz()));
                if (c6399b != null) {
                    arrayList.add(c6399b);
                }
            }
            i iVarB = Ag.b.b(arrayList);
            final d dVar2 = d.this;
            return iVarB.Z(new InterfaceC6464a() { // from class: k7.e
                @Override // kg.InterfaceC6464a
                public final void run() {
                    d.b.c(dVar2, imageA);
                }
            });
        }
    }

    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            d.this.j(true);
        }
    }

    public d(Context context, float f10, long j10) {
        AbstractC6492s.i(context, "context");
        this.f51258a = j10;
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f51259b = cVarJ2;
        y yVarH = C6783c.f53633a.h("FloorplanObjectDetectionScheduler");
        this.f51260c = yVarH;
        this.f51261d = 0L;
        this.f51263f = new D7.d(context, "model.tflite", f10);
        this.f51264g = new D7.a();
        i iVarI2 = cVarJ2.X0(yVarH).p0(new b()).g0(new c()).Z(new InterfaceC6464a() { // from class: k7.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                d.h(this.f51257a);
            }
        }).h1().i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f51267j = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(d dVar) {
        dVar.j(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean z10) {
        this.f51265h = z10;
        Z7.b.h("Floorplan object detection enabled " + z10, null, 2, null);
    }

    @Override // e7.d
    public void a(Frame frame, int i10) {
        Long l10;
        AbstractC6492s.i(frame, "frame");
        this.f51262e = frame;
        this.f51266i = System.currentTimeMillis();
        if (!this.f51265h || (l10 = this.f51261d) == null) {
            return;
        }
        if (this.f51266i > l10.longValue() + this.f51258a) {
            try {
                Image imageAcquireCameraImage = frame.acquireCameraImage();
                AbstractC6492s.h(imageAcquireCameraImage, "acquireCameraImage(...)");
                this.f51261d = null;
                this.f51259b.h(new a(imageAcquireCameraImage, i10));
            } catch (NotYetAvailableException unused) {
                this.f51261d = 0L;
            }
        }
    }

    public i i() {
        return this.f51267j;
    }
}
