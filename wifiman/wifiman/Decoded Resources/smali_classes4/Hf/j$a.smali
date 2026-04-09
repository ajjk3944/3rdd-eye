.class final LHf/j$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHf/j;->c(LHf/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lf2/w;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lf2/w;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LHf/j$a;->b:Lf2/w;

    iput-object p2, p0, LHf/j$a;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0}, LHf/j$a;->t(Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lf2/z;)LYg/J;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lf2/z;->e(Lf2/z;ILmh/l;ILjava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LHf/j$a;

    iget-object v0, p0, LHf/j$a;->b:Lf2/w;

    iget-object v1, p0, LHf/j$a;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, LHf/j$a;-><init>(Lf2/w;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LHf/j$a;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LHf/j$a;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LHf/j$a;->b:Lf2/w;

    iget-object v0, p0, LHf/j$a;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "empty"

    :cond_0
    new-instance v1, LHf/i;

    invoke-direct {v1}, LHf/i;-><init>()V

    invoke-virtual {p1, v0, v1}, Lf2/n;->V(Ljava/lang/String;Lmh/l;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LHf/j$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LHf/j$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LHf/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
