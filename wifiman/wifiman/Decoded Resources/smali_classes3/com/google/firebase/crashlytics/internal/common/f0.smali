.class public Lcom/google/firebase/crashlytics/internal/common/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/firebase/crashlytics/internal/common/C;

.field private final b:LQ4/e;

.field private final c:LR4/b;

.field private final d:LM4/f;

.field private final e:LM4/o;

.field private final f:Lcom/google/firebase/crashlytics/internal/common/L;

.field private final g:LL4/f;


# direct methods
.method constructor <init>(Lcom/google/firebase/crashlytics/internal/common/C;LQ4/e;LR4/b;LM4/f;LM4/o;Lcom/google/firebase/crashlytics/internal/common/L;LL4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->a:Lcom/google/firebase/crashlytics/internal/common/C;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    iput-object p3, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->c:LR4/b;

    iput-object p4, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->d:LM4/f;

    iput-object p5, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->e:LM4/o;

    iput-object p6, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->f:Lcom/google/firebase/crashlytics/internal/common/L;

    iput-object p7, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->g:LL4/f;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/internal/common/f0;LN4/F$e$d;LM4/c;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/f0;->r(LN4/F$e$d;LM4/c;Z)V

    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/crashlytics/internal/common/f0;Lcom/google/android/gms/tasks/Task;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/f0;->u(Lcom/google/android/gms/tasks/Task;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(LN4/F$c;LN4/F$c;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/f0;->q(LN4/F$c;LN4/F$c;)I

    move-result p0

    return p0
.end method

.method private d(LN4/F$e$d;LM4/f;LM4/o;)LN4/F$e$d;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/firebase/crashlytics/internal/common/f0;->e(LN4/F$e$d;LM4/f;LM4/o;Ljava/util/Map;)LN4/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method private e(LN4/F$e$d;LM4/f;LM4/o;Ljava/util/Map;)LN4/F$e$d;
    .locals 2

    invoke-virtual {p1}, LN4/F$e$d;->h()LN4/F$e$d$b;

    move-result-object v0

    invoke-virtual {p2}, LM4/f;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {}, LN4/F$e$d$d;->a()LN4/F$e$d$d$a;

    move-result-object v1

    invoke-virtual {v1, p2}, LN4/F$e$d$d$a;->b(Ljava/lang/String;)LN4/F$e$d$d$a;

    move-result-object p2

    invoke-virtual {p2}, LN4/F$e$d$d$a;->a()LN4/F$e$d$d;

    move-result-object p2

    invoke-virtual {v0, p2}, LN4/F$e$d$b;->d(LN4/F$e$d$d;)LN4/F$e$d$b;

    goto :goto_0

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p2

    const-string/jumbo v1, "No log data to include with this event."

    invoke-virtual {p2, v1}, LI4/g;->i(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p3, p4}, LM4/o;->f(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lcom/google/firebase/crashlytics/internal/common/f0;->o(Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, LM4/o;->g()Ljava/util/Map;

    move-result-object p3

    invoke-static {p3}, Lcom/google/firebase/crashlytics/internal/common/f0;->o(Ljava/util/Map;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_2

    :cond_1
    invoke-virtual {p1}, LN4/F$e$d;->b()LN4/F$e$d$a;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$a;->i()LN4/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1, p2}, LN4/F$e$d$a$a;->e(Ljava/util/List;)LN4/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1, p3}, LN4/F$e$d$a$a;->g(Ljava/util/List;)LN4/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$a$a;->a()LN4/F$e$d$a;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$e$d$b;->b(LN4/F$e$d$a;)LN4/F$e$d$b;

    :cond_2
    invoke-virtual {v0}, LN4/F$e$d$b;->a()LN4/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method private f(LN4/F$e$d;Ljava/util/Map;)LN4/F$e$d;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->d:LM4/f;

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->e:LM4/o;

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/firebase/crashlytics/internal/common/f0;->e(LN4/F$e$d;LM4/f;LM4/o;Ljava/util/Map;)LN4/F$e$d;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->e:LM4/o;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/f0;->g(LN4/F$e$d;LM4/o;)LN4/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method private g(LN4/F$e$d;LM4/o;)LN4/F$e$d;
    .locals 1

    invoke-virtual {p2}, LM4/o;->h()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, LN4/F$e$d;->h()LN4/F$e$d$b;

    move-result-object p1

    invoke-static {}, LN4/F$e$d$f;->a()LN4/F$e$d$f$a;

    move-result-object v0

    invoke-virtual {v0, p2}, LN4/F$e$d$f$a;->b(Ljava/util/List;)LN4/F$e$d$f$a;

    move-result-object p2

    invoke-virtual {p2}, LN4/F$e$d$f$a;->a()LN4/F$e$d$f;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$d$b;->e(LN4/F$e$d$f;)LN4/F$e$d$b;

    invoke-virtual {p1}, LN4/F$e$d$b;->a()LN4/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method private static h(Landroid/app/ApplicationExitInfo;)LN4/F$a;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/V;->a(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/google/firebase/crashlytics/internal/common/f0;->i(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not get input trace in application exit info: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/W;->a(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LI4/g;->k(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {}, LN4/F$a;->a()LN4/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/X;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, LN4/F$a$b;->c(I)LN4/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/Y;->a(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LN4/F$a$b;->e(Ljava/lang/String;)LN4/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/U;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, LN4/F$a$b;->g(I)LN4/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/T;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/F$a$b;->i(J)LN4/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/Z;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, LN4/F$a$b;->d(I)LN4/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/a0;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/F$a$b;->f(J)LN4/F$a$b;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/crashlytics/internal/common/b0;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/F$a$b;->h(J)LN4/F$a$b;

    move-result-object p0

    invoke-virtual {p0, v0}, LN4/F$a$b;->j(Ljava/lang/String;)LN4/F$a$b;

    move-result-object p0

    invoke-virtual {p0}, LN4/F$a$b;->a()LN4/F$a;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x2000

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j(Landroid/content/Context;Lcom/google/firebase/crashlytics/internal/common/L;LQ4/g;Lcom/google/firebase/crashlytics/internal/common/a;LM4/f;LM4/o;LT4/d;LS4/j;Lcom/google/firebase/crashlytics/internal/common/Q;Lcom/google/firebase/crashlytics/internal/common/m;LL4/f;)Lcom/google/firebase/crashlytics/internal/common/f0;
    .locals 9

    move-object/from16 v6, p7

    new-instance v7, Lcom/google/firebase/crashlytics/internal/common/C;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p6

    move-object/from16 v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/crashlytics/internal/common/C;-><init>(Landroid/content/Context;Lcom/google/firebase/crashlytics/internal/common/L;Lcom/google/firebase/crashlytics/internal/common/a;LT4/d;LS4/j;)V

    new-instance v2, LQ4/e;

    move-object v0, p2

    move-object/from16 v1, p9

    invoke-direct {v2, p2, v6, v1}, LQ4/e;-><init>(LQ4/g;LS4/j;Lcom/google/firebase/crashlytics/internal/common/m;)V

    move-object v0, p0

    move-object/from16 v1, p8

    invoke-static {p0, v6, v1}, LR4/b;->b(Landroid/content/Context;LS4/j;Lcom/google/firebase/crashlytics/internal/common/Q;)LR4/b;

    move-result-object v3

    new-instance v8, Lcom/google/firebase/crashlytics/internal/common/f0;

    move-object v0, v8

    move-object v1, v7

    move-object v4, p4

    move-object v5, p5

    move-object v6, p1

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/crashlytics/internal/common/f0;-><init>(Lcom/google/firebase/crashlytics/internal/common/C;LQ4/e;LR4/b;LM4/f;LM4/o;Lcom/google/firebase/crashlytics/internal/common/L;LL4/f;)V

    return-object v8
.end method

.method private k(Lcom/google/firebase/crashlytics/internal/common/D;)Lcom/google/firebase/crashlytics/internal/common/D;
    .locals 3

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/D;->b()LN4/F;

    move-result-object v0

    invoke-virtual {v0}, LN4/F;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/D;->b()LN4/F;

    move-result-object v0

    invoke-virtual {v0}, LN4/F;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->f:Lcom/google/firebase/crashlytics/internal/common/L;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/firebase/crashlytics/internal/common/L;->d(Z)Lcom/google/firebase/crashlytics/internal/common/K;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/D;->b()LN4/F;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/K;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LN4/F;->t(Ljava/lang/String;)LN4/F;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/K;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LN4/F;->s(Ljava/lang/String;)LN4/F;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/D;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/D;->c()Ljava/io/File;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/google/firebase/crashlytics/internal/common/D;->a(LN4/F;Ljava/lang/String;Ljava/io/File;)Lcom/google/firebase/crashlytics/internal/common/D;

    move-result-object p1

    return-object p1
.end method

.method private n(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {v0, p1}, LQ4/e;->q(Ljava/lang/String;)J

    move-result-wide v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/google/firebase/crashlytics/internal/common/S;->a(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    move-result-object p2

    invoke-static {p2}, Lcom/google/firebase/crashlytics/internal/common/T;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v3

    cmp-long v3, v3, v0

    if-gez v3, :cond_0

    return-object v2

    :cond_0
    invoke-static {p2}, Lcom/google/firebase/crashlytics/internal/common/U;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    return-object v2
.end method

.method private static o(Ljava/util/Map;)Ljava/util/List;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {}, LN4/F$c;->a()LN4/F$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, LN4/F$c$a;->b(Ljava/lang/String;)LN4/F$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, LN4/F$c$a;->c(Ljava/lang/String;)LN4/F$c$a;

    move-result-object v1

    invoke-virtual {v1}, LN4/F$c$a;->a()LN4/F$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/google/firebase/crashlytics/internal/common/e0;

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/e0;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic q(LN4/F$c;LN4/F$c;)I
    .locals 0

    invoke-virtual {p0}, LN4/F$c;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, LN4/F$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private synthetic r(LN4/F$e$d;LM4/c;Z)V
    .locals 2

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "disk worker: log non-fatal event to persistence"

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {p2}, LM4/c;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3}, LQ4/e;->y(LN4/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method private u(Lcom/google/android/gms/tasks/Task;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/crashlytics/internal/common/D;

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/D;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/internal/common/D;->c()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Deleted report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LI4/g;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics could not delete report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LI4/g;->k(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LI4/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method private v(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;LM4/c;Z)V
    .locals 10

    const-string/jumbo v0, "crash"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->a:Lcom/google/firebase/crashlytics/internal/common/C;

    invoke-virtual {p4}, LM4/c;->c()J

    move-result-wide v5

    const/4 v7, 0x4

    const/16 v8, 0x8

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v9, p5

    invoke-virtual/range {v1 .. v9}, Lcom/google/firebase/crashlytics/internal/common/C;->d(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)LN4/F$e$d;

    move-result-object p1

    invoke-virtual {p4}, LM4/c;->a()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/f0;->f(LN4/F$e$d;Ljava/util/Map;)LN4/F$e$d;

    move-result-object p1

    if-nez p5, :cond_0

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->g:LL4/f;

    iget-object p2, p2, LL4/f;->b:LL4/e;

    new-instance p3, Lcom/google/firebase/crashlytics/internal/common/c0;

    invoke-direct {p3, p0, p1, p4, v0}, Lcom/google/firebase/crashlytics/internal/common/c0;-><init>(Lcom/google/firebase/crashlytics/internal/common/f0;LN4/F$e$d;LM4/c;Z)V

    invoke-virtual {p2, p3}, LL4/e;->f(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_0
    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {p4}, LM4/c;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p1, p3, v0}, LQ4/e;->y(LN4/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public A(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/crashlytics/internal/common/f0;->B(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public B(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {v0}, LQ4/e;->w()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/crashlytics/internal/common/D;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Lcom/google/firebase/crashlytics/internal/common/D;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->c:LR4/b;

    invoke-direct {p0, v2}, Lcom/google/firebase/crashlytics/internal/common/f0;->k(Lcom/google/firebase/crashlytics/internal/common/D;)Lcom/google/firebase/crashlytics/internal/common/D;

    move-result-object v2

    if-eqz p2, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v2, v4}, LR4/b;->c(Lcom/google/firebase/crashlytics/internal/common/D;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lcom/google/firebase/crashlytics/internal/common/d0;

    invoke-direct {v3, p0}, Lcom/google/firebase/crashlytics/internal/common/d0;-><init>(Lcom/google/firebase/crashlytics/internal/common/f0;)V

    invoke-virtual {v2, p1, v3}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;Ljava/util/List;LN4/F$a;)V
    .locals 2

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    const-string/jumbo v1, "SessionReportingCoordinator#finalizeSessionWithNativeEvent"

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/crashlytics/internal/common/O;

    invoke-interface {v1}, Lcom/google/firebase/crashlytics/internal/common/O;->c()LN4/F$d$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-static {}, LN4/F$d;->a()LN4/F$d$a;

    move-result-object v1

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, LN4/F$d$a;->b(Ljava/util/List;)LN4/F$d$a;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$d$a;->a()LN4/F$d;

    move-result-object v0

    invoke-virtual {p2, p1, v0, p3}, LQ4/e;->l(Ljava/lang/String;LN4/F$d;LN4/F$a;)V

    return-void
.end method

.method public m(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {v0, p3, p1, p2}, LQ4/e;->k(Ljava/lang/String;J)V

    return-void
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {v0}, LQ4/e;->r()Z

    move-result v0

    return v0
.end method

.method public s()Ljava/util/SortedSet;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {v0}, LQ4/e;->p()Ljava/util/SortedSet;

    move-result-object v0

    return-object v0
.end method

.method public t(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->a:Lcom/google/firebase/crashlytics/internal/common/C;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/C;->e(Ljava/lang/String;J)LN4/F;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {p2, p1}, LQ4/e;->z(LN4/F;)V

    return-void
.end method

.method public w(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 8

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Persisting fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->i(Ljava/lang/String;)V

    new-instance v6, LM4/c;

    invoke-direct {v6, p3, p4, p5}, LM4/c;-><init>(Ljava/lang/String;J)V

    const-string/jumbo v5, "crash"

    const/4 v7, 0x1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v7}, Lcom/google/firebase/crashlytics/internal/common/f0;->v(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;LM4/c;Z)V

    return-void
.end method

.method public x(Ljava/lang/Throwable;Ljava/lang/Thread;LM4/c;)V
    .locals 8

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Persisting non-fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, LM4/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->i(Ljava/lang/String;)V

    const-string/jumbo v5, "error"

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lcom/google/firebase/crashlytics/internal/common/f0;->v(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;LM4/c;Z)V

    return-void
.end method

.method public y(Ljava/lang/String;Ljava/util/List;LM4/f;LM4/o;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/crashlytics/internal/common/f0;->n(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p4, "No relevant ApplicationExitInfo occurred during session: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, LI4/g;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->a:Lcom/google/firebase/crashlytics/internal/common/C;

    invoke-static {p2}, Lcom/google/firebase/crashlytics/internal/common/f0;->h(Landroid/app/ApplicationExitInfo;)LN4/F$a;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/firebase/crashlytics/internal/common/C;->c(LN4/F$a;)LN4/F$e$d;

    move-result-object p2

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Persisting anr for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4}, Lcom/google/firebase/crashlytics/internal/common/f0;->d(LN4/F$e$d;LM4/f;LM4/o;)LN4/F$e$d;

    move-result-object p2

    invoke-direct {p0, p2, p4}, Lcom/google/firebase/crashlytics/internal/common/f0;->g(LN4/F$e$d;LM4/o;)LN4/F$e$d;

    move-result-object p2

    iget-object p3, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    const/4 p4, 0x1

    invoke-virtual {p3, p2, p1, p4}, LQ4/e;->y(LN4/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method public z()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/f0;->b:LQ4/e;

    invoke-virtual {v0}, LQ4/e;->i()V

    return-void
.end method
