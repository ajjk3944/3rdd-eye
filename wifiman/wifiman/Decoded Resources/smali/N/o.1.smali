.class public final LN/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/r;


# static fields
.field public static final b:LN/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/o;

    invoke-direct {v0}, LN/o;-><init>()V

    sput-object v0, LN/o;->b:LN/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LT/l;I)LP/g;
    .locals 4

    const v0, 0x6b8d3ed

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.CompatRippleTheme.rippleAlpha (Ripple.kt:286)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LN/z0;->a:LN/z0;

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v0

    sget-object v2, LN/f0;->a:LN/f0;

    const/4 v3, 0x6

    invoke-virtual {v2, p1, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->o()Z

    move-result v2

    invoke-virtual {p2, v0, v1, v2}, LN/z0;->a(JZ)LP/g;

    move-result-object p2

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p2
.end method

.method public b(LT/l;I)J
    .locals 4

    const v0, -0x5f5ca318

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.CompatRippleTheme.defaultColor (Ripple.kt:279)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LN/z0;->a:LN/z0;

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/v0;

    invoke-virtual {v0}, Lm0/v0;->u()J

    move-result-wide v0

    sget-object v2, LN/f0;->a:LN/f0;

    const/4 v3, 0x6

    invoke-virtual {v2, p1, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->o()Z

    move-result v2

    invoke-virtual {p2, v0, v1, v2}, LN/z0;->b(JZ)J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method
