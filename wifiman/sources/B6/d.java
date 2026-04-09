package b6;

import android.graphics.Path;
import android.graphics.RectF;
import h6.C5953a;
import j6.InterfaceC6255b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q6.AbstractC7430a;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public final class d implements C5953a.C1790a.InterfaceC1791a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f32958b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final float f32959a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(float f10) {
        this.f32959a = f10;
    }

    @Override // h6.C5953a.C1790a.InterfaceC1791a
    public void a(Path path, float f10, float f11, float f12, float f13, InterfaceC6255b segmentProperties, RectF bounds) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(segmentProperties, "segmentProperties");
        AbstractC6492s.i(bounds, "bounds");
        AbstractC7430a.a(path, f10, f11, f12, f13, segmentProperties.e() * this.f32959a * AbstractC7978m.f((Math.abs(f13 - f11) / bounds.bottom) * 4, 1.0f));
    }

    public /* synthetic */ d(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10);
    }
}
