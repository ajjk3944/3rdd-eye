.class public final Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LY6/h<",
        "Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;",
        "LY6/h;",
        "Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;",
        "LY6/r;",
        "moshi",
        "<init>",
        "(LY6/r;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "LY6/k;",
        "reader",
        "l",
        "(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;",
        "LY6/o;",
        "writer",
        "value_",
        "LYg/J;",
        "m",
        "(LY6/o;Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)V",
        "LY6/k$b;",
        "a",
        "LY6/k$b;",
        "options",
        "b",
        "LY6/h;",
        "nullableStringAdapter",
        "wifiman-wizard_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:LY6/k$b;

.field private final b:LY6/h;


# direct methods
.method public constructor <init>(LY6/r;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "moshi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LY6/h;-><init>()V

    const-string v22, "cap"

    const-string v23, "ubnt_flags"

    const-string v3, "ssid"

    const-string v4, "bssid"

    const-string v5, "freq"

    const-string v6, "ch"

    const-string v7, "ch_s0"

    const-string v8, "ch_s1"

    const-string v9, "sbw"

    const-string v10, "bw"

    const-string v11, "nss"

    const-string v12, "rssi"

    const-string v13, "mcs"

    const-string v14, "tpc"

    const-string v15, "rtt"

    const-string v16, "ch_util"

    const-string v17, "sta_cnt"

    const-string v18, "std"

    const-string v19, "akm"

    const-string v20, "cipher"

    const-string v21, "sdr"

    filled-new-array/range {v3 .. v23}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LY6/k$b;->a([Ljava/lang/String;)LY6/k$b;

    move-result-object v2

    const-string v3, "of(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->a:LY6/k$b;

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v2

    const-string v3, "ssid"

    const-class v4, Ljava/lang/String;

    invoke-virtual {v1, v4, v2, v3}, LY6/r;->f(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)LY6/h;

    move-result-object v1

    const-string v2, "adapter(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->l(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->m(LY6/o;Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)V

    return-void
.end method

.method public l(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LY6/k;->g()V

    const/4 v2, 0x0

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    move-object/from16 v21, v20

    move-object/from16 v22, v21

    move-object/from16 v23, v22

    move-object/from16 v24, v23

    :goto_0
    invoke-virtual/range {p1 .. p1}, LY6/k;->s()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->a:LY6/k$b;

    invoke-virtual {v1, v2}, LY6/k;->p0(LY6/k$b;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Ljava/lang/String;

    goto :goto_0

    :pswitch_1
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Ljava/lang/String;

    goto :goto_0

    :pswitch_2
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v22, v2

    check-cast v22, Ljava/lang/String;

    goto :goto_0

    :pswitch_3
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v21, v2

    check-cast v21, Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v2

    check-cast v20, Ljava/lang/String;

    goto :goto_0

    :pswitch_5
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    check-cast v19, Ljava/lang/String;

    goto :goto_0

    :pswitch_6
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Ljava/lang/String;

    goto :goto_0

    :pswitch_7
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Ljava/lang/String;

    goto :goto_0

    :pswitch_8
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Ljava/lang/String;

    goto :goto_0

    :pswitch_9
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/String;

    goto :goto_0

    :pswitch_a
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_b
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_c
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_d
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_e
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_f
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_10
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_11
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_12
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_13
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_14
    iget-object v2, v0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {v2, v1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    goto/16 :goto_0

    :pswitch_15
    invoke-virtual/range {p1 .. p1}, LY6/k;->t0()V

    invoke-virtual/range {p1 .. p1}, LY6/k;->u0()V

    goto/16 :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, LY6/k;->j()V

    new-instance v1, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;

    move-object v3, v1

    invoke-direct/range {v3 .. v24}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(LY6/o;Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;)V
    .locals 2

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    const-string v0, "ssid"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "bssid"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "freq"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "ch"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "ch_s0"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "ch_s1"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "sbw"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "bw"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "nss"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "rssi"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "mcs"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "tpc"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "rtt"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "ch_util"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "sta_cnt"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "std"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "akm"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "cipher"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "sdr"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "cap"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    const-string v0, "ubnt_flags"

    invoke-virtual {p1, v0}, LY6/o;->J(Ljava/lang/String;)LY6/o;

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult_ResultJsonAdapter;->b:LY6/h;

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;->t()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    invoke-virtual {p1}, LY6/o;->v()LY6/o;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x30

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "GeneratedJsonAdapter("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ApiV1WifiScanResult.Result"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
