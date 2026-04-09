.class public final synthetic Lz7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgg/y$c;

.field public final synthetic b:Lz7/u;

.field public final synthetic c:Lgg/j;


# direct methods
.method public synthetic constructor <init>(Lgg/y$c;Lz7/u;Lgg/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/t;->a:Lgg/y$c;

    iput-object p2, p0, Lz7/t;->b:Lz7/u;

    iput-object p3, p0, Lz7/t;->c:Lgg/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz7/t;->a:Lgg/y$c;

    iget-object v1, p0, Lz7/t;->b:Lz7/u;

    iget-object v2, p0, Lz7/t;->c:Lgg/j;

    invoke-static {v0, v1, v2}, Lz7/u$a;->c(Lgg/y$c;Lz7/u;Lgg/j;)V

    return-void
.end method
