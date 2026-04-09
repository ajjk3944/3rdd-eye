package f8;

import g8.k;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public BufferedReader f21163a;

    /* renamed from: b, reason: collision with root package name */
    public Process f21164b;

    /* renamed from: c, reason: collision with root package name */
    public b f21165c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f21166a;

        /* renamed from: b, reason: collision with root package name */
        public int f21167b;

        /* renamed from: c, reason: collision with root package name */
        public int f21168c;

        /* renamed from: d, reason: collision with root package name */
        public int f21169d;

        /* renamed from: e, reason: collision with root package name */
        public int f21170e;

        /* renamed from: f, reason: collision with root package name */
        public int f21171f;

        public a g() {
            return new a(this);
        }

        public b h(int i10) {
            this.f21168c = i10;
            return this;
        }

        public b i(int i10) {
            this.f21169d = i10;
            return this;
        }

        public b j(int i10) {
            this.f21167b = i10;
            return this;
        }

        public b k(String str) {
            this.f21166a = str;
            return this;
        }

        public b l(int i10) {
            this.f21171f = i10;
            return this;
        }

        public b m(int i10) {
            this.f21170e = i10;
            return this;
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("ping");
        if (this.f21165c.f21167b > 0) {
            sb.append(" -c " + this.f21165c.f21167b);
        }
        if (this.f21165c.f21168c > 0) {
            sb.append(" -i " + this.f21165c.f21168c);
        }
        if (this.f21165c.f21169d > 0) {
            sb.append(" -s " + this.f21165c.f21169d);
        }
        if (this.f21165c.f21170e > 0) {
            sb.append(" -t " + this.f21165c.f21170e);
        }
        if (this.f21165c.f21171f > 0) {
            sb.append(" -w " + this.f21165c.f21171f);
        }
        sb.append(" " + this.f21165c.f21166a);
        return sb.toString();
    }

    public void b(m8.b bVar) throws IOException {
        BufferedReader bufferedReader;
        try {
            try {
                try {
                    k.a("cmd : " + a());
                    this.f21164b = Runtime.getRuntime().exec(a());
                    this.f21163a = new BufferedReader(new InputStreamReader(this.f21164b.getInputStream()));
                    while (true) {
                        String line = this.f21163a.readLine();
                        if (line == null) {
                            break;
                        } else {
                            bVar.a(line);
                        }
                    }
                    int iWaitFor = this.f21164b.waitFor();
                    k.a("status= " + iWaitFor);
                    if (iWaitFor == 9) {
                        bVar.a("Ping is Stopped");
                    } else if (iWaitFor == 2) {
                        bVar.a("DNS error Unknown Host \"" + this.f21165c.f21166a + "\"");
                    }
                    Process process = this.f21164b;
                    if (process != null) {
                        process.destroy();
                    }
                    BufferedReader bufferedReader2 = this.f21163a;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                } catch (IOException unused) {
                    bVar.a("Ping is Stopped");
                    Process process2 = this.f21164b;
                    if (process2 != null) {
                        process2.destroy();
                    }
                    bufferedReader = this.f21163a;
                    if (bufferedReader == null) {
                        return;
                    }
                    bufferedReader.close();
                } catch (InterruptedException unused2) {
                    bVar.a("Ping is InterruptedException");
                    Process process3 = this.f21164b;
                    if (process3 != null) {
                        process3.destroy();
                    }
                    bufferedReader = this.f21163a;
                    if (bufferedReader == null) {
                        return;
                    }
                    bufferedReader.close();
                }
            } catch (IOException e10) {
                k.c("PingClient startPing exception", e10);
            }
        } catch (Throwable th) {
            Process process4 = this.f21164b;
            if (process4 != null) {
                process4.destroy();
            }
            BufferedReader bufferedReader3 = this.f21163a;
            if (bufferedReader3 != null) {
                try {
                    bufferedReader3.close();
                } catch (IOException e11) {
                    k.c("PingClient startPing exception", e11);
                }
            }
            throw th;
        }
    }

    public void c() throws IOException {
        Process process = this.f21164b;
        if (process != null) {
            process.destroy();
        }
        BufferedReader bufferedReader = this.f21163a;
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e10) {
                k.c("PingClient stopPing exception", e10);
            }
        }
    }

    public a(b bVar) {
        this.f21165c = bVar;
    }
}
