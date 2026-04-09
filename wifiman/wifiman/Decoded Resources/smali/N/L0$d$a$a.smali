.class final LN/L0$d$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/L0$d$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:Lmh/p;

.field final synthetic c:Z


# direct methods
.method constructor <init>(Lmh/p;Lmh/p;Z)V
    .locals 0

    iput-object p1, p0, LN/L0$d$a$a;->a:Lmh/p;

    iput-object p2, p0, LN/L0$d$a$a;->b:Lmh/p;

    iput-boolean p3, p0, LN/L0$d$a$a;->c:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:103)"

    const v2, 0xd6af9ad

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LN/L0$d$a$a;->a:Lmh/p;

    const/4 v0, 0x0

    if-nez p2, :cond_3

    const p2, 0x6e5385c1

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LN/L0$d$a$a;->b:Lmh/p;

    invoke-static {p2, p1, v0}, LN/L0;->h(Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_1

    :cond_3
    iget-boolean p2, p0, LN/L0$d$a$a;->c:Z

    if-eqz p2, :cond_4

    const p2, 0x6e538dee

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LN/L0$d$a$a;->b:Lmh/p;

    iget-object v1, p0, LN/L0$d$a$a;->a:Lmh/p;

    invoke-static {p2, v1, p1, v0}, LN/L0;->f(Lmh/p;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_1

    :cond_4
    const p2, 0x6e539647

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LN/L0$d$a$a;->b:Lmh/p;

    iget-object v1, p0, LN/L0$d$a$a;->a:Lmh/p;

    invoke-static {p2, v1, p1, v0}, LN/L0;->g(Lmh/p;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/L0$d$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
