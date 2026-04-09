.class final Lw/A$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/A;->n(JLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:J

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Lw/A;

.field final synthetic g:Lkotlin/jvm/internal/M;

.field final synthetic h:J


# direct methods
.method constructor <init>(Lw/A;Lkotlin/jvm/internal/M;JLdh/e;)V
    .locals 0

    iput-object p1, p0, Lw/A$b;->f:Lw/A;

    iput-object p2, p0, Lw/A$b;->g:Lkotlin/jvm/internal/M;

    iput-wide p3, p0, Lw/A$b;->h:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Lw/A$b;

    iget-object v1, p0, Lw/A$b;->f:Lw/A;

    iget-object v2, p0, Lw/A$b;->g:Lkotlin/jvm/internal/M;

    iget-wide v3, p0, Lw/A$b;->h:J

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lw/A$b;-><init>(Lw/A;Lkotlin/jvm/internal/M;JLdh/e;)V

    iput-object p1, v6, Lw/A$b;->e:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw/p;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/A$b;->n(Lw/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/A$b;->d:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lw/A$b;->c:J

    iget-object v2, p0, Lw/A$b;->b:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/M;

    iget-object v3, p0, Lw/A$b;->a:Ljava/lang/Object;

    check-cast v3, Lw/A;

    iget-object v4, p0, Lw/A$b;->e:Ljava/lang/Object;

    check-cast v4, Lw/A;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw/A$b;->e:Ljava/lang/Object;

    check-cast p1, Lw/p;

    new-instance v1, Lw/A$b$a;

    iget-object v3, p0, Lw/A$b;->f:Lw/A;

    invoke-direct {v1, v3, p1}, Lw/A$b$a;-><init>(Lw/A;Lw/p;)V

    iget-object v3, p0, Lw/A$b;->f:Lw/A;

    iget-object p1, p0, Lw/A$b;->g:Lkotlin/jvm/internal/M;

    iget-wide v4, p0, Lw/A$b;->h:J

    invoke-static {v3}, Lw/A;->a(Lw/A;)Lw/n;

    move-result-object v6

    iget-wide v7, p1, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v3, v4, v5}, Lw/A;->l(Lw/A;J)F

    move-result v4

    invoke-virtual {v3, v4}, Lw/A;->t(F)F

    move-result v4

    iput-object v3, p0, Lw/A$b;->e:Ljava/lang/Object;

    iput-object v3, p0, Lw/A$b;->a:Ljava/lang/Object;

    iput-object p1, p0, Lw/A$b;->b:Ljava/lang/Object;

    iput-wide v7, p0, Lw/A$b;->c:J

    iput v2, p0, Lw/A$b;->d:I

    invoke-interface {v6, v1, v4, p0}, Lw/n;->a(Lw/v;FLdh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v2, p1

    move-object p1, v1

    move-object v4, v3

    move-wide v0, v7

    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v4, p1}, Lw/A;->t(F)F

    move-result p1

    invoke-static {v3, v0, v1, p1}, Lw/A;->m(Lw/A;JF)J

    move-result-wide v0

    iput-wide v0, v2, Lkotlin/jvm/internal/M;->a:J

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Lw/p;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/A$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/A$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/A$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
