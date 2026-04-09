package Y4;

import c5.C0412i;
import com.lefan.signal.ui.wifi.TraceRouteActivity;
import h5.InterfaceC2370d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z5.InterfaceC3044u;

/* renamed from: Y4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237q extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TraceRouteActivity f4491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237q(TraceRouteActivity traceRouteActivity, String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4491e = traceRouteActivity;
        this.f4492f = str;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        C0237q c0237q = (C0237q) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj);
        C0412i c0412i = C0412i.f5929a;
        c0237q.l(c0412i);
        return c0412i;
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C0237q(this.f4491e, this.f4492f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        String strGroup;
        R2.a.H(obj);
        com.lefan.signal.tracroute.g gVar = this.f4491e.f19384S;
        gVar.getClass();
        String str = this.f4492f;
        q5.i.e(str, "host");
        gVar.f18874d = 0;
        Pattern pattern = gVar.f18873c;
        gVar.f18875e = false;
        int i = 1;
        while (!gVar.f18875e && i < 30) {
            try {
                String str2 = "";
                gVar.f18876f = Runtime.getRuntime().exec("ping -c 1 -t " + i + " " + str);
                Process process = gVar.f18876f;
                q5.i.b(process);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    str2 = str2 + ((Object) line);
                }
                Process process2 = gVar.f18876f;
                q5.i.b(process2);
                process2.waitFor();
                bufferedReader.close();
                Process process3 = gVar.f18876f;
                if (process3 != null) {
                    process3.destroy();
                }
                Matcher matcher = gVar.f18871a.matcher(str2);
                if (matcher.find()) {
                    String strGroup2 = matcher.group();
                    q5.i.b(strGroup2);
                    Matcher matcher2 = gVar.f18878h.matcher(strGroup2);
                    if (matcher2.find()) {
                        strGroup = matcher2.group();
                        q5.i.d(strGroup, "group(...)");
                    } else {
                        strGroup = strGroup2;
                    }
                    String strA = com.lefan.signal.tracroute.g.a(strGroup);
                    if (strA.length() == 0) {
                        TraceRouteActivity traceRouteActivity = gVar.f18877g;
                        if (traceRouteActivity != null) {
                            traceRouteActivity.C(new com.lefan.signal.tracroute.f("unknown host or network error", "0", 0, 0, false));
                        }
                        gVar.f18875e = true;
                    } else {
                        Matcher matcher3 = pattern.matcher(strA);
                        if (matcher3.find()) {
                            String strGroup3 = matcher3.group();
                            int i3 = gVar.f18874d + 1;
                            gVar.f18874d = i3;
                            TraceRouteActivity traceRouteActivity2 = gVar.f18877g;
                            if (traceRouteActivity2 != null) {
                                q5.i.b(strGroup3);
                                Pattern pattern2 = Z4.c.f4538a;
                                traceRouteActivity2.C(new com.lefan.signal.tracroute.f(strGroup2, strGroup3, 1, i3, strGroup2.length() == 0 ? false : Z4.c.f4539b.matcher(strGroup2).find()));
                            }
                        } else {
                            TraceRouteActivity traceRouteActivity3 = gVar.f18877g;
                            if (traceRouteActivity3 != null) {
                                traceRouteActivity3.C(new com.lefan.signal.tracroute.f("timeout", "0", 0, 0, false));
                            }
                        }
                        i++;
                    }
                } else {
                    Matcher matcher4 = gVar.f18872b.matcher(str2);
                    if (matcher4.find()) {
                        String strGroup4 = matcher4.group();
                        Matcher matcher5 = pattern.matcher(str2);
                        if (matcher5.find()) {
                            String strGroup5 = matcher5.group();
                            int i6 = gVar.f18874d + 1;
                            gVar.f18874d = i6;
                            TraceRouteActivity traceRouteActivity4 = gVar.f18877g;
                            if (traceRouteActivity4 != null) {
                                q5.i.b(strGroup4);
                                q5.i.b(strGroup5);
                                Pattern pattern3 = Z4.c.f4538a;
                                traceRouteActivity4.C(new com.lefan.signal.tracroute.f(strGroup4, strGroup5, 1, i6, strGroup4.length() == 0 ? false : Z4.c.f4539b.matcher(strGroup4).find()));
                            }
                        }
                        gVar.f18875e = true;
                    } else if (str2.length() == 0) {
                        TraceRouteActivity traceRouteActivity5 = gVar.f18877g;
                        if (traceRouteActivity5 != null) {
                            traceRouteActivity5.C(new com.lefan.signal.tracroute.f("unknown host or network error", "0", 0, 0, false));
                        }
                        gVar.f18875e = true;
                    } else {
                        TraceRouteActivity traceRouteActivity6 = gVar.f18877g;
                        if (traceRouteActivity6 != null) {
                            traceRouteActivity6.C(new com.lefan.signal.tracroute.f("timeout", "0", 0, 0, false));
                        }
                        i++;
                    }
                }
            } catch (IOException e6) {
                e6.printStackTrace();
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
        }
        TraceRouteActivity traceRouteActivity7 = gVar.f18877g;
        if (traceRouteActivity7 != null && !traceRouteActivity7.isFinishing() && !traceRouteActivity7.isDestroyed()) {
            traceRouteActivity7.runOnUiThread(new A3.z(8, traceRouteActivity7));
        }
        return C0412i.f5929a;
    }
}
