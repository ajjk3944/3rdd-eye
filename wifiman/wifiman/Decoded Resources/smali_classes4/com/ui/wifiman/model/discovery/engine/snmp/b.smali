.class public final Lcom/ui/wifiman/model/discovery/engine/snmp/b;
.super Lcom/ui/wifiman/model/discovery/engine/snmp/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/discovery/engine/snmp/b$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/ui/wifiman/model/discovery/engine/snmp/b$a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;

.field private final b:Lgg/i;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->d:Lcom/ui/wifiman/model/discovery/engine/snmp/b$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;)V
    .locals 2

    const-string v0, "networkConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "snmp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/ui/wifiman/model/discovery/engine/snmp/a;-><init>()V

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$h;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->b:Lgg/i;

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/discovery/engine/snmp/b$d;-><init>(Lcom/ui/wifiman/model/discovery/engine/snmp/b;)V

    invoke-virtual {p1, v1}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v1, "switchMap(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/b$e;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$e;

    invoke-virtual {p1, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/b$f;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$f;

    invoke-virtual {p1, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$g;

    invoke-virtual {p1, v1}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v1, LOc/a;

    invoke-direct {v1}, LOc/a;-><init>()V

    invoke-virtual {p1, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->c:Lgg/i;

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->f()V

    return-void
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/discovery/engine/snmp/b;)Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/Snmp;

    return-object p0
.end method

.method private final e(Lgg/i;)Lgg/i;
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$b;

    invoke-virtual {p1, v0, v1}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/discovery/engine/snmp/b$c;->a:Lcom/ui/wifiman/model/discovery/engine/snmp/b$c;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final f()V
    .locals 2

    const-string v0, "SNMP discovery finished"

    const-string v1, "SnmpDiscEngine"

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/b;->c:Lgg/i;

    return-object v0
.end method
