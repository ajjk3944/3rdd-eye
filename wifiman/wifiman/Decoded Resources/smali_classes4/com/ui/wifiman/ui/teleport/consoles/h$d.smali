.class public final Lcom/ui/wifiman/ui/teleport/consoles/h$d;
.super Lcom/ui/wifiman/ui/teleport/consoles/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/teleport/consoles/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/teleport/consoles/h$d;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/h$d;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/teleport/consoles/h$d;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/teleport/consoles/h$d;->a:Lcom/ui/wifiman/ui/teleport/consoles/h$d;

    const-string v0, "account_unauthorized"

    sput-object v0, Lcom/ui/wifiman/ui/teleport/consoles/h$d;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/ui/teleport/consoles/h;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/teleport/consoles/h$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$d;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x18c048a8

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Unauthorized"

    return-object v0
.end method
