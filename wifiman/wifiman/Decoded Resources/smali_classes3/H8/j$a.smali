.class final enum LH8/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LH8/j$a;

.field public static final enum PASTE_INVITATION:LH8/j$a;

.field public static final enum REMOVE_CONNECTION:LH8/j$a;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LH8/j$a;
    .locals 2

    sget-object v0, LH8/j$a;->PASTE_INVITATION:LH8/j$a;

    sget-object v1, LH8/j$a;->REMOVE_CONNECTION:LH8/j$a;

    filled-new-array {v0, v1}, [LH8/j$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LH8/j$a;

    const/4 v1, 0x0

    const-string/jumbo v2, "paste"

    const-string/jumbo v3, "PASTE_INVITATION"

    invoke-direct {v0, v3, v1, v2}, LH8/j$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/j$a;->PASTE_INVITATION:LH8/j$a;

    new-instance v0, LH8/j$a;

    const/4 v1, 0x1

    const-string/jumbo v2, "remove"

    const-string/jumbo v3, "REMOVE_CONNECTION"

    invoke-direct {v0, v3, v1, v2}, LH8/j$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LH8/j$a;->REMOVE_CONNECTION:LH8/j$a;

    invoke-static {}, LH8/j$a;->$values()[LH8/j$a;

    move-result-object v0

    sput-object v0, LH8/j$a;->$VALUES:[LH8/j$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LH8/j$a;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, LH8/j$a;->id:Ljava/lang/String;

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

    sget-object v0, LH8/j$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LH8/j$a;
    .locals 1

    const-class v0, LH8/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LH8/j$a;

    return-object p0
.end method

.method public static values()[LH8/j$a;
    .locals 1

    sget-object v0, LH8/j$a;->$VALUES:[LH8/j$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LH8/j$a;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH8/j$a;->id:Ljava/lang/String;

    return-object v0
.end method
