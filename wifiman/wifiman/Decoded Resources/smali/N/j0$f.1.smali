.class final LN/j0$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/j0;->d(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lmh/q;

.field final synthetic c:Lz/Y;


# direct methods
.method constructor <init>(ZLmh/q;Lz/Y;)V
    .locals 0

    iput-boolean p1, p0, LN/j0$f;->a:Z

    iput-object p2, p0, LN/j0$f;->b:Lmh/q;

    iput-object p3, p0, LN/j0$f;->c:Lz/Y;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:162)"

    const v2, 0x46f56d98

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-boolean p2, p0, LN/j0$f;->a:Z

    const/4 v0, 0x6

    if-eqz p2, :cond_3

    const p2, -0xb258b6e

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, LN/r;->a:LN/r;

    invoke-virtual {p2, p1, v0}, LN/r;->c(LT/l;I)F

    move-result p2

    :goto_1
    invoke-interface {p1}, LT/l;->J()V

    goto :goto_2

    :cond_3
    const p2, -0xb25888a

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, LN/r;->a:LN/r;

    invoke-virtual {p2, p1, v0}, LN/r;->b(LT/l;I)F

    move-result p2

    goto :goto_1

    :goto_2
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p2}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p2

    new-instance v0, LN/j0$f$a;

    iget-object v1, p0, LN/j0$f;->b:Lmh/q;

    iget-object v2, p0, LN/j0$f;->c:Lz/Y;

    invoke-direct {v0, v1, v2}, LN/j0$f$a;-><init>(Lmh/q;Lz/Y;)V

    const/16 v1, 0x36

    const v2, -0x65af6da8

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v1, LT/I0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/j0$f;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
