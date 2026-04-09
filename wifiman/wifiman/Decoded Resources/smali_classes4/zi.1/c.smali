.class public final Lzi/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# instance fields
.field private final a:Lzi/j;

.field private final b:Lmh/l;


# direct methods
.method public constructor <init>(Lzi/j;Lmh/l;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keySelector"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi/c;->a:Lzi/j;

    iput-object p2, p0, Lzi/c;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lzi/b;

    iget-object v1, p0, Lzi/c;->a:Lzi/j;

    invoke-interface {v1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iget-object v2, p0, Lzi/c;->b:Lmh/l;

    invoke-direct {v0, v1, v2}, Lzi/b;-><init>(Ljava/util/Iterator;Lmh/l;)V

    return-object v0
.end method
