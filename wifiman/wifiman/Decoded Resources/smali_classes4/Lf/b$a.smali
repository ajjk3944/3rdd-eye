.class public final enum LLf/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLf/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LLf/b$a;

.field public static final enum GET:LLf/b$a;

.field public static final enum POST:LLf/b$a;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LLf/b$a;
    .locals 2

    sget-object v0, LLf/b$a;->GET:LLf/b$a;

    sget-object v1, LLf/b$a;->POST:LLf/b$a;

    filled-new-array {v0, v1}, [LLf/b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LLf/b$a;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, LLf/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLf/b$a;->GET:LLf/b$a;

    new-instance v0, LLf/b$a;

    const-string v1, "POST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LLf/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LLf/b$a;->POST:LLf/b$a;

    invoke-static {}, LLf/b$a;->$values()[LLf/b$a;

    move-result-object v0

    sput-object v0, LLf/b$a;->$VALUES:[LLf/b$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LLf/b$a;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, LLf/b$a;->id:Ljava/lang/String;

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

    sget-object v0, LLf/b$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LLf/b$a;
    .locals 1

    const-class v0, LLf/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLf/b$a;

    return-object p0
.end method

.method public static values()[LLf/b$a;
    .locals 1

    sget-object v0, LLf/b$a;->$VALUES:[LLf/b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLf/b$a;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLf/b$a;->id:Ljava/lang/String;

    return-object v0
.end method
