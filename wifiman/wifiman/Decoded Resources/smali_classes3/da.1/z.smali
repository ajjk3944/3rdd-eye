.class public final synthetic Lda/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lda/I;


# direct methods
.method public synthetic constructor <init>(Lda/I;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/z;->a:Lda/I;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lda/z;->a:Lda/I;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lda/I;->F0(Lda/I;Ljava/lang/Throwable;)LYg/J;

    move-result-object p1

    return-object p1
.end method
