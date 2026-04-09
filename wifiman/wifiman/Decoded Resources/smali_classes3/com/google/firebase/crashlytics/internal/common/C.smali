.class public Lcom/google/firebase/crashlytics/internal/common/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final g:Ljava/util/Map;

.field static final h:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/firebase/crashlytics/internal/common/L;

.field private final c:Lcom/google/firebase/crashlytics/internal/common/a;

.field private final d:LT4/d;

.field private final e:LS4/j;

.field private final f:LI4/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/common/C;->g:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "armeabi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "armeabi-v7a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "arm64-v8a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "x86"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string/jumbo v2, "x86_64"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "19.4.1"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Crashlytics Android SDK/%s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/common/C;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/firebase/crashlytics/internal/common/L;Lcom/google/firebase/crashlytics/internal/common/a;LT4/d;LS4/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LI4/j;->a:LI4/j;

    iput-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/C;->f:LI4/j;

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/C;->b:Lcom/google/firebase/crashlytics/internal/common/L;

    iput-object p3, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iput-object p4, p0, Lcom/google/firebase/crashlytics/internal/common/C;->d:LT4/d;

    iput-object p5, p0, Lcom/google/firebase/crashlytics/internal/common/C;->e:LS4/j;

    return-void
.end method

.method private A(LN4/F$a;)LN4/F$e$d$a$c;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/C;->f:LI4/j;

    invoke-virtual {p1}, LN4/F$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->d()I

    move-result v2

    invoke-virtual {p1}, LN4/F$a;->c()I

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, LI4/j;->a(Ljava/lang/String;II)LN4/F$e$d$a$c;

    move-result-object p1

    return-object p1
.end method

.method private a(LN4/F$a;)LN4/F$a;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/C;->e:LS4/j;

    invoke-interface {v0}, LS4/j;->b()LS4/d;

    move-result-object v0

    iget-object v0, v0, LS4/d;->b:LS4/d$a;

    iget-boolean v0, v0, LS4/d$a;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v0, v0, Lcom/google/firebase/crashlytics/internal/common/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/crashlytics/internal/common/f;

    invoke-static {}, LN4/F$a$a;->a()LN4/F$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/firebase/crashlytics/internal/common/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LN4/F$a$a$a;->d(Ljava/lang/String;)LN4/F$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/firebase/crashlytics/internal/common/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LN4/F$a$a$a;->b(Ljava/lang/String;)LN4/F$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/firebase/crashlytics/internal/common/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, LN4/F$a$a$a;->c(Ljava/lang/String;)LN4/F$a$a$a;

    move-result-object v2

    invoke-virtual {v2}, LN4/F$a$a$a;->a()LN4/F$a$a;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {}, LN4/F$a;->a()LN4/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, LN4/F$a$b;->c(I)LN4/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LN4/F$a$b;->e(Ljava/lang/String;)LN4/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->g()I

    move-result v2

    invoke-virtual {v1, v2}, LN4/F$a$b;->g(I)LN4/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/F$a$b;->i(J)LN4/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->d()I

    move-result v2

    invoke-virtual {v1, v2}, LN4/F$a$b;->d(I)LN4/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->f()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/F$a$b;->f(J)LN4/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/F$a$b;->h(J)LN4/F$a$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LN4/F$a$b;->j(Ljava/lang/String;)LN4/F$a$b;

    move-result-object p1

    invoke-virtual {p1, v0}, LN4/F$a$b;->b(Ljava/util/List;)LN4/F$a$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$a$b;->a()LN4/F$a;

    move-result-object p1

    return-object p1
.end method

