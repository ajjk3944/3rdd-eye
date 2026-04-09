.class public final Lya/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lya/d$a;
    }
.end annotation


# static fields
.field public static final c:Lya/d$a;


# instance fields
.field private final a:Lxa/a$c;

.field private b:Lxa/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lya/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lya/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lya/d;->c:Lya/d$a;

    return-void
.end method

.method public constructor <init>(Lxa/a$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya/d;->a:Lxa/a$c;

    return-void
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lya/d;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lya/d;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(J)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lya/d;->i(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lya/d;)Lxa/a$c;
    .locals 0

    iget-object p0, p0, Lya/d;->a:Lxa/a$c;

    return-object p0
.end method

.method private static final h()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Source [Local] - load initiated"

    return-object v0
.end method

.method private static final i(J)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Source [Local]  - load finished. Took "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final k()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Source [Local] - sync() skipped since there is nothing to sync"

    return-object v0
.end method


# virtual methods
.method public a(Ldh/e;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Lya/a;

    invoke-direct {p1}, Lya/a;-><init>()V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public b()Lxa/a$b;
    .locals 1

    iget-object v0, p0, Lya/d;->b:Lxa/a$b;

    return-object v0
.end method

.method public c(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lya/d$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lya/d$b;

    iget v1, v0, Lya/d$b;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lya/d$b;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lya/d$b;

    invoke-direct {v0, p0, p1}, Lya/d$b;-><init>(Lya/d;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lya/d$b;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lya/d$b;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, Lya/b;

    invoke-direct {p1}, Lya/b;-><init>()V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object p1

    new-instance v2, Lya/d$c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lya/d$c;-><init>(Lya/d;Ldh/e;)V

    iput v3, v0, Lya/d$b;->c:I

    invoke-static {p1, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    new-instance p1, Lya/c;

    invoke-direct {p1, v0, v1}, Lya/c;-><init>(J)V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public j(Lxa/a$b;)V
    .locals 0

    iput-object p1, p0, Lya/d;->b:Lxa/a$b;

    return-void
.end method
