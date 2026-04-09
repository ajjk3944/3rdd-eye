.class public final LZ2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ2/g$a;
    }
.end annotation


# instance fields
.field private final a:LIi/N;

.field private final b:LLi/y;

.field private final c:LT/q0;

.field private final d:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LIi/N;)V
    .locals 3

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ2/g;->a:LIi/N;

    const/4 p1, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1, v2}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p1

    iput-object p1, p0, LZ2/g;->b:LLi/y;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x2

    invoke-static {p1, v2, v0, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LZ2/g;->c:LT/q0;

    invoke-static {p1, v2, v0, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LZ2/g;->d:LT/q0;

    return-void
.end method

.method public static final synthetic a(LZ2/g;)LLi/y;
    .locals 0

    iget-object p0, p0, LZ2/g;->b:LLi/y;

    return-object p0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, LZ2/g;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c(Landroid/webkit/WebView;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, LZ2/g$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ2/g$b;

    iget v1, v0, LZ2/g$b;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ2/g$b;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ2/g$b;

    invoke-direct {v0, p0, p2}, LZ2/g$b;-><init>(LZ2/g;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LZ2/g$b;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ2/g$b;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object p2

    new-instance v2, LZ2/g$c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, LZ2/g$c;-><init>(LZ2/g;Landroid/webkit/WebView;Ldh/e;)V

    iput v3, v0, LZ2/g$b;->c:I

    invoke-static {p2, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final d(Z)V
    .locals 1

    iget-object v0, p0, LZ2/g;->c:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Z)V
    .locals 1

    iget-object v0, p0, LZ2/g;->d:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