.method private b()LN4/F$b;
    .locals 2

    invoke-static {}, LN4/F;->b()LN4/F$b;

    move-result-object v0

    const-string v1, "19.4.1"

    invoke-virtual {v0, v1}, LN4/F$b;->l(Ljava/lang/String;)LN4/F$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$b;->h(Ljava/lang/String;)LN4/F$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->b:Lcom/google/firebase/crashlytics/internal/common/L;

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/L;->a()Lcom/google/firebase/crashlytics/internal/common/M$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/M$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$b;->i(Ljava/lang/String;)LN4/F$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->b:Lcom/google/firebase/crashlytics/internal/common/L;

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/L;->a()Lcom/google/firebase/crashlytics/internal/common/M$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/M$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$b;->g(Ljava/lang/String;)LN4/F$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->b:Lcom/google/firebase/crashlytics/internal/common/L;

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/L;->a()Lcom/google/firebase/crashlytics/internal/common/M$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/M$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$b;->f(Ljava/lang/String;)LN4/F$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$b;->d(Ljava/lang/String;)LN4/F$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$b;->e(Ljava/lang/String;)LN4/F$b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, LN4/F$b;->k(I)LN4/F$b;

    move-result-object v0

    return-object v0
.end method

.method private static f(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-wide p0, v0

    :goto_0
    return-wide p0
.end method

.method private static g()I
    .locals 4

    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x7

    if-eqz v1, :cond_0

    return v2

    :cond_0
    sget-object v1, Lcom/google/firebase/crashlytics/internal/common/C;->g:Ljava/util/Map;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method private h()LN4/F$e$d$a$b$a;
    .locals 3

    invoke-static {}, LN4/F$e$d$a$b$a;->a()LN4/F$e$d$a$b$a$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, LN4/F$e$d$a$b$a$a;->b(J)LN4/F$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, LN4/F$e$d$a$b$a$a;->d(J)LN4/F$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$e$d$a$b$a$a;->c(Ljava/lang/String;)LN4/F$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$e$d$a$b$a$a;->e(Ljava/lang/String;)LN4/F$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$e$d$a$b$a$a;->a()LN4/F$e$d$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method private i()Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->h()LN4/F$e$d$a$b$a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private j(ILN4/F$a;)LN4/F$e$d$a;
    .locals 2

    invoke-virtual {p2}, LN4/F$a;->c()I

    move-result v0

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, LN4/F$e$d$a;->a()LN4/F$e$d$a$a;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, LN4/F$e$d$a$a;->c(Ljava/lang/Boolean;)LN4/F$e$d$a$a;

    move-result-object v0

    invoke-direct {p0, p2}, Lcom/google/firebase/crashlytics/internal/common/C;->A(LN4/F$a;)LN4/F$e$d$a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$d$a$a;->d(LN4/F$e$d$a$c;)LN4/F$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$e$d$a$a;->h(I)LN4/F$e$d$a$a;

    move-result-object p1

    invoke-direct {p0, p2}, Lcom/google/firebase/crashlytics/internal/common/C;->o(LN4/F$a;)LN4/F$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$d$a$a;->f(LN4/F$e$d$a$b;)LN4/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$a$a;->a()LN4/F$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method private k(ILT4/e;Ljava/lang/Thread;IIZ)LN4/F$e$d$a;
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/C;->f:LI4/j;

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, LI4/j;->e(Landroid/content/Context;)LN4/F$e$d$a$c;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$e$d$a$c;->b()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LN4/F$e$d$a$c;->b()I

    move-result v1

    const/16 v2, 0x64

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {}, LN4/F$e$d$a;->a()LN4/F$e$d$a$a;

    move-result-object v2

    invoke-virtual {v2, v1}, LN4/F$e$d$a$a;->c(Ljava/lang/Boolean;)LN4/F$e$d$a$a;

    move-result-object v1

    invoke-virtual {v1, v0}, LN4/F$e$d$a$a;->d(LN4/F$e$d$a$c;)LN4/F$e$d$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->f:LI4/j;

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, LI4/j;->d(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$d$a$a;->b(Ljava/util/List;)LN4/F$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$e$d$a$a;->h(I)LN4/F$e$d$a$a;

    move-result-object p1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/crashlytics/internal/common/C;->p(LT4/e;Ljava/lang/Thread;IIZ)LN4/F$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$d$a$a;->f(LN4/F$e$d$a$b;)LN4/F$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$a$a;->a()LN4/F$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method private l(I)LN4/F$e$d$c;
    .locals 8

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/firebase/crashlytics/internal/common/e;->a(Landroid/content/Context;)Lcom/google/firebase/crashlytics/internal/common/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/e;->b()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/internal/common/e;->c()I

    move-result v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/firebase/crashlytics/internal/common/i;->n(Landroid/content/Context;)Z

    move-result v2

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/firebase/crashlytics/internal/common/i;->b(Landroid/content/Context;)J

    move-result-wide v3

    iget-object v5, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-static {v5}, Lcom/google/firebase/crashlytics/internal/common/i;->a(Landroid/content/Context;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Lcom/google/firebase/crashlytics/internal/common/C;->f(J)J

    move-result-wide v3

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/google/firebase/crashlytics/internal/common/i;->c(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {}, LN4/F$e$d$c;->a()LN4/F$e$d$c$a;

    move-result-object v7

    invoke-virtual {v7, v1}, LN4/F$e$d$c$a;->b(Ljava/lang/Double;)LN4/F$e$d$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, LN4/F$e$d$c$a;->c(I)LN4/F$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, v2}, LN4/F$e$d$c$a;->f(Z)LN4/F$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$e$d$c$a;->e(I)LN4/F$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, LN4/F$e$d$c$a;->g(J)LN4/F$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v5, v6}, LN4/F$e$d$c$a;->d(J)LN4/F$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$c$a;->a()LN4/F$e$d$c;

    move-result-object p1

    return-object p1
.end method

.method private m(LT4/e;II)LN4/F$e$d$a$b$c;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/firebase/crashlytics/internal/common/C;->n(LT4/e;III)LN4/F$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method private n(LT4/e;III)LN4/F$e$d$a$b$c;
    .locals 5

    iget-object v0, p1, LT4/e;->b:Ljava/lang/String;

    iget-object v1, p1, LT4/e;->a:Ljava/lang/String;

    iget-object v2, p1, LT4/e;->c:[Ljava/lang/StackTraceElement;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-array v2, v3, [Ljava/lang/StackTraceElement;

    :goto_0
    iget-object p1, p1, LT4/e;->d:LT4/e;

    if-lt p4, p3, :cond_1

    move-object v4, p1

    :goto_1
    if-eqz v4, :cond_1

    iget-object v4, v4, LT4/e;->d:LT4/e;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, LN4/F$e$d$a$b$c;->a()LN4/F$e$d$a$b$c$a;

    move-result-object v4

    invoke-virtual {v4, v0}, LN4/F$e$d$a$b$c$a;->f(Ljava/lang/String;)LN4/F$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LN4/F$e$d$a$b$c$a;->e(Ljava/lang/String;)LN4/F$e$d$a$b$c$a;

    move-result-object v0

    invoke-direct {p0, v2, p2}, Lcom/google/firebase/crashlytics/internal/common/C;->r([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$d$a$b$c$a;->c(Ljava/util/List;)LN4/F$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v3}, LN4/F$e$d$a$b$c$a;->d(I)LN4/F$e$d$a$b$c$a;

    move-result-object v0

    if-eqz p1, :cond_2

    if-nez v3, :cond_2

    add-int/lit8 p4, p4, 0x1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/firebase/crashlytics/internal/common/C;->n(LT4/e;III)LN4/F$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$e$d$a$b$c$a;->b(LN4/F$e$d$a$b$c;)LN4/F$e$d$a$b$c$a;

    :cond_2
    invoke-virtual {v0}, LN4/F$e$d$a$b$c$a;->a()LN4/F$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method private o(LN4/F$a;)LN4/F$e$d$a$b;
    .locals 1

    invoke-static {}, LN4/F$e$d$a$b;->a()LN4/F$e$d$a$b$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LN4/F$e$d$a$b$b;->b(LN4/F$a;)LN4/F$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->w()LN4/F$e$d$a$b$d;

    move-result-object v0

    invoke-virtual {p1, v0}, LN4/F$e$d$a$b$b;->e(LN4/F$e$d$a$b$d;)LN4/F$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->i()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, LN4/F$e$d$a$b$b;->c(Ljava/util/List;)LN4/F$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$a$b$b;->a()LN4/F$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method private p(LT4/e;Ljava/lang/Thread;IIZ)LN4/F$e$d$a$b;
    .locals 1

    invoke-static {}, LN4/F$e$d$a$b;->a()LN4/F$e$d$a$b$b;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/google/firebase/crashlytics/internal/common/C;->z(LT4/e;Ljava/lang/Thread;IZ)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, LN4/F$e$d$a$b$b;->f(Ljava/util/List;)LN4/F$e$d$a$b$b;

    move-result-object p2

    invoke-direct {p0, p1, p3, p4}, Lcom/google/firebase/crashlytics/internal/common/C;->m(LT4/e;II)LN4/F$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {p2, p1}, LN4/F$e$d$a$b$b;->d(LN4/F$e$d$a$b$c;)LN4/F$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->w()LN4/F$e$d$a$b$d;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$d$a$b$b;->e(LN4/F$e$d$a$b$d;)LN4/F$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->i()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$d$a$b$b;->c(Ljava/util/List;)LN4/F$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$a$b$b;->a()LN4/F$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method private q(Ljava/lang/StackTraceElement;LN4/F$e$d$a$b$e$b$a;)LN4/F$e$d$a$b$e$b;
    .locals 7

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    int-to-long v3, v0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    int-to-long v1, p1

    :cond_1
    invoke-virtual {p2, v3, v4}, LN4/F$e$d$a$b$e$b$a;->e(J)LN4/F$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v0}, LN4/F$e$d$a$b$e$b$a;->f(Ljava/lang/String;)LN4/F$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v5}, LN4/F$e$d$a$b$e$b$a;->b(Ljava/lang/String;)LN4/F$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, LN4/F$e$d$a$b$e$b$a;->d(J)LN4/F$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$a$b$e$b$a;->a()LN4/F$e$d$a$b$e$b;

    move-result-object p1

    return-object p1
.end method

.method private r([Ljava/lang/StackTraceElement;I)Ljava/util/List;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-static {}, LN4/F$e$d$a$b$e$b;->a()LN4/F$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-virtual {v4, p2}, LN4/F$e$d$a$b$e$b$a;->c(I)LN4/F$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lcom/google/firebase/crashlytics/internal/common/C;->q(Ljava/lang/StackTraceElement;LN4/F$e$d$a$b$e$b$a;)LN4/F$e$d$a$b$e$b;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private s()LN4/F$e$a;
    .locals 2

    invoke-static {}, LN4/F$e$a;->a()LN4/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->b:Lcom/google/firebase/crashlytics/internal/common/L;

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/L;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$a$a;->e(Ljava/lang/String;)LN4/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$e$a$a;->g(Ljava/lang/String;)LN4/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$e$a$a;->d(Ljava/lang/String;)LN4/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->b:Lcom/google/firebase/crashlytics/internal/common/L;

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/L;->a()Lcom/google/firebase/crashlytics/internal/common/M$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/crashlytics/internal/common/M$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$a$a;->f(Ljava/lang/String;)LN4/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->h:LI4/f;

    invoke-virtual {v1}, LI4/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$a$a;->b(Ljava/lang/String;)LN4/F$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->c:Lcom/google/firebase/crashlytics/internal/common/a;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/a;->h:LI4/f;

    invoke-virtual {v1}, LI4/f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$a$a;->c(Ljava/lang/String;)LN4/F$e$a$a;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$e$a$a;->a()LN4/F$e$a;

    move-result-object v0

    return-object v0
.end method

.method private t(Ljava/lang/String;J)LN4/F$e;
    .locals 1

    invoke-static {}, LN4/F$e;->a()LN4/F$e$b;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, LN4/F$e$b;->m(J)LN4/F$e$b;

    move-result-object p2

    invoke-virtual {p2, p1}, LN4/F$e$b;->j(Ljava/lang/String;)LN4/F$e$b;

    move-result-object p1

    sget-object p2, Lcom/google/firebase/crashlytics/internal/common/C;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, LN4/F$e$b;->h(Ljava/lang/String;)LN4/F$e$b;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->s()LN4/F$e$a;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$b;->b(LN4/F$e$a;)LN4/F$e$b;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->v()LN4/F$e$e;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$b;->l(LN4/F$e$e;)LN4/F$e$b;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->u()LN4/F$e$c;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$b;->e(LN4/F$e$c;)LN4/F$e$b;

    move-result-object p1

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, LN4/F$e$b;->i(I)LN4/F$e$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$b;->a()LN4/F$e;

    move-result-object p1

    return-object p1
.end method

.method private u()LN4/F$e$c;
    .locals 11

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/C;->g()I

    move-result v1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/firebase/crashlytics/internal/common/i;->b(Landroid/content/Context;)J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v7, v0

    mul-long/2addr v5, v7

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/i;->w()Z

    move-result v0

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/i;->l()I

    move-result v7

    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v9, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {}, LN4/F$e$c;->a()LN4/F$e$c$a;

    move-result-object v10

    invoke-virtual {v10, v1}, LN4/F$e$c$a;->b(I)LN4/F$e$c$a;

    move-result-object v1

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v10}, LN4/F$e$c$a;->f(Ljava/lang/String;)LN4/F$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v2}, LN4/F$e$c$a;->c(I)LN4/F$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, LN4/F$e$c$a;->h(J)LN4/F$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, LN4/F$e$c$a;->d(J)LN4/F$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, LN4/F$e$c$a;->i(Z)LN4/F$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v7}, LN4/F$e$c$a;->j(I)LN4/F$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v8}, LN4/F$e$c$a;->e(Ljava/lang/String;)LN4/F$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v9}, LN4/F$e$c$a;->g(Ljava/lang/String;)LN4/F$e$c$a;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$e$c$a;->a()LN4/F$e$c;

    move-result-object v0

    return-object v0
