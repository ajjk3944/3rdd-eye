.class public final LG8/g$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/g$g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LLi/h;

.field final synthetic b:LG8/g;


# direct methods
.method public constructor <init>(LLi/h;LG8/g;)V
    .locals 0

    iput-object p1, p0, LG8/g$g$a;->a:LLi/h;

    iput-object p2, p0, LG8/g$g$a;->b:LG8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, LG8/g$g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LG8/g$g$a$a;

    iget v1, v0, LG8/g$g$a$a;->b:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LG8/g$g$a$a;->b:I

    goto :goto_0

    :cond_0
    new-instance v0, LG8/g$g$a$a;

    invoke-direct {v0, p0, p2}, LG8/g$g$a$a;-><init>(LG8/g$g$a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LG8/g$g$a$a;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LG8/g$g$a$a;->b:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LG8/g$g$a;->a:LLi/h;

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v2, LL8/j;->a:LL8/j;

    invoke-virtual {v2, p1}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v5

    if-eqz v5, :cond_3

    new-instance p1, Ls9/c$b;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v10}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, LG8/g$g$a;->b:LG8/g;

    invoke-static {p1}, LG8/g;->v0(LG8/g;)Ls9/c$a;

    move-result-object p1

    :goto_1
    iput v3, v0, LG8/g$g$a$a;->b:I

    invoke-interface {p2, p1, v0}, LLi/h;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
