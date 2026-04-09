.class public final Lcom/ui/sso/auth/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/auth/UiAuthSerializer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/auth/b$a;,
        Lcom/ui/sso/auth/b$b;,
        Lcom/ui/sso/auth/b$c;
    }
.end annotation


# static fields
.field public static final c:Lcom/ui/sso/auth/b$a;


# instance fields
.field private final a:Laj/b;

.field private final b:Laj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/auth/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/auth/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/auth/b;->c:Lcom/ui/sso/auth/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/ui/sso/auth/b$e;->a:Lcom/ui/sso/auth/b$e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/sso/auth/b;->a:Laj/b;

    sget-object v0, Lcom/ui/sso/auth/b$d;->a:Lcom/ui/sso/auth/b$d;

    invoke-static {v1, v0, v2, v1}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/sso/auth/b;->b:Laj/b;

    return-void
.end method

.method private final c(Lcom/ui/sso/auth/d$b;)Lcom/ui/sso/auth/b$b;
    .locals 8

    new-instance v7, Lcom/ui/sso/auth/b$b;

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->d()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->e()Ljava/lang/String;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ui/sso/auth/b$b;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method private final d(Lcom/ui/sso/auth/b$b;)Lcom/ui/sso/auth/d$b;
    .locals 8

    new-instance v7, Lcom/ui/sso/auth/d$b;

    invoke-virtual {p1}, Lcom/ui/sso/auth/b$b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/sso/auth/b$b;->d()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/sso/auth/b$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/sso/auth/b$b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/sso/auth/b$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/ui/sso/auth/b$b;->e()Ljava/lang/String;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ui/sso/auth/d$b;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method private final e(Ljava/lang/String;)Lcom/ui/sso/auth/d;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/sso/auth/b;->b:Laj/b;

    invoke-interface {v0}, LVi/l;->a()Lcj/e;

    move-result-object v1

    const-class v2, Lcom/ui/sso/auth/b$b;

    invoke-static {v2}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v2

    invoke-static {v1, v2}, LVi/w;->c(Lcj/e;Lth/p;)LVi/b;

    move-result-object v1

    invoke-interface {v0, v1, p1}, LVi/A;->b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/auth/b$b;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lcom/ui/sso/auth/d;

    invoke-direct {p0, p1}, Lcom/ui/sso/auth/b;->d(Lcom/ui/sso/auth/b$b;)Lcom/ui/sso/auth/d$b;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/sso/auth/d;-><init>(Lcom/ui/sso/auth/d$b;)V

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/sso/auth/UiAuthSerializer$Error;

    const-string/jumbo v1, "PKCE Auth deserialization failed"

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/auth/UiAuthSerializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final f(Ljava/lang/String;)Lcom/ui/sso/auth/e;
    .locals 1

    new-instance v0, Lcom/ui/sso/auth/e;

    invoke-direct {v0, p1}, Lcom/ui/sso/auth/e;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private final g(Ljava/lang/String;)Lcom/ui/sso/auth/c;
    .locals 4

    new-instance v0, Lcom/ui/sso/auth/c;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, ";"

    invoke-static {p1, v3, v1, v2, v1}, Lkotlin/text/t;->l1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {p1, v3, v2}, Lkotlin/text/t;->b1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/t;->s(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/auth/c;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method private final h(Lcom/ui/sso/auth/c;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p1}, Lcom/ui/sso/auth/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/sso/auth/c;->c()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ";"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final i(Lcom/ui/sso/auth/d;)Ljava/lang/String;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/sso/auth/b;->a:Laj/b;

    invoke-virtual {p1}, Lcom/ui/sso/auth/d;->c()Lcom/ui/sso/auth/d$b;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ui/sso/auth/b;->c(Lcom/ui/sso/auth/d$b;)Lcom/ui/sso/auth/b$b;

    move-result-object p1

    invoke-interface {v0}, LVi/l;->a()Lcj/e;

    move-result-object v1

    const-class v2, Lcom/ui/sso/auth/b$b;

    invoke-static {v2}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v2

    invoke-static {v1, v2}, LVi/w;->c(Lcj/e;Lth/p;)LVi/b;

    move-result-object v1

    invoke-interface {v0, v1, p1}, LVi/A;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/sso/auth/UiAuthSerializer$Error;

    const-string/jumbo v1, "PKCE Auth serialization failed"

    invoke-direct {v0, v1, p1}, Lcom/ui/sso/auth/UiAuthSerializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final j(Lcom/ui/sso/auth/e;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/ui/sso/auth/e;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Lcom/ui/sso/auth/a;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "auth"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/sso/auth/c;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/sso/auth/c;

    invoke-direct {p0, p1}, Lcom/ui/sso/auth/b;->h(Lcom/ui/sso/auth/c;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/sso/auth/d;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/sso/auth/d;

    invoke-direct {p0, p1}, Lcom/ui/sso/auth/b;->i(Lcom/ui/sso/auth/d;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/sso/auth/e;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/sso/auth/e;

    invoke-direct {p0, p1}, Lcom/ui/sso/auth/b;->j(Lcom/ui/sso/auth/e;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public b(Ljava/lang/String;Lcom/ui/sso/auth/a$a;)Lcom/ui/sso/auth/a;
    .locals 1

    const-string/jumbo v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/sso/auth/b$c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    invoke-direct {p0, p1}, Lcom/ui/sso/auth/b;->f(Ljava/lang/String;)Lcom/ui/sso/auth/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1}, Lcom/ui/sso/auth/b;->e(Ljava/lang/String;)Lcom/ui/sso/auth/d;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Lcom/ui/sso/auth/b;->g(Ljava/lang/String;)Lcom/ui/sso/auth/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method
