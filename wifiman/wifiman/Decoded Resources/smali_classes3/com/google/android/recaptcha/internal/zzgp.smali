.class public final Lcom/google/android/recaptcha/internal/zzgp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzgx;


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzgp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzgp;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzgp;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzgp;->zza:Lcom/google/android/recaptcha/internal/zzgp;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final varargs zza(ILcom/google/android/recaptcha/internal/zzgd;[Lcom/google/android/recaptcha/internal/zzue;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/recaptcha/internal/zzce;
        }
    .end annotation

    move-object/from16 v0, p3

    array-length v1, v0

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_b

    invoke-virtual/range {p2 .. p2}, Lcom/google/android/recaptcha/internal/zzgd;->zzc()Lcom/google/android/recaptcha/internal/zzge;

    move-result-object v1

    const/4 v5, 0x0

    aget-object v0, v0, v5

    invoke-virtual {v1, v0}, Lcom/google/android/recaptcha/internal/zzge;->zza(Lcom/google/android/recaptcha/internal/zzue;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    move-result v1

    if-eq v4, v1, :cond_0

    move-object v0, v3

    :cond_0
    const/4 v1, 0x5

    if-eqz v0, :cond_a

    instance-of v4, v0, [I

    if-eqz v4, :cond_1

    move-object v5, v0

    check-cast v5, [I

    const/16 v12, 0x38

    const/4 v13, 0x0

    const-string v6, ","

    const-string/jumbo v7, "["

    const-string/jumbo v8, "]"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, LZg/n;->G0([ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_1
    instance-of v4, v0, [B

    if-eqz v4, :cond_2

    new-instance v1, Ljava/lang/String;

    check-cast v0, [B

    sget-object v2, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :goto_0
    move-object v0, v1

    goto/16 :goto_1

    :cond_2
    instance-of v4, v0, [J

    if-eqz v4, :cond_3

    move-object v5, v0

    check-cast v5, [J

    const/16 v12, 0x38

    const/4 v13, 0x0

    const-string v6, ","

    const-string/jumbo v7, "["

    const-string/jumbo v8, "]"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, LZg/n;->H0([JLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_3
    instance-of v4, v0, [S

    if-eqz v4, :cond_4

    move-object v5, v0

    check-cast v5, [S

    const/16 v12, 0x38

    const/4 v13, 0x0

    const-string v6, ","

    const-string/jumbo v7, "["

    const-string/jumbo v8, "]"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, LZg/n;->J0([SLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    instance-of v4, v0, [F

    if-eqz v4, :cond_5

    move-object v5, v0

    check-cast v5, [F

    const/16 v12, 0x38

    const/4 v13, 0x0

    const-string v6, ","

    const-string/jumbo v7, "["

    const-string/jumbo v8, "]"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, LZg/n;->F0([FLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    instance-of v4, v0, [D

    if-eqz v4, :cond_6

    move-object v5, v0

    check-cast v5, [D

    const/16 v12, 0x38

    const/4 v13, 0x0

    const-string v6, ","

    const-string/jumbo v7, "["

    const-string/jumbo v8, "]"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, LZg/n;->E0([DLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_6
    instance-of v4, v0, [C

    if-eqz v4, :cond_7

    new-instance v1, Ljava/lang/String;

    check-cast v0, [C

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    goto :goto_0

    :cond_7
    instance-of v4, v0, [Ljava/lang/Object;

    if-eqz v4, :cond_8

    move-object v5, v0

    check-cast v5, [Ljava/lang/Object;

    const/16 v12, 0x38

    const/4 v13, 0x0

    const-string v6, ","

    const-string/jumbo v7, "["

    const-string/jumbo v8, "]"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, LZg/n;->I0([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_8
    instance-of v4, v0, Ljava/util/Collection;

    if-eqz v4, :cond_9

    move-object v5, v0

    check-cast v5, Ljava/lang/Iterable;

    const/16 v12, 0x38

    const/4 v13, 0x0

    const-string v6, ","

    const-string/jumbo v7, "["

    const-string/jumbo v8, "]"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/recaptcha/internal/zzgd;->zzc()Lcom/google/android/recaptcha/internal/zzge;

    move-result-object v1

    move v2, p1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/recaptcha/internal/zzge;->zze(ILjava/lang/Object;)V

    return-void

    :cond_9
    new-instance v0, Lcom/google/android/recaptcha/internal/zzce;

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/recaptcha/internal/zzce;-><init>(IILjava/lang/Throwable;)V

    throw v0

    :cond_a
    new-instance v0, Lcom/google/android/recaptcha/internal/zzce;

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/recaptcha/internal/zzce;-><init>(IILjava/lang/Throwable;)V

    throw v0

    :cond_b
    new-instance v0, Lcom/google/android/recaptcha/internal/zzce;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/recaptcha/internal/zzce;-><init>(IILjava/lang/Throwable;)V

    throw v0
.end method
