.class final Lba/j$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/j;->f(Lba/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lba/l;


# direct methods
.method constructor <init>(Lba/l;)V
    .locals 0

    iput-object p1, p0, Lba/j$f;->a:Lba/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lba/l$a;Lmh/a;LT/l;I)V
    .locals 9

    const-string/jumbo v1, "event"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "dismissalAction"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.password.UiResetPasswordLayout.<anonymous> (UiResetPasswordLayout.kt:183)"

    const v5, 0x56d76128

    invoke-static {v5, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v2, Lba/l$a$a;->a:Lba/l$a$a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    goto :goto_4

    :cond_7
    sget-object v2, Lba/l$a$b;->a:Lba/l$a$b;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Lba/j$f$a;

    iget-object v2, p0, Lba/j$f;->a:Lba/l;

    invoke-direct {v0, v2, p2}, Lba/j$f$a;-><init>(Lba/l;Lmh/a;)V

    const/16 v2, 0x36

    const v3, 0x6ca12d96

    const/4 v5, 0x1

    invoke-static {v3, v5, v0, p3, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    shl-int/lit8 v0, v1, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v7, v0, 0x6000

    const/4 v8, 0x7

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v4, p2

    move-object v6, p3

    invoke-static/range {v0 .. v8}, Ly9/s;->b(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;LT/l;II)V

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_5
    return-void

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lba/l$a;

    check-cast p2, Lmh/a;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lba/j$f;->a(Lba/l$a;Lmh/a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
