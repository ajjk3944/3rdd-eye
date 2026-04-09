.class final LBe/s0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/s0;->e(Landroidx/compose/ui/e;Ljava/lang/Object;LCi/c;Lmh/l;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;

.field final synthetic b:I

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lmh/q;ILjava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LBe/s0$a;->a:Lmh/q;

    iput p2, p0, LBe/s0$a;->b:I

    iput-object p3, p0, LBe/s0$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;Ljava/lang/Object;LT/l;I)V
    .locals 6

    const-string v0, "$this$UiSelectorHorizontalBase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p4, 0x30

    if-nez p1, :cond_2

    and-int/lit8 p1, p4, 0x40

    if-nez p1, :cond_0

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    const/16 p1, 0x20

    goto :goto_1

    :cond_1
    const/16 p1, 0x10

    :goto_1
    or-int/2addr p4, p1

    :cond_2
    and-int/lit16 p1, p4, 0x91

    const/16 v0, 0x90

    if-ne p1, v0, :cond_4

    invoke-interface {p3}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_3

    :cond_4
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.component.UiSelectorHorizontal.<anonymous> (UiSelectorHorizontal.kt:51)"

    const v1, -0x4df89f42

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_5
    iget-object p1, p0, LBe/s0$a;->a:Lmh/q;

    iget v0, p0, LBe/s0$a;->b:I

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x8

    shr-int/lit8 p4, p4, 0x3

    and-int/lit8 p4, p4, 0xe

    or-int/2addr p4, v0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p1, p2, p3, p4}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object p1, p0, LBe/s0$a;->c:Ljava/lang/Object;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v0, 0x0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, LBe/s0;->k(Landroidx/compose/ui/e;Ljava/lang/String;ZLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LBe/s0$a;->a(Lz/Y;Ljava/lang/Object;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
