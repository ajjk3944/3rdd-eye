.class final Lz7/g$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


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

    iput-object p1, p0, Lz7/g$j;->a:Lz7/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lgg/i;
    .locals 4

    sget-object v0, Lz7/a;->a:Lz7/a$a;

    iget-object v1, p0, Lz7/g$j;->a:Lz7/g;

    invoke-virtual {v1}, Lz7/g;->o()Lz7/x;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz7/a$a;->a(Lz7/x;)Lz7/a;

    move-result-object v0

    iget-object v1, p0, Lz7/g$j;->a:Lz7/g;

    invoke-virtual {v1}, Lz7/g;->p()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lz7/a;->a(Ljava/lang/Integer;)Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->O(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string v1, "AndroidNetworkManager.ne\u2026)\n            .refCount()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz7/g$j;->a()Lgg/i;

    move-result-object v0

    return-object v0
.end method
