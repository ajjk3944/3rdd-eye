.class public final enum Lfe/u$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfe/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfe/u$a$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lfe/u$a;

.field public static final Companion:Lfe/u$a$a;

.field public static final enum DISCOVERY_HOSTNAME:Lfe/u$a;

.field public static final enum DISCOVERY_NETBIOS:Lfe/u$a;

.field public static final enum DISCOVERY_UBNT_SPEEDTEST:Lfe/u$a;

.field public static final enum HEAVY_PARALLEL:Lfe/u$a;


# instance fields
.field private final maxPoolSize:I

.field private final threadKeepAliveTimeMillis:J


# direct methods
.method private static final synthetic $values()[Lfe/u$a;
    .locals 4

    sget-object v0, Lfe/u$a;->HEAVY_PARALLEL:Lfe/u$a;

    sget-object v1, Lfe/u$a;->DISCOVERY_HOSTNAME:Lfe/u$a;

    sget-object v2, Lfe/u$a;->DISCOVERY_UBNT_SPEEDTEST:Lfe/u$a;

    sget-object v3, Lfe/u$a;->DISCOVERY_NETBIOS:Lfe/u$a;

    filled-new-array {v0, v1, v2, v3}, [Lfe/u$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lfe/u$a;

    const/16 v3, 0x32

    const-wide/16 v4, 0x7d0

    const-string v1, "HEAVY_PARALLEL"

    const/4 v2, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lfe/u$a;-><init>(Ljava/lang/String;IIJ)V

    sput-object v6, Lfe/u$a;->HEAVY_PARALLEL:Lfe/u$a;

    new-instance v0, Lfe/u$a;

    const/4 v10, 0x5

    const-wide/16 v11, 0x1388

    const-string v8, "DISCOVERY_HOSTNAME"

    const/4 v9, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lfe/u$a;-><init>(Ljava/lang/String;IIJ)V

    sput-object v0, Lfe/u$a;->DISCOVERY_HOSTNAME:Lfe/u$a;

    new-instance v0, Lfe/u$a;

    const/16 v4, 0xa

    const-wide/16 v5, 0x1388

    const-string v2, "DISCOVERY_UBNT_SPEEDTEST"

    const/4 v3, 0x2

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lfe/u$a;-><init>(Ljava/lang/String;IIJ)V

    sput-object v0, Lfe/u$a;->DISCOVERY_UBNT_SPEEDTEST:Lfe/u$a;

    new-instance v0, Lfe/u$a;

    const/16 v10, 0xa

    const-string v8, "DISCOVERY_NETBIOS"

    const/4 v9, 0x3

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lfe/u$a;-><init>(Ljava/lang/String;IIJ)V

    sput-object v0, Lfe/u$a;->DISCOVERY_NETBIOS:Lfe/u$a;

    invoke-static {}, Lfe/u$a;->$values()[Lfe/u$a;

    move-result-object v0

    sput-object v0, Lfe/u$a;->$VALUES:[Lfe/u$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lfe/u$a;->$ENTRIES:Lfh/a;

    new-instance v0, Lfe/u$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfe/u$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfe/u$a;->Companion:Lfe/u$a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lfe/u$a;->maxPoolSize:I

    iput-wide p4, p0, Lfe/u$a;->threadKeepAliveTimeMillis:J

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

    sget-object v0, Lfe/u$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfe/u$a;
    .locals 1

    const-class v0, Lfe/u$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfe/u$a;

    return-object p0
.end method

.method public static values()[Lfe/u$a;
    .locals 1

    sget-object v0, Lfe/u$a;->$VALUES:[Lfe/u$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfe/u$a;

    return-object v0
.end method


# virtual methods
.method public final getMaxPoolSize()I
    .locals 1

    iget v0, p0, Lfe/u$a;->maxPoolSize:I

    return v0
.end method

.method public final getThreadKeepAliveTimeMillis()J
    .locals 2

    iget-wide v0, p0, Lfe/u$a;->threadKeepAliveTimeMillis:J

    return-wide v0
.end method

.method public final newScheduler()Lgg/y;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Intantiating Scheduler "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object v0, Lfe/u$a;->Companion:Lfe/u$a$a;

    iget v1, p0, Lfe/u$a;->maxPoolSize:I

    iget-wide v2, p0, Lfe/u$a;->threadKeepAliveTimeMillis:J

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Pool-"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lfe/u$a$a;->b(Lfe/u$a$a;IJLjava/lang/String;)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-static {v0}, LGg/a;->b(Ljava/util/concurrent/Executor;)Lgg/y;

    move-result-object v0

    const-string v1, "from(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
