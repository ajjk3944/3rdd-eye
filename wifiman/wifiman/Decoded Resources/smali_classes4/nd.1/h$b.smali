.class final enum Lnd/h$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnd/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lnd/h$b;

.field public static final enum BEDROOM:Lnd/h$b;

.field public static final enum DINING_ROOM:Lnd/h$b;

.field public static final enum KITCHEN:Lnd/h$b;

.field public static final enum LIVING_ROOM:Lnd/h$b;

.field public static final enum OFFICE:Lnd/h$b;


# instance fields
.field private final nameResource:I


# direct methods
.method private static final synthetic $values()[Lnd/h$b;
    .locals 5

    sget-object v0, Lnd/h$b;->LIVING_ROOM:Lnd/h$b;

    sget-object v1, Lnd/h$b;->OFFICE:Lnd/h$b;

    sget-object v2, Lnd/h$b;->BEDROOM:Lnd/h$b;

    sget-object v3, Lnd/h$b;->DINING_ROOM:Lnd/h$b;

    sget-object v4, Lnd/h$b;->KITCHEN:Lnd/h$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lnd/h$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lnd/h$b;

    const/4 v1, 0x0

    sget v2, Ljc/d;->d:I

    const-string v3, "LIVING_ROOM"

    invoke-direct {v0, v3, v1, v2}, Lnd/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnd/h$b;->LIVING_ROOM:Lnd/h$b;

    new-instance v0, Lnd/h$b;

    const/4 v1, 0x1

    sget v2, Ljc/d;->e:I

    const-string v3, "OFFICE"

    invoke-direct {v0, v3, v1, v2}, Lnd/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnd/h$b;->OFFICE:Lnd/h$b;

    new-instance v0, Lnd/h$b;

    const/4 v1, 0x2

    sget v2, Ljc/d;->a:I

    const-string v3, "BEDROOM"

    invoke-direct {v0, v3, v1, v2}, Lnd/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnd/h$b;->BEDROOM:Lnd/h$b;

    new-instance v0, Lnd/h$b;

    const/4 v1, 0x3

    sget v2, Ljc/d;->b:I

    const-string v3, "DINING_ROOM"

    invoke-direct {v0, v3, v1, v2}, Lnd/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnd/h$b;->DINING_ROOM:Lnd/h$b;

    new-instance v0, Lnd/h$b;

    const/4 v1, 0x4

    sget v2, Ljc/d;->c:I

    const-string v3, "KITCHEN"

    invoke-direct {v0, v3, v1, v2}, Lnd/h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnd/h$b;->KITCHEN:Lnd/h$b;

    invoke-static {}, Lnd/h$b;->$values()[Lnd/h$b;

    move-result-object v0

    sput-object v0, Lnd/h$b;->$VALUES:[Lnd/h$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lnd/h$b;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lnd/h$b;->nameResource:I

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lnd/h$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnd/h$b;
    .locals 1

    const-class v0, Lnd/h$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnd/h$b;

    return-object p0
.end method

.method public static values()[Lnd/h$b;
    .locals 1

    sget-object v0, Lnd/h$b;->$VALUES:[Lnd/h$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnd/h$b;

    return-object v0
.end method


# virtual methods
.method public final getNameResource()I
    .locals 1

    iget v0, p0, Lnd/h$b;->nameResource:I

    return v0
.end method
