.class final LN/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/M;


# static fields
.field public static final a:LN/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/x;

    invoke-direct {v0}, LN/x;-><init>()V

    sput-object v0, LN/x;->a:LN/x;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JFLT/l;I)J
    .locals 3

    const v0, -0x648f4fbd

    invoke-interface {p4, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)"

    invoke-static {v0, p5, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LN/f0;->a:LN/f0;

    const/4 v1, 0x6

    invoke-virtual {v0, p4, v1}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v0

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {p3, v1}, LY0/h;->h(FF)I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LN/m;->o()Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x45adbccb

    invoke-interface {p4, v0}, LT/l;->U(I)V

    and-int/lit8 p5, p5, 0x7e

    invoke-static {p1, p2, p3, p4, p5}, LN/N;->a(JFLT/l;I)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lm0/x0;->g(JJ)J

    move-result-wide p1

    invoke-interface {p4}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const p3, 0x45afd9d7

    invoke-interface {p4, p3}, LT/l;->U(I)V

    invoke-interface {p4}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p4}, LT/l;->J()V

    return-wide p1
.end method
