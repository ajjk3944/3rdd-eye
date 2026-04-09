.class public final Lrg/p;
.super Lgg/n;
.source "SourceFile"

# interfaces
.implements LDg/e;


# instance fields
.field final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/p;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrg/p;->a:Ljava/lang/Object;

    return-object v0
.end method

.method protected v(Lgg/p;)V
    .locals 1

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/p;->c(Lhg/c;)V

    iget-object v0, p0, Lrg/p;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lgg/p;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
