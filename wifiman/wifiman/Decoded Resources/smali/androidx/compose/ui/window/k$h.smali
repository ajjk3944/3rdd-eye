.class final Landroidx/compose/ui/window/k$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/k;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;

.field final synthetic b:Landroidx/compose/ui/window/k;

.field final synthetic c:LY0/p;

.field final synthetic d:J

.field final synthetic e:J


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;Landroidx/compose/ui/window/k;LY0/p;JJ)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/k$h;->a:Lkotlin/jvm/internal/M;

    iput-object p2, p0, Landroidx/compose/ui/window/k$h;->b:Landroidx/compose/ui/window/k;

    iput-object p3, p0, Landroidx/compose/ui/window/k$h;->c:LY0/p;

    iput-wide p4, p0, Landroidx/compose/ui/window/k$h;->d:J

    iput-wide p6, p0, Landroidx/compose/ui/window/k$h;->e:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-object v0, p0, Landroidx/compose/ui/window/k$h;->a:Lkotlin/jvm/internal/M;

    iget-object v1, p0, Landroidx/compose/ui/window/k$h;->b:Landroidx/compose/ui/window/k;

    invoke-virtual {v1}, Landroidx/compose/ui/window/k;->getPositionProvider()Landroidx/compose/ui/window/q;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/ui/window/k$h;->c:LY0/p;

    iget-wide v4, p0, Landroidx/compose/ui/window/k$h;->d:J

    iget-object v1, p0, Landroidx/compose/ui/window/k$h;->b:Landroidx/compose/ui/window/k;

    invoke-virtual {v1}, Landroidx/compose/ui/window/k;->getParentLayoutDirection()LY0/t;

    move-result-object v6

    iget-wide v7, p0, Landroidx/compose/ui/window/k$h;->e:J

    invoke-interface/range {v2 .. v8}, Landroidx/compose/ui/window/q;->a(LY0/p;JLY0/t;J)J

    move-result-wide v1

    iput-wide v1, v0, Lkotlin/jvm/internal/M;->a:J

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/window/k$h;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
