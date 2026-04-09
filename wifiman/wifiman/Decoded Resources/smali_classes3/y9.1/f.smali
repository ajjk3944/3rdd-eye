.class public final enum Ly9/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Ly9/f;

.field public static final enum BOTTOM:Ly9/f;

.field public static final enum DEFAULT:Ly9/f;

.field public static final enum TOP:Ly9/f;


# direct methods
.method private static final synthetic $values()[Ly9/f;
    .locals 3

    sget-object v0, Ly9/f;->DEFAULT:Ly9/f;

    sget-object v1, Ly9/f;->BOTTOM:Ly9/f;

    sget-object v2, Ly9/f;->TOP:Ly9/f;

    filled-new-array {v0, v1, v2}, [Ly9/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly9/f;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly9/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly9/f;->DEFAULT:Ly9/f;

    new-instance v0, Ly9/f;

    const-string v1, "BOTTOM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ly9/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly9/f;->BOTTOM:Ly9/f;

    new-instance v0, Ly9/f;

    const-string/jumbo v1, "TOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ly9/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly9/f;->TOP:Ly9/f;

    invoke-static {}, Ly9/f;->$values()[Ly9/f;

    move-result-object v0

    sput-object v0, Ly9/f;->$VALUES:[Ly9/f;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Ly9/f;->$ENTRIES:Lfh/a;

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

    sget-object v0, Ly9/f;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ly9/f;
    .locals 1

    const-class v0, Ly9/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly9/f;

    return-object p0
.end method

.method public static values()[Ly9/f;
    .locals 1

    sget-object v0, Ly9/f;->$VALUES:[Ly9/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly9/f;

    return-object v0
.end method
