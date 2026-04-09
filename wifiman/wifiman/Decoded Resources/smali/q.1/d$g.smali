.class final Lq/d$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/Y;

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Landroidx/compose/animation/i;

.field final synthetic e:Landroidx/compose/animation/k;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Lmh/q;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;II)V
    .locals 0

    iput-object p1, p0, Lq/d$g;->a:Lz/Y;

    iput-boolean p2, p0, Lq/d$g;->b:Z

    iput-object p3, p0, Lq/d$g;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, Lq/d$g;->d:Landroidx/compose/animation/i;

    iput-object p5, p0, Lq/d$g;->e:Landroidx/compose/animation/k;

    iput-object p6, p0, Lq/d$g;->f:Ljava/lang/String;

    iput-object p7, p0, Lq/d$g;->g:Lmh/q;

    iput p8, p0, Lq/d$g;->h:I

    iput p9, p0, Lq/d$g;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    iget-object v0, p0, Lq/d$g;->a:Lz/Y;

    iget-boolean v1, p0, Lq/d$g;->b:Z

    iget-object v2, p0, Lq/d$g;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lq/d$g;->d:Landroidx/compose/animation/i;

    iget-object v4, p0, Lq/d$g;->e:Landroidx/compose/animation/k;

    iget-object v5, p0, Lq/d$g;->f:Ljava/lang/String;

    iget-object v6, p0, Lq/d$g;->g:Lmh/q;

    iget p2, p0, Lq/d$g;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v8

    iget v9, p0, Lq/d$g;->i:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq/d$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
