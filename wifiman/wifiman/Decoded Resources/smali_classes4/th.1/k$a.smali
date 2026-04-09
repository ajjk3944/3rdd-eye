.class public final enum Lth/k$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lth/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lth/k$a;

.field public static final enum EXTENSION_RECEIVER:Lth/k$a;

.field public static final enum INSTANCE:Lth/k$a;

.field public static final enum VALUE:Lth/k$a;


# direct methods
.method private static final synthetic $values()[Lth/k$a;
    .locals 3

    sget-object v0, Lth/k$a;->INSTANCE:Lth/k$a;

    sget-object v1, Lth/k$a;->EXTENSION_RECEIVER:Lth/k$a;

    sget-object v2, Lth/k$a;->VALUE:Lth/k$a;

    filled-new-array {v0, v1, v2}, [Lth/k$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lth/k$a;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lth/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/k$a;->INSTANCE:Lth/k$a;

    new-instance v0, Lth/k$a;

    const-string v1, "EXTENSION_RECEIVER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lth/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/k$a;->EXTENSION_RECEIVER:Lth/k$a;

    new-instance v0, Lth/k$a;

    const-string v1, "VALUE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lth/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lth/k$a;->VALUE:Lth/k$a;

    invoke-static {}, Lth/k$a;->$values()[Lth/k$a;

    move-result-object v0

    sput-object v0, Lth/k$a;->$VALUES:[Lth/k$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lth/k$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lth/k$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lth/k$a;
    .locals 1

    const-class v0, Lth/k$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lth/k$a;

    return-object p0
.end method

.method public static values()[Lth/k$a;
    .locals 1

    sget-object v0, Lth/k$a;->$VALUES:[Lth/k$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lth/k$a;

    return-object v0
.end method
