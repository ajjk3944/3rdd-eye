.class public LH6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LH6/a;

.field public static final c:LH6/a;

.field public static final d:LH6/a;

.field public static final e:LH6/a;

.field public static final f:LH6/a;

.field public static final g:LH6/a;

.field public static final h:LH6/a;

.field public static final i:LH6/a;

.field public static final j:LH6/a;

.field public static final k:LH6/a;

.field public static final l:LH6/a;

.field public static final m:LH6/a;

.field public static final n:LH6/a;

.field public static final o:LH6/a;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH6/a;

    const-string v1, "CONNECTION_STATE"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->b:LH6/a;

    new-instance v0, LH6/a;

    const-string/jumbo v1, "SERVICE_DISCOVERY"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->c:LH6/a;

    new-instance v0, LH6/a;

    const-string v1, "CHARACTERISTIC_READ"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->d:LH6/a;

    new-instance v0, LH6/a;

    const-string v1, "CHARACTERISTIC_WRITE"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->e:LH6/a;

    new-instance v0, LH6/a;

    const-string v1, "CHARACTERISTIC_LONG_WRITE"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->f:LH6/a;

    new-instance v0, LH6/a;

    const-string v1, "CHARACTERISTIC_CHANGED"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->g:LH6/a;

    new-instance v0, LH6/a;

    const-string v1, "DESCRIPTOR_READ"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->h:LH6/a;

    new-instance v0, LH6/a;

    const-string v1, "DESCRIPTOR_WRITE"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->i:LH6/a;

    new-instance v0, LH6/a;

    const-string/jumbo v1, "RELIABLE_WRITE_COMPLETED"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->j:LH6/a;

    new-instance v0, LH6/a;

    const-string/jumbo v1, "READ_RSSI"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->k:LH6/a;

    new-instance v0, LH6/a;

    const-string/jumbo v1, "ON_MTU_CHANGED"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->l:LH6/a;

    new-instance v0, LH6/a;

    const-string/jumbo v1, "PHY_READ"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->m:LH6/a;

    new-instance v0, LH6/a;

    const-string/jumbo v1, "PHY_UPDATE"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->n:LH6/a;

    new-instance v0, LH6/a;

    const-string v1, "CONNECTION_PRIORITY_CHANGE"

    invoke-direct {v0, v1}, LH6/a;-><init>(Ljava/lang/String;)V

    sput-object v0, LH6/a;->o:LH6/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH6/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGattOperation{description=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH6/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
