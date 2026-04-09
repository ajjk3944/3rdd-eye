.class public final LPa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/account/UIAccountManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPa/a$a;,
        LPa/a$b;
    }
.end annotation


# static fields
.field public static final f:LPa/a$a;


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private final b:LOa/a;

.field private final c:LIi/J;

.field private final d:LNa/c;

.field private e:Lcom/ui/sso/account/UIAccountManager$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LPa/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LPa/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LPa/a;->f:LPa/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;LOa/a;LIi/J;)V
    .locals 1

    const-string/jumbo v0, "sharedPref"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "accountManagerChangeRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherIO"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LPa/a;->a:Landroid/content/SharedPreferences;

    .line 3
    iput-object p2, p0, LPa/a;->b:LOa/a;

    .line 4
    iput-object p3, p0, LPa/a;->c:LIi/J;

    .line 5
    sget-object p1, LNa/c;->LOCAL:LNa/c;

    iput-object p1, p0, LPa/a;->d:LNa/c;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;LOa/a;LIi/J;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 6
    sget-object p2, LOa/a;->a:LOa/a$a;

    invoke-virtual {p2}, LOa/a$a;->a()LOa/a;

    move-result-object p2

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3}, LPa/a;-><init>(Landroid/content/SharedPreferences;LOa/a;LIi/J;)V

    return-void
.end method

.method public static final synthetic a(LPa/a;LNa/b;)LPa/a$b;
    .locals 0

    invoke-direct {p0, p1}, LPa/a;->q(LNa/b;)LPa/a$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LPa/a;LPa/a$b;)LNa/b;
    .locals 0

    invoke-direct {p0, p1}, LPa/a;->r(LPa/a$b;)LNa/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(LPa/a;Ljava/util/UUID;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LPa/a;->s(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LPa/a;Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LPa/a;->t(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LPa/a;)LOa/a;
    .locals 0

    iget-object p0, p0, LPa/a;->b:LOa/a;

    return-object p0
.end method

.method public static final synthetic o(LPa/a;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1, p2}, LPa/a;->u(Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(LPa/a;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, LPa/a;->a:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method private final q(LNa/b;)LPa/a$b;
    .locals 4

    new-instance v0, LPa/a$b;

    invoke-virtual {p1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LNa/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LNa/b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LNa/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LPa/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final r(LPa/a$b;)LNa/b;
    .locals 4

    new-instance v0, LNa/b;

    invoke-virtual {p1}, LPa/a$b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v1

    const-string/jumbo v2, "fromString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LPa/a$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LPa/a$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LPa/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LNa/b;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final s(Ljava/util/UUID;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "acc-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final t(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LPa/a$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LPa/a$d;

    iget v1, v0, LPa/a$d;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LPa/a$d;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LPa/a$d;

    invoke-direct {v0, p0, p2}, LPa/a$d;-><init>(LPa/a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LPa/a$d;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LPa/a$d;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LPa/a$d;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/UUID;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iput-object p1, v0, LPa/a$d;->a:Ljava/lang/Object;

    iput v3, v0, LPa/a$d;->d:I

    invoke-virtual {p0, v0}, LPa/a;->f(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LNa/b;

    invoke-virtual {v1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    check-cast v0, LNa/b;

    if-eqz v0, :cond_6

    return-object v0

    :cond_6
    new-instance p2, Lcom/ui/sso/account/UIAccountManager$Error$NotFound;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Account \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' not found"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/ui/sso/account/UIAccountManager$Error$NotFound;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final u(Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "auth-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b(LNa/b;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LPa/a;->c:LIi/J;

    new-instance v1, LPa/a$h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LPa/a$h;-><init>(LPa/a;LNa/b;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public c(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LPa/a;->c:LIi/J;

    new-instance v1, LPa/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LPa/a$c;-><init>(LPa/a;Ljava/util/UUID;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public d()LNa/c;
    .locals 1

    iget-object v0, p0, LPa/a;->d:LNa/c;

    return-object v0
.end method

.method public e(Ldh/e;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public f(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LPa/a;->c:LIi/J;

    new-instance v1, LPa/a$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LPa/a$e;-><init>(LPa/a;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/ui/sso/account/UIAccountManager$a;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LPa/a;->b:LOa/a;

    invoke-interface {v0, p1}, LOa/a;->d(Lcom/ui/sso/account/UIAccountManager$a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LPa/a;->e:Lcom/ui/sso/account/UIAccountManager$a;

    if-eqz v0, :cond_1

    iget-object v1, p0, LPa/a;->b:LOa/a;

    invoke-interface {v1, v0}, LOa/a;->c(Lcom/ui/sso/account/UIAccountManager$a;)V

    :cond_1
    :goto_0
    iput-object p1, p0, LPa/a;->e:Lcom/ui/sso/account/UIAccountManager$a;

    return-void
.end method

.method public h(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LPa/a;->c:LIi/J;

    new-instance v7, LPa/a$i;

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, LPa/a$i;-><init>(LPa/a;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v7, p4}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public i(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LPa/a;->c:LIi/J;

    new-instance v1, LPa/a$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, LPa/a$f;-><init>(LPa/a;Ljava/util/UUID;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v1, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/UUID;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LPa/a;->c:LIi/J;

    new-instance v1, LPa/a$g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, LPa/a$g;-><init>(LPa/a;Ljava/util/UUID;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v1, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
