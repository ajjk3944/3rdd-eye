.class final LLe/m$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLe/m;->c(Landroidx/compose/ui/e;ZLLe/d;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LLe/b;


# direct methods
.method constructor <init>(LLe/b;)V
    .locals 0

    iput-object p1, p0, LLe/m$d;->a:LLe/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 3

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.discovery.DiscoveryHomeResults.<anonymous>.<anonymous> (DiscoveryHomeResults.kt:99)"

    const v1, -0x35eaaa7c    # -2446689.0f

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object p3, Lla/a;->a:Lla/a;

    sget v0, Lla/a;->b:I

    invoke-virtual {p3, p2, v0}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->b()Lra/b$a$b;

    move-result-object v1

    const/16 v2, 0x18

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v1, v2}, Lra/b$a;->a(F)F

    move-result v1

    invoke-virtual {p3, p2, v0}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object p3

    invoke-virtual {p3}, Lra/a;->a()Lra/b;

    move-result-object p3

    invoke-virtual {p3}, Lra/b;->a()Lra/b$a$a;

    move-result-object p3

    invoke-virtual {p3}, Lra/b$a$a;->d()F

    move-result p3

    invoke-static {p1, p3, v1}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, LLe/m$d;->a:LLe/b;

    instance-of v0, p3, LLe/b$a;

    if-nez v0, :cond_3

    instance-of v0, p3, LLe/b$b$a;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p3, LLe/b$b$b;

    if-eqz v0, :cond_2

    check-cast p3, LLe/b$b$b;

    invoke-virtual {p3}, LLe/b$b$b;->a()F

    move-result p3

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_1
    const/4 v0, 0x0

    invoke-static {p1, p3, p2, v0}, LMe/b;->b(Landroidx/compose/ui/e;FLT/l;I)V

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

    invoke-virtual {p0, p1, p2, p3}, LLe/m$d;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
