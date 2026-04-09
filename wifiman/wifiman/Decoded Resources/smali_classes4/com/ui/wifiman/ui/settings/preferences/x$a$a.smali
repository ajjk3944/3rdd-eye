.class final Lcom/ui/wifiman/ui/settings/preferences/x$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/settings/preferences/x$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/settings/preferences/x$a$a$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/settings/preferences/u;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/settings/preferences/u;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/x$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 13

    move-object v0, p0

    move-object v10, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettings"

    move-object v3, p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.settings.preferences.UnitSystemConfigUi.<anonymous>.<anonymous> (UnitSystemConfigUi.kt:51)"

    const v4, 0x32f45029

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/ui/wifiman/ui/settings/preferences/x$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/u;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/settings/preferences/u;->n0()LLi/N;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, p2, v3, v4}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT7/c;

    const v2, 0x6ed9ef48

    invoke-interface {p2, v2}, LT/l;->U(I)V

    invoke-interface {p2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_3

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_9

    :cond_3
    invoke-static {}, LT7/c;->getEntries()Lfh/a;

    move-result-object v2

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LT7/c;

    sget-object v7, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$b;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    if-eq v6, v4, :cond_6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_5

    new-instance v6, Lcom/ui/wifiman/ui/settings/preferences/t$a;

    sget-object v7, LT7/c;->IMPERIAL:LT7/c;

    if-ne v1, v7, :cond_4

    move v7, v4

    goto :goto_2

    :cond_4
    move v7, v3

    :goto_2
    invoke-direct {v6, v7}, Lcom/ui/wifiman/ui/settings/preferences/t$a;-><init>(Z)V

    goto :goto_4

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    new-instance v6, Lcom/ui/wifiman/ui/settings/preferences/t$b;

    sget-object v7, LT7/c;->METRIC:LT7/c;

    if-ne v1, v7, :cond_7

    move v7, v4

    goto :goto_3

    :cond_7
    move v7, v3

    :goto_3
    invoke-direct {v6, v7}, Lcom/ui/wifiman/ui/settings/preferences/t$b;-><init>(Z)V

    :goto_4
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-static {v5}, LCi/a;->h(Ljava/lang/Iterable;)LCi/c;

    move-result-object v5

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, LCi/c;

    invoke-interface {p2}, LT/l;->J()V

    new-instance v1, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;

    iget-object v2, v0, Lcom/ui/wifiman/ui/settings/preferences/x$a$a;->a:Lcom/ui/wifiman/ui/settings/preferences/u;

    invoke-direct {v1, v5, v2}, Lcom/ui/wifiman/ui/settings/preferences/x$a$a$a;-><init>(LCi/c;Lcom/ui/wifiman/ui/settings/preferences/u;)V

    const/16 v2, 0x36

    const v3, -0x49fa284f

    invoke-static {v3, v4, v1, p2, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0x6000000

    const/16 v12, 0xff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, p2

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/settings/preferences/x$a$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
