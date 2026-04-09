.class public final enum Lke/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lke/b;

.field public static final enum EHT:Lke/b;

.field public static final enum HE:Lke/b;

.field public static final enum HT:Lke/b;

.field public static final enum VHT:Lke/b;


# direct methods
.method private static final synthetic $values()[Lke/b;
    .locals 4

    sget-object v0, Lke/b;->EHT:Lke/b;

    sget-object v1, Lke/b;->HE:Lke/b;

    sget-object v2, Lke/b;->VHT:Lke/b;

    sget-object v3, Lke/b;->HT:Lke/b;

    filled-new-array {v0, v1, v2, v3}, [Lke/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lke/b;

    const-string v1, "EHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lke/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/b;->EHT:Lke/b;

    new-instance v0, Lke/b;

    const-string v1, "HE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lke/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/b;->HE:Lke/b;

    new-instance v0, Lke/b;

    const-string v1, "VHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lke/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/b;->VHT:Lke/b;

    new-instance v0, Lke/b;

    const-string v1, "HT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lke/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/b;->HT:Lke/b;

    invoke-static {}, Lke/b;->$values()[Lke/b;

    move-result-object v0

    sput-object v0, Lke/b;->$VALUES:[Lke/b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lke/b;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lke/b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lke/b;
    .locals 1

    const-class v0, Lke/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lke/b;

    return-object p0
.end method

.method public static values()[Lke/b;
    .locals 1

    sget-object v0, Lke/b;->$VALUES:[Lke/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lke/b;

    return-object v0
.end method
