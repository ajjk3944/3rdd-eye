.class final Lz7/g$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/g;-><init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz7/g;


# direct methods
.method constructor <init>(Lz7/g;)V
    .locals 0

    iput-object p1, p0, Lz7/g$f;->a:Lz7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/net/DatagramPacket;)Lgg/r;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lz7/g$f;->a:Lz7/g;

    invoke-static {v0}, Lz7/g;->e(Lz7/g;)LA7/d;

    move-result-object v0

    invoke-interface {v0, p1}, LA7/d;->b(Ljava/net/DatagramPacket;)Ls7/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lgg/n;->o(Ljava/lang/Object;)Lgg/n;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object v0, Lz7/g$f$a;->a:Lz7/g$f$a;

    invoke-static {v0, p1}, Lx7/a;->b(Lmh/a;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/net/DatagramPacket;

    invoke-virtual {p0, p1}, Lz7/g$f;->a(Ljava/net/DatagramPacket;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
