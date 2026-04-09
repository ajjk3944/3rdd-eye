.class LM6/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/a;->b(Lgg/t;LO6/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LP6/F;

.field final synthetic b:LM6/a;


# direct methods
.method constructor <init>(LM6/a;LP6/F;)V
    .locals 0

    iput-object p1, p0, LM6/a$b;->b:LM6/a;

    iput-object p2, p0, LM6/a$b;->a:LP6/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LM6/a$b;->a:LP6/F;

    iget-object v1, p0, LM6/a$b;->b:LM6/a;

    iget-object v1, v1, LM6/a;->i:[B

    invoke-virtual {v0, v1}, LP6/F;->h(Ljava/lang/Object;)V

    iget-object v0, p0, LM6/a$b;->a:LP6/F;

    invoke-virtual {v0}, LP6/F;->a()V

    return-void
.end method

.method public b(LP6/e;)V
    .locals 0

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic h(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LP6/e;

    invoke-virtual {p0, p1}, LM6/a$b;->b(LP6/e;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LM6/a$b;->a:LP6/F;

    invoke-virtual {v0, p1}, LP6/F;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
