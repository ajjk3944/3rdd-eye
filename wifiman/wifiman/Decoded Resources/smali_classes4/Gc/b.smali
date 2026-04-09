.class public final LGc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGc/b$a;,
        LGc/b$b;
    }
.end annotation


# static fields
.field public static final c:LGc/b$b;


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LGc/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LGc/b$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LGc/b;->c:LGc/b$b;

    return-void
.end method

.method public constructor <init>(Led/a;Lcom/ui/wifiman/model/vendor/d$b;)V
    .locals 1

    const-string v0, "networkNeighbours"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vendorManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LAg/e;->a:LAg/e;

    invoke-interface {p1}, Led/a;->b()Lgg/z;

    move-result-object p1

    invoke-interface {p2}, Lcom/ui/wifiman/model/vendor/d$b;->a()Lgg/z;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LAg/e;->a(Lgg/D;Lgg/D;)Lgg/z;

    move-result-object p1

    sget-object p2, LGc/b$c;->a:LGc/b$c;

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, LGc/b$d;->a:LGc/b$d;

    invoke-virtual {p1, p2}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "repeatWhen(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LGc/b;->a:Lgg/i;

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p2, v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Arp Discovery doesn\'t work on Android 13+"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :cond_0
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sget-object v0, LGc/b$e;->a:LGc/b$e;

    invoke-virtual {p1, p2, v0}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p1

    sget-object p2, LGc/b$f;->a:LGc/b$f;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LGc/b;->b:Lgg/i;

    return-void
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LGc/b;->b:Lgg/i;

    return-object v0
.end method
