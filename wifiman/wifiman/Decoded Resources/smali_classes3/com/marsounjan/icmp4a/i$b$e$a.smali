.class public final enum Lcom/marsounjan/icmp4a/i$b$e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/i$b$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/marsounjan/icmp4a/i$b$e$a;

.field public static final enum FRAGMENT_REASSEMBLY_TIME_EXCEEDED:Lcom/marsounjan/icmp4a/i$b$e$a;

.field public static final enum HOP_LIMIT_EXCEEDED_IN_TRANSIT:Lcom/marsounjan/icmp4a/i$b$e$a;


# instance fields
.field private final id:B

.field private final message:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/marsounjan/icmp4a/i$b$e$a;
    .locals 2

    sget-object v0, Lcom/marsounjan/icmp4a/i$b$e$a;->HOP_LIMIT_EXCEEDED_IN_TRANSIT:Lcom/marsounjan/icmp4a/i$b$e$a;

    sget-object v1, Lcom/marsounjan/icmp4a/i$b$e$a;->FRAGMENT_REASSEMBLY_TIME_EXCEEDED:Lcom/marsounjan/icmp4a/i$b$e$a;

    filled-new-array {v0, v1}, [Lcom/marsounjan/icmp4a/i$b$e$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$e$a;

    const/4 v1, 0x0

    const-string/jumbo v2, "Time exceeded: Hop limit"

    const-string/jumbo v3, "HOP_LIMIT_EXCEEDED_IN_TRANSIT"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$e$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$e$a;->HOP_LIMIT_EXCEEDED_IN_TRANSIT:Lcom/marsounjan/icmp4a/i$b$e$a;

    new-instance v0, Lcom/marsounjan/icmp4a/i$b$e$a;

    const/4 v1, 0x1

    const-string/jumbo v2, "Time exceeded: Defragmentation failure"

    const-string/jumbo v3, "FRAGMENT_REASSEMBLY_TIME_EXCEEDED"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/marsounjan/icmp4a/i$b$e$a;-><init>(Ljava/lang/String;IBLjava/lang/String;)V

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$e$a;->FRAGMENT_REASSEMBLY_TIME_EXCEEDED:Lcom/marsounjan/icmp4a/i$b$e$a;

    invoke-static {}, Lcom/marsounjan/icmp4a/i$b$e$a;->$values()[Lcom/marsounjan/icmp4a/i$b$e$a;

    move-result-object v0

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$e$a;->$VALUES:[Lcom/marsounjan/icmp4a/i$b$e$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/marsounjan/icmp4a/i$b$e$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IBLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/marsounjan/icmp4a/i$b$e$a;->id:B

    iput-object p4, p0, Lcom/marsounjan/icmp4a/i$b$e$a;->message:Ljava/lang/String;

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

    sget-object v0, Lcom/marsounjan/icmp4a/i$b$e$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/marsounjan/icmp4a/i$b$e$a;
    .locals 1

    const-class v0, Lcom/marsounjan/icmp4a/i$b$e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/marsounjan/icmp4a/i$b$e$a;

    return-object p0
.end method

.method public static values()[Lcom/marsounjan/icmp4a/i$b$e$a;
    .locals 1

    sget-object v0, Lcom/marsounjan/icmp4a/i$b$e$a;->$VALUES:[Lcom/marsounjan/icmp4a/i$b$e$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/marsounjan/icmp4a/i$b$e$a;

    return-object v0
.end method


# virtual methods
.method public final getId-w2LRezQ()B
    .locals 1

    iget-byte v0, p0, Lcom/marsounjan/icmp4a/i$b$e$a;->id:B

    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/i$b$e$a;->message:Ljava/lang/String;

    return-object v0
.end method
