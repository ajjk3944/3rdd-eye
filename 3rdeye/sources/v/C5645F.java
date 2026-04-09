package v;

import C.C0634v;
import android.content.Context;
import android.media.CamcorderProfile;
import java.util.HashMap;
import java.util.Set;
import w.C5704r;

/* compiled from: Camera2DeviceSurfaceManager.java */
/* renamed from: v.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5645F implements androidx.camera.core.impl.G {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f46613a;

    /* renamed from: b, reason: collision with root package name */
    public final a f46614b;

    /* compiled from: Camera2DeviceSurfaceManager.java */
    /* renamed from: v.F$a */
    public class a implements InterfaceC5649d {
        @Override // v.InterfaceC5649d
        public final CamcorderProfile a(int i, int i10) {
            return CamcorderProfile.get(i, i10);
        }

        @Override // v.InterfaceC5649d
        public final boolean c(int i, int i10) {
            return CamcorderProfile.hasProfile(i, i10);
        }
    }

    public C5645F(Context context, Object obj, Set<String> set) throws C0634v {
        a aVar = new a();
        this.f46613a = new HashMap();
        this.f46614b = aVar;
        C5704r c5704rA = obj instanceof C5704r ? (C5704r) obj : C5704r.a(context, G.m.a());
        context.getClass();
        for (String str : set) {
            this.f46613a.put(str, new n0(context, str, c5704rA, this.f46614b));
        }
    }
}
