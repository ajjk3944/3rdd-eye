.class public final enum LBh/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LBh/b$a;

.field public static final enum DECLARATION:LBh/b$a;

.field public static final enum DELEGATION:LBh/b$a;

.field public static final enum FAKE_OVERRIDE:LBh/b$a;

.field public static final enum SYNTHESIZED:LBh/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LBh/b$a;

    const-string v1, "DECLARATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LBh/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBh/b$a;->DECLARATION:LBh/b$a;

    new-instance v1, LBh/b$a;

    const-string v2, "FAKE_OVERRIDE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LBh/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, LBh/b$a;->FAKE_OVERRIDE:LBh/b$a;

    new-instance v2, LBh/b$a;

    const-string v3, "DELEGATION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, LBh/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, LBh/b$a;->DELEGATION:LBh/b$a;

    new-instance v3, LBh/b$a;

    const-string v4, "SYNTHESIZED"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, LBh/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, LBh/b$a;->SYNTHESIZED:LBh/b$a;

    filled-new-array {v0, v1, v2, v3}, [LBh/b$a;

    move-result-object v0

    sput-object v0, LBh/b$a;->$VALUES:[LBh/b$a;

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

.method public static valueOf(Ljava/lang/String;)LBh/b$a;
    .locals 1

    const-class v0, LBh/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LBh/b$a;

    return-object p0
.end method

.method public static values()[LBh/b$a;
    .locals 1

    sget-object v0, LBh/b$a;->$VALUES:[LBh/b$a;

    invoke-virtual {v0}, [LBh/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBh/b$a;

    return-object v0
.end method


# virtual methods
.method public isReal()Z
    .locals 1

    sget-object v0, LBh/b$a;->FAKE_OVERRIDE:LBh/b$a;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
