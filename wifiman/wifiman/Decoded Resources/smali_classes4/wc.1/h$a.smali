.class public final enum Lwc/h$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwc/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lwc/h$a;

.field public static final enum IDLE:Lwc/h$a;

.field public static final enum PAUSED:Lwc/h$a;

.field public static final enum SCANNING:Lwc/h$a;

.field public static final enum UNAVAILABLE:Lwc/h$a;


# direct methods
.method private static final synthetic $values()[Lwc/h$a;
    .locals 4

    sget-object v0, Lwc/h$a;->IDLE:Lwc/h$a;

    sget-object v1, Lwc/h$a;->SCANNING:Lwc/h$a;

    sget-object v2, Lwc/h$a;->PAUSED:Lwc/h$a;

    sget-object v3, Lwc/h$a;->UNAVAILABLE:Lwc/h$a;

    filled-new-array {v0, v1, v2, v3}, [Lwc/h$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwc/h$a;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwc/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/h$a;->IDLE:Lwc/h$a;

    new-instance v0, Lwc/h$a;

    const-string v1, "SCANNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lwc/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/h$a;->SCANNING:Lwc/h$a;

    new-instance v0, Lwc/h$a;

    const-string v1, "PAUSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lwc/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/h$a;->PAUSED:Lwc/h$a;

    new-instance v0, Lwc/h$a;

    const-string v1, "UNAVAILABLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lwc/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwc/h$a;->UNAVAILABLE:Lwc/h$a;

    invoke-static {}, Lwc/h$a;->$values()[Lwc/h$a;

    move-result-object v0

    sput-object v0, Lwc/h$a;->$VALUES:[Lwc/h$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lwc/h$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lwc/h$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwc/h$a;
    .locals 1

    const-class v0, Lwc/h$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwc/h$a;

    return-object p0
.end method

.method public static values()[Lwc/h$a;
    .locals 1

    sget-object v0, Lwc/h$a;->$VALUES:[Lwc/h$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwc/h$a;

    return-object v0
.end method
