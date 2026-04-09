.class public abstract LE8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/k$a;,
        LE8/k$b;,
        LE8/k$c;
    }
.end annotation


# static fields
.field public static final h:LE8/k$b;

.field public static final i:I


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;

.field private final c:Lgg/i;

.field private final d:Z

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LE8/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE8/k$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE8/k;->h:LE8/k$b;

    const/16 v0, 0x8

    sput v0, LE8/k;->i:I

    return-void
.end method

.method public constructor <init>(Lgg/i;)V
    .locals 6

    const-string/jumbo v0, "speedtestStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v1, "refCount(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/k;->a:Lgg/i;

    new-instance v2, LE8/k$e;

    invoke-direct {v2, p0}, LE8/k$e;-><init>(LE8/k;)V

    invoke-static {v2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v2

    const-string/jumbo v3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LE8/k$d;

    invoke-direct {v3, p0}, LE8/k$d;-><init>(LE8/k;)V

    invoke-virtual {v2, v3}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v2

    invoke-virtual {v2}, Ljg/a;->i2()Lgg/i;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, LE8/k;->b:Lgg/i;

    new-instance v2, Ll9/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v2}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v2

    const-string/jumbo v4, "just(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, LE8/k;->c:Lgg/i;

    new-instance v2, LE8/k$f;

    invoke-direct {v2, p0}, LE8/k$f;-><init>(LE8/k;)V

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v2, Lnf/c;->e:Lnf/c$a;

    invoke-virtual {v2}, Lnf/c$a;->a()Lnf/c;

    move-result-object v2

    sget-object v5, LE8/k$g;->a:LE8/k$g;

    invoke-virtual {p1, v2, v5}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/k;->e:Lgg/i;

    new-instance p1, Ll9/a;

    invoke-direct {p1, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/k;->f:Lgg/i;

    new-instance p1, Ll9/a;

    invoke-direct {p1, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/k;->g:Lgg/i;

    return-void
.end method

.method public static final synthetic a(LE8/k;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lnf/g;
    .locals 0

    invoke-direct {p0, p1}, LE8/k;->b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lnf/g;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lnf/g;
    .locals 1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object p1

    sget-object v0, LE8/k$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lnf/g;->UP:Lnf/g;

    goto :goto_0

    :pswitch_1
    sget-object p1, Lnf/g;->DOWN:Lnf/g;

    goto :goto_0

    :pswitch_2
    sget-object p1, Lnf/g;->LATENCY:Lnf/g;

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/k;->b:Lgg/i;

    return-object v0
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/k;->g:Lgg/i;

    return-object v0
.end method

.method protected e(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Long;
    .locals 4

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object v0

    sget-object v1, LE8/k$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v1

    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v1, p1

    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :cond_2
    :goto_0
    :pswitch_3
    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method protected f(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ls9/d;
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object p1

    sget-object v0, LE8/k$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Ls9/d$b;

    const v0, 0x7f1103bf

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :pswitch_1
    new-instance p1, Ls9/d$b;

    const v0, 0x7f1103bd

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public abstract g()Lgg/i;
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, LE8/k;->d:Z

    return v0
.end method

.method public i()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/k;->e:Lgg/i;

    return-object v0
.end method

.method public final j()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/k;->a:Lgg/i;

    return-object v0
.end method

.method public abstract k()Lgg/i;
.end method
