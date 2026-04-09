.class public final Landroidx/compose/ui/layout/h$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/h$c;->i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:Lmh/l;

.field final synthetic e:Landroidx/compose/ui/layout/h$c;

.field final synthetic f:Landroidx/compose/ui/layout/h;

.field final synthetic g:Lmh/l;


# direct methods
.method constructor <init>(IILjava/util/Map;Lmh/l;Landroidx/compose/ui/layout/h$c;Landroidx/compose/ui/layout/h;Lmh/l;)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/layout/h$c$a;->a:I

    iput p2, p0, Landroidx/compose/ui/layout/h$c$a;->b:I

    iput-object p3, p0, Landroidx/compose/ui/layout/h$c$a;->c:Ljava/util/Map;

    iput-object p4, p0, Landroidx/compose/ui/layout/h$c$a;->d:Lmh/l;

    iput-object p5, p0, Landroidx/compose/ui/layout/h$c$a;->e:Landroidx/compose/ui/layout/h$c;

    iput-object p6, p0, Landroidx/compose/ui/layout/h$c$a;->f:Landroidx/compose/ui/layout/h;

    iput-object p7, p0, Landroidx/compose/ui/layout/h$c$a;->g:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/layout/h$c$a;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/layout/h$c$a;->a:I

    return v0
.end method

.method public p()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$c$a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public q()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h$c$a;->e:Landroidx/compose/ui/layout/h$c;

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h$c;->a1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/layout/h$c$a;->f:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->C2()LE0/Q;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/layout/h$c$a;->g:Lmh/l;

    invoke-virtual {v0}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v0

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/layout/h$c$a;->g:Lmh/l;

    iget-object v1, p0, Landroidx/compose/ui/layout/h$c$a;->f:Landroidx/compose/ui/layout/h;

    invoke-static {v1}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->P()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public r()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$c$a;->d:Lmh/l;

    return-object v0
.end method
