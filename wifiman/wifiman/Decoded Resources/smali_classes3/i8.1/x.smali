.class public final synthetic Li8/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Li8/y;


# direct methods
.method public synthetic constructor <init>(Li8/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/x;->a:Li8/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Li8/x;->a:Li8/y;

    invoke-static {v0}, Li8/y$a;->a(Li8/y;)V

    return-void
.end method
