.class LM6/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/p;->b(Lgg/t;LO6/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:LM6/p;


# direct methods
.method constructor <init>(LM6/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LM6/p$a;->b:LM6/p;

    iput-object p2, p0, LM6/p$a;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v1, "Scan operation is requested to stop."

    invoke-static {v1, v0}, LI6/q;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LM6/p$a;->b:LM6/p;

    iget-object v1, v0, LM6/p;->a:LP6/G;

    iget-object v2, p0, LM6/p$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LM6/p;->h(LP6/G;Ljava/lang/Object;)V

    return-void
.end method
