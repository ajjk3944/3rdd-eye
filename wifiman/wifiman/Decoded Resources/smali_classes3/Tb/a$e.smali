.class public final enum LTb/a$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LTb/a$e;

.field public static final enum ALL:LTb/a$e;

.field public static final enum GHZ_2:LTb/a$e;

.field public static final enum GHZ_5:LTb/a$e;

.field public static final enum GHZ_6:LTb/a$e;


# direct methods
.method private static final synthetic $values()[LTb/a$e;
    .locals 4

    sget-object v0, LTb/a$e;->ALL:LTb/a$e;

    sget-object v1, LTb/a$e;->GHZ_2:LTb/a$e;

    sget-object v2, LTb/a$e;->GHZ_5:LTb/a$e;

    sget-object v3, LTb/a$e;->GHZ_6:LTb/a$e;

    filled-new-array {v0, v1, v2, v3}, [LTb/a$e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LTb/a$e;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LTb/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTb/a$e;->ALL:LTb/a$e;

    new-instance v0, LTb/a$e;

    const-string/jumbo v1, "GHZ_2"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LTb/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTb/a$e;->GHZ_2:LTb/a$e;

    new-instance v0, LTb/a$e;

    const-string/jumbo v1, "GHZ_5"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LTb/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTb/a$e;->GHZ_5:LTb/a$e;

    new-instance v0, LTb/a$e;

    const-string/jumbo v1, "GHZ_6"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LTb/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTb/a$e;->GHZ_6:LTb/a$e;

    invoke-static {}, LTb/a$e;->$values()[LTb/a$e;

    move-result-object v0

    sput-object v0, LTb/a$e;->$VALUES:[LTb/a$e;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LTb/a$e;->$ENTRIES:Lfh/a;

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

    sget-object v0, LTb/a$e;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LTb/a$e;
    .locals 1

    const-class v0, LTb/a$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTb/a$e;

    return-object p0
.end method

.method public static values()[LTb/a$e;
    .locals 1

    sget-object v0, LTb/a$e;->$VALUES:[LTb/a$e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTb/a$e;

    return-object v0
.end method
