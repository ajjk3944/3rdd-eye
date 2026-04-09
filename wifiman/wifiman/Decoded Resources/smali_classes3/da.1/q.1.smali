.class public final synthetic Lda/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LL0/d;

.field public final synthetic b:Lmh/l;


# direct methods
.method public synthetic constructor <init>(LL0/d;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/q;->a:LL0/d;

    iput-object p2, p0, Lda/q;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lda/q;->a:LL0/d;

    iget-object v1, p0, Lda/q;->b:Lmh/l;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lda/s;->d(LL0/d;Lmh/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
