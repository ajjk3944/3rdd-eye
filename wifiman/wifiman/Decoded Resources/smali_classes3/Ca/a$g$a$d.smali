.class public final LCa/a$g$a$d;
.super LCa/a$g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCa/a$g$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:LCa/a$g$a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCa/a$g$a$d;

    invoke-direct {v0}, LCa/a$g$a$d;-><init>()V

    sput-object v0, LCa/a$g$a$d;->a:LCa/a$g$a$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCa/a$g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Radiation Exposure Statement:\n\n- The device has been evaluated to meet general RF exposure requirement. The device can be used in portable exposure condition without restriction.\n\n- This transmitter must not be co-located or operating in conjunction with any other antenna or transmitter."

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCa/a$g$a$d;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x7530d285

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "SAR"

    return-object v0
.end method
