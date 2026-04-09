.class final LIi/P0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:LIi/J;

.field private final b:LIi/n;


# direct methods
.method public constructor <init>(LIi/J;LIi/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIi/P0;->a:LIi/J;

    iput-object p2, p0, LIi/P0;->b:LIi/n;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LIi/P0;->b:LIi/n;

    iget-object v1, p0, LIi/P0;->a:LIi/J;

    sget-object v2, LYg/J;->a:LYg/J;

    invoke-interface {v0, v1, v2}, LIi/n;->J(LIi/J;Ljava/lang/Object;)V

    return-void
.end method
