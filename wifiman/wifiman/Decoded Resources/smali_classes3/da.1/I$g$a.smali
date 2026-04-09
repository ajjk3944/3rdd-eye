.class public final Lda/I$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I$g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:[LLi/g;


# direct methods
.method public constructor <init>([LLi/g;)V
    .locals 0

    iput-object p1, p0, Lda/I$g$a;->a:[LLi/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lda/I$g$a;->a:[LLi/g;

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lda/I$g$a;->a()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
