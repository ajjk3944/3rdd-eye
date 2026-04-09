.class final LG9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG9/c;->b(Lz/Y;ZLmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/Y;

.field final synthetic b:Lmh/a;

.field final synthetic c:LT/z1;


# direct methods
.method constructor <init>(Lz/Y;Lmh/a;LT/z1;)V
    .locals 0

    iput-object p1, p0, LG9/c$a;->a:Lz/Y;

    iput-object p2, p0, LG9/c$a;->b:Lmh/a;

    iput-object p3, p0, LG9/c$a;->c:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 9

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetClearTextAction.<anonymous> (UiSettingsWidgetClearTextAction.kt:38)"

    const v1, -0x18d8ea50

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, LG9/c$a;->a:Lz/Y;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 p3, 0x10

    int-to-float p3, p3

    invoke-static {p3}, LY0/h;->j(F)F

    move-result v1

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p3

    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p3, v0}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p3

    iget-object v0, p0, LG9/c$a;->c:LT/z1;

    invoke-static {v0}, LG9/c;->e(LT/z1;)F

    move-result v0

    invoke-static {p3, v0}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p3

    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v0

    invoke-interface {p1, p3, v0}, Lz/Y;->c(Landroidx/compose/ui/e;Lf0/c$c;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object v1, p0, LG9/c$a;->b:Lmh/a;

    sget-object p1, LG9/a;->a:LG9/a;

    invoke-virtual {p1}, LG9/a;->a()Lmh/p;

    move-result-object v5

    const/16 v7, 0x6000

    const/16 v8, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v1 .. v8}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LG9/c$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
