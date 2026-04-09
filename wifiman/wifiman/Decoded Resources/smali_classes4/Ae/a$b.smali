.class final LAe/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAe/a;->a(Lf2/u;LAe/p;LAe/n;Lmh/q;Lmh/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;

.field final synthetic b:Lmh/q;


# direct methods
.method constructor <init>(Lmh/q;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LAe/a$b;->a:Lmh/q;

    iput-object p2, p0, LAe/a$b;->b:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf2/k;LT/l;I)V
    .locals 9

    const-string v0, "backStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.arch.navigation.graphRoute.<anonymous> (NavGraphBuilderExtensions.kt:51)"

    const v2, 0x713d3706

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v7, p3, 0xe

    const/4 v8, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v3 .. v8}, Lze/a;->c(Lf2/k;Lorg/kodein/di/DI;Ljava/lang/String;LT/l;II)Landroidx/lifecycle/a;

    move-result-object p3

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v0

    invoke-virtual {v0, p3}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object p3

    new-instance v0, LAe/a$b$a;

    iget-object v1, p0, LAe/a$b;->a:Lmh/q;

    iget-object v2, p0, LAe/a$b;->b:Lmh/q;

    invoke-direct {v0, v1, v2, p1}, LAe/a$b$a;-><init>(Lmh/q;Lmh/q;Lf2/k;)V

    const/16 p1, 0x36

    const v1, -0x5b7db5ba

    const/4 v2, 0x1

    invoke-static {v1, v2, v0, p2, p1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p1

    sget v0, LT/I0;->i:I

    or-int/lit8 v0, v0, 0x30

    invoke-static {p3, p1, p2, v0}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/k;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LAe/a$b;->a(Lf2/k;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
