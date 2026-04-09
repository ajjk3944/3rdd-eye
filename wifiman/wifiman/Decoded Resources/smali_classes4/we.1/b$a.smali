.class public final enum Lwe/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lwe/b$a;

.field public static final enum BASE64:Lwe/b$a;


# direct methods
.method private static final synthetic $values()[Lwe/b$a;
    .locals 1

    sget-object v0, Lwe/b$a;->BASE64:Lwe/b$a;

    filled-new-array {v0}, [Lwe/b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwe/b$a;

    const-string v1, "BASE64"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwe/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwe/b$a;->BASE64:Lwe/b$a;

    invoke-static {}, Lwe/b$a;->$values()[Lwe/b$a;

    move-result-object v0

    sput-object v0, Lwe/b$a;->$VALUES:[Lwe/b$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lwe/b$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lwe/b$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwe/b$a;
    .locals 1

    const-class v0, Lwe/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwe/b$a;

    return-object p0
.end method

.method public static values()[Lwe/b$a;
    .locals 1

    sget-object v0, Lwe/b$a;->$VALUES:[Lwe/b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwe/b$a;

    return-object v0
.end method
