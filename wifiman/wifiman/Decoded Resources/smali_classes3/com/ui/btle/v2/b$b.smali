.class final Lcom/ui/btle/v2/b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/btle/v2/b;


# direct methods
.method constructor <init>(Lcom/ui/btle/v2/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/b$b;->a:Lcom/ui/btle/v2/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/btle/v2/b$b;->a:Lcom/ui/btle/v2/b;

    invoke-virtual {v0}, Lcom/ui/btle/v2/b;->e()Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/btle/v2/b$b;->a:Lcom/ui/btle/v2/b;

    invoke-virtual {v1}, Lcom/ui/btle/v2/b;->d()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "state\n            .merge\u2026)\n            .refCount()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/btle/v2/b$b;->a()Lgg/i;

    move-result-object v0

    return-object v0
.end method
