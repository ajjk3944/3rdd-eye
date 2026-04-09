.class final Lwc/m$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/m;-><init>(Lwc/d;Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;Lcom/ui/wifiman/model/bluetooth/le/BleScanner;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwc/m$j$a;
    }
.end annotation


# static fields
.field public static final a:Lwc/m$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwc/m$j;

    invoke-direct {v0}, Lwc/m$j;-><init>()V

    sput-object v0, Lwc/m$j;->a:Lwc/m$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Ljava/util/Set;
    .locals 25

    const-string v0, "<destruct>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, LZg/U;->d(I)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lsh/m;->d(II)I

    move-result v3

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->c()Lh9/a;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    invoke-static {v0, v4}, Lsh/m;->d(II)I

    move-result v0

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->c()Lh9/a;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlin/jvm/internal/T;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/T;-><init>(I)V

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v6, v4, [Lh9/a;

    invoke-interface {v3, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/T;->b(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    new-array v6, v4, [Lh9/a;

    invoke-interface {v3, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/T;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/T;->c()I

    move-result v3

    new-array v3, v3, [Lh9/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/T;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->f([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v0

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lh9/a;

    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_3

    if-eqz v7, :cond_2

    goto :goto_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "at least one result must be available at this point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_3
    check-cast v7, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->g()Lh9/a;

    move-result-object v8

    if-nez v8, :cond_5

    :cond_4
    move-object v8, v9

    :cond_5
    const/4 v10, 0x1

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->e()Z

    move-result v11

    if-ne v11, v10, :cond_6

    goto :goto_4

    :cond_6
    move-object v11, v6

    check-cast v11, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    if-eqz v11, :cond_7

    invoke-virtual {v11}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->a()Z

    move-result v11

    if-ne v11, v10, :cond_7

    :goto_4
    move v11, v10

    goto :goto_5

    :cond_7
    move v11, v4

    :goto_5
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->k()Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a$a;

    move-result-object v12

    if-eqz v12, :cond_b

    sget-object v13, Lwc/m$j$a;->a:[I

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v12, v13, v12

    if-eq v12, v10, :cond_a

    if-eq v12, v1, :cond_9

    const/4 v13, 0x3

    if-ne v12, v13, :cond_8

    sget-object v12, Lwc/a$a;->FACTORY:Lwc/a$a;

    goto :goto_6

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    sget-object v12, Lwc/a$a;->NORMAL:Lwc/a$a;

    goto :goto_6

    :cond_a
    sget-object v12, Lwc/a$a;->BOOTING:Lwc/a$a;

    :goto_6
    if-nez v12, :cond_c

    :cond_b
    sget-object v12, Lwc/a$a;->NORMAL:Lwc/a$a;

    :cond_c
    const/4 v13, 0x0

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->j()LU7/a;

    move-result-object v14

    if-nez v14, :cond_f

    :cond_d
    move-object v14, v6

    check-cast v14, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    if-eqz v14, :cond_e

    invoke-virtual {v14}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->e()LU7/a;

    move-result-object v14

    goto :goto_7

    :cond_e
    move-object v14, v13

    :cond_f
    :goto_7
    if-eqz v7, :cond_10

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->h()Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_12

    :cond_10
    move-object v15, v6

    check-cast v15, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    if-eqz v15, :cond_11

    invoke-virtual {v15}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->d()Ljava/lang/String;

    move-result-object v15

    goto :goto_8

    :cond_11
    move-object v15, v13

    :cond_12
    :goto_8
    if-eqz v7, :cond_13

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->n()LCc/b;

    move-result-object v16

    if-nez v16, :cond_15

    :cond_13
    move-object/from16 v16, v6

    check-cast v16, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    if-eqz v16, :cond_14

    invoke-virtual/range {v16 .. v16}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->g()LCc/b;

    move-result-object v16

    goto :goto_9

    :cond_14
    move-object/from16 v16, v13

    :cond_15
    :goto_9
    if-eqz v7, :cond_16

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->o()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v17

    if-nez v17, :cond_18

    :cond_16
    move-object/from16 v17, v6

    check-cast v17, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    if-eqz v17, :cond_17

    invoke-virtual/range {v17 .. v17}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->h()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v17

    goto :goto_a

    :cond_17
    move-object/from16 v17, v13

    :cond_18
    :goto_a
    if-eqz v7, :cond_19

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->i()Lxa/a$d;

    move-result-object v18

    goto :goto_b

    :cond_19
    move-object/from16 v18, v13

    :goto_b
    if-eqz v7, :cond_1a

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->a()Ljava/lang/Long;

    move-result-object v19

    goto :goto_c

    :cond_1a
    move-object/from16 v19, v13

    :goto_c
    if-eqz v7, :cond_1b

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->l()Ljava/util/Set;

    move-result-object v20

    if-nez v20, :cond_1d

    :cond_1b
    move-object/from16 v20, v6

    check-cast v20, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    if-eqz v20, :cond_1c

    invoke-virtual/range {v20 .. v20}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->f()Ljava/util/Set;

    move-result-object v20

    goto :goto_d

    :cond_1c
    move-object/from16 v20, v13

    :goto_d
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_1d
    if-eqz v7, :cond_1e

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->m()Ljava/lang/Integer;

    move-result-object v21

    goto :goto_e

    :cond_1e
    move-object/from16 v21, v13

    :goto_e
    if-eqz v7, :cond_1f

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->b()Ljava/util/List;

    move-result-object v22

    if-nez v22, :cond_20

    :cond_1f
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v22

    :cond_20
    if-eqz v7, :cond_21

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->d()Z

    move-result v1

    if-ne v1, v10, :cond_21

    move v1, v10

    goto :goto_f

    :cond_21
    move v1, v4

    :goto_f
    if-eqz v7, :cond_22

    invoke-virtual {v7}, Lcom/ui/wifiman/model/bluetooth/le/BleScanner$a;->f()J

    move-result-wide v6

    :goto_10
    move-wide/from16 v23, v6

    goto :goto_11

    :cond_22
    check-cast v6, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    if-eqz v6, :cond_23

    invoke-virtual {v6}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;->b()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    :cond_23
    invoke-static {v13}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_10

    :goto_11
    new-instance v6, Lwc/a;

    move-object v7, v6

    move v10, v11

    move-object v11, v12

    move-object v12, v14

    move-object v13, v15

    move-object/from16 v14, v16

    move-object/from16 v15, v17

    move-object/from16 v16, v18

    move-object/from16 v17, v19

    move-object/from16 v18, v20

    move-object/from16 v19, v21

    move-object/from16 v20, v22

    move/from16 v21, v1

    move-wide/from16 v22, v23

    invoke-direct/range {v7 .. v23}, Lwc/a;-><init>(Lh9/a;Lh9/a;ZLwc/a$a;LU7/a;Ljava/lang/String;LCc/b;Lcom/ui/wifiman/model/vendor/d;Lxa/a$d;Ljava/lang/Long;Ljava/util/Set;Ljava/lang/Integer;Ljava/util/List;ZJ)V

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x2

    goto/16 :goto_2

    :cond_24
    return-object v3
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lwc/m$j;->a(LYg/s;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