.end method

.method private v()LN4/F$e$e;
    .locals 2

    invoke-static {}, LN4/F$e$e;->a()LN4/F$e$e$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, LN4/F$e$e$a;->d(I)LN4/F$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$e$e$a;->e(Ljava/lang/String;)LN4/F$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-virtual {v0, v1}, LN4/F$e$e$a;->b(Ljava/lang/String;)LN4/F$e$e$a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/i;->x()Z

    move-result v1

    invoke-virtual {v0, v1}, LN4/F$e$e$a;->c(Z)LN4/F$e$e$a;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$e$e$a;->a()LN4/F$e$e;

    move-result-object v0

    return-object v0
.end method

.method private w()LN4/F$e$d$a$b$d;
    .locals 3

    invoke-static {}, LN4/F$e$d$a$b$d;->a()LN4/F$e$d$a$b$d$a;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, LN4/F$e$d$a$b$d$a;->d(Ljava/lang/String;)LN4/F$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LN4/F$e$d$a$b$d$a;->c(Ljava/lang/String;)LN4/F$e$d$a$b$d$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, LN4/F$e$d$a$b$d$a;->b(J)LN4/F$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$e$d$a$b$d$a;->a()LN4/F$e$d$a$b$d;

    move-result-object v0

    return-object v0
