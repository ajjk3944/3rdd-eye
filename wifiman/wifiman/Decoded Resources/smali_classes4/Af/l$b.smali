.class final LAf/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAf/l;->i(Landroidx/compose/ui/e;LAf/c;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LAf/c;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LAf/c;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LAf/l$b;->a:LAf/c;

    iput-object p2, p0, LAf/l$b;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;LAf/c$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LAf/l$b;->c(Lmh/l;LAf/c$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/l;LAf/c$a;)LYg/J;
    .locals 0

    invoke-virtual {p1}, LAf/c$a;->c()Lh9/a;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lq/e;LT/l;I)V
    .locals 11

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.wifi.component.WifiAccessPointContent.<anonymous>.<anonymous> (WifiAccessPoint.kt:121)"

    const v1, 0x7c721202

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, LAf/l$b;->a:LAf/c;

    invoke-virtual {p1}, LAf/c;->f()LAf/c$a;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p3, p0, LAf/l$b;->b:Lmh/l;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const v0, -0x310ef3ba

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_3

    :cond_2
    new-instance v1, LAf/m;

    invoke-direct {v1, p3, p1}, LAf/m;-><init>(Lmh/l;LAf/c$a;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v8, v1

    check-cast v8, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p3

    const/4 v0, 0x0

    invoke-static {p3, p1, p2, v0}, LAf/l;->n(Landroidx/compose/ui/e;LAf/c$a;LT/l;I)V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LAf/l$b;->b(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
