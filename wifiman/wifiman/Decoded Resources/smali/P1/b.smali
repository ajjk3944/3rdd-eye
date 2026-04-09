.class public final LP1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/a;


# instance fields
.field private final a:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 1

    const-string v0, "produceNewData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP1/b;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public a(Landroidx/datastore/core/CorruptionException;Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LP1/b;->a:Lmh/l;

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
