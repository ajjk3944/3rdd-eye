.class public final synthetic Lda/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lda/I;


# direct methods
.method public synthetic constructor <init>(Lda/I;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/N;->a:Lda/I;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lda/N;->a:Lda/I;

    invoke-static {v0}, Lda/I$j;->a(Lda/I;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
