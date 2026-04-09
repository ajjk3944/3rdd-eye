.class final Ln8/a$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/a$u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$u;

    invoke-direct {v0}, Ln8/a$u;-><init>()V

    sput-object v0, Ln8/a$u;->a:Ln8/a$u;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKe/a$a;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ll9/a;

    check-cast p4, Ll9/a;

    check-cast p5, Ll9/a;

    check-cast p6, Ljava/util/List;

    check-cast p7, Ljava/util/List;

    check-cast p8, Ljava/util/List;

    check-cast p9, Ln8/a$b;

    invoke-virtual/range {p0 .. p9}, Ln8/a$u;->b(LKe/a$a;Ljava/util/List;Ll9/a;Ll9/a;Ll9/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln8/a$b;)LEe/g;

    move-result-object p1

    return-object p1
.end method

.method public final b(LKe/a$a;Ljava/util/List;Ll9/a;Ll9/a;Ll9/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln8/a$b;)LEe/g;
    .locals 22

    move-object/from16 v0, p1

    move-object/from16 v4, p2

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    const-string/jumbo v1, "header"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "general"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "<destruct>"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p4

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "bluetooth"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifiSignals"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "wifi"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "secondaryStats"

    move-object/from16 v10, p9

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p3 .. p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKe/a$g;

    invoke-virtual/range {p4 .. p4}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, LKe/a$c;

    invoke-virtual/range {p5 .. p5}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, LKe/a$f;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, LEe/g$a$b;

    invoke-direct {v2, v0}, LEe/g$a$b;-><init>(LEe/g$b;)V

    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_0

    new-instance v0, LEe/g$a$b;

    invoke-direct {v0, v1}, LEe/g$a$b;-><init>(LEe/g$b;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    move-object v0, v4

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v14, LEe/g$a$a;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string/jumbo v1, "cardGeneral"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v14

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v6}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v11, :cond_2

    new-instance v0, LEe/g$a$a;

    invoke-virtual {v11}, LKe/a$c;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-static {v11}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v15, v0

    invoke-direct/range {v15 .. v21}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, LEe/g$a$a;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f11009b

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->d()Ljava/util/List;

    move-result-object v18

    const/16 v19, 0x4

    const/16 v20, 0x0

    const-string/jumbo v15, "cardNetwork"

    const/16 v17, 0x0

    move-object v14, v0

    move-object/from16 v16, v1

    invoke-direct/range {v14 .. v20}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    const v0, 0x7f110090

    if-eqz v12, :cond_4

    new-instance v1, LEe/g$a$a;

    new-instance v2, Ls9/d$b;

    invoke-direct {v2, v0}, Ls9/d$b;-><init>(I)V

    invoke-static {v12}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const/16 v19, 0x4

    const/16 v20, 0x0

    const-string/jumbo v15, "cardBluetoothSignal"

    const/16 v17, 0x0

    move-object v14, v1

    move-object/from16 v16, v2

    invoke-direct/range {v14 .. v20}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    move-object v1, v7

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v11, 0x0

    if-nez v1, :cond_6

    new-instance v14, LEe/g$a$a;

    if-nez v12, :cond_5

    new-instance v1, Ls9/d$b;

    invoke-direct {v1, v0}, Ls9/d$b;-><init>(I)V

    move-object v2, v1

    goto :goto_0

    :cond_5
    move-object v2, v11

    :goto_0
    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string/jumbo v1, "cardBluetooth"

    const/4 v3, 0x0

    move-object v0, v14

    move-object/from16 v4, p6

    invoke-direct/range {v0 .. v6}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    move-object v0, v8

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v7, LEe/g$a$a;

    new-instance v2, Ls9/d$b;

    const v0, 0x7f1100a7

    invoke-direct {v2, v0}, Ls9/d$b;-><init>(I)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string/jumbo v1, "cardWifiSignal"

    const/4 v3, 0x0

    move-object v0, v7

    move-object/from16 v4, p7

    invoke-direct/range {v0 .. v6}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object v0, v9

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    new-instance v7, LEe/g$a$a;

    invoke-interface/range {p7 .. p7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Ls9/d$b;

    const v1, 0x7f1100a8

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    move-object v2, v0

    goto :goto_1

    :cond_8
    move-object v2, v11

    :goto_1
    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string/jumbo v1, "cardWifi"

    const/4 v3, 0x0

    move-object v0, v7

    move-object/from16 v4, p8

    invoke-direct/range {v0 .. v6}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    new-instance v0, LEe/g$a$a;

    invoke-interface/range {p7 .. p7}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v11, Ls9/d$b;

    const v1, 0x7f110093

    invoke-direct {v11, v1}, Ls9/d$b;-><init>(I)V

    :cond_a
    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->b()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    const-string/jumbo v4, "cardCellular"

    const/4 v5, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v4

    move-object/from16 p3, v11

    move-object/from16 p4, v5

    move-object/from16 p5, v1

    move/from16 p6, v2

    move-object/from16 p7, v3

    invoke-direct/range {p1 .. p7}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    new-instance v0, LEe/g$a$a;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f110096

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->c()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    const-string/jumbo v5, "cardNetbios"

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v5

    move-object/from16 p3, v1

    move-object/from16 p4, v6

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    invoke-direct/range {p1 .. p7}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    new-instance v0, LEe/g$a$a;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f11009f

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->f()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    const-string/jumbo v5, "cardSnmp"

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v5

    move-object/from16 p3, v1

    move-object/from16 p4, v6

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    invoke-direct/range {p1 .. p7}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    new-instance v0, LEe/g$a$a;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f1100a6

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->g()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    const-string/jumbo v5, "cardUpnp"

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v5

    move-object/from16 p3, v1

    move-object/from16 p4, v6

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    invoke-direct/range {p1 .. p7}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f

    new-instance v0, LEe/g$a$a;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f110092

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->a()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    const-string/jumbo v5, "cardBonjour"

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v5

    move-object/from16 p3, v1

    move-object/from16 p4, v6

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    invoke-direct/range {p1 .. p7}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    new-instance v0, LEe/g$a$a;

    new-instance v1, Ls9/d$b;

    const v2, 0x7f110211

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-virtual/range {p9 .. p9}, Ln8/a$b;->e()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    const-string/jumbo v5, "cardPortScan"

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v5

    move-object/from16 p3, v1

    move-object/from16 p4, v6

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    invoke-direct/range {p1 .. p7}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    new-instance v0, LEe/g;

    invoke-direct {v0, v13}, LEe/g;-><init>(Ljava/util/List;)V

    return-object v0
.end method
