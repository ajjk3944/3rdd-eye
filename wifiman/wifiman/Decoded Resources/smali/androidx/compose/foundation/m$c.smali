.class final Landroidx/compose/foundation/m$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/m;->b(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;ZLw/n;ZZ)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/o;

.field final synthetic b:Z

.field final synthetic c:Lw/n;

.field final synthetic d:Z

.field final synthetic e:Z


# direct methods
.method constructor <init>(Landroidx/compose/foundation/o;ZLw/n;ZZ)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/m$c;->a:Landroidx/compose/foundation/o;

    iput-boolean p2, p0, Landroidx/compose/foundation/m$c;->b:Z

    iput-object p3, p0, Landroidx/compose/foundation/m$c;->c:Lw/n;

    iput-boolean p4, p0, Landroidx/compose/foundation/m$c;->d:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/m$c;->e:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 14

    move-object v0, p0

    const v1, 0x581dd9c4

    move-object/from16 v13, p2

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:276)"

    move/from16 v4, p3

    invoke-static {v1, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v8, Landroidx/compose/foundation/ScrollSemanticsElement;

    iget-object v3, v0, Landroidx/compose/foundation/m$c;->a:Landroidx/compose/foundation/o;

    iget-boolean v4, v0, Landroidx/compose/foundation/m$c;->b:Z

    iget-object v5, v0, Landroidx/compose/foundation/m$c;->c:Lw/n;

    iget-boolean v6, v0, Landroidx/compose/foundation/m$c;->d:Z

    iget-boolean v7, v0, Landroidx/compose/foundation/m$c;->e:Z

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Landroidx/compose/foundation/ScrollSemanticsElement;-><init>(Landroidx/compose/foundation/o;ZLw/n;ZZ)V

    invoke-virtual {v1, v8}, Landroidx/compose/ui/e$a;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v3, v0, Landroidx/compose/foundation/m$c;->a:Landroidx/compose/foundation/o;

    iget-boolean v1, v0, Landroidx/compose/foundation/m$c;->e:Z

    if-eqz v1, :cond_1

    sget-object v1, Lw/q;->Vertical:Lw/q;

    :goto_0
    move-object v4, v1

    goto :goto_1

    :cond_1
    sget-object v1, Lw/q;->Horizontal:Lw/q;

    goto :goto_0

    :goto_1
    iget-boolean v5, v0, Landroidx/compose/foundation/m$c;->d:Z

    iget-boolean v6, v0, Landroidx/compose/foundation/m$c;->b:Z

    iget-object v7, v0, Landroidx/compose/foundation/m$c;->c:Lw/n;

    invoke-virtual {v3}, Landroidx/compose/foundation/o;->k()Ly/m;

    move-result-object v8

    const/4 v11, 0x0

    const/16 v12, 0x40

    const/4 v9, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v2 .. v12}, Ls/Z;->a(Landroidx/compose/ui/e;Lw/y;Lw/q;ZZLw/n;Ly/m;Lw/d;LT/l;II)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, Landroidx/compose/foundation/ScrollingLayoutElement;

    iget-object v3, v0, Landroidx/compose/foundation/m$c;->a:Landroidx/compose/foundation/o;

    iget-boolean v4, v0, Landroidx/compose/foundation/m$c;->b:Z

    iget-boolean v5, v0, Landroidx/compose/foundation/m$c;->e:Z

    invoke-direct {v2, v3, v4, v5}, Landroidx/compose/foundation/ScrollingLayoutElement;-><init>(Landroidx/compose/foundation/o;ZZ)V

    invoke-interface {v1, v2}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/m$c;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
