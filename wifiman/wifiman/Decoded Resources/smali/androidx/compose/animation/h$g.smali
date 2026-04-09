.class final Landroidx/compose/animation/h$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/h;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/h;

.field final synthetic b:J


# direct methods
.method constructor <init>(Landroidx/compose/animation/h;J)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/h$g;->a:Landroidx/compose/animation/h;

    iput-wide p2, p0, Landroidx/compose/animation/h$g;->b:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq/k;)J
    .locals 3

    iget-object v0, p0, Landroidx/compose/animation/h$g;->a:Landroidx/compose/animation/h;

    iget-wide v1, p0, Landroidx/compose/animation/h$g;->b:J

    invoke-virtual {v0, p1, v1, v2}, Landroidx/compose/animation/h;->R2(Lq/k;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lq/k;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/h$g;->a(Lq/k;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->b(J)LY0/n;

    move-result-object p1

    return-object p1
.end method
