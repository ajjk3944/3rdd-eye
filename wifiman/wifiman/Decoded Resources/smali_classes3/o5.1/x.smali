.class public final Lo5/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/sessions/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/x$c;,
        Lo5/x$d;
    }
.end annotation


# static fields
.field private static final f:Lo5/x$c;

.field private static final g:Lph/c;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ldh/i;

.field private final d:Ljava/util/concurrent/atomic/AtomicReference;

.field private final e:LLi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lo5/x$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo5/x$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo5/x;->f:Lo5/x$c;

    sget-object v0, Lo5/w;->a:Lo5/w;

    invoke-virtual {v0}, Lo5/w;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LP1/b;

    sget-object v0, Lo5/x$b;->a:Lo5/x$b;

    invoke-direct {v2, v0}, LP1/b;-><init>(Lmh/l;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LQ1/a;->b(Ljava/lang/String;LP1/b;Lmh/l;LIi/N;ILjava/lang/Object;)Lph/c;

    move-result-object v0

    sput-object v0, Lo5/x;->g:Lph/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldh/i;)V
    .locals 8

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "backgroundDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/x;->b:Landroid/content/Context;

    iput-object p2, p0, Lo5/x;->c:Ldh/i;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo5/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lo5/x;->f:Lo5/x$c;

    invoke-static {v0, p1}, Lo5/x$c;->a(Lo5/x$c;Landroid/content/Context;)LO1/e;

    move-result-object p1

    invoke-interface {p1}, LO1/e;->b()LLi/g;

    move-result-object p1

    new-instance v0, Lo5/x$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo5/x$e;-><init>(Ldh/e;)V

    invoke-static {p1, v0}, LLi/i;->f(LLi/g;Lmh/q;)LLi/g;

    move-result-object p1

    new-instance v0, Lo5/x$f;

    invoke-direct {v0, p1, p0}, Lo5/x$f;-><init>(LLi/g;Lo5/x;)V

    iput-object v0, p0, Lo5/x;->e:LLi/g;

    invoke-static {p2}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v2

    new-instance v5, Lo5/x$a;

    invoke-direct {v5, p0, v1}, Lo5/x$a;-><init>(Lo5/x;Ldh/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public static final synthetic c()Lo5/x$c;
    .locals 1

    sget-object v0, Lo5/x;->f:Lo5/x$c;

    return-object v0
.end method

.method public static final synthetic d(Lo5/x;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lo5/x;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lo5/x;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lo5/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic f()Lph/c;
    .locals 1

    sget-object v0, Lo5/x;->g:Lph/c;

    return-object v0
.end method

.method public static final synthetic g(Lo5/x;)LLi/g;
    .locals 0

    iget-object p0, p0, Lo5/x;->e:LLi/g;

    return-object p0
.end method

.method public static final synthetic h(Lo5/x;LR1/d;)Lo5/l;
    .locals 0

    invoke-direct {p0, p1}, Lo5/x;->i(LR1/d;)Lo5/l;

    move-result-object p0

    return-object p0
.end method

.method private final i(LR1/d;)Lo5/l;
    .locals 2

    new-instance v0, Lo5/l;

    sget-object v1, Lo5/x$d;->a:Lo5/x$d;

    invoke-virtual {v1}, Lo5/x$d;->a()LR1/d$a;

    move-result-object v1

    invoke-virtual {p1, v1}, LR1/d;->b(LR1/d$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Lo5/l;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo5/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo5/l;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 7

    const-string/jumbo v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo5/x;->c:Ldh/i;

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v1

    new-instance v4, Lo5/x$g;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lo5/x$g;-><init>(Lo5/x;Ljava/lang/String;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method
