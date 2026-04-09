.class public final LZi/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZi/t;->a(Lth/d;)LVi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LZi/t;

.field final synthetic b:Lth/d;


# direct methods
.method public constructor <init>(LZi/t;Lth/d;)V
    .locals 0

    iput-object p1, p0, LZi/t$a;->a:LZi/t;

    iput-object p2, p0, LZi/t$a;->b:Lth/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    new-instance v0, LZi/m;

    iget-object v1, p0, LZi/t$a;->a:LZi/t;

    invoke-virtual {v1}, LZi/t;->b()Lmh/l;

    move-result-object v1

    iget-object v2, p0, LZi/t$a;->b:Lth/d;

    invoke-interface {v1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVi/b;

    invoke-direct {v0, v1}, LZi/m;-><init>(LVi/b;)V

    return-object v0
.end method
