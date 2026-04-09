.class public final enum Lzf/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lzf/a;

.field public static final enum AP:Lzf/a;

.field public static final enum INTERFERE:Lzf/a;


# direct methods
.method private static final synthetic $values()[Lzf/a;
    .locals 2

    sget-object v0, Lzf/a;->AP:Lzf/a;

    sget-object v1, Lzf/a;->INTERFERE:Lzf/a;

    filled-new-array {v0, v1}, [Lzf/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzf/a;

    const-string v1, "AP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzf/a;->AP:Lzf/a;

    new-instance v0, Lzf/a;

    const-string v1, "INTERFERE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lzf/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzf/a;->INTERFERE:Lzf/a;

    invoke-static {}, Lzf/a;->$values()[Lzf/a;

    move-result-object v0

    sput-object v0, Lzf/a;->$VALUES:[Lzf/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lzf/a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lzf/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzf/a;
    .locals 1

    const-class v0, Lzf/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzf/a;

    return-object p0
.end method

.method public static values()[Lzf/a;
    .locals 1

    sget-object v0, Lzf/a;->$VALUES:[Lzf/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzf/a;

    return-object v0
.end method
