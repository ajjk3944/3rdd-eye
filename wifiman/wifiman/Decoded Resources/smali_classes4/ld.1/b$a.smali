.class public final enum Lld/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lld/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lld/b$a;

.field public static final enum DB:Lld/b$a;

.field public static final enum FINISHED:Lld/b$a;

.field public static final enum INIT:Lld/b$a;

.field public static final enum LOGGING_START:Lld/b$a;


# direct methods
.method private static final synthetic $values()[Lld/b$a;
    .locals 4

    sget-object v0, Lld/b$a;->INIT:Lld/b$a;

    sget-object v1, Lld/b$a;->DB:Lld/b$a;

    sget-object v2, Lld/b$a;->LOGGING_START:Lld/b$a;

    sget-object v3, Lld/b$a;->FINISHED:Lld/b$a;

    filled-new-array {v0, v1, v2, v3}, [Lld/b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lld/b$a;

    const-string v1, "INIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lld/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lld/b$a;->INIT:Lld/b$a;

    new-instance v0, Lld/b$a;

    const-string v1, "DB"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lld/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lld/b$a;->DB:Lld/b$a;

    new-instance v0, Lld/b$a;

    const-string v1, "LOGGING_START"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lld/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lld/b$a;->LOGGING_START:Lld/b$a;

    new-instance v0, Lld/b$a;

    const-string v1, "FINISHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lld/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lld/b$a;->FINISHED:Lld/b$a;

    invoke-static {}, Lld/b$a;->$values()[Lld/b$a;

    move-result-object v0

    sput-object v0, Lld/b$a;->$VALUES:[Lld/b$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lld/b$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lld/b$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lld/b$a;
    .locals 1

    const-class v0, Lld/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lld/b$a;

    return-object p0
.end method

.method public static values()[Lld/b$a;
    .locals 1

    sget-object v0, Lld/b$a;->$VALUES:[Lld/b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lld/b$a;

    return-object v0
.end method
