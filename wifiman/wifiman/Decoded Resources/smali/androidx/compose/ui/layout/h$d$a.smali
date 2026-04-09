.class public final Landroidx/compose/ui/layout/h$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/h$d;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic a:LC0/D;

.field final synthetic b:Landroidx/compose/ui/layout/h;

.field final synthetic c:I

.field final synthetic d:LC0/D;


# direct methods
.method public constructor <init>(LC0/D;Landroidx/compose/ui/layout/h;ILC0/D;)V
    .locals 0

    iput-object p2, p0, Landroidx/compose/ui/layout/h$d$a;->b:Landroidx/compose/ui/layout/h;

    iput p3, p0, Landroidx/compose/ui/layout/h$d$a;->c:I

    iput-object p4, p0, Landroidx/compose/ui/layout/h$d$a;->d:LC0/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/h$d$a;->a:LC0/D;

    return-void
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$d$a;->a:LC0/D;

    invoke-interface {v0}, LC0/D;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$d$a;->a:LC0/D;

    invoke-interface {v0}, LC0/D;->getWidth()I

    move-result v0

    return v0
.end method

.method public p()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$d$a;->a:LC0/D;

    invoke-interface {v0}, LC0/D;->p()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h$d$a;->b:Landroidx/compose/ui/layout/h;

    iget v1, p0, Landroidx/compose/ui/layout/h$d$a;->c:I

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/h;->r(Landroidx/compose/ui/layout/h;I)V

    iget-object v0, p0, Landroidx/compose/ui/layout/h$d$a;->d:LC0/D;

    invoke-interface {v0}, LC0/D;->q()V

    iget-object v0, p0, Landroidx/compose/ui/layout/h$d$a;->b:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->a(Landroidx/compose/ui/layout/h;)V

    return-void
.end method

.method public r()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$d$a;->a:LC0/D;

    invoke-interface {v0}, LC0/D;->r()Lmh/l;

    move-result-object v0

    return-object v0
.end method
