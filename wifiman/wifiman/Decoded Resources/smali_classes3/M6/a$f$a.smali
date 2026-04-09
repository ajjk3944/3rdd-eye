.class LM6/a$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/a$f;->c()Lkg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/a$f;


# direct methods
.method constructor <init>(LM6/a$f;)V
    .locals 0

    iput-object p1, p0, LM6/a$f$a;->a:LM6/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Lgg/s;
    .locals 2

    instance-of v0, p1, Lcom/polidea/rxandroidble3/exceptions/BleGattCharacteristicException;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/polidea/rxandroidble3/exceptions/BleGattCannotStartException;

    if-nez v0, :cond_0

    invoke-static {p1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LM6/a$f$a;->a:LM6/a$f;

    iget-object v0, v0, LM6/a$f;->b:LM6/a$g;

    invoke-interface {v0}, LM6/a$g;->get()I

    move-result v0

    new-instance v1, LG6/N$d$a;

    check-cast p1, Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    invoke-direct {v1, v0, p1}, LG6/N$d$a;-><init>(ILcom/polidea/rxandroidble3/exceptions/BleGattException;)V

    invoke-static {v1}, Lgg/s;->h0(Ljava/lang/Object;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LM6/a$f$a;->a(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
