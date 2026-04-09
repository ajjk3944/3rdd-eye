.class public final LM/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LM/r$a;

.field private static final b:LM/r;

.field private static final c:LM/r;

.field private static final d:LM/r;

.field private static final e:LM/r;

.field private static final f:LM/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM/r$a;

    invoke-direct {v0}, LM/r$a;-><init>()V

    sput-object v0, LM/r$a;->a:LM/r$a;

    new-instance v0, LM/m;

    invoke-direct {v0}, LM/m;-><init>()V

    sput-object v0, LM/r$a;->b:LM/r;

    new-instance v0, LM/n;

    invoke-direct {v0}, LM/n;-><init>()V

    sput-object v0, LM/r$a;->c:LM/r;

    new-instance v0, LM/o;

    invoke-direct {v0}, LM/o;-><init>()V

    sput-object v0, LM/r$a;->d:LM/r;

    new-instance v0, LM/p;

    invoke-direct {v0}, LM/p;-><init>()V

    sput-object v0, LM/r$a;->e:LM/r;

    new-instance v0, LM/q;

    invoke-direct {v0}, LM/q;-><init>()V

    sput-object v0, LM/r$a;->f:LM/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LM/x;)LM/l;
    .locals 0

    invoke-static {p0}, LM/r$a;->j(LM/x;)LM/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LM/x;)LM/l;
    .locals 0

    invoke-static {p0}, LM/r$a;->i(LM/x;)LM/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LM/x;)LM/l;
    .locals 0

    invoke-static {p0}, LM/r$a;->g(LM/x;)LM/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LM/x;)LM/l;
    .locals 0

    invoke-static {p0}, LM/r$a;->h(LM/x;)LM/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LM/x;)LM/l;
    .locals 0

    invoke-static {p0}, LM/r$a;->f(LM/x;)LM/l;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LM/x;)LM/l;
    .locals 1

    sget-object v0, LM/r$a;->b:LM/r;

    invoke-interface {v0, p0}, LM/r;->a(LM/x;)LM/l;

    move-result-object v0

    invoke-static {v0, p0}, LM/s;->h(LM/l;LM/x;)LM/l;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LM/x;)LM/l;
    .locals 5

    invoke-interface {p0}, LM/x;->d()LM/l;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LM/r$a;->d:LM/r;

    invoke-interface {v0, p0}, LM/r;->a(LM/x;)LM/l;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, LM/x;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LM/l;->e()LM/l$a;

    move-result-object v1

    invoke-interface {p0}, LM/x;->k()LM/k;

    move-result-object v2

    invoke-static {p0, v2, v1}, LM/s;->c(LM/x;LM/k;LM/l$a;)LM/l$a;

    move-result-object v2

    invoke-virtual {v0}, LM/l;->c()LM/l$a;

    move-result-object v3

    move-object v4, v3

    move-object v3, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LM/l;->c()LM/l$a;

    move-result-object v1

    invoke-interface {p0}, LM/x;->h()LM/k;

    move-result-object v2

    invoke-static {p0, v2, v1}, LM/s;->c(LM/x;LM/k;LM/l$a;)LM/l$a;

    move-result-object v2

    invoke-virtual {v0}, LM/l;->e()LM/l$a;

    move-result-object v3

    move-object v4, v2

    :goto_0
    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-interface {p0}, LM/x;->i()LM/e;

    move-result-object v0

    sget-object v1, LM/e;->CROSSED:LM/e;

    if-eq v0, v1, :cond_4

    invoke-interface {p0}, LM/x;->i()LM/e;

    move-result-object v0

    sget-object v1, LM/e;->COLLAPSED:LM/e;

    if-ne v0, v1, :cond_3

    invoke-virtual {v3}, LM/l$a;->c()I

    move-result v0

    invoke-virtual {v4}, LM/l$a;->c()I

    move-result v1

    if-le v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :goto_2
    new-instance v1, LM/l;

    invoke-direct {v1, v3, v4, v0}, LM/l;-><init>(LM/l$a;LM/l$a;Z)V

    invoke-static {v1, p0}, LM/s;->h(LM/l;LM/x;)LM/l;

    move-result-object v0

    :goto_3
    return-object v0
.end method

.method private static final h(LM/x;)LM/l;
    .locals 4

    new-instance v0, LM/l;

    invoke-interface {p0}, LM/x;->k()LM/k;

    move-result-object v1

    invoke-interface {p0}, LM/x;->k()LM/k;

    move-result-object v2

    invoke-virtual {v2}, LM/k;->g()I

    move-result v2

    invoke-virtual {v1, v2}, LM/k;->a(I)LM/l$a;

    move-result-object v1

    invoke-interface {p0}, LM/x;->h()LM/k;

    move-result-object v2

    invoke-interface {p0}, LM/x;->h()LM/k;

    move-result-object v3

    invoke-virtual {v3}, LM/k;->e()I

    move-result v3

    invoke-virtual {v2, v3}, LM/k;->a(I)LM/l$a;

    move-result-object v2

    invoke-interface {p0}, LM/x;->i()LM/e;

    move-result-object p0

    sget-object v3, LM/e;->CROSSED:LM/e;

    if-ne p0, v3, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, p0}, LM/l;-><init>(LM/l$a;LM/l$a;Z)V

    return-object v0
.end method

.method private static final i(LM/x;)LM/l;
    .locals 1

    sget-object v0, LM/r$a$a;->a:LM/r$a$a;

    invoke-static {p0, v0}, LM/s;->a(LM/x;LM/c;)LM/l;

    move-result-object p0

    return-object p0
.end method

.method private static final j(LM/x;)LM/l;
    .locals 1

    sget-object v0, LM/r$a$b;->a:LM/r$a$b;

    invoke-static {p0, v0}, LM/s;->a(LM/x;LM/c;)LM/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final k()LM/r;
    .locals 1

    sget-object v0, LM/r$a;->c:LM/r;

    return-object v0
.end method

.method public final l()LM/r;
    .locals 1

    sget-object v0, LM/r$a;->f:LM/r;

    return-object v0
.end method

.method public final m()LM/r;
    .locals 1

    sget-object v0, LM/r$a;->b:LM/r;

    return-object v0
.end method

.method public final n()LM/r;
    .locals 1

    sget-object v0, LM/r$a;->e:LM/r;

    return-object v0
.end method

.method public final o()LM/r;
    .locals 1

    sget-object v0, LM/r$a;->d:LM/r;

    return-object v0
.end method
