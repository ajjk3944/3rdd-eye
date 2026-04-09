.class public final enum Lof/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lof/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lof/a$a;

.field public static final enum ERROR:Lof/a$a;

.field public static final enum IN_PROGRESS:Lof/a$a;

.field public static final enum LOGGED_IN:Lof/a$a;

.field public static final enum NO_ACCOUNT:Lof/a$a;

.field public static final enum UNAUTHENTICATED:Lof/a$a;


# direct methods
.method private static final synthetic $values()[Lof/a$a;
    .locals 5

    sget-object v0, Lof/a$a;->IN_PROGRESS:Lof/a$a;

    sget-object v1, Lof/a$a;->NO_ACCOUNT:Lof/a$a;

    sget-object v2, Lof/a$a;->LOGGED_IN:Lof/a$a;

    sget-object v3, Lof/a$a;->UNAUTHENTICATED:Lof/a$a;

    sget-object v4, Lof/a$a;->ERROR:Lof/a$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lof/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lof/a$a;

    const-string v1, "IN_PROGRESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lof/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lof/a$a;->IN_PROGRESS:Lof/a$a;

    new-instance v0, Lof/a$a;

    const-string v1, "NO_ACCOUNT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lof/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lof/a$a;->NO_ACCOUNT:Lof/a$a;

    new-instance v0, Lof/a$a;

    const-string v1, "LOGGED_IN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lof/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lof/a$a;->LOGGED_IN:Lof/a$a;

    new-instance v0, Lof/a$a;

    const-string v1, "UNAUTHENTICATED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lof/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lof/a$a;->UNAUTHENTICATED:Lof/a$a;

    new-instance v0, Lof/a$a;

    const-string v1, "ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lof/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lof/a$a;->ERROR:Lof/a$a;

    invoke-static {}, Lof/a$a;->$values()[Lof/a$a;

    move-result-object v0

    sput-object v0, Lof/a$a;->$VALUES:[Lof/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lof/a$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lof/a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lof/a$a;
    .locals 1

    const-class v0, Lof/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lof/a$a;

    return-object p0
.end method

.method public static values()[Lof/a$a;
    .locals 1

    sget-object v0, Lof/a$a;->$VALUES:[Lof/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lof/a$a;

    return-object v0
.end method
