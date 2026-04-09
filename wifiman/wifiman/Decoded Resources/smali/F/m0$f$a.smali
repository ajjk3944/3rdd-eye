.class public final LF/m0$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0$f;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/m0;

.field final synthetic b:Lmh/l;


# direct methods
.method public constructor <init>(LF/m0;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LF/m0$f$a;->a:LF/m0;

    iput-object p2, p0, LF/m0$f$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LF/m0$f$a;->a:LF/m0;

    invoke-static {v0}, LF/m0;->e(LF/m0;)Landroidx/compose/runtime/snapshots/k;

    move-result-object v0

    iget-object v1, p0, LF/m0$f$a;->b:Lmh/l;

    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method
