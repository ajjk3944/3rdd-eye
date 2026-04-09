.class final LEe/z$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEe/z;->B(Landroidx/compose/ui/e;LEe/g;ZLmh/l;ZZLmh/r;Lmh/r;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA/c;


# direct methods
.method constructor <init>(LA/c;)V
    .locals 0

    iput-object p1, p0, LEe/z$d;->a:LA/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Landroidx/compose/ui/e;
    .locals 4

    const v0, 0x43f5eb6a

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.list.LazyActionCards.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LazyColumnCard.kt:421)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, LEe/z$d;->a:LA/c;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {p2, v0, v3, v2, v3}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LEe/z$d;->a(LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
