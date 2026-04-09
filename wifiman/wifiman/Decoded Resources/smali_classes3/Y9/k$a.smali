.class public final enum LY9/k$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LY9/k$a;

.field public static final enum AUTH:LY9/k$a;

.field public static final enum DENIED:LY9/k$a;


# direct methods
.method private static final synthetic $values()[LY9/k$a;
    .locals 2

    sget-object v0, LY9/k$a;->AUTH:LY9/k$a;

    sget-object v1, LY9/k$a;->DENIED:LY9/k$a;

    filled-new-array {v0, v1}, [LY9/k$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY9/k$a;

    const-string v1, "AUTH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY9/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY9/k$a;->AUTH:LY9/k$a;

    new-instance v0, LY9/k$a;

    const-string v1, "DENIED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LY9/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LY9/k$a;->DENIED:LY9/k$a;

    invoke-static {}, LY9/k$a;->$values()[LY9/k$a;

    move-result-object v0

    sput-object v0, LY9/k$a;->$VALUES:[LY9/k$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LY9/k$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LY9/k$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LY9/k$a;
    .locals 1

    const-class v0, LY9/k$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LY9/k$a;

    return-object p0
.end method

.method public static values()[LY9/k$a;
    .locals 1

    sget-object v0, LY9/k$a;->$VALUES:[LY9/k$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LY9/k$a;

    return-object v0
.end method
