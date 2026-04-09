.class public final Lhf/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf/t$a;,
        Lhf/t$b;,
        Lhf/t$c;
    }
.end annotation


# static fields
.field public static final a:Lhf/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhf/t;

    invoke-direct {v0}, Lhf/t;-><init>()V

    sput-object v0, Lhf/t;->a:Lhf/t;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Lhf/t$c;
    .locals 9

    const v0, 0x56a7a5ce

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology.measurementInternetStatsModel (SpeedtestTopology.kt:112)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance p2, Lhf/t$c;

    sget-object v4, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    sget-object v0, Lb8/b;->a:Lb8/b$b;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget-object v0, LW7/a;->b:LW7/a$a;

    invoke-virtual {v0, v1}, LW7/a$a;->d(I)LW7/a;

    move-result-object v7

    invoke-virtual {v0, v1}, LW7/a$a;->d(I)LW7/a;

    move-result-object v8

    move-object v3, p2

    invoke-direct/range {v3 .. v8}, Lhf/t$c;-><init>(Lhf/t$c$a;Lb8/b;Ljava/lang/Integer;LW7/a;LW7/a;)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p2
.end method

.method public final b(LT/l;I)Lhf/t$a;
    .locals 13

    const v0, 0x5c9bc4d6

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology.measurementModel (SpeedtestTopology.kt:97)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lhf/t$a$a;

    new-instance v4, Lhf/t$b;

    sget-object v1, LPe/a;->a:LPe/a;

    invoke-virtual {v1}, LPe/a;->k()Ls9/b;

    move-result-object v2

    invoke-direct {v4, v2}, Lhf/t$b;-><init>(Ls9/a;)V

    and-int/lit8 p2, p2, 0xe

    invoke-virtual {p0, p1, p2}, Lhf/t;->a(LT/l;I)Lhf/t$c;

    move-result-object v5

    new-instance v6, Lhf/t$b;

    invoke-virtual {v1}, LPe/a;->k()Ls9/b;

    move-result-object p2

    invoke-direct {v6, p2}, Lhf/t$b;-><init>(Ls9/a;)V

    new-instance p2, Lhf/t$c;

    sget-object v8, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    sget-object v2, Lb8/b;->a:Lb8/b$b;

    const/16 v3, 0x3e8

    invoke-virtual {v2, v3}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    sget-object v2, LW7/a;->b:LW7/a$a;

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v11

    invoke-virtual {v2, v3}, LW7/a$a;->d(I)LW7/a;

    move-result-object v12

    move-object v7, p2

    invoke-direct/range {v7 .. v12}, Lhf/t$c;-><init>(Lhf/t$c$a;Lb8/b;Ljava/lang/Integer;LW7/a;LW7/a;)V

    new-instance v8, Lhf/t$b;

    invoke-virtual {v1}, LPe/a;->k()Ls9/b;

    move-result-object v1

    invoke-direct {v8, v1}, Lhf/t$b;-><init>(Ls9/a;)V

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lhf/t$a$a;-><init>(Lhf/t$b;Lhf/t$c;Lhf/t$b;Lhf/t$c;Lhf/t$b;)V

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object v0
.end method
