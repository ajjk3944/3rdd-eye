.class final LK8/e$w$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e$w$e;->a(Ljava/lang/Long;)Ls9/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Long;


# direct methods
.method constructor <init>(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, LK8/e$w$e$a;->a:Ljava/lang/Long;

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

    const v2, 0x6ac07d1d

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ubnt.usurvey.ui.teleport.tunnel.TeleportTunnelVM.tunnelStateInfo.<anonymous>.<anonymous>.<anonymous> (TeleportTunnelVM.kt:147)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    move-object/from16 v2, p0

    iget-object v3, v2, LK8/e$w$e$a;->a:Ljava/lang/Long;

    new-instance v4, LL0/d$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct {v4, v6, v7, v5}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v5, -0x7fa64981

    invoke-interface {v1, v5}, LT/l;->U(I)V

    sget-object v5, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v5}, LQ0/A$a;->b()LQ0/A;

    move-result-object v13

    sget-object v5, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v5, v1, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->c()J

    move-result-wide v9

    new-instance v5, LL0/D;

    move-object v8, v5

    const v29, 0xfffa

    const/16 v30, 0x0

    const-wide/16 v11, 0x0

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

    const v8, 0x7f110312

    :try_start_0
    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v8, "getString(...)"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, LL8/d;->a:LL8/d;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, LL8/d;->b(J)Ls9/d;

    move-result-object v3

    invoke-static {v3, v1, v6}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

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

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4, v5}, LL0/d$a;->l(I)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual {v4}, LL0/d$a;->p()LL0/d;

    move-result-object v0

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
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

    invoke-virtual {p0, p1, p2, p3}, LK8/e$w$e$a;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
