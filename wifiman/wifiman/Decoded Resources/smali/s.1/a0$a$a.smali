.class final Ls/a0$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/a0$a;->a(Landroidx/compose/ui/layout/t$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/t;

.field final synthetic b:I

.field final synthetic c:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/t;II)V
    .locals 0

    iput-object p1, p0, Ls/a0$a$a;->a:Landroidx/compose/ui/layout/t;

    iput p2, p0, Ls/a0$a$a;->b:I

    iput p3, p0, Ls/a0$a$a;->c:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 8

    iget-object v1, p0, Ls/a0$a$a;->a:Landroidx/compose/ui/layout/t;

    iget v2, p0, Ls/a0$a$a;->b:I

    iget v3, p0, Ls/a0$a$a;->c:I

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/layout/t$a;->p(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFLmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Ls/a0$a$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
