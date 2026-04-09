.class public final LW5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW5/c;

.field private static final b:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LW5/c;

    invoke-direct {v0}, LW5/c;-><init>()V

    sput-object v0, LW5/c;->a:LW5/c;

    sget-object v0, LW5/c$a;->a:LW5/c$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LT/w;->d(LT/n1;Lmh/a;ILjava/lang/Object;)LT/H0;

    move-result-object v0

    sput-object v0, LW5/c;->b:LT/H0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)LW5/a;
    .locals 3

    const v0, 0x6b10014c

    invoke-interface {p1, v0}, LT/l;->e(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.patrykandpatrick.vico.compose.style.LocalChartStyle.<get-current> (ChartStyle.kt:256)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LW5/c;->b:LT/H0;

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW5/a;

    if-nez v0, :cond_1

    and-int/lit8 p2, p2, 0xe

    invoke-virtual {p0, p1, p2}, LW5/c;->b(LT/l;I)LW5/a;

    move-result-object v0

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p1}, LT/l;->P()V

    return-object v0
.end method

.method public final b(LT/l;I)LW5/a;
    .locals 3

    const v0, -0x6255f3b4    # -4.501134E-21f

    invoke-interface {p1, v0}, LT/l;->e(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.patrykandpatrick.vico.compose.style.LocalChartStyle.<get-default> (ChartStyle.kt:245)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LW5/a;->f:LW5/a$c;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls/m;->a(LT/l;I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LX5/a$a;->a:LX5/a$a;

    goto :goto_0

    :cond_1
    sget-object v0, LX5/a$b;->a:LX5/a$b;

    :goto_0
    invoke-virtual {p2, v0}, LW5/a$c;->b(LX5/a;)LW5/a;

    move-result-object p2

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p1}, LT/l;->P()V

    return-object p2
.end method
