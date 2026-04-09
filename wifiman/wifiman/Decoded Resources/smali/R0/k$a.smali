.class final LR0/k$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR0/k;->c(Ljava/util/List;LR0/i;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LR0/i;

.field final synthetic b:LR0/k;


# direct methods
.method constructor <init>(LR0/i;LR0/k;)V
    .locals 0

    iput-object p1, p0, LR0/k$a;->a:LR0/i;

    iput-object p2, p0, LR0/k$a;->b:LR0/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/i;)Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, LR0/k$a;->a:LR0/i;

    if-ne v0, p1, :cond_0

    const-string v0, " > "

    goto :goto_0

    :cond_0
    const-string v0, "   "

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LR0/k$a;->b:LR0/k;

    invoke-static {v0, p1}, LR0/k;->a(LR0/k;LR0/i;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/i;

    invoke-virtual {p0, p1}, LR0/k$a;->a(LR0/i;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
