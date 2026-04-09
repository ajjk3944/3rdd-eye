.class final LS6/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS6/i;->b(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:LS6/k;

.field final synthetic c:LU6/a;

.field final synthetic d:I

.field final synthetic e:Lmh/r;

.field final synthetic f:LT/q0;


# direct methods
.method constructor <init>(Ljava/lang/Object;LS6/k;LU6/a;ILmh/r;LT/q0;)V
    .locals 0

    iput-object p1, p0, LS6/i$b;->a:Ljava/lang/Object;

    iput-object p2, p0, LS6/i$b;->b:LS6/k;

    iput-object p3, p0, LS6/i$b;->c:LU6/a;

    iput p4, p0, LS6/i$b;->d:I

    iput-object p5, p0, LS6/i$b;->e:Lmh/r;

    iput-object p6, p0, LS6/i$b;->f:LT/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LT/l;I)V
    .locals 6

    const-string v0, "$this$BoxWithConstraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v2, 0x12

    if-ne v0, v2, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string/jumbo v2, "com.skydoves.landscapist.ImageLoad.<anonymous> (ImageLoad.kt:68)"

    const v3, -0x3603b309

    invoke-static {v3, p3, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v0, p0, LS6/i$b;->a:Ljava/lang/Object;

    iget-object v2, p0, LS6/i$b;->b:LS6/k;

    const v3, 0x3d33b44a

    invoke-interface {p2, v3}, LT/l;->U(I)V

    iget-object v3, p0, LS6/i$b;->b:LS6/k;

    invoke-interface {p2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 p3, p3, 0xe

    if-ne p3, v1, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :goto_2
    or-int/2addr v1, v3

    iget-object v3, p0, LS6/i$b;->c:LU6/a;

    invoke-interface {p2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    iget-object v3, p0, LS6/i$b;->b:LS6/k;

    iget-object v4, p0, LS6/i$b;->c:LU6/a;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_6

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_7

    :cond_6
    new-instance v5, LS6/i$b$a;

    const/4 v1, 0x0

    invoke-direct {v5, v3, p1, v4, v1}, LS6/i$b$a;-><init>(LS6/k;Lz/f;LU6/a;Ldh/e;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lmh/p;

    invoke-interface {p2}, LT/l;->J()V

    iget v1, p0, LS6/i$b;->d:I

    and-int/lit8 v1, v1, 0x8

    invoke-static {v0, v2, v5, p2, v1}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    iget-object v0, p0, LS6/i$b;->e:Lmh/r;

    iget-object v1, p0, LS6/i$b;->f:LT/q0;

    invoke-static {v1}, LS6/i;->f(LT/q0;)LS6/j;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p1, v1, p2, p3}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS6/i$b;->a(Lz/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
