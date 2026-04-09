.class final Lxf/g$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxf/g$a$b;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LBe/A0;


# direct methods
.method constructor <init>(LBe/A0;)V
    .locals 0

    iput-object p1, p0, Lxf/g$a$b$a;->a:LBe/A0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 8

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WifiAccessPointDetailUiContent.kt:103)"

    const v1, 0x38619cc9

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object v3, p0, Lxf/g$a$b$a;->a:LBe/A0;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object p3, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p3, p2, v0}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object p3

    invoke-virtual {p3}, Lra/a;->a()Lra/b;

    move-result-object p3

    invoke-virtual {p3}, Lra/b;->a()Lra/b$a$a;

    move-result-object p3

    invoke-virtual {p3}, Lra/b$a$a;->c()F

    move-result p3

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p1, p3, v0}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v6, 0x180

    const/4 v7, 0x0

    const/4 v4, 0x1

    move-object v5, p2

    invoke-static/range {v2 .. v7}, LBe/H0;->d(Landroidx/compose/ui/e;LBe/A0;ZLT/l;II)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lxf/g$a$b$a;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
