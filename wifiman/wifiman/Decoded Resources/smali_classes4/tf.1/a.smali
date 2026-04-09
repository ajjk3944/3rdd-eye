.class public final Ltf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ltf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltf/a;

    invoke-direct {v0}, Ltf/a;-><init>()V

    sput-object v0, Ltf/a;->a:Ltf/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)F
    .locals 3

    const v0, -0x75933818

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.theme.ViewStateAlpha.<get-disabled> (ViewStateAlpha.kt:10)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    const p1, 0x3ef5c28f    # 0.48f

    return p1
.end method

.method public final b(LT/l;I)F
    .locals 3

    const v0, -0x7846e930

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.theme.ViewStateAlpha.<get-enabled> (ViewStateAlpha.kt:7)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    const/high16 p1, 0x3f800000    # 1.0f

    return p1
.end method
