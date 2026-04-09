.class public final LAf/v$a;
.super LAf/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAf/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LAf/v$a;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAf/v$a;

    invoke-direct {v0}, LAf/v$a;-><init>()V

    sput-object v0, LAf/v$a;->a:LAf/v$a;

    sget v0, Lm8/a;->d0:I

    sput v0, LAf/v$a;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LAf/v;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public b(LT/l;I)J
    .locals 3

    const v0, 0x54d19968

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.WifiGenerationIconBadge.BE.color (WifiGenerationBadge.kt:33)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p2}, Lm0/v0$a;->e()J

    move-result-wide v0

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public e()I
    .locals 1

    sget v0, LAf/v$a;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LAf/v$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x350c9466    # -7976397.0f

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "BE"

    return-object v0
.end method
