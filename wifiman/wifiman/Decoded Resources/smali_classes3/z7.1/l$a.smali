.class final Lz7/l$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lz7/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/l$a;

    invoke-direct {v0}, Lz7/l$a;-><init>()V

    sput-object v0, Lz7/l$a;->a:Lz7/l$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    const-string/jumbo v1, "getNetworkInterfaces()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LZg/v;->z(Ljava/util/Enumeration;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->g(Ljava/util/Iterator;)Lzi/j;

    move-result-object v0

    sget-object v1, Lz7/l$a$a;->a:Lz7/l$a$a;

    invoke-static {v0, v1}, Lzi/m;->N(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v0

    invoke-static {v0}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz7/l$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
