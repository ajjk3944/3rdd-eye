.class final LAe/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAe/a;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;


# direct methods
.method constructor <init>(Lmh/q;)V
    .locals 0

    iput-object p1, p0, LAe/a$a;->a:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/b;Lf2/k;LT/l;I)V
    .locals 6

    const-string v0, "$this$composable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "backStackEntry"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.arch.navigation.graphRoute.<anonymous> (NavGraphBuilderExtensions.kt:28)"

    const v1, 0x47e4b595

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 p1, p4, 0x3

    and-int/lit8 v4, p1, 0xe

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lze/a;->c(Lf2/k;Lorg/kodein/di/DI;Ljava/lang/String;LT/l;II)Landroidx/lifecycle/a;

    move-result-object p1

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object p4

    invoke-virtual {p4, p1}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p1

    new-instance p4, LAe/a$a$a;

    iget-object v0, p0, LAe/a$a;->a:Lmh/q;

    invoke-direct {p4, v0, p2}, LAe/a$a$a;-><init>(Lmh/q;Lf2/k;)V

    const/16 p2, 0x36

    const v0, 0x4c4938d5    # 5.274914E7f

    const/4 v1, 0x1

    invoke-static {v0, v1, p4, p3, p2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p2

    sget p4, LT/I0;->i:I

    or-int/lit8 p4, p4, 0x30

    invoke-static {p1, p2, p3, p4}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lf2/k;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LAe/a$a;->a(Lq/b;Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
