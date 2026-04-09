.class public final enum Lri/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lri/s;

.field public static final enum IN:Lri/s;

.field public static final enum INV:Lri/s;

.field public static final enum OUT:Lri/s;


# instance fields
.field private final presentation:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lri/s;
    .locals 3

    sget-object v0, Lri/s;->IN:Lri/s;

    sget-object v1, Lri/s;->OUT:Lri/s;

    sget-object v2, Lri/s;->INV:Lri/s;

    filled-new-array {v0, v1, v2}, [Lri/s;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lri/s;

    const/4 v1, 0x0

    const-string v2, "in"

    const-string v3, "IN"

    invoke-direct {v0, v3, v1, v2}, Lri/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lri/s;->IN:Lri/s;

    new-instance v0, Lri/s;

    const/4 v1, 0x1

    const-string v2, "out"

    const-string v3, "OUT"

    invoke-direct {v0, v3, v1, v2}, Lri/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lri/s;->OUT:Lri/s;

    new-instance v0, Lri/s;

    const/4 v1, 0x2

    const-string v2, ""

    const-string v3, "INV"

    invoke-direct {v0, v3, v1, v2}, Lri/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lri/s;->INV:Lri/s;

    invoke-static {}, Lri/s;->$values()[Lri/s;

    move-result-object v0

    sput-object v0, Lri/s;->$VALUES:[Lri/s;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lri/s;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lri/s;->presentation:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lri/s;
    .locals 1

    const-class v0, Lri/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lri/s;

    return-object p0
.end method

.method public static values()[Lri/s;
    .locals 1

    sget-object v0, Lri/s;->$VALUES:[Lri/s;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lri/s;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lri/s;->presentation:Ljava/lang/String;

    return-object v0
.end method
