.class final LE8/A$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;->Q0(Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/b$b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/result/b$b;)V
    .locals 0

    iput-object p1, p0, LE8/A$i;->a:Lcom/ui/wifiman/model/speedtest/result/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 31

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string/jumbo v2, "it"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x3053e481

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ubnt.usurvey.ui.speedtest.SpeedtestResultDetailVM.getDetails.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultDetailVM.kt:171)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    move-object/from16 v2, p0

    iget-object v3, v2, LE8/A$i;->a:Lcom/ui/wifiman/model/speedtest/result/b$b;

    new-instance v4, LL0/d$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct {v4, v5, v7, v6}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, LL0/D;

    move-object v8, v5

    sget-object v6, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v6, v1, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->a()Lma/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lr9/a$a;->f()J

    move-result-wide v9

    const v29, 0xfffe

    const/16 v30, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v8 .. v30}, LL0/D;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;LL0/A;Lo0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v5}, LL0/d$a;->n(LL0/D;)I

    move-result v5

    :try_start_0
    move-object v6, v3

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->a()Ljava/lang/String;

    move-result-object v6

    move-object v8, v3

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v8

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->c()Ljava/lang/String;

    move-result-object v8

    move-object v9, v3

    check-cast v9, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v9

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->d()Ljava/lang/String;

    move-result-object v9

    filled-new-array {v6, v8, v9}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LZg/v;->q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ljava/lang/Iterable;

    const-string v9, ", "

    const/16 v15, 0x3e

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, LL0/d$a;->i(Ljava/lang/String;)V

    sget-object v6, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4, v5}, LL0/d$a;->l(I)V

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->f()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, " "

    invoke-virtual {v4, v5}, LL0/d$a;->i(Ljava/lang/String;)V

    const v5, 0x7f1102b9

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v5, "getString(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->f()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v3, "format(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, LL0/d$a;->i(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v4}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v4, v5}, LL0/d$a;->l(I)V

    throw v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LE8/A$i;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
