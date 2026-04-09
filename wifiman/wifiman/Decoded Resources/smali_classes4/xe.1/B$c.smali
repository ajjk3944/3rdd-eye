.class final Lxe/B$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/B;->x(Lxe/h;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxe/h;

.field final synthetic b:LN/n0;

.field final synthetic c:LIi/N;


# direct methods
.method constructor <init>(Lxe/h;LN/n0;LIi/N;)V
    .locals 0

    iput-object p1, p0, Lxe/B$c;->a:Lxe/h;

    iput-object p2, p0, Lxe/B$c;->b:LN/n0;

    iput-object p3, p0, Lxe/B$c;->c:LIi/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LT/z1;)Lxe/g;
    .locals 0

    invoke-static {p0}, Lxe/B$c;->c(LT/z1;)Lxe/g;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/z1;)Lxe/g;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxe/g;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 5

    const-string v0, "$this$ModalBottomSheetLayout"

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

    const-string v0, "com.ui.wifiman.ui.AppPopup.<anonymous> (WiFimanAppNavigation.kt:286)"

    const v1, 0x4df6e272    # 5.1775443E8f

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lxe/B$c;->a:Lxe/h;

    invoke-virtual {p1}, Lxe/h;->n0()LLi/N;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, p3, p2, v0, v1}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p1

    invoke-static {p1}, Lxe/B$c;->c(LT/z1;)Lxe/g;

    move-result-object v2

    sget-object v3, Lxe/g;->NONE:Lxe/g;

    if-eq v2, v3, :cond_3

    move v0, v1

    :cond_3
    new-instance v2, Lxe/B$c$a;

    iget-object v3, p0, Lxe/B$c;->b:LN/n0;

    iget-object v4, p0, Lxe/B$c;->c:LIi/N;

    invoke-direct {v2, v3, v0, v4, p1}, Lxe/B$c$a;-><init>(LN/n0;ZLIi/N;LT/z1;)V

    const/16 p1, 0x36

    const v0, 0x3fbeafd4

    invoke-static {v0, v1, v2, p2, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p1

    const/16 v0, 0x30

    invoke-static {p3, p1, p2, v0, v1}, LFe/e;->b(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
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

    invoke-virtual {p0, p1, p2, p3}, Lxe/B$c;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
