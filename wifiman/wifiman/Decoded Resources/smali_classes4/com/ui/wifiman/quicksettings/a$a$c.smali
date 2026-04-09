.class public final Lcom/ui/wifiman/quicksettings/a$a$c;
.super Lcom/ui/wifiman/quicksettings/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/quicksettings/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/quicksettings/a$a$c;

.field private static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/quicksettings/a$a$c;

    invoke-direct {v0}, Lcom/ui/wifiman/quicksettings/a$a$c;-><init>()V

    sput-object v0, Lcom/ui/wifiman/quicksettings/a$a$c;->a:Lcom/ui/wifiman/quicksettings/a$a$c;

    sget v0, Lte/a;->a:I

    sput v0, Lcom/ui/wifiman/quicksettings/a$a$c;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/quicksettings/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    sget v0, Lcom/ui/wifiman/quicksettings/a$a$c;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/quicksettings/a$a$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x7ebdcb0f

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "InActive"

    return-object v0
.end method
