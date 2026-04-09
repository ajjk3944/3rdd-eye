.class public final enum Lth/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lth/t;

.field public static final enum INTERNAL:Lth/t;

.field public static final enum PRIVATE:Lth/t;

.field public static final enum PROTECTED:Lth/t;

.field public static final enum PUBLIC:Lth/t;


# direct methods
.method private static final synthetic $values()[Lth/t;
    .locals 4

    sget-object v0, Lth/t;->PUBLIC:Lth/t;

    sget-object v1, Lth/t;->PROTECTED:Lth/t;

    sget-object v2, Lth/t;->INTERNAL:Lth/t;

    sget-object v3, Lth/t;->PRIVATE:Lth/t;

    filled-new-array {v0, v1, v2, v3}, [Lth/t;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lth/t;

    const-string v1, "PUBLIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lth/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/t;->PUBLIC:Lth/t;

    new-instance v0, Lth/t;

    const-string v1, "PROTECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lth/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/t;->PROTECTED:Lth/t;

    new-instance v0, Lth/t;

    const-string v1, "INTERNAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lth/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/t;->INTERNAL:Lth/t;

    new-instance v0, Lth/t;

    const-string v1, "PRIVATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lth/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/t;->PRIVATE:Lth/t;

    invoke-static {}, Lth/t;->$values()[Lth/t;

    move-result-object v0

    sput-object v0, Lth/t;->$VALUES:[Lth/t;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lth/t;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lth/t;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lth/t;
    .locals 1

    const-class v0, Lth/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lth/t;

    return-object p0
.end method

.method public static values()[Lth/t;
    .locals 1

    sget-object v0, Lth/t;->$VALUES:[Lth/t;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lth/t;

    return-object v0
.end method
