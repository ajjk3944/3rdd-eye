.class final LN/L0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/L0;->c(Landroidx/compose/ui/e;Lmh/p;ZLm0/i1;JJFLmh/p;LT/l;II)V
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

    iput-object p1, p0, LN/L0$d;->a:Lmh/p;

    iput-object p2, p0, LN/L0$d;->b:Lmh/p;

    iput-boolean p3, p0, LN/L0$d;->c:Z

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:100)"

    const v2, -0x7c3ab304

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object p2

    sget-object v0, LN/r;->a:LN/r;

    const/4 v1, 0x6

    invoke-virtual {v0, p1, v1}, LN/r;->c(LT/l;I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2, v0}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p2

    new-instance v0, LN/L0$d$a;

    iget-object v1, p0, LN/L0$d;->a:Lmh/p;

    iget-object v2, p0, LN/L0$d;->b:Lmh/p;

    iget-boolean v3, p0, LN/L0$d;->c:Z

    invoke-direct {v0, v1, v2, v3}, LN/L0$d$a;-><init>(Lmh/p;Lmh/p;Z)V

    const/16 v1, 0x36

    const v2, 0x739851bc

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p1, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    sget v1, LT/I0;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/L0$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
