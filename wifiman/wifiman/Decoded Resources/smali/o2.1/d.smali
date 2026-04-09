.class public abstract Lo2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo2/d;->a:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a([Ljava/lang/String;Lm2/q;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lo2/d;->h([Ljava/lang/String;Lm2/q;Lgg/j;)V

    return-void
.end method

.method public static synthetic b(Lm2/q;Landroidx/room/c$c;)V
    .locals 0

    invoke-static {p0, p1}, Lo2/d;->g(Lm2/q;Landroidx/room/c$c;)V

    return-void
.end method

.method public static synthetic c(Lgg/n;Ljava/lang/Object;)Lgg/r;
    .locals 0

    invoke-static {p0, p1}, Lo2/d;->i(Lgg/n;Ljava/lang/Object;)Lgg/r;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lm2/q;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lgg/i;
    .locals 0

    invoke-static {p0, p1}, Lo2/d;->f(Lm2/q;Z)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p1}, LGg/a;->b(Ljava/util/concurrent/Executor;)Lgg/y;

    move-result-object p1

    invoke-static {p3}, Lgg/n;->m(Ljava/util/concurrent/Callable;)Lgg/n;

    move-result-object p3

    invoke-static {p0, p2}, Lo2/d;->e(Lm2/q;[Ljava/lang/String;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0, p1}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0, p1}, Lgg/i;->g2(Lgg/y;)Lgg/i;

    move-result-object p0

    invoke-virtual {p0, p1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p0

    new-instance p1, Lo2/a;

    invoke-direct {p1, p3}, Lo2/a;-><init>(Lgg/n;)V

    invoke-virtual {p0, p1}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static varargs e(Lm2/q;[Ljava/lang/String;)Lgg/i;
    .locals 1

    new-instance v0, Lo2/b;

    invoke-direct {v0, p1, p0}, Lo2/b;-><init>([Ljava/lang/String;Lm2/q;)V

    sget-object p0, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v0, p0}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lm2/q;Z)Ljava/util/concurrent/Executor;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lm2/q;->q()Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lm2/q;->n()Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(Lm2/q;Landroidx/room/c$c;)V
    .locals 0

    invoke-virtual {p0}, Lm2/q;->l()Landroidx/room/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/room/c;->n(Landroidx/room/c$c;)V

    return-void
.end method

.method private static synthetic h([Ljava/lang/String;Lm2/q;Lgg/j;)V
    .locals 1

    new-instance v0, Lo2/d$a;

    invoke-direct {v0, p0, p2}, Lo2/d$a;-><init>([Ljava/lang/String;Lgg/j;)V

    invoke-interface {p2}, Lgg/j;->isCancelled()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lm2/q;->l()Landroidx/room/c;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/room/c;->c(Landroidx/room/c$c;)V

    new-instance p0, Lo2/c;

    invoke-direct {p0, p1, v0}, Lo2/c;-><init>(Lm2/q;Landroidx/room/c$c;)V

    invoke-static {p0}, Lhg/c;->p(Lkg/a;)Lhg/c;

    move-result-object p0

    invoke-interface {p2, p0}, Lgg/j;->g(Lhg/c;)V

    :cond_0
    invoke-interface {p2}, Lgg/j;->isCancelled()Z

    move-result p0

    if-nez p0, :cond_1

    sget-object p0, Lo2/d;->a:Ljava/lang/Object;

    invoke-interface {p2, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private static synthetic i(Lgg/n;Ljava/lang/Object;)Lgg/r;
    .locals 0

    return-object p0
.end method
