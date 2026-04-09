.class public final LMi/h;
.super LMi/f;
.source "SourceFile"


# instance fields
.field private final e:Lmh/q;


# direct methods
.method public constructor <init>(Lmh/q;LLi/g;Ldh/i;ILKi/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p2, p3, p4, p5}, LMi/f;-><init>(LLi/g;Ldh/i;ILKi/a;)V

    .line 5
    iput-object p1, p0, LMi/h;->e:Lmh/q;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/q;LLi/g;Ldh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 1
    sget-object p3, Ldh/j;->a:Ldh/j;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, -0x2

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 2
    sget-object p5, LKi/a;->SUSPEND:LKi/a;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 3
    invoke-direct/range {v0 .. v5}, LMi/h;-><init>(Lmh/q;LLi/g;Ldh/i;ILKi/a;)V

    return-void
.end method

.method public static final synthetic t(LMi/h;)Lmh/q;
    .locals 0

    iget-object p0, p0, LMi/h;->e:Lmh/q;

    return-object p0
.end method


# virtual methods
.method protected i(Ldh/i;ILKi/a;)LMi/d;
    .locals 7

    new-instance v6, LMi/h;

    iget-object v1, p0, LMi/h;->e:Lmh/q;

    iget-object v2, p0, LMi/f;->d:LLi/g;

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LMi/h;-><init>(Lmh/q;LLi/g;Ldh/i;ILKi/a;)V

    return-object v6
.end method

.method protected s(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LMi/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LMi/h$a;-><init>(LMi/h;LLi/h;Ldh/e;)V

    invoke-static {v0, p2}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
