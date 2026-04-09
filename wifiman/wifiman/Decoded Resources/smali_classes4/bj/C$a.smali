.class final Lbj/C$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbj/C;->g()Laj/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Lbj/C;


# direct methods
.method constructor <init>(Lbj/C;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lbj/C$a;->d:Lbj/C;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lbj/C$a;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lbj/C$a;->c:Ljava/lang/Object;

    check-cast p1, LYg/c;

    iget-object v1, p0, Lbj/C$a;->d:Lbj/C;

    invoke-static {v1}, Lbj/C;->a(Lbj/C;)Lbj/a;

    move-result-object v1

    invoke-virtual {v1}, Lbj/a;->F()B

    move-result v1

    if-ne v1, v2, :cond_2

    iget-object p1, p0, Lbj/C$a;->d:Lbj/C;

    invoke-static {p1, v2}, Lbj/C;->d(Lbj/C;Z)Laj/G;

    move-result-object p1

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    iget-object p1, p0, Lbj/C$a;->d:Lbj/C;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lbj/C;->d(Lbj/C;Z)Laj/G;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 v3, 0x6

    if-ne v1, v3, :cond_5

    iget-object v1, p0, Lbj/C$a;->d:Lbj/C;

    iput v2, p0, Lbj/C$a;->b:I

    invoke-static {v1, p1, p0}, Lbj/C;->c(Lbj/C;LYg/c;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Laj/j;

    goto :goto_1

    :cond_5
    const/16 p1, 0x8

    if-ne v1, p1, :cond_6

    iget-object p1, p0, Lbj/C$a;->d:Lbj/C;

    invoke-static {p1}, Lbj/C;->b(Lbj/C;)Laj/j;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_6
    iget-object p1, p0, Lbj/C$a;->d:Lbj/C;

    invoke-static {p1}, Lbj/C;->a(Lbj/C;)Lbj/a;

    move-result-object v0

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, "Can\'t begin reading element, unexpected token"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lbj/a;->z(Lbj/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final n(LYg/c;LYg/J;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance p2, Lbj/C$a;

    iget-object v0, p0, Lbj/C$a;->d:Lbj/C;

    invoke-direct {p2, v0, p3}, Lbj/C$a;-><init>(Lbj/C;Ldh/e;)V

    iput-object p1, p2, Lbj/C$a;->c:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {p2, p1}, Lbj/C$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/c;

    check-cast p2, LYg/J;

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, Lbj/C$a;->n(LYg/c;LYg/J;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
