.class public final LL0/C$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL0/C;->a(Lmh/p;Lmh/l;)LL0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Lmh/p;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LL0/C$u;->a:Lmh/p;

    iput-object p2, p0, LL0/C$u;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LL0/C$u;->b:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lc0/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LL0/C$u;->a:Lmh/p;

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
