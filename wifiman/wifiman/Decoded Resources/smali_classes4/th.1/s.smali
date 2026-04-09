.class public final enum Lth/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lth/s;

.field public static final enum IN:Lth/s;

.field public static final enum INVARIANT:Lth/s;

.field public static final enum OUT:Lth/s;


# direct methods
.method private static final synthetic $values()[Lth/s;
    .locals 3

    sget-object v0, Lth/s;->INVARIANT:Lth/s;

    sget-object v1, Lth/s;->IN:Lth/s;

    sget-object v2, Lth/s;->OUT:Lth/s;

    filled-new-array {v0, v1, v2}, [Lth/s;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lth/s;

    const-string v1, "INVARIANT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lth/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/s;->INVARIANT:Lth/s;

    new-instance v0, Lth/s;

    const-string v1, "IN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lth/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/s;->IN:Lth/s;

    new-instance v0, Lth/s;

    const-string v1, "OUT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lth/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/s;->OUT:Lth/s;

    invoke-static {}, Lth/s;->$values()[Lth/s;

    move-result-object v0

    sput-object v0, Lth/s;->$VALUES:[Lth/s;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lth/s;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lth/s;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lth/s;
    .locals 1

    const-class v0, Lth/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lth/s;

    return-object p0
.end method

.method public static values()[Lth/s;
    .locals 1

    sget-object v0, Lth/s;->$VALUES:[Lth/s;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lth/s;

    return-object v0
.end method
