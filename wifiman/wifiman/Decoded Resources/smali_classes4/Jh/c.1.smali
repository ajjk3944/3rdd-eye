.class public final enum LJh/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LJh/c;

.field public static final enum FIELD:LJh/c;

.field public static final enum METHOD_RETURN_TYPE:LJh/c;

.field public static final enum TYPE_PARAMETER:LJh/c;

.field public static final enum TYPE_PARAMETER_BOUNDS:LJh/c;

.field public static final enum TYPE_USE:LJh/c;

.field public static final enum VALUE_PARAMETER:LJh/c;


# instance fields
.field private final javaTarget:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LJh/c;
    .locals 6

    sget-object v0, LJh/c;->METHOD_RETURN_TYPE:LJh/c;

    sget-object v1, LJh/c;->VALUE_PARAMETER:LJh/c;

    sget-object v2, LJh/c;->FIELD:LJh/c;

    sget-object v3, LJh/c;->TYPE_USE:LJh/c;

    sget-object v4, LJh/c;->TYPE_PARAMETER_BOUNDS:LJh/c;

    sget-object v5, LJh/c;->TYPE_PARAMETER:LJh/c;

    filled-new-array/range {v0 .. v5}, [LJh/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LJh/c;

    const/4 v1, 0x0

    const-string v2, "METHOD"

    const-string v3, "METHOD_RETURN_TYPE"

    invoke-direct {v0, v3, v1, v2}, LJh/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/c;->METHOD_RETURN_TYPE:LJh/c;

    new-instance v0, LJh/c;

    const/4 v1, 0x1

    const-string v2, "PARAMETER"

    const-string v3, "VALUE_PARAMETER"

    invoke-direct {v0, v3, v1, v2}, LJh/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/c;->VALUE_PARAMETER:LJh/c;

    new-instance v0, LJh/c;

    const-string v1, "FIELD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, LJh/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/c;->FIELD:LJh/c;

    new-instance v0, LJh/c;

    const/4 v1, 0x3

    const-string v2, "TYPE_USE"

    invoke-direct {v0, v2, v1, v2}, LJh/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/c;->TYPE_USE:LJh/c;

    new-instance v0, LJh/c;

    const-string v1, "TYPE_PARAMETER_BOUNDS"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, LJh/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/c;->TYPE_PARAMETER_BOUNDS:LJh/c;

    new-instance v0, LJh/c;

    const-string v1, "TYPE_PARAMETER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, LJh/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LJh/c;->TYPE_PARAMETER:LJh/c;

    invoke-static {}, LJh/c;->$values()[LJh/c;

    move-result-object v0

    sput-object v0, LJh/c;->$VALUES:[LJh/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LJh/c;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, LJh/c;->javaTarget:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LJh/c;
    .locals 1

    const-class v0, LJh/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJh/c;

    return-object p0
.end method

.method public static values()[LJh/c;
    .locals 1

    sget-object v0, LJh/c;->$VALUES:[LJh/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJh/c;

    return-object v0
.end method


# virtual methods
.method public final getJavaTarget()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJh/c;->javaTarget:Ljava/lang/String;

    return-object v0
.end method
