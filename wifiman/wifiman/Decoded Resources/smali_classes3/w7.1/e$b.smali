.class public final Lw7/e$b;
.super Lw7/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lw7/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw7/e$b;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Lu7/a;
    .locals 12

    iget-object v0, p0, Lw7/e$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lz7/g;

    iget-object v3, p0, Lw7/e$b;->a:Ljava/util/List;

    new-instance v4, LC7/b;

    invoke-direct {v4}, LC7/b;-><init>()V

    new-instance v6, Lz7/k;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v6, v2, v2, v1, v2}, Lz7/k;-><init>(Lmh/l;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v7, Lw7/e$b$a;->a:Lw7/e$b$a;

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const-string/jumbo v2, "UiIpv6"

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lz7/g;-><init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "You need to add at least one packet (use add(Packet)!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lw7/c;)Lw7/e$b;
    .locals 1

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw7/e$b;->a:Ljava/util/List;

    invoke-virtual {p1}, Lw7/c;->getFactory$library_server_lan_release()Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
