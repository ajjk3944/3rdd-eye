.class public final LMi/g;
.super LMi/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(LLi/g;Ldh/i;ILKi/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, LMi/f;-><init>(LLi/g;Ldh/i;ILKi/a;)V

    return-void
.end method

.method public synthetic constructor <init>(LLi/g;Ldh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, Ldh/j;->a:Ldh/j;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LKi/a;->SUSPEND:LKi/a;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LMi/g;-><init>(LLi/g;Ldh/i;ILKi/a;)V

    return-void
.end method


# virtual methods
.method protected i(Ldh/i;ILKi/a;)LMi/d;
    .locals 2

    new-instance v0, LMi/g;

    iget-object v1, p0, LMi/f;->d:LLi/g;

    invoke-direct {v0, v1, p1, p2, p3}, LMi/g;-><init>(LLi/g;Ldh/i;ILKi/a;)V

    return-object v0
.end method

.method public k()LLi/g;
    .locals 1

    iget-object v0, p0, LMi/f;->d:LLi/g;

    return-object v0
.end method

.method protected s(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LMi/f;->d:LLi/g;

    invoke-interface {v0, p1, p2}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
