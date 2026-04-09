.class final Lq/d$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Landroidx/compose/animation/i;

.field final synthetic d:Landroidx/compose/animation/k;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lmh/q;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;II)V
    .locals 0

    iput-boolean p1, p0, Lq/d$e;->a:Z

    iput-object p2, p0, Lq/d$e;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Lq/d$e;->c:Landroidx/compose/animation/i;

    iput-object p4, p0, Lq/d$e;->d:Landroidx/compose/animation/k;

    iput-object p5, p0, Lq/d$e;->e:Ljava/lang/String;

    iput-object p6, p0, Lq/d$e;->f:Lmh/q;

    iput p7, p0, Lq/d$e;->g:I

    iput p8, p0, Lq/d$e;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 9

    iget-boolean v0, p0, Lq/d$e;->a:Z

    iget-object v1, p0, Lq/d$e;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Lq/d$e;->c:Landroidx/compose/animation/i;

    iget-object v3, p0, Lq/d$e;->d:Landroidx/compose/animation/k;

    iget-object v4, p0, Lq/d$e;->e:Ljava/lang/String;

    iget-object v5, p0, Lq/d$e;->f:Lmh/q;

    iget p2, p0, Lq/d$e;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v7

    iget v8, p0, Lq/d$e;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq/d$e;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
