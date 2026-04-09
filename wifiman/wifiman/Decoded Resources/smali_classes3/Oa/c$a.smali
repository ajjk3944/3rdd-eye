.class public final enum LOa/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LOa/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LOa/c$a;

.field public static final enum ACCOUNT_NOT_EXIST:LOa/c$a;


# instance fields
.field private final id:I


# direct methods
.method private static final synthetic $values()[LOa/c$a;
    .locals 1

    sget-object v0, LOa/c$a;->ACCOUNT_NOT_EXIST:LOa/c$a;

    filled-new-array {v0}, [LOa/c$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LOa/c$a;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const-string v3, "ACCOUNT_NOT_EXIST"

    invoke-direct {v0, v3, v1, v2}, LOa/c$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LOa/c$a;->ACCOUNT_NOT_EXIST:LOa/c$a;

    invoke-static {}, LOa/c$a;->$values()[LOa/c$a;

    move-result-object v0

    sput-object v0, LOa/c$a;->$VALUES:[LOa/c$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LOa/c$a;->$ENTRIES:Lfh/a;

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

    iput p3, p0, LOa/c$a;->id:I

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

    sget-object v0, LOa/c$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LOa/c$a;
    .locals 1

    const-class v0, LOa/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LOa/c$a;

    return-object p0
.end method

.method public static values()[LOa/c$a;
    .locals 1

    sget-object v0, LOa/c$a;->$VALUES:[LOa/c$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LOa/c$a;

    return-object v0
.end method


# virtual methods
.method public final getId()I
    .locals 1

    iget v0, p0, LOa/c$a;->id:I

    return v0
.end method
