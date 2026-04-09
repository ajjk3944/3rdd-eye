.class public final Lda/I$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I;->j1()V
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

    iput-object p1, p0, Lda/I$g;->a:[LLi/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LLi/h;Ldh/e;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lda/I$g;->a:[LLi/g;

    new-instance v1, Lda/I$g$a;

    invoke-direct {v1, v0}, Lda/I$g$a;-><init>([LLi/g;)V

    new-instance v2, Lda/I$g$b;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lda/I$g$b;-><init>(Ldh/e;)V

    invoke-static {p1, v0, v1, v2, p2}, LMi/j;->a(LLi/h;[LLi/g;Lmh/a;Lmh/q;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
