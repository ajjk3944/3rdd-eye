.class public final Lla/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lla/a;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lla/a;

    invoke-direct {v0}, Lla/a;-><init>()V

    sput-object v0, Lla/a;->a:Lla/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Lma/a;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.theme.UiTheme.<get-colors> (UiTheme.kt:61)"

    const v2, 0x7d0f2384

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lla/g;->l()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lma/a;

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method

.method public final b(LT/l;I)Loa/a;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.theme.UiTheme.<get-shapes> (UiTheme.kt:76)"

    const v2, -0x2f9a24a6

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lla/g;->m()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Loa/a;

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method

.method public final c(LT/l;I)Lpa/c;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.theme.UiTheme.<get-typography> (UiTheme.kt:66)"

    const v2, -0x77e349a3

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lla/g;->n()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpa/c;

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method

.method public final d(LT/l;I)Lra/a;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.theme.UiTheme.<get-window> (UiTheme.kt:71)"

    const v2, -0x65ca7c24

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lla/g;->o()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lra/a;

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p1
.end method
