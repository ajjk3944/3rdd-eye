.class final Ls8/f$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/f;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls8/f;


# direct methods
.method constructor <init>(Ls8/f;)V
    .locals 0

    iput-object p1, p0, Ls8/f$f;->a:Ls8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhd/a;)Lgg/r;
    .locals 3

    const-string/jumbo v0, "roaming"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls8/f$f;->a:Ls8/f;

    invoke-static {v0}, Ls8/f;->d(Ls8/f;)LCc/n;

    move-result-object v0

    invoke-interface {v0}, LCc/n;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Ls8/f$f$a;

    iget-object v2, p0, Ls8/f$f;->a:Ls8/f;

    invoke-direct {v1, p1, v2}, Ls8/f$f$a;-><init>(Lhd/a;Ls8/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhd/a;

    invoke-virtual {p0, p1}, Ls8/f$f;->a(Lhd/a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
