.class public final Lie/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lie/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lie/g$a;,
        Lie/g$b;,
        Lie/g$c;
    }
.end annotation


# static fields
.field public static final i:Lie/g$a;


# instance fields
.field private final a:Ldc/a;

.field private final b:Ljava/util/HashMap;

.field private final c:D

.field private final d:Ljava/util/HashMap;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lie/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lie/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lie/g;->i:Lie/g$a;

    return-void
.end method

.method public constructor <init>(Lle/g;Ldc/a;)V
    .locals 5

    const-string v0, "wifiScannerService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lie/g;->a:Ldc/a;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lie/g;->b:Ljava/util/HashMap;

    const-wide v0, -0x3fb9800000000000L    # -45.0

    invoke-direct {p0, v0, v1}, Lie/g;->g(D)D

    move-result-wide v0

    iput-wide v0, p0, Lie/g;->c:D

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lie/g;->d:Ljava/util/HashMap;

    invoke-interface {p1}, Lle/g;->c()Lgg/i;

    move-result-object p2

    sget-object v0, Lie/g$e;->a:Lie/g$e;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string v0, "map(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lie/g;->e:Lgg/i;

    sget-object v0, LAg/c;->a:LAg/c;

    invoke-interface {p1}, Lle/g;->a()Lgg/i;

    move-result-object p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x7d0

    const/4 v4, 0x1

    invoke-virtual {p1, v2, v3, v1, v4}, Lgg/i;->X1(JLjava/util/concurrent/TimeUnit;Z)Lgg/i;

    move-result-object p1

    const-string v1, "throttleLatest(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2, p1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance p2, Lie/g$g;

    invoke-direct {p2, p0}, Lie/g$g;-><init>(Lie/g;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2, v0, v4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lie/g;->f:Lgg/i;

    sget-object v0, Lie/g$f;->a:Lie/g$f;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lie/g;->g:Lgg/i;

    sget-object v0, Lie/g$d;->a:Lie/g$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lie/g;->h:Lgg/i;

    return-void
.end method

.method public static final synthetic c(Lie/g;LS8/e;Ljava/util/List;)Lie/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lie/g;->h(LS8/e;Ljava/util/List;)Lie/c;

    move-result-object p0

    return-object p0
.end method

.method private final d(IDD)D
    .locals 4

    int-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    div-double/2addr p2, p4

    add-double/2addr p2, v2

    invoke-static {p2, p3}, Loh/b;->c(D)D

    move-result-wide p1

    mul-double/2addr v0, p1

    return-wide v0
.end method

.method private final e(LS8/e;)D
    .locals 4

    invoke-direct {p0, p1}, Lie/g;->f(LS8/e;)D

    move-result-wide v0

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    add-double/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lie/g;->g(D)D

    move-result-wide v0

    return-wide v0
.end method

.method private final f(LS8/e;)D
    .locals 4

    invoke-virtual {p1}, LS8/e;->b()LS8/d;

    move-result-object p1

    invoke-virtual {p1}, LS8/d;->getWidth()I

    move-result p1

    int-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    const/16 p1, 0xa

    int-to-double v2, p1

    mul-double/2addr v0, v2

    const/16 p1, 0x72

    int-to-double v2, p1

    sub-double/2addr v0, v2

    return-wide v0
.end method

.method private final g(D)D
    .locals 2

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    div-double/2addr p1, v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    return-wide p1
.end method

.method private final h(LS8/e;Ljava/util/List;)Lie/c;
    .locals 13

    invoke-virtual {p1}, LS8/e;->b()LS8/d;

    move-result-object v0

    invoke-virtual {v0}, LS8/d;->getWidth()I

    move-result v2

    iget-wide v3, p0, Lie/g;->c:D

    invoke-direct {p0, p1, p2}, Lie/g;->k(LS8/e;Ljava/util/List;)D

    move-result-wide v5

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lie/g;->d(IDD)D

    move-result-wide v11

    invoke-direct {p0, p1}, Lie/g;->j(LS8/e;)D

    move-result-wide v9

    new-instance p2, Lie/c;

    move-object v7, p2

    move-object v8, p1

    invoke-direct/range {v7 .. v12}, Lie/c;-><init>(LS8/e;DD)V

    return-object p2
.end method

.method private final i(LS8/e;)D
    .locals 3

    iget-object v0, p0, Lie/g;->b:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1}, Lie/g;->e(LS8/e;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method private final j(LS8/e;)D
    .locals 8

    iget-object v0, p0, Lie/g;->d:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, LS8/e;->b()LS8/d;

    move-result-object v1

    invoke-virtual {v1}, LS8/d;->getWidth()I

    move-result v3

    iget-wide v4, p0, Lie/g;->c:D

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lie/g;->k(LS8/e;Ljava/util/List;)D

    move-result-wide v6

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lie/g;->d(IDD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method private final k(LS8/e;Ljava/util/List;)D
    .locals 13

    invoke-virtual {p1}, LS8/e;->d()I

    move-result v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LS8/e;->b()LS8/d;

    move-result-object v0

    sget-object v2, LS8/d;->MHZ_20:LS8/d;

    if-ne v0, v2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Channel 48 noise estimate calculation, rogues "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0, p1}, Lie/g;->i(LS8/e;)D

    move-result-wide v2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p2

    invoke-interface {p2}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/i;

    invoke-virtual {v0}, Lle/i;->q()LS8/l;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v4

    invoke-virtual {v4}, LS8/e;->b()LS8/d;

    move-result-object v4

    sget-object v5, LS8/d;->MHZ_80_80:LS8/d;

    if-ne v4, v5, :cond_4

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v4

    invoke-virtual {v4}, LS8/e;->e()LS8/e$b;

    move-result-object v4

    instance-of v4, v4, LS8/e$b$a;

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v4

    invoke-virtual {v4}, LS8/e;->e()LS8/e$b;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.ubnt.usurvey.wifi.WifiChannel.FrequencyRange.Combined"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, LS8/e$b$a;

    sget-object v5, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual {v4}, LS8/e$b$a;->d()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->c(I)Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v0}, Lle/i;->q()LS8/l;

    move-result-object v7

    invoke-virtual {v7}, LS8/l;->b()I

    move-result v7

    new-instance v8, LS8/e;

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v9

    invoke-virtual {v9}, LS8/e;->a()LS8/c;

    move-result-object v9

    invoke-virtual {v4}, LS8/e$b$a;->d()I

    move-result v10

    sget-object v11, LS8/d;->MHZ_80:LS8/d;

    new-instance v12, LS8/e$b$b;

    invoke-direct {v12, v11, v10}, LS8/e$b$b;-><init>(LS8/d;I)V

    invoke-direct {v8, v9, v6, v12, v11}, LS8/e;-><init>(LS8/c;ILS8/e$b;LS8/d;)V

    invoke-direct {p0, p1, v7, v8}, Lie/g;->l(LS8/e;ILS8/e;)D

    move-result-wide v6

    add-double/2addr v2, v6

    :cond_3
    invoke-virtual {v4}, LS8/e$b$a;->e()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->c(I)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v0}, Lle/i;->q()LS8/l;

    move-result-object v6

    invoke-virtual {v6}, LS8/l;->b()I

    move-result v6

    new-instance v7, LS8/e;

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->a()LS8/c;

    move-result-object v0

    invoke-virtual {v4}, LS8/e$b$a;->e()I

    move-result v4

    sget-object v8, LS8/d;->MHZ_80:LS8/d;

    new-instance v9, LS8/e$b$b;

    invoke-direct {v9, v8, v4}, LS8/e$b$b;-><init>(LS8/d;I)V

    invoke-direct {v7, v0, v5, v9, v8}, LS8/e;-><init>(LS8/c;ILS8/e$b;LS8/d;)V

    invoke-direct {p0, p1, v6, v7}, Lie/g;->l(LS8/e;ILS8/e;)D

    move-result-wide v4

    :goto_1
    add-double/2addr v2, v4

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Lle/i;->q()LS8/l;

    move-result-object v4

    invoke-virtual {v4}, LS8/l;->b()I

    move-result v4

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v5

    invoke-direct {p0, p1, v4, v5}, Lie/g;->l(LS8/e;ILS8/e;)D

    move-result-wide v4

    invoke-virtual {p1}, LS8/e;->d()I

    move-result v6

    if-ne v6, v1, :cond_5

    invoke-virtual {p1}, LS8/e;->b()LS8/d;

    move-result-object v6

    sget-object v7, LS8/d;->MHZ_20:LS8/d;

    if-ne v6, v7, :cond_5

    invoke-virtual {v0}, Lle/i;->f()LS8/e;

    move-result-object v0

    invoke-virtual {v0}, LS8/e;->d()I

    move-result v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "rogue "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " - noise: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_5
    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, LS8/e;->d()I

    move-result p2

    if-ne p2, v1, :cond_7

    invoke-virtual {p1}, LS8/e;->b()LS8/d;

    move-result-object p1

    sget-object p2, LS8/d;->MHZ_20:LS8/d;

    if-ne p1, p2, :cond_7

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "noise: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_7
    return-wide v2
