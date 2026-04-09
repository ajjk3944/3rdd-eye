.class public final enum LLj/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LLj/b$b;

.field public static final enum BOTTOM_LEFT:LLj/b$b;

.field public static final enum BOTTOM_RIGHT:LLj/b$b;

.field public static final enum LEFT_BOTTOM:LLj/b$b;

.field public static final enum LEFT_TOP:LLj/b$b;

.field public static final enum RIGHT_BOTTOM:LLj/b$b;

.field public static final enum RIGHT_TOP:LLj/b$b;

.field public static final enum TOP_LEFT:LLj/b$b;

.field public static final enum TOP_RIGHT:LLj/b$b;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, LLj/b$b;

    const-string v1, "TOP_LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LLj/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LLj/b$b;->TOP_LEFT:LLj/b$b;

    new-instance v1, LLj/b$b;

    const-string v2, "TOP_RIGHT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, LLj/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, LLj/b$b;->TOP_RIGHT:LLj/b$b;

    new-instance v2, LLj/b$b;

    const-string v3, "BOTTOM_RIGHT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, LLj/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v2, LLj/b$b;->BOTTOM_RIGHT:LLj/b$b;

    new-instance v3, LLj/b$b;

    const-string v4, "BOTTOM_LEFT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, LLj/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, LLj/b$b;->BOTTOM_LEFT:LLj/b$b;

    new-instance v4, LLj/b$b;

    const-string v5, "LEFT_TOP"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, LLj/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v4, LLj/b$b;->LEFT_TOP:LLj/b$b;

    new-instance v5, LLj/b$b;

    const-string v6, "RIGHT_TOP"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, LLj/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, LLj/b$b;->RIGHT_TOP:LLj/b$b;

    new-instance v6, LLj/b$b;

    const-string v7, "RIGHT_BOTTOM"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, LLj/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v6, LLj/b$b;->RIGHT_BOTTOM:LLj/b$b;

    new-instance v7, LLj/b$b;

    const-string v8, "LEFT_BOTTOM"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, LLj/b$b;-><init>(Ljava/lang/String;II)V

    sput-object v7, LLj/b$b;->LEFT_BOTTOM:LLj/b$b;

    filled-new-array/range {v0 .. v7}, [LLj/b$b;

    move-result-object v0

    sput-object v0, LLj/b$b;->$VALUES:[LLj/b$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LLj/b$b;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LLj/b$b;
    .locals 1

    const-class v0, LLj/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLj/b$b;

    return-object p0
.end method

.method public static values()[LLj/b$b;
    .locals 1

    sget-object v0, LLj/b$b;->$VALUES:[LLj/b$b;

    invoke-virtual {v0}, [LLj/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLj/b$b;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, LLj/b$b;->value:I

    return v0
.end method
