.class LP6/u$a;
.super LCg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/u;->c(Lgg/A;)LCg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lgg/A;


# direct methods
.method constructor <init>(Lgg/A;)V
    .locals 0

    iput-object p1, p0, LP6/u$a;->b:Lgg/A;

    invoke-direct {p0}, LCg/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LP6/u$a;->b:Lgg/A;

    invoke-interface {v0, p1}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LP6/u$a;->b:Lgg/A;

    invoke-interface {v0, p1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
