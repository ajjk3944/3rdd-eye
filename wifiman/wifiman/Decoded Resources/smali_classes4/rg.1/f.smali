.class public final Lrg/f;
.super Lgg/n;
.source "SourceFile"


# instance fields
.field final a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/f;->a:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 1

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/p;->c(Lhg/c;)V

    iget-object v0, p0, Lrg/f;->a:Ljava/lang/Throwable;

    invoke-interface {p1, v0}, Lgg/p;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
