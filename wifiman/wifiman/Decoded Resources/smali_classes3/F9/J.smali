.class public final LF9/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF9/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF9/J;

    invoke-direct {v0}, LF9/J;-><init>()V

    sput-object v0, LF9/J;->a:LF9/J;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Lz/N;
    .locals 3

    const v0, -0x6fda0aa4

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.settings.UiSettingsDefaults.<get-ContentPadding> (UiSettingsDefaults.kt:14)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/16 p2, 0x10

    int-to-float p2, p2

    invoke-static {p2}, LY0/h;->j(F)F

    move-result v0

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v2, p2, v1}, Landroidx/compose/foundation/layout/o;->d(FFFF)Lz/N;

    move-result-object p2

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p2
.end method
