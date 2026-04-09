.class final LN/y$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/y$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LIi/N;

.field final synthetic c:LN/W;


# direct methods
.method constructor <init>(Ljava/util/List;LIi/N;LN/W;)V
    .locals 0

    iput-object p1, p0, LN/y$b$a;->a:Ljava/util/List;

    iput-object p2, p0, LN/y$b$a;->b:LIi/N;

    iput-object p3, p0, LN/y$b$a;->c:LN/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly/j;

    invoke-virtual {p0, p1, p2}, LN/y$b$a;->b(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of p2, p1, Ly/g;

    if-eqz p2, :cond_0

    iget-object p2, p0, LN/y$b$a;->a:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of p2, p1, Ly/h;

    if-eqz p2, :cond_1

    iget-object p2, p0, LN/y$b$a;->a:Ljava/util/List;

    check-cast p1, Ly/h;

    invoke-virtual {p1}, Ly/h;->a()Ly/g;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of p2, p1, Ly/d;

    if-eqz p2, :cond_2

    iget-object p2, p0, LN/y$b$a;->a:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    instance-of p2, p1, Ly/e;

    if-eqz p2, :cond_3

    iget-object p2, p0, LN/y$b$a;->a:Ljava/util/List;

    check-cast p1, Ly/e;

    invoke-virtual {p1}, Ly/e;->a()Ly/d;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    instance-of p2, p1, Ly/o$b;

    if-eqz p2, :cond_4

    iget-object p2, p0, LN/y$b$a;->a:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    instance-of p2, p1, Ly/o$c;

    if-eqz p2, :cond_5

    iget-object p2, p0, LN/y$b$a;->a:Ljava/util/List;

    check-cast p1, Ly/o$c;

    invoke-virtual {p1}, Ly/o$c;->a()Ly/o$b;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    instance-of p2, p1, Ly/o$a;

    if-eqz p2, :cond_6

    iget-object p2, p0, LN/y$b$a;->a:Ljava/util/List;

    check-cast p1, Ly/o$a;

    invoke-virtual {p1}, Ly/o$a;->a()Ly/o$b;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_6
    :goto_0
    iget-object p1, p0, LN/y$b$a;->a:Ljava/util/List;

    invoke-static {p1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly/j;

    iget-object v0, p0, LN/y$b$a;->b:LIi/N;

    new-instance v3, LN/y$b$a$a;

    iget-object p2, p0, LN/y$b$a;->c:LN/W;

    const/4 v1, 0x0

    invoke-direct {v3, p2, p1, v1}, LN/y$b$a$a;-><init>(LN/W;Ly/j;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
