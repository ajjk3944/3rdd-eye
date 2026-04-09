.class final Lda/I$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I;->T0(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/I;


# direct methods
.method constructor <init>(Lda/I;)V
    .locals 0

    iput-object p1, p0, Lda/I$d;->a:Lda/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/f;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lda/I$d;->a:Lda/I;

    invoke-static {p1}, Lda/I;->M0(Lda/I;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/f;

    invoke-virtual {p0, p1}, Lda/I$d;->a(LEb/f;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
