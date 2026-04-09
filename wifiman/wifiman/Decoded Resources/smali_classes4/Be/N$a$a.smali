.class public final enum LBe/N$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBe/N$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LBe/N$a$a;

.field public static final enum DEFAULT:LBe/N$a$a;

.field public static final enum DESTRUCTIVE:LBe/N$a$a;


# direct methods
.method private static final synthetic $values()[LBe/N$a$a;
    .locals 2

    sget-object v0, LBe/N$a$a;->DEFAULT:LBe/N$a$a;

    sget-object v1, LBe/N$a$a;->DESTRUCTIVE:LBe/N$a$a;

    filled-new-array {v0, v1}, [LBe/N$a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LBe/N$a$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LBe/N$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBe/N$a$a;->DEFAULT:LBe/N$a$a;

    new-instance v0, LBe/N$a$a;

    const-string v1, "DESTRUCTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LBe/N$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LBe/N$a$a;->DESTRUCTIVE:LBe/N$a$a;

    invoke-static {}, LBe/N$a$a;->$values()[LBe/N$a$a;

    move-result-object v0

    sput-object v0, LBe/N$a$a;->$VALUES:[LBe/N$a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LBe/N$a$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LBe/N$a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LBe/N$a$a;
    .locals 1

    const-class v0, LBe/N$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LBe/N$a$a;

    return-object p0
.end method

.method public static values()[LBe/N$a$a;
    .locals 1

    sget-object v0, LBe/N$a$a;->$VALUES:[LBe/N$a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LBe/N$a$a;

    return-object v0
.end method
