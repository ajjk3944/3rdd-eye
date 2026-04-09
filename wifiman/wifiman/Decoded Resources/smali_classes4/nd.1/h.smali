.class public final Lnd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd/g;
.implements Lcom/ui/wifiman/model/speedtest/result/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnd/h$a;,
        Lnd/h$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LWb/j;

.field private final c:LCd/f;

.field private final d:LCc/n;

.field private final e:LZc/c;

.field private final f:Lad/i;

.field private final g:Lje/u;

.field private final h:LBc/a;

.field private final i:Lgg/z;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;LWb/j;LCd/f;LCc/n;LZc/c;Lad/i;Lje/u;LBc/a;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_placesDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "infiniteLocalSpeedtest"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internetLatencyService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dnsLatencyService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiConnectionService"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cellularSignalService"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnd/h;->a:Landroid/content/Context;

    iput-object p2, p0, Lnd/h;->b:LWb/j;

    iput-object p3, p0, Lnd/h;->c:LCd/f;

    iput-object p4, p0, Lnd/h;->d:LCc/n;

    iput-object p5, p0, Lnd/h;->e:LZc/c;

    iput-object p6, p0, Lnd/h;->f:Lad/i;

    iput-object p7, p0, Lnd/h;->g:Lje/u;

    iput-object p8, p0, Lnd/h;->h:LBc/a;

    new-instance p1, Lnd/h$l;

    invoke-direct {p1, p0}, Lnd/h$l;-><init>(Lnd/h;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    const-string p2, "cache(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lnd/h;->i:Lgg/z;

    sget-object p2, Lnd/h$j;->a:Lnd/h$j;

    invoke-virtual {p1, p2}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p3

    invoke-virtual {p2, p3}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p3

    invoke-virtual {p2, p3}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p2

    new-instance p3, Lnd/h$k;

    invoke-direct {p3, p0}, Lnd/h$k;-><init>(Lnd/h;)V

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string p3, "map(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lnd/h;->j:Lgg/i;

    sget-object p2, Lnd/h$e;->a:Lnd/h$e;

    invoke-virtual {p1, p2}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    sget-object p2, Lnd/h$f;->a:Lnd/h$f;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lnd/h;->k:Lgg/i;

    invoke-static {}, Lnd/h$a;->getEntries()Lfh/a;

    move-result-object p1

    const/16 p2, 0xa

    invoke-static {p1, p2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, LZg/U;->d(I)I

    move-result p2

    const/16 p3, 0x10

    invoke-static {p2, p3}, Lsh/m;->d(II)I

    move-result p2

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p4, p2

    check-cast p4, Lnd/h$a;

    invoke-virtual {p4}, Lnd/h$a;->getDbId()Ljava/lang/String;

    move-result-object p4

    invoke-interface {p3, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p3, p0, Lnd/h;->l:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic i(Lnd/h;LWb/f;)Lnd/f;
    .locals 0

    invoke-direct {p0, p1}, Lnd/h;->o(LWb/f;)Lnd/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lnd/h;)LWb/j;
    .locals 0

    iget-object p0, p0, Lnd/h;->b:LWb/j;

    return-object p0
.end method

.method public static final synthetic k(Lnd/h;Ljava/lang/String;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lnd/h;->s(Ljava/lang/String;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lnd/h;Lnd/f;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lnd/h;->t(Lnd/f;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lnd/h;Lnd/f;)LWb/f;
    .locals 0

    invoke-direct {p0, p1}, Lnd/h;->u(Lnd/f;)LWb/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lnd/h;Lnd/h$b;J)LWb/g;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lnd/h;->v(Lnd/h$b;J)LWb/g;

    move-result-object p0

    return-object p0
.end method

.method private final o(LWb/f;)Lnd/f;
    .locals 24

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, LWb/f;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LWb/f;->j()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LWb/f;->r()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LWb/f;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v3, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v3, v1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v1

    move-object v7, v1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, LWb/f;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, LWb/f;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LWb/f;->p()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v3, LS8/l;->f:LS8/l$a;

    invoke-virtual {v3, v1}, LS8/l$a;->a(I)LS8/l;

    move-result-object v1

    move-object v10, v1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    invoke-virtual/range {p1 .. p1}, LWb/f;->q()Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, LWb/f;->m()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v3, v0, Lnd/h;->l:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnd/h$a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lnd/h$a;->getType()LV7/b;

    move-result-object v1

    move-object v13, v1

    goto :goto_2

    :cond_2
    const/4 v13, 0x0

    :goto_2
    invoke-virtual/range {p1 .. p1}, LWb/f;->l()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, LWb/f;->m()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v12, v0, Lnd/h;->l:Ljava/util/Map;

    invoke-interface {v12, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnd/h$a;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lnd/h$a;->getType()LV7/b;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-direct {v0, v1, v3}, Lnd/h;->q(ILV7/b;)LV7/a;

    move-result-object v1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    move-object v12, v1

    goto :goto_4

    :cond_4
    const/4 v12, 0x0

    :goto_4
    invoke-virtual/range {p1 .. p1}, LWb/f;->o()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v3, v0, Lnd/h;->l:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnd/h$a;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lnd/h$a;->getType()LV7/b;

    move-result-object v1

    move-object v15, v1

    goto :goto_5

    :cond_5
    const/4 v15, 0x0

    :goto_5
    invoke-virtual/range {p1 .. p1}, LWb/f;->n()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, LWb/f;->o()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v14, v0, Lnd/h;->l:Ljava/util/Map;

    invoke-interface {v14, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnd/h$a;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lnd/h$a;->getType()LV7/b;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-direct {v0, v1, v3}, Lnd/h;->q(ILV7/b;)LV7/a;

    move-result-object v1

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    :goto_6
    move-object v14, v1

    goto :goto_7

    :cond_7
    const/4 v14, 0x0

    :goto_7
    invoke-virtual/range {p1 .. p1}, LWb/f;->s()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    sget-object v1, LW7/a;->b:LW7/a$a;

    invoke-virtual {v1, v2, v3}, LW7/a$a;->b(J)LW7/a;

    move-result-object v1

    goto :goto_8

    :cond_8
    const/4 v1, 0x0

    :goto_8
    invoke-virtual/range {p1 .. p1}, LWb/f;->i()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v3, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v3, v2}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v2

    move-object/from16 v17, v2

    goto :goto_9

    :cond_9
    const/16 v17, 0x0

    :goto_9
    invoke-virtual/range {p1 .. p1}, LWb/f;->e()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v3, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v3, v2}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v2

    move-object/from16 v18, v2

    goto :goto_a

    :cond_a
    const/16 v18, 0x0

    :goto_a
    invoke-virtual/range {p1 .. p1}, LWb/f;->k()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    sget-object v3, Lb8/d;->a:Lb8/d$b;

    invoke-virtual {v3, v2}, Lb8/d$b;->a(I)Lb8/d;

    move-result-object v2

    move-object/from16 v19, v2

    goto :goto_b

    :cond_b
    const/16 v19, 0x0

    :goto_b
    invoke-virtual/range {p1 .. p1}, LWb/f;->t()LS8/c;

    move-result-object v20

    invoke-virtual/range {p1 .. p1}, LWb/f;->g()LS8/a;

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, LWb/f;->d()J

    move-result-wide v22

    new-instance v2, Lnd/f;

    move-object v3, v2

    move-object/from16 v16, v1

    invoke-direct/range {v3 .. v23}, Lnd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh9/a;Ljava/lang/String;Ljava/lang/String;LS8/l;Ljava/lang/Integer;LV7/a;LV7/b;LV7/a;LV7/b;LW7/a;Lb8/b;Lb8/b;Lb8/d;LS8/c;LS8/a;J)V

    return-object v2
.end method

.method private final p(LV7/b;)Lnd/h$a;
    .locals 1

    instance-of v0, p1, LV7/b$e;

    if-eqz v0, :cond_0

    sget-object p1, Lnd/h$a;->GSM:Lnd/h$a;

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, LV7/b$a$b;

    if-eqz v0, :cond_1

    sget-object p1, Lnd/h$a;->G2_EDGE:Lnd/h$a;

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, LV7/b$a$c;

    if-eqz v0, :cond_2

    sget-object p1, Lnd/h$a;->G2_GPRS:Lnd/h$a;

    goto/16 :goto_0

    :cond_2
    instance-of v0, p1, LV7/b$a$a;

    if-eqz v0, :cond_3

    sget-object p1, Lnd/h$a;->G2_CDMA:Lnd/h$a;

    goto/16 :goto_0

    :cond_3
    instance-of v0, p1, LV7/b$a$d;

    if-eqz v0, :cond_4

    sget-object p1, Lnd/h$a;->G2_IDEN:Lnd/h$a;

    goto/16 :goto_0

    :cond_4
    instance-of v0, p1, LV7/b$a$e;

    if-eqz v0, :cond_5

    sget-object p1, Lnd/h$a;->G2_RTXX1:Lnd/h$a;

    goto/16 :goto_0

    :cond_5
    instance-of v0, p1, LV7/b$b$i;

    if-eqz v0, :cond_6

    sget-object p1, Lnd/h$a;->G3_UMTS:Lnd/h$a;

    goto/16 :goto_0

    :cond_6
    instance-of v0, p1, LV7/b$b$d;

    if-eqz v0, :cond_7

    sget-object p1, Lnd/h$a;->G3_HSDPA:Lnd/h$a;

    goto/16 :goto_0

    :cond_7
    instance-of v0, p1, LV7/b$b$e;

    if-eqz v0, :cond_8

    sget-object p1, Lnd/h$a;->G3_HSPA:Lnd/h$a;

    goto/16 :goto_0

    :cond_8
    instance-of v0, p1, LV7/b$b$f;

    if-eqz v0, :cond_9

    sget-object p1, Lnd/h$a;->G3_HSPAP:Lnd/h$a;

    goto :goto_0

    :cond_9
    instance-of v0, p1, LV7/b$b$a;

    if-eqz v0, :cond_a

    sget-object p1, Lnd/h$a;->G3_EVDO_0:Lnd/h$a;

    goto :goto_0

    :cond_a
    instance-of v0, p1, LV7/b$b$b;

    if-eqz v0, :cond_b

    sget-object p1, Lnd/h$a;->G3_EVDO_A:Lnd/h$a;

    goto :goto_0

    :cond_b
    instance-of v0, p1, LV7/b$b$c;

    if-eqz v0, :cond_c

    sget-object p1, Lnd/h$a;->G3_EVDO_B:Lnd/h$a;

    goto :goto_0

    :cond_c
    instance-of v0, p1, LV7/b$b$h;

    if-eqz v0, :cond_d

    sget-object p1, Lnd/h$a;->G3_TD_Scma:Lnd/h$a;

    goto :goto_0

    :cond_d
    instance-of v0, p1, LV7/b$b$g;

    if-eqz v0, :cond_e

    sget-object p1, Lnd/h$a;->G3_HSUPA:Lnd/h$a;

    goto :goto_0

    :cond_e
    instance-of v0, p1, LV7/b$c$a;

    if-eqz v0, :cond_f

    sget-object p1, Lnd/h$a;->G4_EHRPD:Lnd/h$a;

    goto :goto_0

    :cond_f
    instance-of v0, p1, LV7/b$c$b;

    if-eqz v0, :cond_10

    sget-object p1, Lnd/h$a;->G4_LTE:Lnd/h$a;

    goto :goto_0

    :cond_10
    instance-of v0, p1, LV7/b$c$d;

    if-eqz v0, :cond_11

    sget-object p1, Lnd/h$a;->G4_LTE_CA:Lnd/h$a;

    goto :goto_0

    :cond_11
    instance-of v0, p1, LV7/b$c$c;

    if-eqz v0, :cond_12

    sget-object p1, Lnd/h$a;->G4_LTE_ADVANCED:Lnd/h$a;

    goto :goto_0

    :cond_12
    instance-of v0, p1, LV7/b$d$a;

    if-eqz v0, :cond_13

    sget-object p1, Lnd/h$a;->G5_IWLAN:Lnd/h$a;

    goto :goto_0

    :cond_13
    instance-of v0, p1, LV7/b$d$b;

    if-eqz v0, :cond_14

    sget-object p1, Lnd/h$a;->G5_NR:Lnd/h$a;

    goto :goto_0

    :cond_14
    instance-of p1, p1, LV7/b$d$c;

    if-eqz p1, :cond_15

    sget-object p1, Lnd/h$a;->G5_NR_ADVANCED:Lnd/h$a;

    :goto_0
    return-object p1

    :cond_15
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final q(ILV7/b;)LV7/a;
    .locals 1

    instance-of v0, p2, LV7/b$e;

    if-nez v0, :cond_3

    instance-of v0, p2, LV7/b$a;

    if-nez v0, :cond_3

    instance-of v0, p2, LV7/b$b;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p2, LV7/b$c;

    if-nez v0, :cond_2

    instance-of p2, p2, LV7/b$d;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    sget-object p2, LV7/a$b;->e:LV7/a$b$a;

    invoke-virtual {p2, p1}, LV7/a$b$a;->a(I)LV7/a$b;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    sget-object p2, LV7/a$a;->e:LV7/a$a$a;

    invoke-virtual {p2, p1}, LV7/a$a$a;->a(I)LV7/a$a;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private final r(Ljava/lang/String;)Lgg/z;
    .locals 9

    iget-object v0, p0, Lnd/h;->g:Lje/u;

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v1

    iget-object v0, p0, Lnd/h;->c:LCd/f;

    invoke-interface {v0}, LCd/f;->getState()Lgg/i;

    move-result-object v2

    iget-object v0, p0, Lnd/h;->e:LZc/c;

    invoke-interface {v0}, LZc/c;->a()Lgg/i;

    move-result-object v3

    iget-object v0, p0, Lnd/h;->f:Lad/i;

    invoke-interface {v0}, Lad/d;->a()Lgg/i;

    move-result-object v4

    iget-object v0, p0, Lnd/h;->d:LCc/n;

    invoke-interface {v0}, LCc/n;->a()Lgg/i;

    move-result-object v5

    iget-object v0, p0, Lnd/h;->h:LBc/a;

    invoke-interface {v0}, LBc/a;->e()Lgg/i;

    move-result-object v6

    iget-object v0, p0, Lnd/h;->h:LBc/a;

    invoke-interface {v0}, LBc/a;->d()Lgg/i;

    move-result-object v7

    new-instance v8, Lnd/h$g;

    invoke-direct {v8, p1}, Lnd/h$g;-><init>(Ljava/lang/String;)V

    invoke-static/range {v1 .. v8}, Lgg/i;->q(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/k;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    const-string v0, "firstOrError(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final s(Ljava/lang/String;)Lgg/b;
    .locals 2

    iget-object v0, p0, Lnd/h;->i:Lgg/z;

    new-instance v1, Lnd/h$m;

    invoke-direct {v1, p1}, Lnd/h$m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final t(Lnd/f;)Lgg/b;
    .locals 2

    iget-object v0, p0, Lnd/h;->i:Lgg/z;

    new-instance v1, Lnd/h$n;

    invoke-direct {v1, p0, p1}, Lnd/h$n;-><init>(Lnd/h;Lnd/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final u(Lnd/f;)LWb/f;
    .locals 24

    move-object/from16 v0, p0

    new-instance v22, LWb/f;

    invoke-virtual/range {p1 .. p1}, Lnd/f;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/t;->s(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lnd/f;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lnd/f;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lnd/f;->d()Lh9/a;

    move-result-object v1

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    const-string v6, ""

    invoke-virtual {v1, v6}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, v5

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lnd/f;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lnd/f;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lnd/f;->l()LS8/l;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lnd/f;->s()LW7/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LW7/a;->b()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v10, v1

    goto :goto_1

    :cond_1
    move-object v10, v5

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lnd/f;->i()Lb8/b;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lnd/f;->f()Lb8/b;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lnd/f;->k()Lb8/d;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lb8/d;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v13, v1

    goto :goto_2

    :cond_2
    move-object v13, v5

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lnd/f;->c()LS8/c;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lnd/f;->h()LS8/a;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lnd/f;->e()J

    move-result-wide v16

    invoke-virtual/range {p1 .. p1}, Lnd/f;->q()Ljava/lang/Integer;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lnd/f;->n()LV7/a;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LW7/f;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_3

    :cond_3
    move-object/from16 v19, v5

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lnd/f;->m()LV7/b;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-direct {v0, v1}, Lnd/h;->p(LV7/b;)Lnd/h$a;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lnd/h$a;->getDbId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_4

    :cond_4
    move-object/from16 v20, v5

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lnd/f;->p()LV7/a;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, LW7/f;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v21, v1

    goto :goto_5

    :cond_5
    move-object/from16 v21, v5

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lnd/f;->o()LV7/b;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-direct {v0, v1}, Lnd/h;->p(LV7/b;)Lnd/h$a;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lnd/h$a;->getDbId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v23, v1

    goto :goto_6

    :cond_6
    move-object/from16 v23, v5

    :goto_6
    move-object/from16 v1, v22

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-wide/from16 v15, v16

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v23

    invoke-direct/range {v1 .. v21}, LWb/f;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LS8/l;Ljava/lang/Long;Lb8/b;Lb8/b;Ljava/lang/Integer;LS8/c;LS8/a;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v22
.end method

.method private final v(Lnd/h$b;J)LWb/g;
    .locals 2

    new-instance v0, LWb/g;

    iget-object v1, p0, Lnd/h;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lnd/h$b;->getNameResource()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "getString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p2, p3}, LWb/g;-><init>(Ljava/lang/String;J)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lgg/b;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnd/h;->i:Lgg/z;

    new-instance v1, Lnd/h$d;

    invoke-direct {v1, p1}, Lnd/h$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lgg/z;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lnd/h;->r(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    new-instance v0, Lnd/h$c;

    invoke-direct {v0, p0}, Lnd/h$c;-><init>(Lnd/h;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Lcom/ui/wifiman/model/speedtest/result/b$c;J)LXb/c;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/model/speedtest/result/d$a;->a(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/b$c;J)LXb/c;

    move-result-object p1

    return-object p1
.end method

.method public d(LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$c;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/d$a;->d(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$c;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)Lgg/i;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnd/h;->i:Lgg/z;

    new-instance v1, Lnd/h$h;

    invoke-direct {v1, p1}, Lnd/h$h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    new-instance v0, Lnd/h$i;

    invoke-direct {v0, p0}, Lnd/h$i;-><init>(Lnd/h;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f()Lgg/i;
    .locals 1

    iget-object v0, p0, Lnd/h;->k:Lgg/i;

    return-object v0
.end method

.method public g(LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$b;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/d$a;->c(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object p1

    return-object p1
.end method

.method public h()Lgg/i;
    .locals 1

    iget-object v0, p0, Lnd/h;->j:Lgg/i;

    return-object v0
.end method
