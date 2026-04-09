.class public final Lve/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lve/i$b;
    }
.end annotation


# static fields
.field public static final e:Lve/i$b;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LIi/p0;

.field private final c:LIi/N;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lve/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lve/i$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lve/i;->e:Lve/i$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lve/i;->a:Landroid/content/Context;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    const-string v0, "newSingleThreadExecutor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LIi/r0;->b(Ljava/util/concurrent/ExecutorService;)LIi/p0;

    move-result-object p1

    iput-object p1, p0, Lve/i;->b:LIi/p0;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, LIi/S0;->b(LIi/y0;ILjava/lang/Object;)LIi/A;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldh/a;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    new-instance v0, LIi/M;

    const-string v2, "FileLog"

    invoke-direct {v0, v2}, LIi/M;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    invoke-static {p1}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v2

    iput-object v2, p0, Lve/i;->c:LIi/N;

    new-instance v5, Lve/i$a;

    invoke-direct {v5, p0, v1}, Lve/i$a;-><init>(Lve/i;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public static synthetic c(Lve/i;Lgg/A;)V
    .locals 0

    invoke-static {p0, p1}, Lve/i;->k(Lve/i;Lgg/A;)V

    return-void
.end method

.method public static final synthetic d(Lve/i;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lve/i;->j()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lve/i;)I
    .locals 0

    iget p0, p0, Lve/i;->d:I

    return p0
.end method

.method public static final synthetic f(Lve/i;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    invoke-direct {p0, p1}, Lve/i;->l(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lve/i;)V
    .locals 0

    invoke-direct {p0}, Lve/i;->m()V

    return-void
.end method

.method public static final synthetic h(Lve/i;)V
    .locals 0

    invoke-direct {p0}, Lve/i;->n()V

    return-void
.end method

.method public static final synthetic i(Lve/i;I)V
    .locals 0

    iput p1, p0, Lve/i;->d:I

    return-void
.end method

.method private final j()Ljava/lang/String;
    .locals 4

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd HH:mm:ss.SSS"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final k(Lve/i;Lgg/A;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lve/i;->c:LIi/N;

    new-instance v4, Lve/i$d;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lve/i$d;-><init>(Lgg/A;Lve/i;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method private final l(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lve/i;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "logs/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final m()V
    .locals 2

    const-string v0, "log_0"

    invoke-direct {p0, v0}, Lve/i;->l(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    :cond_1
    return-void
.end method

.method private final n()V
    .locals 3

    const-string v0, "log_0"

    invoke-direct {p0, v0}, Lve/i;->l(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const-string v1, "log_1"

    invoke-direct {p0, v1}, Lve/i;->l(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    invoke-direct {p0}, Lve/i;->m()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lve/i;->c:LIi/N;

    new-instance v0, Lve/i$c;

    const/4 v7, 0x0

    move-object v2, v0

    move-object v3, p0

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lve/i$c;-><init>(Lve/i;ILjava/lang/String;Ljava/lang/String;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public b()Lgg/z;
    .locals 2

    new-instance v0, Lve/h;

    invoke-direct {v0, p0}, Lve/h;-><init>(Lve/i;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    sget-object v1, Lve/i$e;->a:Lve/i$e;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
