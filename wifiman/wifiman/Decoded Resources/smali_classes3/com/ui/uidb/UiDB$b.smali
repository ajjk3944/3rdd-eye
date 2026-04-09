.class public final enum Lcom/ui/uidb/UiDB$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/uidb/UiDB;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/uidb/UiDB$b;

.field public static final enum PRODUCTION:Lcom/ui/uidb/UiDB$b;

.field public static final enum STAGE:Lcom/ui/uidb/UiDB$b;


# instance fields
.field private final host:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/ui/uidb/UiDB$b;
    .locals 2

    sget-object v0, Lcom/ui/uidb/UiDB$b;->PRODUCTION:Lcom/ui/uidb/UiDB$b;

    sget-object v1, Lcom/ui/uidb/UiDB$b;->STAGE:Lcom/ui/uidb/UiDB$b;

    filled-new-array {v0, v1}, [Lcom/ui/uidb/UiDB$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/uidb/UiDB$b;

    const/4 v1, 0x0

    const-string/jumbo v2, "static.ui.com"

    const-string/jumbo v3, "PRODUCTION"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/uidb/UiDB$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/uidb/UiDB$b;->PRODUCTION:Lcom/ui/uidb/UiDB$b;

    new-instance v0, Lcom/ui/uidb/UiDB$b;

    const/4 v1, 0x1

    const-string/jumbo v2, "static.dev.ui.com"

    const-string/jumbo v3, "STAGE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/uidb/UiDB$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ui/uidb/UiDB$b;->STAGE:Lcom/ui/uidb/UiDB$b;

    invoke-static {}, Lcom/ui/uidb/UiDB$b;->$values()[Lcom/ui/uidb/UiDB$b;

    move-result-object v0

    sput-object v0, Lcom/ui/uidb/UiDB$b;->$VALUES:[Lcom/ui/uidb/UiDB$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/uidb/UiDB$b;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, Lcom/ui/uidb/UiDB$b;->host:Ljava/lang/String;

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

    sget-object v0, Lcom/ui/uidb/UiDB$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/uidb/UiDB$b;
    .locals 1

    const-class v0, Lcom/ui/uidb/UiDB$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/uidb/UiDB$b;

    return-object p0
.end method

.method public static values()[Lcom/ui/uidb/UiDB$b;
    .locals 1

    sget-object v0, Lcom/ui/uidb/UiDB$b;->$VALUES:[Lcom/ui/uidb/UiDB$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/uidb/UiDB$b;

    return-object v0
.end method


# virtual methods
.method public final getHost()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/UiDB$b;->host:Ljava/lang/String;

    return-object v0
.end method
