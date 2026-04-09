.class public final LYc/a;
.super LYc/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYc/a$a;,
        LYc/a$b;
    }
.end annotation


# static fields
.field public static final f:LYc/a$b;


# instance fields
.field private final d:Lgg/b;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYc/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYc/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYc/a;->f:LYc/a$b;

    return-void
.end method

.method public constructor <init>(Landroid/net/ConnectivityManager;)V
    .locals 2

    const-string v0, "connectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    const-string v1, "Cellular"

    invoke-direct {p0, v1, v0, p1}, LYc/g;-><init>(Ljava/lang/String;Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager;)V

    invoke-super {p0}, LYc/g;->e()Lgg/i;

    move-result-object p1

    sget-object v0, LYc/a$d;->a:LYc/a$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v0, LYc/a$e;->a:LYc/a$e;

    invoke-virtual {p1, v0}, Lgg/i;->M1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, LYc/a$f;->a:LYc/a$f;

    invoke-virtual {p1, v0}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYc/a;->d:Lgg/b;

    invoke-super {p0}, LYc/g;->e()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    sget-object v0, LYc/a$c;->a:LYc/a$c;

    invoke-virtual {p1, v0}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYc/a;->e:Lgg/i;

    return-void
.end method


# virtual methods
.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, LYc/a;->e:Lgg/i;

    return-object v0
.end method
