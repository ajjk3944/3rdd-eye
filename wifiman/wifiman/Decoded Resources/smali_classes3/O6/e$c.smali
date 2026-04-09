.class LO6/e$c;
.super LCg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO6/e;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LO6/e;


# direct methods
.method constructor <init>(LO6/e;)V
    .locals 0

    iput-object p1, p0, LO6/e$c;->b:LO6/e;

    invoke-direct {p0}, LCg/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public d(Lcom/polidea/rxandroidble3/exceptions/BleException;)V
    .locals 1

    iget-object v0, p0, LO6/e$c;->b:LO6/e;

    invoke-virtual {v0, p1}, LO6/e;->e(Lcom/polidea/rxandroidble3/exceptions/BleException;)V

    return-void
.end method

.method public bridge synthetic h(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/polidea/rxandroidble3/exceptions/BleException;

    invoke-virtual {p0, p1}, LO6/e$c;->d(Lcom/polidea/rxandroidble3/exceptions/BleException;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
