.class final Lxe/e$a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/e$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/n0;

.field final synthetic b:LIi/N;

.field final synthetic c:Lf2/w;

.field final synthetic d:Lf2/w;

.field final synthetic e:LT/z1;


# direct methods
.method constructor <init>(LN/n0;LIi/N;Lf2/w;Lf2/w;LT/z1;)V
    .locals 0

    iput-object p1, p0, Lxe/e$a$b$a$a;->a:LN/n0;

    iput-object p2, p0, Lxe/e$a$b$a$a;->b:LIi/N;

    iput-object p3, p0, Lxe/e$a$b$a$a;->c:Lf2/w;

    iput-object p4, p0, Lxe/e$a$b$a$a;->d:Lf2/w;

    iput-object p5, p0, Lxe/e$a$b$a$a;->e:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxe/f$a;

    invoke-virtual {p0, p1, p2}, Lxe/e$a$b$a$a;->b(Lxe/f$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lxe/f$a;Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of p2, p1, Lxe/f$a$a;

    if-eqz p2, :cond_1

    iget-object p1, p0, Lxe/e$a$b$a$a;->a:LN/n0;

    invoke-virtual {p1}, LN/n0;->g()LN/o0;

    move-result-object p1

    sget-object p2, LN/o0;->Expanded:LN/o0;

    if-ne p1, p2, :cond_0

    iget-object v0, p0, Lxe/e$a$b$a$a;->b:LIi/N;

    new-instance v3, Lxe/e$a$b$a$a$a;

    iget-object p1, p0, Lxe/e$a$b$a$a;->a:LN/n0;

    const/4 p2, 0x0

    invoke-direct {v3, p1, p2}, Lxe/e$a$b$a$a$a;-><init>(LN/n0;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lxe/e$a$b$a$a;->c:Lf2/w;

    invoke-virtual {p1}, Lf2/n;->Z()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lxe/f$a$b$a;

    if-eqz p2, :cond_2

    check-cast p1, Lxe/f$a$b$a;

    invoke-virtual {p1}, Lxe/f$a$b$a;->a()Lxe/F;

    move-result-object p1

    iget-object p2, p0, Lxe/e$a$b$a$a;->c:Lf2/w;

    iget-object v0, p0, Lxe/e$a$b$a$a;->d:Lf2/w;

    iget-object v1, p0, Lxe/e$a$b$a$a;->e:LT/z1;

    invoke-static {v1}, Lxe/e;->i(LT/z1;)LQe/d;

    move-result-object v1

    invoke-static {p1, p2, v0, v1}, Lxe/B;->L(Lxe/F;Lf2/n;Lf2/n;LQe/d;)V

    sget-object p1, LYg/J;->a:LYg/J;

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
