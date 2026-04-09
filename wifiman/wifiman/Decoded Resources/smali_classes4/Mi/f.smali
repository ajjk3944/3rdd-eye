.class public abstract LMi/f;
.super LMi/d;
.source "SourceFile"


# instance fields
.field protected final d:LLi/g;


# direct methods
.method public constructor <init>(LLi/g;Ldh/i;ILKi/a;)V
    .locals 0

    invoke-direct {p0, p2, p3, p4}, LMi/d;-><init>(Ldh/i;ILKi/a;)V

    iput-object p1, p0, LMi/f;->d:LLi/g;

    return-void
.end method

.method static synthetic p(LMi/f;LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, LMi/d;->b:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    iget-object v1, p0, LMi/d;->a:Ldh/i;

    invoke-static {v0, v1}, LIi/H;->k(Ldh/i;Ldh/i;)Ldh/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, p2}, LMi/f;->s(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_1
    sget-object v2, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {v1, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v3

    invoke-interface {v0, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, v1, p2}, LMi/f;->r(LLi/h;Ldh/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0

    :cond_3
    invoke-super {p0, p1, p2}, LMi/d;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method static synthetic q(LMi/f;LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LMi/x;

    invoke-direct {v0, p1}, LMi/x;-><init>(LKi/w;)V

    invoke-virtual {p0, v0, p2}, LMi/f;->s(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final r(LLi/h;Ldh/i;Ldh/e;)Ljava/lang/Object;
    .locals 8

    invoke-interface {p3}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    invoke-static {p1, v0}, LMi/e;->a(LLi/h;Ldh/i;)LLi/h;

    move-result-object v2

    new-instance v4, LMi/f$a;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, LMi/f$a;-><init>(LMi/f;Ldh/e;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, LMi/e;->c(Ldh/i;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LMi/f;->p(LMi/f;LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected g(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LMi/f;->q(LMi/f;LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract s(LLi/h;Ldh/e;)Ljava/lang/Object;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LMi/f;->d:LLi/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LMi/d;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
