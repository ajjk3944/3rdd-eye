.class final LX9/c$e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/c$e;->a(LEb/r;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LX9/c;

.field final synthetic c:LEb/r;


# direct methods
.method constructor <init>(LX9/c;LEb/r;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LX9/c$e$a;->b:LX9/c;

    iput-object p2, p0, LX9/c$e$a;->c:LEb/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n()Ljava/lang/String;
    .locals 1

    invoke-static {}, LX9/c$e$a;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final t()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "MFA successful"

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LX9/c$e$a;

    iget-object v0, p0, LX9/c$e$a;->b:LX9/c;

    iget-object v1, p0, LX9/c$e$a;->c:LEb/r;

    invoke-direct {p1, v0, v1, p2}, LX9/c$e$a;-><init>(LX9/c;LEb/r;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LX9/c$e$a;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LX9/c$e$a;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, LX9/d;

    invoke-direct {p1}, LX9/d;-><init>()V

    invoke-static {p1}, LS9/a;->d(Lmh/a;)V

    iget-object p1, p0, LX9/c$e$a;->b:LX9/c;

    sget-object v0, Lga/a;->a:Lga/a;

    iget-object v1, p0, LX9/c$e$a;->c:LEb/r;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v2, p0, LX9/c$e$a;->b:LX9/c;

    invoke-static {v2}, LX9/c;->O0(LX9/c;)Lcom/ui/core/ui/sso/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v2

    iget-object v3, p0, LX9/c$e$a;->b:LX9/c;

    invoke-static {v3}, LX9/c;->O0(LX9/c;)Lcom/ui/core/ui/sso/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/core/ui/sso/c;->e()Lcom/ui/core/ui/sso/UiSSO$e;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lga/a;->b(Lga/a;LEb/r;LGb/f;Lcom/ui/core/ui/sso/UiSSO$e;ZILjava/lang/Object;)Lcom/ui/core/ui/sso/UiSSO$a;

    move-result-object v0

    invoke-virtual {p1, v0}, LW9/e;->q0(Lcom/ui/core/ui/sso/UiSSO$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LX9/c$e$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LX9/c$e$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LX9/c$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
