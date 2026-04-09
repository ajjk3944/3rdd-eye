.class final LV8/k$z$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k$z;->a(Lhg/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/k;


# direct methods
.method constructor <init>(LV8/k;)V
    .locals 0

    iput-object p1, p0, LV8/k$z$a;->a:LV8/k;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LV8/k$z$a;->a:LV8/k;

    invoke-static {v0}, LV8/k;->p(LV8/k;)LV8/e$b;

    move-result-object v0

    invoke-virtual {v0}, LV8/e$b;->d()LV8/e$b$b;

    move-result-object v0

    check-cast v0, LV8/e$b$b$a;

    invoke-virtual {v0}, LV8/e$b$b$a;->a()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "MTU - Requesting "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "..."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV8/k$z$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
