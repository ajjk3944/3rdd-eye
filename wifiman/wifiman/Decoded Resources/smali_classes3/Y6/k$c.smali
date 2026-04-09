.class public final enum LY6/k$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LY6/k$c;

.field public static final enum BEGIN_ARRAY:LY6/k$c;

.field public static final enum BEGIN_OBJECT:LY6/k$c;

.field public static final enum BOOLEAN:LY6/k$c;

.field public static final enum END_ARRAY:LY6/k$c;

.field public static final enum END_DOCUMENT:LY6/k$c;

.field public static final enum END_OBJECT:LY6/k$c;

.field public static final enum NAME:LY6/k$c;

.field public static final enum NULL:LY6/k$c;

.field public static final enum NUMBER:LY6/k$c;

.field public static final enum STRING:LY6/k$c;


# direct methods
.method private static synthetic $values()[LY6/k$c;
    .locals 10

    sget-object v0, LY6/k$c;->BEGIN_ARRAY:LY6/k$c;

    sget-object v1, LY6/k$c;->END_ARRAY:LY6/k$c;

    sget-object v2, LY6/k$c;->BEGIN_OBJECT:LY6/k$c;

    sget-object v3, LY6/k$c;->END_OBJECT:LY6/k$c;

    sget-object v4, LY6/k$c;->NAME:LY6/k$c;

    sget-object v5, LY6/k$c;->STRING:LY6/k$c;

    sget-object v6, LY6/k$c;->NUMBER:LY6/k$c;

    sget-object v7, LY6/k$c;->BOOLEAN:LY6/k$c;

    sget-object v8, LY6/k$c;->NULL:LY6/k$c;

    sget-object v9, LY6/k$c;->END_DOCUMENT:LY6/k$c;

    filled-new-array/range {v0 .. v9}, [LY6/k$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY6/k$c;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->BEGIN_ARRAY:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string/jumbo v1, "END_ARRAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->END_ARRAY:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string v1, "BEGIN_OBJECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->BEGIN_OBJECT:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string/jumbo v1, "END_OBJECT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->END_OBJECT:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string/jumbo v1, "NAME"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->NAME:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string/jumbo v1, "STRING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->STRING:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string/jumbo v1, "NUMBER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->NUMBER:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->BOOLEAN:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string/jumbo v1, "NULL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->NULL:LY6/k$c;

    new-instance v0, LY6/k$c;

    const-string/jumbo v1, "END_DOCUMENT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, LY6/k$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY6/k$c;->END_DOCUMENT:LY6/k$c;

    invoke-static {}, LY6/k$c;->$values()[LY6/k$c;

    move-result-object v0

    sput-object v0, LY6/k$c;->$VALUES:[LY6/k$c;

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

.method public static valueOf(Ljava/lang/String;)LY6/k$c;
    .locals 1

    const-class v0, LY6/k$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LY6/k$c;

    return-object p0
.end method

.method public static values()[LY6/k$c;
    .locals 1

    sget-object v0, LY6/k$c;->$VALUES:[LY6/k$c;

    invoke-virtual {v0}, [LY6/k$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LY6/k$c;

    return-object v0
.end method
