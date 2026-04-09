.class public final LB/G$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/G$c;->a(LT/L;)LT/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/G;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LB/G;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LB/G$c$a;->a:LB/G;

    iput-object p2, p0, LB/G$c$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LB/G$c$a;->a:LB/G;

    invoke-static {v0}, LB/G;->g(LB/G;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v1, p0, LB/G$c$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method
