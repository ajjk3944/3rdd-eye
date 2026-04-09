.class final Landroidx/compose/foundation/g$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/g$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/L;

.field final synthetic b:Lkotlin/jvm/internal/L;

.field final synthetic c:Lkotlin/jvm/internal/L;

.field final synthetic d:Landroidx/compose/foundation/g$a;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;Landroidx/compose/foundation/g$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->a:Lkotlin/jvm/internal/L;

    iput-object p2, p0, Landroidx/compose/foundation/g$a$a$a;->b:Lkotlin/jvm/internal/L;

    iput-object p3, p0, Landroidx/compose/foundation/g$a$a$a;->c:Lkotlin/jvm/internal/L;

    iput-object p4, p0, Landroidx/compose/foundation/g$a$a$a;->d:Landroidx/compose/foundation/g$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly/j;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/g$a$a$a;->b(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of p2, p1, Ly/o$b;

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->a:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr p2, v0

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    :cond_0
    instance-of p2, p1, Ly/o$c;

    if-eqz p2, :cond_1

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->a:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    :cond_1
    instance-of p2, p1, Ly/o$a;

    if-eqz p2, :cond_2

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->a:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    :cond_2
    instance-of p2, p1, Ly/g;

    if-eqz p2, :cond_3

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->b:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr p2, v0

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    :cond_3
    instance-of p2, p1, Ly/h;

    if-eqz p2, :cond_4

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->b:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    :cond_4
    instance-of p2, p1, Ly/d;

    if-eqz p2, :cond_5

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->c:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr p2, v0

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    :cond_5
    instance-of p1, p1, Ly/e;

    if-eqz p1, :cond_6

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->c:Lkotlin/jvm/internal/L;

    iget p2, p1, Lkotlin/jvm/internal/L;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lkotlin/jvm/internal/L;->a:I

    :cond_6
    :goto_0
    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->a:Lkotlin/jvm/internal/L;

    iget p1, p1, Lkotlin/jvm/internal/L;->a:I

    const/4 p2, 0x0

    if-lez p1, :cond_7

    move p1, v0

    goto :goto_1

    :cond_7
    move p1, p2

    :goto_1
    iget-object v1, p0, Landroidx/compose/foundation/g$a$a$a;->b:Lkotlin/jvm/internal/L;

    iget v1, v1, Lkotlin/jvm/internal/L;->a:I

    if-lez v1, :cond_8

    move v1, v0

    goto :goto_2

    :cond_8
    move v1, p2

    :goto_2
    iget-object v2, p0, Landroidx/compose/foundation/g$a$a$a;->c:Lkotlin/jvm/internal/L;

    iget v2, v2, Lkotlin/jvm/internal/L;->a:I

    if-lez v2, :cond_9

    move v2, v0

    goto :goto_3

    :cond_9
    move v2, p2

    :goto_3
    iget-object v3, p0, Landroidx/compose/foundation/g$a$a$a;->d:Landroidx/compose/foundation/g$a;

    invoke-static {v3}, Landroidx/compose/foundation/g$a;->G2(Landroidx/compose/foundation/g$a;)Z

    move-result v3

    if-eq v3, p1, :cond_a

    iget-object p2, p0, Landroidx/compose/foundation/g$a$a$a;->d:Landroidx/compose/foundation/g$a;

    invoke-static {p2, p1}, Landroidx/compose/foundation/g$a;->J2(Landroidx/compose/foundation/g$a;Z)V

    move p2, v0

    :cond_a
    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->d:Landroidx/compose/foundation/g$a;

    invoke-static {p1}, Landroidx/compose/foundation/g$a;->F2(Landroidx/compose/foundation/g$a;)Z

    move-result p1

    if-eq p1, v1, :cond_b

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->d:Landroidx/compose/foundation/g$a;

    invoke-static {p1, v1}, Landroidx/compose/foundation/g$a;->I2(Landroidx/compose/foundation/g$a;Z)V

    move p2, v0

    :cond_b
    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->d:Landroidx/compose/foundation/g$a;

    invoke-static {p1}, Landroidx/compose/foundation/g$a;->E2(Landroidx/compose/foundation/g$a;)Z

    move-result p1

    if-eq p1, v2, :cond_c

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->d:Landroidx/compose/foundation/g$a;

    invoke-static {p1, v2}, Landroidx/compose/foundation/g$a;->H2(Landroidx/compose/foundation/g$a;Z)V

    goto :goto_4

    :cond_c
    move v0, p2

    :goto_4
    if-eqz v0, :cond_d

    iget-object p1, p0, Landroidx/compose/foundation/g$a$a$a;->d:Landroidx/compose/foundation/g$a;

    invoke-static {p1}, LE0/s;->a(LE0/r;)V

    :cond_d
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
