.class public final synthetic Lc/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/j;

.field public final synthetic b:Lc/G;


# direct methods
.method public synthetic constructor <init>(Lc/j;Lc/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/o;->a:Lc/j;

    iput-object p2, p0, Lc/o;->b:Lc/G;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/o;->a:Lc/j;

    iget-object v1, p0, Lc/o;->b:Lc/G;

    invoke-static {v0, v1}, Lc/j$j;->a(Lc/j;Lc/G;)V

    return-void
.end method