.end method

.method private final l(LS8/e;ILS8/e;)D
    .locals 5

    invoke-virtual {p3, p1}, LS8/e;->f(LS8/e;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, -0x2d

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/16 v0, -0x55

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-double v0, p2

    sget-object p2, LS8/e;->f:LS8/e$a;

    invoke-virtual {p2, p1, p3}, LS8/e$a;->b(LS8/e;LS8/e;)Ljava/lang/Double;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lie/g;->a:Ldc/a;

    invoke-virtual {p1}, Ldc/a;->e()Z

    move-result p1

    const-string p2, ". Falling back to -37.0"

    const-string v2, "no isolation record found for "

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x6

    invoke-static {p1, v3, v3, p2, v3}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lie/g$c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lie/g$c;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x2

    invoke-static {p1, v3, p2, v3}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    const-wide p1, -0x3fbd800000000000L    # -37.0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    :goto_1
    add-double/2addr v0, p1

    const/16 p1, -0x14

    int-to-double p1, p1

    add-double/2addr v0, p1

    invoke-direct {p0, v0, v1}, Lie/g;->g(D)D

    move-result-wide p1

    goto :goto_2

    :cond_2
    const-wide/16 p1, 0x0

    :goto_2
    return-wide p1
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lie/g;->g:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lie/g;->h:Lgg/i;

    return-object v0
.end method
