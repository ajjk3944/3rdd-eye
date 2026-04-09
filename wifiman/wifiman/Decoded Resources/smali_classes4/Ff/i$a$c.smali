.class final LFf/i$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/e;


# direct methods
.method constructor <init>(LFf/e;)V
    .locals 0

    iput-object p1, p0, LFf/i$a$c;->a:LFf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 12

    const-string v0, "$this$UiCardCollapsible"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:138)"

    const v1, -0x20eadf5a

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, LFf/i$a$c;->a:LFf/e;

    invoke-virtual {p1}, LFf/e;->p0()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p3, p2, v0, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGf/k;

    invoke-static {}, LBe/m0;->m()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LBe/n0;

    invoke-virtual {p3}, LBe/n0;->a()LT/z1;

    move-result-object p3

    invoke-interface {p3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_3

    if-eqz p1, :cond_3

    sget-object p3, LFf/b;->VISIBLE:LFf/b;

    :goto_1
    move-object v2, p3

    goto :goto_2

    :cond_3
    if-nez p3, :cond_4

    sget-object p3, LFf/b;->SPACER:LFf/b;

    goto :goto_1

    :cond_4
    sget-object p3, LFf/b;->HIDDEN:LFf/b;

    goto :goto_1

    :goto_2
    new-instance p3, LFf/i$a$c$a;

    iget-object v0, p0, LFf/i$a$c;->a:LFf/e;

    invoke-direct {p3, p1, v0}, LFf/i$a$c$a;-><init>(LGf/k;LFf/e;)V

    const/16 p1, 0x36

    const v0, -0x66e2acf3

    invoke-static {v0, v1, p3, p2, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v8

    const v10, 0x186000

    const/16 v11, 0x2e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "networkAppear"

    const/4 v7, 0x0

    move-object v9, p2

    invoke-static/range {v2 .. v11}, Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LFf/i$a$c;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
