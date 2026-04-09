.class final Lcom/google/android/gms/measurement/internal/c;
.super Lcom/google/android/gms/measurement/internal/d;
.source "SourceFile"


# instance fields
.field private g:Lcom/google/android/gms/internal/measurement/T1;

.field private final synthetic h:Lcom/google/android/gms/measurement/internal/C7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/C7;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/T1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/measurement/internal/d;-><init>(Ljava/lang/String;I)V

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T1;->j()I

    move-result v0

    return v0
.end method

.method final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/C2;Z)Z
    .locals 10

    invoke-static {}, Lcom/google/android/gms/internal/measurement/A6;->a()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/d;->a:Ljava/lang/String;

    sget-object v4, Lcom/google/android/gms/measurement/internal/N;->C0:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/measurement/internal/l;->F(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/T1;->K()Z

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/T1;->L()Z

    move-result v4

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/T1;->M()Z

    move-result v5

    if-nez v3, :cond_2

    if-nez v4, :cond_2

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move v3, v1

    goto :goto_2

    :cond_2
    :goto_1
    move v3, v2

    :goto_2
    const/4 v4, 0x0

    if-eqz p4, :cond_4

    if-nez v3, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object p1

    iget p2, p0, Lcom/google/android/gms/measurement/internal/d;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/T1;->N()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/T1;->j()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_3
    const-string p3, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {p1, p3, p2, v4}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v2

    :cond_4
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/T1;->G()Lcom/google/android/gms/internal/measurement/R1;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->L()Z

    move-result v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->X()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->N()Z

    move-result v8

    if-nez v8, :cond_5

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/a4;->c()Lcom/google/android/gms/measurement/internal/D2;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->T()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/D2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for long property. property"

    invoke-virtual {v6, v8, v7}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_5
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->O()J

    move-result-wide v8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->I()Lcom/google/android/gms/internal/measurement/S1;

    move-result-object v4

    invoke-static {v8, v9, v4}, Lcom/google/android/gms/measurement/internal/d;->c(JLcom/google/android/gms/internal/measurement/S1;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v7}, Lcom/google/android/gms/measurement/internal/d;->d(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_3

    :cond_6
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->V()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->N()Z

    move-result v8

    if-nez v8, :cond_7

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/a4;->c()Lcom/google/android/gms/measurement/internal/D2;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->T()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/D2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No number filter for double property. property"

    invoke-virtual {v6, v8, v7}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_7
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->F()D

    move-result-wide v8

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->I()Lcom/google/android/gms/internal/measurement/S1;

    move-result-object v4

    invoke-static {v8, v9, v4}, Lcom/google/android/gms/measurement/internal/d;->b(DLcom/google/android/gms/internal/measurement/S1;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v7}, Lcom/google/android/gms/measurement/internal/d;->d(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_3

    :cond_8
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->Z()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->P()Z

    move-result v8

    if-nez v8, :cond_b

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->N()Z

    move-result v8

    if-nez v8, :cond_9

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/a4;->c()Lcom/google/android/gms/measurement/internal/D2;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->T()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/D2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "No string or number filter defined. property"

    invoke-virtual {v6, v8, v7}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_9
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->U()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/google/android/gms/measurement/internal/s7;->c0(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->U()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->I()Lcom/google/android/gms/internal/measurement/S1;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/google/android/gms/measurement/internal/d;->e(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/S1;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v7}, Lcom/google/android/gms/measurement/internal/d;->d(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_3

    :cond_a
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/a4;->c()Lcom/google/android/gms/measurement/internal/D2;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->T()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/D2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->U()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Invalid user property value for Numeric number filter. property, value"

    invoke-virtual {v6, v9, v7, v8}, Lcom/google/android/gms/measurement/internal/N2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_b
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->U()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/R1;->J()Lcom/google/android/gms/internal/measurement/U1;

    move-result-object v6

    iget-object v8, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v8

    invoke-static {v4, v6, v8}, Lcom/google/android/gms/measurement/internal/d;->g(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/U1;Lcom/google/android/gms/measurement/internal/L2;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v4, v7}, Lcom/google/android/gms/measurement/internal/d;->d(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_3

    :cond_c
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/L2;->H()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v6

    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v7}, Lcom/google/android/gms/measurement/internal/a4;->c()Lcom/google/android/gms/measurement/internal/D2;

    move-result-object v7

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->T()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/gms/measurement/internal/D2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "User property has no value, property"

    invoke-virtual {v6, v8, v7}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_3
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/c;->h:Lcom/google/android/gms/measurement/internal/C7;

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/a4;->zzj()Lcom/google/android/gms/measurement/internal/L2;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/L2;->G()Lcom/google/android/gms/measurement/internal/N2;

    move-result-object v6

    if-nez v4, :cond_d

    const-string v7, "null"

    goto :goto_4

    :cond_d
    move-object v7, v4

    :goto_4
    const-string v8, "Property filter result"

    invoke-virtual {v6, v8, v7}, Lcom/google/android/gms/measurement/internal/N2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v4, :cond_e

    return v1

    :cond_e
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p0, Lcom/google/android/gms/measurement/internal/d;->c:Ljava/lang/Boolean;

    if-eqz v5, :cond_f

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    if-eqz p4, :cond_10

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/measurement/T1;->K()Z

    move-result p4

    if-eqz p4, :cond_11

    :cond_10
    iput-object v4, p0, Lcom/google/android/gms/measurement/internal/d;->d:Ljava/lang/Boolean;

    :cond_11
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_15

    if-eqz v3, :cond_15

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->Y()Z

    move-result p4

    if-eqz p4, :cond_15

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/C2;->Q()J

    move-result-wide p3

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    :cond_12
    if-eqz v0, :cond_13

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/T1;->K()Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/T1;->L()Z

    move-result p1

    if-nez p1, :cond_13

    if-eqz p2, :cond_13

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    :cond_13
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/c;->g:Lcom/google/android/gms/internal/measurement/T1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/T1;->L()Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/d;->f:Ljava/lang/Long;

    goto :goto_5

    :cond_14
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/d;->e:Ljava/lang/Long;

    :cond_15
    :goto_5
    return v2
.end method
