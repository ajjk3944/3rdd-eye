.class public final LJf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJf/a;

    invoke-direct {v0}, LJf/a;-><init>()V

    sput-object v0, LJf/a;->a:LJf/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FLT/l;I)J
    .locals 3

    const v0, 0x63a430f2

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wmw.common.WmwBatteryStatus.levelColor (WmwBatteryStatus.kt:49)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p3, 0x3e99999a    # 0.3f

    cmpl-float p3, p1, p3

    if-ltz p3, :cond_1

    const p1, 0xf72b0df

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Lla/a;->a:Lla/a;

    sget p3, Lla/a;->b:I

    invoke-virtual {p1, p2, p3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const p3, 0x3e19999a    # 0.15f

    cmpl-float p1, p1, p3

    if-ltz p1, :cond_2

    const p1, 0xf72b7df

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Lla/a;->a:Lla/a;

    sget p3, Lla/a;->b:I

    invoke-virtual {p1, p2, p3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->h()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_0

    :cond_2
    const p1, 0xf72bd3f

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Lla/a;->a:Lla/a;

    sget p3, Lla/a;->b:I

    invoke-virtual {p1, p2, p3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a;->a()Lma/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a$a;->l()Lr9/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p2}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-wide v0
.end method