.end method

.method private x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)LN4/F$e$d$a$b$e;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/firebase/crashlytics/internal/common/C;->y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)LN4/F$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method private y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)LN4/F$e$d$a$b$e;
    .locals 1

    invoke-static {}, LN4/F$e$d$a$b$e;->a()LN4/F$e$d$a$b$e$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$e$d$a$b$e$a;->d(Ljava/lang/String;)LN4/F$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1, p3}, LN4/F$e$d$a$b$e$a;->c(I)LN4/F$e$d$a$b$e$a;

    move-result-object p1

    invoke-direct {p0, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/C;->r([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, LN4/F$e$d$a$b$e$a;->b(Ljava/util/List;)LN4/F$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$a$b$e$a;->a()LN4/F$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method private z(LT4/e;Ljava/lang/Thread;IZ)Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, LT4/e;->c:[Ljava/lang/StackTraceElement;

    invoke-direct {p0, p2, p1, p3}, Lcom/google/firebase/crashlytics/internal/common/C;->y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)LN4/F$e$d$a$b$e;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Thread;

    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/C;->d:LT4/d;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/StackTraceElement;

    invoke-interface {v1, p3}, LT4/d;->a([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    move-result-object p3

    invoke-direct {p0, p4, p3}, Lcom/google/firebase/crashlytics/internal/common/C;->x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)LN4/F$e$d$a$b$e;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c(LN4/F$a;)LN4/F$e$d;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-static {}, LN4/F$e$d;->a()LN4/F$e$d$b;

    move-result-object v1

    const-string/jumbo v2, "anr"

    invoke-virtual {v1, v2}, LN4/F$e$d$b;->g(Ljava/lang/String;)LN4/F$e$d$b;

    move-result-object v1

    invoke-virtual {p1}, LN4/F$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LN4/F$e$d$b;->f(J)LN4/F$e$d$b;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/C;->a(LN4/F$a;)LN4/F$a;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/google/firebase/crashlytics/internal/common/C;->j(ILN4/F$a;)LN4/F$e$d$a;

    move-result-object p1

    invoke-virtual {v1, p1}, LN4/F$e$d$b;->b(LN4/F$e$d$a;)LN4/F$e$d$b;

    move-result-object p1

    invoke-direct {p0, v0}, Lcom/google/firebase/crashlytics/internal/common/C;->l(I)LN4/F$e$d$c;

    move-result-object v0

    invoke-virtual {p1, v0}, LN4/F$e$d$b;->c(LN4/F$e$d$c;)LN4/F$e$d$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$e$d$b;->a()LN4/F$e$d;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)LN4/F$e$d;
    .locals 10

    move-object v7, p0

    iget-object v0, v7, Lcom/google/firebase/crashlytics/internal/common/C;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v8, v0, Landroid/content/res/Configuration;->orientation:I

    iget-object v0, v7, Lcom/google/firebase/crashlytics/internal/common/C;->d:LT4/d;

    move-object v1, p1

    invoke-static {p1, v0}, LT4/e;->a(Ljava/lang/Throwable;LT4/d;)LT4/e;

    move-result-object v2

    invoke-static {}, LN4/F$e$d;->a()LN4/F$e$d$b;

    move-result-object v0

    move-object v1, p3

    invoke-virtual {v0, p3}, LN4/F$e$d$b;->g(Ljava/lang/String;)LN4/F$e$d$b;

    move-result-object v0

    move-wide v3, p4

    invoke-virtual {v0, p4, p5}, LN4/F$e$d$b;->f(J)LN4/F$e$d$b;

    move-result-object v9

    move-object v0, p0

    move v1, v8

    move-object v3, p2

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/crashlytics/internal/common/C;->k(ILT4/e;Ljava/lang/Thread;IIZ)LN4/F$e$d$a;

    move-result-object v0

    invoke-virtual {v9, v0}, LN4/F$e$d$b;->b(LN4/F$e$d$a;)LN4/F$e$d$b;

    move-result-object v0

    invoke-direct {p0, v8}, Lcom/google/firebase/crashlytics/internal/common/C;->l(I)LN4/F$e$d$c;

    move-result-object v1

    invoke-virtual {v0, v1}, LN4/F$e$d$b;->c(LN4/F$e$d$c;)LN4/F$e$d$b;

    move-result-object v0

    invoke-virtual {v0}, LN4/F$e$d$b;->a()LN4/F$e$d;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;J)LN4/F;
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/crashlytics/internal/common/C;->b()LN4/F$b;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/C;->t(Ljava/lang/String;J)LN4/F$e;

    move-result-object p1

    invoke-virtual {v0, p1}, LN4/F$b;->m(LN4/F$e;)LN4/F$b;

    move-result-object p1

    invoke-virtual {p1}, LN4/F$b;->a()LN4/F;

    move-result-object p1

    return-object p1
.end method
