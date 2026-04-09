.class public final synthetic LBc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:LBc/f$f;

.field public final synthetic b:LBc/f$k;


# direct methods
.method public synthetic constructor <init>(LBc/f$f;LBc/f$k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBc/e;->a:LBc/f$f;

    iput-object p2, p0, LBc/e;->b:LBc/f$k;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, LBc/e;->a:LBc/f$f;

    iget-object v1, p0, LBc/e;->b:LBc/f$k;

    invoke-static {v0, v1}, LBc/f;->f(LBc/f$f;LBc/f$k;)V

    return-void
.end method
