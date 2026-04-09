.class final Lvf/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvf/c;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lvf/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvf/c$a;

    invoke-direct {v0}, Lvf/c$a;-><init>()V

    sput-object v0, Lvf/c$a;->a:Lvf/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 3

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3d3d5576

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.util.clearFocusOnTap.<anonymous> (FocusUtils.kt:9)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->h()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk0/e;

    sget-object v0, LYg/J;->a:LYg/J;

    const v1, -0x29778b34

    invoke-interface {p2, v1}, LT/l;->U(I)V

    invoke-interface {p2, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lvf/c$a$a;

    const/4 v1, 0x0

    invoke-direct {v2, p3, v1}, Lvf/c$a$a;-><init>(Lk0/e;Ldh/e;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lmh/p;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {p1, v0, v2}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lvf/c$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
