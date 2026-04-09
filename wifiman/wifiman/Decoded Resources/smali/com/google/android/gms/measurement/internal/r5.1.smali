.class final Lcom/google/android/gms/measurement/internal/r5;
.super Lcom/google/android/gms/measurement/internal/U6;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/d7;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/U6;-><init>(Lcom/google/android/gms/measurement/internal/d7;)V

    return-void
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    new-instance p0, Ljava/lang/SecurityException;

    const-string p1, "This implementation should not be used."

    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected final t()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final u(Lcom/google/android/gms/measurement/internal/L;Ljava/lang/String;)[B
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v15, p2

    const-string v2, "_r"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->j()V

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/v3;->j()V

    invoke-static/range {p1 .. p1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Ls3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/L;->a:Ljava/lang/String;

    const-string v4, "_iap"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v14, 0x0

    if-nez v3, :cond_0

    const-string v3, "_iapx"

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/L;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v3, "Generating a payload for this event is not available. package_name, event_name"

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/L;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v15, v0}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v14

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/w2;->L()Lcom/google/android/gms/internal/measurement/w2$a;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/q;->j1()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3, v15}, Lcom/google/android/gms/measurement/internal/q;->Q0(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/h2;

    move-result-object v11

    const/4 v12, 0x0

    if-nez v11, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v2, "Log and bundle not available. package_name"

    invoke-virtual {v0, v2, v15}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v12, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->m1()V

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_1
    :try_start_1
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->A()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v0

    const-string v2, "Log and bundle disabled. package_name"

    invoke-virtual {v0, v2, v15}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v12, [B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->m1()V

    return-object v0

    :cond_2
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/x2;->D2()Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v3

    const/4 v9, 0x1

    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/measurement/x2$a;->D0(I)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v3

    const-string v4, "android"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/measurement/x2$a;->g1(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v10

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->l()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/x2$a;->Z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_3
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->n()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->n()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/x2$a;->m0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_4
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->o()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->o()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/x2$a;->t0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_5
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->V()J

    move-result-wide v3

    const-wide/32 v5, -0x80000000

    cmp-long v3, v3, v5

    if-eqz v3, :cond_6

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->V()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/x2$a;->p0(I)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_6
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->A0()J

    move-result-wide v3

    invoke-virtual {v10, v3, v4}, Lcom/google/android/gms/internal/measurement/x2$a;->A0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v3

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->w0()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->r0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/x2$a;->a1(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    goto :goto_0

    :cond_7
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/x2$a;->M(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_8
    :goto_0
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->K0()J

    move-result-wide v3

    invoke-virtual {v10, v3, v4}, Lcom/google/android/gms/internal/measurement/x2$a;->Q0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/P6;->b:Lcom/google/android/gms/measurement/internal/d7;

    invoke-virtual {v3, v15}, Lcom/google/android/gms/measurement/internal/d7;->a0(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/e4;

    move-result-object v3

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->u0()J

    move-result-wide v4

    invoke-virtual {v10, v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->k0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    iget-object v4, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/v3;->n()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v4

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/x2$a;->n1()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/measurement/internal/l;->L(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/e4;->w()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-virtual {v10, v14}, Lcom/google/android/gms/internal/measurement/x2$a;->O0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_9
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/e4;->u()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/x2$a;->B0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/e4;->w()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->z()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->o()Lcom/google/android/gms/measurement/internal/o6;

    move-result-object v4

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->l()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Lcom/google/android/gms/measurement/internal/o6;->v(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/e4;)Landroid/util/Pair;

    move-result-object v4

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->z()Z

    move-result v5

    if-eqz v5, :cond_a

    if-eqz v4, :cond_a

    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v5, :cond_a

    :try_start_3
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-wide v6, v0, Lcom/google/android/gms/measurement/internal/L;->d:J

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/google/android/gms/measurement/internal/r5;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->i1(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v4, :cond_a

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/x2$a;->h0(Z)Lcom/google/android/gms/internal/measurement/x2$a;

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v3, "Resettable device id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v12, [B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->m1()V

    return-object v0

    :cond_a
    :goto_1
    :try_start_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->b()Lcom/google/android/gms/measurement/internal/F;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/measurement/internal/d4;->l()V

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/measurement/x2$a;->J0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->b()Lcom/google/android/gms/measurement/internal/F;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/d4;->l()V

    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->e1(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->b()Lcom/google/android/gms/measurement/internal/F;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/F;->q()J

    move-result-wide v5

    long-to-int v5, v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->M0(I)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->b()Lcom/google/android/gms/measurement/internal/F;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/measurement/internal/F;->r()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->m1(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/e4;->x()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->m()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->m()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-wide v4, v0, Lcom/google/android/gms/measurement/internal/L;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/measurement/internal/r5;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/x2$a;->g0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;
    :try_end_6
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v0

    move v4, v12

    goto/16 :goto_9

    :cond_b
    :goto_2
    :try_start_7
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->p()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->p()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/x2$a;->Y0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_c
    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/measurement/internal/q;->d1(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/measurement/internal/u7;

    const-string v7, "_lte"

    iget-object v8, v6, Lcom/google/android/gms/measurement/internal/u7;->c:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    goto :goto_3

    :cond_e
    move-object v6, v14

    :goto_3
    const-wide/16 v23, 0x0

    if-eqz v6, :cond_f

    iget-object v5, v6, Lcom/google/android/gms/measurement/internal/u7;->e:Ljava/lang/Object;

    if-nez v5, :cond_10

    :cond_f
    new-instance v5, Lcom/google/android/gms/measurement/internal/u7;

    const-string v18, "auto"

    const-string v19, "_lte"

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v6

    invoke-interface {v6}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v20

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v22

    move-object/from16 v16, v5

    move-object/from16 v17, v3

    invoke-direct/range {v16 .. v22}, Lcom/google/android/gms/measurement/internal/u7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/measurement/internal/q;->i0(Lcom/google/android/gms/measurement/internal/u7;)Z

    :cond_10
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Lcom/google/android/gms/internal/measurement/C2;

    move v5, v12

    :goto_4
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_11

    invoke-static {}, Lcom/google/android/gms/internal/measurement/C2;->R()Lcom/google/android/gms/internal/measurement/C2$a;

    move-result-object v6

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/measurement/internal/u7;

    iget-object v7, v7, Lcom/google/android/gms/measurement/internal/u7;->c:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/measurement/C2$a;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/C2$a;

    move-result-object v6

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/measurement/internal/u7;

    iget-wide v7, v7, Lcom/google/android/gms/measurement/internal/u7;->d:J

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/C2$a;->B(J)Lcom/google/android/gms/internal/measurement/C2$a;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->k()Lcom/google/android/gms/measurement/internal/s7;

    move-result-object v7

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/measurement/internal/u7;

    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/u7;->e:Ljava/lang/Object;

    invoke-virtual {v7, v6, v8}, Lcom/google/android/gms/measurement/internal/s7;->R(Lcom/google/android/gms/internal/measurement/C2$a;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/D4$b;->p()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/D4;

    check-cast v6, Lcom/google/android/gms/internal/measurement/C2;

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_11
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/x2$a;->s0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/x2$a;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/P6;->b:Lcom/google/android/gms/measurement/internal/d7;

    invoke-virtual {v3, v11, v10}, Lcom/google/android/gms/measurement/internal/d7;->w(Lcom/google/android/gms/measurement/internal/h2;Lcom/google/android/gms/internal/measurement/x2$a;)V

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/P6;->b:Lcom/google/android/gms/measurement/internal/d7;

    invoke-virtual {v3, v11, v10}, Lcom/google/android/gms/measurement/internal/d7;->i0(Lcom/google/android/gms/measurement/internal/h2;Lcom/google/android/gms/internal/measurement/x2$a;)V

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/P2;->b(Lcom/google/android/gms/measurement/internal/L;)Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v4

    iget-object v5, v3, Lcom/google/android/gms/measurement/internal/P2;->d:Landroid/os/Bundle;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v6

    invoke-virtual {v6, v15}, Lcom/google/android/gms/measurement/internal/q;->M0(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/measurement/internal/x7;->J(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v5

    invoke-virtual {v5, v15}, Lcom/google/android/gms/measurement/internal/l;->t(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v4, v3, v5}, Lcom/google/android/gms/measurement/internal/x7;->S(Lcom/google/android/gms/measurement/internal/P2;I)V

    iget-object v7, v3, Lcom/google/android/gms/measurement/internal/P2;->d:Landroid/os/Bundle;

    const-string v3, "_c"

    const-wide/16 v4, 0x1

    invoke-virtual {v7, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v3

    const-string v6, "Marking in-app purchase as real-time"

    invoke-virtual {v3, v6}, Lcom/google/android/gms/measurement/internal/N2;->a(Ljava/lang/String;)V

    invoke-virtual {v7, v2, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "_o"

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/L;->c:Ljava/lang/String;

    invoke-virtual {v7, v3, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v3

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/x2$a;->n1()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11}, Lcom/google/android/gms/measurement/internal/h2;->v()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v6, v8}, Lcom/google/android/gms/measurement/internal/x7;->B0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v3

    const-string v6, "_dbg"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v3, v7, v6, v8}, Lcom/google/android/gms/measurement/internal/x7;->K(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->g()Lcom/google/android/gms/measurement/internal/x7;

    move-result-object v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v7, v2, v4}, Lcom/google/android/gms/measurement/internal/x7;->K(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/L;->a:Ljava/lang/String;

    invoke-virtual {v2, v15, v3}, Lcom/google/android/gms/measurement/internal/q;->P0(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/H;

    move-result-object v2

    if-nez v2, :cond_13

    new-instance v17, Lcom/google/android/gms/measurement/internal/H;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/L;->a:Ljava/lang/String;

    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/L;->d:J

    const/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v2, v17

    move-object/from16 v3, p2

    move-wide/from16 v29, v5

    move-wide/from16 v5, v19

    move-object/from16 v19, v7

    move-wide/from16 v7, v21

    move-object/from16 v31, v10

    move-wide/from16 v9, v29

    move-object/from16 v20, v11

    move-wide/from16 v11, v25

    move-object/from16 v32, v13

    move-object/from16 v13, v27

    move-object/from16 v21, v14

    move-object/from16 v14, v28

    move-object/from16 v15, v16

    move-object/from16 v16, v18

    invoke-direct/range {v2 .. v16}, Lcom/google/android/gms/measurement/internal/H;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move-object/from16 v12, v17

    move-wide/from16 v9, v23

    goto :goto_5

    :cond_13
    move-object/from16 v19, v7

    move-object/from16 v31, v10

    move-object/from16 v20, v11

    move-object/from16 v32, v13

    move-object/from16 v21, v14

    iget-wide v3, v2, Lcom/google/android/gms/measurement/internal/H;->f:J

    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/L;->d:J

    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/measurement/internal/H;->a(J)Lcom/google/android/gms/measurement/internal/H;

    move-result-object v17

    move-wide v9, v3

    move-object/from16 v12, v17

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2, v12}, Lcom/google/android/gms/measurement/internal/q;->U(Lcom/google/android/gms/measurement/internal/H;)V

    new-instance v13, Lcom/google/android/gms/measurement/internal/I;

    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/a4;->a:Lcom/google/android/gms/measurement/internal/v3;

    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/L;->c:Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/L;->a:Ljava/lang/String;

    iget-wide v7, v0, Lcom/google/android/gms/measurement/internal/L;->d:J

    move-object v2, v13

    move-object/from16 v5, p2

    move-object/from16 v11, v19

    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/measurement/internal/I;-><init>(Lcom/google/android/gms/measurement/internal/v3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s2;->R()Lcom/google/android/gms/internal/measurement/s2$a;

    move-result-object v2

    iget-wide v3, v13, Lcom/google/android/gms/measurement/internal/I;->d:J

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/s2$a;->H(J)Lcom/google/android/gms/internal/measurement/s2$a;

    move-result-object v2

    iget-object v3, v13, Lcom/google/android/gms/measurement/internal/I;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/measurement/s2$a;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s2$a;

    move-result-object v2

    iget-wide v3, v13, Lcom/google/android/gms/measurement/internal/I;->e:J

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/s2$a;->A(J)Lcom/google/android/gms/internal/measurement/s2$a;

    move-result-object v2

    iget-object v3, v13, Lcom/google/android/gms/measurement/internal/I;->f:Lcom/google/android/gms/measurement/internal/K;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/K;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_14
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u2;->T()Lcom/google/android/gms/internal/measurement/u2$a;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/u2$a;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/u2$a;

    move-result-object v5

    iget-object v6, v13, Lcom/google/android/gms/measurement/internal/I;->f:Lcom/google/android/gms/measurement/internal/K;

    invoke-virtual {v6, v4}, Lcom/google/android/gms/measurement/internal/K;->j(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_14

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->k()Lcom/google/android/gms/measurement/internal/s7;

    move-result-object v6

    invoke-virtual {v6, v5, v4}, Lcom/google/android/gms/measurement/internal/s7;->Q(Lcom/google/android/gms/internal/measurement/u2$a;Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/measurement/s2$a;->B(Lcom/google/android/gms/internal/measurement/u2$a;)Lcom/google/android/gms/internal/measurement/s2$a;

    goto :goto_6

    :cond_15
    move-object/from16 v3, v31

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/measurement/x2$a;->F(Lcom/google/android/gms/internal/measurement/s2$a;)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/measurement/y2;->F()Lcom/google/android/gms/internal/measurement/y2$a;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/t2;->F()Lcom/google/android/gms/internal/measurement/t2$a;

    move-result-object v6

    iget-wide v7, v12, Lcom/google/android/gms/measurement/internal/H;->c:J

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/measurement/t2$a;->u(J)Lcom/google/android/gms/internal/measurement/t2$a;

    move-result-object v6

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/L;->a:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/measurement/t2$a;->w(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/t2$a;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/measurement/y2$a;->u(Lcom/google/android/gms/internal/measurement/t2$a;)Lcom/google/android/gms/internal/measurement/y2$a;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/measurement/x2$a;->G(Lcom/google/android/gms/internal/measurement/y2$a;)Lcom/google/android/gms/internal/measurement/x2$a;

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->l()Lcom/google/android/gms/measurement/internal/C7;

    move-result-object v5

    invoke-virtual/range {v20 .. v20}, Lcom/google/android/gms/measurement/internal/h2;->l()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/x2$a;->Q()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/s2$a;->K()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/s2$a;->K()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual/range {v5 .. v11}, Lcom/google/android/gms/measurement/internal/C7;->v(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/x2$a;->L(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/x2$a;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/s2$a;->O()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/s2$a;->K()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->N0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/s2$a;->K()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->w0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_16
    invoke-virtual/range {v20 .. v20}, Lcom/google/android/gms/measurement/internal/h2;->E0()J

    move-result-wide v4

    cmp-long v0, v4, v23

    if-eqz v0, :cond_17

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->E0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_17
    invoke-virtual/range {v20 .. v20}, Lcom/google/android/gms/measurement/internal/h2;->I0()J

    move-result-wide v6

    cmp-long v2, v6, v23

    if-eqz v2, :cond_18

    invoke-virtual {v3, v6, v7}, Lcom/google/android/gms/internal/measurement/x2$a;->I0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    goto :goto_7

    :cond_18
    if-eqz v0, :cond_19

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/measurement/x2$a;->I0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    :cond_19
    :goto_7
    invoke-virtual/range {v20 .. v20}, Lcom/google/android/gms/measurement/internal/h2;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/measurement/internal/N;->L0:Lcom/google/android/gms/measurement/internal/q2;

    move-object/from16 v5, p2

    invoke-virtual {v2, v5, v4}, Lcom/google/android/gms/measurement/internal/l;->D(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v2

    if-eqz v2, :cond_1b

    if-eqz v0, :cond_1b

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/x2$a;->k1(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/x2$a;

    goto :goto_8

    :cond_1a
    move-object/from16 v5, p2

    :cond_1b
    :goto_8
    invoke-virtual/range {v20 .. v20}, Lcom/google/android/gms/measurement/internal/h2;->y()V

    invoke-virtual/range {v20 .. v20}, Lcom/google/android/gms/measurement/internal/h2;->G0()J

    move-result-wide v6

    long-to-int v0, v6

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/measurement/x2$a;->v0(I)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v0

    const-wide/32 v6, 0x1ccf3

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/measurement/x2$a;->X0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzb()Lcom/google/android/gms/common/util/d;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/measurement/x2$a;->U0(J)Lcom/google/android/gms/internal/measurement/x2$a;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/x2$a;->n0(Z)Lcom/google/android/gms/internal/measurement/x2$a;

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/P6;->b:Lcom/google/android/gms/measurement/internal/d7;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/x2$a;->n1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/d7;->G(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/x2$a;)V

    move-object/from16 v0, v32

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/w2$a;->x(Lcom/google/android/gms/internal/measurement/x2$a;)Lcom/google/android/gms/internal/measurement/w2$a;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/x2$a;->u0()J

    move-result-wide v6

    move-object/from16 v2, v20

    invoke-virtual {v2, v6, v7}, Lcom/google/android/gms/measurement/internal/h2;->D0(J)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/x2$a;->o0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/measurement/internal/h2;->z0(J)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4, v4}, Lcom/google/android/gms/measurement/internal/q;->V(Lcom/google/android/gms/measurement/internal/h2;ZZ)V

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->o1()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->m1()V

    :try_start_8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->k()Lcom/google/android/gms/measurement/internal/s7;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/D4$b;->p()Lcom/google/android/gms/internal/measurement/h5;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/w2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/N3;->i()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/measurement/internal/s7;->d0([B)[B

    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->C()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v3, "Data loss. Failed to bundle and serialize. appId"

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/measurement/internal/L2;->r(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v21

    :goto_9
    :try_start_9
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/L2;->B()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v2

    const-string v3, "app instance id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v4, [B
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->m1()V

    return-object v0

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/gms/measurement/internal/P6;->m()Lcom/google/android/gms/measurement/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/q;->m1()V

    throw v0
.end method
