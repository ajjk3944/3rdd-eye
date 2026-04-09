package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j10 {
    public static final i80 g = k80.d(j10.class);
    public final int a;
    public final HashMap b;
    public final Path c;
    public final boolean d;
    public Instant e;
    public boolean f;

    public j10() {
        Path path = System.getProperty("os.name").contains("Windows") ? Paths.get(System.getenv("SystemRoot"), "\\System32\\drivers\\etc\\hosts") : Paths.get("/etc/hosts", new String[0]);
        this.a = Integer.parseInt(System.getProperty("dnsjava.hostsfile.max_size_bytes", "16384"));
        this.b = new HashMap();
        this.e = Instant.MIN;
        Objects.requireNonNull(path, "path is required");
        this.c = path;
        this.d = true;
        if (Files.isDirectory(path, new LinkOption[0])) {
            throw new IllegalArgumentException("path must be a file");
        }
    }

    public static String b(gg0 gg0Var, int i) {
        return gg0Var.p(false) + '\t' + i;
    }

    public final synchronized Optional a(gg0 gg0Var, int i) {
        try {
            Objects.requireNonNull(gg0Var, "name is required");
            if (i != 1 && i != 28) {
                throw new IllegalArgumentException("type can only be A or AAAA");
            }
            f();
            InetAddress inetAddress = (InetAddress) this.b.get(b(gg0Var, i));
            if (inetAddress != null) {
                return Optional.of(inetAddress);
            }
            if (!this.f && Files.exists(this.c, new LinkOption[0])) {
                if (Files.size(this.c) <= this.a) {
                    c();
                } else {
                    e(gg0Var, i);
                }
                return Optional.ofNullable((InetAddress) this.b.get(b(gg0Var, i)));
            }
            return Optional.empty();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.c, StandardCharsets.UTF_8);
        int i = 0;
        while (true) {
            try {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line == null) {
                    bufferedReaderNewBufferedReader.close();
                    this.f = true;
                    return;
                }
                i++;
                so1 so1VarD = d(line, i);
                if (so1VarD != null) {
                    for (gg0 gg0Var : ((i10) so1VarD.h).f) {
                        this.b.putIfAbsent(b(gg0Var, so1VarD.f), InetAddress.getByAddress(gg0Var.p(true), (byte[]) so1VarD.g));
                    }
                }
            } catch (Throwable th) {
                if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public final so1 d(String str, final int i) throws NumberFormatException {
        int iIndexOf = str.indexOf(35);
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        String[] strArrSplit = str.substring(0, iIndexOf).trim().split("\\s+");
        if (strArrSplit.length < 2) {
            return null;
        }
        int i2 = 1;
        byte[] bArrI = a30.i(strArrSplit[0], 1);
        if (bArrI == null) {
            bArrI = a30.i(strArrSplit[0], 2);
            i2 = 28;
        }
        if (bArrI == null) {
            g.n("Could not decode address {}, {}#L{}", strArrSplit[0], this.c, Integer.valueOf(i));
            return null;
        }
        Stream streamFilter = Arrays.stream(strArrSplit).skip(1L).map(new Function() { // from class: h10
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                try {
                    return gg0.j(str2, gg0.l);
                } catch (f11 unused) {
                    j10.g.n("Could not decode name {}, {}#L{}, skipping", str2, this.a.c, Integer.valueOf(i));
                    return null;
                }
            }
        }).filter(new ia(1));
        Objects.requireNonNull(streamFilter);
        return new so1(i2, bArrI, new i10(streamFilter));
    }

    public final void e(gg0 gg0Var, int i) throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.c, StandardCharsets.UTF_8);
        int i2 = 0;
        while (true) {
            try {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line == null) {
                    bufferedReaderNewBufferedReader.close();
                    return;
                }
                i2++;
                so1 so1VarD = d(line, i2);
                if (so1VarD != null) {
                    int i3 = so1VarD.f;
                    for (gg0 gg0Var2 : ((i10) so1VarD.h).f) {
                        if (gg0Var2.equals(gg0Var) && i == i3) {
                            this.b.putIfAbsent(b(gg0Var2, i3), InetAddress.getByAddress(gg0Var2.p(true), (byte[]) so1VarD.g));
                            bufferedReaderNewBufferedReader.close();
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                if (bufferedReaderNewBufferedReader != null) {
                    try {
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public final void f() {
        if (this.d) {
            Path path = this.c;
            Instant instant = Files.exists(path, new LinkOption[0]) ? Files.getLastModifiedTime(path, new LinkOption[0]).toInstant() : Instant.MAX;
            if (instant.isAfter(this.e)) {
                HashMap map = this.b;
                if (!map.isEmpty()) {
                    g.g(instant);
                    map.clear();
                }
                this.f = false;
                this.e = instant;
            }
        }
    }
}
