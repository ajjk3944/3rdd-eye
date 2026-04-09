.class final enum Ly0/H$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ly0/H$a;

.field public static final enum Dispatching:Ly0/H$a;

.field public static final enum NotDispatching:Ly0/H$a;

.field public static final enum Unknown:Ly0/H$a;


# direct methods
.method private static final synthetic $values()[Ly0/H$a;
    .locals 3

    sget-object v0, Ly0/H$a;->Unknown:Ly0/H$a;

    sget-object v1, Ly0/H$a;->Dispatching:Ly0/H$a;

    sget-object v2, Ly0/H$a;->NotDispatching:Ly0/H$a;

    filled-new-array {v0, v1, v2}, [Ly0/H$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly0/H$a;

    const-string v1, "Unknown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly0/H$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly0/H$a;->Unknown:Ly0/H$a;

    new-instance v0, Ly0/H$a;

    const-string v1, "Dispatching"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ly0/H$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly0/H$a;->Dispatching:Ly0/H$a;

    new-instance v0, Ly0/H$a;

    const-string v1, "NotDispatching"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ly0/H$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly0/H$a;->NotDispatching:Ly0/H$a;

    invoke-static {}, Ly0/H$a;->$values()[Ly0/H$a;

    move-result-object v0

    sput-object v0, Ly0/H$a;->$VALUES:[Ly0/H$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly0/H$a;
    .locals 1

    const-class v0, Ly0/H$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly0/H$a;

    return-object p0
.end method

.method public static values()[Ly0/H$a;
    .locals 1

    sget-object v0, Ly0/H$a;->$VALUES:[Ly0/H$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly0/H$a;

    return-object v0
.end method
