package i9;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import l9.l;
import l9.p;

/* loaded from: classes4.dex */
public final class d implements kotlin.sequences.g {

    /* renamed from: a, reason: collision with root package name */
    public final File f21648a;

    /* renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f21649b;

    /* renamed from: c, reason: collision with root package name */
    public final l f21650c;

    /* renamed from: d, reason: collision with root package name */
    public final l f21651d;

    /* renamed from: e, reason: collision with root package name */
    public final p f21652e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21653f;

    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            kotlin.jvm.internal.p.e(rootDir, "rootDir");
        }
    }

    public final class b extends z8.c {

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque f21654c;

        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f21656b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f21657c;

            /* renamed from: d, reason: collision with root package name */
            public int f21658d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f21659e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f21660f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                kotlin.jvm.internal.p.e(rootDir, "rootDir");
                this.f21660f = bVar;
            }

            @Override // i9.d.c
            public File b() {
                if (!this.f21659e && this.f21657c == null) {
                    l lVar = d.this.f21650c;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f21657c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        p pVar = d.this.f21652e;
                        if (pVar != null) {
                            pVar.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f21659e = true;
                    }
                }
                File[] fileArr = this.f21657c;
                if (fileArr != null) {
                    int i10 = this.f21658d;
                    kotlin.jvm.internal.p.b(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f21657c;
                        kotlin.jvm.internal.p.b(fileArr2);
                        int i11 = this.f21658d;
                        this.f21658d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f21656b) {
                    this.f21656b = true;
                    return a();
                }
                l lVar2 = d.this.f21651d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: i9.d$b$b, reason: collision with other inner class name */
        public final class C0417b extends c {

            /* renamed from: b, reason: collision with root package name */
            public boolean f21661b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f21662c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0417b(b bVar, File rootFile) {
                super(rootFile);
                kotlin.jvm.internal.p.e(rootFile, "rootFile");
                this.f21662c = bVar;
            }

            @Override // i9.d.c
            public File b() {
                if (this.f21661b) {
                    return null;
                }
                this.f21661b = true;
                return a();
            }
        }

        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f21663b;

            /* renamed from: c, reason: collision with root package name */
            public File[] f21664c;

            /* renamed from: d, reason: collision with root package name */
            public int f21665d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f21666e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                kotlin.jvm.internal.p.e(rootDir, "rootDir");
                this.f21666e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // i9.d.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f21663b
                    r1 = 0
                    if (r0 != 0) goto L28
                    i9.d$b r0 = r9.f21666e
                    i9.d r0 = i9.d.this
                    l9.l r0 = i9.d.e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f21663b = r0
                    java.io.File r0 = r9.a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f21664c
                    if (r0 == 0) goto L47
                    int r2 = r9.f21665d
                    kotlin.jvm.internal.p.b(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    i9.d$b r0 = r9.f21666e
                    i9.d r0 = i9.d.this
                    l9.l r0 = i9.d.g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f21664c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f21664c = r0
                    if (r0 != 0) goto L76
                    i9.d$b r0 = r9.f21666e
                    i9.d r0 = i9.d.this
                    l9.p r0 = i9.d.f(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f21664c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.p.b(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    i9.d$b r0 = r9.f21666e
                    i9.d r0 = i9.d.this
                    l9.l r0 = i9.d.g(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f21664c
                    kotlin.jvm.internal.p.b(r0)
                    int r1 = r9.f21665d
                    int r2 = r1 + 1
                    r9.f21665d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: i9.d.b.c.b():java.io.File");
            }
        }

        /* renamed from: i9.d$b$d, reason: collision with other inner class name */
        public /* synthetic */ class C0418d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21667a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.f21995a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.f21996b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f21667a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f21654c = arrayDeque;
            if (d.this.f21648a.isDirectory()) {
                arrayDeque.push(f(d.this.f21648a));
            } else if (d.this.f21648a.isFile()) {
                arrayDeque.push(new C0417b(this, d.this.f21648a));
            } else {
                c();
            }
        }

        @Override // z8.c
        public void a() {
            File fileG = g();
            if (fileG != null) {
                d(fileG);
            } else {
                c();
            }
        }

        public final a f(File file) {
            int i10 = C0418d.f21667a[d.this.f21649b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final File g() {
            File fileB;
            while (true) {
                c cVar = (c) this.f21654c.peek();
                if (cVar == null) {
                    return null;
                }
                fileB = cVar.b();
                if (fileB == null) {
                    this.f21654c.pop();
                } else {
                    if (kotlin.jvm.internal.p.a(fileB, cVar.a()) || !fileB.isDirectory() || this.f21654c.size() >= d.this.f21653f) {
                        break;
                    }
                    this.f21654c.push(f(fileB));
                }
            }
            return fileB;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f21668a;

        public c(File root) {
            kotlin.jvm.internal.p.e(root, "root");
            this.f21668a = root;
        }

        public final File a() {
            return this.f21668a;
        }

        public abstract File b();
    }

    public d(File file, FileWalkDirection fileWalkDirection, l lVar, l lVar2, p pVar, int i10) {
        this.f21648a = file;
        this.f21649b = fileWalkDirection;
        this.f21650c = lVar;
        this.f21651d = lVar2;
        this.f21652e = pVar;
        this.f21653f = i10;
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new b();
    }

    public /* synthetic */ d(File file, FileWalkDirection fileWalkDirection, l lVar, l lVar2, p pVar, int i10, int i11, kotlin.jvm.internal.i iVar) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.f21995a : fileWalkDirection, lVar, lVar2, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        kotlin.jvm.internal.p.e(start, "start");
        kotlin.jvm.internal.p.e(direction, "direction");
    }
}
