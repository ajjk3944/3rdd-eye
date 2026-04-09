.class public final enum LLf/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LLf/a;

.field public static final enum VERSION:LLf/a;


# instance fields
.field private final path:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LLf/a;
    .locals 1

    sget-object v0, LLf/a;->VERSION:LLf/a;

    filled-new-array {v0}, [LLf/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LLf/a;

    const/4 v1, 0x0

    const-string v2, "/api/version"

    const-string v3, "VERSION"

    invoke-direct {v0, v3, v1, v2}, LLf/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLf/a;->VERSION:LLf/a;

    invoke-static {}, LLf/a;->$values()[LLf/a;

    move-result-object v0

    sput-object v0, LLf/a;->$VALUES:[LLf/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LLf/a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LLf/a;->path:Ljava/lang/String;

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

    sget-object v0, LLf/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LLf/a;
    .locals 1

    const-class v0, LLf/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLf/a;

    return-object p0
.end method

.method public static values()[LLf/a;
    .locals 1

    sget-object v0, LLf/a;->$VALUES:[LLf/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLf/a;

    return-object v0
.end method


# virtual methods
.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLf/a;->path:Ljava/lang/String;

    return-object v0
.end method
