.class public final enum Ldf/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Ldf/b;

.field public static final enum EMAIL:Ldf/b;

.field public static final enum PHONE_CALL:Ldf/b;

.field public static final enum WEBSITE:Ldf/b;


# direct methods
.method private static final synthetic $values()[Ldf/b;
    .locals 3

    sget-object v0, Ldf/b;->PHONE_CALL:Ldf/b;

    sget-object v1, Ldf/b;->EMAIL:Ldf/b;

    sget-object v2, Ldf/b;->WEBSITE:Ldf/b;

    filled-new-array {v0, v1, v2}, [Ldf/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldf/b;

    const-string v1, "PHONE_CALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldf/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldf/b;->PHONE_CALL:Ldf/b;

    new-instance v0, Ldf/b;

    const-string v1, "EMAIL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldf/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldf/b;->EMAIL:Ldf/b;

    new-instance v0, Ldf/b;

    const-string v1, "WEBSITE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ldf/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldf/b;->WEBSITE:Ldf/b;

    invoke-static {}, Ldf/b;->$values()[Ldf/b;

    move-result-object v0

    sput-object v0, Ldf/b;->$VALUES:[Ldf/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Ldf/b;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Ldf/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldf/b;
    .locals 1

    const-class v0, Ldf/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldf/b;

    return-object p0
.end method

.method public static values()[Ldf/b;
    .locals 1

    sget-object v0, Ldf/b;->$VALUES:[Ldf/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldf/b;

    return-object v0
.end method
