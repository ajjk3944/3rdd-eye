.class public final Lc0/f$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc0/f$e;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc0/f$d;

.field final synthetic b:Lc0/f;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc0/f$d;Lc0/f;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lc0/f$e$a;->a:Lc0/f$d;

    iput-object p2, p0, Lc0/f$e$a;->b:Lc0/f;

    iput-object p3, p0, Lc0/f$e$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lc0/f$e$a;->a:Lc0/f$d;

    iget-object v1, p0, Lc0/f$e$a;->b:Lc0/f;

    invoke-static {v1}, Lc0/f;->b(Lc0/f;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc0/f$d;->b(Ljava/util/Map;)V

    iget-object v0, p0, Lc0/f$e$a;->b:Lc0/f;

    invoke-static {v0}, Lc0/f;->a(Lc0/f;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lc0/f$e$a;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
