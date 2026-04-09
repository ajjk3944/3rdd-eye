.class public final Landroidx/compose/ui/layout/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/d;->i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/Map;

.field private final d:Lmh/l;

.field final synthetic e:Lmh/l;

.field final synthetic f:Landroidx/compose/ui/layout/d;


# direct methods
.method constructor <init>(IILjava/util/Map;Lmh/l;Lmh/l;Landroidx/compose/ui/layout/d;)V
    .locals 0

    iput-object p5, p0, Landroidx/compose/ui/layout/d$a;->e:Lmh/l;

    iput-object p6, p0, Landroidx/compose/ui/layout/d$a;->f:Landroidx/compose/ui/layout/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/ui/layout/d$a;->a:I

    iput p2, p0, Landroidx/compose/ui/layout/d$a;->b:I

    iput-object p3, p0, Landroidx/compose/ui/layout/d$a;->c:Ljava/util/Map;

    iput-object p4, p0, Landroidx/compose/ui/layout/d$a;->d:Lmh/l;

    return-void
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/layout/d$a;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/layout/d$a;->a:I

    return v0
.end method

.method public p()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d$a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public q()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/d$a;->e:Lmh/l;

    iget-object v1, p0, Landroidx/compose/ui/layout/d$a;->f:Landroidx/compose/ui/layout/d;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/d;->q()LE0/C;

    move-result-object v1

    invoke-virtual {v1}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public r()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/d$a;->d:Lmh/l;

    return-object v0
.end method
