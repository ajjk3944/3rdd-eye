package G3;

import A2.C0117e;
import R.C0194v;
import R.InterfaceC0191s;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.lefan.signal.db.MacDataBaseRoom;
import com.lefan.signal.db.SquatterRoom;
import com.lefan.signal.network.webSpeed.WebSpeedRoom;
import e3.AbstractC2303a;
import h.AbstractActivityC2349g;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import k0.K;
import n4.C2689a;
import o4.C2762a;
import o4.C2765d;
import x3.AbstractC2993B;

/* renamed from: G3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0152f implements A0.f, A1.h, A1.g, G0.a, I1.a, InterfaceC0191s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1558a;

    public /* synthetic */ C0152f(int i) {
        this.f1558a = i;
    }

    public static RectF b(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f18466S || !(view instanceof L3.i)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        L3.i iVar = (L3.i) view;
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int iE = (int) AbstractC2993B.e(iVar.getContext(), 24);
        if (contentWidth < iE) {
            contentWidth = iE;
        }
        int right = (iVar.getRight() + iVar.getLeft()) / 2;
        int bottom = (iVar.getBottom() + iVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static Path o(float f2, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(f2, f5);
        path.lineTo(f6, f7);
        return path;
    }

    /* JADX WARN: Finally extract failed */
    public static List p(String str) {
        Object objB;
        g4.m mVar = new g4.m();
        C2689a c2689a = new C2689a(new S4.l().f22328b);
        C2762a c2762a = new C2762a(new StringReader(str));
        c2762a.f22701C = 2;
        boolean z6 = true;
        c2762a.f22701C = 1;
        try {
            try {
                try {
                    c2762a.B();
                    z6 = false;
                    g4.z zVarB = mVar.b(c2689a);
                    Class cls = c2689a.f22327a;
                    objB = zVarB.b(c2762a);
                    Class clsL = i4.i.l(cls);
                    if (objB != null && !clsL.isInstance(objB)) {
                        throw new ClassCastException("Type adapter '" + zVarB + "' returned wrong type; requested " + cls + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    c2762a.f22701C = 2;
                } catch (IOException e6) {
                    throw new g4.p(e6);
                } catch (AssertionError e7) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e7.getMessage(), e7);
                }
            } catch (EOFException e8) {
                if (!z6) {
                    throw new g4.p(e8);
                }
                c2762a.f22701C = 2;
                objB = null;
            } catch (IllegalStateException e9) {
                throw new g4.p(e9);
            }
            if (objB != null) {
                try {
                    if (c2762a.B() != 10) {
                        throw new g4.p("JSON document was not fully consumed.");
                    }
                } catch (C2765d e10) {
                    throw new g4.p(e10);
                } catch (IOException e11) {
                    throw new g4.p(e11);
                }
            }
            q5.i.d(objB, "fromJson(...)");
            return (List) objB;
        } catch (Throwable th) {
            c2762a.f22701C = 2;
            throw th;
        }
    }

    @Override // A0.f
    public void c() {
        switch (this.f1558a) {
            case 2:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // A0.f
    public void d(int i, Object obj) {
        String str;
        switch (this.f1558a) {
            case 2:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public float e(float f2) {
        return 1.0f;
    }

    @Override // A1.h
    public void f(A1.j jVar) {
        jVar.j();
    }

    @Override // I1.a
    public Object h() {
        return new ArrayList();
    }

    public boolean i() {
        return this instanceof C0153g;
    }

    @Override // G0.a
    public G0.b j(A1.s sVar) {
        return new H0.h((Context) sVar.f123b, (String) sVar.f124c, (C0.s) sVar.f125d, sVar.f122a);
    }

    public void k(float f2, float f5, float f6, y yVar) {
        yVar.c(f2, 0.0f);
    }

    public MacDataBaseRoom l(Context context) {
        MacDataBaseRoom macDataBaseRoom;
        MacDataBaseRoom macDataBaseRoom2 = MacDataBaseRoom.f18840l;
        if (macDataBaseRoom2 != null) {
            return macDataBaseRoom2;
        }
        synchronized (this) {
            macDataBaseRoom = MacDataBaseRoom.f18840l;
            if (macDataBaseRoom == null) {
                Context applicationContext = context.getApplicationContext();
                q5.i.d(applicationContext, "getApplicationContext(...)");
                C0.o oVarH = a4.t.h(applicationContext, MacDataBaseRoom.class, "mac_device2.db");
                oVarH.f1086r = "database/mac_device2.db";
                oVarH.c();
                oVarH.f1078j = true;
                macDataBaseRoom = (MacDataBaseRoom) oVarH.b();
                MacDataBaseRoom.f18840l = macDataBaseRoom;
            }
        }
        return macDataBaseRoom;
    }

    public SquatterRoom m(Context context) {
        SquatterRoom squatterRoom;
        SquatterRoom squatterRoom2 = SquatterRoom.f18843l;
        if (squatterRoom2 != null) {
            return squatterRoom2;
        }
        synchronized (this) {
            squatterRoom = SquatterRoom.f18843l;
            if (squatterRoom == null) {
                Context applicationContext = context.getApplicationContext();
                q5.i.d(applicationContext, "getApplicationContext(...)");
                C0.o oVarH = a4.t.h(applicationContext, SquatterRoom.class, "my_squatter.db");
                oVarH.c();
                oVarH.f1078j = true;
                squatterRoom = (SquatterRoom) oVarH.b();
                SquatterRoom.f18843l = squatterRoom;
            }
        }
        return squatterRoom;
    }

    public WebSpeedRoom n(Context context) {
        WebSpeedRoom webSpeedRoom;
        WebSpeedRoom webSpeedRoom2 = WebSpeedRoom.f18853l;
        if (webSpeedRoom2 != null) {
            return webSpeedRoom2;
        }
        synchronized (this) {
            webSpeedRoom = WebSpeedRoom.f18853l;
            if (webSpeedRoom == null) {
                Context applicationContext = context.getApplicationContext();
                q5.i.d(applicationContext, "getApplicationContext(...)");
                C0.o oVarH = a4.t.h(applicationContext, WebSpeedRoom.class, "web_speed.db");
                oVarH.c();
                oVarH.f1078j = true;
                webSpeedRoom = (WebSpeedRoom) oVarH.b();
                WebSpeedRoom.f18853l = webSpeedRoom;
            }
        }
        return webSpeedRoom;
    }

    public void t(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        RectF rectFB = b(tabLayout, view);
        RectF rectFB2 = b(tabLayout, view2);
        drawable.setBounds(AbstractC2303a.c(f2, (int) rectFB.left, (int) rectFB2.left), drawable.getBounds().top, AbstractC2303a.c(f2, (int) rectFB.right, (int) rectFB2.right), drawable.getBounds().bottom);
    }

    public C0152f(View view) {
        this.f1558a = 28;
        if (Build.VERSION.SDK_INT >= 30) {
            new C0194v(12, view).f3364c = view;
        } else {
            new C0117e(12, view);
        }
    }

    public C0152f(V2.h hVar, K k6) {
        this.f1558a = 10;
    }

    private final void q() {
    }

    private final void s(Object obj) {
    }

    @Override // A1.g
    public void a(AbstractActivityC2349g abstractActivityC2349g) {
    }

    @Override // A1.h
    public void g(A1.j jVar) {
    }

    private final void r(int i, Object obj) {
    }

    @Override // R.InterfaceC0191s
    public void onScrollLimit(int i, int i3, int i6, boolean z6) {
    }

    @Override // R.InterfaceC0191s
    public void onScrollProgress(int i, int i3, int i6, int i7) {
    }
}
