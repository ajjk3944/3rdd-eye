.class public final Lxe/I$x;
.super Lxe/I;
.source "SourceFile"

# interfaces
.implements LAe/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "x"
.end annotation


# static fields
.field public static final a:Lxe/I$x;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/List;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/I$x;

    invoke-direct {v0}, Lxe/I$x;-><init>()V

    sput-object v0, Lxe/I$x;->a:Lxe/I$x;

    const-string v0, "speedFactorExplanation"

    sput-object v0, Lxe/I$x;->b:Ljava/lang/String;

    new-instance v0, Lxe/W;

    invoke-direct {v0}, Lxe/W;-><init>()V

    const-string v1, "topic"

    invoke-static {v1, v0}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v0

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lxe/I$x;->c:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lxe/I$x;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxe/I;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic b(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$x;->c(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LAe/p$a$a;->a(LAe/p$a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Lef/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    instance-of p2, p1, Lef/b$b$b;

    if-eqz p2, :cond_0

    const-string p1, "wifi_overall"

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lef/b$b$d;

    if-eqz p2, :cond_1

    const-string p1, "wifi_spectrum"

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lef/b$b$c;

    if-eqz p2, :cond_2

    const-string p1, "wifi_radio_capability"

    goto :goto_0

    :cond_2
    instance-of p2, p1, Lef/b$b$a;

    if-eqz p2, :cond_3

    const-string p1, "wifi_channel_health"

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lef/b$a$a;

    if-eqz p1, :cond_4

    const-string p1, "cellular_signal"

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final e(Landroidx/lifecycle/E;)Lef/b;
    .locals 1

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topic"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "wifi_radio_capability"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lef/b$b$c;->b:Lef/b$b$c;

    goto :goto_0

    :sswitch_1
    const-string v0, "wifi_overall"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lef/b$b$b;->b:Lef/b$b$b;

    goto :goto_0

    :sswitch_2
    const-string v0, "wifi_spectrum"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lef/b$b$d;->b:Lef/b$b$d;

    goto :goto_0

    :sswitch_3
    const-string v0, "wifi_channel_health"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lef/b$b$a;->b:Lef/b$b$a;

    goto :goto_0

    :sswitch_4
    const-string v0, "cellular_signal"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lef/b$a$a;->b:Lef/b$a$a;

    :goto_0
    return-object p1

    :cond_0
    :goto_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid param"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x4e11f8e3 -> :sswitch_4
        -0x41847e -> :sswitch_3
        0x124cc1bb -> :sswitch_2
        0x16398d23 -> :sswitch_1
        0x52e4cbc6 -> :sswitch_0
    .end sparse-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lxe/I$x;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public f(Lef/b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LAe/p$a$a;->b(LAe/p$a;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lef/b;

    invoke-virtual {p0, p1}, Lxe/I$x;->f(Lef/b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x220dfedf

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1

    sget-object v0, Lxe/I$x;->c:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lef/b;

    invoke-virtual {p0, p1, p2}, Lxe/I$x;->d(Lef/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxe/I$x;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SpeedFactorExplanationDestination"

    return-object v0
.end method
