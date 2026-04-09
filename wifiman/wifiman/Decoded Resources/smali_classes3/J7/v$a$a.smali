.class final LJ7/v$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/v$a;->h(Ljava/lang/String;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ7/v;

.field final synthetic b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(LJ7/v;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LJ7/v$a$a;->a:LJ7/v;

    iput-object p2, p0, LJ7/v$a$a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    iput-object p3, p0, LJ7/v$a$a;->c:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, LJ7/v$a$a;->h(Lmh/l;Ljava/lang/Object;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lmh/l;Ljava/lang/Object;)Lgg/D;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg/D;

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lgg/D;
    .locals 4

    iget-object v0, p0, LJ7/v$a$a;->a:LJ7/v;

    invoke-virtual {v0}, LJ7/v;->a()Lgg/z;

    move-result-object v0

    new-instance v1, LJ7/v$a$a$a;

    iget-object v2, p0, LJ7/v$a$a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    iget-object v3, p0, LJ7/v$a$a;->c:Ljava/lang/String;

    invoke-direct {v1, v2, p1, v3}, LJ7/v$a$a$a;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LJ7/u;

    invoke-direct {p1, v1}, LJ7/u;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LJ7/v$a$a;->c(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
