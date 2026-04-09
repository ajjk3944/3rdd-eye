package db;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7260a;

    /* renamed from: b, reason: collision with root package name */
    public final BufferedReader f7261b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f7262c;

    /* renamed from: d, reason: collision with root package name */
    public String f7263d;

    public /* synthetic */ o(ArrayDeque arrayDeque, BufferedReader bufferedReader, int i10) {
        this.f7260a = i10;
        this.f7262c = arrayDeque;
        this.f7261b = bufferedReader;
    }

    public final boolean a() throws IOException {
        String strTrim;
        String strTrim2;
        switch (this.f7260a) {
            case 0:
                if (this.f7263d == null) {
                    ArrayDeque arrayDeque = this.f7262c;
                    if (!arrayDeque.isEmpty()) {
                        String str = (String) arrayDeque.poll();
                        str.getClass();
                        this.f7263d = str;
                        break;
                    } else {
                        do {
                            String line = this.f7261b.readLine();
                            this.f7263d = line;
                            if (line == null) {
                                break;
                            } else {
                                strTrim = line.trim();
                                this.f7263d = strTrim;
                            }
                        } while (strTrim.isEmpty());
                    }
                }
                break;
            default:
                if (this.f7263d == null) {
                    ArrayDeque arrayDeque2 = this.f7262c;
                    if (!arrayDeque2.isEmpty()) {
                        String str2 = (String) arrayDeque2.poll();
                        str2.getClass();
                        this.f7263d = str2;
                        break;
                    } else {
                        do {
                            String line2 = this.f7261b.readLine();
                            this.f7263d = line2;
                            if (line2 == null) {
                                break;
                            } else {
                                strTrim2 = line2.trim();
                                this.f7263d = strTrim2;
                            }
                        } while (strTrim2.isEmpty());
                    }
                }
                break;
        }
        return true;
    }

    public final String b() {
        switch (this.f7260a) {
            case 0:
                if (!a()) {
                    throw new NoSuchElementException();
                }
                String str = this.f7263d;
                this.f7263d = null;
                return str;
            default:
                if (!a()) {
                    throw new NoSuchElementException();
                }
                String str2 = this.f7263d;
                this.f7263d = null;
                return str2;
        }
    }
}
