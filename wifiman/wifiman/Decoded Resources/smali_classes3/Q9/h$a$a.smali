.class final LQ9/h$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ9/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lf2/w;

.field final synthetic d:Lmh/a;

.field final synthetic e:Landroid/app/Activity;

.field final synthetic f:Ljava/lang/String;


# direct methods
.method constructor <init>(Lf2/w;Lmh/a;Landroid/app/Activity;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQ9/h$a$a;->c:Lf2/w;

    iput-object p2, p0, LQ9/h$a$a;->d:Lmh/a;

    iput-object p3, p0, LQ9/h$a$a;->e:Landroid/app/Activity;

    iput-object p4, p0, LQ9/h$a$a;->f:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method private static final E(Lf2/G;)LYg/J;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/G;->c(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic n(Lf2/G;)LYg/J;
    .locals 0

    invoke-static {p0}, LQ9/h$a$a;->E(Lf2/G;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ljava/lang/String;Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LQ9/h$a$a;->v(Ljava/lang/String;Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Ljava/lang/String;Lf2/z;)LYg/J;
    .locals 1

    new-instance v0, LQ9/g;

    invoke-direct {v0}, LQ9/g;-><init>()V

    invoke-virtual {p1, p0, v0}, Lf2/z;->d(Ljava/lang/String;Lmh/l;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, LQ9/h$a$a;

    iget-object v1, p0, LQ9/h$a$a;->c:Lf2/w;

    iget-object v2, p0, LQ9/h$a$a;->d:Lmh/a;

    iget-object v3, p0, LQ9/h$a$a;->e:Landroid/app/Activity;

    iget-object v4, p0, LQ9/h$a$a;->f:Ljava/lang/String;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LQ9/h$a$a;-><init>(Lf2/w;Lmh/a;Landroid/app/Activity;Ljava/lang/String;Ldh/e;)V

    iput-object p1, v6, LQ9/h$a$a;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ9/j$a;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LQ9/h$a$a;->t(LQ9/j$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LQ9/h$a$a;->a:I

    if-nez v0, :cond_6

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LQ9/h$a$a;->b:Ljava/lang/Object;

    check-cast p1, LQ9/j$a;

    instance-of v0, p1, LQ9/j$a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, LQ9/h$a$a;->c:Lf2/w;

    invoke-virtual {p1}, Lf2/n;->Z()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, LQ9/h$a$a;->d:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, LQ9/j$a$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, LQ9/h$a$a;->c:Lf2/w;

    check-cast p1, LQ9/j$a$c;

    invoke-virtual {p1}, LQ9/j$a$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LQ9/j$a$c;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, p1}, LQ9/i;->b(Lf2/n;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, LQ9/h$a$a;->c:Lf2/w;

    invoke-virtual {p1}, Lf2/n;->Z()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, LQ9/h$a$a;->d:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    instance-of v0, p1, LQ9/j$a$d;

    if-eqz v0, :cond_2

    iget-object v1, p0, LQ9/h$a$a;->c:Lf2/w;

    check-cast p1, LQ9/j$a$d;

    invoke-virtual {p1}, LQ9/j$a$d;->a()LQ9/j$b;

    move-result-object p1

    invoke-interface {p1}, LQ9/j$b;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lf2/n;->W(Lf2/n;Ljava/lang/String;Lf2/y;Lf2/D$a;ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, LQ9/j$a$b;

    if-eqz v0, :cond_3

    iget-object v1, p0, LQ9/h$a$a;->c:Lf2/w;

    check-cast p1, LQ9/j$a$b;

    invoke-virtual {p1}, LQ9/j$a$b;->a()LQ9/j$b;

    move-result-object v0

    invoke-interface {v0}, LQ9/j$b;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lf2/n;->d0(Lf2/n;Ljava/lang/String;ZZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LQ9/h$a$a;->c:Lf2/w;

    invoke-virtual {p1}, LQ9/j$a$b;->a()LQ9/j$b;

    move-result-object p1

    invoke-interface {p1}, LQ9/j$b;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, LQ9/h$a$a;->f:Ljava/lang/String;

    new-instance v2, LQ9/f;

    invoke-direct {v2, v1}, LQ9/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, v2}, Lf2/n;->V(Ljava/lang/String;Lmh/l;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, LQ9/j$a$e;

    if-eqz v0, :cond_5

    iget-object v0, p0, LQ9/h$a$a;->e:Landroid/app/Activity;

    new-instance v1, Landroid/content/Intent;

    check-cast p1, LQ9/j$a$e;

    invoke-virtual {p1}, LQ9/j$a$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string/jumbo v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_4
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(LQ9/j$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LQ9/h$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LQ9/h$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LQ9/h$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
