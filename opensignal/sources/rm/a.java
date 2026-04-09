package rm;

import com.staircase3.opensignal.models.NetworkUiState;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f21658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21660c;

    public a(NetworkUiState networkUiState) {
        this.f21658a = networkUiState.I;
        this.f21659b = networkUiState.H;
        this.f21660c = networkUiState.G;
    }

    public final boolean equals(Object obj) {
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.f21658a == this.f21658a && aVar.f21659b == this.f21659b && aVar.f21660c == this.f21660c;
    }
}
