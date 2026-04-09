.class final LGe/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGe/l;->e(LCi/c;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LGe/g;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LGe/g;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LGe/l$a;->a:LGe/g;

    iput-object p2, p0, LGe/l$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 5

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.notification.InAppNotificationContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InAppNotificationContainer.kt:35)"

    const v2, 0x595403fb

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LGe/l$a;->a:LGe/g;

    instance-of v0, p2, LGe/a;

    if-eqz v0, :cond_6

    check-cast p2, LGe/a;

    if-eqz p2, :cond_5

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LGe/l$a;->a:LGe/g;

    check-cast v0, LGe/a;

    const v1, 0x2c44da53

    invoke-interface {p1, v1}, LT/l;->U(I)V

    iget-object v1, p0, LGe/l$a;->b:Lmh/l;

    invoke-interface {p1, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, LGe/l$a;->a:LGe/g;

    invoke-interface {p1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, p0, LGe/l$a;->b:Lmh/l;

    iget-object v3, p0, LGe/l$a;->a:LGe/g;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_4

    :cond_3
    new-instance v4, LGe/l$a$a;

    invoke-direct {v4, v2, v3}, LGe/l$a$a;-><init>(Lmh/l;LGe/g;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v1, 0x6

    invoke-static {p2, v0, v4, p1, v1}, LGe/c;->b(Landroidx/compose/ui/e;LGe/a;Lmh/a;LT/l;I)V

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, LGe/l$a;->a:LGe/g;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported notification type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LGe/l$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
