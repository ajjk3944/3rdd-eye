.class final Lr/O$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/O$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;

.field final synthetic b:Lr/O;

.field final synthetic c:Lkotlin/jvm/internal/K;

.field final synthetic d:LIi/N;


# direct methods
.method constructor <init>(LT/q0;Lr/O;Lkotlin/jvm/internal/K;LIi/N;)V
    .locals 0

    iput-object p1, p0, Lr/O$b$a;->a:LT/q0;

    iput-object p2, p0, Lr/O$b$a;->b:Lr/O;

    iput-object p3, p0, Lr/O$b$a;->c:Lkotlin/jvm/internal/K;

    iput-object p4, p0, Lr/O$b$a;->d:LIi/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 6

    iget-object v0, p0, Lr/O$b$a;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/z1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    iget-object v2, p0, Lr/O$b$a;->b:Lr/O;

    invoke-static {v2}, Lr/O;->a(Lr/O;)J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v2, v2, v4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lr/O$b$a;->c:Lkotlin/jvm/internal/K;

    iget v2, v2, Lkotlin/jvm/internal/K;->a:F

    iget-object v4, p0, Lr/O$b$a;->d:LIi/N;

    invoke-interface {v4}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object v4

    invoke-static {v4}, Lr/m0;->n(Ldh/i;)F

    move-result v4

    cmpg-float v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lr/O$b$a;->b:Lr/O;

    invoke-static {v2, p1, p2}, Lr/O;->e(Lr/O;J)V

    iget-object p1, p0, Lr/O$b$a;->b:Lr/O;

    invoke-static {p1}, Lr/O;->b(Lr/O;)LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result p2

    if-lez p2, :cond_3

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    move v2, v3

    :cond_2
    aget-object v4, p1, v2

    check-cast v4, Lr/O$a;

    invoke-virtual {v4}, Lr/O$a;->q()V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, p2, :cond_2

    :cond_3
    iget-object p1, p0, Lr/O$b$a;->c:Lkotlin/jvm/internal/K;

    iget-object p2, p0, Lr/O$b$a;->d:LIi/N;

    invoke-interface {p2}, LIi/N;->getCoroutineContext()Ldh/i;

    move-result-object p2

    invoke-static {p2}, Lr/m0;->n(Ldh/i;)F

    move-result p2

    iput p2, p1, Lkotlin/jvm/internal/K;->a:F

    :goto_1
    iget-object p1, p0, Lr/O$b$a;->c:Lkotlin/jvm/internal/K;

    iget p1, p1, Lkotlin/jvm/internal/K;->a:F

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-nez p1, :cond_5

    iget-object p1, p0, Lr/O$b$a;->b:Lr/O;

    invoke-static {p1}, Lr/O;->b(Lr/O;)LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result p2

    if-lez p2, :cond_6

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    :cond_4
    aget-object v0, p1, v3

    check-cast v0, Lr/O$a;

    invoke-virtual {v0}, Lr/O$a;->s()V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, p2, :cond_4

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lr/O$b$a;->b:Lr/O;

    invoke-static {p1}, Lr/O;->a(Lr/O;)J

    move-result-wide p1

    sub-long/2addr v0, p1

    long-to-float p1, v0

    iget-object p2, p0, Lr/O$b$a;->c:Lkotlin/jvm/internal/K;

    iget p2, p2, Lkotlin/jvm/internal/K;->a:F

    div-float/2addr p1, p2

    float-to-long p1, p1

    iget-object v0, p0, Lr/O$b$a;->b:Lr/O;

    invoke-static {v0, p1, p2}, Lr/O;->c(Lr/O;J)V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lr/O$b$a;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
