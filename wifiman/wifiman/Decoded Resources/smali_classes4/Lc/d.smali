.class public final LLc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLc/d$a;,
        LLc/d$b;,
        LLc/d$c;
    }
.end annotation


# static fields
.field public static final d:LLc/d$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LYg/m;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LLc/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LLc/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LLc/d;->d:LLc/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLc/d;->a:Landroid/content/Context;

    new-instance p1, LLc/c;

    invoke-direct {p1}, LLc/c;-><init>()V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LLc/d;->b:LYg/m;

    invoke-direct {p0}, LLc/d;->g()Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LLc/d;->c:Lgg/i;

    return-void
.end method

.method public static synthetic c()Lo7/f;
    .locals 1

    invoke-static {}, LLc/d;->e()Lo7/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()LLc/d$b;
    .locals 1

    invoke-static {}, LLc/d;->h()LLc/d$b;

    move-result-object v0

    return-object v0
.end method

.method private static final e()Lo7/f;
    .locals 3

    sget-object v0, Lo7/f;->a:Lo7/f$b;

    invoke-virtual {v0}, Lo7/f$b;->a()Lo7/f$a;

    move-result-object v0

    new-instance v1, LLc/d$c;

    invoke-direct {v1}, LLc/d$c;-><init>()V

    const/16 v2, 0x63

    invoke-virtual {v0, v1, v2}, Lo7/f$a;->a(Lu7/b;I)Lo7/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lo7/f$a;->b()Lo7/f;

    move-result-object v0

    return-object v0
.end method

.method private final f()Lo7/f;
    .locals 1

    iget-object v0, p0, LLc/d;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo7/f;

    return-object v0
.end method

.method private final g()Lgg/i;
    .locals 10

    invoke-direct {p0}, LLc/d;->f()Lo7/f;

    move-result-object v0

    invoke-virtual {v0}, Lo7/f;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LLc/d$d;->a:LLc/d$d;

    invoke-virtual {v0, v1}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object v2

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v8

    new-instance v9, LLc/b;

    invoke-direct {v9}, LLc/b;-><init>()V

    const-wide/16 v3, 0x7d0

    const-wide/16 v5, 0x7d0

    invoke-virtual/range {v2 .. v9}, Lgg/i;->c(JJLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/q;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    sget-object v1, LLc/d$e;->a:LLc/d$e;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, LLc/d$f;->a:LLc/d$f;

    invoke-virtual {v0, v1}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object v0

    sget-object v1, LLc/d$g;->a:LLc/d$g;

    invoke-virtual {v0, v1}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object v0

    const-string v1, "retryWhen(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final h()LLc/d$b;
    .locals 1

    new-instance v0, LLc/d$b;

    invoke-direct {v0}, LLc/d$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LLc/d;->c:Lgg/i;

    return-object v0
.end method
