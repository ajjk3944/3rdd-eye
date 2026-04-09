.class public final enum Lli/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lli/d;

.field public static final enum FUNCTION:Lli/d;

.field public static final enum PROPERTY:Lli/d;

.field public static final enum PROPERTY_GETTER:Lli/d;

.field public static final enum PROPERTY_SETTER:Lli/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lli/d;

    const-string v1, "FUNCTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lli/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lli/d;->FUNCTION:Lli/d;

    new-instance v1, Lli/d;

    const-string v2, "PROPERTY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lli/d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lli/d;->PROPERTY:Lli/d;

    new-instance v2, Lli/d;

    const-string v3, "PROPERTY_GETTER"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lli/d;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lli/d;->PROPERTY_GETTER:Lli/d;

    new-instance v3, Lli/d;

    const-string v4, "PROPERTY_SETTER"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lli/d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lli/d;->PROPERTY_SETTER:Lli/d;

    filled-new-array {v0, v1, v2, v3}, [Lli/d;

    move-result-object v0

    sput-object v0, Lli/d;->$VALUES:[Lli/d;

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

.method public static valueOf(Ljava/lang/String;)Lli/d;
    .locals 1

    const-class v0, Lli/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lli/d;

    return-object p0
.end method

.method public static values()[Lli/d;
    .locals 1

    sget-object v0, Lli/d;->$VALUES:[Lli/d;

    invoke-virtual {v0}, [Lli/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lli/d;

    return-object v0
.end method
