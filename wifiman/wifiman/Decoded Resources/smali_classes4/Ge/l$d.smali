.class public final LGe/l$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGe/l;->e(LCi/c;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lmh/l;


# direct methods
.method public constructor <init>(Ljava/util/List;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LGe/l$d;->a:Ljava/util/List;

    iput-object p2, p0, LGe/l$d;->b:Lmh/l;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/c;ILT/l;I)V
    .locals 4

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    const/16 v1, 0x30

    and-int/2addr p4, v1

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LT/l;->i(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v2, 0x92

    if-ne p4, v2, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v2, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v3, -0x25b7f321

    invoke-static {v3, v0, p4, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object p4, p0, LGe/l$d;->a:Ljava/util/List;

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LGe/g;

    const p4, -0x32ef85d8

    invoke-interface {p3, p4}, LT/l;->U(I)V

    sget-object p4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p4, v0, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p4

    invoke-static {p1, p4, v3, v2, v3}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    new-instance p4, LGe/l$a;

    iget-object v0, p0, LGe/l$d;->b:Lmh/l;

    invoke-direct {p4, p2, v0}, LGe/l$a;-><init>(LGe/g;Lmh/l;)V

    const/16 p2, 0x36

    const v0, 0x595403fb

    invoke-static {v0, v2, p4, p3, p2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p2

    invoke-static {p1, p2, p3, v1}, LGe/n;->b(Landroidx/compose/ui/e;Lmh/p;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/c;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LGe/l$d;->a(LA/c;ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
