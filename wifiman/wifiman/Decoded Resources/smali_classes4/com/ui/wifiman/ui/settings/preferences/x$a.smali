.class final Lcom/ui/wifiman/ui/settings/preferences/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/x;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/settings/preferences/u;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lcom/ui/wifiman/ui/settings/preferences/u;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/settings/preferences/u;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a;->b:Lcom/ui/wifiman/ui/settings/preferences/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 9

    const-string v0, "$this$ModalScaffold"

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.settings.preferences.UnitSystemConfigUi.<anonymous> (UnitSystemConfigUi.kt:50)"

    const v1, -0x7e4028c0

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a;->a:Landroidx/compose/ui/e;

    new-instance p1, Lcom/ui/wifiman/ui/settings/preferences/x$a$a;

    iget-object p3, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a;->b:Lcom/ui/wifiman/ui/settings/preferences/u;

    invoke-direct {p1, p3}, Lcom/ui/wifiman/ui/settings/preferences/x$a$a;-><init>(Lcom/ui/wifiman/ui/settings/preferences/u;)V

    const/16 p3, 0x36

    const v0, 0x32f45029

    const/4 v1, 0x1

    invoke-static {v0, v1, p1, p2, p3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const/16 v7, 0xc00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v2 .. v8}, LF9/P;->b(Landroidx/compose/ui/e;Landroidx/compose/foundation/o;Lz/N;Lmh/q;LT/l;II)V

    const/4 p1, 0x0

    const/4 p3, 0x0

    invoke-static {p1, p2, p3, v1}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/x$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
