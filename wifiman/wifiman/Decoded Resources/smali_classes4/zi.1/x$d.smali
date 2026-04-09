.class public final Lzi/x$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzi/x;->T(Lzi/j;Ljava/util/Comparator;)Lzi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lzi/j;

.field final synthetic b:Ljava/util/Comparator;


# direct methods
.method constructor <init>(Lzi/j;Ljava/util/Comparator;)V
    .locals 0

    iput-object p1, p0, Lzi/x$d;->a:Lzi/j;

    iput-object p2, p0, Lzi/x$d;->b:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lzi/x$d;->a:Lzi/j;

    invoke-static {v0}, Lzi/m;->a0(Lzi/j;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lzi/x$d;->b:Ljava/util/Comparator;

    invoke-static {v0, v1}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
