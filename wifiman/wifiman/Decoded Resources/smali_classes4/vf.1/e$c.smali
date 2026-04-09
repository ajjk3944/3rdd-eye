.class final enum Lvf/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lvf/e$c;

.field public static final enum HTTP:Lvf/e$c;

.field public static final enum HTTPS:Lvf/e$c;

.field public static final enum HTTPS_ALT:Lvf/e$c;

.field public static final enum HTTP_ALT:Lvf/e$c;


# instance fields
.field private final port:I

.field private final scheme:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lvf/e$c;
    .locals 4

    sget-object v0, Lvf/e$c;->HTTPS:Lvf/e$c;

    sget-object v1, Lvf/e$c;->HTTPS_ALT:Lvf/e$c;

    sget-object v2, Lvf/e$c;->HTTP:Lvf/e$c;

    sget-object v3, Lvf/e$c;->HTTP_ALT:Lvf/e$c;

    filled-new-array {v0, v1, v2, v3}, [Lvf/e$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lvf/e$c;

    const-string v1, "HTTPS"

    const/4 v2, 0x0

    const/16 v3, 0x1bb

    const-string v4, "https"

    invoke-direct {v0, v1, v2, v3, v4}, Lvf/e$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lvf/e$c;->HTTPS:Lvf/e$c;

    new-instance v0, Lvf/e$c;

    const/4 v1, 0x1

    const/16 v2, 0x20fb

    const-string v3, "HTTPS_ALT"

    invoke-direct {v0, v3, v1, v2, v4}, Lvf/e$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lvf/e$c;->HTTPS_ALT:Lvf/e$c;

    new-instance v0, Lvf/e$c;

    const-string v1, "HTTP"

    const/4 v2, 0x2

    const/16 v3, 0x50

    const-string v4, "http"

    invoke-direct {v0, v1, v2, v3, v4}, Lvf/e$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lvf/e$c;->HTTP:Lvf/e$c;

    new-instance v0, Lvf/e$c;

    const/4 v1, 0x3

    const/16 v2, 0x1f90

    const-string v3, "HTTP_ALT"

    invoke-direct {v0, v3, v1, v2, v4}, Lvf/e$c;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lvf/e$c;->HTTP_ALT:Lvf/e$c;

    invoke-static {}, Lvf/e$c;->$values()[Lvf/e$c;

    move-result-object v0

    sput-object v0, Lvf/e$c;->$VALUES:[Lvf/e$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lvf/e$c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lvf/e$c;->port:I

    iput-object p4, p0, Lvf/e$c;->scheme:Ljava/lang/String;

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

    sget-object v0, Lvf/e$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvf/e$c;
    .locals 1

    const-class v0, Lvf/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvf/e$c;

    return-object p0
.end method

.method public static values()[Lvf/e$c;
    .locals 1

    sget-object v0, Lvf/e$c;->$VALUES:[Lvf/e$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvf/e$c;

    return-object v0
.end method


# virtual methods
.method public final getPort()I
    .locals 1

    iget v0, p0, Lvf/e$c;->port:I

    return v0
.end method

.method public final getScheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvf/e$c;->scheme:Ljava/lang/String;

    return-object v0
.end method
