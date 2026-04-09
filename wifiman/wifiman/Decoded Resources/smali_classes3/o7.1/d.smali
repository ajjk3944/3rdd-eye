.class public final synthetic Lo7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lo7/e;

.field public final synthetic b:Lo7/e$b;


# direct methods
.method public synthetic constructor <init>(Lo7/e;Lo7/e$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo7/d;->a:Lo7/e;

    iput-object p2, p0, Lo7/d;->b:Lo7/e$b;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Lo7/d;->a:Lo7/e;

    iget-object v1, p0, Lo7/d;->b:Lo7/e$b;

    invoke-static {v0, v1}, Lo7/e;->e(Lo7/e;Lo7/e$b;)V

    return-void
.end method
