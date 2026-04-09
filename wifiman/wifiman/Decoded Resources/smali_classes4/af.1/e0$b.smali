.class public final enum Laf/e0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Laf/e0$b;

.field public static final enum LOADING:Laf/e0$b;

.field public static final enum NO_RESULT:Laf/e0$b;

.field public static final enum RESULT:Laf/e0$b;


# direct methods
.method private static final synthetic $values()[Laf/e0$b;
    .locals 3

    sget-object v0, Laf/e0$b;->LOADING:Laf/e0$b;

    sget-object v1, Laf/e0$b;->NO_RESULT:Laf/e0$b;

    sget-object v2, Laf/e0$b;->RESULT:Laf/e0$b;

    filled-new-array {v0, v1, v2}, [Laf/e0$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Laf/e0$b;

    const-string v1, "LOADING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laf/e0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/e0$b;->LOADING:Laf/e0$b;

    new-instance v0, Laf/e0$b;

    const-string v1, "NO_RESULT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Laf/e0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/e0$b;->NO_RESULT:Laf/e0$b;

    new-instance v0, Laf/e0$b;

    const-string v1, "RESULT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Laf/e0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laf/e0$b;->RESULT:Laf/e0$b;

    invoke-static {}, Laf/e0$b;->$values()[Laf/e0$b;

    move-result-object v0

    sput-object v0, Laf/e0$b;->$VALUES:[Laf/e0$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Laf/e0$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, Laf/e0$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Laf/e0$b;
    .locals 1

    const-class v0, Laf/e0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laf/e0$b;

    return-object p0
.end method

.method public static values()[Laf/e0$b;
    .locals 1

    sget-object v0, Laf/e0$b;->$VALUES:[Laf/e0$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laf/e0$b;

    return-object v0
.end method
