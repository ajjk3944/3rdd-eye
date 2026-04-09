.class final Lx8/j$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;->s0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lx8/j$i;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/usurvey/ui/signal/strength/a;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx8/j$i;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/ubnt/usurvey/ui/signal/strength/a;->a(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/ui/signal/strength/a;

    invoke-virtual {p0, p1}, Lx8/j$i;->a(Lcom/ubnt/usurvey/ui/signal/strength/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
