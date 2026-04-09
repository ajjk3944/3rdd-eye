.class public final synthetic Lda/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Lda/u;


# direct methods
.method public synthetic constructor <init>(LIi/N;Lda/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/m;->a:LIi/N;

    iput-object p2, p0, Lda/m;->b:Lda/u;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lda/m;->a:LIi/N;

    iget-object v1, p0, Lda/m;->b:Lda/u;

    invoke-static {v0, v1}, Lda/s;->b(LIi/N;Lda/u;)LYg/J;

    move-result-object v0

    return-object v0
.end method
