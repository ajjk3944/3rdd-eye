.class final LN/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/c;->a(ZLmh/a;Landroidx/compose/ui/e;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/r;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/W;

.field final synthetic b:LT/q0;

.field final synthetic c:Landroidx/compose/foundation/o;

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:Lmh/q;


# direct methods
.method constructor <init>(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LN/c$a;->a:Lr/W;

    iput-object p2, p0, LN/c$a;->b:LT/q0;

    iput-object p3, p0, LN/c$a;->c:Landroidx/compose/foundation/o;

    iput-object p4, p0, LN/c$a;->d:Landroidx/compose/ui/e;

    iput-object p5, p0, LN/c$a;->e:Lmh/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:138)"

    const v2, -0x2d96d82

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, LN/c$a;->a:Lr/W;

    iget-object v4, p0, LN/c$a;->b:LT/q0;

    iget-object v5, p0, LN/c$a;->c:Landroidx/compose/foundation/o;

    iget-object v6, p0, LN/c$a;->d:Landroidx/compose/ui/e;

    iget-object v7, p0, LN/c$a;->e:Lmh/q;

    sget p2, Lr/W;->d:I

    or-int/lit8 v9, p2, 0x30

    const/4 v10, 0x0

    move-object v8, p1

    invoke-static/range {v3 .. v10}, LN/j0;->a(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/c$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
