.class final Lz7/g$e;
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

    iput-object p1, p0, Lz7/g$e;->a:Lz7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz7/z;)LDj/a;
    .locals 2

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lz7/z;->a()Ljava/net/DatagramSocket;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lz7/q;->a:Lz7/q$a;

    invoke-virtual {p1}, Lz7/z;->a()Ljava/net/DatagramSocket;

    move-result-object p1

    iget-object v1, p0, Lz7/g$e;->a:Lz7/g;

    invoke-static {v1}, Lz7/g;->g(Lz7/g;)Lp7/b;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lz7/q$a;->a(Ljava/net/DatagramSocket;Lp7/b;)Lz7/q;

    move-result-object p1

    invoke-interface {p1}, Lz7/q;->a()Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "{\n                    Fl\u2026empty()\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz7/z;

    invoke-virtual {p0, p1}, Lz7/g$e;->a(Lz7/z;)LDj/a;

    move-result-object p1

    return-object p1
.end method
