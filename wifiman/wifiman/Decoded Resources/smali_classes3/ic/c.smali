.class public final enum Lic/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lic/c;

.field public static final enum HEALTH:Lic/c;

.field public static final enum NUMBER:Lic/c;


# direct methods
.method private static final synthetic $values()[Lic/c;
    .locals 2

    sget-object v0, Lic/c;->NUMBER:Lic/c;

    sget-object v1, Lic/c;->HEALTH:Lic/c;

    filled-new-array {v0, v1}, [Lic/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lic/c;

    const-string/jumbo v1, "NUMBER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lic/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lic/c;->NUMBER:Lic/c;

    new-instance v0, Lic/c;

    const-string/jumbo v1, "HEALTH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lic/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lic/c;->HEALTH:Lic/c;

    invoke-static {}, Lic/c;->$values()[Lic/c;

    move-result-object v0

    sput-object v0, Lic/c;->$VALUES:[Lic/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lic/c;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lic/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lic/c;
    .locals 1

    const-class v0, Lic/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lic/c;

    return-object p0
.end method

.method public static values()[Lic/c;
    .locals 1

    sget-object v0, Lic/c;->$VALUES:[Lic/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lic/c;

    return-object v0
.end method
