.class public final enum Ljd/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Ljd/a$c;

.field public static final enum AP:Ljd/a$c;

.field public static final enum GATEWAY:Ljd/a$c;

.field public static final enum GENERIC:Ljd/a$c;

.field public static final enum MYSELF:Ljd/a$c;


# direct methods
.method private static final synthetic $values()[Ljd/a$c;
    .locals 4

    sget-object v0, Ljd/a$c;->GENERIC:Ljd/a$c;

    sget-object v1, Ljd/a$c;->GATEWAY:Ljd/a$c;

    sget-object v2, Ljd/a$c;->AP:Ljd/a$c;

    sget-object v3, Ljd/a$c;->MYSELF:Ljd/a$c;

    filled-new-array {v0, v1, v2, v3}, [Ljd/a$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljd/a$c;

    const-string v1, "GENERIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljd/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljd/a$c;->GENERIC:Ljd/a$c;

    new-instance v0, Ljd/a$c;

    const-string v1, "GATEWAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljd/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljd/a$c;->GATEWAY:Ljd/a$c;

    new-instance v0, Ljd/a$c;

    const-string v1, "AP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljd/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljd/a$c;->AP:Ljd/a$c;

    new-instance v0, Ljd/a$c;

    const-string v1, "MYSELF"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljd/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljd/a$c;->MYSELF:Ljd/a$c;

    invoke-static {}, Ljd/a$c;->$values()[Ljd/a$c;

    move-result-object v0

    sput-object v0, Ljd/a$c;->$VALUES:[Ljd/a$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Ljd/a$c;->$ENTRIES:Lfh/a;

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

    sget-object v0, Ljd/a$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljd/a$c;
    .locals 1

    const-class v0, Ljd/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljd/a$c;

    return-object p0
.end method

.method public static values()[Ljd/a$c;
    .locals 1

    sget-object v0, Ljd/a$c;->$VALUES:[Ljd/a$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljd/a$c;

    return-object v0
.end method
