.class public final LVi/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZg/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVi/k;-><init>(Ljava/lang/String;Lth/d;[Lth/d;[LVi/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    iput-object p1, p0, LVi/k$a;->a:Ljava/lang/Iterable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LVi/b;

    invoke-interface {p1}, LVi/b;->a()LXi/f;

    move-result-object p1

    invoke-interface {p1}, LXi/f;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LVi/k$a;->a:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
