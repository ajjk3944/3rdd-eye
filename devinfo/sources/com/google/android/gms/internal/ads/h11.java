package com.google.android.gms.internal.ads;

import j$.util.Base64;
import j$.util.Optional;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h11 {

    /* renamed from: a, reason: collision with root package name */
    public Optional f11682a;

    /* renamed from: b, reason: collision with root package name */
    public Optional f11683b;

    public final boolean a(eg egVar) throws GeneralSecurityException {
        byte[] bArrY = egVar.A().B().B().y();
        byte[] bArrY2 = egVar.A().D().y();
        try {
            try {
                if (this.f11682a == null && this.f11683b == null) {
                    try {
                        ok1.a();
                        av0 av0VarB = yo0.b(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=")));
                        ee1 ee1Var = ee1.f10769c;
                        this.f11682a = Optional.of((u91) av0VarB.A(ee1Var, u91.class));
                        this.f11683b = Optional.of((u91) yo0.b(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).A(ee1Var, u91.class));
                    } catch (Exception e2) {
                        throw new GeneralSecurityException("Failed to verify program", e2);
                    }
                }
                this.f11682a.isPresent();
                ((u91) this.f11682a.get()).a(bArrY, bArrY2);
                return true;
            } catch (GeneralSecurityException unused) {
                this.f11683b.isPresent();
                ((u91) this.f11683b.get()).a(bArrY, bArrY2);
                return true;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
