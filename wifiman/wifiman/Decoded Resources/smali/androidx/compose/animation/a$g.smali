.class final Landroidx/compose/animation/a$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a;->b(Lr/o0;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Lmh/l;Lmh/r;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/o0;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lf0/c;

.field final synthetic e:Lmh/l;

.field final synthetic f:Lmh/r;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(Lr/o0;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Lmh/l;Lmh/r;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$g;->a:Lr/o0;

    iput-object p2, p0, Landroidx/compose/animation/a$g;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Landroidx/compose/animation/a$g;->c:Lmh/l;

    iput-object p4, p0, Landroidx/compose/animation/a$g;->d:Lf0/c;

    iput-object p5, p0, Landroidx/compose/animation/a$g;->e:Lmh/l;

    iput-object p6, p0, Landroidx/compose/animation/a$g;->f:Lmh/r;

    iput p7, p0, Landroidx/compose/animation/a$g;->g:I

    iput p8, p0, Landroidx/compose/animation/a$g;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 9

    iget-object v0, p0, Landroidx/compose/animation/a$g;->a:Lr/o0;

    iget-object v1, p0, Landroidx/compose/animation/a$g;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Landroidx/compose/animation/a$g;->c:Lmh/l;

    iget-object v3, p0, Landroidx/compose/animation/a$g;->d:Lf0/c;

    iget-object v4, p0, Landroidx/compose/animation/a$g;->e:Lmh/l;

    iget-object v5, p0, Landroidx/compose/animation/a$g;->f:Lmh/r;

    iget p2, p0, Landroidx/compose/animation/a$g;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v7

    iget v8, p0, Landroidx/compose/animation/a$g;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/a;->b(Lr/o0;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Lmh/l;Lmh/r;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/a$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
