.class public final synthetic LYc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:LYc/g;

.field public final synthetic b:LYc/g$b;


# direct methods
.method public synthetic constructor <init>(LYc/g;LYc/g$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYc/f;->a:LYc/g;

    iput-object p2, p0, LYc/f;->b:LYc/g$b;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, LYc/f;->a:LYc/g;

    iget-object v1, p0, LYc/f;->b:LYc/g$b;

    invoke-static {v0, v1}, LYc/g;->c(LYc/g;LYc/g$b;)V

    return-void
.end method
