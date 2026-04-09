.class public final synthetic LBc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# instance fields
.field public final synthetic a:LBc/f$f;

.field public final synthetic b:LBc/f;


# direct methods
.method public synthetic constructor <init>(LBc/f$f;LBc/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBc/d;->a:LBc/f$f;

    iput-object p2, p0, LBc/d;->b:LBc/f;

    return-void
.end method


# virtual methods
.method public final a(Lgg/t;)V
    .locals 2

    iget-object v0, p0, LBc/d;->a:LBc/f$f;

    iget-object v1, p0, LBc/d;->b:LBc/f;

    invoke-static {v0, v1, p1}, LBc/f;->g(LBc/f$f;LBc/f;Lgg/t;)V

    return-void
.end method
