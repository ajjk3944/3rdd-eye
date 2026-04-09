.class final LLi/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/s;->b(LLi/g;I)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:I

.field final synthetic c:LLi/h;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;ILLi/h;)V
    .locals 0

    iput-object p1, p0, LLi/s$b;->a:Lkotlin/jvm/internal/L;

    iput p2, p0, LLi/s$b;->b:I

    iput-object p3, p0, LLi/s$b;->c:LLi/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, LLi/s$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LLi/s$b$a;

    iget v1, v0, LLi/s$b$a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LLi/s$b$a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, LLi/s$b$a;

    invoke-direct {v0, p0, p2}, LLi/s$b$a;-><init>(LLi/s$b;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LLi/s$b$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LLi/s$b$a;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LLi/s$b;->a:Lkotlin/jvm/internal/L;

    iget v2, p2, Lkotlin/jvm/internal/L;->a:I

    iget v4, p0, LLi/s$b;->b:I

    if-lt v2, v4, :cond_4

    iget-object p2, p0, LLi/s$b;->c:LLi/h;

    iput v3, v0, LLi/s$b$a;->c:I

    invoke-interface {p2, p1, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    add-int/2addr v2, v3

    iput v2, p2, Lkotlin/jvm/internal/L;->a:I

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
