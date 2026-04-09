.class final LE0/L$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/L$a;->g0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/L$a;

.field final synthetic b:LE0/Q;

.field final synthetic c:LE0/L;


# direct methods
.method constructor <init>(LE0/L$a;LE0/Q;LE0/L;)V
    .locals 0

    iput-object p1, p0, LE0/L$a$b;->a:LE0/L$a;

    iput-object p2, p0, LE0/L$a$b;->b:LE0/Q;

    iput-object p3, p0, LE0/L$a$b;->c:LE0/L;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, LE0/L$a$b;->a:LE0/L$a;

    invoke-static {v0}, LE0/L$a;->U0(LE0/L$a;)V

    iget-object v0, p0, LE0/L$a$b;->a:LE0/L$a;

    sget-object v1, LE0/L$a$b$a;->a:LE0/L$a$b$a;

    invoke-virtual {v0, v1}, LE0/L$a;->Q(Lmh/l;)V

    iget-object v0, p0, LE0/L$a$b;->a:LE0/L$a;

    invoke-virtual {v0}, LE0/L$a;->B()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/P;->L1()Z

    move-result v0

    iget-object v2, p0, LE0/L$a$b;->c:LE0/L;

    invoke-static {v2}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v2

    invoke-virtual {v2}, LE0/G;->H()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LE0/G;

    invoke-virtual {v5}, LE0/G;->m0()LE0/c0;

    move-result-object v5

    invoke-virtual {v5}, LE0/c0;->C2()LE0/Q;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v5, v0}, LE0/P;->S1(Z)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LE0/L$a$b;->b:LE0/Q;

    invoke-virtual {v0}, LE0/Q;->h1()LC0/D;

    move-result-object v0

    invoke-interface {v0}, LC0/D;->q()V

    iget-object v0, p0, LE0/L$a$b;->a:LE0/L$a;

    invoke-virtual {v0}, LE0/L$a;->B()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LE0/P;->L1()Z

    iget-object v0, p0, LE0/L$a$b;->c:LE0/L;

    invoke-static {v0}, LE0/L;->a(LE0/L;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->H()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LE0/G;

    invoke-virtual {v4}, LE0/G;->m0()LE0/c0;

    move-result-object v4

    invoke-virtual {v4}, LE0/c0;->C2()LE0/Q;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v4, v1}, LE0/P;->S1(Z)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v0, p0, LE0/L$a$b;->a:LE0/L$a;

    invoke-static {v0}, LE0/L$a;->T0(LE0/L$a;)V

    iget-object v0, p0, LE0/L$a$b;->a:LE0/L$a;

    sget-object v1, LE0/L$a$b$b;->a:LE0/L$a$b$b;

    invoke-virtual {v0, v1}, LE0/L$a;->Q(Lmh/l;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/L$a$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
