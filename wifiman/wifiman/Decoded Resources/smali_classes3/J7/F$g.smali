.class final LJ7/F$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/F;->b(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ7/F;


# direct methods
.method constructor <init>(LJ7/F;)V
    .locals 0

    iput-object p1, p0, LJ7/F$g;->a:LJ7/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 2

    iget-object v0, p0, LJ7/F$g;->a:LJ7/F;

    invoke-virtual {v0}, LJ7/n;->j()LK7/a;

    move-result-object v0

    const-string/jumbo v1, "tokenString"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LK7/a;->b(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LJ7/F$g;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
